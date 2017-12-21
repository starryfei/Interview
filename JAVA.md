### 一个非常有意思的题
```
public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {
        Class<?> cache = Integer.class.getDeclaredClasses()[0]; //1
        Field myCache = cache.getDeclaredField("cache"); //2
        myCache.setAccessible(true);//3
        Integer[] newCache = (Integer[]) myCache.get(cache); //4
        newCache[132] = newCache[133]; //5
        int a = 2;
        int b = a + a;
        System.out.printf("%d + %d = %d", a, a, b); //
      }
```
 上面的这段程序的输出是什么呢？
 
 **Integer 源码**：
 ```java
   private static class IntegerCache {
            static final int high;
            static final Integer cache[];
            //默认为值在-128到127之间，它就会返回该缓存的实例
            static {
                final int low = -128;//最小值不会变，
    
                // high value may be configured by property，可以自己设置最大值
                int h = 127;
                if (integerCacheHighPropValue != null) {//integerCacheHighPropValue如何设置的最大值不为空，实现拆箱
                    // Use Long.decode here to avoid invoking methods that
                    // require Integer's autoboxing cache to be initialized
                    int i = Long.decode(integerCacheHighPropValue).intValue();//拆箱
                    i = Math.max(i, 127);//获取设置和127中最大值
                    // Maximum array size is Integer.MAX_VALUE
                    h = Math.min(i, Integer.MAX_VALUE - -low);//防止溢出
                }
                high = h;
                  //进行缓存
                cache = new Integer[(high - low) + 1];
                int j = low;
                for(int k = 0; k < cache.length; k++)
                    cache[k] = new Integer(j++);
            }
    
            private IntegerCache() {}
        }```
```
        
        public static Integer valueOf(int i) {//判断是否在中int范围内，如果在就返回实例，否则就创建一个新的Integer对象
        if(i >= -128 && i <= IntegerCache.high)
            return IntegerCache.cache[i + 128];
        else
            return new Integer(i);
    }
```
```
 *分析：*
                
1. 通过***反射***来获取Integer class
2. 获取Field 对象
3. 调用私有域属性
4. 获取Integer 的静态内部类IntegerCache的cache属性：-->static final Integer cache[];
5. 重点来了...，
   ** Java中Integer对-127到128的整形数据是有缓存的，这里通过反射缓存中的第133（二进制10000101首位代表符号位）号数据（既整数5）赋值给了第132号数据（既整数4），所以4就会变成5来表示。在使用int数据计算时结果是正常的，但是在打印时由于做了装箱（Integer.valueOf()），int数据变成了Integer，这时会采用缓存，所以4就会打印出5来。**
    
6. 装箱：自动将基本数据类型转换为包装器类型。 例如：Integer i = 10;//装箱 --->底层实现 Integer i = Integer.valueof(10)
7. 拆箱：自动将包装器类型转换为基本数据类型。 例如：int n = i; //拆箱 --->底层实现 Integer.intValue()

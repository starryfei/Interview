#### java8 学习资源

------------
在Java 8中，接口可以包含带有实现代码的方法，这些方法称为default方法
###### java.util.function
1. *Function* : http://ifeve.com/jjava-util-function-java8/
	--- 接受一些输入参数并将对输入参数处理过后的结果返回的功能封装到一个方法内，Function接口是一个不错的选择。输入的参数类型和输出的结果类型可以一致或者不一致。
	*R apply(T t);*
2. Consumer http://ifeve.com/predicate-and-consumer-interface-in-java-util-function-package-in-java-8/
	--- 表示一个接受单个输入参数并且没有返回值的操作。不像其他函数式接口，Consumer接口期望执行带有副作用的操作（译者注：Consumer的操作可能会更改输入参数的内部状态）。
	void accept(T t);
3. Predicate 
	--- 判断输入的对象是否符合某个条件
	boolean test(T t);
4. Supplier
	--- 无参数，返回一个结果。可用于类的实例化
	T get();
 
###### 博客
1. Stream http://ifeve.com/stream/
map方法示意图![](https://github.com/starryfei/Interview/blob/master/T2PQJnXOJXXXXXXXXX_!!90219132.bmp)

```java
List<Integer> nums = Lists.newArrayList(1,1,null,2,3,4,null,5,6,7,8,9,10);
System.out.println(“sum is:”+nums.stream().filter(num -> num != null).
            distinct().mapToInt(num -> num * 2). peek(System.out::println)
			.skip(2).limit(4).sum());
```



 这段代码演示了上面介绍的所有转换方法（除了flatMap），简单解释一下这段代码的含义：给定一个Integer类型的List，获取其对应的Stream对象，然后进行过滤掉null，再去重，再每个元素乘以2，再每个元素被消费的时候打印自身，在跳过前两个元素，最后去前四个元素进行加和运算  
###### github
2. 学习代码：https://github.com/java8/Java8InAction

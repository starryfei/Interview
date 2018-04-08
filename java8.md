####java8 学习资源

------------


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

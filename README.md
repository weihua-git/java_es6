# **用java写es6语法**



# 使用方式Maven模式

## 克隆

```
git clone https://github.com/weihua-git/java_es6.git
```



## 执行打包命令

```
# 跳过测试打包
mvn clean package -Dmaven.test.skip=true
```

![image-20210724144547236](README.assets/image-20210724144547236.png)



## 打包完成在target目录下

![image-20210724144630240](README.assets/image-20210724144630240.png)







## 添加到本地的maven仓库

![image-20210724144902091](README.assets/image-20210724144902091.png)



mvn install:install-file -DgroupId=org.example  

 -DartifactId=java_es6  **图中groupId**

-Dversion=1.0-SNAPSHOT   **图中version**、

-Dfile=D:\javaProject\java_es6\target\java_es6-1.0-SNAPSHOT.jar   **jar包所在位置**

 -Dpackaging=jar

```java
mvn install:install-file -DgroupId=org.example   -DartifactId=java_es6 -Dversion=1.0-SNAPSHOT  -Dfile=D:\javaProject\java_es6\target\java_es6-1.0-SNAPSHOT.jar    -Dpackaging=jar
```



## 导入

和上面一致

```xml
<dependency>
    <groupId>org.example</groupId>
    <artifactId>java_es6</artifactId>
    <version>1.0-SNAPSHOT</version>
</dependency>
```

![image-20210724145208120](README.assets/image-20210724145208120.png)









# 简单模式就是复制文件









# 简单示例



## forEach

javascript

```javascript
let arr = new Array();
arr.push("a");
arr.push("b");
arr.push("c");
arr.push("d");
arr.forEach(r=>console.log(r));
```



![image-20210724150158001](README.assets/image-20210724150158001.png)



java

```java
Array arr = new Array();

arr.push("a");
arr.push("b");
arr.push("c");
arr.push("d");

array.each(r->console.log(r));
```



![image-20210724150257072](README.assets/image-20210724150257072.png)

## filter

java

```java
Array<Integer> arr = new Array();

arr.push(1);
arr.push(2);
arr.push(3);
arr.push(4);

Array<Integer> filter = arr.filter(r -> r > 2);
filter.print();
```

输出

```
内容：	3	
内容：	4	
===================华丽分割线=====================
```





## some

java

```java
Array<Integer> arr = new Array();

arr.push(1);
arr.push(2);
arr.push(3);
arr.push(4);

boolean some = arr.some(r -> r > 2);
```

输出

```
true
```


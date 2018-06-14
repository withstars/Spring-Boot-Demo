在Spring Boot的Maven插件中，还提供了构建完整可执行程序的功能，什么意思呢？就是说，我们可以不用java -jar，而是直接运行jar来执行程序。这样我们就可以方便的将其创建成系统服务在后台运行了。主要步骤如下：
* 在pom.xml中添加Spring Boot的插件，并注意设置executable配置
```aidl
<build> 
  <plugins> 
    <plugin> 
      <groupId>org.springframework.boot</groupId>  
      <artifactId>spring-boot-maven-plugin</artifactId>  
      <configuration> 
        <executable>true</executable> 
      </configuration> 
    </plugin> 
  </plugins> 
</build>
```

* 在完成上述配置后，使用mvn install进行打包，构建一个可执行的jar包
* 创建软连接到/etc/init.d/目录下
```aidl
sudo ln -s /var/yourapp/yourapp.jar /etc/init.d/yourapp
```
* 在完成软连接创建之后，我们就可以通过如下命令对yourapp.jar应用来控制启动、停止、重启操作了
```aidl
/etc/init.d/yourapp start|stop|restart

```
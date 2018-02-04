package com.withstars;

import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.tomcat.jdbc.pool.DataSource;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.PlatformTransactionManager;

/**
 * @SpringBootApplication注解等价于以默认属性使用
 * @Configuration，@EnableAutoConfiguration和@ComponentScan：
 */
@SpringBootApplication
/**
 * 在对Mybatis自动扫描配置中，使用注解配置时，我们只要在@MapperScan中配置我们需要扫描的Mapper位置，
 */
@MapperScan("com.withstars.dao")
public class Application {


    /**
     * SpringApplication类提供了一种快捷方式，用于从main()方法启动Spring应用。
     * 多数情况下，你只需要将该任务委托给SpringApplication.run静态方法
     */
    public static void main(String[] args) throws Exception{
        SpringApplication.run(Application.class,args);
    }

}

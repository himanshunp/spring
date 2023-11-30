# spring boot 3.2 upgrade issue while using as BOM

When you spring boot dependencies as BOM, you have to use `-parameters` while compiling code to
avoid `NoUniqueBeanDefinitionException`

```xml

<plugin>
    <groupId>org.apache.maven.plugins</groupId>
    <artifactId>maven-compiler-plugin</artifactId>
    <configuration>
        <parameters>true</parameters>
    </configuration>
</plugin>
```

Refer to [parameter-name-retention](https://github.com/spring-projects/spring-framework/wiki/Upgrading-to-Spring-Framework-6.x#parameter-name-retention) for more details

## How to reproduce?

run `mvn clean install` in zoo project that
has [ZooConfig.java](./zoo/src/main/java/com/himanshu/springboot/zoo/ZooConfig.java) that just works fine prior to 3.2.0
spring boot version. It wires the beans `Animal` and `Bird` without using `@Qualifier`


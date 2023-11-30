# spring boot 3.2 upgrade issue while using as BOM

When you spring boot dependencies as BOM, you have to use `-parameters` while compiling code to avoid `NoUniqueBeanDefinitionException`

```xml
<plugin>
    <groupId>org.apache.maven.plugins</groupId>
    <artifactId>maven-compiler-plugin</artifactId>
    <configuration>
        <parameters>true</parameters>
    </configuration>
</plugin>
```
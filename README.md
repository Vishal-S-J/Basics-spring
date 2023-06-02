# Basics-spring

## new Project

1. Create a new maven project with catalog as `Maven Central` and Archetype as `org.apache.maven.archetypes:maven-archetype-quickstart`

2. Add the dependencies for springcore and springcontext in pom.xml
```
<!-- https://mvnrepository.com/artifact/org.springframework/spring-core -->
<dependency>
    <groupId>org.springframework</groupId>
    <artifactId>spring-core</artifactId>
    <version>{version}</version>
</dependency>
<!-- https://mvnrepository.com/artifact/org.springframework/spring-context -->
<dependency>
     <groupId>org.springframework</groupId>
     <artifactId>spring-context</artifactId>
     <version>{version}</version>
</dependency>
```

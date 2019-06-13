# learnspringboot-jooq
Spring Boot Project using Kotlin and JOOQ.

## Enabling H2(In Memory DB) in your application


**application.yml**

```$xslt
spring:
  profiles:
    active: dev
  datasource:
    url: jdbc:h2:mem:testdb
    driver-class-name: org.h2.Driver
    data-username: sa
  jpa:
    database: h2
    database-platform: org.hibernate.dialect.H2Dialect
  h2:
    console:
      enabled: true
```

**build.gradle**

```$xslt
runtimeOnly("com.h2database:h2"
```

**H2-Console URL**

```$xslt
http://localhost:8080/h2-console
```

## Enable Flyway

- Add the below in the **build.gradle** file.

```$xslt
implementation("org.flywaydb:flyway-core:5.2.4")
```


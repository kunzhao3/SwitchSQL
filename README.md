                                   springmvc+mybatis 多数据源
1.写一个MultipleDataSource 类来继承AbstractRoutingDataSource，并重写determineCurrentLookupKey()方法，来达到动态切换数据库
<br/>2.创建spring-config.xml文件,配置扫描，properties文件的读取
<br/>3.创建jpa-context.xml文件，配置jdbc属性，创建sqlSessionFactory实例
<br/>4.TestSql.java可以测试Mybatis注解方式的查询，也可以用TestGome.java进行JUnit测试Mybatis xml方式的查询
<br/>5.注意MultipleDataSource.setDataSourceKey()中的值必须和jpa-context.xml配置的beans属性一致
<br/>6.TestGome.java报错，Java Build Path-->>Add Library  JUnit4库即可
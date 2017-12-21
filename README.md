                                   springmvc+mybatis 多数据源
1.写一个MultipleDataSource 类来继承AbstractRoutingDataSource，并重写determineCurrentLookupKey（）方法，来达到动态切换数据库
2.创建spring-config.xml文件,配置扫描，配置文件的读取
3.创建jpa-context.xml文件，配置jdbc属性，创建sqlSessionFactory实例
4.TestSql.java测试，也可以用TestGome.java进行JUnit单元测试
5.注意MultipleDataSource.setDataSourceKey()中的值必须和jpa-context.xml配置的beans属性一致
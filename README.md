                                   springmvc+mybatis ������Դ
1.дһ��MultipleDataSource �����̳�AbstractRoutingDataSource������дdetermineCurrentLookupKey()���������ﵽ��̬�л����ݿ�
<br/>2.����spring-config.xml�ļ�,����ɨ�裬properties�ļ��Ķ�ȡ
<br/>3.����jpa-context.xml�ļ�������jdbc���ԣ�����sqlSessionFactoryʵ��
<br/>4.TestSql.java���Բ���Mybatisע�ⷽʽ�Ĳ�ѯ��Ҳ������TestGome.java����JUnit����Mybatis xml��ʽ�Ĳ�ѯ
<br/>5.ע��MultipleDataSource.setDataSourceKey()�е�ֵ�����jpa-context.xml���õ�beans����һ��
<br/>6.TestGome.java����Java Build Path-->>Add Library  JUnit4�⼴��
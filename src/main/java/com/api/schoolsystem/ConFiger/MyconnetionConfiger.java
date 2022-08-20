package com.api.schoolsystem.ConFiger;
        import org.mybatis.spring.SqlSessionFactoryBean;
        import org.mybatis.spring.annotation.MapperScan;
        import org.springframework.beans.factory.annotation.Autowired;
        import org.springframework.context.annotation.Bean;
        import org.springframework.context.annotation.Configuration;
        import org.springframework.jdbc.datasource.DataSourceTransactionManager;
        import javax.sql.DataSource;
                                //          Configuration Class Connection Data Best
@Configuration
                                //          Link To Repository All Connection
@MapperScan("com.api.schoolsystem.Repository")
public class MyconnetionConfiger
 {
     //           Inject DataSource
    private DataSource dataSource;
    @Autowired                  //           Declare  Constructor
    public void setDataSource(DataSource dataSource)
    {
        this.dataSource = dataSource;
    }
                                //            Create DataSource Manager Bean
      @Bean
    public DataSourceTransactionManager dataSourceTransactionManager()
    {
        return new DataSourceTransactionManager(dataSource);
    }
                                //            Create  sqlSessionFactoryBean
    @Bean
    public SqlSessionFactoryBean sqlSessionFactoryBean()
    {
        SqlSessionFactoryBean sqlSessionFactoryBean = new SqlSessionFactoryBean();
        sqlSessionFactoryBean.setDataSource(dataSource);
        return sqlSessionFactoryBean;
    }
}

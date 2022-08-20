package com.api.schoolsystem.ConFiger;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import javax.sql.DataSource;

//          Mark This Class As Configuration
@Configuration
public class DatabaseConfig {
                //          Create  DataSource Object Bean
    @Bean
    public DataSource dataSource() {
        DriverManagerDataSource driverManagerDataSource = new DriverManagerDataSource();
        //          Set Postgres Driver
        driverManagerDataSource.setDriverClassName("org.postgresql.Driver");
        //          Set Url On Server Amazons
        driverManagerDataSource.setUrl("jdbc:postgresql://ec2-34-253-119-24.eu-west-1.compute.amazonaws.com:5432/d2h724tfdggut");
        //          Set UserName In Data Best
        driverManagerDataSource.setUsername("xgqmowjtgyxgdk");
        //          Set Password In Data Best
        driverManagerDataSource.setPassword("1871ca48bb9e68612a8e30a273d865f989e79645713837fbe8dcf31674db6a79");
        return ( driverManagerDataSource);





    }

        //          Declare DriverManagerDataSource Object
}

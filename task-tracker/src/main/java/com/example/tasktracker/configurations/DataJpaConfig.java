package com.example.tasktracker.configurations;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.sql.DataSource;

@Configuration
@EnableTransactionManagement
public class DataJpaConfig {

    @Bean
    public DriverManagerDataSource dataSource() {
        DriverManagerDataSource dataSource = new DriverManagerDataSource();

        dataSource.setUrl("jdbc:postgresql://localhost:5432/tasktracker");
        dataSource.setUsername("postgres");
        dataSource.setPassword("123456");
        dataSource.setDriverClassName("org.postgresql.Driver");

        return dataSource;
    }

    @Bean
    public LocalContainerEntityManagerFactoryBean entityManagerFactory(DataSource dataSource) {
        LocalContainerEntityManagerFactoryBean entityManagerFactory = new LocalContainerEntityManagerFactoryBean();

        entityManagerFactory.setDataSource(dataSource);
        entityManagerFactory.setPackagesToScan("com.example.tasktracker.models");
        entityManagerFactory.setJpaVendorAdapter(hibernateJpaVendorAdapter());

        return  entityManagerFactory;
    }

    @Bean
    public HibernateJpaVendorAdapter hibernateJpaVendorAdapter() {
        HibernateJpaVendorAdapter jpaVendorAdapter = new HibernateJpaVendorAdapter();

        jpaVendorAdapter.setShowSql(true);
        jpaVendorAdapter.setGenerateDdl(true);

        return jpaVendorAdapter;
    }

}

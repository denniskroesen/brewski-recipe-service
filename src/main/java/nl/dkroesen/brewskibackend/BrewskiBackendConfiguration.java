package nl.dkroesen.brewskibackend;

import org.apache.commons.dbcp.BasicDataSource;
import org.flywaydb.core.Flyway;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.DependsOn;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;

import javax.persistence.EntityManagerFactory;
import javax.sql.DataSource;

/**
 * The spring configuration file
 * <p>
 * This file is safe to edit. It will not be overwritten by the code generator.
 * 
 * @author dkroesen
 */
@SpringBootConfiguration
public class BrewskiBackendConfiguration {

    @Value( "${jdbc.url}" )
    private String jdbcUrl;

    @Value( "${jdbc.user}" )
    private String jdbcUser;

    @Value( "${jdbc.password}" )
    private String jdbcPassword;

    @Bean(initMethod = "migrate")
    Flyway flyway() {
        Flyway flyway = new Flyway();
        flyway.setBaselineOnMigrate(true);
        flyway.setDataSource(dataSource());
        return flyway;
    }

    @Bean
    public LocalContainerEntityManagerFactoryBean entityManagerFactory() {
        LocalContainerEntityManagerFactoryBean factory = new LocalContainerEntityManagerFactoryBean();
        factory.setDataSource(dataSource());

        HibernateJpaVendorAdapter jpaVendorAdapter = new HibernateJpaVendorAdapter();
        jpaVendorAdapter.setGenerateDdl(true);
        jpaVendorAdapter.setDatabasePlatform("org.hibernate.dialect.PostgreSQLDialect");

        factory.setJpaVendorAdapter(jpaVendorAdapter);
        return factory;
    }


//    @Bean
////    @DependsOn("flyway")
//    EntityManagerFactory entityManagerFactory() {
//        LocalContainerEntityManagerFactoryBean bean = new LocalContainerEntityManagerFactoryBean();
//        bean.setDataSource(dataSource());
//        // other configurations
//        return bean.getObject();
//    }

//    @Bean
//    JpaTransactionManager jpaTransactionManager(){
//        JpaTransactionManager jpaTransactionManager = new JpaTransactionManager();
//        jpaTransactionManager.setDataSource(dataSource());
//        return jpaTransactionManager;
//    }

    @Bean
    DataSource dataSource() {
        BasicDataSource dataSource = new BasicDataSource();
        dataSource.setUrl(jdbcUrl);
        dataSource.setUsername(jdbcUser);
        dataSource.setPassword(jdbcPassword);
        // data source configuration
        return dataSource;
    }

}
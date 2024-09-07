package com.example.shed;
import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import net.javacrumbs.shedlock.core.LockProvider;
import net.javacrumbs.shedlock.provider.jdbctemplate.JdbcTemplateLockProvider;

@Configuration

public class ShedLockConfig {

    @Bean
    public LockProvider lockProvider(DataSource ds) {
        
        return new JdbcTemplateLockProvider(ds);
   
    }
}

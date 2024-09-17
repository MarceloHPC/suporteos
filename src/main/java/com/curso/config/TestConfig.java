package com.curso.config;

import com.curso.services.DBService;
import jakarta.annotation.PostConstruct;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.beans.factory.annotation.Autowired;


@Configuration
@Profile("test")
public class TestConfig {

@Autowired
private DBService dbService;

@PostConstruct
public void initDB() {
 this.dbService.initDB();

}

}

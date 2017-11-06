package java3.core.configs;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@EnableJpaRepositories("java3")
@EnableTransactionManagement
@EntityScan("java3")
public class DatabaseConfiguration {
}
/*
package lv.javaguru.java3.core.configs;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@EnableJpaRepositories("lv.javaguru.java3")
@EnableTransactionManagement
@EntityScan("lv.javaguru.java3")
public class DatabaseConfiguration {

}
 */

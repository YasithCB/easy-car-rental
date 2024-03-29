package lk.easycarrent.spring.config;

import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

/**
 * author  Yasith C Bandara
 * created 2/15/2023 - 12:00 PM
 * project back-end-spring
 */

@Configuration
@ComponentScan(basePackages = "lk.easycarrent.spring")
@EnableWebMvc
public class WebAppConfig {

    @Bean
    public ModelMapper modelMapper() {
        return new ModelMapper();
    }

}

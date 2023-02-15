package lk.easycarrent.spring.config;

import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * author  Yasith C Bandara
 * created 2/15/2023 - 11:54 AM
 * project back-end-spring
 */

@Configuration
public class WebRootConfig {

    @Bean
    public ModelMapper modelMapper() {
        return new ModelMapper();
    }
}

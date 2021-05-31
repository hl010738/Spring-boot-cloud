package com.spring.bootcloud.config

import com.spring.bootcloud.servlet.Servlet2
import org.springframework.boot.web.servlet.ServletRegistrationBean
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

@Configuration
class ServletRegistrationConfig {

    @Bean
    fun getServletRegistrationConfig(): ServletRegistrationBean<Servlet2>{

        var bean = ServletRegistrationBean<Servlet2>()

        bean.addUrlMappings("/servlet2")

        bean.servlet = Servlet2()

        return bean
    }
}

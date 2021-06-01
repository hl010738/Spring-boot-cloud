package com.spring.bootcloud.config

import com.spring.bootcloud.filter.Filter2
import com.spring.bootcloud.servlet.Servlet2
import org.springframework.boot.web.servlet.FilterRegistrationBean
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

    @Bean
    fun getFilterRegistrationBeanConfig(): FilterRegistrationBean<Filter2> {

        var bean = FilterRegistrationBean<Filter2>()

        bean.addUrlPatterns("/servlet1")

        bean.filter = Filter2()

        return bean
    }
}

package org.ucsc.ewa.billModule.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;


@Configuration
@EnableWebMvc
@ComponentScan(basePackages = {"org.ucsc.ewa.billModule.rest"})
public class MvcCoreConfig extends WebMvcConfigurerAdapter {
}

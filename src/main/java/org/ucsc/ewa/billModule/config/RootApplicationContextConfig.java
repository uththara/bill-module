package org.ucsc.ewa.billModule.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import({BusinessConfig.class})
public class RootApplicationContextConfig {

}

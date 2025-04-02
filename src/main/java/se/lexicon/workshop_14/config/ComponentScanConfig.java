package se.lexicon.workshop_14.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "data_access")
public class ComponentScanConfig {
}

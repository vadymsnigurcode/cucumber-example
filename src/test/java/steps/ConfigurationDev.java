package steps;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.context.annotation.PropertySource;

@Configuration
@Profile("dev")
@PropertySource("classpath:dev.properties")
public class ConfigurationDev extends EnvironmentsCommonConfiguration {
}

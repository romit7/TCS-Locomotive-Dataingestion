#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.ge.predix.solsvc.training.ingestion;

import java.util.Iterator;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.embedded.tomcat.TomcatEmbeddedServletContainerFactory;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.MutablePropertySources;
import org.springframework.web.context.support.StandardServletEnvironment;




/**
 * 
 * @author predix -
 */
@SpringBootApplication
@EnableAutoConfiguration
@ComponentScan(basePackages={"${package}.ge.predix.solsvc.bootstrap.tsb.client","${package}.ge.predix.solsvc","${package}.ge.predix.solsvc.bootstrap.tsb","${package}.ge.predix.solsvc.training.ingestion"})
@PropertySource("classpath:application-default.properties")
public class Lo${package}otiveMonitoringBoot {
	private static Logger log = LoggerFactory.getLogger(Lo${package}otiveMonitoringBoot.class);
    /**
     * @param args -
     */
    public static void main(String[] args) {
        SpringApplication app = new SpringApplication(Lo${package}otiveMonitoringBoot.class);
        ConfigurableApplicationContext ctx = app.run(args);

		log.info("Let's inspect the properties provided by Spring Boot:");
		MutablePropertySources propertySources = ((StandardServletEnvironment) ctx
				.getEnvironment()).getPropertySources();
		Iterator<org.springframework.core.env.PropertySource<?>> iterator = propertySources
				.iterator();
		while (iterator.hasNext()) {
			Object propertySourceObject = iterator.next();
			if (propertySourceObject instanceof org.springframework.core.env.PropertySource) {
				org.springframework.core.env.PropertySource<?> propertySource = (org.springframework.core.env.PropertySource<?>) propertySourceObject;
				log.info("propertySource=" + propertySource.getName()
						+ " values=" + propertySource.getSource() + "class="
						+ propertySource.getClass());
			}
		}

		log.info("Let's inspect the profiles provided by Spring Boot:");
		String profiles[] = ctx.getEnvironment().getActiveProfiles();
		for (int i = 0; i < profiles.length; i++)
			log.info("profile=" + profiles[i]);
    }
    /**
     * @return -
     */
    @Bean
    public TomcatEmbeddedServletContainerFactory tomcatEmbeddedServletContainerFactory() {
        return new TomcatEmbeddedServletContainerFactory();
    }
    

}

package pe.lacafetalab.apps.mooc.backend;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.FilterType;
import pe.lacafetalab.apps.mooc.backend.command.ConsumeMySqlDomainEventsCommand;
import pe.lacafetalab.apps.mooc.backend.command.ConsumeRabbitMqDomainEventsCommand;
import pe.lacafetalab.shared.domain.Service;

import java.util.HashMap;

@SpringBootApplication(exclude = HibernateJpaAutoConfiguration.class)
@ComponentScan(
    includeFilters = @ComponentScan.Filter(type = FilterType.ANNOTATION, classes = Service.class),
    value = {"pe.lacafetalab.shared", "pe.lacafetalab.mooc", "pe.lacafetalab.apps.mooc.backend"}
)
public class MoocBackendApplication {
    public static HashMap<String, Class<?>> commands() {
        return new HashMap<String, Class<?>>() {{
            put("domain-events:mysql:consume", ConsumeMySqlDomainEventsCommand.class);
            put("domain-events:rabbitmq:consume", ConsumeRabbitMqDomainEventsCommand.class);
        }};
    }
}

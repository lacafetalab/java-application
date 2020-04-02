package pe.lacafetalab.mooc;

import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import pe.lacafetalab.apps.mooc.backend.MoocBackendApplication;
import pe.lacafetalab.shared.infrastructure.InfrastructureTestCase;

@ContextConfiguration(classes = MoocBackendApplication.class)
@SpringBootTest
public abstract class MoocContextInfrastructureTestCase extends InfrastructureTestCase {
}

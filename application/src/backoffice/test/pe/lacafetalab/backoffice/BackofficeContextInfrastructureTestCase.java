package pe.lacafetalab.backoffice;

import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import pe.lacafetalab.apps.backoffice.frontend.BackofficeFrontendApplication;
import pe.lacafetalab.shared.infrastructure.InfrastructureTestCase;

import java.io.IOException;

@ContextConfiguration(classes = BackofficeFrontendApplication.class)
@SpringBootTest
public abstract class BackofficeContextInfrastructureTestCase extends InfrastructureTestCase {
//    @Autowired
//    private ElasticsearchEnvironmentArranger elasticsearchArranger;

    protected void clearElasticsearch() throws IOException {
        //elasticsearchArranger.arrange("backoffice", "backoffice_courses");
    }
}

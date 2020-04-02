package pe.lacafetalab.apps.backoffice;

import org.springframework.transaction.annotation.Transactional;
import pe.lacafetalab.apps.ApplicationTestCase;

@Transactional("backoffice-transaction_manager")
public abstract class BackofficeApplicationTestCase extends ApplicationTestCase {
}

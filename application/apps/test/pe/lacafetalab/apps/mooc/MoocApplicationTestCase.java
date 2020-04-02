package pe.lacafetalab.apps.mooc;

import org.springframework.transaction.annotation.Transactional;
import pe.lacafetalab.apps.ApplicationTestCase;

@Transactional("mooc-transaction_manager")
public abstract class MoocApplicationTestCase extends ApplicationTestCase {
}

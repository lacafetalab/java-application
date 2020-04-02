package pe.lacafetalab.mooc.courses_counter;

import org.springframework.beans.factory.annotation.Autowired;
import pe.lacafetalab.mooc.MoocContextInfrastructureTestCase;
import pe.lacafetalab.mooc.courses_counter.domain.CoursesCounterRepository;

public abstract class CoursesCounterModuleInfrastructureTestCase extends MoocContextInfrastructureTestCase {
    @Autowired
    protected CoursesCounterRepository repository;
}

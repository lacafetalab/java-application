package pe.lacafetalab.mooc.steps;

import org.springframework.beans.factory.annotation.Autowired;
import pe.lacafetalab.mooc.steps.domain.StepRepository;
import pe.lacafetalab.mooc.MoocContextInfrastructureTestCase;

public abstract class StepsModuleInfrastructureTestCase extends MoocContextInfrastructureTestCase {
    @Autowired
    protected StepRepository repository;
}

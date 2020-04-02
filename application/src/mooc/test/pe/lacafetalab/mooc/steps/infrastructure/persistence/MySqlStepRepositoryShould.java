package pe.lacafetalab.mooc.steps.infrastructure.persistence;

import org.junit.jupiter.api.Test;
import pe.lacafetalab.mooc.steps.domain.StepIdMother;
import pe.lacafetalab.mooc.steps.domain.challenge.ChallengeStepMother;
import pe.lacafetalab.mooc.steps.domain.video.VideoStepMother;
import pe.lacafetalab.mooc.steps.StepsModuleInfrastructureTestCase;
import pe.lacafetalab.mooc.steps.domain.Step;

import javax.transaction.Transactional;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;

@Transactional
class MySqlStepRepositoryShould extends StepsModuleInfrastructureTestCase {
    @Test
    void save_a_step() {
        for (Step step : steps()) {
            repository.save(step);
        }
    }

    @Test
    void return_an_existing_step() {
        for (Step step : steps()) {
            repository.save(step);

            assertEquals(Optional.of(step), repository.search(step.id()));
        }
    }

    @Test
    void not_return_a_non_existing_course() {
        assertFalse(repository.search(StepIdMother.random()).isPresent());
    }

    private List<? extends Step> steps() {
        return Arrays.asList(ChallengeStepMother.random(), VideoStepMother.random());
    }
}

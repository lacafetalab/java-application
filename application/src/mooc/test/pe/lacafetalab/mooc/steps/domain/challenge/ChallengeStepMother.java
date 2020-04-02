package pe.lacafetalab.mooc.steps.domain.challenge;

import pe.lacafetalab.mooc.steps.domain.StepIdMother;
import pe.lacafetalab.mooc.steps.domain.StepTitleMother;
import pe.lacafetalab.mooc.steps.domain.StepId;
import pe.lacafetalab.mooc.steps.domain.StepTitle;

public final class ChallengeStepMother {
    public static ChallengeStep create(StepId id, StepTitle title, ChallengeStepStatement statement) {
        return new ChallengeStep(id, title, statement);
    }

    public static ChallengeStep random() {
        return create(StepIdMother.random(), StepTitleMother.random(), ChallengeStepStatementMother.random());
    }
}

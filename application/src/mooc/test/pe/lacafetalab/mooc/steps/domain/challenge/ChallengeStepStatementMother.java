package pe.lacafetalab.mooc.steps.domain.challenge;

import pe.lacafetalab.shared.domain.WordMother;

public final class ChallengeStepStatementMother {
    public static ChallengeStepStatement create(String value) {
        return new ChallengeStepStatement(value);
    }

    public static ChallengeStepStatement random() {
        return create(WordMother.random());
    }
}

package pe.lacafetalab.mooc.steps.domain;

import pe.lacafetalab.shared.domain.WordMother;

public final class StepTitleMother {
    public static StepTitle create(String value) {
        return new StepTitle(value);
    }

    public static StepTitle random() {
        return create(WordMother.random());
    }
}

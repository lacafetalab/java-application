package pe.lacafetalab.mooc.steps.domain;

import pe.lacafetalab.shared.domain.UuidMother;

public final class StepIdMother {
    public static StepId create(String value) {
        return new StepId(value);
    }

    public static StepId random() {
        return create(UuidMother.random());
    }
}

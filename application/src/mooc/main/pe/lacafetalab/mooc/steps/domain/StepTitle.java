package pe.lacafetalab.mooc.steps.domain;

import pe.lacafetalab.shared.domain.StringValueObject;

public final class StepTitle extends StringValueObject {
    public StepTitle(String value) {
        super(value);
    }

    private StepTitle() {
        super(null);
    }
}

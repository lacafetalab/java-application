package pe.lacafetalab.mooc.courses.domain;

import pe.lacafetalab.shared.domain.StringValueObject;

public final class CourseDuration extends StringValueObject {
    public CourseDuration(String value) {
        super(value);
    }

    private CourseDuration() {
        super("");
    }
}

package pe.lacafetalab.mooc.courses.domain;

import pe.lacafetalab.shared.domain.StringValueObject;

public final class CourseName extends StringValueObject {
    public CourseName(String value) {
        super(value);
    }

    public CourseName() {
        super("");
    }
}

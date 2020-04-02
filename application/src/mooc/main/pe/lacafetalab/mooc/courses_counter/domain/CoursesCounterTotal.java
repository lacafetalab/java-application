package pe.lacafetalab.mooc.courses_counter.domain;

import pe.lacafetalab.shared.domain.IntValueObject;

public final class CoursesCounterTotal extends IntValueObject {
    public CoursesCounterTotal(Integer value) {
        super(value);
    }

    public CoursesCounterTotal() {
        super(null);
    }

    public static CoursesCounterTotal initialize() {
        return new CoursesCounterTotal(0);
    }

    public CoursesCounterTotal increment() {
        return new CoursesCounterTotal(value() + 1);
    }
}

package pe.lacafetalab.mooc.courses_counter.application.find;

import pe.lacafetalab.shared.domain.IntegerMother;

final class CoursesCounterResponseMother {
    public static CoursesCounterResponse create(Integer value) {
        return new CoursesCounterResponse(value);
    }

    public static CoursesCounterResponse random() {
        return create(IntegerMother.random());
    }
}

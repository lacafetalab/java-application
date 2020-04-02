package pe.lacafetalab.mooc.courses.application.create;

import pe.lacafetalab.mooc.courses.domain.*;

public final class CreateCourseCommandMother {
    public static CreateCourseCommand create(CourseId id, CourseName name, CourseDuration duration) {
        return new CreateCourseCommand(id.value(), name.value(), duration.value());
    }

    public static CreateCourseCommand random() {
        return create(CourseIdMother.random(), CourseNameMother.random(), CourseDurationMother.random());
    }
}

package pe.lacafetalab.mooc.courses.domain;

import pe.lacafetalab.shared.domain.DomainError;

public final class CourseNotExist extends DomainError {
    public CourseNotExist(CourseId id) {
        super("course_not_exist", String.format("The course <%s> doesn't exist", id.value()));
    }
}

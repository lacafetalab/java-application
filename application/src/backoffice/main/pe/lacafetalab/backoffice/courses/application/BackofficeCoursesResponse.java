package pe.lacafetalab.backoffice.courses.application;

import pe.lacafetalab.shared.domain.bus.query.Response;

import java.util.List;

public final class BackofficeCoursesResponse implements Response {
    private final List<BackofficeCourseResponse> courses;

    public BackofficeCoursesResponse(List<BackofficeCourseResponse> courses) {
        this.courses = courses;
    }

    public List<BackofficeCourseResponse> courses() {
        return courses;
    }
}

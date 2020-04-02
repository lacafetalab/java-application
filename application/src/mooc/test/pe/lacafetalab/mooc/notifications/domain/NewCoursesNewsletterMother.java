package pe.lacafetalab.mooc.notifications.domain;

import pe.lacafetalab.mooc.courses.application.CoursesResponseMother;
import pe.lacafetalab.mooc.students.application.StudentResponseMother;
import pe.lacafetalab.mooc.courses.application.CoursesResponse;
import pe.lacafetalab.mooc.students.application.StudentResponse;

public final class NewCoursesNewsletterMother {
    public static NewCoursesNewsletter create(EmailId id, StudentResponse student, CoursesResponse courses) {
        return new NewCoursesNewsletter(id, student, courses);
    }

    public static NewCoursesNewsletter create(StudentResponse student, CoursesResponse courses) {
        return new NewCoursesNewsletter(EmailIdMother.random(), student, courses);
    }

    public static NewCoursesNewsletter random() {
        return create(EmailIdMother.random(), StudentResponseMother.random(), CoursesResponseMother.random());
    }
}

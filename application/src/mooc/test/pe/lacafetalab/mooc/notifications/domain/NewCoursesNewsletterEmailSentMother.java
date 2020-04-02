package pe.lacafetalab.mooc.notifications.domain;

import pe.lacafetalab.mooc.students.domain.StudentIdMother;

public final class NewCoursesNewsletterEmailSentMother {
    public static NewCoursesNewsletterEmailSent create(EmailId id, String studentId) {
        return new NewCoursesNewsletterEmailSent(id.value(), studentId);
    }

    public static NewCoursesNewsletterEmailSent random() {
        return create(EmailIdMother.random(), StudentIdMother.random().value());
    }
}

package pe.lacafetalab.mooc.notifications.application.send_new_courses_newsletter;

import pe.lacafetalab.mooc.courses.application.CoursesResponse;
import pe.lacafetalab.mooc.courses.application.search_last.SearchLastCoursesQuery;
import pe.lacafetalab.mooc.notifications.domain.EmailSender;
import pe.lacafetalab.mooc.notifications.domain.NewCoursesNewsletter;
import pe.lacafetalab.mooc.students.application.StudentResponse;
import pe.lacafetalab.mooc.students.application.StudentsResponse;
import pe.lacafetalab.mooc.students.application.search_all.SearchAllStudentsQuery;
import pe.lacafetalab.shared.domain.Service;
import pe.lacafetalab.shared.domain.UuidGenerator;
import pe.lacafetalab.shared.domain.bus.event.EventBus;
import pe.lacafetalab.shared.domain.bus.query.QueryBus;

@Service
public final class NewCoursesNewsletterSender {
    private final static Integer       TOTAL_COURSES = 3;
    private final        QueryBus      queryBus;
    private final EmailSender sender;
    private final        UuidGenerator uuidGenerator;
    private final        EventBus      eventBus;

    public NewCoursesNewsletterSender(
        QueryBus queryBus,
        UuidGenerator uuidGenerator,
        EmailSender sender,
        EventBus eventBus
    ) {
        this.queryBus      = queryBus;
        this.uuidGenerator = uuidGenerator;
        this.sender        = sender;
        this.eventBus      = eventBus;
    }

    public void send() {
        CoursesResponse courses = queryBus.ask(new SearchLastCoursesQuery(TOTAL_COURSES));

        if (courses.courses().size() > 0) {
            StudentsResponse students = queryBus.ask(new SearchAllStudentsQuery());

            students.students().forEach(student -> send(student, courses));
        }
    }

    public void send(StudentResponse student, CoursesResponse courses) {
        NewCoursesNewsletter newsletter = NewCoursesNewsletter.send(uuidGenerator.generate(), student, courses);

        sender.send(newsletter);

        eventBus.publish(newsletter.pullDomainEvents());
    }
}

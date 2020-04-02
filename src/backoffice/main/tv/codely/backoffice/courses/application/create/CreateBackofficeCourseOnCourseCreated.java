package tv.codely.backoffice.courses.application.create;

import org.springframework.context.event.EventListener;
import tv.codely.shared.domain.Service;
import tv.codely.shared.domain.course.CourseCreatedDomainEvent;

@Service
public final class CreateBackofficeCourseOnCourseCreated {
    private final BackofficeCourseCreator creator;

    public CreateBackofficeCourseOnCourseCreated(BackofficeCourseCreator creator) {
        this.creator = creator;
    }

    @EventListener
    public void on(CourseCreatedDomainEvent event) {
        creator.create(event.aggregateId(), event.name(), event.duration());
    }
}

package pe.lacafetalab.backoffice.courses.application.create;

import org.springframework.context.event.EventListener;
import pe.lacafetalab.shared.domain.Service;
import pe.lacafetalab.shared.domain.course.CourseCreatedDomainEvent;

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

package pe.lacafetalab.mooc.courses_counter.application.increment;

import org.springframework.context.event.EventListener;
import pe.lacafetalab.mooc.courses.domain.CourseId;
import pe.lacafetalab.shared.domain.Service;
import pe.lacafetalab.shared.domain.course.CourseCreatedDomainEvent;

@Service
public final class IncrementCoursesCounterOnCourseCreated {
    private final CoursesCounterIncrementer incrementer;

    public IncrementCoursesCounterOnCourseCreated(CoursesCounterIncrementer incrementer) {
        this.incrementer = incrementer;
    }

    @EventListener
    public void on(CourseCreatedDomainEvent event) {
        CourseId courseId = new CourseId(event.aggregateId());
        incrementer.increment(courseId);
    }
}

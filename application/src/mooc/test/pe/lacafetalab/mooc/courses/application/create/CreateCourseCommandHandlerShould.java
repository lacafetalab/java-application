package pe.lacafetalab.mooc.courses.application.create;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import pe.lacafetalab.mooc.courses.CoursesModuleUnitTestCase;
import pe.lacafetalab.mooc.courses.domain.CourseCreatedDomainEventMother;
import pe.lacafetalab.mooc.courses.domain.CourseMother;
import pe.lacafetalab.mooc.courses.domain.Course;
import pe.lacafetalab.shared.domain.course.CourseCreatedDomainEvent;

final class CreateCourseCommandHandlerShould extends CoursesModuleUnitTestCase {
    private CreateCourseCommandHandler handler;

    @BeforeEach
    protected void setUp() {
        super.setUp();

        handler = new CreateCourseCommandHandler(new CourseCreator(repository, eventBus));
    }

    @Test
    void create_a_valid_course() {
        CreateCourseCommand command = CreateCourseCommandMother.random();

        Course                   course      = CourseMother.fromRequest(command);
        CourseCreatedDomainEvent domainEvent = CourseCreatedDomainEventMother.fromCourse(course);

        handler.handle(command);

        shouldHaveSaved(course);
        shouldHavePublished(domainEvent);
    }
}

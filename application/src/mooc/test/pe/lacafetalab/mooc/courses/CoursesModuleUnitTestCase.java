package pe.lacafetalab.mooc.courses;

import org.junit.jupiter.api.BeforeEach;
import pe.lacafetalab.mooc.courses.domain.Course;
import pe.lacafetalab.mooc.courses.domain.CourseRepository;
import pe.lacafetalab.shared.infrastructure.UnitTestCase;

import static org.mockito.Mockito.*;

public abstract class CoursesModuleUnitTestCase extends UnitTestCase {
    protected CourseRepository repository;

    @BeforeEach
    protected void setUp() {
        super.setUp();

        repository = mock(CourseRepository.class);
    }

    public void shouldHaveSaved(Course course) {
        verify(repository, atLeastOnce()).save(course);
    }
}

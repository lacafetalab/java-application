package pe.lacafetalab.mooc.courses;

import org.springframework.beans.factory.annotation.Autowired;
import pe.lacafetalab.mooc.MoocContextInfrastructureTestCase;
import pe.lacafetalab.mooc.courses.domain.CourseRepository;
import pe.lacafetalab.mooc.courses.infrastructure.persistence.InMemoryCourseRepository;

public abstract class CoursesModuleInfrastructureTestCase extends MoocContextInfrastructureTestCase {
    protected InMemoryCourseRepository inMemoryCourseRepository = new InMemoryCourseRepository();
    @Autowired
    protected CourseRepository         mySqlCourseRepository;
}

package pe.lacafetalab.mooc.courses.domain;

import pe.lacafetalab.shared.domain.criteria.Criteria;

import java.util.List;
import java.util.Optional;

public interface CourseRepository {
    void save(Course course);

    Optional<Course> search(CourseId id);

    List<Course> matching(Criteria criteria);
}

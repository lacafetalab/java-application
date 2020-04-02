package pe.lacafetalab.backoffice.courses.domain;

import pe.lacafetalab.shared.domain.criteria.Criteria;

import java.util.List;

public interface BackofficeCourseRepository {
    void save(BackofficeCourse course);

    List<BackofficeCourse> searchAll();

    List<BackofficeCourse> matching(Criteria criteria);
}

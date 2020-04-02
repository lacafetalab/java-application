package pe.lacafetalab.mooc.courses.application.find;

import pe.lacafetalab.mooc.courses.domain.CourseId;
import pe.lacafetalab.mooc.courses.domain.CourseNotExist;
import pe.lacafetalab.mooc.courses.domain.CourseRepository;
import pe.lacafetalab.mooc.courses.application.CourseResponse;
import pe.lacafetalab.shared.domain.Service;

@Service
public final class CourseFinder {
    private final CourseRepository repository;

    public CourseFinder(CourseRepository repository) {
        this.repository = repository;
    }

    public CourseResponse find(CourseId id) throws CourseNotExist {
        return repository.search(id)
                         .map(CourseResponse::fromAggregate)
                         .orElseThrow(() -> new CourseNotExist(id));
    }
}

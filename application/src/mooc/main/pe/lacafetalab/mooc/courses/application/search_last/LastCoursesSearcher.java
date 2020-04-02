package pe.lacafetalab.mooc.courses.application.search_last;

import pe.lacafetalab.mooc.courses.application.CourseResponse;
import pe.lacafetalab.mooc.courses.application.CoursesResponse;
import pe.lacafetalab.mooc.courses.domain.CourseRepository;
import pe.lacafetalab.shared.domain.Service;
import pe.lacafetalab.shared.domain.criteria.Criteria;
import pe.lacafetalab.shared.domain.criteria.Filters;
import pe.lacafetalab.shared.domain.criteria.Order;

import java.util.Optional;
import java.util.stream.Collectors;

@Service
public final class LastCoursesSearcher {
    private final CourseRepository repository;

    public LastCoursesSearcher(CourseRepository repository) {
        this.repository = repository;
    }

    public CoursesResponse search(int courses) {
        Criteria criteria = new Criteria(
            Filters.none(),
            Order.none(),
            Optional.of(courses),
            Optional.empty()
        );

        return new CoursesResponse(
            repository.matching(criteria).stream().map(CourseResponse::fromAggregate).collect(Collectors.toList())
        );
    }
}

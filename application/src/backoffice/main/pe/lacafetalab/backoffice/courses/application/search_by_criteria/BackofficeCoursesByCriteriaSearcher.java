package pe.lacafetalab.backoffice.courses.application.search_by_criteria;

import pe.lacafetalab.backoffice.courses.application.BackofficeCourseResponse;
import pe.lacafetalab.backoffice.courses.application.BackofficeCoursesResponse;
import pe.lacafetalab.backoffice.courses.domain.BackofficeCourseRepository;
import pe.lacafetalab.shared.domain.Service;
import pe.lacafetalab.shared.domain.criteria.Criteria;
import pe.lacafetalab.shared.domain.criteria.Filters;
import pe.lacafetalab.shared.domain.criteria.Order;

import java.util.Optional;
import java.util.stream.Collectors;

@Service
public final class BackofficeCoursesByCriteriaSearcher {
    private final BackofficeCourseRepository repository;

    public BackofficeCoursesByCriteriaSearcher(BackofficeCourseRepository repository) {
        this.repository = repository;
    }

    public BackofficeCoursesResponse search(
        Filters filters,
        Order order,
        Optional<Integer> limit,
        Optional<Integer> offset
    ) {
        Criteria criteria = new Criteria(filters, order, limit, offset);

        return new BackofficeCoursesResponse(
            repository.matching(criteria)
                      .stream()
                      .map(BackofficeCourseResponse::fromAggregate)
                      .collect(Collectors.toList())
        );
    }
}

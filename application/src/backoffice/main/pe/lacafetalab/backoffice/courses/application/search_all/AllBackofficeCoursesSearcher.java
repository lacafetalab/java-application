package pe.lacafetalab.backoffice.courses.application.search_all;

import pe.lacafetalab.backoffice.courses.application.BackofficeCourseResponse;
import pe.lacafetalab.backoffice.courses.application.BackofficeCoursesResponse;
import pe.lacafetalab.backoffice.courses.domain.BackofficeCourseRepository;
import pe.lacafetalab.shared.domain.Service;

import java.util.stream.Collectors;

@Service
public final class AllBackofficeCoursesSearcher {
    private final BackofficeCourseRepository repository;

    public AllBackofficeCoursesSearcher(BackofficeCourseRepository repository) {
        this.repository = repository;
    }

    public BackofficeCoursesResponse search() {
        return new BackofficeCoursesResponse(
            repository.searchAll().stream().map(BackofficeCourseResponse::fromAggregate).collect(Collectors.toList())
        );
    }
}

package pe.lacafetalab.backoffice.courses.application.create;

import pe.lacafetalab.backoffice.courses.domain.BackofficeCourse;
import pe.lacafetalab.backoffice.courses.domain.BackofficeCourseRepository;
import pe.lacafetalab.shared.domain.Service;

@Service
public final class BackofficeCourseCreator {
    private final BackofficeCourseRepository repository;

    public BackofficeCourseCreator(BackofficeCourseRepository repository) {
        this.repository = repository;
    }

    public void create(String id, String name, String duration) {
        this.repository.save(new BackofficeCourse(id, name, duration));
    }
}

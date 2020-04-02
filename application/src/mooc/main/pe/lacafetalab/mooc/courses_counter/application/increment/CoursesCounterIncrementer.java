package pe.lacafetalab.mooc.courses_counter.application.increment;

import pe.lacafetalab.mooc.courses.domain.CourseId;
import pe.lacafetalab.mooc.courses_counter.domain.CoursesCounter;
import pe.lacafetalab.mooc.courses_counter.domain.CoursesCounterRepository;
import pe.lacafetalab.shared.domain.Service;
import pe.lacafetalab.shared.domain.UuidGenerator;

@Service
public final class CoursesCounterIncrementer {
    private CoursesCounterRepository repository;
    private UuidGenerator            uuidGenerator;

    public CoursesCounterIncrementer(CoursesCounterRepository repository, UuidGenerator uuidGenerator) {
        this.repository    = repository;
        this.uuidGenerator = uuidGenerator;
    }

    public void increment(CourseId id) {
        CoursesCounter counter = repository.search()
                                           .orElseGet(() -> CoursesCounter.initialize(uuidGenerator.generate()));

        if (!counter.hasIncremented(id)) {
            counter.increment(id);

            repository.save(counter);
        }
    }
}

package pe.lacafetalab.mooc.courses_counter.infrastructure.persistence;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.transaction.annotation.Transactional;
import pe.lacafetalab.mooc.courses_counter.domain.CoursesCounter;
import pe.lacafetalab.mooc.courses_counter.domain.CoursesCounterRepository;
import pe.lacafetalab.shared.domain.Service;
import pe.lacafetalab.shared.infrastructure.hibernate.HibernateRepository;

import java.util.List;
import java.util.Optional;

@Service
@Transactional("mooc-transaction_manager")
public class MySqlCoursesCounterRepository extends HibernateRepository<CoursesCounter> implements CoursesCounterRepository {
    public MySqlCoursesCounterRepository(@Qualifier("mooc-session_factory") SessionFactory sessionFactory) {
        super(sessionFactory, CoursesCounter.class);
    }

    @Override
    public void save(CoursesCounter counter) {
        persist(counter);
    }

    @Override
    public Optional<CoursesCounter> search() {
        List<CoursesCounter> coursesCounter = all();

        return 0 == coursesCounter.size() ? Optional.empty() : Optional.ofNullable(coursesCounter.get(0));
    }
}

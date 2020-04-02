package pe.lacafetalab.backoffice.courses.infrastructure.persistence;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.transaction.annotation.Transactional;
import pe.lacafetalab.backoffice.courses.domain.BackofficeCourse;
import pe.lacafetalab.backoffice.courses.domain.BackofficeCourseRepository;
import pe.lacafetalab.shared.domain.Service;
import pe.lacafetalab.shared.domain.criteria.Criteria;
import pe.lacafetalab.shared.infrastructure.hibernate.HibernateRepository;

import java.util.List;

@Primary
@Service
@Transactional("backoffice-transaction_manager")
public class MySqlBackofficeCourseRepository extends HibernateRepository<BackofficeCourse> implements BackofficeCourseRepository {
    public MySqlBackofficeCourseRepository(@Qualifier("backoffice-session_factory") SessionFactory sessionFactory) {
        super(sessionFactory, BackofficeCourse.class);
    }

    @Override
    public void save(BackofficeCourse course) {
        persist(course);
    }

    @Override
    public List<BackofficeCourse> searchAll() {
        return all();
    }

    @Override
    public List<BackofficeCourse> matching(Criteria criteria) {
        return byCriteria(criteria);
    }
}

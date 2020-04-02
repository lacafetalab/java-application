package pe.lacafetalab.mooc.courses.infrastructure.persistence;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.transaction.annotation.Transactional;
import pe.lacafetalab.mooc.courses.domain.Course;
import pe.lacafetalab.mooc.courses.domain.CourseId;
import pe.lacafetalab.mooc.courses.domain.CourseRepository;
import pe.lacafetalab.shared.domain.Service;
import pe.lacafetalab.shared.domain.criteria.Criteria;
import pe.lacafetalab.shared.infrastructure.hibernate.HibernateRepository;

import java.util.List;
import java.util.Optional;

@Service
@Transactional("mooc-transaction_manager")
public class MySqlCourseRepository extends HibernateRepository<Course> implements CourseRepository {
    public MySqlCourseRepository(@Qualifier("mooc-session_factory") SessionFactory sessionFactory) {
        super(sessionFactory, Course.class);
    }

    @Override
    public void save(Course course) {
        persist(course);
    }

    @Override
    public Optional<Course> search(CourseId id) {
        return byId(id);
    }

    @Override
    public List<Course> matching(Criteria criteria) {
        return byCriteria(criteria);
    }
}

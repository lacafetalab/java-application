package pe.lacafetalab.mooc.steps.infrastructure.persistence;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.transaction.annotation.Transactional;
import pe.lacafetalab.mooc.steps.domain.Step;
import pe.lacafetalab.mooc.steps.domain.StepId;
import pe.lacafetalab.mooc.steps.domain.StepRepository;
import pe.lacafetalab.shared.domain.Service;
import pe.lacafetalab.shared.infrastructure.hibernate.HibernateRepository;

import java.util.Optional;

@Service
@Transactional("mooc-transaction_manager")
public class MySqlStepRepository extends HibernateRepository<Step> implements StepRepository {
    public MySqlStepRepository(@Qualifier("mooc-session_factory") SessionFactory sessionFactory) {
        super(sessionFactory, Step.class);
    }

    @Override
    public void save(Step step) {
        persist(step);
    }

    @Override
    public Optional<? extends Step> search(StepId id) {
        return byId(id);
    }
}

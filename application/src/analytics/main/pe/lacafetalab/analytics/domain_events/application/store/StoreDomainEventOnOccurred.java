package pe.lacafetalab.analytics.domain_events.application.store;

import org.springframework.context.event.EventListener;
import pe.lacafetalab.analytics.domain_events.domain.AnalyticsDomainEventAggregateId;
import pe.lacafetalab.analytics.domain_events.domain.AnalyticsDomainEventBody;
import pe.lacafetalab.analytics.domain_events.domain.AnalyticsDomainEventName;
import pe.lacafetalab.analytics.domain_events.domain.AnalyticsDomainEventId;
import pe.lacafetalab.shared.domain.bus.event.DomainEvent;


public final class StoreDomainEventOnOccurred {
    private final DomainEventStorer storer;

    public StoreDomainEventOnOccurred(DomainEventStorer storer) {
        this.storer = storer;
    }

    @EventListener
    public void on(DomainEvent event) {
        AnalyticsDomainEventId          id          = new AnalyticsDomainEventId(event.eventId());
        AnalyticsDomainEventAggregateId aggregateId = new AnalyticsDomainEventAggregateId(event.aggregateId());
        AnalyticsDomainEventName name        = new AnalyticsDomainEventName(event.eventName());
        AnalyticsDomainEventBody body        = new AnalyticsDomainEventBody(event.toPrimitives());

        storer.store(id, aggregateId, name, body);
    }
}

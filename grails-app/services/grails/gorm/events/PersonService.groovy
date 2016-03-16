package grails.gorm.events

import grails.transaction.Transactional
import org.grails.datastore.mapping.engine.event.SaveOrUpdateEvent
import reactor.spring.context.annotation.Consumer
import reactor.spring.context.annotation.Selector

@Transactional
@Consumer
class PersonService {

    @Selector('gorm:saveOrUpdate')
    def saveOrUpdateEvent(SaveOrUpdateEvent saveOrUpdateEvent) {
        log.info "GOT saveOrUpdateEvent $saveOrUpdateEvent"
    }

    void doWork() {
        log.info "in do work method"
    }
}

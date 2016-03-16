package grails.gorm.events

import grails.transaction.Transactional
import org.grails.datastore.mapping.engine.event.PostUpdateEvent
import org.grails.datastore.mapping.engine.event.PreUpdateEvent
import org.grails.datastore.mapping.engine.event.SaveOrUpdateEvent
import org.grails.datastore.mapping.engine.event.ValidationEvent
import reactor.spring.context.annotation.Consumer
import reactor.spring.context.annotation.Selector

@Transactional
@Consumer
class PersonService {

    /*
     * All gorm events
     * PostDeleteEvent	@author Burt Beckwith
     * PostInsertEvent	@author Burt Beckwith
     * PostLoadEvent	@author Burt Beckwith
     * PostUpdateEvent	@author Burt Beckwith
     * PreDeleteEvent	@author Burt Beckwith
     * PreInsertEvent	@author Burt Beckwith
     * PreLoadEvent	@author Burt Beckwith
     * PreUpdateEvent	@author Burt Beckwith
     * SaveOrUpdateEvent	@author Burt Beckwith
     * ValidationEvent @author Burt Beckwith
     */

    @Selector('gorm:validation')
    def validationEvent(ValidationEvent event) {
        log.info "GOT ValidationEvent $event"
    }

    @Selector('gorm:saveOrUpdate')
    def saveOrUpdateEvent(SaveOrUpdateEvent event) {
        log.info "GOT SaveOrUpdateEvent $event"
    }

    @Selector('gorm:preUpdate')
    def preUpdateEvent(PreUpdateEvent event) {
        log.info "GOT PreUpdateEvent $event"
    }

    @Selector('gorm:postUpdate')
    def saveOrUpdateEvent(PostUpdateEvent event) {
        log.info "GOT PostUpdateEvent $event"
    }

    void doWork() {
        log.info "in do work method"
    }
}

package grails.gorm.events


import grails.rest.*
import grails.transaction.Transactional

@Transactional
class PersonController extends RestfulController {

    PersonService personService

    static responseFormats = ['json']

    PersonController() {
        super(Person)
    }

    def save(){
        personService.doWork()
        super.save()
    }
}

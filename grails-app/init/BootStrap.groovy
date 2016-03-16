import grails.gorm.events.Person
import grails.gorm.events.Place

class BootStrap {

    def init = { servletContext ->
        def burt = new Person(name: 'Burt').save()
        def graeme = new Person(name: 'Graeme').save()
        new Person(name: 'Jeff').save()
        new Person(name: 'Lari').save()

        new Place(person: burt, name: 'GR8 US').save()
        new Place(person: graeme, name: 'GR8 EU').save()
    }
    def destroy = {
    }
}

package grails.gorm.events

class Person {

    String name

    transient List<Place> getPlaces() {
        List<Place> places = []
        Place.findAllByPerson(this).each {
            places << it
        }
        places
    }

    static constraints = {
    }
}

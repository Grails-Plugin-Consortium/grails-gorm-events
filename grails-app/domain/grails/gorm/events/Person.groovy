package grails.gorm.events

class Person {

    String name

    transient List<Place> getPlaces() {
        List<Place> places = []
        try {
            Place.findAllByPerson(this).each {
                places << it
            }
        } catch(Exception e){
            log.error("grails 3.1.2 bug")
        }
        places
    }

    static constraints = {
    }
}

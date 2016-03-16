package grails.gorm.events


import grails.rest.*
import grails.converters.*

class PlaceController extends RestfulController {
    static responseFormats = ['json', 'xml']
    PlaceController() {
        super(Place)
    }
}

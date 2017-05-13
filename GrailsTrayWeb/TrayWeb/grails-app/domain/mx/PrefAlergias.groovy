package mx
import grails.rest.*

@Resource(readOnly = false, formats = ['json', 'xml'])
class PrefAlergias {

	boolean gluten
	boolean cacahuate
	boolean lactosa
	boolean huevo
	boolean almidon
	boolean soya

    static constraints = {
    	gluten defaultValue:false
    	cacahuate defaultValue:false
    	lactosa defaultValue:false
    	huevo defaultValue:false
    	almidon defaultValue:false
    	soya defaultValue:false
    }
}
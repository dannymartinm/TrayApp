package mx
import grails.rest.*

@Resource(readOnly = false, formats = ['json', 'xml'])
class PrefEnfermedades {

	boolean colesterol
	boolean diabetes
	boolean hipertension
	boolean trigliceridos

    static constraints = {
    	colesterol defaultValue:false
    	diabetes defaultValue:false
    	hipertension defaultValue:false
    	trigliceridos defaultValue:false
    }
}
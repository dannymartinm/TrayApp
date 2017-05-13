package mx
import grails.rest.*

@Resource(readOnly = false, formats = ['json', 'xml'])
class Comedor {
	String nombre
	String telefono
	String celular
	String latitud
	String longitud

	static hasMany = [Usuarios]
    static belongsTo = Usuarios

    static constraints = {
    	nombre unique:true
    	telefono blank:false
    	celular blank:true
    	latitud blank:false
    	longitud blank:false
    }
}

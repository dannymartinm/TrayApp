package mx

import grails.rest.*

@Resource(readOnly = false, formats = ['json', 'xml'])

class Usuarios {
	String nombre
	String apellido
	String telefono
	String email
	String nickname
	String password
	int    edad
    PrefAlergias alergias
    PrefComidas comidas
    PrefEnfermedades enfermedades

    static hasMany = [pDiarias:PrefDiarias, comedores:Comedor, friends:Friends]


    static constraints = {
    	nickname unique:true
    	nombre blank:false
    	apellido blank:false
    	telefono blank:false
    	email email:true
    	password blank:false
    	edad min:10, max:80
    }
}

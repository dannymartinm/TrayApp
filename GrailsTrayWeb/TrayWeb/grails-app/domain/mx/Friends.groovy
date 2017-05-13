package mx
import grails.rest.*

@Resource(readOnly = false, formats = ['json', 'xml'])
class Friends {
	String nombre
	String apellido
	String nickname
	String email
	byte[] avatar
  	String avatarType
  	
  	static hasMany = [Usuarios]
    static belongsTo = Usuarios

    static constraints = {
    	nickname unique:true
    	nombre blank:false
    	apellido blank:false
    	email email:true
    	avatar(nullable:true, maxSize: 16384 /* 16K */)
   	 	avatarType(nullable:true)
    }
}

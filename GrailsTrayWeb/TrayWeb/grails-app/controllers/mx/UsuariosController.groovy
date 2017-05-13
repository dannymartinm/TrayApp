package mx

import grails.rest.*
import grails.converters.*

class UsuariosController extends RestfulController {
	static responseFormats = ['json', 'xml']
	UsuariosController(){
		super(Usuarios)
	}
}
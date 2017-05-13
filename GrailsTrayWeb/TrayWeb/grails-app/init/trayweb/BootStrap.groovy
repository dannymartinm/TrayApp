package trayweb
import mx.*

class BootStrap {

    def init = { servletContext ->

        def c1 = new PrefComidas(res: true, pescado: false, pollo: true, vegetariano: false).save()
        def c2 = new PrefComidas(res: false, pescado: false, pollo: false, vegetariano: true).save()
        def a1 = new PrefAlergias(gluten: false, cacahuate: false, lactosa: true, huevo: false, almidon: false, soya: false).save()
        def e1 = new PrefEnfermedades(colesterol: false, diabetes: false, hipertesion: true, trigliceridos: false).save()
        def pd1 = new PrefDiarias(fecha:"17 mayo 2017", hora:"13:00", res:false, pescado:false, pollo:false, vegetariano:false).save()
        def comedor1 = new Comedor(nombre: "ITESM CCM", telefono:"54832020", celular: "3456789", latitud:"19.28268337", longitud:"-99.13712735").save()
        def comedor2 = new Comedor(nombre: "La Salle", telefono:"5482322020",celular: "3431434", latitud:"19.28261837", longitud:"-99.137217").save()
        def comedor3 = new Comedor(nombre: "UVM Tlalpan", telefono:"5523127822",celular: "23227291", latitud:"19.282618137", longitud:"-99.121735").save()
        def f1 = new Friends(nombre:"Ricardo", apellido:"S", nickname:"RichiBu", email:"ricardo@mail.com").save()

        new Usuarios(nombre: "Daniela",
                    apellido: "Martin",
                    telefono: "5523899177",
                    email: "dani@mail.com",
                    nickname: "daniMM",
                    edad:"30",
                    password: "123456", 
                    comidas:[c1],
                    alergias:[a1],
                    enfermedades:[e1],
                    pDiarias:[pd1],
                    comedores:[comedor1]).save()
        new Usuarios(nombre: "Itzel",
                    apellido: "Reyes",
                    telefono: "5532789211",
                    email: "itzi@mail.com",
                    nickname: "itziBU",
                    edad:"21",
                    password: "1234567", 
                    comidas:[c1],
                    alergias:[a1],
                    enfermedades:[e1],
                    pDiarias:[pd1],
                    comedores:[comedor1, comedor3]).save()

        new Usuarios(nombre: "Alex",
                    apellido: "Cortizo",
                    telefono: "3378972610",
                    email: "alex@mail.com",
                    nickname: "alexC",
                    edad:"23",
                    password: "12345678", 
                    comidas:[c1],
                    alergias:[a1],
                    enfermedades:[e1],
                    pDiarias:[pd1],
                    comedores:[comedor1, comedor2],
                    friends: [f1]).save()

    }
   

    def destroy = {
    }
}

package com.example.ejercicio12

fun main(){
    var usuarios = mutableListOf<Usuario>()
    println("ingrese cantidad usuarios")
    val cantidadUsuarios = readln().toInt()
    for( i in 1..cantidadUsuarios){
        println("ingresar nombre ")
        var nombre = readln()
        while ( validarNombre(nombre)){
            println("nombre invalido, ingresar nombre valido")
            nombre= readln()
        }

        var apellido = readln().toString()
        while (validarApellido(apellido)){
            println("apellido invalido,ingrese apellido valido")
            apellido= readln()
        }

        var edad = readln().toInt()
        validarEdad(edad)
        var correo = readln()
        while (validarCorreo(correo)){
            println("correo invalido,ingrese correo valido")
        }


        var sistemaSalud =readln()
        validarsistemaSalud(sistemaSalud)
        var usuario=  Usuario(nombre, apellido, edad, correo, sistemaSalud)
        usuarios.add(usuario)
    }
    for(u in usuarios){
        println(u)

    }

}

fun validarsistemaSalud(sistemaSalud: String):Boolean {


}

fun validarCorreo(correo: String):Boolean {
return correo.length in 1..30
}

fun validarEdad(edad: Int): Int {
    return edad.toInt()

}

fun validarApellido(apellido: String): Boolean {
return apellido.length in 1..20

}

fun validarNombre(nombre: String) :Boolean {
    return nombre.length in 1..20
}

data class Usuario(var nombre:String,var apellido:String,var edad: Int, var correo:String,var sistemaSalud:String)

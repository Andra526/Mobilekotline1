package week2.clas

open class Employe ( val name: String){
    fun sayHelo(name: String){
        println("hello $name myname is ${this.name}")
    }
}

class Manager (name: String) :Employe(name)

class member (name: String) : Employe(name)
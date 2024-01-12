class Matematica{

    //Tem equivalencia ao Static do java e javascript
    //Escopo Classe
    companion object{
        val PI = 3.1415
    }

    object obj1{
        val PI = 3.141592
    }
}

fun main() {
    Matematica.PI
    Matematica.obj1.PI
}
fun main(args: Array<String>) {

    /*   var produto = Produto(1,"Pera","Alimento")

    var estoque = Controle(produto)

    estoque.d.toString()
*/
    var nota: Int = 1555
    /*Resultado(nota)*/

    /*geraValorate100()*/
    /*geraValorate100De2Em2()*/


    println("0 Desligar , 1 Ligar")
    /*val input = readLine()*/
    val controle = 40
    var string = "ola"
    var inteiro = 5
    println("Testando Metodo Para Verificação de Tipo")
/*
    when {
        verificaTipo(string)

        */
/* is Produto -> {
            println("è Um Objeto Produto")

        }*//*


        else -> println("Erro")
    }
*/

    when (controle) {
        0 -> println(" Desligou")
        1, 2, 3 -> {

            println("inicio")
            println("Programa iniciado")
            val lista = mutableMapOf<Int, String>()
        }
        in 4..45 -> println("inesistente")
        else -> println("nao mapeado")
    }
    /*produto = Produto(1,"PS4","GAME")*/

    /*VARIAVEL TIPADA NAO NULA   : TIPO''= VALOR */
    var teste: String = ""
    /*VARIAVEL TIPADA E NULA    : TIPO'?'= VALOR  */
    var teste2: String? = "lucas"

    /*teste = null*/
    teste2 = "Lucas"
    print(teste2?.length)

   /* val nome: String? = null
    val tamanho: Int = nome!!.length // Aqui você está dizendo que "nome" não é nulo
*/

}

fun tipoInteiro(x : Any){
    return when(x){
        !is Int -> println("Tipo Inteiro")
        else -> println("Tipo String")

    }
}
    fun tipoString(x : Any): Boolean{
        return when(x){
        !is String -> return false
            else -> return true

        }
    }
    fun verificaTipo(x : Any){
       when(x){
            /*is quando for*/
            is String -> tipoString(x)
           is Int -> tipoInteiro(x)
           else -> {
               println("Variavel nao é inteira nem string: ")

           }
        }
    }
    fun doWhileMenoque10(){
        var  x = 0
        do {
            println(x)
            x++
        }while (x == 10)
    }

    fun whileMenorQue10(){
        var x = 10
        while (x < 10){
            println(x)
            x++
        }
    }
    fun geradorDefinido(inicio: Int, fim: Int){
        for(numero in inicio .. fim){
        println(numero)
        }
    }

    fun geraValorate100(){
        for (numero in 1 .. 100){
            println(numero)
        }
    }
    fun geraValorate100inevertido() {
        for (numero in 1 downTo 100) {
            println(numero)
        }
    }
    fun geraValorate100De2Em2() {
        for (numero in 1 .. 100 step 5) {
            println(numero)
        }
    }

    fun Resultado(nota:Int):String {
        if (nota <= 59 && nota >= 0) {
            println("Reprovado")
        }
        if (nota >= 60 && nota <= 100) {
            println("APROVADO")
        }
        if (nota < 0 || nota > 100) {
            print("Valor invalido")
        }
        return "Numero nao mapeado"

    }


    fun ParouImpar(numero:Int):String{
        return  if(numero %2 == 0){
            "Par"
        }else{
            "Impar"
        }
    }


class variaveis() {
    lateinit var variavel: String
    /*lateinit = iniciar depois*/

    fun iniciarVariavel() {
        variavel = "Variavel"
    }
}
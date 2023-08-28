package biblioteca

open class Pessoa (val id :Int, val primeiroNome: String, val segundoNome: String ) {
   /*Construtor primario*/

    var listaLivrosEmprestados = mutableListOf<Livro>()
    /*Construtor Secundario*/
    constructor(id :Int, primeiroNome: String): this(id,primeiroNome,"Vazio"){
    }
    /*Inicialização do bloco*/

    val nomeCompleto : String

    init {
        nomeCompleto = "${primeiroNome} ${segundoNome}"
    }

    fun pegarEmprestado(livro: Livro){
        listaLivrosEmprestados.add(livro)
    }
    fun devolverLivro(livro: Livro){
        if (livro in listaLivrosEmprestados){
            listaLivrosEmprestados.remove(livro)
        }
        else{
            println("Livro nao esta comigo")
        }
    }


    override fun toString(): String {
        return "\n ////////////////////////////// \nCliente \n Id = $id \n Primeiro Nome = $primeiroNome " +
                "\n Segundo Nome = $segundoNome  \n"
    }


}
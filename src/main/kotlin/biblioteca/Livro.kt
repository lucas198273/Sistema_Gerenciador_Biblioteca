package biblioteca

class Livro(val Id: Int, val nome: String,val autorDoLivro:String, var statusLivro: StatusLivro) {
    init {
        var nome = this.nome.uppercase()
        println("Livro Cadastrado :  #${Id} ==> ${nome} , status emprestimo : ${statusLivro}")
    }

    override fun toString(): String {
        return "/////////////// Livro |  Id   #$Id, Nome = '$nome'\n" +
                " Autor Do Livro = '$autorDoLivro', Status Emprestimo = $statusLivro)"
    }


}
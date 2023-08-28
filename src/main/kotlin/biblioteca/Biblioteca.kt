package biblioteca

class Biblioteca {

    private var EstoqueLivros = mutableMapOf<Int,Livro>()
    private var registroEmprestimo = mutableMapOf<Cliente,Livro>()

    fun adicionarAoEstoque(livro:Livro){
        EstoqueLivros[livro.Id] = livro
    }
    fun removerDoEstoque(livro: Livro){
        EstoqueLivros.remove(livro.Id)
    }
    fun obterEstoque(): Map<Int,Livro>{
        return EstoqueLivros
    }
    fun obterRegistroEmprestimo(): Map<Cliente,Livro>{
        return  registroEmprestimo

    }
    fun obterStatus(livro: Livro): StatusLivro{
        return livro.statusLivro
    }
    fun obterRegistroEmprestimoPorChave(chave: Cliente): Livro? {
        return registroEmprestimo[chave]
    }
    fun realizarEmprestimo(nomeCliente: Cliente, livro: Livro) {
        val variaveControle = obterStatus(livro)
        if (variaveControle == StatusLivro.EMPRESTADO) {
            println("Este Livro já foi emprestado")
            return
        } else {
            if (livro in EstoqueLivros.values) {
                // Remover o livro do estoque
                EstoqueLivros.values.remove(livro)

                // Adicionar o livro aos registros de empréstimo
                registroEmprestimo[nomeCliente] = livro

                println("Livro foi emprestado com sucesso")
            } else {
                println("Este Livro não está disponível no estoque")
            }
        }
    }


}
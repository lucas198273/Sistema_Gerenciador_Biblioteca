package biblioteca

fun main(args: Array<String>){

    val pessoa1 = Cliente(1,"Lucas","Dias",TipoCliente.ASSOCIADO)
    val pessoa2 = Cliente(2,"Joao","Faria",TipoCliente.NAOASSOCIADO)

    val livro1 = Livro(1, "Dom Casmurro", "Machado de Assis",StatusLivro.EM_ESTOUE)
    val livro2 = Livro(2, "A Revolução dos Bichos", "George Orwell",StatusLivro.EMPRESTADO)
    val livro3 = Livro(3, "Harry Potter e a Pedra Filosofal", "J.K. Rowling",StatusLivro.EM_ESTOUE)
    val livro4 = Livro(4, "1984", "George Orwell",StatusLivro.EM_ESTOUE)
    val livro5 = Livro(5, "O Senhor dos Anéis", "J.R.R. Tolkien",StatusLivro.EM_ESTOUE)


    var biblioteca = Biblioteca()
    var estoqueLivros  =  biblioteca.obterEstoque()

    biblioteca.adicionarAoEstoque(livro1)
    biblioteca.adicionarAoEstoque(livro2)
    biblioteca.adicionarAoEstoque(livro3)
    biblioteca.adicionarAoEstoque(livro4)
    biblioteca.adicionarAoEstoque(livro5)

    var registroEmprestimo = biblioteca.obterRegistroEmprestimo()

    println("Estoque de Livros")
    println(estoqueLivros)
    biblioteca.realizarEmprestimo(pessoa1,livro3)
    println("\n\nRegistro de Emprestimo")
    println(registroEmprestimo)



}
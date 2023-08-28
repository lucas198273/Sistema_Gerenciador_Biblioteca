open class Produto(val Id: Int, val Nome: String/*, val DataValidade: Date*/) {
    /*(EstadoVariavel , nomeVariavel, TipoVariavel)*/

    /* var = mutavel
    val = Imutavel*/
    override  fun toString():String{
        return "Produto(Id=$Id, Nome='$Nome'"
    }

}
class ProdutoEstoque ( Id: Int, Nome: String  , val quantidadeEstoque: Int):Produto( Id, Nome  ){
    override  fun toString():String{
        return "Produto(Id=$Id, Nome='$Nome', Quantidade em estoque ='${quantidadeEstoque}o'"
    }
}

class Controle() {

    private val estoque = mutableMapOf<Int, Produto>()

    fun adicionarEstoque(chave: Int, produto: Produto) {
        estoque[chave] = produto
    }
    fun obterEstoque(): Map<Int, Produto> {
        return estoque
    }

    fun obterProdutoPorChave(chave: Int): Produto? {
        return estoque[chave]
    }

    fun atualizarProduto(chave: Int, novoProduto: Produto) {
        estoque[chave] = novoProduto
    }

    fun removerProduto(chave: Int) {
        estoque.remove(chave)
    }
}
fun main() {
    val produto: Produto = ProdutoEstoque(1, "Televisao",45)
    val produto2: Produto = ProdutoEstoque(2, "PC positivo",10)
    val produto3: Produto = ProdutoEstoque(3, "PCGamer",6)
    val produto4: Produto = ProdutoEstoque(4, "PS4",45)

    val controle = Controle()

    controle.adicionarEstoque(produto.Id, produto)
    controle.adicionarEstoque(produto2.Id, produto2)
    controle.adicionarEstoque(produto3.Id, produto3)
    controle.adicionarEstoque(produto4.Id, produto4)

    val estoque = controle.obterEstoque()
    println(estoque)

    val chaveConsulta = 3
    val buscaProduto = controle.obterProdutoPorChave(chaveConsulta)

    if (buscaProduto != null) {
        println("Produto encontrado com sucesso")
        println(buscaProduto)
    } else {
        println("Produto nao encontrado")
    }

    val chaveRemocao = 2
    controle.removerProduto(chaveRemocao)
    println("Produto com chave $chaveRemocao removido")
}

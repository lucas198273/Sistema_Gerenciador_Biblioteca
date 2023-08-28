package biblioteca
open class Cliente(id :Int,primeiroNome: String,segundoNome: String, val tipoCliente: TipoCliente) : Pessoa(id, primeiroNome, segundoNome) {

    init {
        val nome = this.nomeCompleto.uppercase()
        println("Nova cliente criado: ${nome}")
    }

    override fun toString(): String {
        return  "\n ////////////////////////////// \nCliente \n Id = $id  |    Tipo Cliente ${ tipoCliente}\n Primeiro Nome = $primeiroNome " +
                "\n Segundo Nome = $segundoNome  \n"
    }


}

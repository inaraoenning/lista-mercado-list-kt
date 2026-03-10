fun main() {

    // Mapa onde a chave é um textp e o valor é um numero
    val itensLista = mutableMapOf<String, Double>()

    while (true) {
        println(
            """
            1- Adicionar Item
            2- Remover Item
            3- Alterar Valor
            4- Ver Itens
            5- Sair
        """.trimIndent()
        )
        val opcao: Int = readln().toInt()

        when (opcao) {
            1 -> {
                println("Informe o nome do Item:")
                val nomeItem = readln()

                println("Informe o valor:")
                val valorItem: Double = readln().toDouble()

                if (itensLista.contains(nomeItem)) {
                    println("Item já adicionado a lista")
                    continue
                }
                // Guarda o preço dentro da key nomeItem
                itensLista[nomeItem] = valorItem

            }

            2 -> {
                //todo Remover Item
                println("Digite o nome do item para remover:")
                val nomeItem = readln()

                if (itensLista.contains(nomeItem)) {
                    itensLista.remove(nomeItem)
                    println("$nomeItem removido com sucesso.")
                    continue
                }
                println("Item não cadastrado na lista")
            }
 
            3 -> {
                //todo Alterar Valor
                println("Infome o item que deseja alterar o valor")
                val nomeItem = readln()

                if (itensLista.contains(nomeItem)) {
                    println("Informe o novo valor do Item:")
                    val valorItem: Double = readln().toDouble()
                    // Adiciona o novo valor na key
                    itensLista[nomeItem] = valorItem
                    continue
                }
                println("Item não econtrado.")
            }

            4 -> {
                // para cada nome e valor da minha lista printar nome e valor
                if (itensLista.isEmpty()) {
                    println("Lista vazia. Adicione algum item para visualizar a lista")
                    continue
                }
                itensLista.forEach { (nome, valor) ->
                    println("$nome - $valor")
                }
            }
        }

    }
}



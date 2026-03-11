fun main() {

    // Mapa onde a chave é um textp e o valor é um numero
    val mapaLista = mutableMapOf<String, Double>()

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

                if (mapaLista.contains(nomeItem)) {
                    println("Item já adicionado a lista")
                    continue
                }
                // Guarda o preço dentro da key nomeItem
                mapaLista[nomeItem] = valorItem

            }

            2 -> {
                //todo Remover Item
                println("Digite o nome do item para remover:")
                val nomeItem = readln()

                if (mapaLista.contains(nomeItem)) {
                    mapaLista.remove(nomeItem)
                    println("$nomeItem removido com sucesso.")
                    continue
                }
                println("Item não cadastrado na lista")
            }
 
            3 -> {
                //todo Alterar Valor
                println("Infome o item que deseja alterar o valor")
                val nomeItem = readln()

                if (mapaLista.contains(nomeItem)) {
                    println("Informe o novo valor do Item:")
                    val valorItem: Double = readln().toDouble()
                    // Adiciona o novo valor na key
                    mapaLista[nomeItem] = valorItem
                    continue
                }
                println("Item não econtrado.")
            }

            4 -> {
                // para cada nome e valor da minha lista printar nome e valor
                if (mapaLista.isEmpty()) {
                    println("Lista vazia. Adicione algum item para visualizar a lista")
                    continue
                }
                mapaLista.forEach { (nome, valor) ->
                    println("$nome - $valor")
                }
            }
        }

    }
}



fun main() {

    // Mapa Key - Value (String Double)
    val mapaLista = mutableMapOf<String, Double>()

    while (true) {
        println(
            """
            1- Adicionar Item
            2- Remover Item
            3- Alterar Valor
            4- Ver Lista
            5- Sair
        """.trimIndent() // Remove espaçamento antes da linha
        )
        val opcao: Int = readln().toInt()

        when (opcao) {
            1 -> {
                println("Informe o nome do Item:")
                val nomeItem = readln()

                println("Informe o valor:")
                val valorItem: Double = readln().toDouble()

                if (mapaLista.contains(nomeItem)) {
                    println("🟡 Item já adicionado a lista")
                    continue
                }
                // Guarda Chave e nome
                mapaLista[nomeItem] =
                    valorItem  // sobrecarga de operador (operator overloading). Por baixo dos panos, o Kotlin pega esses colchetes e traduz para uma chamada da função .set()
                // mapaLista.set(nomeItem, valorItem)

                println("🟢 $nomeItem adicionado a lista")
            }

            2 -> {
                // Remover Item
                println("Digite o nome do item para remover:")
                val nomeItem = readln()

                if (mapaLista.contains(nomeItem)) {

                    mapaLista.remove(nomeItem)
                    println("🟢 $nomeItem removido com sucesso.")
                    continue
                }
                println("🟡 Item não encontrado.")
            }

            3 -> {
                // Alterar Valor
                println("Infome o item que deseja alterar o valor")
                val nomeItem = readln()

                if (mapaLista.contains(nomeItem)) {
                    println("Informe o novo valor do Item:")
                    val valorItem: Double = readln().toDouble()
                    // Adiciona o novo valor na key
                    mapaLista[nomeItem] = valorItem

                    println("🟢 Valor de ${nomeItem} foi alterado com sucesso.")
                    continue
                }
                println("🟡 Item não encontrado.")
            }

            4 -> {
                // para cada nome e valor da minha lista printar nome e valor
                if (mapaLista.isEmpty()) {
                    println("🟡 Lista vazia. Adicione algum item para visualizar a lista")
                    continue
                }
                println("====================")
                mapaLista.forEach { (nome, valor) ->
                    println("◽  ${nome.uppercase()} - $valor")

                }
                println("Total = ${mapaLista.values.sum()}") // Soma todos os valores da lista
                println("====================")

            }
        }
    }
}



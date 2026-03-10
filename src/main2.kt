fun main() {

    // Lista de compras com List

    // Criar lista para item
    val item = mutableListOf<String>()
    // Criar lista para valor
    val valor = mutableListOf<Double>()

    // loop while para menu de opções
    while (true) {
        println(
            """
            ==== Lista de Compras ====
            1- Adicionar item
            2- Remover item
            3- Alterar preço
            4- Listar itens
            5- Sair
        """.trimIndent()
        )
        val opcao: Int = readln().toInt()

        when (opcao) {
            1 -> {
                // todo Adicionar item e valor
                println("Digite o nome do item:")
                val nomeItem = readln()

                println("Digite o valor do item:")
                val valorItem = readln().toDouble()

                if (item.contains(nomeItem)) {
                    println("Item já existe na lista!")
                    continue // faz o laço pular para a próxima repetição sem quebrá-lo por completo
                }

                item.add(nomeItem)
                valor.add(valorItem)

                println("$nomeItem adicionado com sucesso!")
            }

            2 -> {
                // todo remover item e valor acessando o index
                println("Digite o nome do item a ser removido:")
                val nomeItem = readln()

                if (item.contains(nomeItem)) {
                    val indexItem = item.indexOf(nomeItem)

                    item.removeAt(indexItem)
                    valor.removeAt(indexItem)
                    println("$nomeItem removido com sucesso!")
                    continue // faz o laço pular para a próxima repetição sem quebrá-lo por completo
                }
            }

            3 -> {
                // todo alterar preco do item acessando o index
                println("Digite o nome do item que deseja alterar o valor:")
                val nomeItem = readln()

                println("Digite o novo valor do item:")
                val valorItem: Double = readln().toDouble()

                if (item.contains(nomeItem)) {
                    val indexItem = item.indexOf(nomeItem)
                    valor.set(indexItem, valorItem)

                    println("Valor de $nomeItem alterado para $valorItem")
                    continue // faz o laço pular para a próxima repetição sem quebrá-lo por completo
                }
            }

            4 -> {
                // todo lista itens e valores usando for
                println(" === Lista dos Itens === ")
                for (i in 0 until item.size) {
                    println("${item[i]} Valor ${valor[i]}")
                }
            }

            5 -> {
                println("Saindo...")
            }
        }
    }

}

// pilhas filas e threads
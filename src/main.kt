fun main() {

    // lista vazia item/valor
    val item = mutableListOf<String>()
    val valor = mutableListOf<Double>()

    // looping while para o menu de opções
    while (true) {
        println(" === Lista de Compras ===")

        println(
            """
            1- Adicionar item
            2- Remover item
            3- Alterar Preco
            4- Listar itens
            5- Sair
        """.trimIndent()
        )
        val opcao: Int = readln().toInt()

        when (opcao) {
            1 -> {

                println("Digite o nome do item:")
                val nomeItem = readln()

                println("Digite o valor do item:")
                val valorItem = readln().toDouble()

                // Adiciona item e valor em cada lista
                item.add(nomeItem)
                valor.add(valorItem)

                println("Item adicionado com sucesso!")
            }

            2 -> {
                println("Digite o nome do item a ser removido:")
                val nomeItem = readln()

                // se na lista item conter o nome do item inserido ^
                if (item.contains(nomeItem)) {
                    // Armazeno o index do item que passei o nome acima ^
                    val itemIndex = item.indexOf(nomeItem)

                    // Remove o item no index armazenado
                    item.removeAt(itemIndex)
                    valor.removeAt(itemIndex)
                    println("Item Removido com sucesso")
                    return
                }
                println("Item não encontrado")
            }

            3 -> {
                println("Digite o nome do item para alterar o preço:")
                val nomeItem = readln()

                println("Digite o novo valor do item:")
                val novoValor: Double = readln().toDouble()

                if (item.contains(nomeItem)) {
                    val itemIndex = item.indexOf(nomeItem)

                    valor.set(itemIndex, novoValor)
                    println("Preço alterado com sucesso")
                    break

                }

                println("Item não encontrado")

            }

            4 -> {
                // listar itens
                println("Lista de Itens:")
                for (i in 0 until item.size) {
                    println("Item: ${item[i]} - Valor: ${valor[i]}")
                }
            }

            5 -> {
                println("Saindo...")
                break
            }
        }
    }
}


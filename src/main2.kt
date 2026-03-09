fun main2() {

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
                    return
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
                    return
                }
            }

            3 -> {
                // todo alterar preco do item acessando o index
            }

            4 -> {
                // todo lista itens e valores usando for
            }

            5 -> {
                println("Saindo...")
            }
        }
    }

    // when para opções do menu

    // opção 1: adicionar item e valor
    // opcao 2: remover item e valor
    // opção 3: alterar preço do item
    // opção 4: listar itens e valores


}

// pilhas filas e threads
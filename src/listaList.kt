fun main() {

    // Criar uma lista para nome
    // Criar uma lista para valor

    // while(true) menu
    // when para menu opções

    // adicionar -> verifica se existe o item com o nome
    // remover -> verifica se existe antes de remover
    // alterar valor -> verificar se existe e alterar o valor onde o indice é igual ao nome do item
    // ver lista -> usar for in percorenddo o tamanho inteiro da lista e printar nome e valor
    // sair

    // Declara lista vazia
    val nomeItem = mutableListOf<String>()
    val valorItem = mutableListOf<Double>()

    while (true) {
        println("=== Lista de Compras ===")
        print(
            """
            1- Adicionar
            2- Remover
            3- Alterar valor
            4- Ver lista
            5- Sair
        """.trimIndent()
        )
        val opcao: Int = readln().toInt()

        when (opcao) {
            1 -> {
                println("Informe o nome do produto:")
                val nome: String = readln()

                // Verifica se o item já existe antes de passar o valor
                if (nomeItem.contains(nome)) {
                    println("🟡 Item já existe na lista.")
                    continue
                }
                print("Informe o valor do produto:")
                val valor: Double = readln().toDouble()

                nomeItem.add(nome)
                valorItem.add(valor)

                println("$nome foi adicionado a lista com valor $valor.")

            }

            2 -> {
                println("Informe o nome do produto que deseja remover:")
                val nome: String = readln()

                // Verifica se o item existe na lista para remover
                if (!nomeItem.contains(nome)) {
                    print("🟡 Item não encontrado.")
                    continue
                }

                // variavel index para guardar o index nome na lista nomeItem
                val index = nomeItem.indexOf(nome)

                nomeItem.removeAt(index)
                valorItem.removeAt(index)

                println("$nome removido da lista")
            }

            3 -> {

                //alterar valor
                println("Informe o nome do produto para alterar o valor:")
                val nome: String = readln()

                if (!nomeItem.contains(nome)) {
                    println("🟡 Item não encontrado.")
                }

                print("Informe o valor do produto:")
                val valor: Double = readln().toDouble()

                val index = nomeItem.indexOf(nome)
                valorItem.set(index, valor)
            }

            4 -> {
                println("=== Lista ===")

                for (i in 0 until nomeItem.size) {
                    println("${nomeItem[i]} - ${valorItem[i]}")
                }
            }
        }
    }
}


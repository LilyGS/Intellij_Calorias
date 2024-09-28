fun main(){

    val alimentos = mapOf(
        "Pizza" to 800,
        "Ensalada" to 200,
        "Hamburguesa" to 700,
        "Manzana" to 100,
        "Helado" to 300,
        "Pasta" to 600,
        "Yogurt" to 150
    )

    println(alimentos)

    alimentos.forEach{ (nombre, calorias) ->
        println("$nombre, $calorias") }

    val altosCalorias = alimentos.filter { it.value > 500 }
    val bajosCalorias = alimentos.filter { it.value <= 500}
    val totalCaloriasConsumidas = alimentos.values.sum()


        println("Alimentos altos en calorías $altosCalorias")
        println("Total calorías consumidas $totalCaloriasConsumidas")

}
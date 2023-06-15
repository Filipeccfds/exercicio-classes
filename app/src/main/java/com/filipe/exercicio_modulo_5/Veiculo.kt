package com.filipe.exercicio_modulo_5


fun main(){
    var carro = Veiculo("Kombi")
    carro.velocidadeAtual()
    carro.aumento(10)
    carro.velocidadeAtual()
    carro.reduzir(30)
    carro.velocidadeAtual()
    carro.aumento(50)
    carro.velocidadeAtual()

}

class Veiculo(model:String) {
    private var long:Int
    private var acceleration: Int
    var model:String

        init {
            this.long = 0
            this.acceleration = 10
            this.model = model
        }

    fun aumento(valor:Int){
        acceleration =+ valor
    }

    fun reduzir(valor:Int):Int{
        acceleration = acceleration - valor
        if (long < 0){
            long = 0
        }
        return long
    }

    fun salvar():Int{
        long = long + acceleration
        return long
    }

    fun velocidadeAtual() = println("esta e a sua velocidade atual: ${salvar()}")

}


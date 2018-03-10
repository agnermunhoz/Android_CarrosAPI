package br.com.agnermunhoz.carroapi.service

import br.com.agnermunhoz.carroapi.entity.Carro
import br.com.agnermunhoz.carroapi.repository.CarroRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class CarroService {

    @Autowired
    lateinit var carroRepository: CarroRepository

    fun buscarTodosCarro(): List<Carro> {
        return carroRepository.findAll()
    }

    fun buscarCarroPorMarca(marca: String): List<Carro> {
        return carroRepository.findByMarcaContaining(marca)
    }

    fun burcarCarroPorAno(ano: Int): List<Carro> {
        return carroRepository.findByAno(ano)
    }

    fun burcarCarroPorPlaca(placa: String): Carro {
        return carroRepository.findByPlaca(placa)
    }

    fun salvar(carro: Carro) {
        carroRepository.save(carro)
    }
}
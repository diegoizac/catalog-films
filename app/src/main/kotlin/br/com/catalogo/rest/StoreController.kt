package br.com.catalogo.rest

import br.com.catalogo.domain.Store
import br.com.catalogo.services.StoreServices
import io.micronaut.http.annotation.Delete
import io.micronaut.http.annotation.Put

class StoreController {

    private val storeServices = StoreServices()
    //Pq me obrigou a colocar o private ?

    @Put
    fun update(store: Store) {
        println(store)
    }

    @Delete("/{id}")
    fun delete(id: Int) {
        println("Delete_by_Id: $id")
    }
}
package br.com.catalogo.rest

import br.com.catalogo.domain.Store
import br.com.catalogo.services.StoreServices
import io.micronaut.http.annotation.*
import io.micronaut.http.MutableHttpResponse as HttpMutableHttpResponse

class StoreController {

    private val storeServices = StoreServices()
    //Pq me obrigou a colocar o private ? variável interna do controller

    @Post
    fun create(store: Store): HttpMutableHttpResponse<Unit>? {
        try {
            storeServices.save(store)

        } catch (ex: Exception) {
            println(ex.message)
            return io.micronaut.http.HttpResponse.badRequest()
        }
        return io.micronaut.http.HttpResponse.ok()

    }

    @Put
    fun update(store: Store): HttpMutableHttpResponse<Unit>? {
        return storeServices.save(store)
    }

    @Delete("/{id}")
    fun delete(id: Int) {
        return storeServices.remove(id)
    }

    @Get("/{id}")
    fun getById(id: Int): Store {
        println("Get_By_Id: $id")
        return storeServices.getById(id)
    }
}
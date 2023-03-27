package br.com.catalogo.rest

import br.com.catalogo.domain.Staff
import br.com.catalogo.services.StaffServices
import io.micronaut.http.annotation.*
import io.micronaut.http.MutableHttpResponse as HttpMutableHttpResponse

@Controller("/staff")
class StaffController {

    private val staffServices = StaffServices()
    //Pq me obrigou a colocar o private ?

    @Post
    fun create(staff: Staff): HttpMutableHttpResponse<Unit>? {
        try {
            staffServices.save(staff)

        } catch (ex: Exception) {
            println(ex.message)
            return io.micronaut.http.HttpResponse.badRequest()
        }
        return io.micronaut.http.HttpResponse.ok()

    }

    @Put
    fun update(staff: Staff) {
        println(staff)
    }

    @Delete("/{id}")
    fun delete(id: Int) {
        println("Delete_by_Id: $id")
    }
    @Get
    fun getAll(): MutableMap<Int, Staff> {
        return staffServices.getAll()
    }

    @Get("/{id}")
    fun getById(id: Int): Staff {
        println("Get_By_Id: $id")
        return staffServices.getById(id)
    }

}
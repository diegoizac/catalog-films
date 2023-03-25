package br.com.catalogo.domain

import io.micronaut.core.annotation.Introspected
import java.time.LocalDateTime

@Introspected
data class Staff(
    val id: Int,
    val firstName: String,
    val lastName: String,
    //val addressId: Address,
    val addressId: Int,
    //val storeId: Store,
    val storeId: Int,
    val lastUpdate: LocalDateTime
)

/*

post /staff
route: /staff
{
    "id": 1,
    "firstName": "John",
    "lastName": "Doe",
    "addressId": 1,
    "storeId": 1,
    "lastUpdate": "2021-01-01T09:00:00"
}

{
    "id": 2,
    "firstName": "Jane",
    "lastName": "Doe",
    "addressId": 2,
    "storeId": 2,
    "lastUpdate": "2021-01-01T09:00:00"
}

{
    "id": 3,
    "firstName": "John",
    "lastName": "Doe",
    "addressId": 3,
    "storeId": 3,
    "lastUpdate": "2021-01-01T09:00:00"
}

{
    "id": 4,
    "firstName": "John",
    "lastName": "Doe",
    "addressId": 4,
    "storeId": 4,
    "lastUpdate": "2021-01-01T09:00:00"
}

{
    "id": 5,
    "firstName": "John",
    "lastName": "Doe",
    "addressId": 5,
    "storeId": 5,
    "lastUpdate": "2021-01-01T09:00:00"
}

{
    "id": 6,
    "firstName": "John",
    "lastName": "Doe",
    "addressId": 6,
    "storeId": 6,
    "lastUpdate": "2021-01-01T09:00:00"
}

{
    "id": 7,
    "firstName": "John",
    "lastName": "Doe",
    "addressId": 7,
    "storeId": 7,
    "lastUpdate": "2021-01-01T09:00:00"
}

{
    "id": 8,
    "firstName": "John",
    "lastName": "Doe",
    "addressId": 8,
    "storeId": 8,
    "lastUpdate": "2021-01-01T09:00:00"
}

{
    "id": 9,
    "firstName": "John",
    "lastName": "Doe",
    "addressId": 9,
    "storeId": 9,
    "lastUpdate": "2021-01-01T09:00:00"
}
*/

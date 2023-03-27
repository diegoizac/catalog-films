package br.com.catalogo.services

import br.com.catalogo.domain.Store

class StoreServices {
    fun save(store: Store) {

        storeDb.put(store.id, store)

    }

    fun getById(id: Int) = storeDb.getValue(id)
    fun remove(id: Int) = storeDb.remove(id)
}

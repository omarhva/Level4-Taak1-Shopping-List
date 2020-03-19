package com.androidcourse.shoppinglistkotlin.Data

import android.content.Context
import com.androidcourse.shoppinglistkotlin.model.Product

/**
 * @author Omar Mulla Ibrahim
 * Student Nr 500766035
 */

/**
 * Product Repository
 */

class ProductRepository(context: Context) {

    private val productDao: ProductDao

    init {
        val database =
            ShoppingListRoomDatabase.getDatabase(context)
        productDao = database!!.productDao()
    }

    // here to get list of all the products
    suspend fun getAllProducts(): List<Product> = productDao.getAllProducts()

    // here to insert an Product using the Dao interface
    suspend fun insertProduct(product: Product) = productDao.insertProduct(product)

    // here to delete an Product using the Dao interface
    suspend fun deleteProduct(product: Product) = productDao.deleteProduct(product)

    // here to delete all the  Products using the Dao interface
    suspend fun deleteAllProducts() = productDao.deleteAllProducts()

}
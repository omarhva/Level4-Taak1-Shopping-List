package com.androidcourse.shoppinglistkotlin.Data

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import com.androidcourse.shoppinglistkotlin.model.Product

/**
 * @author Omar Mulla Ibrahim
 * Student Nr 500766035
 */
/**
 *  Dao class (Data access object)
 */
@Dao
interface ProductDao {
    // here we give our query and the tabel we need to select from
    @Query("SELECT * FROM product_table")
    suspend fun getAllProducts(): List<Product>

    @Insert
    suspend fun insertProduct(product: Product)

    @Delete
    suspend fun deleteProduct(product: Product)

    @Query("DELETE FROM product_table")
    suspend fun deleteAllProducts()

}
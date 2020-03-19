package com.androidcourse.shoppinglistkotlin.model

import android.os.Parcelable
import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import kotlinx.android.parcel.Parcelize

/**
 * @author Omar Mulla Ibrahim
 * Student Nr 500766035
 */

/**
 * Data Class Product
 */
@Parcelize
@Entity(tableName = "product_table")
data class Product(

    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "id")
    var id: Long? = null,

    @ColumnInfo(name = "name")
    var name: String,

    @ColumnInfo(name = "quantity")
    var quantity: Int

) : Parcelable
package com.androidcourse.shoppinglistkotlin.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.androidcourse.shoppinglistkotlin.model.Product
import com.androidcourse.shoppinglistkotlin.R
import kotlinx.android.synthetic.main.item_product.view.*

/**
 * @author Omar Mulla Ibrahim
 * Student Nr 500766035
 */
class ProductAdapter(private val products: List<Product>) :
    RecyclerView.Adapter<ProductAdapter.ViewHolder>() {
    /**
     * Creates and returns a ViewHolder object, inflating a standard layout called simple_list_item_1.
     */
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(
            LayoutInflater.from(parent.context).inflate(R.layout.item_product, parent, false)
        )
    }

    /**
     *  here we get the size of the list
     */
    override fun getItemCount(): Int = products.size

    /**
     * Called by RecyclerView to display the data at the specified position.
     */
    override fun onBindViewHolder(holder: ViewHolder, position: Int) =
        holder.bind(products[position])

    /**
     * here we bind item view with the results
     */
    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        fun bind(product: Product) {
            itemView.tvProduct.text = product.name
            itemView.tvQuantity.text = product.quantity.toString()
        }
    }
}
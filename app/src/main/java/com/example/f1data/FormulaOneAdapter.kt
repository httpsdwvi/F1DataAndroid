package com.example.f1data

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.example.f1data.models.FormulaOne
import kotlinx.android.synthetic.main.rv_item.view.*

class FormulaOneAdapter : RecyclerView.Adapter<RecyclerView.ViewHolder>(){

    private var items : List<FormulaOne> = ArrayList()
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {

        return FormulaOneViewHolder(
            LayoutInflater.from(parent.context).inflate(R.layout.rv_item, parent, false)
        )
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        when(holder) {

            is FormulaOneViewHolder -> {
                holder.bind(items[position])
            }

        }
    }

    override fun getItemCount(): Int {
        return items.size
    }

    fun setDataSet(Formula : List<FormulaOne>) {
        this.items = Formula
    }

    class  FormulaOneViewHolder constructor(
        itemView: View
    ): RecyclerView.ViewHolder(itemView) {

        private val driver = itemView.driver
        private val driverPhoto = itemView.driverPhoto




        fun bind(formulaOne : FormulaOne) {
            driver.text = formulaOne.driver

                val requestOptions = RequestOptions()
                    .placeholder(R.drawable.ic_launcher_background)
                    .error(R.drawable.ic_launcher_background)

                Glide.with(itemView.context)
                    .applyDefaultRequestOptions(requestOptions)
                    .load(formulaOne.driverPhoto)
                    .into(driverPhoto)



        }

    }

}

package com.example.multiselectionrecyclerview

import com.example.multiselectionrecyclerview.model.ItemSelection

class MultiSelectionRecyclerViewAdapter<T : ItemSelection>(
    private val items: List<T>, layout: Int
) : GenericRecyclerViewAdapter<T>(items, layout) {

    private var multiSelectionEnabled = false

    override fun onBindViewHolder(holder: GenericViewHolder, position: Int) {
        val obj = items[position]
        holder.bind(obj)

        holder.binding.root.setOnClickListener {
            if (multiSelectionEnabled) {
                obj.hasSelected = !obj.hasSelected
                //onItemSelected called here
                notifyItemChanged(position)
            }
            else
                itemClickListener?.onItemClick(obj, position)
        }
        holder.binding.root.setOnLongClickListener {
            multiSelectionEnabled = true
            it.performClick()
            return@setOnLongClickListener true
        }
    }

}
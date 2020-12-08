package com.example.multiselectionrecyclerview

fun interface OnListItemClickListener <T>{
    fun onItemClick(item: T, pos: Int)
}
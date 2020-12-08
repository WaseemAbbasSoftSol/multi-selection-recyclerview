package com.example.multiselectionrecyclerview

import android.view.View

fun interface OnItemViewClickListener<T> {
    fun onClick(view: View, item: T)
}
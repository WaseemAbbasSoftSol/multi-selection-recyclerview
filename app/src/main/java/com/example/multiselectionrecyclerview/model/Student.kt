package com.example.multiselectionrecyclerview.model

data class Student(
    val id: Int,
    val name: String,
    override var hasSelected: Boolean = false
): ItemSelection

package com.example.multiselectionrecyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.RecyclerView
import com.example.multiselectionrecyclerview.model.Student

class MainActivity : AppCompatActivity() {

    private lateinit var mRecyclerView: RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initRecyclerView()

    }

    private fun initRecyclerView() {
        mRecyclerView = findViewById(R.id.rv_students)
        val adapter = MultiSelectionRecyclerViewAdapter(getStudents(), R.layout.item_student_layout)
        mRecyclerView.adapter = adapter
    }

    private fun getStudents() = listOf(
        Student(1, "Waseem Abbas"),
        Student(2, "Ali Raza"),
        Student(3, "Jawad Ahmad"),
        Student(4, "Rana Abdul Basit"),
        Student(5, "Alisha"),
        Student(6, "John Wrick"),
        Student(7, "Wolverin"),
        Student(8, "Julia Abel Smith"),
        Student(9, "Hussnain Liaqat"),
        Student(10, "Hussnain Mukhtar"),
        Student(11, "Nabeel Abid"),
        Student(12, "Ali Rehan"),
        Student(13, "Booking.com"),
    )
}





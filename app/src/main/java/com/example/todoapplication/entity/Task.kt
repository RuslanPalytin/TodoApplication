package com.example.todoapplication.entity

data class Task(
    val id: Int,
    var todo: String,
    var completed: Boolean,
    val userId: Int,
)
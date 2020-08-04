package com.example.leado.models

data class Course(
    val name: String,
    val lessons: List<Lesson>,
    var lessonsNum: Int? = null
)
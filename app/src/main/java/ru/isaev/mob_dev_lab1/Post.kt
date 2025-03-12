package ru.isaev.mob_dev_lab1

data class Post(
    val text: String,
    val imageUrl: String,
    val likes: Int,
    val comments: Int
)

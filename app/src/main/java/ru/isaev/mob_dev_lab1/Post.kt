package ru.isaev.mob_dev_lab1

data class Post(
    val id: Long,
    val text: String,
    val imageUrl: String,
    val likes: Int,
    val comments: Int,
    var isLiked: Boolean = false
)

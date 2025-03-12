package ru.isaev.mob_dev_lab1

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class PostViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
    val postText: TextView = itemView.findViewById(R.id.post_text)
    val postImage: ImageView = itemView.findViewById(R.id.post_image)
    val likeButton: ImageView = itemView.findViewById(R.id.like_button)
    val likeCount: TextView = itemView.findViewById(R.id.like_count)
    val commentButton: ImageView = itemView.findViewById(R.id.comment_button)
    val commentCount: TextView = itemView.findViewById(R.id.comment_count)
}
package ru.isaev.mob_dev_lab1

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide

class PostsAdapter(private val posts: List<Post>) : RecyclerView.Adapter<PostsAdapter.PostViewHolder>() {

    class PostViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val postText: TextView = itemView.findViewById(R.id.post_text)
        val postImage: ImageView = itemView.findViewById(R.id.post_image)
        val likeButton: ImageView = itemView.findViewById(R.id.like_button)
        val likeCount: TextView = itemView.findViewById(R.id.like_count)
        val commentButton: ImageView = itemView.findViewById(R.id.comment_button)
        val commentCount: TextView = itemView.findViewById(R.id.comment_count)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PostViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.post, parent, false)
        return PostViewHolder(view)
    }

    override fun onBindViewHolder(holder: PostViewHolder, position: Int) {
        val post = posts[position]
        holder.postText.text = post.text
        holder.likeCount.text = post.likes.toString()
        holder.commentCount.text = post.comments.toString()


         Glide.with(holder.postImage.context)
             .load(post.imageUrl)
             .error(R.drawable.error)
             .into(holder.postImage)

        holder.likeButton.setOnClickListener {

        }

        holder.commentButton.setOnClickListener {

        }
    }

    override fun getItemCount(): Int = posts.size
}

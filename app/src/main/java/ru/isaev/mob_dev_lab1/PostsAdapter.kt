package ru.isaev.mob_dev_lab1

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide

class PostsAdapter(
    private var posts: List<Post>,
    private val onLikeClick: (Post) -> Unit
) : RecyclerView.Adapter<PostViewHolder>() {

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
            onLikeClick(post)
        }

        holder.commentButton.setOnClickListener {
            // Логика для обработки комментариев
        }
    }

    override fun getItemCount(): Int = posts.size

    fun updateList(newList: List<Post>) {
        val diffCallback = PostDiffCallback(posts, newList)
        val diffResult = DiffUtil.calculateDiff(diffCallback)
        posts = newList
        diffResult.dispatchUpdatesTo(this)
    }
}

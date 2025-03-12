package ru.isaev.mob_dev_lab1

import android.os.Bundle
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main)

        val postsList = findViewById<RecyclerView>(R.id.posts_list)
        postsList.setLayoutManager(LinearLayoutManager(this));

        val posts = listOf(
            Post("Первый постldsfjdskfjldsjfldks;fjdsjfkldsajfjdjfkldsajfjds;lkfjldsajfdsjlkfjalsdfjdsal;fjsdafjfkldsajfjds;lkfjldsajfdsjlkfjalsdfjdsal;fjsdafjfkldsajfjds;lkfjldsajfdsjlkfjalsdfjdsal;fjsdafjfkldsajfjds;lkfjldsajfdsjlkfjalsdfjdsal;fjsdafjfkldsajfjds;lkfjldsajfdsjlkfjalsdfjdsal;fjsdafs;lkfjldsajfdsjlkfjalsdfjdsal;fjsdaf", "https://images.unsplash.com/photo-1741557571786-e922da981949?q=80&w=2670&auto=format&fit=crop&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D", 120, 35),
            Post("Второй пост", "https://plus.unsplash.com/premium_photo-1667428818562-fc8379f23bfe?q=80&w=2454&auto=format&fit=crop&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D", 95, 18),
            Post("Третий пост", "https://images.unsplash.com/photo-1734903899558-463366085cb7?q=80&w=2671&auto=format&fit=crop&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D", 200, 50)
        )

        val adapter = PostsAdapter(posts)
        postsList.layoutManager = LinearLayoutManager(this)
        postsList.adapter = adapter


        val avatarUrl = "https://sun9-27.userapi.com/s/v1/ig2/JQgHnQ-kV45j1Yc6LeAud_fth4Bi1nSMmMGrwqX-OAEIQfjOPe0gPjvpqmiK1U9mntpaf0M82XkA75N99fU3INfQ.jpg?quality=95&crop=54,633,1172,1172&as=32x32,48x48,72x72,108x108,160x160,240x240,360x360,480x480,540x540,640x640,720x720,1080x1080&ava=1&u=R_ADy__AT3ZhCG3Lf7k6NeUab6v-RbVPtY31_qq3t60&cs=400x400"
        val avatarView = findViewById<ImageView>(R.id.avatar)
        Glide.with(this)
            .load(avatarUrl)
            .circleCrop()
            .placeholder(R.drawable.pc_avatar)
            .error(R.drawable.error)
            .into(avatarView)
    }
}

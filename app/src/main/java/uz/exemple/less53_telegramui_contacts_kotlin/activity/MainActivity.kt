package uz.exemple.less53_telegramui_contacts_kotlin.activity

import android.content.res.Resources
import android.graphics.Color
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.core.graphics.blue
import androidx.core.graphics.red
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.badge.BadgeDrawable
import com.google.android.material.bottomnavigation.BottomNavigationItemView
import com.google.android.material.bottomnavigation.BottomNavigationView
import uz.exemple.less53_telegramui_contacts_kotlin.R
import uz.exemple.less53_telegramui_contacts_kotlin.adapter.ChatAdapter
import uz.exemple.less53_telegramui_contacts_kotlin.model.Chat

class MainActivity : AppCompatActivity() {
    lateinit var recyclerView: RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initViews()
    }

    fun initViews(){
        recyclerView = findViewById<RecyclerView>(R.id.recyclerView)
        recyclerView.setLayoutManager(GridLayoutManager(this, 1))
        var navBar  = findViewById<BottomNavigationView>(R.id.bottom_navigation_view)
        var badge1= navBar.getOrCreateBadge(R.id.actionChats)
        badge1.isVisible = true
        badge1.number = 6
        badge1.badgeTextColor = Color.WHITE

        var badge2= navBar.getOrCreateBadge(R.id.settings)
        badge2.isVisible = true
        badge2.number = 1
        badge2.badgeTextColor = Color.WHITE

        refreshAdapter(getAllChats())
    }

    fun refreshAdapter(chats: ArrayList<Chat>) {
        val adapter = ChatAdapter(this, chats)
        recyclerView.adapter = adapter
    }

    fun getAllChats():ArrayList<Chat>{
        val chats: ArrayList<Chat> = ArrayList<Chat>()

        chats.add(Chat(R.drawable.ic_location_24, "Find People Nearby", "last sees recently"))
        chats.add(Chat(R.drawable.ic_person_add_24, "Invite Friends", "last sees recently"))
        chats.add(Chat(R.drawable.photo1, "Xushnud Boymurodov", "last sees recently"))
        chats.add(Chat(R.drawable.photo3, "Kamolaxon Nematjonova", "last sees recently"))
        chats.add(Chat(R.drawable.photo2, "Barnoxon Kabirova", "last sees recently"))
        chats.add(Chat(R.drawable.photo4, "Abdullatif Nematjonov", "last sees recently"))
        chats.add(Chat(R.drawable.photo1, "Xushnud Boymurodov", "last sees recently"))
        chats.add(Chat(R.drawable.photo3, "Kamolaxon Nematjonova", "last sees recently"))
        chats.add(Chat(R.drawable.photo2, "Barnoxon Kabirova", "last sees recently"))
        chats.add(Chat(R.drawable.photo4, "Abdullatif Nematjonov", "last sees recently"))
        chats.add(Chat(R.drawable.photo1, "Xushnud Boymurodov", "last sees recently"))
        chats.add(Chat(R.drawable.photo3, "Kamolaxon Nematjonova", "last sees recently"))
        chats.add(Chat(R.drawable.photo2, "Barnoxon Kabirova", "last sees recently"))
        chats.add(Chat(R.drawable.photo4, "Abdullatif Nematjonov", "last sees recently"))
        chats.add(Chat(R.drawable.photo1, "Xushnud Boymurodov", "last sees recently"))
        chats.add(Chat(R.drawable.photo3, "Kamolaxon Nematjonova", "last sees recently"))
        chats.add(Chat(R.drawable.photo2, "Barnoxon Kabirova", "last sees recently"))
        chats.add(Chat(R.drawable.photo4, "Abdullatif Nematjonov", "last sees recently"))
        return chats
    }
}
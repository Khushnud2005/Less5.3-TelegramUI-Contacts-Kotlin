package uz.exemple.less53_telegramui_contacts_kotlin.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

import com.google.android.material.imageview.ShapeableImageView
import uz.exemple.less53_telegramui_contacts_kotlin.R
import uz.exemple.less53_telegramui_contacts_kotlin.model.Chat

class ChatAdapter(var context: Context, var items: ArrayList<Chat>) :
    RecyclerView.Adapter<ChatAdapter.ViewHolder>() {

    override fun getItemCount(): Int {
        return items.size
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view =
            LayoutInflater.from(parent.context).inflate(R.layout.item_chat_view, parent, false)

        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ChatAdapter.ViewHolder, position: Int) {
        val chat = items[position]
        holder.iv_profile.setImageResource(chat.profile)
        holder.tv_fullname.text = chat.fullname
        holder.tv_message.text = chat.messsage
        if (position < 2){
            holder.tv_message.visibility = View.GONE

        }

    }

    class ViewHolder(var view: View) : RecyclerView.ViewHolder(view) {
        var iv_profile: ShapeableImageView
        var tv_fullname: TextView
        var tv_message: TextView

        init {
            iv_profile = view.findViewById(R.id.iv_profile)
            tv_fullname = view.findViewById(R.id.tv_fullname)
            tv_message = view.findViewById(R.id.tv_message)
        }
    }

}
package com.giovanna.events

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.giovanna.events.models.Event
import kotlinx.android.synthetic.main.item_event.view.*

class EventItemAdapter(
        private val list: List<Event>
) : RecyclerView.Adapter<EventItemAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context)
                .inflate(R.layout.item_event, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val item = list[position]

        holder.tvTitle.text = item.title
    }

    override fun getItemCount(): Int {
        return list.size
    }

    inner class ViewHolder(mView: View) : RecyclerView.ViewHolder(mView) {
        val tvTitle = mView.tvTitle!!
    }

}
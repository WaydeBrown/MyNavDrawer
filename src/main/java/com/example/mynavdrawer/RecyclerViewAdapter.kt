package com.example.mynavdrawer

import android.support.v7.widget.RecyclerView
import android.util.Log
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.list_item_newly_added.view.*


class RecyclerViewAdapter(private val myDataset: Array<String>) : RecyclerView.Adapter<RecyclerViewAdapter.MyViewHolder>()  {


    override fun onCreateViewHolder(parent: ViewGroup, viewTyp: Int): MyViewHolder {
        val inflatedView = parent.inflate(R.layout.list_item_newly_added, false)
        return MyViewHolder(inflatedView)

    }

    /*
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.fragment_item, parent, false)
        return ViewHolder(view)
    }
    */

    override fun getItemCount() = myDataset.size


    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val item = myDataset[position]
        holder.bindItems(item)
    }

    class MyViewHolder(v: View) : RecyclerView.ViewHolder(v), View.OnClickListener {
        //2
        private var view: View = v
        private var item: String = ""

        //3
        init {
            v.setOnClickListener(this)
        }

        //4
        override fun onClick(v: View) {


        }

        companion object {
            //5
            private val ITEM_KEY = "ITEM"
        }

        fun bindItems(item: String) {
            this.item = item
            //Picasso.with(view.context).load(photo.url).into(view.itemImage)
            view.textView2.text = item

        }
    }
}



/*
class RecyclerViewAdapter(private val myDataset: Array<String>) :

    RecyclerView.Adapter<RecyclerViewAdapter.MyViewHolder>() {

    // Provide a reference to the views for each data item
    // Complex data items may need more than one view per item, and
    // you provide access to all the views for a data item in a view holder.
    // Each data item is just a string in this case that is shown in a TextView.
    // class MyViewHolder(val textView: TextView) : RecyclerView.ViewHolder(textView)


    // Create new views (invoked by the layout manager)
    override fun onCreateViewHolder(parent: ViewGroup,
                                    viewType: Int): MyAdapter.MyViewHolder {
        // create a new view
        val textView = LayoutInflater.from(parent.context)
            .inflate(R.layout.my_text_view, parent, false) as TextView
        // set the view's size, margins, paddings and layout parameters
        ...
        return MyViewHolder(textView)
    }

    // Replace the contents of a view (invoked by the layout manager)
    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        // - get element from your dataset at this position
        // - replace the contents of the view with that element
        holder.textView.text = myDataset[position]
    }

    // Return the size of your dataset (invoked by the layout manager)
    override fun getItemCount() = myDataset.size
}
*/
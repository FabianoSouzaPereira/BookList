package br.com.seventh.bookslist

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import br.com.seventh.bookslist.model.book.Book
import br.com.seventh.bookslist.model.book.Item

class BooksListAdapter(context: Context, private val clickListener: (Book) -> Unit) :
    RecyclerView.Adapter<BooksListAdapter.ViewHolder>() {

    private val mContext: Context = context
    var mTableViewData: MutableList<Item> = arrayListOf()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view =
            LayoutInflater.from(mContext)
                .inflate(R.layout.item_book, parent, false)

        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val data = mTableViewData[position]
        holder.title.text = data.volumeInfo?.title
        holder.subtitle.text = data.volumeInfo?.subtitle
      //  holder.authors.text = data.volumeInfo?.authors?.get(position) ?: ""


        holder.itemView.setOnClickListener {

            return@setOnClickListener
        }
    }

    override fun getItemCount(): Int {
        return mTableViewData.size
    }

    fun setData(newData: MutableList<Item>) {
        mTableViewData.clear()
        mTableViewData.addAll(newData)
        this.notifyDataSetChanged()
    }

    fun updateLayout() {
        this.notifyDataSetChanged()
    }


    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val title: TextView = itemView.findViewById(R.id.edtTitle)
        val subtitle: TextView = itemView.findViewById(R.id.edtSubTitle)
      //  val authors: TextView = itemView.findViewById(R.id.edtAuthors)
    }
}
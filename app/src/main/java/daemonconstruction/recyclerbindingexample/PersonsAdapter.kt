package daemonconstruction.recyclerbindingexample

import android.databinding.DataBindingUtil
import android.databinding.ViewDataBinding
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

/**
 * Created by devarshi.k on 27/09/17.
 */

class PersonsAdapter(private var persons: Array<Person>) : RecyclerView.Adapter<PersonsAdapter.PersonViewHolder>() {
    override fun onBindViewHolder(holder: PersonViewHolder?, position: Int) {
        val person = persons[position]

        if (holder != null) {
            holder.binding.setVariable(BR.person, person)
            holder.binding.executePendingBindings()
        }
    }

    override fun getItemCount(): Int {
        return persons.size
    }

    override fun onCreateViewHolder(parent: ViewGroup?, viewType: Int): PersonViewHolder {
        val itemView = LayoutInflater.from(parent!!.context).inflate(R.layout.list_item_person, parent, false)
        return PersonViewHolder(itemView, DataBindingUtil.bind(itemView))
    }

    class PersonViewHolder(itemView: View, val binding: ViewDataBinding) : RecyclerView.ViewHolder(itemView) { }
}
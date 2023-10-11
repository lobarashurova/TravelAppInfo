package uz.mlsoft.travelmyappinfo.adapters

import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.FrameLayout
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import uz.mlsoft.travelmyappinfo.R
import uz.mlsoft.travelmyappinfo.data.DataCountry


class SearchAdapter : RecyclerView.Adapter<SearchAdapter.MyHolder>() {
    private var listener: ((String) -> Unit)? = null
    private var countryList = ArrayList<DataCountry>()

    @SuppressLint("NotifyDataSetChanged")
    fun submitList(list: List<DataCountry>) {
        countryList.clear()
        countryList.addAll(list)
        notifyDataSetChanged()
    }

    fun click(l: (String) -> Unit) {
        listener = l
    }

    @SuppressLint("ResourceType")
    inner class MyHolder(view: View) : RecyclerView.ViewHolder(view) {

        private val name = view.findViewById<TextView>(R.id.text_item_city)
        private val image = view.findViewById<ImageView>(R.id.img_item_)
        private val frame = view.findViewById<FrameLayout>(R.id.Frame10)

        init {
            frame.setOnClickListener {
                listener?.invoke(name.tag.toString())
            }

        }

        @SuppressLint("SetTextI18n")
        fun bin(position: Int) {
            name.text =
                "${countryList[position].country_name}\n${countryList[position].location_name}"
            name.tag = countryList[position].country_name
//            image.setImageResource(countryList[position].image1)
//            Log.d("TTT", "width: ${image.width}")
//            Log.d("TTT", "height: ${image.height}")
            Glide.with(image).load(countryList[position].image1).override(440, 633).into(image)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.country_item, parent, false)
        return MyHolder(view)
    }

    override fun onBindViewHolder(holder: MyHolder, position: Int) {
        holder.bin(position)
    }

    override fun getItemCount() = countryList.size
}
package tripath.com.kotlinsamplegroupapplicatoin.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.BaseAdapter
import android.widget.TextView
import tripath.com.kotlinsamplegroupapplicatoin.R
import tripath.com.kotlinsamplegroupapplicatoin.data.KActivityItem

/**
 * Created by SSLAB on 2017-08-18.
 */
open class KActivityListAdapter : ArrayAdapter<KActivityItem>{


    constructor(context: Context?, objects: Array<out KActivityItem>?) : super(context, -1, -1, objects)
    constructor(context: Context?, objects: MutableList<KActivityItem>?) : super(context, -1, -1, objects)


    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {

        var view : View
        if(convertView == null){
            view = LayoutInflater.from(context).inflate(R.layout.list_item_activity, null)
        }else {
            view = convertView
        }
        val item = getItem(position)

        if (item != null ) {
            val header = view.findViewById(R.id.header) as TextView
            val content = view.findViewById(R.id.content) as TextView

            header.setText(item.aClass)
            content.setText(item.content)
        }

        return view
    }

    override fun getItem(position: Int): KActivityItem {
        return super.getItem(position)
    }

    override fun getItemId(position: Int): Long {
        return position.toLong()
    }

    override fun getCount(): Int {
        return super.getCount()
    }


}
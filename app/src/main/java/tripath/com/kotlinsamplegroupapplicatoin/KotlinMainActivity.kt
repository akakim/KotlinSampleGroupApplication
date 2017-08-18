package tripath.com.kotlinsamplegroupapplicatoin

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.AdapterView
import android.widget.ListView
import tripath.com.kotlinsamplegroupapplicatoin.adapter.KActivityListAdapter
import tripath.com.kotlinsamplegroupapplicatoin.data.KActivityItem
import kotlin.reflect.KClass

class KotlinMainActivity : AppCompatActivity(){

    companion object {
        val TAG = KotlinMainActivity.javaClass.simpleName
    }

    lateinit var listview : ListView
    lateinit var listAdapter : KActivityListAdapter
    lateinit var arrayItem : ArrayList<KActivityItem>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_kotlin_main)

        listview = findViewById(R.id.mainListView) as ListView
        arrayItem = ArrayList<KActivityItem>()

        arrayItem.add( KActivityItem( RetrofitExample::class.simpleName, RetrofitExample::class.qualifiedName ,"레트로핏 샘플 놓일예정" ))

        listAdapter = KActivityListAdapter(this,arrayItem)

        listview.adapter =listAdapter
        listview.setOnItemClickListener {
            parent, view, position, id ->


            val i = Intent( applicationContext , classLoader.loadClass(arrayItem.get(position).aClassCanonicalName))
            startActivity( i )
        }
        listAdapter.notifyDataSetChanged()
    }

}

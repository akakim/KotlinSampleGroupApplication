package tripath.com.kotlinsamplegroupapplicatoin.data

import android.app.Activity
import kotlin.reflect.KClass

/**
 * Created by SSLAB on 2017-08-18.
 */
open class KActivityItem{


    val aClass              : String?
    val aClassCanonicalName : String?
    val content             : String

    constructor(aClass : String?, aClassCanonicalName : String? ,content :String ){
        this.aClass = aClass
        this.aClassCanonicalName = aClassCanonicalName
        this.content = content

    }




}
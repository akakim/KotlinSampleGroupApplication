package tripath.com.kotlinsamplegroupapplicatoin

import android.app.FragmentManager
import android.graphics.drawable.Drawable
import android.graphics.drawable.DrawableContainer
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.view.View
import android.widget.*
import tripath.com.kotlinsamplegroupapplicatoin.R

class HelloKotlin : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_hello_kotlin)

        val showToast = findViewById( R.id.toastShow ) as Button
        val edOperand1 = findViewById( R.id.edOperand1 ) as EditText
        val edOperand2 = findViewById( R.id.edOperand2 ) as EditText

        val buttonContainerLayout = findViewById( R.id.buttonContainerLayout ) as GridLayout
        val plusButton = findViewById( R.id.plusButton ) as Button
        val minusButton = findViewById( R.id.minusButton ) as Button
        val multiplyButton = findViewById( R.id.multiplyButton ) as Button
        val dividerButton = findViewById( R.id.dividerButton ) as Button
        val finish = findViewById( R.id.finish ) as Button


        val plusExtraButton = findViewById( R.id.plusExtraButton) as Button


        val resultTextView = findViewById( R.id.resultTextView ) as TextView


        plusExtraButton.setOnClickListener( View.OnClickListener {
            val buttonSample = Button(baseContext)

            buttonSample.setText("hello added")

            buttonContainerLayout.addView( buttonSample );

        })
        showToast.setOnClickListener( View.OnClickListener {

            Toast.makeText(this,"ToastClicked edOperand1 : "+ edOperand1.text ,Toast.LENGTH_SHORT).show();
        })
        plusButton.setOnClickListener(View.OnClickListener {
            view -> resultTextView.text = ( getNumOperand(edOperand1) + getNumOperand(edOperand2) ).toString()
        })

        minusButton.setOnClickListener(View.OnClickListener {
            view -> resultTextView.text = ( getNumOperand(edOperand1) - getNumOperand(edOperand2) ).toString()
        })

        multiplyButton.setOnClickListener(View.OnClickListener {
            view -> resultTextView.text = ( getNumOperand(edOperand1) * getNumOperand(edOperand2) ).toString()
        })

        dividerButton.setOnClickListener(View.OnClickListener {
            view -> resultTextView.text = ( getNumOperand(edOperand1) / getNumOperand(edOperand2) ).toString()
        })

        finish.setOnClickListener(View.OnClickListener {
            finish()
        })



//        showToast.setOnClickListener(
//              this.finish();
//        );

    }

    fun getNumOperand(view: EditText) :Int{
//        val input_num1 =  findViewById( R.id.edOperand1 ) as EditText
        return Integer.getInteger(view.text.toString())
    }



}

package fukuoka.masado.techacademy.calcapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_calc_app2.*
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_main.view.*

class CalcApp2 : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_calc_app2)

        val value1 = intent.getIntExtra("VALUE1", 0)
        val value2 = intent.getIntExtra("VALUE2", 0)
        textView1.text = "足し算結果: ${value1 + value2}"

        val value3 = intent.getIntExtra("VALUE3",0)
        val value4 = intent.getIntExtra("VALUE4", 0)
        textView2.text = "引き算結果: ${value3 - value4}"

        val value5 = intent.getIntExtra("VALUE5",0)
        val value6 = intent.getIntExtra("VALUE6", 0)
        textView3.text = "掛け算結果: ${value5 * value6}"

        val value7 = intent.getIntExtra("VALUE7",0)
        val value8 = intent.getIntExtra("VALUE8", 0)
        textView4.text = "割り算結果: ${value7 / value8}"

    }


}

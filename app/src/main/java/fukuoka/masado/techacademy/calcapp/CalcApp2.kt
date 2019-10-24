package fukuoka.masado.techacademy.calcapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_calc_app2.*
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_main.view.*

class CalcApp2 : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_calc_app2)

        val value1 = intent.getDoubleExtra("VALUE1", 0.00)
        val value2 = intent.getDoubleExtra("VALUE2", 0.00)
        textView1.text = "足し算結果: ${value1 + value2}"

        val value3 = intent.getDoubleExtra("VALUE3",0.00)
        val value4 = intent.getDoubleExtra("VALUE4", 0.00)
        textView2.text = "引き算結果: ${value3 - value4}"

        val value5 = intent.getDoubleExtra("VALUE5",0.00)
        val value6 = intent.getDoubleExtra("VALUE6", 0.00)
        textView3.text = "掛け算結果: ${value5 * value6}"

        val value7 = intent.getDoubleExtra("VALUE7",0.00)
        val value8 = intent.getDoubleExtra("VALUE8", 0.00)

        if(value7 > -1 && value7 < 1 || value8 > -1 && value8 < 1) {
            textView4.text = "割り算結果:ゼロ以外の数字で計算してください。"
        }else {
            textView4.text = "割り算結果: ${value7 / value8}"
        }




    }
}


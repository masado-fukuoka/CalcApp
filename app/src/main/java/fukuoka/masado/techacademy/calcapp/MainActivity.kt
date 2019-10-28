package fukuoka.masado.techacademy.calcapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import kotlinx.android.synthetic.main.activity_calc_app2.*
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_main.view.*

class MainActivity : AppCompatActivity(),View.OnClickListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        plus.setOnClickListener {
            if (editText1.text.isEmpty() || editText2.text.isEmpty()) {
                dentaku.text = "数値を入力してください。"
            } else {
                val intent1 = Intent(this, CalcApp2::class.java)
                intent1.putExtra("VALUE1", editText1.text.toString().toDouble())
                intent1.putExtra("VALUE2", editText2.text.toString().toDouble())
                intent1.putExtra("RESULT", editText1.text.toString().toDouble() + editText2.text.toString().toDouble())
                startActivity(intent1)

                ///val value1 = intent.getDoubleExtra("VALUE1", 0.00)
                ///val value2 = intent.getDoubleExtra("VALUE2", 0.00)
                ///textView1.text = "足し算結果:${value1 + value2}"


            }
        }

        minus.setOnClickListener {
            if (editText1.text.isEmpty() || editText2.text.isEmpty()) {
                dentaku.text = "数値を入力してください。"
            } else {
                val intent2 = Intent(this, CalcApp2::class.java)
                intent2.putExtra("VALUE1", editText1.text.toString().toDouble())
                intent2.putExtra("VALUE2", editText2.text.toString().toDouble())
                intent2.putExtra("RESULT", editText1.text.toString().toDouble() - editText2.text.toString().toDouble())
                startActivity(intent2)

            }
        }

        multiply.setOnClickListener {
            if (editText1.text.isEmpty() || editText2.text.isEmpty()) {
                dentaku.text = "数値を入力してください。"
            } else {
                val intent3 = Intent(this, CalcApp2::class.java)
                intent3.putExtra("VALUE1", editText1.text.toString().toDouble())
                intent3.putExtra("VALUE2", editText2.text.toString().toDouble())
                intent3.putExtra("RESULT", editText1.text.toString().toDouble() * editText2.text.toString().toDouble())
                startActivity(intent3)
            }
        }

        divide.setOnClickListener {
            if (editText1.text.isEmpty() || editText2.text.isEmpty()) {
                dentaku.text = "数値を入力してください。"
            } else{
                val intent4 = Intent(this, CalcApp2::class.java)
                intent4.putExtra("VALUE1", editText1.text.toString().toDouble())
                intent4.putExtra("VALUE2", editText2.text.toString().toDouble())
                intent4.putExtra("RESULT", editText1.text.toString().toDouble() / editText2.text.toString().toDouble())
                startActivity(intent4)
            }
        }



    }




    override fun onClick(v: View?){
    }








}















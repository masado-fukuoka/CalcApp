

package fukuoka.masado.techacademy.calcapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_calc_app2.*
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_main.view.*

class MainActivity : AppCompatActivity(),View.OnClickListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        plus.setOnClickListener {

            if (editText1.text.isEmpty()||editText2.text.isEmpty()) {
                dentaku.text = "数値を入力してください。"
            } else {
                val intent = Intent(this, CalcApp2::class.java)
                intent.putExtra("VALUE1", editText1.text.toString().toDouble())
                intent.putExtra("VALUE2", editText2.text.toString().toDouble())
                startActivity(intent)
            }
        }

        minus.setOnClickListener {
            if (editText1.text.isEmpty() || editText2.text.isEmpty()) {
                dentaku.text = "数値を入力してください。"
            } else {
                val intent2 = Intent(this, CalcApp2::class.java)
                intent2.putExtra("VALUE3", editText1.text.toString().toDouble())
                intent2.putExtra("VALUE4", editText2.text.toString().toDouble())
                startActivity(intent2)
            }
        }

        multiply.setOnClickListener {
            if (editText1.text.isEmpty() || editText2.text.isEmpty()) {
                dentaku.text = "数値を入力してください。"
            } else {
                val intent3 = Intent(this, CalcApp2::class.java)
                intent3.putExtra("VALUE5", editText1.text.toString().toDouble())
                intent3.putExtra("VALUE6", editText2.text.toString().toDouble())
                startActivity(intent3)
            }
        }

        divide.setOnClickListener {
            if (editText1.text.isEmpty() || editText2.text.isEmpty()) {
                dentaku.text = "数値を入力してください。"
            } else{
                val intent4 = Intent(this, CalcApp2::class.java)
                    intent4.putExtra("VALUE7", editText1.text.toString().toDouble())
                    intent4.putExtra("VALUE8", editText2.text.toString().toDouble())
                    startActivity(intent4)
            }
        }


    }




    override fun onClick(v: View?){
    }








}















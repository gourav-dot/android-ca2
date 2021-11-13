package first.gourav.loginpage

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.CheckBox
import android.widget.RadioButton
import android.widget.Toast

class MainActivity2 : AppCompatActivity() {
    lateinit var check : CheckBox
    lateinit var R1 : RadioButton
    lateinit var R2 : RadioButton
    lateinit var btn : Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        check = findViewById(R.id.checkbox)
        R1 = findViewById(R.id.radio1)
        R2 = findViewById(R.id.radio2)
        btn = findViewById(R.id.button)
         var str : String =""
        btn.setOnClickListener {

            if (check.isChecked()){
                str = "checkbox clicked"
        }
            if (R1.isChecked()){
                str = "female is selected"}
            if (R2.isChecked()){
                str = "male is selected "}
            Toast.makeText( this,str,Toast.LENGTH_LONG).show()

        }



    }
}
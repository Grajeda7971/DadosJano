package net.ivanvega.mirollera

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    lateinit var boton: Button
    lateinit var lbl: TextView
    lateinit var lbl2: TextView
    lateinit var img: ImageView
    lateinit var img2: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.layout_roller)


        lbl = findViewById(R.id.lblSaludo)
        lbl2 = findViewById(R.id.lblSaludo2)
        boton = findViewById(R.id.btnRoller)
        img = findViewById(R.id.imgRoller)
        img2= findViewById(R.id.imgRoller2)


        img.setImageDrawable(resources.getDrawable(R.drawable.dice_3))
        img2.setImageDrawable(resources.getDrawable(R.drawable.dice_6))

        boton.setOnClickListener {
            val al = diceRoller()
            val al2= diceRoller()

            Toast.makeText(
                applicationContext,
                "Boton presionado aleatorio " + al,
                Toast.LENGTH_LONG
            ).show()



            val idImagenAl = when (al){
                1 -> R.drawable.dice_1
                2 -> R.drawable.dice_2
                3 -> R.drawable.dice_3
                4 -> R.drawable.dice_4
                5 -> R.drawable.dice_5
                6 -> R.drawable.dice_6
                else -> R.drawable.empty_dice
            }
            //nombre del segundo dado
            val idImagenAl2 = when (al2){
                1 -> R.drawable.dice_1
                2 -> R.drawable.dice_2
                3 -> R.drawable.dice_3
                4 -> R.drawable.dice_4
                5 -> R.drawable.dice_5
                6 -> R.drawable.dice_6
                else -> R.drawable.empty_dice
            }

            img.setImageResource(idImagenAl)
            img2.setImageResource(idImagenAl2)

            lbl.text = al.toString()
            lbl2.text = al2.toString()

        }
    }

    fun diceRoller () : Int {
        return (1..6).random()
    }


    //funcion para random del segundo dado
    fun diceRoller2 () : Int {
        return (1..6).random()
    }

}
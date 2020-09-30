package de.jensklingenberg.kmmcalc2.androidApp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import de.jensklingenberg.kmmcalc2.shared.Greeting
import android.widget.TextView
import de.jensklingenberg.kmmcalc2.shared.parseAndCompute

fun greet(): String {
    return Greeting().greeting()
}

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val resultView = findViewById<TextView>(R.id.computed_result)

        val input = findViewById<EditText>(R.id.input)
        input.setOnEditorActionListener { input, _, _ ->
            val inputText = input.text.toString()
            val result = parseAndCompute(inputText).expression
            with(resultView) {
                text = if (result != null) inputText + " = " + result.toString() else "Unable to parse $inputText"
            }
            true
        }
    }

}
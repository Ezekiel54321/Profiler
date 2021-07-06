package com.ezekiel.profiler

import android.os.Bundle
import android.widget.Adapter
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.RecyclerView
import com.ezekiel.profiler.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private lateinit var myAdapter: MyAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val itemView: List<ModelClass> = listOf(
            ModelClass(
            R.drawable.boii, "John Moses","fashion rocks"
        ),
            ModelClass(
            R.drawable.boy," Kalu James", "impress me"),ModelClass(
            R.drawable.gir," Sofia Queen", "Overcome"),ModelClass(
            R.drawable.boyy,"Kelvin Samuel ", "Mastery and discipline"),ModelClass(
            R.drawable.girl," Vivian Kwame", "win at all cost"),ModelClass(
            R.drawable.girl," Mary Crown", "Golden step"),ModelClass(
            R.drawable.boyy," Jones Obayome", "try and try again"),ModelClass(
            R.drawable.girr," Kalu James", "finally!"),ModelClass(
            R.drawable.girrr," Kalu James", "impressive"),ModelClass(
            R.drawable.boyyy," Kalu James", "determination"),ModelClass(
            R.drawable.boi," Kalu James", "french"),ModelClass(
            R.drawable.boii," Kalu James", "explore the moon"),ModelClass(
            R.drawable.girrrr," Kalu James", "Doge is gold"),ModelClass(
            R.drawable.girrrrr," Kalu James", "digging through"),ModelClass(
            R.drawable.boiii," Kalu James", "keep moving"),ModelClass(
            R.drawable.girrrrr," Kalu James", "correction"),ModelClass(
            R.drawable.boyyyyy," Kalu James", "foodie"),ModelClass(
            R.drawable.boyyy," Kalu James", "fire to the rain"),ModelClass(
            R.drawable.girl," Kalu James", "20 x 20"),ModelClass(
            R.drawable.gir," Kalu James", "be not decieved"),ModelClass(
            R.drawable.girrrr," Kalu James", "climb over"),ModelClass(
            R.drawable.boy," Kalu James", "impress me"),ModelClass(
            R.drawable.boy," Kalu James", "impress me"),ModelClass(
            R.drawable.boy," Kalu James", "impress me"),
        )
        myAdapter = MyAdapter(itemView)
        binding.recyclerid.adapter = myAdapter

    }

}


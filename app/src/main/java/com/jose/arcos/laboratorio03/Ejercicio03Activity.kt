package com.jose.arcos.laboratorio03

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import android.widget.TextView
import androidx.cardview.widget.CardView
class Ejercicio03Activity : AppCompatActivity() {

    private lateinit var edtImage:EditText
    private lateinit var edtTitle:EditText
    private lateinit var edtBand:EditText
    private lateinit var edtTime:EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ejercicio03)

        val btnSave = findViewById<Button>(R.id.btnSave)

        edtImage = findViewById<EditText>(R.id.edtImage)
        edtTitle = findViewById<EditText>(R.id.edtTitle)
        edtBand = findViewById<EditText>(R.id.edtNameBand)
        edtTime = findViewById<EditText>(R.id.edtTime)

        val cvMusic1 = findViewById<CardView>(R.id.cvMusic1)
        val imvMusic1 = findViewById<ImageView>(R.id.imvMusic1)
        val tvnameSong1 = findViewById<TextView>(R.id.tvNameSong1)
        val tvNameBand1 = findViewById<TextView>(R.id.tvNameBand1)
        val tvTimeSong1 = findViewById<TextView>(R.id.tvTimeSong1)

        val cvMusic2 = findViewById<CardView>(R.id.cvMusic2)
        val imvMusic2 = findViewById<ImageView>(R.id.imvMusic2)
        val tvnameSong2 = findViewById<TextView>(R.id.tvNameSong2)
        val tvNameBand2 = findViewById<TextView>(R.id.tvNameBand2)
        val tvTimeSong2 = findViewById<TextView>(R.id.tvTimeSong2)

        val cvMusic3 = findViewById<CardView>(R.id.cvMusic3)
        val imvMusic3 = findViewById<ImageView>(R.id.imvMusic3)
        val tvnameSong3 = findViewById<TextView>(R.id.tvNameSong3)
        val tvNameBand3 = findViewById<TextView>(R.id.tvNameBand3)
        val tvTimeSong3 = findViewById<TextView>(R.id.tvTimeSong3)

        val cvMusic4 = findViewById<CardView>(R.id.cvMusic4)
        val imvMusic4 = findViewById<ImageView>(R.id.imvMusic4)
        val tvnameSong4 = findViewById<TextView>(R.id.tvNameSong4)
        val tvNameBand4 = findViewById<TextView>(R.id.tvNameBand4)
        val tvTimeSong4 = findViewById<TextView>(R.id.tvTimeSong4)

        val cvMusic5 = findViewById<CardView>(R.id.cvMusic5)
        val imvMusic5 = findViewById<ImageView>(R.id.imvMusic5)
        val tvnameSong5 = findViewById<TextView>(R.id.tvNameSong5)
        val tvNameBand5 = findViewById<TextView>(R.id.tvNameBand5)
        val tvTimeSong5 = findViewById<TextView>(R.id.tvTimeSong5)

        val cvMusic6 = findViewById<CardView>(R.id.cvMusic6)
        val imvMusic6 = findViewById<ImageView>(R.id.imvMusic6)
        val tvnameSong6 = findViewById<TextView>(R.id.tvNameSong6)
        val tvNameBand6 = findViewById<TextView>(R.id.tvNameBand6)
        val tvTimeSong6 = findViewById<TextView>(R.id.tvTimeSong6)

        btnSave.setOnClickListener {

            var image = edtImage.text

            var uriImage = "@drawable/$image"

            var imageId = getResources().getIdentifier(uriImage, null, getPackageName());

            //imvMusic1.setImageDrawable(resources.getDrawable(imageId))

            var title = edtTitle.text

            var band = edtBand.text

            var time = edtTime.text


            when (image.toString()) {
                "img_armonia10" -> {
                    tvnameSong1.text = title
                    tvNameBand1.text = band
                    tvTimeSong1.text = time
                    val imageView1 = findViewById<ImageView>(R.id.imvMusic1)
                    imageView1.setImageDrawable(resources.getDrawable(imageId))
                    val cardView1 = findViewById<CardView>(R.id.cvMusic1)
                    cardView1.visibility = View.VISIBLE
                }
                "img_cagetheelephant" -> {
                    tvnameSong2.text = title
                    tvNameBand2.text = band
                    tvTimeSong2.text = time
                    val imageView2 = findViewById<ImageView>(R.id.imvMusic2)
                    imageView2.setImageDrawable(resources.getDrawable(imageId))
                    val cardView2 = findViewById<CardView>(R.id.cvMusic2)
                    cardView2.visibility = View.VISIBLE
                }
                "img_falloutboys" -> {
                    tvnameSong3.text = title
                    tvNameBand3.text = band
                    tvTimeSong3.text = time
                    val imageView3 = findViewById<ImageView>(R.id.imvMusic3)
                    imageView3.setImageDrawable(resources.getDrawable(imageId))
                    val cardView3 = findViewById<CardView>(R.id.cvMusic3)
                    cardView3.visibility = View.VISIBLE
                }
                "img_imposible" -> {
                    tvnameSong4.text = title
                    tvNameBand4.text = band
                    tvTimeSong4.text = time
                    val imageView4 = findViewById<ImageView>(R.id.imvMusic4)
                    imageView4.setImageDrawable(resources.getDrawable(imageId))
                    val cardView4 = findViewById<CardView>(R.id.cvMusic4)
                    cardView4.visibility = View.VISIBLE
                }
                "img_pinkfloyd" -> {
                    tvnameSong5.text = title
                    tvNameBand5.text = band
                    tvTimeSong5.text = time
                    val imageView5 = findViewById<ImageView>(R.id.imvMusic5)
                    imageView5.setImageDrawable(resources.getDrawable(imageId))
                    val cardView5 = findViewById<CardView>(R.id.cvMusic5)
                    cardView5.visibility = View.VISIBLE
                }
                "img_raycharles" -> {
                    tvnameSong6.text = title
                    tvNameBand6.text = band
                    tvTimeSong6.text = time
                    val imageView6 = findViewById<ImageView>(R.id.imvMusic6)
                    imageView6.setImageDrawable(resources.getDrawable(imageId))
                    val cardView6 = findViewById<CardView>(R.id.cvMusic6)
                    cardView6.visibility = View.VISIBLE
                }
                else -> {
                    // Handle the case when image doesn't match any of the predefined values
                }
            }
            /*
            if (image.toString()=="img_armonia10"){
                tvnameSong1.text = title
                tvNameBand1.text = band
                tvTimeSong1.text = time
                imvMusic1.setImageDrawable(resources.getDrawable(imageId))
                cvMusic1.visibility = View.VISIBLE
            }
            else if (image.toString()=="img_cagetheelephant"){
                tvnameSong2.text = title
                tvNameBand2.text = band
                tvTimeSong2.text = time
                imvMusic2.setImageDrawable(resources.getDrawable(imageId))
                cvMusic2.visibility = View.VISIBLE
            }
            else if (image.toString()=="img_falloutboys"){
                tvnameSong3.text = title
                tvNameBand3.text = band
                tvTimeSong3.text = time
                imvMusic3.setImageDrawable(resources.getDrawable(imageId))
                cvMusic3.visibility = View.VISIBLE
            }
            else if (image.toString()=="img_imposible"){
                tvnameSong4.text = title
                tvNameBand4.text = band
                tvTimeSong4.text = time
                imvMusic4.setImageDrawable(resources.getDrawable(imageId))
                cvMusic4.visibility = View.VISIBLE
            }
            else if (image.toString()=="img_pinkfloyd"){
                tvnameSong5.text = title
                tvNameBand5.text = band
                tvTimeSong5.text = time
                imvMusic5.setImageDrawable(resources.getDrawable(imageId))
                cvMusic5.visibility = View.VISIBLE
            }
            else if (image.toString()=="img_raycharles"){
                tvnameSong6.text = title
                tvNameBand6.text = band
                tvTimeSong6.text = time
                imvMusic6.setImageDrawable(resources.getDrawable(imageId))
                cvMusic6.visibility = View.VISIBLE
            }
            */
            clearForm()
        }
    }

    private fun clearForm(){
        edtImage.text.clear()
        edtTitle.text.clear()
        edtBand.text.clear()
        edtTime.text.clear()
    }
}

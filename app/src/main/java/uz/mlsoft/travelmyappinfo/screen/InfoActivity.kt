package uz.mlsoft.travelmyappinfo.screen

import android.annotation.SuppressLint
import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.AppCompatImageView
import com.google.android.material.appbar.AppBarLayout
import com.google.android.material.appbar.CollapsingToolbarLayout
import uz.mlsoft.travelmyappinfo.R
import uz.mlsoft.travelmyappinfo.data.DataCountry

class InfoActivity : AppCompatActivity() {
    @SuppressLint("NewApi")
    override fun onCreate(savedInstanceState: Bundle?) {
        application.setTheme(R.style.Base_Theme_TravelAppInfo)
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_info)
        val item = intent.getSerializableExtra("itemCountry") as DataCountry

        findViewById<ImageView>(R.id.img_country).setImageResource(item.image2)
        val location = findViewById<TextView>(R.id.tv_location)
        location.text = item.location_name
        findViewById<TextView>(R.id.tv_info).text = item.information

        val collapsingToolbar = findViewById<CollapsingToolbarLayout>(R.id.textCollapsing)
        collapsingToolbar.title = item.country_name
        findViewById<AppCompatImageView>(R.id.back_btn).setOnClickListener {
            finish()
        }

        location.setOnClickListener {
            val mapUri = Uri.parse("geo:0,0?q=${item.latitute},${item.longitude}")
            val mapIntent = Intent(Intent.ACTION_VIEW, mapUri)
            mapIntent.setPackage("com.google.android.apps.maps")
            startActivity(mapIntent)
        }

        findViewById<AppBarLayout>(R.id.appBar).addOnOffsetChangedListener { _, offset ->
            if (offset == 0) location.visibility = View.VISIBLE
            else location.visibility = View.GONE
        }
    }
}
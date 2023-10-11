package uz.mlsoft.travelmyappinfo.screen

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import uz.mlsoft.travelmyappinfo.R
import uz.mlsoft.travelmyappinfo.country_mvp.CountryActivity

@SuppressLint("CustomSplashScreen")
class SplashActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        Log.d("TTT", "onCreate: SPLASH ")
        application.setTheme(R.style.Base_Theme_TravelAppInfo)
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash2)
        Handler().postDelayed({
            startActivity(
                Intent(this, CountryActivity::class.java)
            )
            finish()
        }, 3000)

    }
}
package uz.mlsoft.travelmyappinfo.screen

import android.content.Intent
import android.os.Build
import android.os.Bundle
import android.text.Html
import androidx.appcompat.app.AppCompatActivity
import uz.mlsoft.travelmyappinfo.R
import uz.mlsoft.travelmyappinfo.country_mvp.CountryActivity
import uz.mlsoft.travelmyappinfo.databinding.ActivityAboutBinding


class AboutActivity : AppCompatActivity() {
    private lateinit var binding: ActivityAboutBinding
    private var content = "<div>\n" +
            "        <h1>\n" +
            "            Travel App\n" +
            "        </h1>\n" +
            "        \n" +
            "        <ul>\n" +
            "            <li>\n" +
            "                \tThis app was created by a coder girl who studied in gita academy. By using that app, you can learn more information about world top countires.\n" +
            "            </li> \n" +
            "            <li>\n" +
            "                \tIn addition to that you can easily search countries which you want and enjoy high quality images.\n" +
            "            </li> \n" +
            "            <li>\n" +
            "                \tFrom menu tab, you can share, rate and exit from this app. Please be sure, it is only informed to learn and use android components\n" +
            "            </li>\n" +
            "        </ul>\n" +
            "        <div>\n" +
            "            <h3>\n" +
            "                \tFramework\n" +
            "            </h3>\n" +
            "            <ul>\n" +
            "                <li style=\"list-style-type: none;\">\n" +
            "                    <b>\n" +
            "                        Android Studio\n" +
            "                    </b>\n" +
            "                </li>\n" +
            "                <li style=\"list-style-type: none;\">\n" +
            "                    <b>\n" +
            "                        kotlin\n" +
            "                    </b>\n" +
            "                </li>\n" +
            "                <li style=\"list-style-type: none;\">\n" +
            "                    <div>\n" +
            "                        <h2 > \n" +
            "                            Used technologies\n" +
            "                        </h2>\n" +
            "                        <ul>\n" +
            "                            <li>\n" +
            "                                MVP\n" +
            "                            </li>\n" +
            "                            <li>\n" +
            "                                Lottie animations\n" +
            "                            </li>\n" +
            "                            <li>\n" +
            "                                Search view\n" +
            "                            </li>\n" +
            "                        </ul>\n" +
            "                    </div>\n" +
            "                </li>\n" +
            "            </ul>\n" +
            "        </div>\n" +
            "    </div>"

    override fun onCreate(savedInstanceState: Bundle?) {
        application.setTheme(R.style.Base_Theme_TravelAppInfo)
        super.onCreate(savedInstanceState)
        binding = ActivityAboutBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val text = binding.descriptionText
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.N) {
            text.setText(Html.fromHtml(content, Html.FROM_HTML_MODE_LEGACY))
        } else text.setText(Html.fromHtml(content))

        binding.backImage.setOnClickListener {
            startActivity(Intent(this, CountryActivity::class.java))
            finish()
        }
    }


    @Deprecated("Deprecated in Java")
    override fun onBackPressed() {
        startActivity(Intent(this, CountryActivity::class.java))
        finish()
    }
}
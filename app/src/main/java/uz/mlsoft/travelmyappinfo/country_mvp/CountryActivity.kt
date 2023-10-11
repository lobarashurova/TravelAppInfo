package uz.mlsoft.travelmyappinfo.country_mvp

import android.content.Context
import android.content.DialogInterface
import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.util.Log
import android.view.View
import android.widget.EditText
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.isVisible
import androidx.drawerlayout.widget.DrawerLayout
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.airbnb.lottie.LottieAnimationView
import uz.mlsoft.travelmyappinfo.R
import uz.mlsoft.travelmyappinfo.adapters.SearchAdapter
import uz.mlsoft.travelmyappinfo.data.DataCountry
import uz.mlsoft.travelmyappinfo.screen.AboutActivity
import uz.mlsoft.travelmyappinfo.screen.InfoActivity

class CountryActivity : AppCompatActivity(), CountryContract.View {
    private lateinit var search: EditText
    private lateinit var placeHolder: LottieAnimationView
    private lateinit var presenter: CountryPresenter
    private lateinit var drawerLayout: DrawerLayout
    private var text = ""
    private var index = ""
    private lateinit var builder: AlertDialog.Builder
    private lateinit var leftLayout: View
    private lateinit var rightLayout: View
    private val adapter = SearchAdapter()
    private lateinit var recyclerView: RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        Log.d("TTT", "onCreate: COUNTRYACTIVITY ")
        application.setTheme(R.style.Base_Theme_TravelAppInfo)
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        init()
        presenter = CountryPresenter(this)

        clickAnything()
        onClicks()
    }

    private fun init() {

        search = findViewById(R.id.search_edt)
        recyclerView = findViewById(R.id.rv_users)
        placeHolder = findViewById(R.id.placeHolder)
    }

    private fun clickAnything() {
        adapter.click {
            index = it
            presenter.openNextActivity()
        }
        findViewById<LottieAnimationView>(R.id.menu).setOnClickListener {
            toggleLeftDrawer()
        }
        search.addTextChangedListener(object : TextWatcher {
            override fun onTextChanged(cs: CharSequence, arg1: Int, arg2: Int, arg3: Int) {
                text = cs.toString()
                presenter.search()

            }

            override fun beforeTextChanged(s: CharSequence, arg1: Int, arg2: Int, arg3: Int) {}
            override fun afterTextChanged(arg0: Editable) {
            }
        })
    }

    override fun getClickItemIndex(): String {
        return index
    }

    override fun getEditText(): String {
        return text
    }

    override fun showSearchResult(array: ArrayList<DataCountry>) {
        if (array.isEmpty()) {
            placeHolder.isVisible = true
            adapter.submitList(array)
            recyclerView.adapter = adapter
            recyclerView.layoutManager = GridLayoutManager(this, 2)
        } else {
            placeHolder.isVisible = false
            adapter.submitList(array)
            recyclerView.adapter = adapter
            recyclerView.layoutManager = GridLayoutManager(this, 2)

        }

    }

    override fun show(array: ArrayList<DataCountry>) {
        recyclerView.visibility = View.VISIBLE
        adapter.submitList(array)
        recyclerView.adapter = adapter
        recyclerView.layoutManager = GridLayoutManager(this, 2)

    }


    override fun openItemActivity(itemCountry: DataCountry) {
        val intent = Intent(this, InfoActivity::class.java)
        intent.putExtra("itemCountry", itemCountry)
        startActivity(intent)
    }

    private fun toggleLeftDrawer() {
        drawerLayout = findViewById(R.id.drawer_layout)
        leftLayout = findViewById<View>(R.id.leftDrawer)
        rightLayout = findViewById(R.id.main_layout)
        if (drawerLayout.isDrawerOpen(leftLayout)) {
            rightLayout.isClickable = false
            leftLayout.setOnClickListener {}
            drawerLayout.closeDrawer(leftLayout)
        } else {
            rightLayout.isClickable = false
            leftLayout.setOnClickListener { }
            drawerLayout.openDrawer(leftLayout)
        }
    }

    private fun onClicks() {
        findViewById<View>(R.id.fl_about).setOnClickListener {
            rateApp()
        }
        findViewById<View>(R.id.fl_share).setOnClickListener {
            shareProject(
                this
            )
        }
        findViewById<View>(R.id.fl_contact).setOnClickListener { v: View? ->
            gotoLink("https://t.me/astrogirll06")
        }
        findViewById<View>(R.id.fl_info).setOnClickListener { v: View? ->
            startActivity(Intent(this, AboutActivity::class.java))
            finish()
        }
        builder = AlertDialog.Builder(this)
        findViewById<View>(R.id.fl_exit).setOnClickListener {
            builder.setTitle("Do you want to close application?")
                .setCancelable(true)
                .setPositiveButton(
                    "Yes"
                ) { _: DialogInterface?, _: Int -> finish() }
                .setNegativeButton(
                    "No"
                ) { dialog: DialogInterface, _: Int -> dialog.cancel() }
                .show()
        }
    }


    private fun gotoLink(s: String) {
        val uri = Uri.parse(s)
        startActivity(Intent(Intent.ACTION_VIEW, uri))
    }

    private fun shareProject(context: Context) {
        val sendIntent = Intent()
        sendIntent.action = Intent.ACTION_SEND
        sendIntent.putExtra(
            Intent.EXTRA_TEXT,
            "Hoziroq yuklab oling!: " + "https://play.google.com/store/apps/details?id=${context.applicationContext?.packageName}"
        )
        sendIntent.type = "text/plain"
        context.startActivity(sendIntent)
    }

    private fun rateApp() {
        val i = Intent(Intent.ACTION_VIEW)
        i.data =
            Uri.parse("https://play.google.com/store/apps/details?id={context?applicationContext?.packageName}")
        startActivity(i)
    }
}

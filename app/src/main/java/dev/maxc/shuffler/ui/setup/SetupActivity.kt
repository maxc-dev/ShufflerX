package dev.maxc.shuffler.ui.setup

import android.graphics.drawable.Drawable
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.floatingactionbutton.FloatingActionButton
import com.google.android.material.snackbar.Snackbar
import dev.maxc.shuffler.R
import dev.maxc.shuffler.models.nodes.CategoryNode

/**
 * @author Max Carter
 * @since  10/03/2020
 */
class SetupActivity : AppCompatActivity() {
    private val snackBarInfo = "Tap the panels to change the settings"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_setup)

        setSupportActionBar(findViewById(R.id.setup_toolbar))
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        supportActionBar?.setDisplayShowHomeEnabled(true)

        val bundle: Bundle? = intent.extras
        if (bundle != null) {
            supportActionBar?.title = bundle.getString("title", getString(R.string.app_name))
        }


        val recycler = findViewById<RecyclerView>(R.id.category_recycler)
        recycler.setHasFixedSize(true)
        recycler.layoutManager = LinearLayoutManager(this)

        //creating demo categories
        recycler.adapter =
            CategoryListerAdapter(
                arrayListOf(
                    CategoryNode("Requirement Gathering", 25),
                    CategoryNode("Modelling MVVM", 10),
                    CategoryNode("Use Cases", 1),
                    CategoryNode("Waterfall Model", 6),
                    CategoryNode("Programming Practice", 5),
                    CategoryNode("Association", 23),
                    CategoryNode("Test Practice", 23)
                )
            )

        //display info snackbar with instructions
        Snackbar.make(
            findViewById(R.id.setup_main),
            snackBarInfo,
            Snackbar.LENGTH_LONG
        ).show()

        findViewById<FloatingActionButton>(R.id.setup_fab_start).setOnClickListener {
            //start activity with settings
        }
    }

    //returns user to the main activity
    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }
}

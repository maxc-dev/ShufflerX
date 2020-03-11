package dev.maxc.shuffler.ui.setup

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.floatingactionbutton.FloatingActionButton
import dev.maxc.shuffler.R

/**
 * @author Max Carter
 * @since  10/03/2020
 */
class SetupActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_setup)
        findViewById<FloatingActionButton>(R.id.fab_start).setOnClickListener {
            //todo(start init)
        }

        setSupportActionBar(findViewById(R.id.setup_toolbar))
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        supportActionBar?.setDisplayShowHomeEnabled(true)

        val bundle: Bundle? = intent.extras
        if (bundle != null) {
            supportActionBar?.title = bundle.getString("title", getString(R.string.app_name))
        }
    }

    //returns user to the main activity
    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }
}

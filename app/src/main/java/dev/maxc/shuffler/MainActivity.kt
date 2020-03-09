package dev.maxc.shuffler

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.bottomnavigation.BottomNavigationView
import dev.maxc.shuffler.models.nodes.Category
import dev.maxc.shuffler.models.nodes.PackageBundle
import dev.maxc.shuffler.models.nodes.RecyclerNode
import dev.maxc.shuffler.models.price.Price
import dev.maxc.shuffler.models.users.Author
import dev.maxc.shuffler.ui.popular.PackageAdapter
import java.util.*

class MainActivity : AppCompatActivity() {
    private lateinit var recycler: RecyclerView
    private var adapterPackageLister: PackageAdapter? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setSupportActionBar(findViewById(R.id.main_toolbar)).apply {
            title = getString(R.string.title_home)
        }

        recycler = findViewById(R.id.recycler_main)
        recycler.setHasFixedSize(true)
        recycler.layoutManager = LinearLayoutManager(this)
        val navView: BottomNavigationView = findViewById(R.id.nav_view)
        navView.setOnNavigationItemSelectedListener { item ->
            supportActionBar?.title = when (item.itemId) {
                R.id.navigation_popular -> initPopular()
                R.id.navigation_discover -> initDiscover()
                R.id.navigation_library -> initLibrary()
                else -> initHome()
            }
            true
        }
        if (savedInstanceState == null) {
            initHome()
        }
    }

    //home: list of varied card views
    private fun initHome(): String {
        //todo(
        // create card view for home components
        // create a new adapter
        // link to main activity recycler view
        // )
        return getString(R.string.title_home)
    }

    //popular: just displays the most downloaded within 24 hours
    private fun initPopular(): String {
        if (adapterPackageLister == null) {
            adapterPackageLister = PackageAdapter(this, initDummyList())
        }
        if (recycler.adapter != adapterPackageLister) {
            recycler.adapter = adapterPackageLister
        }
        return getString(R.string.title_popular)
    }

    //discover: search bar + filters
    private fun initDiscover(): String {

        return getString(R.string.title_discover)
    }

    //library: user's own library
    private fun initLibrary(): String {

        return getString(R.string.title_library)
    }

    //todo(
    // potentially create a method which initialises the adapter
    // in a new non blocking coroutine to resolve the slight
    // lag in animation from the nav bar
    // )
    private fun initAdapter(adapter: RecyclerView.Adapter<RecyclerView.ViewHolder>) {

    }

    private fun initDummyList(): ArrayList<RecyclerNode> {
        val author = Author("max", "Mr", "Max", "Carter")
        val author2 = Author("pdp", "Dr", "PewDiePie", "")
        val bundle1 = PackageBundle(
            0,
            "Computer Science (Semester 1)",
            "University level computer science bundle for Surrey students",
            author,
            Calendar.getInstance().time,
            Category.EDUCATIONAL,
            Price(4.99)
        )
        val bundle2 = PackageBundle(
            1,
            "Computer Science (Semester 2)",
            "University level computer science bundle for Surrey students",
            author,
            Calendar.getInstance().time,
            Category.EDUCATIONAL,
            Price(1.99)
        )
        val bundle3 = PackageBundle(
            1,
            "Speed Running",
            "How to speed run any game ever",
            author2,
            Calendar.getInstance().time,
            Category.GAMING,
            Price(99.99)
        )
        return arrayListOf(bundle1, bundle2, bundle3, bundle1, bundle2)
    }

}

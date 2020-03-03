package dev.maxc.shuffler

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.bottomnavigation.BottomNavigationView
import dev.maxc.shuffler.ui.home.HomeFragment
import dev.maxc.shuffler.ui.packages.PackageListFragment
import dev.maxc.shuffler.ui.packages.PackageLister

class MainActivity : AppCompatActivity(), HomeFragment.OnHomeListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //setup bottom nav bar
        val navView: BottomNavigationView = findViewById(R.id.nav_view)
        navView.setOnNavigationItemSelectedListener { item ->
            val selectedFragment = when (item.itemId) {
                R.id.navigation_popular -> PackageListFragment.newInstance(PackageLister.POPULAR)
                R.id.navigation_search -> PackageListFragment.newInstance(PackageLister.SEARCH)
                R.id.navigation_library -> PackageListFragment.newInstance(PackageLister.LIBRARY)
                else -> HomeFragment.newInstance()
            }
            supportFragmentManager.beginTransaction().replace(
                R.id.nav_host_fragment,
                selectedFragment
            ).commit()

            true
        }
        if (savedInstanceState == null) {
            supportFragmentManager.beginTransaction().replace(
                R.id.nav_host_fragment,
                HomeFragment()
            ).commit()
        }
    }

    //backend code when the Home nav button is selected
    override fun onHomeSelected() {

    }

}

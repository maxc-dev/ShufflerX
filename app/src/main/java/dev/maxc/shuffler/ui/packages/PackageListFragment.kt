package dev.maxc.shuffler.ui.packages

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import dev.maxc.shuffler.R

class PackageListFragment(val packageLister: PackageLister) : Fragment() {
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_package_lister, container, false)
    }

    companion object {
        @JvmStatic
        fun newInstance(packageLister: PackageLister) =
            PackageListFragment(packageLister).apply {
                arguments = Bundle()
            }
    }

}
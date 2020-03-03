package dev.maxc.shuffler.ui.home

import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import dev.maxc.shuffler.R

class HomeFragment : Fragment() {
    private var listener: OnHomeListener? = null

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_home, container, false)
    }

    override fun onAttach(context: Context) {
        super.onAttach(context)
        if (context is OnHomeListener) {
            listener = context
        } else {
            throw RuntimeException("$context must implement HomeFragment.OnHomeListener")
        }
    }

    override fun onStart() {
        super.onStart()
        if (listener != null) {
            listener?.onHomeSelected()
        }
    }

    override fun onDetach() {
        super.onDetach()
        listener = null
    }

    companion object {
        @JvmStatic
        fun newInstance() =
            HomeFragment().apply {
                arguments = Bundle()
            }
    }

    interface OnHomeListener {
        fun onHomeSelected()
    }
}
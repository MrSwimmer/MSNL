package com.memebattle.multistacknavigationlibrary.main.fragment.news


import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.memebattle.goldextensions.log
import com.memebattle.msnl.MSFragmentManager
import com.memebattle.multistacknavigationlibrary.R
import kotlinx.android.synthetic.main.fragment_post.view.*

class PostFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        val v = inflater.inflate(R.layout.fragment_post, container, false)
        v.checkStack.setOnClickListener {
            log("next ${MSFragmentManager.instance.getBackStack()}")
        }
        return v
    }
}

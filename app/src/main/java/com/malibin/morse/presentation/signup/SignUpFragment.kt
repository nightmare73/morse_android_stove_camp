package com.malibin.morse.presentation.signup

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.malibin.morse.databinding.FragmentSignupBinding

/**
 * Created By Malibin
 * on 1월 08, 2021
 */

class SignUpFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val binding = FragmentSignupBinding.inflate(inflater, container, false)
        return binding.root
    }
}

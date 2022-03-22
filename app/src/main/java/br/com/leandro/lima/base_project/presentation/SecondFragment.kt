package br.com.leandro.lima.base_project.presentation

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.navArgs
import br.com.leandro.lima.base_project.databinding.FragmentSecondBinding

class SecondFragment : Fragment() {
    private val args: SecondFragmentArgs by navArgs()
    private lateinit var binding: FragmentSecondBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentSecondBinding.inflate(inflater, container, false)
        binding.tvScreenTwo.text = args.screenNumber.toString()
        return binding.root
    }

}
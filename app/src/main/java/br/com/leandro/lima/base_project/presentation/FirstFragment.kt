package br.com.leandro.lima.base_project.presentation

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import br.com.leandro.lima.base_project.databinding.FragmentFirstBinding

class FirstFragment : Fragment() {
    private lateinit var binding: FragmentFirstBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentFirstBinding.inflate(inflater,container,false)
        onClickScreen()
        return binding.root
    }

    private fun onClickScreen(){
        binding.tvScreenOne.setOnClickListener {
            val action = FirstFragmentDirections.actionFirstFragmentToSecondFragment(22)
            Navigation.findNavController(binding.root).navigate(action)
        }
    }

}
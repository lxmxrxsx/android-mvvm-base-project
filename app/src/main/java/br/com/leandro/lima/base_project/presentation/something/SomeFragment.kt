package br.com.leandro.lima.base_project.presentation.something

import androidx.fragment.app.Fragment
import org.koin.androidx.viewmodel.ext.android.viewModel

class SomeFragment : Fragment() {
    private val viewModel: SomeViewModel by viewModel()
}
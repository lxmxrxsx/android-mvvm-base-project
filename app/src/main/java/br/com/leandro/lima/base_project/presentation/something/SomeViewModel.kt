package br.com.leandro.lima.base_project.presentation.something

import androidx.lifecycle.ViewModel
import br.com.leandro.lima.base_project.data.repository.Repository

class SomeViewModel(
    private val repository: Repository
): ViewModel() {
}
package br.com.leandro.lima.base_project.di

import br.com.leandro.lima.base_project.presentation.something.SomeViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val presentationModule = module{
    viewModel { SomeViewModel(get()) }
}
package br.com.leandro.lima.base_project.di

import org.koin.core.module.Module

val appModule: List<Module> = listOf(dataModule, presentationModule)
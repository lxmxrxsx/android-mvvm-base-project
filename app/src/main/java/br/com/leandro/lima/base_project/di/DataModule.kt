package br.com.leandro.lima.base_project.di

import br.com.leandro.lima.base_project.data.mapper.Mapper
import br.com.leandro.lima.base_project.data.network.RetrofitConfig
import br.com.leandro.lima.base_project.data.repository.Repository
import br.com.leandro.lima.base_project.data.repository.RepositoryImpl
import org.koin.dsl.module

val dataModule = module {

    single { RetrofitConfig.service }
    single { Mapper() }


    factory<Repository> { RepositoryImpl(get(),get()) }
}
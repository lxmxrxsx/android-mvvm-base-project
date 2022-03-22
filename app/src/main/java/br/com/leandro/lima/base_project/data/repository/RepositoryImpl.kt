package br.com.leandro.lima.base_project.data.repository

import br.com.leandro.lima.base_project.data.mapper.Mapper
import br.com.leandro.lima.base_project.data.network.Api

class RepositoryImpl(
    private val api: Api,
    private val mapper: Mapper
): Repository {
}
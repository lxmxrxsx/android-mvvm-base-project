package br.com.leandro.lima.base_project.data.mapper

class Mapper: DomainMapper<Int, String> {
    override fun toDomain(from: Int): String = from.toString()

    override fun toDomain(from: List<Int>): List<String> = from.map {
        toDomain(it)
    }
}
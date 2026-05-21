package com.example.carteirinhadigital.feature.unidadecurricular.data.repository

import com.example.carteirinhadigital.feature.unidadecurricular.domain.model.UnidadeCurricular
import kotlinx.coroutines.delay

class FakeUnidadeCurricularRepository : UnidadeCurricularRepository{
    override suspend fun buscarUnidadesCurriculares(): Result<List<UnidadeCurricular>> {
        delay(1800)
        return Result.success(
            listOf(
                UnidadeCurricular("1", "Programação Mobile", "Pedro", 9.0, 7.0, 8.0, 2),
                UnidadeCurricular("2", "Programação Frontend", "Mateus", 9.0, 8.0, 8.0, 3),
                UnidadeCurricular("3", "Programação Backend", "Augusto", 7.0, 7.0, 6.0, 4),
                UnidadeCurricular("4", "Arquitetura de Software", "Rafael", 9.0, 9.0, 9.0, 1),
                UnidadeCurricular("5", "Internet das Coisas", "Lucas", 7.0, 7.0, 7.0, 3),
                UnidadeCurricular("6", "Segurança da Informação", "Gabriel", 5.0, 7.0, 6.0, 5),
                UnidadeCurricular("7", "Banco de Dados", "Carlos", 9.0, 7.0, 8.0, 2),
                UnidadeCurricular("8", "Interface do Usuário", "Samuel", 10.0, 7.0, 8.0, 4),
            )
        )
    }
}
package com.example.carteirinhadigital.feature.unidadecurricular.presentation

import com.example.carteirinhadigital.feature.unidadecurricular.domain.model.UnidadeCurricular

data class UnidadeCurricularUIState(
    val isLoading: Boolean = false,
    val unidadesCurriculares: List<UnidadeCurricular> = emptyList(),
    val errorMessages: String? = null
) {
}
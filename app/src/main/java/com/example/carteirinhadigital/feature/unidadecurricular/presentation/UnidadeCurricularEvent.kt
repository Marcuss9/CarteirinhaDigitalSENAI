package com.example.carteirinhadigital.feature.unidadecurricular.presentation

sealed interface UnidadeCurricularEvent{
    data object OnCarregaDados: UnidadeCurricularEvent
    data object OnTentarNovamenteClick: UnidadeCurricularEvent
    data object OnVoltarClick: UnidadeCurricularEvent
}
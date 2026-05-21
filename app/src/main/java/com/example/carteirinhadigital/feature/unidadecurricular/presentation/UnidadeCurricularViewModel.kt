package com.example.carteirinhadigital.feature.unidadecurricular.presentation

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.carteirinhadigital.feature.unidadecurricular.data.repository.FakeUnidadeCurricularRepository
import com.example.carteirinhadigital.feature.unidadecurricular.data.repository.UnidadeCurricularRepository
import com.example.carteirinhadigital.feature.unidadecurricular.domain.model.UnidadeCurricular
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update
import kotlinx.coroutines.launch

class UnidadeCurricularViewModel (
    private val repository: UnidadeCurricularRepository = FakeUnidadeCurricularRepository()
) : ViewModel() {
    private val _uiState = MutableStateFlow(UnidadeCurricularUIState())
    val uiState: StateFlow<UnidadeCurricularUIState> = _uiState.asStateFlow()

    init {
        carregarUnidadesCurriculares()
    }

    fun onEvent(event: UnidadeCurricularEvent) {
        when (event) {
            UnidadeCurricularEvent.OnCarregaDados,
            UnidadeCurricularEvent.OnTentarNovamenteClick -> carregarUnidadesCurriculares()

            UnidadeCurricularEvent.OnVoltarClick -> Unit
        }
    }

    private fun carregarUnidadesCurriculares() {
        viewModelScope.launch {
            _uiState.update {
                it.copy(
                    isLoading = true,
                    errorMessages = null
                )
            }

            val result = repository.buscarUnidadesCurriculares()
            result.onSuccess { unidades ->
                _uiState.update {
                    it.copy(
                        isLoading = false,
                        unidadesCurriculares = unidades,
                        errorMessages = null
                    )
                }
            }
            result.onFailure {
                _uiState.update {
                    it.copy(
                        isLoading = false,
                        errorMessages = "Falha ao carregar unidades curriculares"
                    )
                }
            }
        }
    }
}
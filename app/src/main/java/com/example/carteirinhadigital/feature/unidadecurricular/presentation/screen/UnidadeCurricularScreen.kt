package com.example.carteirinhadigital.feature.unidadecurricular.presentation.screen

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.lifecycle.compose.collectAsStateWithLifecycle
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.carteirinhadigital.feature.unidadecurricular.presentation.UnidadeCurricularEvent
import com.example.carteirinhadigital.feature.unidadecurricular.presentation.UnidadeCurricularViewModel
import com.example.carteirinhadigital.feature.unidadecurricular.presentation.component.UnidadeCurricularCard


@Composable
fun UnidadeCurricularScreen (
    usuarioNome: String,
    usuarioDescricao: String,
    onLogoutClick: () -> Unit,
    modifier: Modifier = Modifier,
    onBackClick: () -> Unit,
    viewModel: UnidadeCurricularViewModel = viewModel()
) {
    val uiState by viewModel.uiState.collectAsStateWithLifecycle()

        UnidadeCurricularContent(
            uiState = uiState,
            onEvent = { event ->
                when (event) {
                    UnidadeCurricularEvent.OnVoltarClick -> onBackClick()
                    else -> viewModel.onEvent(event)
                }
            }
        )
}
package com.example.carteirinhadigital.feature.unidadecurricular.presentation.screen

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.carteirinhadigital.core.theme.CarteirinhaDigitalTheme
import com.example.carteirinhadigital.feature.unidadecurricular.domain.model.UnidadeCurricular
import com.example.carteirinhadigital.feature.unidadecurricular.presentation.component.UnidadeCurricularCard

@Composable
fun UnidadeCurricularContent (
    modifier: Modifier = Modifier,
    unidadesCurriculares: List<UnidadeCurricular>
) {
    LazyColumn(
        modifier = Modifier
            .fillMaxSize()
            .padding(top = 16.dp),
        verticalArrangement = Arrangement.spacedBy(12.dp)
    ) {
        items(unidadesCurriculares){ uc ->
            UnidadeCurricularCard(unidadeCurricular = uc)
        }
    }
}

@Preview(
    showBackground = true,
    showSystemUi = true
)
@Composable
fun UnidadeCurricularContentPreviwe(){
    CarteirinhaDigitalTheme {
        UnidadeCurricularContent(
            unidadesCurriculares =
                listOf(
                    UnidadeCurricular(
                        id = "1",
                        nome = "Backend",
                        professor = "Manoel",
                        nota1 = 8.5,
                        nota2 = 7.0,
                        media = 7.75,
                        faltas = 2
                    ),
                    UnidadeCurricular(
                        id = "2",
                        nome = "Banco de Dados",
                        professor = "Paulo",
                        nota1 = 8.5,
                        nota2 = 9.0,
                        media = 8.75,
                        faltas = 3
                    )
                )
        )
    }
}
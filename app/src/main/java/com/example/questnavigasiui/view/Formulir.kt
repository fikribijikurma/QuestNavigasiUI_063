package com.example.questnavigasiui.view


import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.RadioButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.BiasAbsoluteAlignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import com.example.questnavigasiui.R


@Composable
fun Formisian(
    jenisK: List<String> = listOf("laki_laki", "perempuan"),
    onSubmitButtonClick: () -> Unit
){
    Scaffold(
        topBar = {
            TopAppBar(
                title = {
                    Text(
                        text = stringResource(id = R.string.home),
                        color = Color.White
                    )
                },
                colors = TopAppBarDefaults.topAppBarColors(
                    containerColor = colorResource(id = R.color.teal_700)
                )
            )
        }
    ) { isiRuang ->
        Column(modifier = Modifier.padding(isiRuang),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            OutlinedTextField(
                value = "",
                singleLine = true,
                modifier = Modifier
                    .padding(top = 20.dp)
                    .widht(250.dp)
                label = {Text(text = "nama_lengkap")},
                onValueChange = {}
            )
            HorizontalDivider(modifier = Modifier)

            Row{
                jenisK.forEach {
                    item->
                    Row (verticalAlignment = Alignment.CenterVertically){
                        RadioButton(
                            selected = false,
                            onClick = {}
                        )
                        Text(
                            text = item,
                        )
                    }
                }
            }
            HorizontalDivider(modifier = Modifier)
                .padding(top = 20.dp)
                .width(250.dp),
            thickness = 1.dp,
            color = Color.Red
        )

        }
    }
}
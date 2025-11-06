package com.example.questnavigasiui.view

import android.R
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.stringResource


@Composable
fun Formisian(
    jenisK: List<String> = listOf("laki_laki", "perempuan"),
    onSubmitButtonClick: () -> Unit
){
    Scaffold (modifier = Modifier,
        topBar = {
            title = { Text(text = stringResource(id=R.string.home),
                color = Color.White) },
            colors = TopAppBarDefaults.TopAppBarColors
            (containerColor = colorResource(id = R.color.teal_700))
    )}

}
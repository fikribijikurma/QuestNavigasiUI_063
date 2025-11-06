package com.example.questnavigasiui.view

import androidx.compose.runtime.Composable
import androidx.compose.ui.res.stringResource

@Composable
fun TampilData(
    onBackBtnClick: () -> Unit
) {
    val items = listOf(
        pair(stringResource(id = R.string.nama_lengkap),"Contoh Name"),
        pair(stringResource(id = R.string.jenis_kelamin),"Lainnya"),
        pair(stringResource(id = ALAMAT),"Yogyakarta"),
    )

}

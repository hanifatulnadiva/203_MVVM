package com.example.mvvn.view

import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.runtime.Composable
import androidx.compose.ui.res.stringResource
import com.example.mvvn.model.Siswa
import com.example.mvvn.R

@OptIn (ExperimentalMaterial3Api::class)
@Composable
fun TampilSiswa(
    statusUISiswa :Siswa,
    onBackButtonClick:()-> Unit
){
    val items = listOf(
        Pair (first = stringResource(R.string.nama), second = statusUISiswa.nama),
        Pair (first = stringResource(R.string.gender), second = statusUISiswa.gender),
        Pair (first = stringResource(R.string.alamat), second = statusUISiswa.alamat),

    )
}
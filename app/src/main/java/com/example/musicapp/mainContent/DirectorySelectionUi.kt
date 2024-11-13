package com.example.musicapp.mainContent

import android.net.Uri
import android.os.Build
import android.util.Log
import androidx.annotation.RequiresApi
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.navigation.NavController
import com.example.musicapp.musicFilesUsage.Album
import com.example.musicapp.musicFilesUsage.GetDirectory
import com.example.musicapp.musicFilesUsage.setUpDatabase

@RequiresApi(Build.VERSION_CODES.P)
@Composable
fun DirectorySelectionUi(
    uri: MutableState<Uri?>,
    albumsList: MutableList<Album>,
    navController: NavController,
){
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,
        modifier = Modifier
            .fillMaxHeight()
            .fillMaxWidth()
    ){
        GetDirectory(
            uri = uri,
            albumsList = albumsList,
            navController = navController,
        )
    }
}
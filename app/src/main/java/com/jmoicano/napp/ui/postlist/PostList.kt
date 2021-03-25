package com.jmoicano.napp.ui.postlist

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.material.Divider
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import coil.transform.CircleCropTransformation
import com.google.accompanist.coil.CoilImage
import com.jmoicano.napp.ui.theme.NappTheme

@Composable
fun PostListScreen() {
    Scaffold(topBar = {
        TopAppBar(title = {
            Text(text = "Napp!")
        })
    }) {
        Column(modifier = Modifier.fillMaxSize()) {
            ChannelList()
            PostList(modifier = Modifier.weight(1f))
        }
    }
}

@Composable
fun PostList(modifier: Modifier = Modifier) {
    LazyColumn(modifier = modifier) {
        items(1000) {
            Post()
            Divider(modifier = Modifier.padding(10.dp))
        }
    }
}

@Composable
fun Post() {
    Text(text = "Post")
//    TODO("Decide post format")
}

@Composable
fun ChannelList() {
    LazyRow {
        items(1000) {
            ChannelImage()
            Spacer(modifier = Modifier.width(15.dp))
        }
    }
}

@Composable
fun ChannelImage() {
    CoilImage(
        modifier = Modifier.size(50.dp),
        data = "https://picsum.photos/200",
        contentDescription = "",
        requestBuilder = {
            transformations(CircleCropTransformation())
        }
    ) {

    }
}

@Composable
@Preview
fun Preview() {
    NappTheme(darkTheme = true) {
        PostListScreen()
    }
}
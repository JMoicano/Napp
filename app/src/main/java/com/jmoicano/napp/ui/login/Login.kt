package com.jmoicano.napp.ui.login

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Notifications
import androidx.compose.material.icons.filled.Star
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.jmoicano.napp.ui.theme.NappTheme

@Composable
fun LoginForm() {
    var email by remember { mutableStateOf(TextFieldValue()) }
    var password by remember { mutableStateOf(TextFieldValue()) }
    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Image(
            modifier = Modifier.size(150.dp),
            imageVector = Icons.Default.Notifications, //Placeholder until get right image
            colorFilter = ColorFilter.tint(
                color = LocalContentColor.current
            ),
            contentDescription = "Napp Logo",
        )
        Column {
            TextField(
                value = email,
                keyboardOptions = KeyboardOptions(
                    keyboardType = KeyboardType.Email
                ),
                singleLine = true,
                onValueChange = {
                    email = it
                },
                label = { Text(text = "E-mail") }
            )
            TextField(
                value = password,
                keyboardOptions = KeyboardOptions(
                    keyboardType = KeyboardType.Password
                ),
                singleLine = true,
                onValueChange = {
                    password = it
                },
                label = { Text(text = "Password") }
            )
        }
        TextButton(onClick = {

        }) {
            Text(text = "Login")
        }
    }
}

@Composable
@Preview
fun LoginScreen(){
    NappTheme {
        Scaffold(topBar = {
            TopAppBar(title = {
                Text(text = "Napp!")
            })
        }) {
            LoginForm()
        }
    }
}
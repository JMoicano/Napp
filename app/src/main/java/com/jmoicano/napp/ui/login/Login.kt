package com.jmoicano.napp.ui.login

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.defaultMinSize
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.Button
import androidx.compose.material.LocalContentColor
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.material.TextField
import androidx.compose.material.TopAppBar
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.jmoicano.napp.R
import com.jmoicano.napp.ui.theme.NappTheme

@Composable
fun LoginForm() {
    var email by remember { mutableStateOf(TextFieldValue()) }
    var password by remember { mutableStateOf(TextFieldValue()) }
    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.SpaceEvenly
    ) {
        Image(
            modifier = Modifier.size(150.dp),
            painter = painterResource(id = R.drawable.ic_nvector), //Placeholder until get right image
            colorFilter = ColorFilter.tint(
                color = LocalContentColor.current
            ),
            contentDescription = "Napp Logo",
        )
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
        ) {
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
            Box(
                modifier = Modifier
                    .padding(10.dp)
            ) {
                Button(
                    modifier = Modifier.defaultMinSize(100.dp),
                    onClick = {

                    }
                ) {
                    Text(text = "Login")
                }
            }
        }
    }
}

@Composable
@Preview
fun LoginScreen() {
    NappTheme(darkTheme = true) {
        Scaffold(topBar = {
            TopAppBar(title = {
                Text(text = "Napp!")
            })
        }) {
            LoginForm()
        }
    }
}
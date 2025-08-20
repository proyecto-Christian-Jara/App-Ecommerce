package com.christian.chicharroneriaapp.ui.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.christian.chicharroneriaapp.R

@Composable
fun Register(navController: NavController){
    var email by remember { mutableStateOf("") }
    var pass by remember { mutableStateOf("") }
    val primaryBtn = Color(0xFF5A2E1F)
    val secondaryBtn = Color(0xFFFF9E80)


    val panelBg = Color(0xFFF9EDD9)

    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(panelBg),
    ){

        Column (
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 24.dp, vertical = 24.dp),
            horizontalAlignment = Alignment.CenterHorizontally

        ) {

            Text("Registrate",
                fontWeight = FontWeight.Bold,
                fontSize = 24.sp,
                modifier = Modifier.align(Alignment.Start))

            // Email
            OutlinedTextField(
                value = email,
                onValueChange = { email = it },
                label = { Text("Correo") },
                singleLine = true,
                shape = RoundedCornerShape(24.dp),
                modifier = Modifier
                    .fillMaxWidth()
                    .heightIn(min = 52.dp),
                keyboardOptions = KeyboardOptions(
                    keyboardType = KeyboardType.Email,
                    imeAction = ImeAction.Next
                ),
                keyboardActions = KeyboardActions(
                    onNext = { /* el foco pasará al siguiente campo automáticamente */ }
                )
            )

            Spacer(Modifier.height(12.dp))

            //password
            OutlinedTextField(
                value = pass,
                onValueChange = { email = it },
                label = { Text("Contraseña")},
                singleLine = true,
                shape = RoundedCornerShape(24.dp),
                modifier = Modifier
                    .fillMaxWidth()
                    .heightIn(min = 52.dp),

                )
            Spacer(Modifier.height(12.dp))

            //password
            OutlinedTextField(
                value = pass,
                onValueChange = { email = it },
                label = { Text("Contraseña")},
                singleLine = true,
                shape = RoundedCornerShape(24.dp),
                modifier = Modifier
                    .fillMaxWidth()
                    .heightIn(min = 52.dp),

                )
            Spacer(Modifier.height(12.dp))

            //password
            OutlinedTextField(
                value = pass,
                onValueChange = { email = it },
                label = { Text("Contraseña")},
                singleLine = true,
                shape = RoundedCornerShape(24.dp),
                modifier = Modifier
                    .fillMaxWidth()
                    .heightIn(min = 52.dp),

                )
            Spacer(Modifier.height(12.dp))





            Spacer(Modifier.height(12.dp))

            Button(
                onClick = {
                    // TODO: Navegar a registro si creas la ruta
                    navController.navigate("register")
                },
                modifier = Modifier
                    .fillMaxWidth()
                    .height(48.dp),
                shape = RoundedCornerShape(24.dp),
                colors = ButtonDefaults.buttonColors(containerColor = secondaryBtn)
            ) {
                Text("REGISTRARME", fontWeight = FontWeight.SemiBold, textAlign = TextAlign.Center)
            }

        }

    }

}

@Preview(showBackground = true, showSystemUi = true, name = "Example")
@Composable
fun PreviewRegister(){
    val navController = rememberNavController()
    Register(navController = navController)
}
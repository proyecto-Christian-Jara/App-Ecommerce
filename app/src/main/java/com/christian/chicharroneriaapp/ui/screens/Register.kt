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
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextFieldDefaults
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
import com.christian.chicharroneriaapp.navigation.Route
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Close
import androidx.compose.material.icons.filled.Visibility
import androidx.compose.material.icons.filled.VisibilityOff
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.VisualTransformation

@Composable
fun Register(navController: NavController){
    var email by remember { mutableStateOf("") }
    val primaryBtn = Color(0xFFFF9E80)
    var password by remember { mutableStateOf("") }
    var passwordVisible by remember { mutableStateOf(false) }


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

            Box(
                modifier = Modifier.fillMaxWidth(),
                contentAlignment = Alignment.TopEnd
            ) {
                IconButton(
                    onClick = { navController.navigate(Route.Login.path) } // 👈 cambia "login" por el route de tu LoginScreen
                ) {
                    Icon(
                        imageVector = Icons.Default.Close,
                        contentDescription = "Cerrar"
                    )
                }
            }

            Spacer(Modifier.height(16.dp))

            Text("Crea tu cuenta",
                fontWeight = FontWeight.Bold,
                fontSize = 24.sp,
                modifier = Modifier.align(Alignment.Start))

            Spacer(Modifier.height(30.dp))

            // Nombres
            Column(
                modifier = Modifier.fillMaxWidth()
            ) {
                Text(
                    text = "Nombres",
                    style = MaterialTheme.typography.bodyMedium,
                    color = Color.Black
                )
                OutlinedTextField(
                    value = email,
                    onValueChange = { email = it },
                    placeholder = { Text("Ingresa tu nombre") },
                    singleLine = true,
                    shape = RoundedCornerShape(24.dp),
                    modifier = Modifier
                        .fillMaxWidth()
                        .heightIn(min = 52.dp)
                        .background(Color(0xFFF2EDE8), RoundedCornerShape(24.dp)),
                    colors = TextFieldDefaults.colors( // ✅ en Material3 es colors()
                        focusedIndicatorColor = Color.Transparent,
                        unfocusedIndicatorColor = Color.Transparent,
                        disabledIndicatorColor = Color.Transparent,
                        errorIndicatorColor = Color.Transparent,
                        focusedContainerColor = Color(0xFFF2EDE8),
                        unfocusedContainerColor = Color(0xFFF2EDE8)
                    )
                )
            }

            Spacer(Modifier.height(20.dp))

            // Apellidos
            Column(
                modifier = Modifier.fillMaxWidth()
            ) {
                Text(
                    text = "Apellidos",
                    style = MaterialTheme.typography.bodyMedium,
                    color = Color.Black
                )
                OutlinedTextField(
                    value = email,
                    onValueChange = { email = it },
                    placeholder = { Text("Ingresa tus apellidos") },
                    singleLine = true,
                    shape = RoundedCornerShape(24.dp),
                    modifier = Modifier
                        .fillMaxWidth()
                        .heightIn(min = 52.dp)
                        .background(Color(0xFFF2EDE8), RoundedCornerShape(24.dp)),
                    colors = TextFieldDefaults.colors( // ✅ en Material3 es colors()
                        focusedIndicatorColor = Color.Transparent,
                        unfocusedIndicatorColor = Color.Transparent,
                        disabledIndicatorColor = Color.Transparent,
                        errorIndicatorColor = Color.Transparent,
                        focusedContainerColor = Color(0xFFF2EDE8),
                        unfocusedContainerColor = Color(0xFFF2EDE8)
                    )
                )
            }

            Spacer(Modifier.height(20.dp))

            // Telefono
            Column(
                modifier = Modifier.fillMaxWidth()
            ) {
                Text(
                    text = "Celular",
                    style = MaterialTheme.typography.bodyMedium,
                    color = Color.Black
                )
                OutlinedTextField(
                    value = email,
                    onValueChange = { email = it },
                    placeholder = { Text("Ingresa tu numero de celular") },
                    singleLine = true,
                    shape = RoundedCornerShape(24.dp),
                    modifier = Modifier
                        .fillMaxWidth()
                        .heightIn(min = 52.dp)
                        .background(Color(0xFFF2EDE8), RoundedCornerShape(24.dp)),
                    colors = TextFieldDefaults.colors( // ✅ en Material3 es colors()
                        focusedIndicatorColor = Color.Transparent,
                        unfocusedIndicatorColor = Color.Transparent,
                        disabledIndicatorColor = Color.Transparent,
                        errorIndicatorColor = Color.Transparent,
                        focusedContainerColor = Color(0xFFF2EDE8),
                        unfocusedContainerColor = Color(0xFFF2EDE8)
                    )
                )
            }

            Spacer(Modifier.height(20.dp))

            // Correo
            Column(
                modifier = Modifier.fillMaxWidth()
            ) {
                Text(
                    text = "Correo",
                    style = MaterialTheme.typography.bodyMedium,
                    color = Color.Black
                )
                OutlinedTextField(
                    value = email,
                    onValueChange = { email = it },
                    placeholder = { Text("Ingresa tu correo electronico") },
                    singleLine = true,
                    shape = RoundedCornerShape(24.dp),
                    modifier = Modifier
                        .fillMaxWidth()
                        .heightIn(min = 52.dp)
                        .background(Color(0xFFF2EDE8), RoundedCornerShape(24.dp)),
                    colors = TextFieldDefaults.colors( // ✅ en Material3 es colors()
                        focusedIndicatorColor = Color.Transparent,
                        unfocusedIndicatorColor = Color.Transparent,
                        disabledIndicatorColor = Color.Transparent,
                        errorIndicatorColor = Color.Transparent,
                        focusedContainerColor = Color(0xFFF2EDE8),
                        unfocusedContainerColor = Color(0xFFF2EDE8)
                    )
                )
            }

            Spacer(Modifier.height(20.dp))

            // Contraseña
            Column(
                modifier = Modifier.fillMaxWidth()
            ) {
                Text(
                    text = "Contraseña",
                    style = MaterialTheme.typography.bodyMedium,
                    color = Color.Black
                )
                OutlinedTextField(
                    value = password,
                    onValueChange = { password = it },
                    placeholder = { Text("Ingresa tu contraseña") },
                    singleLine = true,
                    shape = RoundedCornerShape(24.dp),
                    modifier = Modifier
                        .fillMaxWidth()
                        .heightIn(min = 52.dp)
                        .background(Color(0xFFF2EDE8), RoundedCornerShape(24.dp)),
                    colors = TextFieldDefaults.colors( // ✅ en Material3 es colors()
                        focusedIndicatorColor = Color.Transparent,
                        unfocusedIndicatorColor = Color.Transparent,
                        disabledIndicatorColor = Color.Transparent,
                        errorIndicatorColor = Color.Transparent,
                        focusedContainerColor = Color(0xFFF2EDE8),
                        unfocusedContainerColor = Color(0xFFF2EDE8)
                    ),
                    visualTransformation = if (passwordVisible) VisualTransformation.None else PasswordVisualTransformation(),
                    keyboardOptions = KeyboardOptions(
                        keyboardType = KeyboardType.Password,
                        imeAction = ImeAction.Done
                    ),
                    trailingIcon = {
                        val image = if (passwordVisible)
                            Icons.Default.Visibility
                        else Icons.Default.VisibilityOff

                        IconButton(onClick = { passwordVisible = !passwordVisible }) {
                            Icon(imageVector = image, contentDescription = null)
                        }
                    }

                )
            }

            Spacer(Modifier.height(20.dp))

            // Confirmar contraseña
            Column(
                modifier = Modifier.fillMaxWidth()
            ) {
                Text(
                    text = "Confirmar contraseña",
                    style = MaterialTheme.typography.bodyMedium,
                    color = Color.Black
                )
                OutlinedTextField(
                    value = email,
                    onValueChange = { email = it },
                    placeholder = { Text("Confirma tu contraseña") },
                    singleLine = true,
                    shape = RoundedCornerShape(24.dp),
                    modifier = Modifier
                        .fillMaxWidth()
                        .heightIn(min = 52.dp)
                        .background(Color(0xFFF2EDE8), RoundedCornerShape(24.dp)),
                    colors = TextFieldDefaults.colors( // ✅ en Material3 es colors()
                        focusedIndicatorColor = Color.Transparent,
                        unfocusedIndicatorColor = Color.Transparent,
                        disabledIndicatorColor = Color.Transparent,
                        errorIndicatorColor = Color.Transparent,
                        focusedContainerColor = Color(0xFFF2EDE8),
                        unfocusedContainerColor = Color(0xFFF2EDE8)
                    )
                )
            }


            Spacer(Modifier.height(30.dp))

            Button(
                onClick = {
                    // TODO: Navegar a registro si creas la ruta
                    navController.navigate("register")
                },
                modifier = Modifier
                    .fillMaxWidth()
                    .height(48.dp),
                shape = RoundedCornerShape(24.dp),
                colors = ButtonDefaults.buttonColors(containerColor = primaryBtn)
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
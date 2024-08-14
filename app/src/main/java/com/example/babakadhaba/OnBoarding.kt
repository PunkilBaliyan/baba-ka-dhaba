package com.example.babakadhaba

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun OnboardingScreen() {
    val firstName = remember { mutableStateOf("") }
    val lastName = remember { mutableStateOf("") }
    val email = remember { mutableStateOf("") }

    Column(
        modifier = Modifier
            .fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Spacer(modifier = Modifier.height(26.dp))
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .height(50.dp)
        ) {  Image(
            painter = painterResource(id = R.drawable.img),
            contentDescription = "Logo",
            modifier = Modifier
                .fillMaxHeight().padding(start = 10.dp)


        )
            Text(

                text = "Baba ka Dhaba",
                color = Color.Black,
                modifier = Modifier
                    .padding(start = 30.dp,top=5.dp),
                style = TextStyle(
                    fontSize = 40.sp,
                    fontWeight = FontWeight.Bold,
                ),
                letterSpacing = 1.5.sp

            )
        }
        Spacer(modifier = Modifier.height(100.dp))


        Box(
            modifier = Modifier
                .fillMaxWidth()
                .background(
                    colorResource(id = R.color.Grey_background)
                    )
                .height(100.dp)
        ) {
            Text(
                text = "Let's get to know you",
                fontSize = 28.sp,
                color = Color.White,
                textAlign = TextAlign.Center,
                modifier = Modifier.align(Alignment.Center)
            )
        }
        Spacer(modifier = Modifier.height(32.dp))
        Text(text = "Required Information:",
            fontSize= 18.sp,
            textAlign = TextAlign.Left,
            modifier = Modifier
                .align(Alignment.Start)
                .padding(
                    30.dp
                )
            )


        OutlinedTextField(
            value = firstName.value,
            onValueChange = { firstName.value = it },
            label = { Text("First name") },
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Text)
        )
        Spacer(modifier = Modifier.height(16.dp))
        OutlinedTextField(
            value = lastName.value,
            onValueChange = { lastName.value = it },
            label = { Text("Last name") },
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Text)
        )
        Spacer(modifier = Modifier.height(16.dp))
        OutlinedTextField(
            value = email.value,
            onValueChange = { email.value = it },
            label = { Text("Email") },
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Email)
        )
        Spacer(modifier = Modifier.height(32.dp))
        Button(
            onClick = { /* Handle registration */ },
            modifier = Modifier
                .fillMaxWidth()
                .height(56.dp)
                .padding(12.dp,0.dp)
                ,
            shape = RoundedCornerShape(8.dp),
            colors = ButtonDefaults.buttonColors(
                containerColor = colorResource(id = R.color.button_color),
                contentColor = Color.White,

            )
        ) {
            Text(
                text = "Register",
                fontSize = 16.sp,
                textAlign = TextAlign.Center
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun OnboardingScreenPreview() {
    OnboardingScreen()
}

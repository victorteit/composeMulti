package ui.theme

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.material.Button
import androidx.compose.material.ModalDrawer
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp


@Composable
fun Screen1(onClick: () -> Unit) {
        Column(modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center){
            Text(text = "Screen 1", fontSize = 30.sp)
            Spacer(modifier = Modifier.height(30.dp))
            Button(onClick = {
        onClick()
            }){
                Text(text="Screen 2")
            }
        }
}

@Composable
fun Screen2(onClick: () -> Unit) {
    Column(modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center){
        Text(text = "Screen 2", fontSize = 30.sp)
        Spacer(modifier = Modifier.height(30.dp))
        Button(onClick = {
            onClick()
        }){
            Text(text="Screen 3")
        }
    }
}

@Composable
fun Screen3(onClick: () -> Unit) {
    Column(modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center){
        Text(text = "Screen 3", fontSize = 30.sp)
        Spacer(modifier = Modifier.height(30.dp))
        Button(onClick = {
            onClick()
        }){
            Text(text="Screen 1")
        }
    }
}
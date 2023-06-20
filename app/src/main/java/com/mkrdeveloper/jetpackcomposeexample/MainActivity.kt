package com.mkrdeveloper.jetpackcomposeexample

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import com.mkrdeveloper.jetpackcomposeexample.ui.theme.JetpackComposeExampleTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {

            FirstApp()
        }
    }
}


@Composable
fun FirstApp(){


    Surface(modifier = Modifier.fillMaxSize()) {

        Column(modifier = Modifier.fillMaxSize()) {
            Text(text = "Subscribe please", fontSize = 32.sp)
            Test1()
            Test2()
        }

    }
}

@Composable
fun Test1(){
    Text(text = "test1", fontSize = 32.sp)
}

@Composable
fun Test2(){
    Text(text = "test2", fontSize = 32.sp)
}


@Preview(showBackground = true, name = "android geek")
@Composable
fun AppPreview(){

    FirstApp()
}
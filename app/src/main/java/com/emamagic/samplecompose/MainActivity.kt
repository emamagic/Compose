package com.emamagic.samplecompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.emamagic.samplecompose.ui.theme.SampleComposeTheme
import java.net.CookieHandler

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Column (
                verticalArrangement = Arrangement.Center
                    ){
                LoadImage()
                Column(modifier = Modifier.padding(16.dp)) {
                    Text(text = "hello world")
                    Spacer(modifier = Modifier.padding(top = 10.dp))
                    Text(text = "salam")
                    Spacer(modifier = Modifier.padding(top = 10.dp))
                    Text(
                        text = "khobi",
                        fontSize = 24.sp,
                        modifier = Modifier.align(Alignment.CenterHorizontally)
                    )
                }
            }
        }
    }

    @Preview
    @Composable
    fun LoadImage() {
        Image(painter =
        painterResource(
            id = R.drawable.ic_launcher_background
        ),
            contentDescription = "background",
            modifier = Modifier.height(300.dp).fillMaxWidth(),
            contentScale = ContentScale.Crop
        )
    }
}


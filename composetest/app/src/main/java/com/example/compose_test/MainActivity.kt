package com.example.compose_test

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.compose_test.ui.theme.ComposetestTheme

class MainActivity : ComponentActivity() {
  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)


    setContent {
      ComposetestTheme {
        // A surface container using the 'background' color from the theme
        Surface(
          color = MaterialTheme.colors.background
        ) {
          Column {
            GreetingMessage(name = "Jun")
          }
        }
      }
    }
  }
}


@Composable
fun GreetingMessage(name: String) {
  val image = painterResource(id = R.drawable.full_img)

  Box() {

    Image(
      painter = image, contentDescription = "a girl",
      modifier = Modifier
        .fillMaxHeight()
        .fillMaxWidth(),
      contentScale = ContentScale.Crop
    )
    Text(
      text = "Welcome, $name",
      fontSize = 14.sp,
      modifier = Modifier.padding(start = 14.dp, top= 20.dp)
    )
  }


}


@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
  ComposetestTheme {
    GreetingMessage(name = stringResource(R.string.greeting_name))
  }
}
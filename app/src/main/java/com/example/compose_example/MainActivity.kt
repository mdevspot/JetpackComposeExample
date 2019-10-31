package com.example.compose_example

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.Composable
import androidx.compose.unaryPlus
import androidx.ui.core.*
import androidx.ui.foundation.DrawImage
import androidx.ui.foundation.shape.corner.RoundedCornerShape
import androidx.ui.graphics.Color
import androidx.ui.layout.*
import androidx.ui.material.MaterialTheme
import androidx.ui.res.imageResource
import androidx.ui.text.ParagraphStyle
import androidx.ui.text.TextStyle
import androidx.ui.text.font.FontFamily
import androidx.ui.text.style.TextAlign
import androidx.ui.tooling.preview.Preview

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MaterialTheme {
                MyCustomDesign()
            }
        }
    }
}

@Preview
@Composable
fun DefaultPreview() {
    MaterialTheme {
        MyCustomDesign()
    }
}

@Composable
fun MyCustomDesign() {
    DemoImage()
}

@Composable
fun DemoImage() {
    Column(
        crossAxisSize = LayoutSize.Expand,
        modifier = Spacing(16.dp)
    ) {
        Container(expanded = true, height = 150.dp,alignment = Alignment.BottomCenter) {
            Clip(shape = RoundedCornerShape(size = 5.dp)) {
                DrawImage(+imageResource(R.drawable.abc_1))
            }
            DemoText(name = "Android")
        }
    }
}

@Composable
fun DemoText(name: String) {
    Column(
        crossAxisSize = LayoutSize.Expand
    ) {
        Container(expanded = true) {
            Text(
                text = "Hello $name!",
                style = TextStyle(
                    color = Color.LightGray,
                    fontSizeScale = 1.2.toFloat(),
                    fontSize = 16.sp,
                    fontFamily = FontFamily.Serif
                )
            )
        }
        Container(
            expanded = true, padding = EdgeInsets(0.dp,0.dp,0.dp,5.dp)
        ) {
            Text(
                text = "This is an example of android jetpack compose toolkit, This is an example of android jetpack compose toolkit",
                paragraphStyle = ParagraphStyle(textAlign = TextAlign.Center),
                style = TextStyle(
                    color = Color.LightGray,
                    fontSize = 16.sp,
                    fontFamily = FontFamily.Serif
                )
            )
        }
    }

}

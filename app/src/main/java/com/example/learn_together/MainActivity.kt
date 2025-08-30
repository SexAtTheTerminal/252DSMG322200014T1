package com.example.learn_together

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.learn_together.ui.theme.LearntogetherTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            LearntogetherTheme {
                Surface(modifier = Modifier.fillMaxSize()) {
                    AppScreenContent()
                }
            }
        }
    }
}

@Composable
fun AppHeader(modifier: Modifier = Modifier) {
    val image = painterResource(R.drawable.bg_compose_background)

    Image(
        painter = image,
        contentDescription = null,
        modifier = modifier.fillMaxWidth()
    )
}

@Composable
fun AppText(
    text: String,
    fontSize: TextUnit = TextUnit.Unspecified,
    align: TextAlign = TextAlign.Start,
    modifier: Modifier = Modifier
    )
{
    Text(
        text = text,
        fontSize = fontSize,
        textAlign = align,
        modifier = modifier.fillMaxWidth()
    )
}

@Composable
fun AppScreenContent(){
    Column(modifier = Modifier.fillMaxSize()) {
        AppHeader()

        AppText(
            text = stringResource(R.string.title_jetpack_compose_tutorial),
            fontSize = 24.sp,
            modifier = Modifier.padding(16.dp)
        )

        AppText(
            text = stringResource(R.string.second_text_jetpack_compose),
            align = TextAlign.Justify,
            modifier = Modifier.padding(start = 16.dp, end = 16.dp)
        )

        AppText(
            text = stringResource(R.string.large_text_jetpack_compose),
            fontSize = 16.sp,
            align = TextAlign.Justify,
            modifier = Modifier.padding(16.dp)
        )
    }
}

@Preview(showBackground = true)
@Composable
fun AppPreview() {
    LearntogetherTheme {
        AppScreenContent()
    }
}
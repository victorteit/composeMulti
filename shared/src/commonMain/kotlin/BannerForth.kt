package ui.theme

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Card
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.ExperimentalComposeUiApi
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import org.jetbrains.compose.resources.ExperimentalResourceApi
import org.jetbrains.compose.resources.painterResource

@OptIn(ExperimentalResourceApi::class, ExperimentalComposeUiApi::class)
@Composable
fun BannerForth() {
    val modifier = Modifier
        .padding(16.dp)
        .fillMaxSize()

    Column(Modifier.fillMaxSize()) {
        Row(Modifier.weight(1f)) {
            QuadrantCard(modifier, Color(0xFFEADDFF), "First Quadrant", "First Text")
            QuadrantCard(modifier, Color(0xFFD0BCFF), "Second Quadrant", "Second Text")
        }
        Row(Modifier.weight(1f)) {
            QuadrantCard(modifier, Color(0xFFB69DF8), "Third Quadrant", "Third Text")
            QuadrantCard(modifier, Color(0xFFF6EDFF), "Fourth Quadrant", "Fourth Text")
        }
    }
}

@Composable
fun QuadrantCard(modifier: Modifier, color: Color, title: String, content: String) {
    Card(
        modifier = modifier,
        backgroundColor = color,
        elevation = 4.dp
    ) {
        Box(
            contentAlignment = Alignment.Center,
            modifier = Modifier.fillMaxSize()
        ) {
            Column(horizontalAlignment = Alignment.CenterHorizontally) {
                Text(
                    text = title,
                    fontSize = 16.sp,
                    fontWeight = FontWeight.Bold,
                    modifier = Modifier.padding(bottom = 16.dp)
                )
                Text(
                    text = content,
                    fontSize = 14.sp
                )
            }
        }
    }
}
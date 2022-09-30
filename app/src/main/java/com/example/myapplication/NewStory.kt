package com.example.myapplication

import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource

@Composable
fun NewStory(
    story: Story
){
    val colors = listOf(Color(0xFFffe53b), Color(0xFFff2525))

    Column {
        Image(painter =
             painterResource(id = story.storyImage)
            , contentDescription = "author",
            modifier = Modifier
                .clip(shape = CircleShape)
                .size(80.dp, 80.dp)
                .padding(5.dp)
                .border(
                    2.dp,
                    brush = Brush.horizontalGradient(colors = colors),
                    CircleShape
                )
        )
        Text(text = story.authorName,
            modifier = Modifier.width(80.dp),
            textAlign = TextAlign.Center
        )
    }


}
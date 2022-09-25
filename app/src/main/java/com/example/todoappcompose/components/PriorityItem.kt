package com.example.todoappcompose.components

import androidx.compose.foundation.Canvas
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.todoappcompose.data.model.PriorityModel
import com.example.todoappcompose.ui.theme.LARGE_PADDING
import com.example.todoappcompose.ui.theme.PRIORITY_INDICATOR_SIZE
import com.example.todoappcompose.ui.theme.Typography

@Composable
fun PriorityItem(priorityModel: PriorityModel) {
    Row(verticalAlignment = Alignment.CenterVertically) {
        Canvas(modifier = Modifier.size(PRIORITY_INDICATOR_SIZE)) {
            drawCircle(color = priorityModel.color)
        }
        Text(
            text = priorityModel.name,
            style = Typography.subtitle1,
            color = MaterialTheme.colors.onSurface,
            modifier = Modifier.padding(start = LARGE_PADDING)
        )
    }
}

@Composable
@Preview
fun PriorityItemPreview() {
    PriorityItem(priorityModel = PriorityModel.LOW)
}
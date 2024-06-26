package ru.igorkim.languageapp.core.design.composables

import androidx.compose.animation.core.animateFloat
import androidx.compose.animation.core.infiniteRepeatable
import androidx.compose.animation.core.rememberInfiniteTransition
import androidx.compose.animation.core.tween
import androidx.compose.foundation.background
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.composed
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.onGloballyPositioned
import androidx.compose.ui.layout.positionInWindow
import androidx.compose.ui.platform.LocalConfiguration
import androidx.compose.ui.platform.LocalDensity
import androidx.compose.ui.unit.IntSize
import androidx.compose.ui.unit.dp
import ru.igorkim.languageapp.core.design.styles.AppTheme

private const val SHIMMER_ANIM_LABEL = "shimmer"
private const val SHIMMER_REPEAT_DELAY = 1200

@Composable
fun Modifier.shimmerEffect(
    shimmerBackgroundColor: Color = AppTheme.colors.shimmerBackground,
    shimmerForegroundColor: Color = AppTheme.colors.shimmerForeground,
): Modifier = composed {
    var size by remember { mutableStateOf(IntSize.Zero) }
    var position by remember { mutableStateOf(Offset.Zero) }
    val transition = rememberInfiniteTransition(label = SHIMMER_ANIM_LABEL)

    val configuration = LocalConfiguration.current

    val windowWidth: Float

    with(LocalDensity.current) {
        windowWidth = configuration.screenWidthDp.dp.toPx()
    }

    val startOffsetX by transition.animateFloat(
        label = SHIMMER_ANIM_LABEL,
        initialValue = -position.x - windowWidth,
        targetValue = windowWidth * 2 - position.x,
        animationSpec = infiniteRepeatable(
            animation = tween(SHIMMER_REPEAT_DELAY)
        ),
    )

    background(
        brush = Brush.linearGradient(
            colors = listOf(
                shimmerBackgroundColor,
                shimmerForegroundColor,
                shimmerBackgroundColor,
            ),
            start = Offset(startOffsetX, 0f),
            end = Offset(startOffsetX + size.width.toFloat(), size.height.toFloat())
        )
    ).onGloballyPositioned {
        size = it.size
        position = it.positionInWindow()
    }
}

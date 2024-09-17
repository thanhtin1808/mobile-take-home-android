package com.android.takehome.features.userdetail.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.android.takehome.R

@Composable
internal fun UserStatisticsItem(modifier: Modifier = Modifier) {
    Row(
        modifier = modifier
            .wrapContentSize()
            .padding(
                vertical = 16.dp,
                horizontal = 22.dp
            ),
        horizontalArrangement = Arrangement.SpaceEvenly,
    ) {
        StatItem(
            modifier = modifier.weight(1f),
            iconRes = R.drawable.ic_user_follower,
            countText = "100+",
            labelText = "Follower"
        )
        StatItem(
            modifier = modifier.weight(1f),
            iconRes = R.drawable.ic_user_following,
            countText = "10+",
            labelText = "Following"
        )
    }
}

@Composable
internal fun StatItem(
    modifier: Modifier,
    iconRes: Int,
    countText: String,
    labelText: String,
) {
    Column(
        modifier = modifier
            .wrapContentSize()
            .padding(horizontal = 16.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {

        Box(
            contentAlignment = Alignment.Center,
            modifier = Modifier
                .size(60.dp)
                .background(color = colorResource(R.color.gray), shape = CircleShape)
        ) {
            Image(
                painter = painterResource(id = iconRes),
                contentDescription = null,
                modifier = Modifier.size(32.dp),
                contentScale = ContentScale.Fit
            )
        }

        Spacer(modifier = Modifier.height(4.dp))
        Text(
            maxLines = 1,
            overflow = TextOverflow.Ellipsis,
            text = countText,
            style = MaterialTheme.typography.bodyLarge.copy(
                fontWeight = FontWeight.Bold,
            ),
            color = colorResource(R.color.medium_gray)
        )
        Spacer(modifier = Modifier.height(4.dp))
        Text(
            maxLines = 1,
            overflow = TextOverflow.Ellipsis,
            text = labelText,
            style = MaterialTheme.typography.bodyLarge,
            color = Color.Gray
        )
    }
}

@Preview(showBackground = true)
@Composable
fun FollowersFollowingPreview() {
    MaterialTheme {
        UserStatisticsItem(modifier = Modifier.fillMaxSize())
    }
}

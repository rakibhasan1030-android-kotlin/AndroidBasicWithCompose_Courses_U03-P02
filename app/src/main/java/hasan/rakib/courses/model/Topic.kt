package hasan.rakib.courses.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class Topic(
    @StringRes val topicName: Int,
    val availableCourses: Int,
    @DrawableRes val topicImage: Int
)


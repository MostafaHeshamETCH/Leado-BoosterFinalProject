package com.example.leado.ui.home

import android.graphics.Color
import android.graphics.Typeface
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.res.ResourcesCompat
import com.example.leado.R
import com.example.leado.models.Badge
import com.example.leado.ui.profile.AboutMe
import com.example.leado.ui.profile.Badges
import com.example.leado.ui.profile.MyCourses
import com.example.leado.ui.profile.MyFriends
import kotlinx.android.synthetic.main.activity_friend.*

class HomepageActivity : AppCompatActivity()
{

    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_friend)
    }
}
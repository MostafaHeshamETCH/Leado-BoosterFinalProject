package com.example.leado.ui.profile

import android.content.Context
import android.content.Intent
import android.graphics.Color
import android.graphics.Typeface
import android.os.Bundle
import android.util.AttributeSet
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.res.ResourcesCompat
import com.example.leado.R
import com.example.leado.ui.home.HomepageActivity
import kotlinx.android.synthetic.main.activity_friend.*
import kotlinx.android.synthetic.main.activity_login.*

class ProfileActivity : AppCompatActivity()
{
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_friend)

        sign_in_btn.setOnClickListener {
            var i = Intent(this, HomepageActivity::class.java)
            startActivity(i)
        }
    }

    override fun onCreateView(name: String, context: Context, attrs: AttributeSet): View? {
        return super.onCreateView(name, context, attrs)

        val badgesFragment = Badges()
        val myCoursesFragment = MyCourses()
        val myFriendsFragment = MyFriends()
        val aboutMeFragment = AboutMe()

        supportFragmentManager.beginTransaction().apply {
            replace(R.id.flFragment, badgesFragment)
            commit()
        }

        myBadges_btn.setOnClickListener {
            myBadges_btn.setTextColor(Color.parseColor("#000000"))
            val myCustomFont : Typeface? = ResourcesCompat.getFont(this, R.font.montserrat_semibold)
            myBadges_btn.typeface = myCustomFont

            myCourses_btn.setTextColor(Color.parseColor("#808080"))
            val myCustomFont2 : Typeface? = ResourcesCompat.getFont(this, R.font.montserrat_regular)
            myCourses_btn.typeface = myCustomFont2
            friends_btn.setTextColor(Color.parseColor("#808080"))
            friends_btn.typeface = myCustomFont2
            aboutMe_btn.setTextColor(Color.parseColor("#808080"))
            aboutMe_btn.typeface = myCustomFont2

            supportFragmentManager.beginTransaction().apply {
                replace(R.id.flFragment, badgesFragment)
                commit()
            }
        }

        myCourses_btn.setOnClickListener{
            myCourses_btn.setTextColor(Color.parseColor("#000000"))
            val myCustomFont : Typeface? = ResourcesCompat.getFont(this, R.font.montserrat_semibold)
            myCourses_btn.typeface = myCustomFont

            myBadges_btn.setTextColor(Color.parseColor("#808080"))
            val myCustomFont2 : Typeface? = ResourcesCompat.getFont(this, R.font.montserrat_regular)
            myBadges_btn.typeface = myCustomFont2
            friends_btn.setTextColor(Color.parseColor("#808080"))
            friends_btn.typeface = myCustomFont2
            aboutMe_btn.setTextColor(Color.parseColor("#808080"))
            aboutMe_btn.typeface = myCustomFont2

            supportFragmentManager.beginTransaction().apply {
                replace(R.id.flFragment, myCoursesFragment)
                commit()
            }
        }

        friends_btn.setOnClickListener{
            friends_btn.setTextColor(Color.parseColor("#000000"))
            val myCustomFont : Typeface? = ResourcesCompat.getFont(this, R.font.montserrat_semibold)
            friends_btn.typeface = myCustomFont

            myBadges_btn.setTextColor(Color.parseColor("#808080"))
            val myCustomFont2 : Typeface? = ResourcesCompat.getFont(this, R.font.montserrat_regular)
            myBadges_btn.typeface = myCustomFont2
            myCourses_btn.setTextColor(Color.parseColor("#808080"))
            myCourses_btn.typeface = myCustomFont2
            aboutMe_btn.setTextColor(Color.parseColor("#808080"))
            aboutMe_btn.typeface = myCustomFont2

            supportFragmentManager.beginTransaction().apply {
                replace(R.id.flFragment, myFriendsFragment)
                commit()
            }
        }

        aboutMe_btn.setOnClickListener{
            aboutMe_btn.setTextColor(Color.parseColor("#000000"))
            val myCustomFont : Typeface? = ResourcesCompat.getFont(this, R.font.montserrat_semibold)
            aboutMe_btn.typeface = myCustomFont

            myBadges_btn.setTextColor(Color.parseColor("#808080"))
            val myCustomFont2 : Typeface? = ResourcesCompat.getFont(this, R.font.montserrat_regular)
            myBadges_btn.typeface = myCustomFont2
            myCourses_btn.setTextColor(Color.parseColor("#808080"))
            myCourses_btn.typeface = myCustomFont2
            friends_btn.setTextColor(Color.parseColor("#808080"))
            friends_btn.typeface = myCustomFont2

            supportFragmentManager.beginTransaction().apply {
                replace(R.id.flFragment, aboutMeFragment)
                commit()
            }
        }
    }
}
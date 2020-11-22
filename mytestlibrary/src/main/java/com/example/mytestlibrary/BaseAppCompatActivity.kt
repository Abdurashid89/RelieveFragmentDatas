package com.example.mytestlibrary

import androidx.appcompat.app.AppCompatActivity

/**
 *  Avvalo MainActvityda ushbu BaseAppCompatActivity classidan meros olliing.
 *  bu orqali IListener ning methodini override qilinadi
 * */
class BaseAppCompatActivity : AppCompatActivity(), IListener {
    override fun sendData(text: String, number: Int, isTrue: Boolean) {

    }
}

/**git init
git add README.md
git commit -m "first commit"
git branch -M main
git remote add origin https://github.com/Abdurashid89/RelieveFragmentDatas.git
git push -u origin main*/
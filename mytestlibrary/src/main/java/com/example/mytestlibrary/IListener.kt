package com.example.mytestlibrary
/**
 * Bu interface ning methodi orqali siz bir fragmentdan boshqasiga Int,String,Boolean tipidagi o'zgaruvchilarni yuborasiz
 * */
interface IListener {

    fun sendData( text: String = "",  number: Int = -1, isTrue: Boolean = true)
}
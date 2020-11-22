package com.example.mytestlibrary

import android.os.Bundle
import androidx.fragment.app.Fragment

/** Siz ishbu fragmentdan meros olib newInstance methodini
 *  chaqirib shu orqali data jo'natsangiz bo'ladi*/
class DataFragment : Fragment() {


    companion object {

        fun newInstance(text: String = "", number: Int = -1, isTrue: Boolean = true): DataFragment {
            var args = Bundle()
            val fragment = DataFragment()
            args.putBoolean(BOOL_KEY, isTrue)
            args.putInt(INT_KEY, number)
            args.putString(STRING_KEY, text)
            fragment.arguments = args
            return fragment
        }

        val BOOL_KEY = "boolean.key"
        val INT_KEY = "int.key"
        val STRING_KEY = "string.key"
    }
}
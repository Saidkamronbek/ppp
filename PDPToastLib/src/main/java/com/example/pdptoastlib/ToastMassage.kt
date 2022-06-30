package com.example.pdptoastlib

import android.content.Context
import android.os.MessageQueue
import android.widget.Toast

object ToastMassage {

    fun show(context: Context, message: String) {
        Toast.makeText(context, message, Toast.LENGTH_SHORT).show()
    }

}
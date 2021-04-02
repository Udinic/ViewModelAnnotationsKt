package me.osama.viewmodelannotationskt

import android.view.View
import android.widget.TextView

fun bindFields(item: Bill, view: View) {
    view.findViewById<TextView>(R.id.name).text = item.name
    view.findViewById<TextView>(R.id.amount).text = item.amount
}

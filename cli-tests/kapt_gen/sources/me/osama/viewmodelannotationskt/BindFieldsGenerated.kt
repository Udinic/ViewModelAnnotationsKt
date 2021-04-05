package me.osama.viewmodelannotationskt

import android.view.View
import android.widget.TextView
import kotlin.Unit

public fun bindFields(item: Bill, view: View): Unit {
  view.findViewById<TextView>(R.id.name).text = item.name
  view.findViewById<TextView>(R.id.amount).text = item.amount
}

package org.geeksforgeeks.lvinad

import android.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.ListView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val mCountry = arrayOf("India", "Brazil", "Argentina", "Portugal", "France", "England", "Italy")

        val mButton = findViewById<Button>(R.id.button_1)

        mButton.setOnClickListener {

            val mAlertDialogBuilder = AlertDialog.Builder(this)
            val mRowList = layoutInflater.inflate(R.layout.row, null)
            val mListView = mRowList.findViewById<ListView>(R.id.list_view_1)
            val mAdapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, mCountry)

            mListView.adapter = mAdapter
            mAdapter.notifyDataSetChanged()
            mAlertDialogBuilder.setView(mRowList)

            val dialog = mAlertDialogBuilder.create()
            dialog.show()
        }
    }
}
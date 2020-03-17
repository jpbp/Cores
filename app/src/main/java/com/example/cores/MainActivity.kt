package com.example.cores

import android.content.DialogInterface
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        // when button is clicked, show the alert
         }

    fun btnclick (view: View){
        val button = view as Button

        when(button.id){
            R.id.buttonVerde -> playCores(buttonVerde,"verde")
            R.id.button2 -> playCores(button2,"vermelho")
            R.id.button3 -> playCores(button3,"azul")
        }




    }

    fun playCores(btnSelecionado:Button,cor:String){
        btnSelecionado.setOnClickListener {
            // build alert dialog
            val dialogBuilder = AlertDialog.Builder(this)

            // set message of alert dialog
            dialogBuilder.setMessage("Do you want to close this application ?")
                // if the dialog is cancelable
                .setCancelable(true)
                // positive button text and action
                .setPositiveButton("Proceed",  DialogInterface.OnClickListener {
                        dialog, id ->  val intent = Intent(this, Main2Activity::class.java).apply {
                    putExtra("button", cor)

                }
                    startActivity(intent)
                })
                // negative button text and action
                .setNegativeButton("Cancel", DialogInterface.OnClickListener {
                        dialog, id -> dialog.cancel()
                })

            // create dialog box
            val alert = dialogBuilder.create()
            // set title for alert dialog box
            alert.setTitle("AlertDialogExample")
            // show alert dialog
            alert.show()
        }
    }

}

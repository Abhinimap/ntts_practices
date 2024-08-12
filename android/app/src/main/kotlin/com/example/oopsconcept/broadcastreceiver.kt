// package com.example.oopsconcept

// import android.content.BroadcastReceiver
// import android.content.Context
// import android.content.DialogInterface
// import android.content.Intent
// import android.widget.Toast
// import androidx.appcompat.app.AlertDialog
// import kotlinx.coroutines.CoroutineScope
// import kotlinx.coroutines.Dispatchers
// import kotlinx.coroutines.launch
// import kotlinx.coroutines.withContext

//  class BackgroundReceiver {
   
//     public fun showAlert(context: Context) {
//         AlertDialog.Builder(context)
//             .setTitle("Confirm")
//             .setMessage("Do you want to call the API?")
//             .setPositiveButton("OK") { _, _ ->
//                 callApi(context)
//             }
//             .setNegativeButton("Cancel", null)
//             .show()
//     }

//     private fun callApi(context: Context) {
//         CoroutineScope(Dispatchers.IO).launch {
//             // Perform network operation here
//             // Example:
//             // val response = apiService.someApiCall()
//             // if (response.isSuccessful) {
//             //     // Handle successful response
//             // }

//             withContext(Dispatchers.Main) {
//                 // Update UI or notify user on the main thread if needed
//                 Toast.makeText(context, "API Call Triggered", Toast.LENGTH_SHORT).show()
//             }
//         }
//     }
// }

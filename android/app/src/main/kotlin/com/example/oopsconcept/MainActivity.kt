package com.example.oopsconcept

import android.content.Intent
import com.example.oopsconcept.OverlayService
import io.flutter.embedding.android.FlutterFragmentActivity
import io.flutter.embedding.engine.FlutterEngine
import io.flutter.plugin.common.MethodChannel

class MainActivity: FlutterFragmentActivity(){
    private val myChannel="com.example.oopsconcept/api";
    private val overLayChannel = "com.example.oopsconcept/overlay";

    // private val obj=BackgroundReceiver();
    override fun configureFlutterEngine(flutterEngine: FlutterEngine) {
        super.configureFlutterEngine(flutterEngine)
        MethodChannel(flutterEngine.dartExecutor.binaryMessenger, myChannel).setMethodCallHandler{ call, result ->
           println("Kotlin->call method is ${call.method}");

            if (call.method == "callApi") {
                // Handle API call here
           println("Entered call.methd==callapi");
           
                result.success(null);
                // obj.showAlert(this);
            } 
            else if(call.method=="showOverlay"){
                // startService(Intent(this,OverlayService::class.java));
                val serv = OverlayService();
                serv.onCreate();
               
                result.success("yehhoo");
            }
            else {
                result.notImplemented()
            }
        };

    }


    
}

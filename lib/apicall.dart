import 'package:flutter/services.dart';

class ApiCaller {
  static const platform = MethodChannel('com.example.oopsconcept/api');
  Future<void> triggerApiCall() async {
    try {
      await platform.invokeMethod('callApi');
    } on PlatformException catch (e) {
      print("Failed to call API: '${e.message}'.");
    } catch (e){
      print('error occured calling callApi $e');
    }
  }

  Future<void> callOverlayFunc()async{
    try {
     print( await platform.invokeMethod('showOverlay'));
    } catch (e) {
      print('error occured while calling overlayfun : $e');
    }
  }
}

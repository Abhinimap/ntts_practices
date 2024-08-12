import 'dart:io' show Platform;
import 'package:flutter/material.dart';
import 'package:flutter/cupertino.dart';

Future<void> showConfirmationDialog(BuildContext context) async {
  if (Platform.isIOS) {
    // iOS-specific dialog
    final result = await showCupertinoDialog<bool>(
      context: context,
      builder: (context) => CupertinoAlertDialog(
        title: const Text('Confirm'),
        content: const Text('Do you want to call the API?'),
        actions: <Widget>[
          CupertinoDialogAction(
            child: const Text('Cancel'),
            onPressed: () => Navigator.of(context).pop(false),
          ),
          CupertinoDialogAction(
            child: const Text('OK'),
            onPressed: () => Navigator.of(context).pop(true),
          ),
        ],
      ),
    );
    if (result == true) {
      // _callApi();
      debugPrint('api is called');
    }
  } else {
    // Android-specific dialog
    final result = await showDialog<bool>(
      context: context,
      builder: (context) => AlertDialog(
        title: const Text('Confirm'),
        content: const Text('Do you want to call the API?'),
        actions: <Widget>[
          TextButton(
            child: const Text('Cancel'),
            onPressed: () => Navigator.of(context).pop(false),
          ),
          TextButton(
            child: const Text('OK'),
            onPressed: () => Navigator.of(context).pop(true),
          ),
        ],
      ),
    );
    if (result == true) {
      debugPrint('api is called');
    }
  }
}

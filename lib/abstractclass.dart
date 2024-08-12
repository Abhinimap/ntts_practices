import 'package:flutter/material.dart';

abstract class MyAbstractClass{
int callApi(int num);

}

class A implements MyAbstractClass{

  @override
  int callApi(int num) {
    debugPrint('called from class A');
    return 0;
  }
}


class B implements MyAbstractClass{
  @override
  int callApi(int num) {
    debugPrint('called from class B');
    return 56;
  }
}
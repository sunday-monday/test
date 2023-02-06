import 'package:flutter/material.dart';
import 'package:flutter/material.dart';
void main() {
  runApp(
      MaterialApp(
        home: SafeArea(
          child: Text(
            'with safearea',
            textAlign: TextAlign.center,
            style: TextStyle(
                fontSize: 50,
                color: Colors.yellow
            ),
          ),
        ),
      ));
}

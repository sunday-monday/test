import 'package:flutter/material.dart';

void main() {
  runApp(
      MaterialApp(
        home: Scaffold(
          appBar: AppBar(
            title: Text
              ("ANANYA SCAFFOLD APP"),
          ),
          body: Center(
            child: Text(
              "APPLICATION BODY WITH SCAFFOLDING",
              style: TextStyle(
                  color: Colors.redAccent
              ),
            ),
          ),
        ),
      )
  );
}

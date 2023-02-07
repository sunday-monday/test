//dependencies:
//  audioplayers: ^0.19.1
//  flutter:
//    sdk: flutter
      
//flutter:
//  uses-material-design: true
//  assets:
//    - assests/


import 'package:flutter/material.dart';
import 'package:audioplayers/audioplayers.dart';

void main() {
  runApp(MaterialApp(
      home:Scaffold(
        appBar: AppBar(
          title: Text('XYLOPHONE'),
          centerTitle: true,
        ), // Simple Appbar
        body: XyloPage(), // body now points to a DicePage which is a stateful widget
      ),
    ));
}

class XyloPage extends StatefulWidget {
  const XyloPage({Key? key}) : super(key: key);
  @override
  XyloPageState createState() => XyloPageState();
}
class XyloPageState extends State<XyloPage> {
  void playSound(int noteNumber) {
    final player = AudioCache();
    player.play("note$noteNumber.wav");
  }
  @override
  Widget build(BuildContext context) {
    return Column(
        crossAxisAlignment: CrossAxisAlignment.stretch, // Setting the column to occupy full screen width horizontally
        children: [
          Expanded(
            child: TextButton(
              style: TextButton.styleFrom(
                backgroundColor: Colors.amber
              ),
              onPressed: (){
                playSound(1);
                },
              child: Text('First'),
            ),
          ),
          Expanded(
            child: TextButton(
              style: TextButton.styleFrom(
                  backgroundColor: Colors.cyanAccent
              ),
              onPressed: (){
                playSound(2);
                },
              child: Text('Second'),
            ),
          ),
        ],
    );
  }
}

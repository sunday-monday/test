import 'package:flutter/material.dart';

void main() {
 runApp(
     MaterialApp(
       home: Scaffold( // Scaffold houses appBar and body property
         appBar:AppBar(
           title: Text(
               'Scaffold-SafeArea'
           ),
         ),
         body:Container(
           child: SafeArea( // Defining SafeArea as Child of Container
             child: Center(
               child: Text(
                   'This is a Sample Text',
                 style: TextStyle(
                   fontSize: 50,
                   color: Colors.lightGreen
                 ),
               ),
             ),
           ),
         ),
       ),
     )
 );
}

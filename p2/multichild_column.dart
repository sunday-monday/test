import 'package:flutter/material.dart';

void main() {
 runApp(MaterialApp(
   home:Scaffold(
     body: RowApp(
     ),
     ),
   ),);
}

class RowApp extends StatefulWidget {
 const RowApp({Key? key}) : super(key: key);

 @override
 _RowAppState createState() => _RowAppState();
}

class _RowAppState extends State<RowApp> {
 @override
 Widget build(BuildContext context) {
   return Container(
     child:SafeArea(
       child:Column(
         mainAxisAlignment: MainAxisAlignment.spaceEvenly,
         crossAxisAlignment: CrossAxisAlignment.start,
         children:[
           Container(
           height: 100,
           width: 100,
           color: Colors.blue, // change the color to red and green for other two

             child: Center(
               child: Text(
                 'First Child'
               ),
             ),
         ),
           Container(
             height: 100,
             width: 100,
             color: Colors.green, // change the color to red and green for other two
             child: Center(
               child: Text(
                 'second Child'
               ),
           ),
       ),
             Container(
               height: 100,
               width: 100,
               color: Colors.yellow, // change the color to red and green for other two
               child: Center(
                 child: Text(
                   'third Child'
                 ),
             ),
       ),
         ],
       ),// Color attribute for the inner container
   ), );
 }
}

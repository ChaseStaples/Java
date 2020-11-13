/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author S528345
 */
public class NewClass {
    var  x, y, z: integer;                       //global variables

foo( )

{

 var x:  integer;

x = 10;     

 print("in foo x, y, z are: "  x, y, z);           

return (x - y);                  

}

sub ( )

{

 var y:  integer;

y = 15;                       

 z =foo ( );   

x = x + 3;

print('in sub x, y, z  are:",  x,  y,  z);         

}

{

 main ( )           ---> main  execution starts here

{

 x = 3; y =5;  z = 7;                 

sub ( );

print("in main x, y, z are: " x, y, z);

}
}

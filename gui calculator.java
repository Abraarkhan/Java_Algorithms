package ptunes;
 
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Scanner;
import javax.script.ScriptEngineManager;
import javax.script.ScriptEngine;
import javax.script.ScriptException;
 
//import java.util.ActionEvent;
 
public class gui implements ActionListener {
 
public gui() {
 
}
 
public void actionPerformed (ActionEvent ae ){
 
// JOptionPane.showMessageDialog(ìHello is pressedî);
 
}
 
public static void main(String[] args) {
 
JFrame j = new JFrame("Buttons");
 
Container c = j.getContentPane();
//c.setLayout(new BorderLayout());
 
JPanel p1 = new JPanel();
p1.setLayout(new BorderLayout());
 
p1.setLayout(new GridLayout(4,4,4,4));
final JTextField t = new JTextField(100);
Font myFontSize = t.getFont().deriveFont(Font.BOLD,50f);
t.setFont(myFontSize);
c.add(t,BorderLayout.NORTH);
 
final JButton n1 = new JButton("1");
 
n1.addActionListener(new ActionListener(){
public void actionPerformed(ActionEvent e)
{
String num1 = n1.getText();
String global = t.getText();
global = global.concat(num1);
t.setText(global);
 
}
 
});
 
final JButton n2 = new JButton("2");
n2.addActionListener(new ActionListener(){
public void actionPerformed(ActionEvent e)
{
String num1 = n2.getText();
String global = t.getText();
global = global.concat(num1);
t.setText(global);
 
}
 
});
 
final JButton n3 = new JButton("3");
n3.addActionListener(new ActionListener(){
public void actionPerformed(ActionEvent e)
{
String num1 = n3.getText();
String global = t.getText();
global = global.concat(num1);
t.setText(global);
 
}
 
});
 
final JButton n4 = new JButton("4");
n4.addActionListener(new ActionListener(){
public void actionPerformed(ActionEvent e)
{
String num1 = n4.getText();
String global = t.getText();
global = global.concat(num1);
t.setText(global);
 
}
 
});
 
final JButton n5 = new JButton("5");
n5.addActionListener(new ActionListener(){
public void actionPerformed(ActionEvent e)
{
String num1 = n5.getText();
String global = t.getText();
global = global.concat(num1);
t.setText(global);
 
}
 
});
 
final JButton n6 = new JButton("6");
n6.addActionListener(new ActionListener(){
public void actionPerformed(ActionEvent e)
{
String num1 = n6.getText();
String global = t.getText();
global = global.concat(num1);
t.setText(global);
 
}
 
});
 
final JButton n7 = new JButton("7");
n7.addActionListener(new ActionListener(){
public void actionPerformed(ActionEvent e)
{
String num1 = n7.getText();
String global = t.getText();
global = global.concat(num1);
t.setText(global);
 
}
 
});
 
final JButton n8 = new JButton("8");
n8.addActionListener(new ActionListener(){
public void actionPerformed(ActionEvent e)
{
String num1 = n8.getText();
String global = t.getText();
global = global.concat(num1);
t.setText(global);
 
}
 
});
 
final JButton n9 = new JButton("9");
n9.addActionListener(new ActionListener(){
public void actionPerformed(ActionEvent e)
{
String num1 = n9.getText();
String global = t.getText();
global = global.concat(num1);
t.setText(global);
 
}
 
});
 
final JButton n10 = new JButton("0");
n10.addActionListener(new ActionListener(){
public void actionPerformed(ActionEvent e)
{
String num1 = n10.getText();
String global = t.getText();
global = global.concat(num1);
t.setText(global);
 
}
 
});
 
final JButton n11 = new JButton("+");
n11.addActionListener(new ActionListener(){
public void actionPerformed(ActionEvent e)
{
String num1 = n11.getText();
String global = t.getText();
global = global.concat(num1);
t.setText(global);
 
}
 
});
 
final JButton n12 = new JButton("-");
n12.addActionListener(new ActionListener(){
public void actionPerformed(ActionEvent e)
{
String num1 = n12.getText();
String global = t.getText();
global = global.concat(num1);
t.setText(global);
 
}
 
});
 
final JButton n13 = new JButton("*");
n13.addActionListener(new ActionListener(){
public void actionPerformed(ActionEvent e)
{
String num1 = n13.getText();
String global = t.getText();
global = global.concat(num1);
t.setText(global);
 
}
 
});
final JButton n14 = new JButton("/");
n14.addActionListener(new ActionListener(){
public void actionPerformed(ActionEvent e)
{
String num1 = n14.getText();
String global = t.getText();
global = global.concat(num1);
t.setText(global);
 
}
 
});
 
final JButton n15 = new JButton("=");
n15.addActionListener(new ActionListener(){
public void actionPerformed(ActionEvent e)
{
//String num1 = n15.getText();
String global = t.getText();
//global = global.concat(num1);
 
ScriptEngineManager mgr = new ScriptEngineManager();
ScriptEngine engine = mgr.getEngineByName("JavaScript");
try {
String s = engine.eval(global).toString();
t.setText(s);
 
} catch (ScriptException e1) {
e1.printStackTrace();
}
 
}
 
});
 
final JButton n16 = new JButton("C");
n16.addActionListener(new ActionListener(){
public void actionPerformed(ActionEvent e)
{
//String num1 = n16.getText();
String global = t.getText();
global = null;
t.setText(global);
 
}
 
});
 
p1.add(n1);
p1.add(n2);
p1.add(n3);
p1.add(n4);
p1.add(n5);
p1.add(n6);
p1.add(n7);
p1.add(n8);
p1.add(n9);
p1.add(n10);
p1.add(n11);
p1.add(n12);
p1.add(n13);
p1.add(n14);
p1.add(n15);
p1.add(n16);
 
c.add(p1,BorderLayout.CENTER);
 
j.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
j.setSize(400,400);
j.setVisible(true);
 
}
 
}
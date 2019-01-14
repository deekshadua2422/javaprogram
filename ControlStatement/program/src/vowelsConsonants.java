
import java.util.*;
class vowelsConsonants{
public static void main(String[] args) {
Scanner scn=new Scanner(System.in);
System.out.println("enter the alphabet");
String input=scn.next();
boolean uppercase = input.charAt(0)>=65 && input.charAt(0)<=90;
boolean lowercase = input.charAt(0)>=97 && input.charAt(0)<=122;
boolean vowels =
input.equals("a")||input.equals("e")||input.equals("i")||input.equals("o")||input.equals("u")||input.equals("A")||input.equals("E")||input.equals("I")||input.equals("O"
if(input.length()>1) {
System.out.println("the input is not a single character");
}else if(!(uppercase||lowercase)) {
System.out.println("input is not a letter");
}else if(vowels) {
System.out.println("input is a vowel");
}else {
System.out.println("input is a consonant");
}
}
}
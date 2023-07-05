public class AsciiValue {

    public static void main(String[] args) {

        char ch = 'a';
        int ascii = ch;
        // You can also cast char to int
        int castAscii = (int) ch;

        System.out.println("The ASCII value of " + ch + " is: " + ascii);
        System.out.println("The ASCII value of " + ch + " is: " + castAscii);
    }
}
Output

The ASCII value of a is: 97
The ASCII value of a is: 97
In the above program, character a is stored in a char variable, ch. Like, double quotes (" ") are used to declare strings, we use single quotes (' ') to declare characters.

Now, to find the ASCII value of ch, we just assign ch to an int variable ascii. Internally, Java converts the character value to an ASCII value.

We can also cast the character ch to an integer using (int). In simple terms, casting is converting variable from one type to another, here char variable ch is converted to an int variable castAscii.

Finally, we print the ascii value using the println() function.

Share on:
Did you find this article helpful?
Related Examples
Java Example

Check Whether a Character is Alphabet or Not

Java Example

convert int type variables to char

Java Example

convert char type variables to int

Java Example

Convert Character to String and Vice-Versa


Join our newsletter for the latest updates.
Enter Email Address
Join


Tutorials
Python 3 Tutorial
JavaScript Tutorial
SQL Tutorial
HTML Tutorial
R Tutorial
C Tutorial
C++ Tutorial
Java Tutorial
Rust Tutorial
Go Tutorial
Kotlin Tutorial
Swift Tutorial
C# Tutorial
DSA Tutorial
Examples
Python Examples
JavaScript Examples
C Examples
Java Examples
Kotlin Examples
C++ Examples
Company
About
Advertising
Privacy Policy
Terms & Conditions
Contact
Blog
Careers
Youtube
Apps
Learn Python
Learn C Programming
Learn Java
© Parewa Labs Pvt. Ltd. All rights reserved.

   


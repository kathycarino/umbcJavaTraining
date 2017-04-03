/** 
* Day 1: Morning - Hello and compiling and running your program
* Name of class has to match name of file.
* No matter what you want to do in java, put it inside a class.
* Always use uppercase for Class names
* In example below, HelloKathy, String, and System are classes
* Always use curly braces to include everything in your class.
* public static void main(String args[]) is cookie cutter code, 
* just copy it! (or use Eclipse shortcuts)
* "main" is a method, methods always have () after it, this one has void
* before it because it doesn't expect anything in return.
* whatever you want the method to do, put inside the {}
* System.out.println will print whatever you want to the screen,
* it takes only one argument - the string you want displayed
* Use as much whitespace as you want to make it readable
* See cmdImage1 for DOS commands to look at your directory,
* and your path, see cmdImage2 to see what happens when you type java and javac.
* where is it installed? Look in cmdImage3 for example (C:\Program Files\Java\jdk1.8.0_77\bin)
* now you can set your path (use paste if you pasted the url by right-clicking) see cmdImage4.
* Instead of doing it that way, use the setenv.cmd file which has "SET PATH=%PATH%" and
* edit it to say "SET PATH=C:\Program Files\Java\jdk1.8.0_77\bin;%PATH%", now run it in a new
* DOS prompt - see cmdImage5. Now try javac and it should look like cmdImage6.
* Now you should be able to compile using javac FileName.java (see cmdImage7 for example using
* this HelloKathy.java file). If it's not working, you didn't set your path right. If it compiles
* correctly you'll see FileName.class - see cmdImage8. Now you can run your program by
* simply typing java FileName and you should see your System.out.println message - see cmdImage9.
* Now try to run that command (java FileName) from the c:\ prompt (not in your javalabs directory)
* You will get an error - see cmdImage11. So let's get it to work from anywhere using CLASSPATH.
* Let's set our classpath to make it work from anywhere - see cmdImage12 amd cmdImage13. But now it
* will only work within that same DOS window. Let's update our setenv script and run that so I
* can get it to work from any DOS window. See cmdImage14.
* 
*/

public class HelloKathy {
    public static void main(String args[]) {
        System.out.println("Hello Kathy");
	System.out.println("Water Freezes @ 31\u00B0"); //just playing with some unicode - this displays the degrees symbol
    }
}
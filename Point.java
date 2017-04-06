package examples.arrays;
public class  Point {  //read only, only needs getters
    int xc, yc;		//x coordinate, y coordinate

    //here is my constructor
    public Point(int x, int y) {
        xc = x;
        yc = y;
    }
    
    //here are some instance methods - they need returns!
    public int getXc() {
        return xc;
    }
    public int getYc() {
        return yc;
    }
    public String toString() {
        return xc + "," + yc;
    }
}

//Instructor demo - create an array of points, see page 5-7
//note - after line 5 (in the binder, page 5-7, my lines are different because
//of comments I added), the array has null, null, null, so if you tried to access it
//you'd get a null pointer exception.
//remember, an array of ints or doubles can have initial values of zero (all numeric
//primitives initialize to zero, but this array of "Points" can't initialize
//to anything, it's not a primitive datatype it's an object, so it gets null.
//Refer to page 5-9 to see how to copy the array, explains difference
//between copying the reference (e.g., values = data) and copying
//the array (e.g., System.arraycopy(data, 0, values, 0, 2);
//Let's look at bottom of page 5-9, after you've done that copy,
//what happens if you do this:
//values[0] = new Point (10,12);
//sytem.out.println(data[0]); //what will print here?  6,7 Congratulatins, you have a copy! But wait is it really a true copy?
//what if you write:
//values[0].xc = 99
//system.out.println(data[0]);  //so if we have a true copy, should see 6, 7 - but we don't have a true copy, so we see 99.7, this is a shallow copy
//a standard way of getting a copy is the clonable interface but we haven't learned that yet
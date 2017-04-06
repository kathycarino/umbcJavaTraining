package examples.arrays;
public class PointTest {
    public static void main(String args[]) {
        Point data[];				//this gets me a reference pointing to the data array
        data = new Point[3];		//now my variable references the array of Point objects - size 3
							       //the array has null, null, null, so if you tried to access it
							       //you'd get a null pointer exception.
        data[0] = new Point(2,3); 	//put 2,3 in position 0 of the data array (remember 0-based!)
        data[1] = new Point(4,5); 	//put 4,5 in position 1 of the data array
        data[2] = new Point(6,7); 	//put 6,7 in position 2 of the data array
        for (int i = 0; i < data.length; i++)	//let's loop through our data array and 
            System.out.println(data[i]);		//print out each value to make sure we set them right
    }
}

//I don't understand this - it didn't use anything from your object class except the object?
//What did you need the getters for?
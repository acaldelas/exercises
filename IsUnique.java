public class IsUnique{
    /*******************
    I - So the problem is in a string are all the characters unique? Or do they vary? Don't use additonal data structures
    D - Define Goals, so our goal is to return true or false for our string, we want to say that it isn't a word, we wanna take in user input for our test cases
    E - Explore, so I can break the string into an array of chars and check with a loop 
    Duke 1. So lets do some test cases, "asd" should return true, "" will give us true because it technically is, "asd gh" should give us true. 
    Duke 2. so I took the work split it into to looking at the characters, I compared the first one to the next one and so on till the word finished, if the char I stopped and knew that it's not unique, but if the first character was not found I move to the next character and check after that. I don't have to check from the beginning again since I already did the comparisons. I repeat this till the whole word is complete
    Duke 3. So let's create an array size of the input for data to access
             you are going to need two loops to loop through everything in the arr and at every index compare the following
           If a word is there I need to break it 
    Duke 4. "asd" will look like [a,s,d] so loop through and index would be at a, so lets check if it pops up
    again, I need another loop to go through the rest of the array at position index of what I am trying to compare so compare a
     to s, a to d and no match so move index to the next position, index is at the next index of the array so it repeats til we find a 
     match 
    Duke 5. See code
    Duke 6. Run Test cases
    Duke 7. This problem would fail if something was wrong with the input. Maybe if it was null, but I am not sure how to input that
   

     L - Learn
     I believe that a more efficient way to solve this exists, maybe using a data struc, or possibly cycling through this only once instead of O(n^2) 
     */

    public static void main(String[] args){
	System.out.println("Time to check words");
	String word = "    ";
	String word2 = "hello";
	String word3 = "Help";
	String word4 = "HeH";
	String word5 = "asdfjkl;:";
	
	System.out.println(unique(word));
	System.out.println(unique(word2));
	System.out.println(unique(word3));
	System.out.println(unique(word4));
	System.out.println(unique(word5));
	
	
	
    }
    public static boolean unique(String str){
	//create our array
	char[] arr = str.toCharArray();
	//iterate through out the whole array
	for(int j = 0; j< arr.length; j++){
	    for(int k=j+1;k< arr.length;k++){
		if(arr[j] == arr[k]){
		    System.out.println(arr[j] +" is equal to " +arr[k]);
		    return false;
		}
	    }
	}
	return true;
	    
    }
}

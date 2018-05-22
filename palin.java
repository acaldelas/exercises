/*
I - Identify the problem
D - Define goals
We need to break the strings to figure out if they are actually 
palindromes, which are words that can be written backwards or forwards, and permutations are rearrangment of letters. 
This code needs to return a true of false.
E/A
1. Input: Tact Coa 
Output: True(permutations :"taco cat", "atco cta", etc.)
2. We took the word and made it into other strings, we need to have
an even count of chars so they can be shown on the other side and 
one odd char only for odd length strings and none for even length
3. We need to take an input that isn't null 
make a counter for the odd count because this will be the center
then we should make it lower case like in the example
then store into a hashmap using a loop
then loop through the entry set and ind how many chars we
have  if it's more than one reurn false
4.You take a string, check for null
create our oddcount, then we change it lowercase for our comparisons
Next we store into our map which will check if it exists or not
then we loop through our map and keep track of odd count then return
if is true
5.Code
6.Test cases
"taco Coa"
"nascar car"
"tactcoapapa"
7. It failed with my first case, I'm not sure why. 
This would fail if I input numbers
L - Learn
I learned about using hashmaps, and entry sets and how to use them
*/
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class palin{
    public static void main(String [] args){
	String phrase1 = "taco Coa";
	String phrase2 = "nascar car";
	String phrase3 = "tactcoapapa";

	boolean one = ispalinpermutation(phrase1);
	boolean two = ispalinpermutation(phrase2);
	boolean three = ispalinpermutation(phrase3);

	System.out.println(one);
	System.out.println(two);
	System.out.println(three);
    }
	
    public static boolean ispalinpermutation(String input){
	//Check if null
	if(input == null){
	    return false;
	}
	//create odd count
	int odd = 0;
	//change to lowercase
	input = input.toLowerCase();
	//create map and loop
	Map<Character,Integer> countMap = new HashMap<>();
	for(int i = 0; i <input.length(); i++){
	    //take cur char
	    char curr= input.charAt(i);
	    //check if it exists in map
	    if(countMap.containsKey(curr)){
		countMap.put(curr,countMap.get(curr)+1);
	    }
	    else{
		countMap.put(curr,1);
	    }
	}
	//we need the count of the char we have
	for(Entry<Character, Integer> key : countMap.entrySet()){
	    if(key.getValue() % 2 !=0)
		odd++;
	}
	return (odd<=1);
    }
}

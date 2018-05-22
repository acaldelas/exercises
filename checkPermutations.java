import java.util.Arrays;
public class checkPermutations{
    /*
I - Identify the problem
Given two strings, we need to write a method to decide if one is permutation of the other 
So we take two words, asd and dsa, these are permutations
D - Define Goals
So what I want is a method that will take two words
compare the characters then tell me if permutation exists or not
E - Explore solutions
So first thing that pops up in my head is making sure if they are the same size, if that fails just leave. We could make a hash set of the first word, then input the second into the set, since we can't haveduplicates the set shouldn't change. Or we can sort the array of chars and compare them any deviation will retrun false
Duke 1. Small instances
So if we have "asd" and "dsa" we should return true
"asdf" and "asdflllll" we need to return false
"a  " and "a" should return false
Duke 2. Steps
So we took the first string and looked at each individual character and we compare it to the other string
if we have any deviation we just leave the code 
If no deviation we say that it is a permutations
Duke 3. Find patterns
So we looked at each character in the string ---> for loop
if we had any deviation ---> if statement 
We need to store the string for comparisons ---> array

Duke 4. Check by hand
So we have a string str1 = "asd" and str2 = "dsa"
first lets make sure they are the same length, which they are 
now store the first string into and then we need to sort them
now we can check each one and if they aren't the same then we bail


    
     */
    public static void main(String[] args){
	System.out.println(permutation("asd","dsa"));


    }
    public static boolean permutation(String str1, String str2){
	//Lets check if theyre the same size
	if(str1.length() != str2.length())
	    return false;
	char[] arr = str1.toCharArray();
	char[] arr1 = str2.toCharArray();

	//sort the arrays
	Arrays.sort(arr);
	Arrays.sort(arr1);

	for(int i: arr){
	    if(arr[i] != arr1[i])
		return false;
	}
	return true;
    }


}

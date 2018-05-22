/*
I - Identify the problem, the problem is to take in a string and replace all spaces with '%20', we can assume that the string will have 
enough space to do so
D - Define goals
We need a method that will need to give us a new string that we
can print out with the new string 
E/A
Duke
1. Ex: "Mr John Smith    ", 13
       "Mr%20John%20Smith" 
Remove the excess chars, or only accept the first 13
2. So we took our string counted only the first 13 chars, then we
create a new string that contains the first 13 minus the spaces and
replaced them with %20
3. Store the string as an char array -->char[] but only with up to 
the int index
Find all spaces ---> loop through the array
if we find a space --> if statement
char to string ---> char to string and string to char
4. "John Smith   " 10  convet to an array 
for loop to the input
in loop check for space
if we have a space then
we add one to how many spaces we have
then create a new array
loop again and find spaces again and fill in with the new ones
5. See code 

*/
public class URLify{
    public static void main(String[] args){
	String str = "Mr John Smith    ";
	int index = 10;
	String res = url(str,index);
	System.out.println(res);
    }

    public static String url(String str, int index){
	char[] arr = str.toCharArray();
	int count = 0;
	for(int i = 0; i<index; i++){
	    if(arr[i] == ' ')
		count++;
		    
	}
	char[] arr2 = new char[index + count*2];
	int k = 0;
	for(int j = 0; j<arr2.length-1; j++){
	    if(arr2[j++] == ' '){
		arr2[j] = '%';
		arr2[j+1] = '2';
		arr2[j+2] = '0';
		j = j+3;
	    }
	    arr2[j] =arr[k];
	    k++;
	}
	String results = String.valueOf(arr2);
	return results;

    }



}

/*
I - There are three types of edits that can be performed on strings
insert, remove and replace. Make a method that checks if the input
only needs one correction
D - We need to return true or false if the amount of corrections is 
too high
E/A
1. Sample
pale, ple -> true
2. Write down
So we looked at the two strings, at each character we see that 
the word is only one letter short for string two so that is one 
correction 
then we saw that p matched
a did not match so that is one mistake
l did match 
e matches 
we only have one mistake so return true
3. Compare string sizes 
use bigger string for loop
count number of mistakes
if mistakes exceed 1 then return false
else return true
4. String one and two
if they are the same size we check for characters
if they are not find which one is bigger and it can't be more than
1
make another method that will check for if the characters are 
different, and if it exceeds one then return false
5. Code
6. Test Cases
7. Debug

L 
This seemed more tedious than thought before because the different options that can occur when you can either remove, insert giving us
three different ways of viewing if only mistake is found. Initially seems easy

*/
public class oneaway{
    public static void main(String[] args){
	String a = "ple";
	String b = "ale";
	String c = "bail";
	String d = "fail";
	String e = "faaaaaaaail";
	String f = "fail";

	boolean ab = isoneaway(a,b);
	boolean cd = isoneaway(c,d);
	boolean ef = isoneaway(e,f);

	System.out.println(ab);
	System.out.println(cd);
	System.out.println(ef);
    }
    public static boolean isoneaway(String str, String str2){
	//check if null
	if(str == null || str2 == null)
	    return false;
	//check if the lengths exceed 1
	if((str.length() - str.length())>=2)
	    return false;
	//check which type of operation we need to do
	if(str.length() == str2.length()){
	    return isreplace(str,str2);
	}else if(str.length() == str2.length()+1){
	    return isremoval(str,str2);
	}
	else if(str.length()+1 == str2.length()){
	    return isremoval(str2,str);
	}
	return false;
    }


    public static boolean isreplace(String input, String input2){
	int i = 0;
	int editcounter = 0;

	while(i<input.length()){
	    if(input.charAt(i) != input2.charAt(i)){
		editcounter++;
		i++;
	    }
	    i++;
	}
	return editcounter <=1;
    }
    public static boolean isremoval(String input, String input2){
	int count = 0;
	int i = 0;
	int j = 0;
	while(i<input2.length()){
	    if(input.charAt(i) != input2.charAt(j)){
		count++;
		i++;
	    }
	    i++;
	    j++;
	}
	return count <=1;
    }
}

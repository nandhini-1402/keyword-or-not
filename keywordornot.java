import java.util.*;
public class Main
{
	public static void main(String[] args) {
		String str[]={"case","continue","break","defer","default","if","else","for","func","goto","map","struct","type","return","range","var"};
		Scanner s=new Scanner(System.in);
		String word=s.next();
		int flag=0;
		for(int i=0;i<16;i++){
		    if(str[i].equals(word)){
		        flag=1;
		        break;
		    }
		}
		if(flag==1){
		    System.out.print(word+" is a keyword");
		}
		else{
		    System.out.print("is not a keyword");
		}
	}
}

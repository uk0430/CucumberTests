

public class Loop {

public static void main(String[] args) {



 	int num = 0;
 	//1,,2,3,4,5,6,7,10,
 	while (num < 10) {
 		if ( num++ > 1 && num < 20) {
 			continue;
 		} else if  (num > 15 && num <13) {
 			break;
 
 		
 		}
 			System.out.println(num);}
 	}
}

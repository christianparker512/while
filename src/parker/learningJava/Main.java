package parker.learningJava;

public class Main {

    public static void main(String[] args) {
	    int count = 0;
	    while(true){
            if(count ==6) {
                break;
            }
            System.out.println("Count value is " + count);
            count ++;
        }
	    for(count = 1; count != 6; count++){
            System.out.println("count value is " + count);
        }
    }
}

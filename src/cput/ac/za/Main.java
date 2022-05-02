/**
 * @author Liyabona Saki
 * implementation of stack data structure using arrays
 */

package cput.ac.za;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Stack st = new Stack();

        st.push(5);
        st.push(10);
        st.push(8);
        st.push(18);
        st.push(20);


//		System.out.println("Pop : " + st.pop());

        System.out.println("Peek : " + st.peek());

        st.show();
    }
}

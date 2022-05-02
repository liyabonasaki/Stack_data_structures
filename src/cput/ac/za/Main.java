/**
 * @author Liyabona Saki
 * implementation of stack data structure using arrays
 */

package cput.ac.za;

public class Main {

    public static void main(String[] args) {

        Stack st = new Stack();

        //pushing elements to the stack
        st.push(5);
        st.push(10);
        st.push(8);
        st.push(18);
        st.push(20);

        //popping first element from the stack
		System.out.println("Pop : " + st.pop());

		//selecting first element from the stack
        System.out.println("Peek : " + st.peek());

        st.show();
    }
}

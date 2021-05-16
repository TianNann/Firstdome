package conn.mt.demo1;

import conn.mt.demo.User;
import conn.mt.demo.ClassCollection;

public class First {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
	    User user=new User();
        user.usermethod();
        System.out.println("------------------------------");
        User user1=new User();
        user1.usermethod();
        ClassCollection classc=new ClassCollection();
        //conn.mt.demo1.User
        System.out.println("你好");
	}

}

package L;

import java.util.ArrayList;
import java.util.Scanner;

public class L_01 {
    ArrayList<String> name = new ArrayList<String>();
    ArrayList<String> origin = new ArrayList<String>();
    ArrayList<String> price = new ArrayList<String>();

    void Dev(){
        Scanner s = new Scanner(System.in);
        while(true){
            int menu = checkMenu(s);
            if(menu==1) add(s);
            else if(menu==2) modify(s);
            else if(menu==3) remove(s);
            else if(menu==4) list();
            else if(menu==5) totalNumber();
            else break;
        }
        System.out.print("Ended");

    }

    int checkMenu(Scanner s){
        System.out.print("1) add, 2) modify, 3) remove, 4) list, 5) total number, 6) exit > ");
        int a = s.nextInt();
        return a;
    }

    void add(Scanner s){
        System.out.println("Enter name, origin, price > ");
        name.add(s.next());
        origin.add(s.next());
        price.add(s.next());
    }
    void list(){
        System.out.println("================================================");
        System.out.println("num     name            origin          price");

        for(int i = 0; i<name.size(); i++){
            System.out.printf("%-3d     %3s             %3s             %s\n",i+1 , name.get(i),origin.get(i),price.get(i));
        }
    }

    void remove(Scanner s){
        list();
        System.out.print("Enter a number to remove > ");
        int del = s.nextInt();
        del--;
        name.remove(del);
        origin.remove(del);
        price.remove(del);
        System.out.println("Removed");
    }

    void modify(Scanner s){
        list();
        System.out.print("Enter a number to modify > ");
        int modi = s.nextInt();
        System.out.print("Enter name, origin, price > ");
        modi--;
        name.set(modi,s.next());
        origin.set(modi,s.next());
        price.set(modi,s.next());
    }

    void totalNumber(){
        System.out.printf("Number of registered menu is %d\n",name.size());
    }
}

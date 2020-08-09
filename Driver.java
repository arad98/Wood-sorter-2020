import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Driver {

    private ArrayList<Wood> woodList;

    public Driver() {
        fillList(10);
        printList();
    }

    public void fillList(int listLength) {
        ArrayList<Wood> wood = new ArrayList<>();
        for( int length = 0; length < listLength; length++) {
            wood.add(new Wood(returnRandom(1,6),returnRandom(1,6),returnRandom(2,16), (int) returnRandom(3,26),(int)returnRandom(1,100)));
        }
        Collections.sort(wood);
        woodList = wood;
    }



    public double returnRandom(int lower, int upper) {
        return (int) ((Math.random() * (upper - lower))+ lower);
    }

    public ArrayList<Wood> getWoodList() {
        return woodList;
    }

    public void setWoodList(ArrayList<Wood> woodList) {
        this.woodList = woodList;
    }

    public void printList() {
        for(Wood ind:woodList) {
                System.out.println(ind + " ");
        }

    }

    public static void main(String[] args) {
        new Driver();
    }

}

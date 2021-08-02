import java.util.ArrayList;
import java.util.List;

public class ActionClass {
    List<Integer> listX = new ArrayList<>();
    List<Integer> listY = new ArrayList<>();
    List<Integer> group1 = new ArrayList<>();
    List<Integer> group2 = new ArrayList<>();
    List<Integer> group3 = new ArrayList<>();

    protected void helpCommand(){
        System.out.println("add <point>        - добавить в память программы точки, координаты передаются парами чисел через пробел\n" +
                "                     прим. add 1 1 -2 -3 //добавить 2 точки: (1,1) и (-2,-3) \n"+
                "print              - напечатать построчно каждую из трех групп (входящие в них точки)\n" +
                "                     если в группу не попадает ни одна точка, то вывести сообщение, что группа пуста\n" +
                "                     последней строкой напечатать количество точек, не вошедших ни в одну группу");
    }
    protected void printCommand(){

    }
    private void calculate(){

    }
}

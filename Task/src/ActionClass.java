import java.util.ArrayList;
import java.util.List;

public class ActionClass {
    List<Integer> listX = new ArrayList<>();
    List<Integer> listY = new ArrayList<>();
    List<Integer> group1 = new ArrayList<>();
    List<Integer> group2 = new ArrayList<>();
    List<Integer> group3 = new ArrayList<>();
    int count;

    protected void addCommand(String[] res){
        for(int i = 1; i < res.length; i +=2) {
            listX.add(Integer.parseInt(res[i]));
            listY.add(Integer.parseInt(res[i+1]));
        }
    }
    protected void printCommand(){
        int count = 0;
            if(group1.size() == 0){
                System.out.println("Группа пуста");

            }
            else{
                for(int i= 0; i < group1.size(); i+=2){
                    System.out.print(group1.get(i) + " "+ group1.get(i+1) + " ");
                }
            }
        if(group2.size() == 0){
            System.out.println("Группа пуста");

        }
        else{
            for(int i= 0; i < group2.size(); i+=2){
                System.out.print(group2.get(i) + " "+ group2.get(i+1) + " ");
            }
        }
        if(group3.size() == 0){
            System.out.println("Группа пуста");

        }
        else{
            for(int i= 0; i < group3.size(); i+=2){
                System.out.print(group3.get(i) + " "+ group3.get(i+1) + " ");
            }
        }
        if(count > 0){
            System.out.println("Точек не вошедших ни в одну группу: " + count);
        }
    }
    protected void printWithParamCommand(int first, int second){

    }
    protected void removeCommand(int first, int second){

    }
    protected void calculate(){
        for(int i = 0; i < listX.size(); i++){
            int x = listX.get(i);
            int y = listY.get(i);
            if(y >= x){
                group1.add(x);
                group1.add(y);
            }
            else if(y >= Math.sqrt(x)){
                group2.add(x);
                group2.add(y);
            }
            else if(y >= Math.pow(x,3)){
                group3.add(x);
                group3.add(y);
            }
            else count+=2;
        }
    }
    protected void clearCommand(){
        listX.clear();
        listY.clear();
    }
    protected void helpCommand(){
        System.out.println("add <point>        - добавить в память программы точки, координаты передаются парами чисел через пробел\n" +
                "print              - напечатать построчно каждую из трех групп (входящие в них точки)\n" +
                "print <group_num>  - напечатать одним списком точки, входящие в группу(ы) переданную(ые) параметром <group_num>\n"+
                "remove <group_num> - удалить из памяти все точки, входящие в группу(ы) <group_num>\n"+
                "clear              - очистить память\n"+
                "help               - вывод справки по командам\n"+
                "exit               - выход из программы"
        );
    }
}

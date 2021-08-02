import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Введите команду:");
        Scanner sc = new Scanner(System.in);
        ActionClass ac = new ActionClass();
        String s;
        while (sc.hasNext()){
            s = sc.nextLine();
            if(s.contains("add")){
                String[] res = s.split(" ");
                for(int i = 1; i < res.length; i +=2) {
                    ac.listX.add(Integer.parseInt(res[i]));
                    ac.listY.add(Integer.parseInt(res[i+1]));
                }
            }
            else if(s.equals("print")){
                ac.printCommand();
            }
            else if(s.contains("print ")){

            }
            else if(s.equals("remove")){

            }
            else if(s.equals("clear")){
                ac.listX.clear();
                ac.listY.clear();
            }
            else if(s.equals("help")){
                ac.helpCommand();
            }

            else if(s.equals("exit")){
                break;
            }

        }
    }
}


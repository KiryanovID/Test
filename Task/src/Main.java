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
                String[] result = s.split(" ");
                ac.addCommand(result);
                ac.calculate();
            }
            else if(s.equals("print")){
                ac.printCommand();
            }
            else if(s.contains("print ")){
                String[] res = s.split(" ");
                ac.printWithParamCommand(Integer.parseInt(res[1]), Integer.parseInt(res[2]));
            }
            else if(s.equals("remove")){
                String[] result = s.split(" ");
                ac.removeCommand(Integer.parseInt(result[1]), Integer.parseInt(result[2]));
            }
            else if(s.equals("clear")){
                ac.clearCommand();
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


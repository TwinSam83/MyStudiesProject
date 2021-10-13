package AllLessons.Lesson4;

import java.util.Scanner;
public class KrestNolik {
    public static int[][] scan(int field[][],boolean xturn){
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите координаты ");
        if(xturn) System.out.print("крестика : ");
        else System.out.print("нолика : ");
        int pos = sc.nextInt();
        pos-=11;
        if (pos / 10 < 0 || pos / 10 > 2 || pos % 10 < 0 || pos % 10 > 2){
            System.out.println("Введены неверные координаты");
            scan(field,xturn);
        }
        else if(field[pos/10][pos%10]!=0){
            System.out.println("Данная клетка занята");
            scan(field,xturn);
        }
        else if(xturn){
            field[pos/10][pos%10]=1;
        }
        else{
            field[pos/10][pos%10]=2;
        }
        return field;
    }
    public static void main(String[] args) {
        int[][]field = {{0,0,0},{0,0,0},{0,0,0}};
        boolean gameover = false, xturn = true, draw = true;
        start();
        drawField(field);
        for (int i = 0; i < 9; i++){
            scan(field,xturn);
            drawField(field);
            gameover=gameLogic(field,gameover);
            xturn=!xturn;
            if(gameover){
                draw=false;
                break;
            }
        }
        if(draw) System.out.println("Ничья");
        else if(xturn) System.out.println("Победили нолики");
        else System.out.println("Победили крестики");
        System.out.println("\n\nДля продолжения введите любой символ и нажмите Enter...");
        Scanner sc = new Scanner(System.in);
        sc.next();
        main(args);
    }
    static void drawField(int[][] field){
        System.out.println("КРЕСТИКИ-НОЛИКИ\n╔═══╦═══╦═══╗");
        for (int i = 0; i < 3; i++) {
            System.out.print("║");
            for (int j = 0; j < 3; j++) {
                if(field[i][j]==1) System.out.print(" X ║");
                else if(field[i][j]==2) System.out.print(" O ║");
                else System.out.print("   ║");
            }
            if(i<2) System.out.println("\n╠═══╬═══╬═══╣ ");
            else System.out.println("\n╚═══╩═══╩═══╝\n");
        }

    }
    static boolean gameLogic(int[][] field,boolean gameover){ //Проверка на окончание игры
        for (int i = 0; i < 3; i++) {
            if((field[i][0]==field[i][1] && field[i][1]==field[i][2] && field[i][0]!=0)||
                    (field[0][i]==field[1][i]&&field[1][i]==field[2][i]&&field[0][i]!=0)){
                return true;
            }
        }
        if(field[0][0]==field[1][1] && field[1][1] == field[2][2] && field[0][0]!=0) return true;
        if(field[0][2]==field[1][1] && field[1][1] == field[2][0] && field[0][2]!=0) return true;
        return false;
    }
    static void start(){
        Scanner sc= new Scanner(System.in);
        System.out.println("╔═══╦═══╦═══╗\n" +
                "║ T ║ I ║ C ║\n" +
                "╠═══╬═══╬═══╣ \n" +
                "║ T ║ A ║ C ║\n" +
                "╠═══╬═══╬═══╣\n" +
                "║ T ║ O ║ E ║\n" +
                "╚═══╩═══╩═══╝\n" +
                "Координаты клеток вводятся как двузначное число XY\nГде X - номер строки, Y - номер столбца");
        System.out.print("Для продолжения введите любой символ и нажмите Enter...");
        sc.next();
    }
}

public class PatternMaker {
    public static void main(String[] args) {
        PatternMaker stripes = new PatternMaker();
    }

    public PatternMaker() {
        //System.out.println("Hi, Pattern Maker!");

        pattern9();
    }

    public void pattern1() {
        //for(int x=0; x<1; x++) {
        for (int y = 0; y < 5; y++) {
            System.out.println(y * 5);
        }
        //}
    }

    public void pattern2() {
        //for(int x=0; x<5; x++) {
        for (int y = 0; y < 6; y++) {
            System.out.println(2 + y * 5);
        }
        //}
    }

    public void pattern3() {
        for (int i = 0; i < 6; i++) {
            System.out.print(21 - i * 4 + "\t");
        }
        for (int w = 21; w > 0; w = w - 4) {
            System.out.print(w);
        }
    }

    public void pattern4() {
        for (int i=0; i<6; i++) {
            System.out.println(2+5*i);
        }
    }

    public void pattern5() {
        for (int x = 0; x < 4; x++) {
            for (int y = 1; y < 5; y++) {
                System.out.print(y + "\t");
            }
            System.out.println();
        }
    }

    public void pattern6() {
        for (int a = 0; a < 5; a++) {
            for (int b = 0; b < a; b++) {
                System.out.print(" ");
            }
            System.out.println(a+1);
        }
    }

    public void pattern7() {
        for (int x=6; x>0; x--) {
            for (int y=1; y<x; y++) {
                System.out.print(7-x + " ");
            }
          System.out.println();
        }
    }

    public void pattern8() {
        for (int a = 5; a > 0; a--) {
            for(int c=0; c<5-a; c++) {
                System.out.print(" ");
            }
            for (int b = 0; b < a; b++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public void pattern9() {
        for (int a = 4; a > -1; a--) {
            for(int c=1; c<8-a; c++) {
                System.out.print(" ");
            }
            for (int b = 1; b < a+3; b++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public void pattern11() {
        for (int a = 1; a < 6; a++) {
            for (int b = 0; b < a; b++) {
                System.out.print("#" + " ");
            }
            System.out.println();
        }
    }
}
public class PatternMaker {
    public static void main(String[] args) {
        PatternMaker stripes = new PatternMaker();
    }

    public PatternMaker() {
        //System.out.println("Hi, Pattern Maker!");

        pattern5();
    }

    public void pattern1() {
        //for(int x=0; x<1; x++) {
            for(int y=0; y<5; y++) {
                System.out.println(y*5);
            }
        //}
    }

    public void pattern2() {
        //for(int x=0; x<5; x++) {
        for(int y=0; y<6; y++) {
            System.out.println(2+y*5);
        }
        //}
    }

    public void pattern3() {
        for(int i=0; i<6; i++) {
            System.out.print(21-i*4 + "\t");
        }
        for(int w=21; w>0; w=w-4) {
            System.out.print(w);
        }
    }

    public void pattern5() {
        for(int x=0; x<4; x++) {
            for(int y=1; y<5; y++) {
                System.out.print(y + "\t");
            }
            System.out.println();
        }
    }
}
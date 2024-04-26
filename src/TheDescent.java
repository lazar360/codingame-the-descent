import java.util.*;

/**
 * The while loop represents the game.
 * Each iteration represents a turn of the game
 * where you are given inputs (the heights of the mountains)
 * and where you have to print an output (the index of the mountain to fire on)
 * The inputs you are given are automatically updated according to your last actions.
 **/
class Player {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        List<Integer> listHeight = new ArrayList<>();

        // game loop
        while (true) {
            Integer heightMax = 0;
            Integer heightMaxIndex = 0;
            for (int i = 0; i < 8; i++) {
                int mountainH = in.nextInt(); // represents the height of one mountain.
                listHeight.add(mountainH);
            }

            for(int i = 0; i < 8; i++){
                if(listHeight.get(i)> heightMax){
                    heightMax = listHeight.get(i);
                }
            }

            for(int i = 0; i < 8; i++){
                if(listHeight.get(i) == heightMax){
                    heightMaxIndex = i;
                }
            }

            // Write an action using System.out.println()
            // To debug: System.err.println("Debug messages...");
            System.out.println(heightMaxIndex); // The index of the mountain to fire on.
            listHeight.clear();
        }
    }
}

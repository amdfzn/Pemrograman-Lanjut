package Sololearn.ExceptionListThreadsFiles;

import java.util.*;
class BowlingGame {
        HashMap<String, Integer> players;
        BowlingGame() {
            players = new HashMap<String, Integer>();
        }
        public void addPlayer(String name, int p) {
            players.put(name, p);
        }
        //your code goes here
        public void getWinner() {
            String winner = "";
            int mrk = 0;
            for(String nm:players.keySet()) {
                if(players.get(nm)>mrk) {
                    winner = nm;
                    mrk = players.get(nm);
                }
            }
            System.out.println(winner);
        }
    }

class Winner {
        public static void main(String[ ] args) {
            BowlingGame game = new BowlingGame();
            Scanner sc = new Scanner(System.in);

            for(int i=0;i<3;i++) {
                String input = sc.nextLine();
                String[] values = input.split(" ");
                String name = values[0];
                int points = Integer.parseInt(values[1]);
                game.addPlayer(name, points);
            }
            game.getWinner();
        }
}

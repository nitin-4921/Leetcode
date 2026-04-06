import java.util.*;

class Solution {
    public int robotSim(int[] commands, int[][] obstacles) {
        
        // Directions: North, East, South, West
        int[][] dirs = {{0,1}, {1,0}, {0,-1}, {-1,0}};
        int d = 0; // start facing north
        
        int x = 0, y = 0;
        int maxDist = 0;
        
        // Store obstacles in HashSet
        Set<String> set = new HashSet<>();
        for (int[] obs : obstacles) {
            set.add(obs[0] + "," + obs[1]);
        }
        
        for (int cmd : commands) {
            
            if (cmd == -1) {
                d = (d + 1) % 4; // turn right
            } 
            else if (cmd == -2) {
                d = (d + 3) % 4; // turn left
            } 
            else {
                int dx = dirs[d][0];
                int dy = dirs[d][1];
                
                for (int i = 0; i < cmd; i++) {
                    int newX = x + dx;
                    int newY = y + dy;
                    
                    if (set.contains(newX + "," + newY)) {
                        break; // obstacle found
                    }
                    
                    x = newX;
                    y = newY;
                    
                    maxDist = Math.max(maxDist, x*x + y*y);
                }
            }
        }
        
        return maxDist;
    }
}
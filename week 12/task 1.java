import java.util.*;

public class MeetingRooms {
    public int minMeetingRooms(int[][] meetings) {
        TreeMap<Integer, Integer> timeline = new TreeMap<>();
        
        for (int[] m : meetings) {
            timeline.put(m[0], timeline.getOrDefault(m[0], 0) + 1);
            timeline.put(m[1], timeline.getOrDefault(m[1], 0) - 1);
        }
        
        int maxRooms = 0;
        int currentRooms = 0;
        for (int count : timeline.values()) {
            currentRooms += count;
            maxRooms = Math.max(maxRooms, currentRooms);
        }
        
        return maxRooms;
    }
}

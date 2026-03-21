class UndergroundSystem {

    Map<Integer, Object[]> checkInMap = new HashMap<>();
    Map<String, int[]> routeMap = new HashMap<>();

    public void checkIn(int id, String stationName, int t) {
        checkInMap.put(id, new Object[]{stationName, t});
    }
    
    public void checkOut(int id, String stationName, int t) {
        Object[] data = checkInMap.get(id);
        checkInMap.remove(id);

        String start = (String) data[0];
        int time = t - (int) data[1];

        String key = start + "-" + stationName;

        routeMap.putIfAbsent(key, new int[2]);
        routeMap.get(key)[0] += time;
        routeMap.get(key)[1] += 1;
    }
    
    public double getAverageTime(String startStation, String endStation) {
        int[] data = routeMap.get(startStation + "-" + endStation);
        return (double) data[0] / data[1];
    }
}

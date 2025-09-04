public class FindClosestPerson {
    public static String findClosestPerson(String[] names, String target) {
        int minDistance = Integer.MAX_VALUE;
        String closestPerson = null;

        for (String name : names) {
            int distance = calculateDistance(name, target);
            if (distance < minDistance) {
                minDistance = distance;
                closestPerson = name;
            }
        }

        return closestPerson;
    }

    private static int calculateDistance(String name1, String name2) {
        
        return Math.abs(name1.length() - name2.length());
    }
}

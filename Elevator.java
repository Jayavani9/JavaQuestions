public class Elevator {

    public static void main(String[] args) {
        int currentFloor = 0;

        currentFloor = moveToFloor(currentFloor, 4);
        currentFloor = moveToFloor(currentFloor, 3);
        currentFloor = moveToFloor(currentFloor, 1);
    }

    static int moveToFloor(int curr, int next) {
        curr = next;
        System.out.println("Arrived at " + curr);
        return curr;
    }
}

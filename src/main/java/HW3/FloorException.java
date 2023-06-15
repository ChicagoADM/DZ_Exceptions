package HW3;

public class FloorException extends Exception {
    public FloorException() {
    }

    public void floorException(String i) {
        System.out.println("Exception: SexNotCorrectData");
        System.out.printf("It`s not correct data: %s", i);
        System.out.println();
    }
}

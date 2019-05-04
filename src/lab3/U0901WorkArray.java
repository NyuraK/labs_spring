package lab3;

public class U0901WorkArray<T extends Number> {
    T[] arrNums;

    public U0901WorkArray(T[] numP) {
        this.arrNums = numP;
    }

    double sum () {
        double doubleWork=0;
        for (Number n: arrNums)
            doubleWork += n.doubleValue();
        return doubleWork;
    }

    private static <T extends Number> double sum (T[] arr) {
        double sum=0;
        for (Number n : arr)
            sum += n.doubleValue();
        return sum;
    }

}

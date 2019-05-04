package sync;

public class U1901Bank {
    private static int intTo;
    private static int intFrom = 220;

    public U1901Bank() {
    }

    public synchronized void calc(int intTransaction, long lngTimeout, int i) {
        System.out.println("Before:\n" + "intTo: " + intTo + " intFrom: " + intFrom
                + " CurrentThread: " + Thread.currentThread().getName() + " instance " + i);
        intFrom -= intTransaction;
        try {
            Thread.sleep(lngTimeout);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        intTo += intTransaction;
        System.out.println("After:\n" + "intTo: " + intTo + " intFrom: " + intFrom
                + " CurrentThread: " + Thread.currentThread().getName() + " instance " + i);
    }

    public void not_sync(int intTransaction, long lngTimeout) {
        System.out.println("In not sync before:\n" + "intTo: " + intTo + " intFrom: " + intFrom
                + " CurrentThread: " + Thread.currentThread().getName());
        intFrom -= intTransaction;
        try {
            Thread.sleep(lngTimeout);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        intTo += intTransaction;
        System.out.println("In not sync after:\n" + "intTo: " + intTo + " intFrom: " + intFrom
                + " CurrentThread: " + Thread.currentThread().getName());
    }
}

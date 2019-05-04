package sync;

public class U1901Thread extends Thread {
    U1901Bank bankWork;
    U1901Bank bankWork2;
    int intTrans;
    long lngSleep;

    public U1901Thread(U1901Bank bank, int trans, long sleep) {
        bankWork = bank;
        intTrans = trans;
        lngSleep = sleep;
        bankWork2 = new U1901Bank();
    }

    @Override
    public void run() {
        System.out.println("execute");
        synchronized (U1901Bank.class) {
            bankWork.calc(intTrans, lngSleep, 1);
            bankWork2.calc(intTrans, lngSleep, 2);
        }

    }
}

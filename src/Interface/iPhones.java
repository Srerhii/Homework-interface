package Interface;

public class iPhones implements Smartphones, iOS {
    @Override
    public void call() {
        System.out.println("call number 911");
    }
    @Override
    public void sms() {
        System.out.println("write letter ");
    }
    @Override
    public void internet() {
        System.out.println(" watching youtube ");
    }
    @Override
    public void fasWork() {
        System.out.println("fast touch screen operation ");
    }
    @Override
    public void goodCamera() {
        System.out.println("camera with stabilization ");
    }
    public void skillsiPhone() {
        call();
        sms();
        internet();
        fasWork();
        goodCamera();

    }
}
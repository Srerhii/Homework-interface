package Interface;

public class  Androids implements Smartphones, LinuxOS {


    @Override
    public void call() {
        System.out.println("call number +3 8093");
    }

    @Override
    public void sms() {
        System.out.println("write sms ");
    }

    @Override
    public void internet() {
        System.out.println(" chat in social app ");
    }

    @Override
    public void easyToUse() {
        System.out.println("clear interface ");
    }

    @Override
    public void badUpdates() {
        System.out.println("rapid performance degradation ");


    }


    public void skillsAndroid (){
        call();
        sms();
        internet();
        easyToUse();
        badUpdates();
    }

}

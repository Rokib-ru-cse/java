package designpattern.observer.teluskotest;

public class Youtube {


    public static void main(String[] args) {
        Observable rtv = new Channel();
        Observable ntv = new Channel();
        Observable btv = new Channel();


        Observer rokib = new Subscriber("rokib");
        Observer rashik = new Subscriber("rashik");
        Observer sayed = new Subscriber("sayed");
        Observer emran = new Subscriber("emran");
        Observer mahfuz = new Subscriber("mahfuz");
        Observer nabil = new Subscriber("nabil");

        rtv.subscribe(rokib);
        rtv.subscribe(rashik);
        rtv.subscribe(sayed);
        rtv.subscribe(emran);
        rtv.subscribe(mahfuz);

        ntv.subscribe(nabil);
        ntv.subscribe(rokib);
        ntv.subscribe(rashik);

        btv.subscribe(rashik);
        btv.subscribe(rokib);
        btv.subscribe(sayed);

        rokib.subscribe(rtv);
        rokib.subscribe(ntv);
        rokib.subscribe(btv);


        rashik.subscribe(ntv);
        emran.subscribe(ntv);
        sayed.subscribe(ntv);

        rtv.upload("video one is uploaded");
        System.out.println("xxxxxxxxxxxxx");
        ntv.upload("video two is uploaded");
        System.out.println("xxxxxxxxxxxxx");
        btv.upload("video three is uploaded");


    }
}

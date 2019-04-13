package com.company;

public class Main {

    public static void main(String[] args) {


        //===============================================
        //                      TV
        //===============================================

        IDevice tv = new TV();
        IRemote remote1 = new BasicRemote(tv);
        remote1.decrease();
        remote1.enable();
        remote1.info();
        remote1.down();
        remote1.info();
        remote1.increase();
        remote1.up();
        remote1.info();

       //================================================
       //                  Split System
       //================================================

        IDevice split = new SplitSystem();
        IRemote remote2 = new BasicRemote(split);
        remote2.enable();
        remote2.info();
        remote2.increase();
        remote2.info();
        remote2.increase();
        remote2.info();
        remote2.increase();
        remote2.up();
        remote2.info();
    }
}

class A extends Thread{
        public void run(){
        for (int i=1;i<=5;i++){
                System.out.println("From Thread1 A: i = " +i);
                if (i==3){
                Thread.yield();
                }
                        }
        System.out.println("---EXIT FROM A---");
        }
}
class B extends Thread{
        public void run(){
        for (int j=1;j<=5;j++){
                System.out.println("From Thread1 B: j = " +j);
                try{
                Thread.sleep(500);
                }
                catch (InterruptedException e){
                System.out.println(e);
                }
                        }
        System.out.println("---EXIT FROM B---");
        }
}


class C extends Thread{
        public void run(){
        synchronized (this) {
                for (int k=1;k<=5;k++){
                System.out.println("From Thread1 C: k = " +k);
                try{
                 wait(1000);
                }
                catch(InterruptedException e){
                System.out.println(e);
            }
                }
        System.out.println("---EXIT FROM C---");
        }
}
}


class Thread1{
public static void main(String[]args){
        A threadA = new A();
        B threadB = new B();
        C threadC = new C();

        threadA.start();
        threadB.start();
        threadC.start();
}
}

public class UsaClasses {
    public static void main(String[] args) {
        Corrente cc = new Corrente("Bradesco",0011,1122,1000);
        cc.depositar(100);
        cc.sacar(1100);
        System.out.println(cc);

        Poupanca cp = new Poupanca("Bradesco",0011,1122,20);
        cp.depositar(100);
        cp.sacar(90);
        System.out.println(cp);

    }
}

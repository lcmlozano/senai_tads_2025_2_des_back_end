package exemplo02;

public class Conta {
    private int agencia;
    private int numero;
    private double saldo;

    public Conta(int agencia, int numero) {
        //this.agencia = agencia;
        //this.numero = numero;
        this.setAgencia(agencia);
        this.setNumero(numero);
        this.setSaldo(100);
    }
    
    public Conta(int numero){
        this.agencia = 1500;
        this.setNumero(numero);
        this.setSaldo(0);
    }

    
    public int getAgencia() {
        return agencia;
    }

    public void setAgencia(int agencia) {
        //aceitar agencia com número entre 1 e 9999
        /*
        Tabela verdade do E (&&)
        V && V = V
        V && F = F
        F && V = F
        F && F = F
        Na tabela verdade do E, apenas terei resposta verdadeira
        se ambas proposições forem verdadeiras
        */
        if (agencia >= 1 && agencia <= 9999){
            this.agencia = agencia;
        }
        else{
            System.out.println("Agencia Inválida");
        }  
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        //aceitar conta com número entre 10000 e 20000
        if (numero >= 10000 && numero <= 20000){
            this.numero = numero;
        }
        else{
            System.out.println("Numero Inválido");
        }  
    }

    public double getSaldo() {  
        return saldo;
    }

    private void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    /*criar um método para depositar valor na conta com retorno 
    booleano
    */
    public boolean depositar(double vlr_deposito){
        if(vlr_deposito > 0){
            this.setSaldo(this.saldo + vlr_deposito);
            return true;
        }
        else{
            System.out.println("Valor de deposito inválido!");
            return false;
        }
    }
    /*criar um método para sacar um valor da conta com retorno
    booleano
    */
    public boolean sacar(double vlr_saque){
        if(vlr_saque > 0 && this.saldo >= vlr_saque){
            this.setSaldo(this.saldo - vlr_saque);
            return true;
        }
        else{
            System.out.println("Saque não permitido");
            return false;
        }
    }
    
    public String imprimirDados(){
        return("Agência: " + this.agencia +
             "\nConta: " + this.numero + 
             "\nSaldo: " + this.saldo);
    }
    
}

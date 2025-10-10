public class Poupanca extends Conta{
    private int aniversario;

    public Poupanca(String banco, int agencia, int conta, int aniversario) {
        super(banco, agencia, conta);
        //this.aniversario = aniversario;
        this.setAniversario(aniversario);
    }

    public int getAniversario() {
        return aniversario;
    }

    public void setAniversario(int aniversario) {
        if (aniversario >= 1 && aniversario <= 30){
            this.aniversario = aniversario;
        }
        else{
            System.out.println("Aniversario Inválido");
        }
    }

    public String toString(){
        /*
        return "Banco: " + super.getBanco() +
                "\nAgencia: " + super.getAgencia() +
                "\nConta: " + super.getConta() +
                "\nSaldo: " + super.getSaldo() +
                "\nAniversario: " + this.aniversario;

         */
        return super.toString() + "\nAniversario: " + this.aniversario;
    }
}

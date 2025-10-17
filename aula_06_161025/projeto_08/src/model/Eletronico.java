package model;

public class Eletronico extends Produto{
    private int voltagem;

    public Eletronico(int c, String d, double v, int vo) {
        super(c, d, v);
        this.setVoltagem(vo);
    }

    public int getVoltagem() {
        return voltagem;
    }

    public void setVoltagem(int argVolt) {
        if(argVolt == 110 || argVolt == 220){
            this.voltagem = argVolt;
        }
        else{
            System.out.println("Voltagem incorreta");
        }
    }

    public String print(){
        String ret;
        ret = super.print();
        ret =  ret + "\nVoltagem: " + this.voltagem;
        return ret;
    }
}

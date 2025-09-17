public class Principal {
    public static void main(String[] args) {
        //variáveis
        String nome;
        int idade;
        double renda;
        
        //entradas
        nome = "Luiz";
        idade = 41;
        renda = 600.0;
        
        //processamento
        //renda = renda + ((renda * 10)/100);
        
        //saída
        System.out.println("A renda do "+ nome + " é de " + renda);
        double bonus = bonificar();
        renda = renda + bonus;
        atualizarRenda(renda);
        
    }
    
    static void atualizarRenda(double argRenda){
        double rendaAtualizada = argRenda + ((argRenda * 10)/100);
        //double rendaAtualizada = argRenda *1.1;
        System.out.println("Renda atualizada é "+ rendaAtualizada);
    }
    
    static double bonificar(){
        //System.out.println("O bonus é de: " + 100);
        return 100.0;
    }
    
}

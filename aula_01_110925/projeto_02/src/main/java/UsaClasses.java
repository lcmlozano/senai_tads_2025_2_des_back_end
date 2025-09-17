public class UsaClasses {
    public static void main(String[] args) {
        Pessoa obj_p1 = new Pessoa(); //criação do objeto
        Pessoa obj_p2 = new Pessoa();
        //atribuição de valores para os atributos do objeto
        obj_p1.nome = "Luiz"; 
        obj_p1.salario = 600.0;
        obj_p1.vendas = 5000;
        
        
        obj_p2.nome = "Stephanny"; 
        obj_p2.salario = 8000.0;
        obj_p2.vendas = 10000;
        
        //impressão dos valores dos atributos do objeto
        
        obj_p1.imprimir(obj_p1.calcularComissao());
        obj_p1.bonificar();
        obj_p1.atualizarRenda(obj_p1.salario);
        
        obj_p2.imprimir(obj_p2.calcularComissao());
        obj_p2.bonificar();
        obj_p2.atualizarRenda(obj_p2.salario);
        
    }
}

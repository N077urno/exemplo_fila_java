/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.filajava3;

/**
 *
 * @author nando
 */
public class FilaJava3 {

    public static void main(String[] args) {
        Aluno a1 = new Aluno();
        Professor p1 = new Professor();
        TecnicoAdministrativo t1 = new TecnicoAdministrativo();
        Terceirizado tz1 = new Terceirizado();
        
        a1.nome = "aluno";
        a1.curso = "TSI";
        a1.matricula = 123;
        
        p1.nome = "professor";
        p1.Area = "Informatica";
        p1.suap = 456;
        
        t1.nome = "Tecnico Administrativo";
        t1.setor = "Secretaria";
        
        tz1.nome = "Terceirizado";
        tz1.id = 123;
        
        Fila f = new Fila();
        
        /* insere um elemento na fila, remove esse elemento e depois imprime seus dados */
        f.insere(a1);
        f.imprimeElemento(f.remove());
        
        f.insere(p1);
        f.imprimeElemento(f.remove());
        
        f.insere(t1);
        f.imprimeElemento(f.remove());
        
        f.insere(tz1);
        f.imprimeElemento(f.remove());
        
        /* insere elementos na fila e depois limpa a fila e tenta fazer uma remoção */
        
        f.insere(a1);
        f.insere(p1);
        f.insere(t1);
        f.insere(tz1);
        
        f.limpaFila();
        
        if(f.verificaFilaVazia()){
            System.out.println("A fila estah vazia");
        }else{
            f.imprimeElemento(f.remove());
        }
        
        
            
    }
}

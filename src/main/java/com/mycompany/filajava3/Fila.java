/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.filajava3;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author nando
 */
public class Fila {
    List<Object> fila = new ArrayList<>();
    
    void insere(Object obj){
        this.fila.add(obj);
    }
    
    Object remove(){
        return(this.fila.remove(0));
    }
    
    boolean verificaFilaVazia(){
        return(this.fila.isEmpty());
    }
    
    void limpaFila(){
        this.fila.clear();
    }
    
    void imprimeElemento(Object obj){
        if(obj instanceof Aluno){
            System.out.println("O nome do aluno eh..: "+((Aluno) obj).nome);
            System.out.println("A matricula do aluno eh..: "+((Aluno) obj).matricula);
            System.out.println("O curso do aluno eh..: "+((Aluno) obj).curso);
        }else{
            if(obj instanceof Professor){
                System.out.println("O nome do professor eh..: "+((Professor) obj).nome);
                System.out.println("O SUAP do professor eh..: "+((Professor) obj).suap);
                System.out.println("A Area de atuacao do professor eh..: "+((Professor) obj).Area);
            }else{
                if(obj instanceof TecnicoAdministrativo){
                    System.out.println("O nome do Tecnico eh..: "+((TecnicoAdministrativo) obj).nome);
                    System.out.println("O setor de trabalho eh..: "+((TecnicoAdministrativo) obj).setor);
                }else{
                   if(obj instanceof Terceirizado){
                       System.out.println("O nome do terceirizado eh..: "+((Terceirizado) obj).nome);
                       System.out.println("O ID do terceirizado eh..: "+((Terceirizado) obj).id);
                   }
                }
            }
        }
    }
    
}

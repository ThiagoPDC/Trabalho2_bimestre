/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package thiagopdc_pedrohb_liviad;

import java.util.List;

/**
 *
 * @author pdcth
 */
public class conta {
    private int id;
    private dono dono;
    private List<personagem> listaPersonagem;
    
    public void addProduto(personagem p){
    //adicionar o personagem na conta
    this.listaPersonagem.add(p);
    }
    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public dono getDono() {
        return dono;
    }

    public void setDono(dono dono) {
        this.dono = dono;
    }

    public List<personagem> getListaPersonagem() {
        return listaPersonagem;
    }

    public void setListaPersonagem(List<personagem> listaPersonagem) {
        this.listaPersonagem = listaPersonagem;
    }
}

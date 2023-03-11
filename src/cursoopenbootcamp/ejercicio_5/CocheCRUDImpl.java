/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cursoopenbootcamp.ejercicio_5;

/**
 *
 * @author eduar
 */
public class CocheCRUDImpl implements CocheCRUD{
    
    String save = "Guardando";
    String findAll = "Buscar todo";
    String delete = "Borrando";
    

    @Override
    public void save() {   }

    @Override
    public void findAll() {}

    @Override
    public void delete() {}

    @Override
    public String toString() {
       return "CocheCRUDImpl" +
                    "\n save= " + save +
                    ",\n findAll= " + findAll +
                    ",\n delete= " + delete;
        }
    
    
    
    
}

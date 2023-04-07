/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.session;

import com.entity.Classes;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Sebastian Varela
 */
@Local
public interface ClassesFacadeLocal {

    void create(Classes classes);

    void edit(Classes classes);

    void remove(Classes classes);

    Classes find(Object id);

    List<Classes> findAll();

    List<Classes> findRange(int[] range);

    int count();
    
    
}

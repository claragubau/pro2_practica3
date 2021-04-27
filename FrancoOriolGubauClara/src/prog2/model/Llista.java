/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prog2.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import prog2.vista.MercatException;

/**
 * Classe Llista
 * @param <T> tipus
 */
public class Llista<T> implements Serializable {
   protected ArrayList<T> llista;

    /**
     * Constructor classe Llista
     */
   public Llista() {
       this.llista = new ArrayList<T>();
   }

    /**
    * Mètode per obtenir la mida de la llista
    * @return int
    */

   public int getSize() {
       return llista.size();
   }

    /**
     * Mètode per afegir un element a la llista
     * @param t T
     * @throws MercatException TODO
     */
   public void afegir(T t) throws MercatException {
       llista.add(t);
   }

    /**
     * Mètode per esborrar un element de la llista
     * @param t T
     */
   public void esborrar(T t) {
       llista.remove(t);
   }

    /**
     * Mètode per obtenir un element segons la posició
     * @param position int
     * @return element
     */
   public T getAt(int position) {
       return llista.get(position);
   }

    /**
     * Mètode per buidar la llista
     */
   public void clear() {
       llista.clear();
   }

    /**
     * Mètode per comprovar que la llista no sigui buida
     * @return boolean
     */
   public boolean isEmpty() {
       return getSize() == 0;
   }


    /**
     * Getter de la llista
     * @return ArrayList<T>
     */
   public ArrayList<T> getArrayList() {
       return new ArrayList<>(llista);
   }

}

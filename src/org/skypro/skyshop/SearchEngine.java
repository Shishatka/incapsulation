package org.skypro.skyshop;

import org.skypro.skyshop.Exceptions.BestResultNotFound;
import org.skypro.skyshop.interfaces.Searchable;

import java.util.ArrayList;

public class SearchEngine {
    ArrayList<Searchable> arrayList = new ArrayList<>();
   // Searchable[] array;
    /*
    public SearchEngine(int size) {
        array = new Searchable[size];
    }
    */
    public ArrayList<Searchable> search(String input) throws BestResultNotFound {
        ArrayList<Searchable> output = new ArrayList<>();

        for (Searchable item : arrayList) {
            if (item != null && item.getSearchTerm().contains(input)) {
                output.add(item);
            }
        }
        if (output.isEmpty()) {
            throw new BestResultNotFound("Ничего не найдено");
        }
        return output;
    }

    public void add(Searchable searchable) {
        arrayList.add(searchable);
    }
    /*
    public Searchable[] search(String input) throws BestResultNotFound {
        Searchable[] outputArray = new Searchable[5];
        int i = 0;
        for (Searchable item : array) {
            if (item != null && item.getSearchTerm().contains(input)) {
                outputArray[i] = item;
                i++;
            }
        }
        if (outputArray[0] == null) {
            throw new BestResultNotFound("Ничего не найдено");
        }
        return outputArray;
    }


        public void add (Searchable item) {
            for (int i = 0; i < array.length; i++) {
                if (array[i] == null) {
                    array[i] = item;
                    break;
                }
            }
        }

     */
    }

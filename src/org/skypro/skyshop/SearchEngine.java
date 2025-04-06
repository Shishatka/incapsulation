package org.skypro.skyshop;

import org.skypro.skyshop.Exceptions.BestResultNotFound;
import org.skypro.skyshop.interfaces.Searchable;

public class SearchEngine {
    Searchable[] array;

    public SearchEngine(int size) {
        array = new Searchable[size];
    }

    public Searchable[] search(String input) {
        Searchable[] outputArray = new Searchable[5];
        int i = 0;
        for (Searchable item: array) {
            if (item != null && item.getSearchTerm().contains(input)) {
                outputArray[i] = item;
                i++;
            }
        }
        return outputArray;
    }

    public void add(Searchable item) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == null) {
                array[i] = item;
                break;
            }
        }
    }

    public Searchable bestResultSearch(String search) {
        for (Searchable item: array) {
            if (item.getSearchTerm().contains(search)) {
                return item;
            }
        }
        throw new BestResultNotFound("Такого предмета не нашлось");
    }
}

package org.skypro.skyshop.comparator;

import org.skypro.skyshop.interfaces.Searchable;

import java.util.Comparator;

public class SearchableComparator implements Comparator<Searchable> {
    @Override
    public int compare(Searchable o1, Searchable o2) {
        int length = Integer.compare(o2.getSearchTerm().length(), o1.getSearchTerm().length());
        if (length == 0) {
            return o1.getSearchTerm().compareTo(o2.getSearchTerm());
        }
        else {
            return length;
        }
    }
}

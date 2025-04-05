package org.skypro.skyshop.article;

import org.skypro.skyshop.interfaces.Searchable;

public class Article implements Searchable {
    private String name;
    private String article;

    public Article(String name, String article) {
        this.name = name;
        this.article = article;
    }

    @Override
    public String toString(){
        return name + "\n" + article;

    }

    @Override
    public String getContentType() {
        return "ARTICLE";
    }

    @Override
    public String getSearchTerm() {
        return name + " " + article;
    }

    public String getArticle() {
        return article;
    }
}

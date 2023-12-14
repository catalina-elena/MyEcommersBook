package com.gt.bookApp.Books;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name= "numeproduse")
public class BooksDetails {
    @Id
    protected Integer id;
    protected String name;
    protected String author;
    protected int price;
    protected int yearOfPublication;
    protected String category;
    protected String editura;
    protected int nrPages;
    protected int numbers;

    public BooksDetails() {}

    public BooksDetails(int id, String name,String author, int price, int yearOfPublication, String category,
                        String editura, int nrPages, int numbers) {
        super();
        this.id = id;
        this.author = author;
        this.name = name;
        this.price = price;
        this.yearOfPublication = yearOfPublication;
        this.category = category;
        this.editura = editura;
        this.nrPages = nrPages;
        this.numbers = numbers;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }


    public int getPrice() {
        return price;
    }


    public void setPrice(int price) {
        this.price = price;
    }


    public String getAuthor() {
        return author;
    }


    public void setAuthor(String author) {
        this.author = author;
    }


    public int getNumbers() {
        return numbers;
    }


    public void setNumbers(int numbers) {
        this.numbers = numbers;
    }


    public int getYearOfPublication() {
        return yearOfPublication;
    }


    public void setYearOfPublication(int yearOfPublication) {
        this.yearOfPublication = yearOfPublication;
    }


    public String getCategory() {
        return category;
    }


    public void setCategory(String category) {
        this.category = category;
    }


    public String getEditura() {
        return editura;
    }


    public void setEditura(String editura) {
        this.editura = editura;
    }


    public int getNrPages() {
        return nrPages;
    }


    public void setNrPages(int nrPages) {
        this.nrPages = nrPages;
    }


    @Override
    public String toString() {
        return "Products [name=" + name + ", price=" + price + ", author=" + author + ", numbers=" + numbers
                + ", yearOfPublication=" + yearOfPublication + ", category=" + category + ", editura=" + editura
                + ", nrPages=" + nrPages + "]";
    }
}

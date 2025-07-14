package Entidad;

public class Libro {
    
    private int isbn;
    private String title;
    private String autor;
    private int pages;

    public Libro() {
    }

    public Libro(int isbn, String título, String autor, int pages) {
        this.isbn = isbn;
        this.title = título;
        this.autor = autor;
        this.pages = pages;
    }

    public int getIsbn() {
        return isbn;
    }

    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }

    public String getTítulo() {
        return title;
    }

    public void setTítulo(String título) {
        this.title = título;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }
    
    

}

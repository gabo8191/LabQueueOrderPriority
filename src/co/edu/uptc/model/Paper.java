package co.edu.uptc.model;

public class Paper {

  private int numberPages;
  private String format;
  private String nameDocument;

  public Paper(int numberPages, String format, String nameDocument) {
    this.numberPages = numberPages;
    this.format = format;
    this.nameDocument = nameDocument;
  }

  public int getNumberPages() {
    return numberPages;
  }

  public void setNumberPages(int numberPages) {
    this.numberPages = numberPages;
  }

  public String getFormat() {
    return format;
  }

  public void setFormat(String format) {
    this.format = format;
  }

  public String getNameDocument() {
    return nameDocument;
  }

  public void setNameDocument(String nameDocument) {
    this.nameDocument = nameDocument;
  }

  @Override
  public String toString() {
    return "Paper [numberPages=" + numberPages + ", format=" + format + ", nameDocument=" + nameDocument + "]";
  }

}

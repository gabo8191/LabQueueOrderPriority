package co.edu.uptc.presenter;

import co.edu.uptc.model.Paper;
import co.edu.uptc.model.Printer;
import co.edu.uptc.view.View;

public class Presenter {

  private View view;
  private Printer printer;

  public Presenter() {
    view = new View();
    printer = new Printer();
  }

  public int showMenu() {
    view.showMessage("================= SISTEMA DE IMPRESIÓN ===================");
    view.showMessage("1. Enviar documento a imprimir");
    view.showMessage("2. Atender impresión");
    view.showMessage("3. Salir");
    int option = Integer.parseInt(view.readData());
    return option;
  }

  public void run() {
    int option = 0;
    do {
      option = showMenu();
      switch (option) {
        case 1:
          addDocument();
          break;
        case 2:
          attendPrint();
          break;
      }
    } while (option != 3);
  }

  public void addDocument() {
    view.showMessage("Ingrese el nombre del documento");
    String nameDocument = view.readData();
    view.showMessage("Ingrese el número de páginas");
    int numberPages = Integer.parseInt(view.readData());
    view.showMessage("Ingrese el formato del documento");
    String format = view.readData();
    Paper paper = new Paper(numberPages, format, nameDocument);
    int priority = printer.assignPriority(numberPages);
    System.out.println(priority);
    printer.addPaper(paper, priority);
  }

  public void attendPrint() {
    if (!printer.isEmpty()) {
      Paper paper = printer.printDocument();
      view.showMessage("=============================");
      view.showMessage("Imprimiendo: " + paper.getNameDocument());
      view.showMessage("=============================");
    } else {
      view.showMessage("No hay documentos en la cola");
    }
  }

  public static void main(String[] args) {
    Presenter presenter = new Presenter();
    presenter.run();

  }

}

package application;

import db.Vendedor;
import model.entities.Departamento;

import java.util.Date;

public class Program {
    public static void main(String[] args) {

        Departamento departamento = new Departamento(1, "Books");

        Vendedor vendedor = new Vendedor(21, "Bob Brown", "bob@gmail.com", new Date(), 3000.0, departamento);

        System.out.println(vendedor + " - " + vendedor.getDepartamento());
    }
}

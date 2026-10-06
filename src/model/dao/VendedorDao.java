package model.dao;

import db.Vendedor;

import java.util.List;

public interface VendedorDao {

    void inserir(Vendedor obj);

    void update(Vendedor obj);

    void deleteById(Integer id);

    Vendedor findById(Integer id);

    List<Vendedor> findAll();
}

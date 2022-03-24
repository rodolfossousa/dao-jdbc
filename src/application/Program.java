package application;

import java.util.List;

import model.dao.DaoFactory;
import model.dao.VendedorDao;
import model.entities.Departamento;
import model.entities.Vendedor;

public class Program {

	public static void main(String[] args) {
		
		VendedorDao vendedorDao = DaoFactory.createVendedorDao();
		
		System.out.println("=== TEST 1: Vendedor findById ===");
		Vendedor vendedor = vendedorDao.fyndById(3);
		
		System.out.println(vendedor);
		
		System.out.println("\n=== TEST 2: Vendedor findByDepartamento ===");
		Departamento dep = new Departamento(2, null);
		List<Vendedor> vendedores = vendedorDao.findByDepartamento(dep);
		
		for(Vendedor obj : vendedores) {
			System.out.println(obj);
		}
	}

}

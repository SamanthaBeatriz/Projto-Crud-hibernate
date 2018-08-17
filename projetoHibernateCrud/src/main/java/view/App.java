package view;

import model.Cliente;
import controller.ClienteJpaDAO;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cliente cliente = new Cliente();
        cliente.setCpf("372.468.423-53");
        cliente.setId(1);
        cliente.setNome("Jeferson Roberto de Lima");
        cliente.setRg("52.563.456-2");
        ClienteJpaDAO.getInstance().merge(cliente);
        System.out.println("Objeto salvo com sucesso!!!");
	}

}

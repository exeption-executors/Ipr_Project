package service;
import entity.Client;
import java.util.List;

public interface ClientService {
    Client addClient(Client client);
    Integer getIdByName(String name);
    //void delete(Integer id);
    //Client editClient(Client client);
    //List<Client> getAll();

}

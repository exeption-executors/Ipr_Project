package application;

import entity.Client;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Component;
import repository.ClientRepository;
import service.ClientService;
import service.impl.ClientServiceImpl;

import java.util.List;

@SpringBootApplication
@EnableJpaRepositories(basePackages = {"repository"})
@EntityScan(basePackages = {"entity"})
@ComponentScan(basePackages = "service")
public class Application {
    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(Application.class, args);
        ClientService clientService = context.getBean(ClientService.class);

//        clientService.insertClient("Mark", "Bryzgalov","marik33409@mail.ru", false);
//        clientService.insertClient("Andrey", "Levkin", "Andrey@mail.ru", false);
//        clientService.insertClient("Evgeny", "Davidov", "evgen@mail.ru",false);

//        Client client = clientService.findByName("Andrey");
//        System.out.println("ID Клиента: "+ client.getId() +" Почта клиента: " + client.getEmail());

//        clientService.deleteClientByEmail("Andrey@mail.ru");

//        List<Client> clients = clientService.getAll();
//        for (int i = 0; i < clients.size(); i++) {
//            System.out.println(clients.get(i).getName()+ " " + clients.get(i).getSurname() + " " + clients.get(i).getEmail());
//        }

//        clientService.deleteClientById((long) 0);

//        Client client = clientService.findByEmail("marik33409@mail.ru");
//        System.out.println(client.getName() + " " + client.getSurname());

        clientService.updateClient("Andew", "Levkin",
                "anrew@mail.ru", false, (long)2);
    }
}
package ru.raiffeisen.ipr.rest;

import org.springframework.http.HttpStatus;
import ru.raiffeisen.ipr.dto.ClientDTO;
import ru.raiffeisen.ipr.entity.Client;
import org.springframework.web.bind.annotation.*;
import ru.raiffeisen.ipr.mappers.ClientMapper;
import ru.raiffeisen.ipr.service.ClientService;

import java.util.List;

@RestController
@RequestMapping("/api/clients")
public class ClientController {

    private ClientService clientService;

    public ClientController(ClientService clientService){
        this.clientService = clientService;
    }


    @GetMapping("/list")
    public List<Client> list(){
        return clientService.getAll();
    }


    @RequestMapping(value = "/create", method = RequestMethod.POST)
    @ResponseStatus(HttpStatus.CREATED)
    @ResponseBody
    public void createPost(@RequestBody ClientDTO clientDTO) {
        Client client = ClientMapper.fromClientDTOToClientEntity(clientDTO);
        System.out.println(client.getName());
        System.out.println(client.getSurname());
    }
    @RequestMapping(value = "/create", method = RequestMethod.POST)
    @ResponseStatus(HttpStatus.CREATED)
    @ResponseBody
    public void createPost2(@RequestBody ClientDTO clientDTO) {
        Client client = ClientMapper.fromClientDTOToClientEntity(clientDTO);
        System.out.println(client.getName());
        System.out.println(client.getSurname());
    }
}

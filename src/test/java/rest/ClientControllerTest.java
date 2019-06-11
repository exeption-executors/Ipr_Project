package rest;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import ru.raiffeisen.ipr.Application;
import ru.raiffeisen.ipr.dto.ClientDTO;
import ru.raiffeisen.ipr.entity.Client;
import ru.raiffeisen.ipr.mappers.ClientMapper;
import ru.raiffeisen.ipr.repository.ClientRepository;
import ru.raiffeisen.ipr.rest.ClientController;
import ru.raiffeisen.ipr.service.ClientService;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringRunner.class)
@ContextConfiguration(classes = Application.class)
@WebMvcTest(ClientController.class)
public class ClientControllerTest {

    @Autowired
    private MockMvc mockMvc;

    private ClientDTO clientDTO;

    @MockBean
    private ClientService clientService;


    @Test
    public void whenValidInput_thenReturns200() throws Exception {
        Client client = ClientMapper.fromClientDTOToClientEntity(clientDTO);
        clientService.saveClient(client);

        mockMvc.perform(post("/clients")
                .contentType("application/json")
                .param("asd","asd","asdasd","Asdasas"))
                .andExpect(status().isOk());
    }
}

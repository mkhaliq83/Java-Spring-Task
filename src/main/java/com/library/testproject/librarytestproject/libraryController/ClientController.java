package com.library.testproject.librarytestproject.libraryController;
import com.library.testproject.librarytestproject.librarayService.ClientService;
import com.library.testproject.librarytestproject.libraryModel.Client;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Client")
public class ClientController {
@Autowired
    private ClientService clientService;
@GetMapping
    public ResponseEntity<List<Client>> getAllClients() {
    List<Client> clients = clientService.getAllClients();
  return new ResponseEntity<>(clients, HttpStatus.OK);
}
@PostMapping
    public ResponseEntity<Client> createClient(@RequestBody Client client) {
    clientService.addClient(client);
    return new ResponseEntity<>(client, HttpStatus.CREATED);
}
@DeleteMapping("/{id}")
    public ResponseEntity<Client> deleteClient(@PathVariable Integer id) {
    clientService.deleteClientById(id);
    return new ResponseEntity<>(HttpStatus.OK);
    }

}

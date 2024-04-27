package com.library.testproject.librarytestproject.library.controller;
import com.library.testproject.librarytestproject.libraray.dto.ClientDto;
import com.library.testproject.librarytestproject.libraray.service.ClientService;
import com.library.testproject.librarytestproject.library.model.Client;
import org.modelmapper.ModelMapper;
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
    @Autowired
    private ModelMapper modelMapper;

    @GetMapping
    public ResponseEntity<List<Client>> getAllClients() {
    List<Client> clients = clientService.getAllClients();
  return new ResponseEntity<>(clients, HttpStatus.OK);
}
@PostMapping
    public ResponseEntity<ClientDto> createClient(@RequestBody ClientDto clientDto) {
    Client client = modelMapper.map(clientDto, Client.class);
    clientService.addClient(client);
    return new ResponseEntity<>(clientDto, HttpStatus.CREATED);
}
@DeleteMapping("/{id}")
    public ResponseEntity<Client> deleteClient(@PathVariable Long id) {
    clientService.deleteClientById(id);
    return new ResponseEntity<>(HttpStatus.OK);
    }

}

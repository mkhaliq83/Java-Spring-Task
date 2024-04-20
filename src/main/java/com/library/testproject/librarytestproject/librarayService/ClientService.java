package com.library.testproject.librarytestproject.librarayService;

import com.library.testproject.librarytestproject.libraryModel.Client;
import com.library.testproject.librarytestproject.libraryRepository.ClientRepository;
import jakarta.persistence.criteria.CriteriaBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ClientService {

   private final ClientRepository clientRepository;
   @Autowired
    public ClientService(ClientRepository clientRepository) {
       this.clientRepository = clientRepository;
   }
public List<Client> getAllClients() {
       return clientRepository.findAll();
}
public Optional<Client> getClientById(int id) {
       return clientRepository.findById(id);
}
public Client addClient(Client client) {
       return clientRepository.save(client);
}
public Client updateClient(Client client) {
       return clientRepository.save(client);
    }
    public void deleteClientById(int id) {
       clientRepository.deleteById(id);
    }
}
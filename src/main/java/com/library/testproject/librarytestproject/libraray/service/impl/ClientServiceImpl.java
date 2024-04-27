package com.library.testproject.librarytestproject.libraray.service.impl;

import com.library.testproject.librarytestproject.libraray.service.ClientService;
import com.library.testproject.librarytestproject.library.model.Client;
import com.library.testproject.librarytestproject.library.repository.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ClientServiceImpl implements ClientService {
    private final ClientRepository clientRepository;
    @Autowired
    public ClientServiceImpl(ClientRepository clientRepository) {
        this.clientRepository = clientRepository;
    }
@Override
    public List<Client> getAllClients() {
        return clientRepository.findAll();
    }
    @Override
    public Optional<Client> getClientById(Long id) {
        return clientRepository.findById(id);
    }
    @Override
    public void addClient(Client client) {
        clientRepository.save(client);
    }
    @Override
    public Client updateClient(Client client) {
        return clientRepository.save(client);
    }
    @Override
    public void deleteClientById(Long id) {
        clientRepository.deleteById(id);
    }
}

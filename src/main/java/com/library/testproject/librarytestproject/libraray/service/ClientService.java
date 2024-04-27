package com.library.testproject.librarytestproject.libraray.service;

import com.library.testproject.librarytestproject.library.model.Client;

import java.util.List;
import java.util.Optional;

public interface ClientService {

    public List<Client> getAllClients();
    public Optional<Client> getClientById(Long id);
    public Client updateClient(Client client);
    public void deleteClientById(Long id);
    public void addClient(Client client);
}

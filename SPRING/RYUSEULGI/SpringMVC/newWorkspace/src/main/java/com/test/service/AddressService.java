package com.test.service;

import java.util.List;

import com.test.domain.Address;

public interface AddressService {
    public List<Address> list();

    public void insert(Address address);

    public void delete(long seq);
}

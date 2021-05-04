package com.caching.CaffeineExample.service;

import com.caching.CaffeineExample.dto.Customer;

public interface CustomerService {

    Customer getCustomer(final Long customerId);
}

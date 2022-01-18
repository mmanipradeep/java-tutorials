package com.mani.service;

import com.mani.repository.TenantRepository;
import com.mani.model.Tenant;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TenantService {
    @Autowired
    TenantRepository tenantRepository;

    public  Tenant getTenantDetails() {
        tenantRepository.findById(new Long(1));
        Tenant tenant =new Tenant();
        return tenant;
    }
}

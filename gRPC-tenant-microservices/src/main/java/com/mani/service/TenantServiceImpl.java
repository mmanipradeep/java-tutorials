package com.mani.service;

import com.mani.db.TenantDao;
import com.mani.model.Tenant;
import com.mani.services.Gender;
import com.mani.services.TenantRequest;
import com.mani.services.TenantResponse;
import com.mani.services.TenantServiceGrpc;
import io.grpc.stub.StreamObserver;

public class TenantServiceImpl extends TenantServiceGrpc.TenantServiceImplBase {

    private TenantDao userDao = new TenantDao();
    /**
     *
     * @param request
     * @param responseObserver
     */
    @Override
    public void getTenantDetails(TenantRequest request, StreamObserver<TenantResponse> responseObserver) {

        Tenant tenant = userDao.getDetails(String.valueOf(request.getId()));
        TenantResponse.Builder tenantResponseBuilder =TenantResponse.newBuilder()
                .setId(tenant.getId())
                .setAadhaarCard(tenant.getAadhaarCard())
                .setGender(Gender.valueOf(tenant.getGender()))
                .setName(tenant.getName());
        TenantResponse tenantResponse = tenantResponseBuilder.build();
        responseObserver.onNext(tenantResponse);
        responseObserver.onCompleted();

    }

}

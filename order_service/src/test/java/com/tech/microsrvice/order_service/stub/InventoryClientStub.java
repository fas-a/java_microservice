package com.tech.microsrvice.order_service.stub;

import static com.github.tomakehurst.wiremock.client.WireMock.*;

import lombok.experimental.UtilityClass;

@UtilityClass
public class InventoryClientStub {

    public void stubInventoryCall(String skuCode, Integer quantity){
        stubFor(get(urlEqualTo("/api/inventory?skuCode=" + skuCode + "&quantity=" + quantity))
                .willReturn(aResponse()
                        .withStatus(200)
                        .withHeader("Content-Type", "application/json")
                        .withBody("true")));
    }
}

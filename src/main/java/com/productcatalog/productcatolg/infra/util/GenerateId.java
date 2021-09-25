package com.productcatalog.productcatolg.infra.util;

import lombok.Getter;
import lombok.Setter;

import java.util.UUID;

@Getter
@Setter
public class GenerateId {

    private String uuid;

    public String generateUuid() {
        UUID uuid = UUID.randomUUID();
        System.out.println(uuid);
        return "";
    }
}

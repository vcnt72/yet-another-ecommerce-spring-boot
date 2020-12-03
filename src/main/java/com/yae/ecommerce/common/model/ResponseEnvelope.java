package com.yae.ecommerce.common.model;

import lombok.Value;

@Value
public class ResponseEnvelope {
    Meta meta;
    Object data;
}

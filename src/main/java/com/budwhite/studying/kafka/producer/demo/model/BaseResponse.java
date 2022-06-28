package com.budwhite.studying.kafka.producer.demo.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class BaseResponse implements Serializable {
    private String message;
}

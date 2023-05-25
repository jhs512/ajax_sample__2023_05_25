package com.ll.demo9;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
class RsData<T> {
    private String resultCode;
    private String msg;
    private T data;
}

package com.reqtest.Entities.Response;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class GetContentsResponse {
    boolean isSuccess;
    String message;
    Result result;
}

package com.hb.orderservice.exception.anotherapproach;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ErrorResponseDto {

    String status;
    String errorMessage;
    String statusCode;

    String type;
}

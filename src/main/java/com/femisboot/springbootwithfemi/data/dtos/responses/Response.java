package com.femisboot.springbootwithfemi.data.dtos.responses;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.http.HttpStatus;

@AllArgsConstructor
@Data
@NoArgsConstructor
public class Response {
    private HttpStatus status;
   private String message;
   private Long id;
   public Response(HttpStatus status, String message) {
       this.status = status;
       this.message = message;
   }
}

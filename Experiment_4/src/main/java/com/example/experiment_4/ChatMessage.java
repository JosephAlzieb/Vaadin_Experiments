package com.example.experiment_4;

import java.time.LocalDateTime;

public record ChatMessage (
    String from,
    LocalDateTime time,
    String message ){
}

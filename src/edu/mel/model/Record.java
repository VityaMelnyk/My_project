package edu.mel.model;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Record {
    private String id;
    private String name;
    private Client client;
    private Chamber chamber;
    private LocalDateTime eventDate;
    private Event event;
    private String description;
    private LocalDateTime created_at;
    private LocalDateTime modified_at;
}

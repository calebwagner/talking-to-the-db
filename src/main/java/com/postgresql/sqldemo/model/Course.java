package com.postgresql.sqldemo.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.util.Optional;
import java.util.UUID;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name= "courseUpdated")
public class Course {
    @Id
    private UUID id;
    private String title;
    @Column(name = "length", nullable = false, columnDefinition = "bigint DEFAULT 0")
    private long duration;
    private String contentUrl;
    private Boolean isRetired;
}

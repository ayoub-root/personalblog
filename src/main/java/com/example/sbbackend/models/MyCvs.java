package com.example.sbbackend.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class MyCvs {
    @Id
    @GeneratedValue
    private Long id;
    @Column(unique = true)
    private String title;
    private  String language;
    @Column(columnDefinition = "TEXT")
    private  String content;
    private String fileUrl;
    private String photoUrl;

    @JsonIgnore
    @ManyToOne(fetch = FetchType.LAZY)
    private User createdBy;
    private Date createdAt;
    private Date updatedAt;


}

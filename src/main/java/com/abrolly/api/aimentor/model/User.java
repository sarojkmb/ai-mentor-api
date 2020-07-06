package com.abrolly.api.aimentor.model;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.*;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@Getter
@Setter
@EntityListeners(AuditingEntityListener.class)
@JsonIgnoreProperties(value = {"createdAt", "updatedAt"},
        allowGetters = true)
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "user")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    @NotNull
    private String firstName;

    @Column
    @NotNull
    private String lastName;
    private Date dob;
    private String gender;


    @ElementCollection
    @CollectionTable(name ="my_interests",  joinColumns = @JoinColumn(name = "user_id"))
    private List<String> interests = new ArrayList<String>();


    @ElementCollection
    @CollectionTable(name ="my_expertise", joinColumns = @JoinColumn(name = "user_id"))
    private List<String> expertise = new ArrayList<String>();


    @ElementCollection
    @CollectionTable(name ="my_mentors", joinColumns = @JoinColumn(name = "user_id"))
    private List<String> myMentors;

    @ElementCollection
    @CollectionTable(name ="my_followers", joinColumns = @JoinColumn(name = "user_id"))
    private List<String> myFollowers;

}

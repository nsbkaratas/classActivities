package org.perscholas.studentmanagementsystem.models;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;
import lombok.extern.slf4j.Slf4j;

import java.util.LinkedHashSet;
import java.util.Set;

@Entity
@Slf4j
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@ToString
@EqualsAndHashCode
@RequiredArgsConstructor
@FieldDefaults(level =AccessLevel.PRIVATE)
@Table(name = "course")
public class Course {
    @NonNull
    @Id
    int id;
    @NonNull
    String name;
    @NonNull
    String instructor;

    @ToString.Exclude
    @ManyToMany(fetch = FetchType.EAGER, mappedBy = "courses", cascade = {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REFRESH, CascadeType.DETACH})
    Set<Students> students = new LinkedHashSet<>();

}

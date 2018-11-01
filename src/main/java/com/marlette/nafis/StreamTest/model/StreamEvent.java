package com.marlette.nafis.StreamTest.model;

import lombok.*;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.time.ZonedDateTime;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
@ToString
@Table(name = "StreamEvent")
public class StreamEvent {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "eventId", columnDefinition = "BIGINT")
    private Long eventId;

    @Column(name = "eventName", columnDefinition = "VARCHAR(30)")
    @Builder.Default
    private String eventName = "defaultEventName";

    @Column(name = "source", columnDefinition = "VARCHAR(30)")
    @Builder.Default
    private String source = "defaultSource";

    @Column(name = "createdAt", columnDefinition = "DATETIME")
    @Builder.Default
    private LocalDateTime createdAt = ZonedDateTime.now().toLocalDateTime();
}

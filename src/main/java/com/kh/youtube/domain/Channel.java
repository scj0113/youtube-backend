package com.kh.youtube.domain;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.DynamicInsert;

import java.util.Date;
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@DynamicInsert
public class Channel {

    @Id
    @Column(name="channel_code")
    @GeneratedValue(strategy = GenerationType.IDENTITY, generator = "channelSequence")
    @SequenceGenerator(name="channelSequence", sequenceName = "SEQ_CHANNEL" , allocationSize = 1)
    private int channelCode;

    @Column(name="channel_name")
    private String channelName;

    @Column(name="channel_photo")
    private String channelPhoto;

    @Column(name="channel_desc")
    private String channelDesc;

    @Column(name="channel_date")
    private Date channelDate;


    @JoinColumn(name="id")
    @ManyToOne // Channel 엔티티와 Member 엔티티를 다대일 관계로 설정
    private Member member;

}
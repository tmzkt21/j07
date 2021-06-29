package org.zerock.j07.todo.entity;

import lombok.*;
import org.zerock.j07.common.entity.BaseEntity;

import javax.annotation.processing.Generated;
import javax.persistence.*;


//엔티티는 고유한 키값이 있어야한다 엔티티는 가능하면 세터를 안쓴다
@Entity
//테이블이름
@Table(name = "tbl_todo")
@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Todo extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long tno;
    // 식별값
    // nullable = false = not null
    // length = 글길이
    @Column(nullable = false, length = 300)
    private String content;
    // 디비에는 boolean 없음 0 아니면 1
    private boolean del;


    public void chabgeTitle(String content){
        this.content = content;
    }
}

package borad.work;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity // 스프링서베에 이런 데이터가 저장 될거다.
public class Board {
    @Id //유일성 만약에 내용이 다같아도 ID 다르면 다른 취급을 함
    @GeneratedValue(strategy = GenerationType.IDENTITY) // 나중에 알아보기
    private Long id; // 데이터 이름

    private String title; // 데이터의 제목

    private String description; // 데이터 내용

    protected void setId(Long id) {this.id = id;}
    protected void setTitle(String title) {this.title = title;}
    protected void setDescription(String description) {this.description = description;}

    public Long getId()
    {return id;}
    public String getTitle()
    {return title;}
    public String getDescription()
    {return description;}

    public static BoardBuilder builder(){
        return  new BoardBuilder();
    }
}

package board.work.Entity;

public class BoardBuilder {
    private final Board board;

    public BoardBuilder() {
        this.board = new Board();
    }

    public BoardBuilder id(Long id){
        board.setId(id);
        return this;
    }

    public BoardBuilder title(String title){
        board.setTitle(title);
        return this;
    }

    public BoardBuilder description(String description){
        board.setDescription(description);
        return this;
    }

    public Board build(){
        return board;
    }
}

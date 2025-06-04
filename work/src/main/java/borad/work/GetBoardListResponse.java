package borad.work;

import java.util.List;

public class GetBoardListResponse {
 private List<GetBoardListResponse> boards;

 public GetBoardListResponse(List<GetBoardListResponse> boards) {
  this.boards = boards;

 }
 public GetBoardListResponse() {}
 public List<GetBoardListResponse> getBoards() {
  return boards;
 }

}

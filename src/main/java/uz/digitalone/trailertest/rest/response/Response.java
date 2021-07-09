package uz.digitalone.trailertest.rest.response;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Response {

    private boolean success;
    private String message;
    private Object data;
    private List<Object> dataList;

    public Response(boolean success, String message, Object data) {
        this.success = success;
        this.message = message;
        this.data = data;
    }

    public Response(boolean success, String message, List<Object> dataList) {
        this.success = success;
        this.message = message;
        this.dataList = dataList;
    }
}

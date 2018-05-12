package test;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class POJO {

@SerializedName("todo")
@Expose
private List<Todo> todo = null;

public List<Todo> getTodo() {
return todo;
}

public void setTodo(List<Todo> todo) {
this.todo = todo;
}

}
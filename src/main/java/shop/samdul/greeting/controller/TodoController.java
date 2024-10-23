package shop.samdul.greeting.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import shop.samdul.greeting.service.TodoService;
import shop.samdul.greeting.entity.TodoEntity;

import java.util.List;

@RestController
public class TodoController{
	
	@Autowired
	TodoService todoService;	

	@GetMapping("/todos")
	public List<TodoEntity> list() {
		System.out.println("[Controller]");
		List<TodoEntity> r = todoService.getTodos();
		return r;	
	}
	
	@GetMapping("/todos/{id}")
	public TodoEntity find(@PathVariable Integer id) {
		TodoEntity r = todoService.findById(id);
		return r;	
	}

	//C - INSERT
	@PostMapping("/todos")
	public void createTodo(@RequestBody TodoEntity todoEntity) {
	    todoService.createTodo(todoEntity);
	}

	//U - UPDATE
	@PutMapping("/todos/{id}")
	public void updateTodo(@PathVariable Integer id, @RequestBody TodoEntity todoEntity) {
	    todoService.updateTodoById(id, todoEntity);
	}

	//D - DELTE
	@DeleteMapping("/todos/{id}")
	public void updateTodo(@PathVariable Integer id) {
	    todoService.deleteTodoById(id);
	}
}
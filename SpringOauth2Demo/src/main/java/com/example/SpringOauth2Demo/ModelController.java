package com.example.SpringOauth2Demo;

// import java.util.List;

// import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.web.bind.annotation.DeleteMapping;
// import org.springframework.web.bind.annotation.GetMapping;
// import org.springframework.web.bind.annotation.PathVariable;
// import org.springframework.web.bind.annotation.PostMapping;
// import org.springframework.web.bind.annotation.RequestBody;
// import org.springframework.web.bind.annotation.RequestMapping;
// import org.springframework.web.bind.annotation.RestController;

// @RestController
// @RequestMapping("/yourmodels")
// public class ModelController {

//     @Autowired
//     private ModelService service;

//     @GetMapping
//     public List<User> getAll() {
//         return service.getAll();
//     }

//     @PostMapping
//     public User create(@RequestBody User yourModel) {
//         return service.save(yourModel);
//     }

//     @GetMapping("/{id}")
//     public User getById(@PathVariable String id) {
//         return service.getById(id);
//     }

//     @DeleteMapping("/{id}")
//     public void deleteById(@PathVariable String id) {
//         service.deleteById(id);
//     }
// }
package com.muoi.me.controller;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
@Tag(name = "User Management", description = "APIs for managing users")
public class UserController {

  @GetMapping("/{id}")
  @Operation(summary = "Get user by ID", description = "Fetches user details by GitHub ID")
  public String getUser(@PathVariable String id) {
    return "User: " + id;
  }
}

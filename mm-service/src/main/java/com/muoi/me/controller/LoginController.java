package com.muoi.me.controller;

import com.muoi.me.entity.User;
import com.muoi.me.repository.UserRepository;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.oauth2.core.user.OAuth2User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/auth")
public class LoginController {

  private final UserRepository userRepository;

  public LoginController(UserRepository userRepository) {
    this.userRepository = userRepository;
  }

  @GetMapping("/github")
  public User loginWithGitHub(@AuthenticationPrincipal OAuth2User principal) {
    Map<String, Object> attributes = principal.getAttributes();
    String githubId = attributes.get("id").toString();
    String username = attributes.get("login").toString();
    String email = (String) attributes.get("email");
    String avatarUrl = (String) attributes.get("avatar_url");

    User user = userRepository.findById(githubId).orElse(new User(githubId, username, email, avatarUrl));
    userRepository.save(user);

    return user;
  }
}

package com.codessquad.qna.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Objects;

@Entity
public class User {

    @Id//프라이머리 키
    @GeneratedValue//자동으로 숫자 증가: 오토인크리멘탈
    private Long id;

    @Column(nullable = false, length = 20)// 공백을 허용하지 않음, 최대 길이는 20
    private String userId;
    private String password;//나머지는 그냥 디폴트값이 설정되어 있는데 걍 쓰면 됩니다!
    private String name;
    private String email;

    public User() { }

    public User(User copyUser) {
        this.userId = copyUser.userId;
        this.password = copyUser.password;
        this.name = copyUser.name;
        this.email = copyUser.email;
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void update(User newUser) {
        this.name = newUser.name;
        this.userId = newUser.userId;
        this.email = newUser.email;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        User user = (User) object;
        return Objects.equals(getUserId(), user.getUserId());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getUserId());
    }
    
    @Override
    public String toString() {
        return "User{" +
                "userId='" + userId + '\'' +
                ", password='" + password + '\'' +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                '}';
    }


}

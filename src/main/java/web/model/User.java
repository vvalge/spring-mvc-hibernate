package web.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

import org.springframework.stereotype.Component;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Email;
import javax.validation.constraints.Min;
import javax.validation.constraints.Size;

@Data
@Entity
@Component
@Table(name = "user")
public class User {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "name")
    @NotEmpty(message = "Поле не может быть пустым")
    @Size(min = 2, max = 40, message = "Имя должно содержать от 2 до 40 символов")
    private String name;

    @Column(name = "surname")
    @NotEmpty(message = "Поле не может быть пустым")
    @Size(min = 2, max = 40, message = "Фамилия должна содержать от 2 до 40 символов")
    private String surname;

    @Column(name = "age")
    @Min(value = 0, message = "Возраст должен быть больше 0")
    private int age;

    @Column(name = "email")
    @NotEmpty(message = "Поле не может быть пустым")
    @Email(message = "Неверный формат")
    private String email;
}

package su.beehelit.codetask.personality;


import jakarta.validation.constraints.NotEmpty;
import lombok.Data;

@Data
public class LoginForm {
    @NotEmpty(message="Поле \"Логин\" пусто")
    private String login;

    @NotEmpty(message="Поле \"Пароль\" пусто")
    private String password;
}

package su.beehelit.codetask.personality;


import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Email;
import lombok.Data;

@Data
public class RegistrationForm {
    @NotNull
    @NotEmpty(message="Поле \"Email\" пусто")
    @Email(message="Некорректный email адрес")
    private String email;

    @NotNull
    @NotEmpty(message="Поле \"Логин\" пусто")
    private String login;

    @NotNull
    @NotEmpty(message="Поле \"Пароль\" пусто")
    private String password;

    @NotNull
    @NotEmpty(message="Поле \"повторный пароль\" пусто")
    private String passwordRetry;
}

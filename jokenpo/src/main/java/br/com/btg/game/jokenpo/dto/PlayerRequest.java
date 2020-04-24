package br.com.btg.game.jokenpo.dto;

import javax.validation.constraints.NotNull;
import java.util.Objects;

public class PlayerRequest {

    @NotNull
    private String name;

    public PlayerRequest(){
    }

    public PlayerRequest(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PlayerRequest that = (PlayerRequest) o;
        return Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    @Override
    public String toString() {
        return "PlayerRequest{" +
                "name='" + name + '\'' +
                '}';
    }

}
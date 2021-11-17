import lombok.Data;

@Data
public class Game {
    private boolean isGreenLight;

    public Game(boolean isGreenLight) {
        this.isGreenLight = isGreenLight;
    }

    public boolean getLight() {
        return isGreenLight;
    }

    public void setLight(boolean light) {
        isGreenLight = light;
    }

    public boolean isFailed(int speed) {
        return isGreenLight || speed <= 0;
    }
}

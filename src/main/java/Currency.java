/**
 * Created by sun on 14-12-27.
 */
public class Currency {
    double value;
    double radio;

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public double add(Currency currency){

        value=value+(currency.value)*(currency.radio);
        return value;
    }
}

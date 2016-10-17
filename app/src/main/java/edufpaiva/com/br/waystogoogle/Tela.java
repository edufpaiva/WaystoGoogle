package edufpaiva.com.br.waystogoogle;

import android.graphics.Color;
import android.graphics.drawable.Drawable;

/**
 * Created by aluno on 11/10/2016.
 */

public class Tela {
    String texto1;
    String texto2;
    String texto3 = "";
    int background;
    int textColor;

    public Tela(String texto1, String texto2, String texto3, int background, int textColor) {
        this.texto1 = texto1;
        this.texto2 = texto2;
        this.texto3 = texto3;
        this.background = background;
        this.textColor = textColor;
    }

    public String getTexto1() {
        return texto1;
    }

    public String getTexto2() {
        return texto2;
    }

    public String getTexto3() {
        return texto3;
    }

    public int getBackground() {
        return background;
    }

    public int getTextColor() {
        return textColor;
    }
}

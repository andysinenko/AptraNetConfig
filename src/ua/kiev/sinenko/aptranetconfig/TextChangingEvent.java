package ua.kiev.sinenko.aptranetconfig;
import java.awt.Color;
import java.awt.TextComponent;
import java.awt.event.*;
/**
 *
 * @author a.sinenko
 */
public class TextChangingEvent implements TextListener{

    @Override
    public void textValueChanged(TextEvent e){
        TextComponent tc = (TextComponent)e.getSource();
        tc.setBackground(Color.red);
    }
    
}

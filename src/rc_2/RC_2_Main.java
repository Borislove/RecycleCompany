package rc_2;

import com.jtattoo.plaf.acryl.AcrylLookAndFeel;
import com.jtattoo.plaf.hifi.HiFiLookAndFeel;

import javax.swing.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class RC_2_Main {

    public static void main(String[] args) {

        //skin//
        /*try {
        //    UIManager.setLookAndFeel(new HiFiLookAndFeel());
            UIManager.setLookAndFeel(new AcrylLookAndFeel());
        } catch (UnsupportedLookAndFeelException ex) {
            Logger.getLogger(RC_2_Main.class.getName()).log(Level.SEVERE, null, ex);
        }*/

        new RC_2_Main_Window();
    }
}

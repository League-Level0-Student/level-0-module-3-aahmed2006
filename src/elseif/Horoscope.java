package elseif;

import javax.swing.JOptionPane;

public class Horoscope {
public static void main(String[] args) {
	String zodiac = JOptionPane.showInputDialog("What is your star sign?");
	if(zodiac.equals("Aries")) {
		JOptionPane.showMessageDialog(null, "When things seem too pressured today write down what you have to do and you can get organised.");
	} else if (zodiac.equals("Taurus")) {
		JOptionPane.showMessageDialog(null, "Choose to be happy today and keep a positive attitude to all you do, and others will follow you.");
	} else if (zodiac.equals("Gemini")) {
		JOptionPane.showMessageDialog(null, "Be attentive when others communicate with you and dont miss a beat.");
	} else if (zodiac.equals("Cancer")) {
		JOptionPane.showMessageDialog(null, "Back off, Cancer, and stop pushing others, youll only make them dig their heels in more.");
	} else if (zodiac.equals("Leo")) {
		JOptionPane.showMessageDialog(null, "Use your high energy at home today to fix things physically in the home and emotionally.");
	} else if (zodiac.equals("Virgo")) {
		JOptionPane.showMessageDialog(null, "When someone close to you does something that means a big change for you, see it positively.");
	} else if (zodiac.equals("Libra")) {
		
	} else if (zodiac.equals("Scorpio")) {
		
	} else if (zodiac.equals("Sagittarius")) {
		
	} else if (zodiac.equals("Capricorn")) {
		
	} else if (zodiac.equals("Aquarius")) {
		
	} else if (zodiac.equals("Pisces")) {
		
	} else {
		JOptionPane.showMessageDialog(null, "That's not a star sign!");
	}
}
}

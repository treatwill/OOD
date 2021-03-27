package org.tekcamp.language.speakers;

public class ArabicSpeaker extends LanguageSpeaker {

	public ArabicSpeaker(String name) {
		super("Arabic",name);
	}

	@Override
	public void communicate(LanguageSpeaker person) {
		if(person.getLanguage() == this.getLanguage()) {
			System.out.println(this.name + " is speaking with " + person.getName());
		} else {
			System.out.println(this.name + " is unable to communicate in " + person.getLanguage());
		}
	}

}


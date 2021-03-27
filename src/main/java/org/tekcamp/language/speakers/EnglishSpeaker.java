package org.tekcamp.language.speakers;

public class EnglishSpeaker extends LanguageSpeaker {

	public EnglishSpeaker(String name) {
		super("English",name);
	}

	@Override
	public void communicate(LanguageSpeaker person) {
		String communication = person.getLanguage() == this.language ? this.name + " is speaking with " + person.getName() : this.name + " is unable to communicate in " + person.getLanguage();
		System.out.println(communication);
	}
}

package tbp.termrewriter.exceptions;


public class TermNotPartOfTheLanguageException extends TermException {

	public TermNotPartOfTheLanguageException(String exceptionMessage) {
		super("The term " + exceptionMessage + " is not part of the language.");
	}

}
package myplugin.analyzer;

import java.lang.Exception;

/** AnalyzeException - special kind of exception that can be thrown by Analyzer */
@SuppressWarnings("serial")
public class AnalyzeException extends Exception {

	public AnalyzeException(String msg) {
		super(msg);
	}
}

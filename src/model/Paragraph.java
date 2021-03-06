package model;

import java.util.ArrayList;

public class Paragraph {
	int startLine,endLine;
	boolean isLCS;
	private ArrayList<String> seq = new ArrayList<String>();

	public int getSize() {
		return seq.size();
	}

	public String getSeq(int i) {
		return seq.get(i);
	}

	public void setSeq(String string) {
		this.seq.add(string);
	}

	public static String printParagraph(Paragraph para) {
		String temp = "";
		for (int i = 0; i < para.seq.size(); i++) {
			temp = temp + para.getSeq(i)+"\n";
		}
		
		return temp;
	}
}
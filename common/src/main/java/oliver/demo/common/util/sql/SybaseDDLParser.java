package oliver.demo.common.util.sql;


import java.io.IOException;
import java.io.InputStream;

import oliver.demo.common.util.Utils;
import oliver.demo.common.util.sql.api.TableInfo;

public class SybaseDDLParser {
	
	private String rawddl;
	
	private TableInfo tableInfo;
	
	public SybaseDDLParser(String rawddl) throws DDLParseException {
		this.rawddl = rawddl;
		validate();
	}
	
	public SybaseDDLParser(InputStream in) throws IOException, DDLParseException {
		byte[] b = new byte[in.available()];
		in.read(b);
		this.rawddl = new String(b);
		validate();
	}
	
	public TableInfo parse() throws DDLParseException {
		doParse();
		return tableInfo;
	}
	
	/*---------------private methods--------------*/
	private void validate() throws DDLParseException {
		if (Utils.isBlank(rawddl)) {
			throw new DDLParseException("DDL is empty, please check it");
		}
	}
	
	private void doParse() throws DDLParseException{
		
		/*
		Map<Integer, String> keyWordPos = new TreeMap<>();
		StringBuffer buf = new StringBuffer();
		char[] chars = rawddl.toCharArray();
		for (int i = 0; i < chars.length; i++) {
			
			char c = chars[i];
			buf.append(c);
			if (isKeyWord(buf.toString())) {
				String keyWord = try2Keyword(buf.toString());
				buf.delete(0, buf.length());
				keyWordPos.put(i, keyWord);
				continue;
			}
		}
		
		Set<Integer> pos = keyWordPos.keySet();
		for (int i = 0; i < pos.size(); i++) {
			
		}
		*/
		
		//String[] keywordSeq = {KeyWords.CREATE, KeyWords.TABLE};
	}
	
	private boolean isKeyWord(String arg0) {
		if (Utils.isBlank(arg0)) {
			return false;
		}
		return KeyWords.keywords().contains(try2Keyword(arg0));
	}
	
	private boolean isSplitter(String arg0) {
		if (Utils.isBlank(arg0)) {
			return false;
		}
		return " ".equals(arg0);
	}
	
	private boolean isSplitter(char c) {
		return ' ' == c;
	}
	
	private String try2Keyword(String word) {
		return word.trim().toLowerCase();
	}
	
	public static void main(String[] args) {
		
	}
	
}

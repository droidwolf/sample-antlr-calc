package com.droidwolf.calc;

import java.io.IOException;

import org.antlr.runtime.ANTLRFileStream;
import org.antlr.runtime.ANTLRInputStream;
import org.antlr.runtime.ANTLRStringStream;
import org.antlr.runtime.CharStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.tree.CommonTree;
import org.antlr.runtime.tree.CommonTreeNodeStream;

public class calc {

	/**
	 * @param args
	 * @throws RecognitionException 
	 * @throws IOException 
	 */
	public static void main(String[] args) throws RecognitionException, IOException {
		CharStream input= new ANTLRStringStream("1+2*3-5/0;");//new ANTLRInputStream (System.in);
		calcLexer lexer= new calcLexer (input);
		CommonTokenStream  token= new CommonTokenStream (lexer);
		calcParser parser=new calcParser (token );
		calcParser.program_return r=parser.program();
		CommonTree tree=r.tree;

		CommonTreeNodeStream treeStream=new CommonTreeNodeStream (tree);
		calcTree walker = new calcTree (treeStream);
		try{
			walker.program();
			System.out.println("finished!");
		}catch(Exception e){
			e.printStackTrace();
		}
	}

}

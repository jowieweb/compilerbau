// Generated from JavaLexer.g4 by ANTLR 4.7
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link JavaLexerParser}.
 */
public interface JavaLexerListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link JavaLexerParser#r}.
	 * @param ctx the parse tree
	 */
	void enterR(JavaLexerParser.RContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaLexerParser#r}.
	 * @param ctx the parse tree
	 */
	void exitR(JavaLexerParser.RContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaLexerParser#accessmod}.
	 * @param ctx the parse tree
	 */
	void enterAccessmod(JavaLexerParser.AccessmodContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaLexerParser#accessmod}.
	 * @param ctx the parse tree
	 */
	void exitAccessmod(JavaLexerParser.AccessmodContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaLexerParser#parameter}.
	 * @param ctx the parse tree
	 */
	void enterParameter(JavaLexerParser.ParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaLexerParser#parameter}.
	 * @param ctx the parse tree
	 */
	void exitParameter(JavaLexerParser.ParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaLexerParser#datatype}.
	 * @param ctx the parse tree
	 */
	void enterDatatype(JavaLexerParser.DatatypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaLexerParser#datatype}.
	 * @param ctx the parse tree
	 */
	void exitDatatype(JavaLexerParser.DatatypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaLexerParser#method_sig}.
	 * @param ctx the parse tree
	 */
	void enterMethod_sig(JavaLexerParser.Method_sigContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaLexerParser#method_sig}.
	 * @param ctx the parse tree
	 */
	void exitMethod_sig(JavaLexerParser.Method_sigContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaLexerParser#method_call}.
	 * @param ctx the parse tree
	 */
	void enterMethod_call(JavaLexerParser.Method_callContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaLexerParser#method_call}.
	 * @param ctx the parse tree
	 */
	void exitMethod_call(JavaLexerParser.Method_callContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaLexerParser#method}.
	 * @param ctx the parse tree
	 */
	void enterMethod(JavaLexerParser.MethodContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaLexerParser#method}.
	 * @param ctx the parse tree
	 */
	void exitMethod(JavaLexerParser.MethodContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaLexerParser#variable}.
	 * @param ctx the parse tree
	 */
	void enterVariable(JavaLexerParser.VariableContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaLexerParser#variable}.
	 * @param ctx the parse tree
	 */
	void exitVariable(JavaLexerParser.VariableContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaLexerParser#attribute}.
	 * @param ctx the parse tree
	 */
	void enterAttribute(JavaLexerParser.AttributeContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaLexerParser#attribute}.
	 * @param ctx the parse tree
	 */
	void exitAttribute(JavaLexerParser.AttributeContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaLexerParser#class_def}.
	 * @param ctx the parse tree
	 */
	void enterClass_def(JavaLexerParser.Class_defContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaLexerParser#class_def}.
	 * @param ctx the parse tree
	 */
	void exitClass_def(JavaLexerParser.Class_defContext ctx);
}
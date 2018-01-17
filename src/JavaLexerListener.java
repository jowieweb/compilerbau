// Generated from /home/nils/Nextcloud/Master/2. Semester/Compilerbau/Projekt/JavaLexer.g4 by ANTLR 4.7
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
	 * Enter a parse tree produced by {@link JavaLexerParser#constructor}.
	 * @param ctx the parse tree
	 */
	void enterConstructor(JavaLexerParser.ConstructorContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaLexerParser#constructor}.
	 * @param ctx the parse tree
	 */
	void exitConstructor(JavaLexerParser.ConstructorContext ctx);
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
	 * Enter a parse tree produced by {@link JavaLexerParser#method_call_param}.
	 * @param ctx the parse tree
	 */
	void enterMethod_call_param(JavaLexerParser.Method_call_paramContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaLexerParser#method_call_param}.
	 * @param ctx the parse tree
	 */
	void exitMethod_call_param(JavaLexerParser.Method_call_paramContext ctx);
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
	 * Enter a parse tree produced by {@link JavaLexerParser#scope}.
	 * @param ctx the parse tree
	 */
	void enterScope(JavaLexerParser.ScopeContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaLexerParser#scope}.
	 * @param ctx the parse tree
	 */
	void exitScope(JavaLexerParser.ScopeContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaLexerParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(JavaLexerParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaLexerParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(JavaLexerParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaLexerParser#condition}.
	 * @param ctx the parse tree
	 */
	void enterCondition(JavaLexerParser.ConditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaLexerParser#condition}.
	 * @param ctx the parse tree
	 */
	void exitCondition(JavaLexerParser.ConditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaLexerParser#if_cond}.
	 * @param ctx the parse tree
	 */
	void enterIf_cond(JavaLexerParser.If_condContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaLexerParser#if_cond}.
	 * @param ctx the parse tree
	 */
	void exitIf_cond(JavaLexerParser.If_condContext ctx);
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
	 * Enter a parse tree produced by {@link JavaLexerParser#scope_body}.
	 * @param ctx the parse tree
	 */
	void enterScope_body(JavaLexerParser.Scope_bodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaLexerParser#scope_body}.
	 * @param ctx the parse tree
	 */
	void exitScope_body(JavaLexerParser.Scope_bodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaLexerParser#for_loop}.
	 * @param ctx the parse tree
	 */
	void enterFor_loop(JavaLexerParser.For_loopContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaLexerParser#for_loop}.
	 * @param ctx the parse tree
	 */
	void exitFor_loop(JavaLexerParser.For_loopContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaLexerParser#while_loop}.
	 * @param ctx the parse tree
	 */
	void enterWhile_loop(JavaLexerParser.While_loopContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaLexerParser#while_loop}.
	 * @param ctx the parse tree
	 */
	void exitWhile_loop(JavaLexerParser.While_loopContext ctx);
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
	/**
	 * Enter a parse tree produced by {@link JavaLexerParser#interface_def}.
	 * @param ctx the parse tree
	 */
	void enterInterface_def(JavaLexerParser.Interface_defContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaLexerParser#interface_def}.
	 * @param ctx the parse tree
	 */
	void exitInterface_def(JavaLexerParser.Interface_defContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaLexerParser#class_name}.
	 * @param ctx the parse tree
	 */
	void enterClass_name(JavaLexerParser.Class_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaLexerParser#class_name}.
	 * @param ctx the parse tree
	 */
	void exitClass_name(JavaLexerParser.Class_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaLexerParser#interface_name}.
	 * @param ctx the parse tree
	 */
	void enterInterface_name(JavaLexerParser.Interface_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaLexerParser#interface_name}.
	 * @param ctx the parse tree
	 */
	void exitInterface_name(JavaLexerParser.Interface_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaLexerParser#method_name}.
	 * @param ctx the parse tree
	 */
	void enterMethod_name(JavaLexerParser.Method_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaLexerParser#method_name}.
	 * @param ctx the parse tree
	 */
	void exitMethod_name(JavaLexerParser.Method_nameContext ctx);
}
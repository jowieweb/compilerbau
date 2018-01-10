// Generated from /home/nils/Nextcloud/Master/2. Semester/Compilerbau/compilerbau/JavaLexer.g4 by ANTLR 4.7
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link JavaLexerParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface JavaLexerVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link JavaLexerParser#r}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitR(JavaLexerParser.RContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaLexerParser#accessmod}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAccessmod(JavaLexerParser.AccessmodContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaLexerParser#parameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameter(JavaLexerParser.ParameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaLexerParser#constructor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstructor(JavaLexerParser.ConstructorContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaLexerParser#method_sig}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethod_sig(JavaLexerParser.Method_sigContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaLexerParser#method_call}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethod_call(JavaLexerParser.Method_callContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaLexerParser#method_call_param}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethod_call_param(JavaLexerParser.Method_call_paramContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaLexerParser#method}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethod(JavaLexerParser.MethodContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaLexerParser#scope}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitScope(JavaLexerParser.ScopeContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaLexerParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(JavaLexerParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaLexerParser#condition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondition(JavaLexerParser.ConditionContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaLexerParser#variable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariable(JavaLexerParser.VariableContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaLexerParser#attribute}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttribute(JavaLexerParser.AttributeContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaLexerParser#datatype}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDatatype(JavaLexerParser.DatatypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaLexerParser#scope_body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitScope_body(JavaLexerParser.Scope_bodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaLexerParser#for_loop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFor_loop(JavaLexerParser.For_loopContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaLexerParser#while_loop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhile_loop(JavaLexerParser.While_loopContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaLexerParser#class_def}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClass_def(JavaLexerParser.Class_defContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaLexerParser#interface_def}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterface_def(JavaLexerParser.Interface_defContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaLexerParser#class_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClass_name(JavaLexerParser.Class_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaLexerParser#interface_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterface_name(JavaLexerParser.Interface_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaLexerParser#method_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethod_name(JavaLexerParser.Method_nameContext ctx);
}
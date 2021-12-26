// Generated from /home/alex/Prog/Jaba/MyLen/src/main/java/antlr/MyLenG.g4 by ANTLR 4.9.1
package antlr;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link MyLenGParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface MyLenGVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link MyLenGParser#parse}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParse(MyLenGParser.ParseContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyLenGParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(MyLenGParser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyLenGParser#assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment(MyLenGParser.AssignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyLenGParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStat(MyLenGParser.StatContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyLenGParser#procedure}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProcedure(MyLenGParser.ProcedureContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyLenGParser#if_state}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf_state(MyLenGParser.If_stateContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyLenGParser#while_state}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhile_state(MyLenGParser.While_stateContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyLenGParser#condition_block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondition_block(MyLenGParser.Condition_blockContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyLenGParser#log_block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLog_block(MyLenGParser.Log_blockContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyLenGParser#print}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrint(MyLenGParser.PrintContext ctx);
}
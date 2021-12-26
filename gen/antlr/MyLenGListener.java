// Generated from /home/alex/Prog/Jaba/MyLen/src/main/java/antlr/MyLenG.g4 by ANTLR 4.9.1
package antlr;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link MyLenGParser}.
 */
public interface MyLenGListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link MyLenGParser#parse}.
	 * @param ctx the parse tree
	 */
	void enterParse(MyLenGParser.ParseContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyLenGParser#parse}.
	 * @param ctx the parse tree
	 */
	void exitParse(MyLenGParser.ParseContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyLenGParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(MyLenGParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyLenGParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(MyLenGParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyLenGParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignment(MyLenGParser.AssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyLenGParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignment(MyLenGParser.AssignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyLenGParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterStat(MyLenGParser.StatContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyLenGParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitStat(MyLenGParser.StatContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyLenGParser#procedure}.
	 * @param ctx the parse tree
	 */
	void enterProcedure(MyLenGParser.ProcedureContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyLenGParser#procedure}.
	 * @param ctx the parse tree
	 */
	void exitProcedure(MyLenGParser.ProcedureContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyLenGParser#if_state}.
	 * @param ctx the parse tree
	 */
	void enterIf_state(MyLenGParser.If_stateContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyLenGParser#if_state}.
	 * @param ctx the parse tree
	 */
	void exitIf_state(MyLenGParser.If_stateContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyLenGParser#while_state}.
	 * @param ctx the parse tree
	 */
	void enterWhile_state(MyLenGParser.While_stateContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyLenGParser#while_state}.
	 * @param ctx the parse tree
	 */
	void exitWhile_state(MyLenGParser.While_stateContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyLenGParser#condition_block}.
	 * @param ctx the parse tree
	 */
	void enterCondition_block(MyLenGParser.Condition_blockContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyLenGParser#condition_block}.
	 * @param ctx the parse tree
	 */
	void exitCondition_block(MyLenGParser.Condition_blockContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyLenGParser#log_block}.
	 * @param ctx the parse tree
	 */
	void enterLog_block(MyLenGParser.Log_blockContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyLenGParser#log_block}.
	 * @param ctx the parse tree
	 */
	void exitLog_block(MyLenGParser.Log_blockContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyLenGParser#print}.
	 * @param ctx the parse tree
	 */
	void enterPrint(MyLenGParser.PrintContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyLenGParser#print}.
	 * @param ctx the parse tree
	 */
	void exitPrint(MyLenGParser.PrintContext ctx);
}
// Generated from ../efilter/src/main/antlr4/com/eurotech/filter/Filter.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link FilterParser}.
 */
public interface FilterListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link FilterParser#start}.
	 * @param ctx the parse tree
	 */
	void enterStart(FilterParser.StartContext ctx);
	/**
	 * Exit a parse tree produced by {@link FilterParser#start}.
	 * @param ctx the parse tree
	 */
	void exitStart(FilterParser.StartContext ctx);
	/**
	 * Enter a parse tree produced by {@link FilterParser#filter}.
	 * @param ctx the parse tree
	 */
	void enterFilter(FilterParser.FilterContext ctx);
	/**
	 * Exit a parse tree produced by {@link FilterParser#filter}.
	 * @param ctx the parse tree
	 */
	void exitFilter(FilterParser.FilterContext ctx);
	/**
	 * Enter a parse tree produced by the {@code notExpr}
	 * labeled alternative in {@link FilterParser#cond}.
	 * @param ctx the parse tree
	 */
	void enterNotExpr(FilterParser.NotExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code notExpr}
	 * labeled alternative in {@link FilterParser#cond}.
	 * @param ctx the parse tree
	 */
	void exitNotExpr(FilterParser.NotExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code containsKeyValueExpr}
	 * labeled alternative in {@link FilterParser#cond}.
	 * @param ctx the parse tree
	 */
	void enterContainsKeyValueExpr(FilterParser.ContainsKeyValueExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code containsKeyValueExpr}
	 * labeled alternative in {@link FilterParser#cond}.
	 * @param ctx the parse tree
	 */
	void exitContainsKeyValueExpr(FilterParser.ContainsKeyValueExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code containsKeyExpr}
	 * labeled alternative in {@link FilterParser#cond}.
	 * @param ctx the parse tree
	 */
	void enterContainsKeyExpr(FilterParser.ContainsKeyExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code containsKeyExpr}
	 * labeled alternative in {@link FilterParser#cond}.
	 * @param ctx the parse tree
	 */
	void exitContainsKeyExpr(FilterParser.ContainsKeyExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code atomExpr}
	 * labeled alternative in {@link FilterParser#cond}.
	 * @param ctx the parse tree
	 */
	void enterAtomExpr(FilterParser.AtomExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code atomExpr}
	 * labeled alternative in {@link FilterParser#cond}.
	 * @param ctx the parse tree
	 */
	void exitAtomExpr(FilterParser.AtomExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code regexExpr}
	 * labeled alternative in {@link FilterParser#cond}.
	 * @param ctx the parse tree
	 */
	void enterRegexExpr(FilterParser.RegexExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code regexExpr}
	 * labeled alternative in {@link FilterParser#cond}.
	 * @param ctx the parse tree
	 */
	void exitRegexExpr(FilterParser.RegexExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code andOrExpr}
	 * labeled alternative in {@link FilterParser#cond}.
	 * @param ctx the parse tree
	 */
	void enterAndOrExpr(FilterParser.AndOrExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code andOrExpr}
	 * labeled alternative in {@link FilterParser#cond}.
	 * @param ctx the parse tree
	 */
	void exitAndOrExpr(FilterParser.AndOrExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code parenthesisExpr}
	 * labeled alternative in {@link FilterParser#cond}.
	 * @param ctx the parse tree
	 */
	void enterParenthesisExpr(FilterParser.ParenthesisExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code parenthesisExpr}
	 * labeled alternative in {@link FilterParser#cond}.
	 * @param ctx the parse tree
	 */
	void exitParenthesisExpr(FilterParser.ParenthesisExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code compareExpr}
	 * labeled alternative in {@link FilterParser#cond}.
	 * @param ctx the parse tree
	 */
	void enterCompareExpr(FilterParser.CompareExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code compareExpr}
	 * labeled alternative in {@link FilterParser#cond}.
	 * @param ctx the parse tree
	 */
	void exitCompareExpr(FilterParser.CompareExprContext ctx);
}
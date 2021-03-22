// Generated from ../efilter/src/main/antlr4/com/eurotech/filter/Filter.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link FilterParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface FilterVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link FilterParser#start}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStart(FilterParser.StartContext ctx);
	/**
	 * Visit a parse tree produced by {@link FilterParser#filter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFilter(FilterParser.FilterContext ctx);
	/**
	 * Visit a parse tree produced by the {@code notExpr}
	 * labeled alternative in {@link FilterParser#cond}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNotExpr(FilterParser.NotExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code containsKeyValueExpr}
	 * labeled alternative in {@link FilterParser#cond}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitContainsKeyValueExpr(FilterParser.ContainsKeyValueExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code containsKeyExpr}
	 * labeled alternative in {@link FilterParser#cond}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitContainsKeyExpr(FilterParser.ContainsKeyExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code atomExpr}
	 * labeled alternative in {@link FilterParser#cond}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtomExpr(FilterParser.AtomExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code regexExpr}
	 * labeled alternative in {@link FilterParser#cond}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRegexExpr(FilterParser.RegexExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code andOrExpr}
	 * labeled alternative in {@link FilterParser#cond}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAndOrExpr(FilterParser.AndOrExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code parenthesisExpr}
	 * labeled alternative in {@link FilterParser#cond}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParenthesisExpr(FilterParser.ParenthesisExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code compareExpr}
	 * labeled alternative in {@link FilterParser#cond}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompareExpr(FilterParser.CompareExprContext ctx);
}
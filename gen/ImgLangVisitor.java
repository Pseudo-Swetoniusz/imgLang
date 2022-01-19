// Generated from C:/Users/jbtok/Desktop/studia_szkola/studia/semestr5/MiAK/imgLang\ImgLang.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link ImgLangParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface ImgLangVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link ImgLangParser#imgBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImgBlock(ImgLangParser.ImgBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link ImgLangParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(ImgLangParser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link ImgLangParser#back_block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBack_block(ImgLangParser.Back_blockContext ctx);
	/**
	 * Visit a parse tree produced by {@link ImgLangParser#back_param}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBack_param(ImgLangParser.Back_paramContext ctx);
	/**
	 * Visit a parse tree produced by {@link ImgLangParser#width_sub}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWidth_sub(ImgLangParser.Width_subContext ctx);
	/**
	 * Visit a parse tree produced by {@link ImgLangParser#height_sub}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHeight_sub(ImgLangParser.Height_subContext ctx);
	/**
	 * Visit a parse tree produced by {@link ImgLangParser#layer_block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLayer_block(ImgLangParser.Layer_blockContext ctx);
	/**
	 * Visit a parse tree produced by {@link ImgLangParser#layer_param}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLayer_param(ImgLangParser.Layer_paramContext ctx);
	/**
	 * Visit a parse tree produced by {@link ImgLangParser#trans_block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTrans_block(ImgLangParser.Trans_blockContext ctx);
	/**
	 * Visit a parse tree produced by {@link ImgLangParser#trans_param}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTrans_param(ImgLangParser.Trans_paramContext ctx);
	/**
	 * Visit a parse tree produced by {@link ImgLangParser#rotate_sub}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRotate_sub(ImgLangParser.Rotate_subContext ctx);
	/**
	 * Visit a parse tree produced by {@link ImgLangParser#scale_sub}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitScale_sub(ImgLangParser.Scale_subContext ctx);
	/**
	 * Visit a parse tree produced by {@link ImgLangParser#color_sub}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColor_sub(ImgLangParser.Color_subContext ctx);
	/**
	 * Visit a parse tree produced by {@link ImgLangParser#opacity_sub}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpacity_sub(ImgLangParser.Opacity_subContext ctx);
	/**
	 * Visit a parse tree produced by {@link ImgLangParser#rgb_val}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRgb_val(ImgLangParser.Rgb_valContext ctx);
	/**
	 * Visit a parse tree produced by {@link ImgLangParser#shapes_block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShapes_block(ImgLangParser.Shapes_blockContext ctx);
	/**
	 * Visit a parse tree produced by {@link ImgLangParser#shape_block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShape_block(ImgLangParser.Shape_blockContext ctx);
	/**
	 * Visit a parse tree produced by {@link ImgLangParser#position_sub}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPosition_sub(ImgLangParser.Position_subContext ctx);
	/**
	 * Visit a parse tree produced by {@link ImgLangParser#position_val}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPosition_val(ImgLangParser.Position_valContext ctx);
	/**
	 * Visit a parse tree produced by {@link ImgLangParser#priority_sub}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPriority_sub(ImgLangParser.Priority_subContext ctx);
	/**
	 * Visit a parse tree produced by {@link ImgLangParser#rect_block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRect_block(ImgLangParser.Rect_blockContext ctx);
	/**
	 * Visit a parse tree produced by {@link ImgLangParser#circ_block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCirc_block(ImgLangParser.Circ_blockContext ctx);
	/**
	 * Visit a parse tree produced by {@link ImgLangParser#poly_block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPoly_block(ImgLangParser.Poly_blockContext ctx);
	/**
	 * Visit a parse tree produced by {@link ImgLangParser#rect_param}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRect_param(ImgLangParser.Rect_paramContext ctx);
	/**
	 * Visit a parse tree produced by {@link ImgLangParser#circ_param}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCirc_param(ImgLangParser.Circ_paramContext ctx);
	/**
	 * Visit a parse tree produced by {@link ImgLangParser#poly_param}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPoly_param(ImgLangParser.Poly_paramContext ctx);
	/**
	 * Visit a parse tree produced by {@link ImgLangParser#radius_sub}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRadius_sub(ImgLangParser.Radius_subContext ctx);
	/**
	 * Visit a parse tree produced by {@link ImgLangParser#vertex_sub}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVertex_sub(ImgLangParser.Vertex_subContext ctx);
	/**
	 * Visit a parse tree produced by {@link ImgLangParser#vertex_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVertex_list(ImgLangParser.Vertex_listContext ctx);
}
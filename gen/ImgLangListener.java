// Generated from C:/Users/jbtok/Desktop/studia_szkola/studia/semestr5/MiAK/imgLang\ImgLang.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link ImgLangParser}.
 */
public interface ImgLangListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link ImgLangParser#imgBlock}.
	 * @param ctx the parse tree
	 */
	void enterImgBlock(ImgLangParser.ImgBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link ImgLangParser#imgBlock}.
	 * @param ctx the parse tree
	 */
	void exitImgBlock(ImgLangParser.ImgBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link ImgLangParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(ImgLangParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link ImgLangParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(ImgLangParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link ImgLangParser#back_block}.
	 * @param ctx the parse tree
	 */
	void enterBack_block(ImgLangParser.Back_blockContext ctx);
	/**
	 * Exit a parse tree produced by {@link ImgLangParser#back_block}.
	 * @param ctx the parse tree
	 */
	void exitBack_block(ImgLangParser.Back_blockContext ctx);
	/**
	 * Enter a parse tree produced by {@link ImgLangParser#back_param}.
	 * @param ctx the parse tree
	 */
	void enterBack_param(ImgLangParser.Back_paramContext ctx);
	/**
	 * Exit a parse tree produced by {@link ImgLangParser#back_param}.
	 * @param ctx the parse tree
	 */
	void exitBack_param(ImgLangParser.Back_paramContext ctx);
	/**
	 * Enter a parse tree produced by {@link ImgLangParser#width_sub}.
	 * @param ctx the parse tree
	 */
	void enterWidth_sub(ImgLangParser.Width_subContext ctx);
	/**
	 * Exit a parse tree produced by {@link ImgLangParser#width_sub}.
	 * @param ctx the parse tree
	 */
	void exitWidth_sub(ImgLangParser.Width_subContext ctx);
	/**
	 * Enter a parse tree produced by {@link ImgLangParser#height_sub}.
	 * @param ctx the parse tree
	 */
	void enterHeight_sub(ImgLangParser.Height_subContext ctx);
	/**
	 * Exit a parse tree produced by {@link ImgLangParser#height_sub}.
	 * @param ctx the parse tree
	 */
	void exitHeight_sub(ImgLangParser.Height_subContext ctx);
	/**
	 * Enter a parse tree produced by {@link ImgLangParser#layer_block}.
	 * @param ctx the parse tree
	 */
	void enterLayer_block(ImgLangParser.Layer_blockContext ctx);
	/**
	 * Exit a parse tree produced by {@link ImgLangParser#layer_block}.
	 * @param ctx the parse tree
	 */
	void exitLayer_block(ImgLangParser.Layer_blockContext ctx);
	/**
	 * Enter a parse tree produced by {@link ImgLangParser#layer_param}.
	 * @param ctx the parse tree
	 */
	void enterLayer_param(ImgLangParser.Layer_paramContext ctx);
	/**
	 * Exit a parse tree produced by {@link ImgLangParser#layer_param}.
	 * @param ctx the parse tree
	 */
	void exitLayer_param(ImgLangParser.Layer_paramContext ctx);
	/**
	 * Enter a parse tree produced by {@link ImgLangParser#trans_block}.
	 * @param ctx the parse tree
	 */
	void enterTrans_block(ImgLangParser.Trans_blockContext ctx);
	/**
	 * Exit a parse tree produced by {@link ImgLangParser#trans_block}.
	 * @param ctx the parse tree
	 */
	void exitTrans_block(ImgLangParser.Trans_blockContext ctx);
	/**
	 * Enter a parse tree produced by {@link ImgLangParser#trans_param}.
	 * @param ctx the parse tree
	 */
	void enterTrans_param(ImgLangParser.Trans_paramContext ctx);
	/**
	 * Exit a parse tree produced by {@link ImgLangParser#trans_param}.
	 * @param ctx the parse tree
	 */
	void exitTrans_param(ImgLangParser.Trans_paramContext ctx);
	/**
	 * Enter a parse tree produced by {@link ImgLangParser#rotate_sub}.
	 * @param ctx the parse tree
	 */
	void enterRotate_sub(ImgLangParser.Rotate_subContext ctx);
	/**
	 * Exit a parse tree produced by {@link ImgLangParser#rotate_sub}.
	 * @param ctx the parse tree
	 */
	void exitRotate_sub(ImgLangParser.Rotate_subContext ctx);
	/**
	 * Enter a parse tree produced by {@link ImgLangParser#scale_sub}.
	 * @param ctx the parse tree
	 */
	void enterScale_sub(ImgLangParser.Scale_subContext ctx);
	/**
	 * Exit a parse tree produced by {@link ImgLangParser#scale_sub}.
	 * @param ctx the parse tree
	 */
	void exitScale_sub(ImgLangParser.Scale_subContext ctx);
	/**
	 * Enter a parse tree produced by {@link ImgLangParser#color_sub}.
	 * @param ctx the parse tree
	 */
	void enterColor_sub(ImgLangParser.Color_subContext ctx);
	/**
	 * Exit a parse tree produced by {@link ImgLangParser#color_sub}.
	 * @param ctx the parse tree
	 */
	void exitColor_sub(ImgLangParser.Color_subContext ctx);
	/**
	 * Enter a parse tree produced by {@link ImgLangParser#opacity_sub}.
	 * @param ctx the parse tree
	 */
	void enterOpacity_sub(ImgLangParser.Opacity_subContext ctx);
	/**
	 * Exit a parse tree produced by {@link ImgLangParser#opacity_sub}.
	 * @param ctx the parse tree
	 */
	void exitOpacity_sub(ImgLangParser.Opacity_subContext ctx);
	/**
	 * Enter a parse tree produced by {@link ImgLangParser#rgb_val}.
	 * @param ctx the parse tree
	 */
	void enterRgb_val(ImgLangParser.Rgb_valContext ctx);
	/**
	 * Exit a parse tree produced by {@link ImgLangParser#rgb_val}.
	 * @param ctx the parse tree
	 */
	void exitRgb_val(ImgLangParser.Rgb_valContext ctx);
	/**
	 * Enter a parse tree produced by {@link ImgLangParser#shapes_block}.
	 * @param ctx the parse tree
	 */
	void enterShapes_block(ImgLangParser.Shapes_blockContext ctx);
	/**
	 * Exit a parse tree produced by {@link ImgLangParser#shapes_block}.
	 * @param ctx the parse tree
	 */
	void exitShapes_block(ImgLangParser.Shapes_blockContext ctx);
	/**
	 * Enter a parse tree produced by {@link ImgLangParser#shape_block}.
	 * @param ctx the parse tree
	 */
	void enterShape_block(ImgLangParser.Shape_blockContext ctx);
	/**
	 * Exit a parse tree produced by {@link ImgLangParser#shape_block}.
	 * @param ctx the parse tree
	 */
	void exitShape_block(ImgLangParser.Shape_blockContext ctx);
	/**
	 * Enter a parse tree produced by {@link ImgLangParser#position_sub}.
	 * @param ctx the parse tree
	 */
	void enterPosition_sub(ImgLangParser.Position_subContext ctx);
	/**
	 * Exit a parse tree produced by {@link ImgLangParser#position_sub}.
	 * @param ctx the parse tree
	 */
	void exitPosition_sub(ImgLangParser.Position_subContext ctx);
	/**
	 * Enter a parse tree produced by {@link ImgLangParser#position_val}.
	 * @param ctx the parse tree
	 */
	void enterPosition_val(ImgLangParser.Position_valContext ctx);
	/**
	 * Exit a parse tree produced by {@link ImgLangParser#position_val}.
	 * @param ctx the parse tree
	 */
	void exitPosition_val(ImgLangParser.Position_valContext ctx);
	/**
	 * Enter a parse tree produced by {@link ImgLangParser#priority_sub}.
	 * @param ctx the parse tree
	 */
	void enterPriority_sub(ImgLangParser.Priority_subContext ctx);
	/**
	 * Exit a parse tree produced by {@link ImgLangParser#priority_sub}.
	 * @param ctx the parse tree
	 */
	void exitPriority_sub(ImgLangParser.Priority_subContext ctx);
	/**
	 * Enter a parse tree produced by {@link ImgLangParser#rect_block}.
	 * @param ctx the parse tree
	 */
	void enterRect_block(ImgLangParser.Rect_blockContext ctx);
	/**
	 * Exit a parse tree produced by {@link ImgLangParser#rect_block}.
	 * @param ctx the parse tree
	 */
	void exitRect_block(ImgLangParser.Rect_blockContext ctx);
	/**
	 * Enter a parse tree produced by {@link ImgLangParser#circ_block}.
	 * @param ctx the parse tree
	 */
	void enterCirc_block(ImgLangParser.Circ_blockContext ctx);
	/**
	 * Exit a parse tree produced by {@link ImgLangParser#circ_block}.
	 * @param ctx the parse tree
	 */
	void exitCirc_block(ImgLangParser.Circ_blockContext ctx);
	/**
	 * Enter a parse tree produced by {@link ImgLangParser#poly_block}.
	 * @param ctx the parse tree
	 */
	void enterPoly_block(ImgLangParser.Poly_blockContext ctx);
	/**
	 * Exit a parse tree produced by {@link ImgLangParser#poly_block}.
	 * @param ctx the parse tree
	 */
	void exitPoly_block(ImgLangParser.Poly_blockContext ctx);
	/**
	 * Enter a parse tree produced by {@link ImgLangParser#rect_param}.
	 * @param ctx the parse tree
	 */
	void enterRect_param(ImgLangParser.Rect_paramContext ctx);
	/**
	 * Exit a parse tree produced by {@link ImgLangParser#rect_param}.
	 * @param ctx the parse tree
	 */
	void exitRect_param(ImgLangParser.Rect_paramContext ctx);
	/**
	 * Enter a parse tree produced by {@link ImgLangParser#circ_param}.
	 * @param ctx the parse tree
	 */
	void enterCirc_param(ImgLangParser.Circ_paramContext ctx);
	/**
	 * Exit a parse tree produced by {@link ImgLangParser#circ_param}.
	 * @param ctx the parse tree
	 */
	void exitCirc_param(ImgLangParser.Circ_paramContext ctx);
	/**
	 * Enter a parse tree produced by {@link ImgLangParser#poly_param}.
	 * @param ctx the parse tree
	 */
	void enterPoly_param(ImgLangParser.Poly_paramContext ctx);
	/**
	 * Exit a parse tree produced by {@link ImgLangParser#poly_param}.
	 * @param ctx the parse tree
	 */
	void exitPoly_param(ImgLangParser.Poly_paramContext ctx);
	/**
	 * Enter a parse tree produced by {@link ImgLangParser#radius_sub}.
	 * @param ctx the parse tree
	 */
	void enterRadius_sub(ImgLangParser.Radius_subContext ctx);
	/**
	 * Exit a parse tree produced by {@link ImgLangParser#radius_sub}.
	 * @param ctx the parse tree
	 */
	void exitRadius_sub(ImgLangParser.Radius_subContext ctx);
	/**
	 * Enter a parse tree produced by {@link ImgLangParser#vertex_sub}.
	 * @param ctx the parse tree
	 */
	void enterVertex_sub(ImgLangParser.Vertex_subContext ctx);
	/**
	 * Exit a parse tree produced by {@link ImgLangParser#vertex_sub}.
	 * @param ctx the parse tree
	 */
	void exitVertex_sub(ImgLangParser.Vertex_subContext ctx);
	/**
	 * Enter a parse tree produced by {@link ImgLangParser#vertex_list}.
	 * @param ctx the parse tree
	 */
	void enterVertex_list(ImgLangParser.Vertex_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link ImgLangParser#vertex_list}.
	 * @param ctx the parse tree
	 */
	void exitVertex_list(ImgLangParser.Vertex_listContext ctx);
}
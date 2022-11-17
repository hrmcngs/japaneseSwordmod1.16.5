// Made with Blockbench 4.4.3
// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
// Paste this class into your mod and generate all required imports

public static class Model半霊黒 extends EntityModel<Entity> {
	private final ModelRenderer bone;

	public Model半霊黒() {
		textureWidth = 32;
		textureHeight = 32;

		bone = new ModelRenderer(this);
		bone.setRotationPoint(0.0F, 20.0F, 3.0F);
		bone.setTextureOffset(0, 11).addBox(-2.0F, -18.0F, 3.0F, 3.0F, 1.0F, 2.0F, 0.0F, false);
		bone.setTextureOffset(17, 3).addBox(-3.0F, -12.0F, 2.0F, 1.0F, 2.0F, 2.0F, 0.0F, false);
		bone.setTextureOffset(7, 2).addBox(2.0F, -23.0F, 2.0F, 2.0F, 2.0F, 3.0F, 0.0F, false);
		bone.setTextureOffset(0, 5).addBox(2.0F, -21.0F, 2.0F, 2.0F, 2.0F, 3.0F, 0.0F, false);
		bone.setTextureOffset(0, 0).addBox(0.0F, -21.0F, 2.0F, 2.0F, 2.0F, 3.0F, 0.0F, false);
		bone.setTextureOffset(14, 16).addBox(-2.0F, -17.0F, 2.0F, 2.0F, 1.0F, 2.0F, 0.0F, false);
		bone.setTextureOffset(14, 7).addBox(-2.0F, -9.0F, 3.0F, 2.0F, 1.0F, 2.0F, 0.0F, false);
		bone.setTextureOffset(6, 16).addBox(-3.0F, -10.0F, 2.0F, 2.0F, 1.0F, 2.0F, 0.0F, false);
		bone.setTextureOffset(18, 13).addBox(1.0F, -6.0F, 2.0F, 1.0F, 1.0F, 2.0F, 0.0F, false);
		bone.setTextureOffset(14, 0).addBox(-1.0F, -8.0F, 3.0F, 2.0F, 1.0F, 2.0F, 0.0F, false);
		bone.setTextureOffset(16, 10).addBox(-3.0F, -16.0F, 3.0F, 2.0F, 1.0F, 2.0F, 0.0F, false);
		bone.setTextureOffset(0, 17).addBox(0.0F, -22.0F, 3.0F, 2.0F, 1.0F, 2.0F, 0.0F, false);
		bone.setTextureOffset(8, 13).addBox(-1.0F, -19.0F, 3.0F, 3.0F, 1.0F, 2.0F, 0.0F, false);
		bone.setTextureOffset(7, 0).addBox(2.0F, -5.0F, 1.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		bone.setTextureOffset(8, 8).addBox(-4.0F, -15.0F, 3.0F, 2.0F, 3.0F, 2.0F, 0.0F, false);
		bone.setTextureOffset(0, 14).addBox(0.0F, -7.0F, 2.0F, 2.0F, 1.0F, 2.0F, 0.0F, false);
	}

	@Override
	public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red,
			float green, float blue, float alpha) {
		bone.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
	}
}
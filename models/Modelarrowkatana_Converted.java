// Made with Blockbench 4.7.2
// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
// Paste this class into your mod and generate all required imports

public static class Modelarrowkatana_Converted extends EntityModel<Entity> {
	private final ModelRenderer arrow;
	private final ModelRenderer bone;
	private final ModelRenderer cube_r1;

	public Modelarrowkatana_Converted() {
		textureWidth = 32;
		textureHeight = 32;

		arrow = new ModelRenderer(this);
		arrow.setRotationPoint(0.0F, 23.5F, 0.0F);
		setRotationAngle(arrow, -1.5708F, 0.0F, -1.5708F);

		bone = new ModelRenderer(this);
		bone.setRotationPoint(-3.0F, 3.0F, 0.0F);
		arrow.addChild(bone);

		cube_r1 = new ModelRenderer(this);
		cube_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone.addChild(cube_r1);
		setRotationAngle(cube_r1, 0.0F, 0.0F, 0.7854F);
		cube_r1.setTextureOffset(5, 17).addBox(-2.25F, -4.0F, -0.5F, 2.0F, 1.0F, 1.0F, 0.0F, false);
		cube_r1.setTextureOffset(13, 3).addBox(-6.25F, 1.0F, -0.5F, 3.0F, 1.0F, 1.0F, 0.0F, false);
		cube_r1.setTextureOffset(9, 13).addBox(-6.25F, 0.0F, -0.5F, 3.0F, 1.0F, 1.0F, 0.0F, false);
		cube_r1.setTextureOffset(0, 12).addBox(-6.25F, -1.0F, -0.5F, 4.0F, 1.0F, 1.0F, 0.0F, false);
		cube_r1.setTextureOffset(0, 14).addBox(-4.25F, -2.0F, -0.5F, 3.0F, 1.0F, 1.0F, 0.0F, false);
		cube_r1.setTextureOffset(15, 1).addBox(-4.25F, -7.0F, -0.5F, 3.0F, 1.0F, 1.0F, 0.0F, false);
		cube_r1.setTextureOffset(0, 16).addBox(-4.25F, -8.0F, -0.5F, 2.0F, 1.0F, 1.0F, 0.0F, false);
		cube_r1.setTextureOffset(11, 11).addBox(6.75F, -14.0F, -0.5F, 4.0F, 1.0F, 1.0F, 0.0F, false);
		cube_r1.setTextureOffset(0, 4).addBox(5.75F, -13.0F, -0.5F, 5.0F, 1.0F, 1.0F, 0.0F, false);
		cube_r1.setTextureOffset(0, 6).addBox(4.75F, -12.0F, -0.5F, 5.0F, 1.0F, 1.0F, 0.0F, false);
		cube_r1.setTextureOffset(0, 8).addBox(3.75F, -11.0F, -0.5F, 5.0F, 1.0F, 1.0F, 0.0F, false);
		cube_r1.setTextureOffset(0, 10).addBox(2.75F, -10.0F, -0.5F, 5.0F, 1.0F, 1.0F, 0.0F, false);
		cube_r1.setTextureOffset(11, 5).addBox(1.75F, -9.0F, -0.5F, 5.0F, 1.0F, 1.0F, 0.0F, false);
		cube_r1.setTextureOffset(11, 7).addBox(0.75F, -8.0F, -0.5F, 5.0F, 1.0F, 1.0F, 0.0F, false);
		cube_r1.setTextureOffset(11, 9).addBox(-0.25F, -7.0F, -0.5F, 5.0F, 1.0F, 1.0F, 0.0F, false);
		cube_r1.setTextureOffset(0, 0).addBox(-3.25F, -6.0F, -0.5F, 7.0F, 1.0F, 1.0F, 0.0F, false);
		cube_r1.setTextureOffset(0, 2).addBox(-3.25F, -5.0F, -0.5F, 6.0F, 1.0F, 1.0F, 0.0F, false);
		cube_r1.setTextureOffset(7, 15).addBox(-3.25F, -3.0F, -0.5F, 3.0F, 1.0F, 1.0F, 0.0F, false);
		cube_r1.setTextureOffset(11, 17).addBox(-0.25F, -3.0F, -0.5F, 1.0F, 2.0F, 1.0F, 0.0F, false);
		cube_r1.setTextureOffset(15, 18).addBox(0.75F, -2.0F, -0.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		cube_r1.setTextureOffset(17, 13).addBox(-0.25F, -4.0F, -0.5F, 2.0F, 1.0F, 1.0F, 0.0F, false);
		cube_r1.setTextureOffset(0, 18).addBox(0.75F, -3.0F, -0.5F, 2.0F, 1.0F, 1.0F, 0.0F, false);
		cube_r1.setTextureOffset(15, 15).addBox(1.75F, -2.0F, -0.5F, 2.0F, 2.0F, 1.0F, 0.0F, false);
	}

	@Override
	public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red,
			float green, float blue, float alpha) {
		arrow.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
	}
}
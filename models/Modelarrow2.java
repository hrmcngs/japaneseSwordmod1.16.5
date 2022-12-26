// Made with Blockbench 4.5.2
// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
// Paste this class into your mod and generate all required imports

public static class Modelarrow2 extends EntityModel<Entity> {
	private final ModelRenderer body;
	private final ModelRenderer body_r1;
	private final ModelRenderer body_r2;
	private final ModelRenderer body_r3;

	public Modelarrow2() {
		textureWidth = 32;
		textureHeight = 32;

		body = new ModelRenderer(this);
		body.setRotationPoint(0.0F, 23.0F, 0.0F);

		body_r1 = new ModelRenderer(this);
		body_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
		body.addChild(body_r1);
		setRotationAngle(body_r1, 0.0F, 0.0F, -2.3562F);
		body_r1.setTextureOffset(0, 0).addBox(-1.2F, -1.2F, 0.0F, 1.0F, 1.0F, 13.0F, 0.0F, false);

		body_r2 = new ModelRenderer(this);
		body_r2.setRotationPoint(0.0F, 1.0F, 0.0F);
		body.addChild(body_r2);
		setRotationAngle(body_r2, 0.0F, 0.0F, 0.7854F);
		body_r2.setTextureOffset(0, 0).addBox(-2.5F, -2.5F, 12.0F, 5.0F, 5.0F, 0.0F, 0.0F, false);
		body_r2.setTextureOffset(0, 0).addBox(0.0F, -2.5F, -3.0F, 0.0F, 5.0F, 16.0F, 0.0F, false);

		body_r3 = new ModelRenderer(this);
		body_r3.setRotationPoint(0.0F, 1.0F, 0.0F);
		body.addChild(body_r3);
		setRotationAngle(body_r3, 0.0F, 0.0F, -0.7854F);
		body_r3.setTextureOffset(0, 0).addBox(0.0F, -2.5F, -3.0F, 0.0F, 5.0F, 16.0F, 0.0F, false);
	}

	@Override
	public void setRotationAngles(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks,
			float netHeadYaw, float headPitch) {
		// previously the render function, render code was moved to a method below
	}

	@Override
	public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red,
			float green, float blue, float alpha) {
		body.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}
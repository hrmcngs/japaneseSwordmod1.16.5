// Made with Blockbench 4.7.4
// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
// Paste this class into your mod and generate all required imports

public static class Modelwitchskeltn_Converted extends EntityModel<Entity> {
	private final ModelRenderer head;
	private final ModelRenderer headwear;
	private final ModelRenderer hat2;
	private final ModelRenderer hat3;
	private final ModelRenderer hat4;

	public Modelwitchskeltn_Converted() {
		textureWidth = 64;
		textureHeight = 64;

		head = new ModelRenderer(this);
		head.setRotationPoint(0.0F, 24.0F, 0.0F);
		head.setTextureOffset(0, 32).addBox(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, 0.0F, false);
		head.setTextureOffset(0, 48).addBox(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, 0.5F, false);

		headwear = new ModelRenderer(this);
		headwear.setRotationPoint(-5.0F, -9.05F, -5.0F);
		head.addChild(headwear);
		headwear.setTextureOffset(0, 0).addBox(0.0F, 0.0F, 0.0F, 10.0F, 2.0F, 10.0F, 0.0F, false);

		hat2 = new ModelRenderer(this);
		hat2.setRotationPoint(1.75F, -4.0F, 2.0F);
		headwear.addChild(hat2);
		setRotationAngle(hat2, -0.0524F, 0.0F, 0.0262F);
		hat2.setTextureOffset(25, 21).addBox(0.0F, 0.0F, 0.0F, 7.0F, 4.0F, 7.0F, 0.0F, false);

		hat3 = new ModelRenderer(this);
		hat3.setRotationPoint(1.75F, -4.0F, 2.0F);
		hat2.addChild(hat3);
		setRotationAngle(hat3, -0.1047F, 0.0F, 0.0524F);
		hat3.setTextureOffset(24, 12).addBox(0.0F, 0.0F, 0.0F, 4.0F, 4.0F, 4.0F, 0.0F, false);

		hat4 = new ModelRenderer(this);
		hat4.setRotationPoint(1.75F, -2.0F, 2.0F);
		hat3.addChild(hat4);
		setRotationAngle(hat4, -0.2094F, 0.0F, 0.1047F);
		hat4.setTextureOffset(0, 0).addBox(0.0F, 0.0F, 0.0F, 1.0F, 2.0F, 1.0F, 0.25F, false);
	}

	@Override
	public void setRotationAngles(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks,
			float netHeadYaw, float headPitch) {
		// previously the render function, render code was moved to a method below
	}

	@Override
	public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red,
			float green, float blue, float alpha) {
		head.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}
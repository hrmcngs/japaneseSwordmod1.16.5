// Made with Blockbench 4.6.5
// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
// Paste this class into your mod and generate all required imports

public static class Modelkusari3 extends EntityModel<Entity> {
	private final ModelRenderer Head;
	private final ModelRenderer bone;
	private final ModelRenderer bone2;
	private final ModelRenderer bone10;
	private final ModelRenderer bone11;
	private final ModelRenderer bone12;
	private final ModelRenderer bone3;
	private final ModelRenderer bone4;
	private final ModelRenderer bone5;
	private final ModelRenderer bone13;
	private final ModelRenderer bone14;
	private final ModelRenderer bone15;
	private final ModelRenderer bone8;
	private final ModelRenderer bone9;
	private final ModelRenderer bone6;
	private final ModelRenderer bone7;

	public Modelkusari3() {
		textureWidth = 32;
		textureHeight = 32;

		Head = new ModelRenderer(this);
		Head.setRotationPoint(0.0F, 0.0F, 0.0F);

		bone = new ModelRenderer(this);
		bone.setRotationPoint(0.0F, 24.0F, -1.0F);
		Head.addChild(bone);
		bone.setTextureOffset(10, 23).addBox(-2.0F, -28.0F, -5.0F, 1.0F, 4.0F, 0.0F, 0.0F, false);
		bone.setTextureOffset(22, 20).addBox(-4.0F, -28.0F, -5.0F, 1.0F, 4.0F, 0.0F, 0.0F, false);
		bone.setTextureOffset(20, 24).addBox(-3.0F, -30.0F, -5.0F, 1.0F, 3.0F, 0.0F, 0.0F, false);
		bone.setTextureOffset(4, 22).addBox(-2.5F, -30.0F, -5.5F, 0.0F, 3.0F, 1.0F, 0.0F, false);
		bone.setTextureOffset(14, 8).addBox(-2.5F, -28.0F, -6.5F, 0.0F, 4.0F, 1.0F, 0.0F, false);
		bone.setTextureOffset(14, 4).addBox(-2.5F, -28.0F, -4.5F, 0.0F, 4.0F, 1.0F, 0.0F, false);

		bone2 = new ModelRenderer(this);
		bone2.setRotationPoint(0.0F, 19.0F, -1.0F);
		Head.addChild(bone2);
		bone2.setTextureOffset(22, 16).addBox(-2.0F, -28.0F, -5.0F, 1.0F, 4.0F, 0.0F, 0.0F, false);
		bone2.setTextureOffset(22, 12).addBox(-4.0F, -28.0F, -5.0F, 1.0F, 4.0F, 0.0F, 0.0F, false);
		bone2.setTextureOffset(22, 8).addBox(-3.0F, -31.0F, -5.0F, 1.0F, 4.0F, 0.0F, 0.0F, false);
		bone2.setTextureOffset(14, 0).addBox(-2.5F, -31.0F, -5.5F, 0.0F, 4.0F, 1.0F, 0.0F, false);
		bone2.setTextureOffset(12, 12).addBox(-2.5F, -28.0F, -6.5F, 0.0F, 4.0F, 1.0F, 0.0F, false);
		bone2.setTextureOffset(10, 12).addBox(-2.5F, -28.0F, -4.5F, 0.0F, 4.0F, 1.0F, 0.0F, false);

		bone10 = new ModelRenderer(this);
		bone10.setRotationPoint(5.0F, 29.0F, 11.25F);
		Head.addChild(bone10);
		bone10.setTextureOffset(22, 4).addBox(-2.0F, -28.0F, -5.0F, 1.0F, 4.0F, 0.0F, 0.0F, false);
		bone10.setTextureOffset(22, 0).addBox(-4.0F, -28.0F, -5.0F, 1.0F, 4.0F, 0.0F, 0.0F, false);
		bone10.setTextureOffset(24, 18).addBox(-3.0F, -30.0F, -5.0F, 1.0F, 3.0F, 0.0F, 0.0F, false);
		bone10.setTextureOffset(0, 22).addBox(-2.5F, -30.0F, -5.5F, 0.0F, 3.0F, 1.0F, 0.0F, false);
		bone10.setTextureOffset(12, 8).addBox(-2.5F, -28.0F, -6.5F, 0.0F, 4.0F, 1.0F, 0.0F, false);
		bone10.setTextureOffset(8, 12).addBox(-2.5F, -28.0F, -4.5F, 0.0F, 4.0F, 1.0F, 0.0F, false);

		bone11 = new ModelRenderer(this);
		bone11.setRotationPoint(5.0F, 24.0F, 11.25F);
		Head.addChild(bone11);
		bone11.setTextureOffset(14, 21).addBox(-2.0F, -28.0F, -5.0F, 1.0F, 4.0F, 0.0F, 0.0F, false);
		bone11.setTextureOffset(12, 21).addBox(-4.0F, -28.0F, -5.0F, 1.0F, 4.0F, 0.0F, 0.0F, false);
		bone11.setTextureOffset(16, 24).addBox(-3.0F, -30.0F, -5.0F, 1.0F, 3.0F, 0.0F, 0.0F, false);
		bone11.setTextureOffset(8, 20).addBox(-2.5F, -30.0F, -5.5F, 0.0F, 3.0F, 1.0F, 0.0F, false);
		bone11.setTextureOffset(6, 12).addBox(-2.5F, -28.0F, -6.5F, 0.0F, 4.0F, 1.0F, 0.0F, false);
		bone11.setTextureOffset(12, 4).addBox(-2.5F, -28.0F, -4.5F, 0.0F, 4.0F, 1.0F, 0.0F, false);

		bone12 = new ModelRenderer(this);
		bone12.setRotationPoint(5.0F, 19.0F, 11.25F);
		Head.addChild(bone12);
		bone12.setTextureOffset(20, 20).addBox(-2.0F, -28.0F, -5.0F, 1.0F, 4.0F, 0.0F, 0.0F, false);
		bone12.setTextureOffset(20, 16).addBox(-4.0F, -28.0F, -5.0F, 1.0F, 4.0F, 0.0F, 0.0F, false);
		bone12.setTextureOffset(24, 15).addBox(-3.0F, -30.0F, -5.0F, 1.0F, 3.0F, 0.0F, 0.0F, false);
		bone12.setTextureOffset(6, 20).addBox(-2.5F, -30.0F, -5.5F, 0.0F, 3.0F, 1.0F, 0.0F, false);
		bone12.setTextureOffset(4, 12).addBox(-2.5F, -28.0F, -6.5F, 0.0F, 4.0F, 1.0F, 0.0F, false);
		bone12.setTextureOffset(2, 12).addBox(-2.5F, -28.0F, -4.5F, 0.0F, 4.0F, 1.0F, 0.0F, false);

		bone3 = new ModelRenderer(this);
		bone3.setRotationPoint(0.0F, 24.5F, 11.0F);
		Head.addChild(bone3);
		setRotationAngle(bone3, 0.4363F, 0.0F, 0.0F);
		bone3.setTextureOffset(16, 20).addBox(-2.0F, -28.0F, -5.0F, 1.0F, 4.0F, 0.0F, 0.0F, false);
		bone3.setTextureOffset(20, 12).addBox(-4.0F, -28.0F, -5.0F, 1.0F, 4.0F, 0.0F, 0.0F, false);
		bone3.setTextureOffset(24, 12).addBox(-3.0F, -30.0F, -5.0F, 1.0F, 3.0F, 0.0F, 0.0F, false);
		bone3.setTextureOffset(10, 19).addBox(-2.5F, -30.0F, -5.5F, 0.0F, 3.0F, 1.0F, 0.0F, false);
		bone3.setTextureOffset(12, 0).addBox(-2.5F, -28.0F, -6.5F, 0.0F, 4.0F, 1.0F, 0.0F, false);
		bone3.setTextureOffset(0, 12).addBox(-2.5F, -28.0F, -4.5F, 0.0F, 4.0F, 1.0F, 0.0F, false);

		bone4 = new ModelRenderer(this);
		bone4.setRotationPoint(0.0F, -0.5F, 25.75F);
		Head.addChild(bone4);
		setRotationAngle(bone4, 1.5708F, 0.0F, 0.0F);
		bone4.setTextureOffset(20, 8).addBox(-2.0F, -28.0F, -5.0F, 1.0F, 4.0F, 0.0F, 0.0F, false);
		bone4.setTextureOffset(20, 4).addBox(-4.0F, -28.0F, -5.0F, 1.0F, 4.0F, 0.0F, 0.0F, false);
		bone4.setTextureOffset(24, 9).addBox(-3.0F, -30.0F, -5.0F, 1.0F, 3.0F, 0.0F, 0.0F, false);
		bone4.setTextureOffset(4, 19).addBox(-2.5F, -30.0F, -5.5F, 0.0F, 3.0F, 1.0F, 0.0F, false);
		bone4.setTextureOffset(10, 8).addBox(-2.5F, -28.0F, -6.5F, 0.0F, 4.0F, 1.0F, 0.0F, false);
		bone4.setTextureOffset(10, 4).addBox(-2.5F, -28.0F, -4.5F, 0.0F, 4.0F, 1.0F, 0.0F, false);

		bone5 = new ModelRenderer(this);
		bone5.setRotationPoint(0.0F, -0.5F, 30.75F);
		Head.addChild(bone5);
		setRotationAngle(bone5, 1.5708F, 0.0F, 0.0F);
		bone5.setTextureOffset(2, 20).addBox(-2.0F, -28.0F, -5.0F, 1.0F, 4.0F, 0.0F, 0.0F, false);
		bone5.setTextureOffset(20, 0).addBox(-4.0F, -28.0F, -5.0F, 1.0F, 4.0F, 0.0F, 0.0F, false);
		bone5.setTextureOffset(8, 24).addBox(-3.0F, -30.0F, -5.0F, 1.0F, 3.0F, 0.0F, 0.0F, false);
		bone5.setTextureOffset(0, 19).addBox(-2.5F, -30.0F, -5.5F, 0.0F, 3.0F, 1.0F, 0.0F, false);
		bone5.setTextureOffset(10, 0).addBox(-2.5F, -28.0F, -6.5F, 0.0F, 4.0F, 1.0F, 0.0F, false);
		bone5.setTextureOffset(8, 8).addBox(-2.5F, -28.0F, -4.5F, 0.0F, 4.0F, 1.0F, 0.0F, false);

		bone13 = new ModelRenderer(this);
		bone13.setRotationPoint(14.25F, -15.5F, 28.5F);
		Head.addChild(bone13);
		setRotationAngle(bone13, 1.5708F, 0.3927F, 0.0F);
		bone13.setTextureOffset(18, 19).addBox(-2.0F, -28.0F, -5.0F, 1.0F, 4.0F, 0.0F, 0.0F, false);
		bone13.setTextureOffset(18, 15).addBox(-4.0F, -28.0F, -5.0F, 1.0F, 4.0F, 0.0F, 0.0F, false);
		bone13.setTextureOffset(24, 6).addBox(-3.0F, -30.0F, -5.0F, 1.0F, 3.0F, 0.0F, 0.0F, false);
		bone13.setTextureOffset(18, 11).addBox(-2.5F, -30.0F, -5.5F, 0.0F, 3.0F, 1.0F, 0.0F, false);
		bone13.setTextureOffset(6, 8).addBox(-2.5F, -28.0F, -6.5F, 0.0F, 4.0F, 1.0F, 0.0F, false);
		bone13.setTextureOffset(8, 4).addBox(-2.5F, -28.0F, -4.5F, 0.0F, 4.0F, 1.0F, 0.0F, false);

		bone14 = new ModelRenderer(this);
		bone14.setRotationPoint(12.25F, -15.5F, 23.5F);
		Head.addChild(bone14);
		setRotationAngle(bone14, 1.5708F, 0.3927F, 0.0F);
		bone14.setTextureOffset(16, 8).addBox(-2.0F, -28.0F, -5.0F, 1.0F, 4.0F, 0.0F, 0.0F, false);
		bone14.setTextureOffset(16, 4).addBox(-4.0F, -28.0F, -5.0F, 1.0F, 4.0F, 0.0F, 0.0F, false);
		bone14.setTextureOffset(18, 23).addBox(-3.0F, -30.0F, -5.0F, 1.0F, 3.0F, 0.0F, 0.0F, false);
		bone14.setTextureOffset(0, 16).addBox(-2.5F, -30.0F, -5.5F, 0.0F, 3.0F, 1.0F, 0.0F, false);
		bone14.setTextureOffset(4, 0).addBox(-2.5F, -28.0F, -6.5F, 0.0F, 4.0F, 1.0F, 0.0F, false);
		bone14.setTextureOffset(0, 4).addBox(-2.5F, -28.0F, -4.5F, 0.0F, 4.0F, 1.0F, 0.0F, false);

		bone15 = new ModelRenderer(this);
		bone15.setRotationPoint(10.25F, -15.5F, 18.5F);
		Head.addChild(bone15);
		setRotationAngle(bone15, 1.5708F, 0.3927F, 0.0F);
		bone15.setTextureOffset(16, 0).addBox(-2.0F, -28.0F, -5.0F, 1.0F, 4.0F, 0.0F, 0.0F, false);
		bone15.setTextureOffset(14, 13).addBox(-4.0F, -28.0F, -5.0F, 1.0F, 4.0F, 0.0F, 0.0F, false);
		bone15.setTextureOffset(2, 0).addBox(-2.5F, -28.0F, -6.5F, 0.0F, 4.0F, 1.0F, 0.0F, false);
		bone15.setTextureOffset(0, 0).addBox(-2.5F, -28.0F, -4.5F, 0.0F, 4.0F, 1.0F, 0.0F, false);

		bone8 = new ModelRenderer(this);
		bone8.setRotationPoint(5.0F, 9.5F, -23.25F);
		Head.addChild(bone8);
		setRotationAngle(bone8, -1.5708F, 0.0F, 0.0F);
		bone8.setTextureOffset(18, 8).addBox(-2.0F, -28.0F, -5.0F, 1.0F, 4.0F, 0.0F, 0.0F, false);
		bone8.setTextureOffset(18, 4).addBox(-4.0F, -28.0F, -5.0F, 1.0F, 4.0F, 0.0F, 0.0F, false);
		bone8.setTextureOffset(6, 24).addBox(-3.0F, -30.0F, -5.0F, 1.0F, 3.0F, 0.0F, 0.0F, false);
		bone8.setTextureOffset(18, 0).addBox(-2.5F, -30.0F, -5.5F, 0.0F, 3.0F, 1.0F, 0.0F, false);
		bone8.setTextureOffset(4, 8).addBox(-2.5F, -28.0F, -6.5F, 0.0F, 4.0F, 1.0F, 0.0F, false);
		bone8.setTextureOffset(2, 8).addBox(-2.5F, -28.0F, -4.5F, 0.0F, 4.0F, 1.0F, 0.0F, false);

		bone9 = new ModelRenderer(this);
		bone9.setRotationPoint(5.0F, 9.5F, -28.25F);
		Head.addChild(bone9);
		setRotationAngle(bone9, -1.5708F, 0.0F, 0.0F);
		bone9.setTextureOffset(14, 17).addBox(-2.0F, -28.0F, -5.0F, 1.0F, 4.0F, 0.0F, 0.0F, false);
		bone9.setTextureOffset(12, 17).addBox(-4.0F, -28.0F, -5.0F, 1.0F, 4.0F, 0.0F, 0.0F, false);
		bone9.setTextureOffset(24, 3).addBox(-3.0F, -30.0F, -5.0F, 1.0F, 3.0F, 0.0F, 0.0F, false);
		bone9.setTextureOffset(10, 16).addBox(-2.5F, -30.0F, -5.5F, 0.0F, 3.0F, 1.0F, 0.0F, false);
		bone9.setTextureOffset(8, 0).addBox(-2.5F, -28.0F, -6.5F, 0.0F, 4.0F, 1.0F, 0.0F, false);
		bone9.setTextureOffset(0, 8).addBox(-2.5F, -28.0F, -4.5F, 0.0F, 4.0F, 1.0F, 0.0F, false);

		bone6 = new ModelRenderer(this);
		bone6.setRotationPoint(27.0F, 9.5F, 8.75F);
		Head.addChild(bone6);
		setRotationAngle(bone6, -1.5708F, -1.5708F, 0.0F);
		bone6.setTextureOffset(8, 17).addBox(-2.0F, -28.0F, -5.0F, 1.0F, 4.0F, 0.0F, 0.0F, false);
		bone6.setTextureOffset(6, 17).addBox(-4.0F, -28.0F, -5.0F, 1.0F, 4.0F, 0.0F, 0.0F, false);
		bone6.setTextureOffset(2, 24).addBox(-3.0F, -30.0F, -5.0F, 1.0F, 3.0F, 0.0F, 0.0F, false);
		bone6.setTextureOffset(4, 16).addBox(-2.5F, -30.0F, -5.5F, 0.0F, 3.0F, 1.0F, 0.0F, false);
		bone6.setTextureOffset(6, 4).addBox(-2.5F, -28.0F, -6.5F, 0.0F, 4.0F, 1.0F, 0.0F, false);
		bone6.setTextureOffset(6, 0).addBox(-2.5F, -28.0F, -4.5F, 0.0F, 4.0F, 1.0F, 0.0F, false);

		bone7 = new ModelRenderer(this);
		bone7.setRotationPoint(-27.0F, -0.5F, -1.25F);
		Head.addChild(bone7);
		setRotationAngle(bone7, 1.5708F, -1.5708F, 0.0F);
		bone7.setTextureOffset(16, 16).addBox(-2.0F, -28.0F, -5.0F, 1.0F, 4.0F, 0.0F, 0.0F, false);
		bone7.setTextureOffset(16, 12).addBox(-4.0F, -28.0F, -5.0F, 1.0F, 4.0F, 0.0F, 0.0F, false);
		bone7.setTextureOffset(24, 0).addBox(-3.0F, -30.0F, -5.0F, 1.0F, 3.0F, 0.0F, 0.0F, false);
		bone7.setTextureOffset(2, 16).addBox(-2.5F, -30.0F, -5.5F, 0.0F, 3.0F, 1.0F, 0.0F, false);
		bone7.setTextureOffset(4, 4).addBox(-2.5F, -28.0F, -6.5F, 0.0F, 4.0F, 1.0F, 0.0F, false);
		bone7.setTextureOffset(2, 4).addBox(-2.5F, -28.0F, -4.5F, 0.0F, 4.0F, 1.0F, 0.0F, false);
	}

	@Override
	public void setRotationAngles(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks,
			float netHeadYaw, float headPitch) {
		// previously the render function, render code was moved to a method below
	}

	@Override
	public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red,
			float green, float blue, float alpha) {
		Head.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}
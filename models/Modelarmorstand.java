// Made with Blockbench 4.6.5
// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
// Paste this class into your mod and generate all required imports

public static class Modelarmorstand extends EntityModel<Entity> {
	private final ModelRenderer bone;
	private final ModelRenderer RightLeg;
	private final ModelRenderer bone2;
	private final ModelRenderer bone3;
	private final ModelRenderer bone4;
	private final ModelRenderer LeftLeg;
	private final ModelRenderer bone5;
	private final ModelRenderer bone6;
	private final ModelRenderer bone7;
	private final ModelRenderer RightArm;
	private final ModelRenderer LeftArm;
	private final ModelRenderer Head;
	private final ModelRenderer Body;
	private final ModelRenderer bone8;
	private final ModelRenderer Waist;

	public Modelarmorstand() {
		textureWidth = 64;
		textureHeight = 64;

		bone = new ModelRenderer(this);
		bone.setRotationPoint(0.0F, 24.0F, 0.0F);

		RightLeg = new ModelRenderer(this);
		RightLeg.setRotationPoint(-1.9F, -12.0F, 0.0F);
		bone.addChild(RightLeg);
		RightLeg.setTextureOffset(24, 33).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 12.0F, 2.0F, 0.0F, false);

		bone2 = new ModelRenderer(this);
		bone2.setRotationPoint(1.9F, 12.0F, 0.0F);
		RightLeg.addChild(bone2);

		bone3 = new ModelRenderer(this);
		bone3.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone2.addChild(bone3);
		bone3.setTextureOffset(14, 51).addBox(-5.5F, -3.5F, 2.5F, 6.0F, 4.0F, 0.0F, 0.0F, false);
		bone3.setTextureOffset(8, 40).addBox(0.5F, -3.5F, -2.5F, 0.0F, 4.0F, 5.0F, 0.0F, false);
		bone3.setTextureOffset(27, 6).addBox(-5.5F, 0.5F, -2.5F, 6.0F, 0.0F, 5.0F, 0.0F, false);
		bone3.setTextureOffset(50, 37).addBox(-5.5F, -3.5F, -2.5F, 6.0F, 4.0F, 0.0F, 0.0F, false);
		bone3.setTextureOffset(18, 42).addBox(-5.5F, -3.5F, -2.5F, 0.0F, 4.0F, 5.0F, 0.0F, false);

		bone4 = new ModelRenderer(this);
		bone4.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone2.addChild(bone4);
		bone4.setTextureOffset(32, 29).addBox(0.0F, -12.0F, -2.0F, 0.0F, 10.0F, 4.0F, 0.0F, false);
		bone4.setTextureOffset(44, 6).addBox(-5.0F, -12.0F, 2.0F, 5.0F, 10.0F, 0.0F, 0.0F, false);
		bone4.setTextureOffset(0, 36).addBox(-5.0F, -12.0F, -2.0F, 0.0F, 10.0F, 4.0F, 0.0F, false);
		bone4.setTextureOffset(42, 43).addBox(-5.0F, -12.0F, -2.0F, 5.0F, 10.0F, 0.0F, 0.0F, false);

		LeftLeg = new ModelRenderer(this);
		LeftLeg.setRotationPoint(1.9F, -12.0F, 0.0F);
		bone.addChild(LeftLeg);
		LeftLeg.setTextureOffset(16, 31).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 12.0F, 2.0F, 0.0F, false);

		bone5 = new ModelRenderer(this);
		bone5.setRotationPoint(-1.9F, 12.0F, 0.0F);
		LeftLeg.addChild(bone5);

		bone6 = new ModelRenderer(this);
		bone6.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone5.addChild(bone6);
		bone6.setTextureOffset(32, 43).addBox(0.0F, -12.0F, -2.0F, 5.0F, 10.0F, 0.0F, 0.0F, false);
		bone6.setTextureOffset(0, 26).addBox(5.0F, -12.0F, -2.0F, 0.0F, 10.0F, 4.0F, 0.0F, false);
		bone6.setTextureOffset(40, 33).addBox(0.0F, -12.0F, 2.0F, 5.0F, 10.0F, 0.0F, 0.0F, false);
		bone6.setTextureOffset(8, 26).addBox(0.0F, -12.0F, -2.0F, 0.0F, 10.0F, 4.0F, 0.0F, false);

		bone7 = new ModelRenderer(this);
		bone7.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone5.addChild(bone7);
		bone7.setTextureOffset(48, 16).addBox(-0.5F, -3.5F, -2.5F, 6.0F, 4.0F, 0.0F, 0.0F, false);
		bone7.setTextureOffset(36, 19).addBox(5.5F, -3.5F, -2.5F, 0.0F, 4.0F, 5.0F, 0.0F, false);
		bone7.setTextureOffset(19, 24).addBox(-0.5F, 0.5F, -2.5F, 6.0F, 0.0F, 5.0F, 0.0F, false);
		bone7.setTextureOffset(32, 6).addBox(-0.5F, -3.5F, -2.5F, 0.0F, 4.0F, 5.0F, 0.0F, false);
		bone7.setTextureOffset(50, 33).addBox(-0.5F, -3.5F, 2.5F, 6.0F, 4.0F, 0.0F, 0.0F, false);

		RightArm = new ModelRenderer(this);
		RightArm.setRotationPoint(-5.0F, -22.0F, 0.0F);
		bone.addChild(RightArm);
		RightArm.setTextureOffset(24, 20).addBox(-12.0F, -1.0F, -1.0F, 12.0F, 2.0F, 2.0F, 0.0F, false);
		RightArm.setTextureOffset(52, 20).addBox(-4.0F, -1.0F, -1.0F, 3.0F, 2.0F, 2.0F, 1.01F, false);

		LeftArm = new ModelRenderer(this);
		LeftArm.setRotationPoint(5.0F, -22.0F, 0.0F);
		bone.addChild(LeftArm);
		LeftArm.setTextureOffset(20, 16).addBox(0.0F, -1.0F, -1.0F, 12.0F, 2.0F, 2.0F, 0.0F, false);
		LeftArm.setTextureOffset(50, 51).addBox(1.0F, -1.0F, -1.0F, 3.0F, 2.0F, 2.0F, 1.01F, false);

		Head = new ModelRenderer(this);
		Head.setRotationPoint(0.0F, -24.0F, 0.0F);
		bone.addChild(Head);
		Head.setTextureOffset(0, 0).addBox(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, 1.0F, false);

		Body = new ModelRenderer(this);
		Body.setRotationPoint(0.0F, -24.0F, 0.0F);
		bone.addChild(Body);
		Body.setTextureOffset(24, 0).addBox(-6.0F, 0.0F, -1.5F, 12.0F, 3.0F, 3.0F, 0.0F, false);
		Body.setTextureOffset(6, 49).addBox(1.0F, 3.0F, -1.0F, 2.0F, 7.0F, 2.0F, 0.0F, false);
		Body.setTextureOffset(46, 24).addBox(-3.0F, 3.0F, -1.0F, 2.0F, 7.0F, 2.0F, 0.0F, false);
		Body.setTextureOffset(22, 29).addBox(-4.0F, 10.0F, -1.0F, 8.0F, 2.0F, 2.0F, 0.0F, false);

		bone8 = new ModelRenderer(this);
		bone8.setRotationPoint(0.0F, 24.0F, 0.0F);
		Body.addChild(bone8);
		bone8.setTextureOffset(0, 16).addBox(-4.0F, -23.0F, -2.25F, 8.0F, 10.0F, 4.0F, 1.01F, false);

		Waist = new ModelRenderer(this);
		Waist.setRotationPoint(0.0F, -12.0F, 0.0F);
		bone.addChild(Waist);

	}

	@Override
	public void setRotationAngles(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks,
			float netHeadYaw, float headPitch) {
		// previously the render function, render code was moved to a method below
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
}
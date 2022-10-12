// Made with Blockbench 4.4.1
// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
// Paste this class into your mod and generate all required imports


public class custom_model extends EntityModel<Entity> {
	private final ModelRenderer bone4;
	private final ModelRenderer bone11;
	private final ModelRenderer bone3;
	private final ModelRenderer bone;
	private final ModelRenderer bone2;
	private final ModelRenderer bone5;
	private final ModelRenderer bone6;
	private final ModelRenderer bone7;
	private final ModelRenderer bone12;
	private final ModelRenderer bone13;
	private final ModelRenderer bone14;
	private final ModelRenderer bone15;
	private final ModelRenderer bone16;
	private final ModelRenderer bone17;
	private final ModelRenderer bone18;
	private final ModelRenderer bone19;
	private final ModelRenderer bone20;
	private final ModelRenderer bone21;
	private final ModelRenderer bone22;
	private final ModelRenderer bone23;
	private final ModelRenderer bone24;
	private final ModelRenderer bone25;
	private final ModelRenderer bone26;
	private final ModelRenderer bone27;
	private final ModelRenderer bone8;
	private final ModelRenderer bone9;
	private final ModelRenderer bone10;

	public custom_model() {
		textureWidth = 64;
		textureHeight = 64;

		bone4 = new ModelRenderer(this);
		bone4.setRotationPoint(0.0F, -22.75F, -5.75F);
		setRotationAngle(bone4, -2.3562F, 0.0F, 0.0F);
		bone4.setTextureOffset(31, 19).addBox(-1.0F, -7.0F, -6.0F, 2.0F, 5.0F, 5.0F, 0.0F, false);

		bone11 = new ModelRenderer(this);
		bone11.setRotationPoint(0.0F, 0.0F, 16.0F);
		bone4.addChild(bone11);
		

		bone3 = new ModelRenderer(this);
		bone3.setRotationPoint(0.0F, -1.0F, -15.0F);
		bone11.addChild(bone3);
		

		bone = new ModelRenderer(this);
		bone.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone3.addChild(bone);
		

		bone2 = new ModelRenderer(this);
		bone2.setRotationPoint(0.0F, -2.0F, 2.0F);
		bone3.addChild(bone2);
		bone2.setTextureOffset(0, 38).addBox(-1.0F, -6.0F, -6.0F, 2.0F, 2.0F, 4.0F, 0.0F, false);
		bone2.setTextureOffset(46, 4).addBox(-1.0F, -4.0F, -4.0F, 2.0F, 2.0F, 2.0F, 0.0F, false);

		bone5 = new ModelRenderer(this);
		bone5.setRotationPoint(0.0F, -5.0F, -11.0F);
		bone11.addChild(bone5);
		

		bone6 = new ModelRenderer(this);
		bone6.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone5.addChild(bone6);
		bone6.setTextureOffset(30, 35).addBox(-1.0F, -6.0F, -6.0F, 2.0F, 2.0F, 4.0F, 0.0F, false);
		bone6.setTextureOffset(40, 45).addBox(-1.0F, -4.0F, -4.0F, 2.0F, 2.0F, 2.0F, 0.0F, false);

		bone7 = new ModelRenderer(this);
		bone7.setRotationPoint(0.0F, -2.0F, 2.0F);
		bone5.addChild(bone7);
		bone7.setTextureOffset(8, 34).addBox(-1.0F, -6.0F, -6.0F, 2.0F, 2.0F, 4.0F, 0.0F, false);
		bone7.setTextureOffset(18, 44).addBox(-1.0F, -4.0F, -4.0F, 2.0F, 2.0F, 2.0F, 0.0F, false);

		bone12 = new ModelRenderer(this);
		bone12.setRotationPoint(0.0F, -14.0F, 30.0F);
		bone4.addChild(bone12);
		

		bone13 = new ModelRenderer(this);
		bone13.setRotationPoint(0.0F, -1.0F, -15.0F);
		bone12.addChild(bone13);
		

		bone14 = new ModelRenderer(this);
		bone14.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone13.addChild(bone14);
		bone14.setTextureOffset(20, 16).addBox(-1.0F, -6.0F, -8.0F, 2.0F, 2.0F, 6.0F, 0.0F, false);
		bone14.setTextureOffset(43, 27).addBox(-1.0F, -4.0F, -4.0F, 2.0F, 4.0F, 2.0F, 0.0F, false);
		bone14.setTextureOffset(34, 43).addBox(-1.0F, -4.0F, -6.0F, 2.0F, 2.0F, 2.0F, 0.0F, false);

		bone15 = new ModelRenderer(this);
		bone15.setRotationPoint(0.0F, -2.0F, 2.0F);
		bone13.addChild(bone15);
		bone15.setTextureOffset(20, 8).addBox(-1.0F, -6.0F, -8.0F, 2.0F, 2.0F, 6.0F, 0.0F, false);
		bone15.setTextureOffset(26, 41).addBox(-1.0F, -4.0F, -4.0F, 2.0F, 4.0F, 2.0F, 0.0F, false);

		bone16 = new ModelRenderer(this);
		bone16.setRotationPoint(0.0F, -5.0F, -11.0F);
		bone12.addChild(bone16);
		

		bone17 = new ModelRenderer(this);
		bone17.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone16.addChild(bone17);
		bone17.setTextureOffset(20, 0).addBox(-1.0F, -6.0F, -8.0F, 2.0F, 2.0F, 6.0F, 0.0F, false);
		bone17.setTextureOffset(42, 33).addBox(-1.0F, -4.0F, -4.0F, 2.0F, 4.0F, 2.0F, 0.0F, false);

		bone18 = new ModelRenderer(this);
		bone18.setRotationPoint(0.0F, -2.0F, 2.0F);
		bone16.addChild(bone18);
		bone18.setTextureOffset(10, 18).addBox(-1.0F, -6.0F, -8.0F, 2.0F, 2.0F, 6.0F, 0.0F, false);
		bone18.setTextureOffset(10, 42).addBox(-1.0F, -4.0F, -4.0F, 2.0F, 4.0F, 2.0F, 0.0F, false);

		bone19 = new ModelRenderer(this);
		bone19.setRotationPoint(0.0F, -9.0F, -7.0F);
		bone12.addChild(bone19);
		

		bone20 = new ModelRenderer(this);
		bone20.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone19.addChild(bone20);
		bone20.setTextureOffset(0, 16).addBox(-1.0F, -6.0F, -8.0F, 2.0F, 2.0F, 6.0F, 0.0F, false);
		bone20.setTextureOffset(40, 39).addBox(-1.0F, -4.0F, -4.0F, 2.0F, 4.0F, 2.0F, 0.0F, false);

		bone21 = new ModelRenderer(this);
		bone21.setRotationPoint(0.0F, -2.0F, 2.0F);
		bone19.addChild(bone21);
		bone21.setTextureOffset(10, 10).addBox(-1.0F, -6.0F, -8.0F, 2.0F, 2.0F, 6.0F, 0.0F, false);
		bone21.setTextureOffset(40, 18).addBox(-1.0F, -4.0F, -4.0F, 2.0F, 4.0F, 2.0F, 0.0F, false);

		bone22 = new ModelRenderer(this);
		bone22.setRotationPoint(0.0F, -13.0F, -3.0F);
		bone12.addChild(bone22);
		

		bone23 = new ModelRenderer(this);
		bone23.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone22.addChild(bone23);
		bone23.setTextureOffset(10, 2).addBox(-1.0F, -6.0F, -8.0F, 2.0F, 2.0F, 6.0F, 0.0F, false);
		bone23.setTextureOffset(40, 10).addBox(-1.0F, -4.0F, -4.0F, 2.0F, 4.0F, 2.0F, 0.0F, false);

		bone24 = new ModelRenderer(this);
		bone24.setRotationPoint(0.0F, -2.0F, 2.0F);
		bone22.addChild(bone24);
		bone24.setTextureOffset(0, 8).addBox(-1.0F, -6.0F, -8.0F, 2.0F, 2.0F, 6.0F, 0.0F, false);
		bone24.setTextureOffset(40, 0).addBox(-1.0F, -4.0F, -4.0F, 2.0F, 4.0F, 2.0F, 0.0F, false);

		bone25 = new ModelRenderer(this);
		bone25.setRotationPoint(0.0F, -17.0F, 1.0F);
		bone12.addChild(bone25);
		

		bone26 = new ModelRenderer(this);
		bone26.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone25.addChild(bone26);
		bone26.setTextureOffset(0, 0).addBox(-1.0F, -6.0F, -8.0F, 2.0F, 2.0F, 6.0F, 0.0F, false);
		bone26.setTextureOffset(18, 38).addBox(-1.0F, -4.0F, -4.0F, 2.0F, 4.0F, 2.0F, 0.0F, false);

		bone27 = new ModelRenderer(this);
		bone27.setRotationPoint(0.0F, -2.0F, 2.0F);
		bone25.addChild(bone27);
		

		bone8 = new ModelRenderer(this);
		bone8.setRotationPoint(0.0F, -9.0F, 9.0F);
		bone4.addChild(bone8);
		

		bone9 = new ModelRenderer(this);
		bone9.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone8.addChild(bone9);
		bone9.setTextureOffset(32, 29).addBox(-1.0F, -6.0F, -6.0F, 2.0F, 2.0F, 4.0F, 0.0F, false);
		bone9.setTextureOffset(0, 44).addBox(-1.0F, -4.0F, -4.0F, 2.0F, 2.0F, 2.0F, 0.0F, false);

		bone10 = new ModelRenderer(this);
		bone10.setRotationPoint(0.0F, -2.0F, 2.0F);
		bone8.addChild(bone10);
		bone10.setTextureOffset(30, 10).addBox(-1.0F, -6.0F, -6.0F, 2.0F, 2.0F, 6.0F, 0.0F, false);
		bone10.setTextureOffset(10, 26).addBox(-1.0F, -8.0F, -8.0F, 2.0F, 2.0F, 6.0F, 0.0F, false);
		bone10.setTextureOffset(20, 24).addBox(-1.0F, -10.0F, -10.0F, 2.0F, 2.0F, 6.0F, 0.0F, false);
		bone10.setTextureOffset(22, 32).addBox(-1.0F, -12.0F, -10.0F, 2.0F, 2.0F, 4.0F, 0.0F, false);
		bone10.setTextureOffset(30, 2).addBox(-1.0F, -4.0F, -4.0F, 2.0F, 2.0F, 6.0F, 0.0F, false);
		bone10.setTextureOffset(0, 24).addBox(-1.0F, -2.0F, -2.0F, 2.0F, 2.0F, 6.0F, 0.0F, false);
		bone10.setTextureOffset(0, 32).addBox(-1.0F, 0.0F, 0.0F, 2.0F, 2.0F, 4.0F, 0.0F, false);
	}

	@Override
	public void setRotationAngles(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch){
		//previously the render function, render code was moved to a method below
	}

	@Override
	public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha){
		bone4.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}
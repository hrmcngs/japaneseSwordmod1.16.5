// Made with Blockbench 4.6.5
// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
// Paste this class into your mod and generate all required imports

public static class Modelkusari2 extends EntityModel<Entity> {
	private final ModelRenderer RightLeg;
	private final ModelRenderer bone3;
	private final ModelRenderer bone;
	private final ModelRenderer bone2;
	private final ModelRenderer bone4;
	private final ModelRenderer bone5;
	private final ModelRenderer bone6;
	private final ModelRenderer bone7;
	private final ModelRenderer bone8;
	private final ModelRenderer bone9;
	private final ModelRenderer bone10;
	private final ModelRenderer bone36;
	private final ModelRenderer bone37;
	private final ModelRenderer bone38;
	private final ModelRenderer bone39;
	private final ModelRenderer bone40;
	private final ModelRenderer bone11;
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
	private final ModelRenderer bone28;
	private final ModelRenderer bone29;
	private final ModelRenderer bone30;
	private final ModelRenderer bone31;
	private final ModelRenderer bone32;
	private final ModelRenderer bone33;
	private final ModelRenderer bone34;
	private final ModelRenderer bone35;
	private final ModelRenderer LeftLeg;

	public Modelkusari2() {
		textureWidth = 32;
		textureHeight = 32;

		RightLeg = new ModelRenderer(this);
		RightLeg.setRotationPoint(-1.9F, 12.0F, 0.0F);

		bone3 = new ModelRenderer(this);
		bone3.setRotationPoint(0.0F, -3.0F, -5.0F);
		RightLeg.addChild(bone3);

		bone = new ModelRenderer(this);
		bone.setRotationPoint(0.0F, -5.0F, 0.0F);
		bone3.addChild(bone);
		bone.setTextureOffset(22, 24).addBox(-2.0F, 7.0F, -2.0F, 0.0F, 3.0F, 1.0F, 0.0F, false);
		bone.setTextureOffset(20, 16).addBox(-2.0F, 9.0F, -1.0F, 0.0F, 4.0F, 1.0F, 0.0F, false);
		bone.setTextureOffset(16, 20).addBox(-2.0F, 9.0F, -3.0F, 0.0F, 4.0F, 1.0F, 0.0F, false);

		bone2 = new ModelRenderer(this);
		bone2.setRotationPoint(0.0F, 5.0F, 0.0F);
		bone.addChild(bone2);
		bone2.setTextureOffset(24, 21).addBox(-2.0F, 7.0F, -2.0F, 0.0F, 3.0F, 1.0F, 0.0F, false);
		bone2.setTextureOffset(14, 20).addBox(-2.0F, 9.0F, -1.0F, 0.0F, 4.0F, 1.0F, 0.0F, false);
		bone2.setTextureOffset(20, 12).addBox(-2.0F, 9.0F, -3.0F, 0.0F, 4.0F, 1.0F, 0.0F, false);

		bone4 = new ModelRenderer(this);
		bone4.setRotationPoint(-3.5F, -5.0F, 0.5F);
		bone3.addChild(bone4);
		setRotationAngle(bone4, 0.0F, -1.5708F, 0.0F);
		bone4.setTextureOffset(24, 18).addBox(-2.0F, 7.0F, -2.0F, 0.0F, 3.0F, 1.0F, 0.0F, false);
		bone4.setTextureOffset(12, 20).addBox(-2.0F, 9.0F, -1.0F, 0.0F, 4.0F, 1.0F, 0.0F, false);
		bone4.setTextureOffset(10, 20).addBox(-2.0F, 9.0F, -3.0F, 0.0F, 4.0F, 1.0F, 0.0F, false);

		bone5 = new ModelRenderer(this);
		bone5.setRotationPoint(0.0F, 5.0F, 0.0F);
		bone4.addChild(bone5);
		bone5.setTextureOffset(16, 24).addBox(-2.0F, 7.0F, -2.0F, 0.0F, 3.0F, 1.0F, 0.0F, false);
		bone5.setTextureOffset(20, 8).addBox(-2.0F, 9.0F, -1.0F, 0.0F, 4.0F, 1.0F, 0.0F, false);
		bone5.setTextureOffset(8, 20).addBox(-2.0F, 9.0F, -3.0F, 0.0F, 4.0F, 1.0F, 0.0F, false);

		bone6 = new ModelRenderer(this);
		bone6.setRotationPoint(-0.5F, 11.5F, -9.0F);
		RightLeg.addChild(bone6);
		setRotationAngle(bone6, 1.5708F, 0.0F, 1.5708F);

		bone7 = new ModelRenderer(this);
		bone7.setRotationPoint(0.0F, -5.0F, 0.0F);
		bone6.addChild(bone7);
		bone7.setTextureOffset(24, 15).addBox(-2.0F, 7.0F, -2.0F, 0.0F, 3.0F, 1.0F, 0.0F, false);
		bone7.setTextureOffset(6, 20).addBox(-2.0F, 9.0F, -1.0F, 0.0F, 4.0F, 1.0F, 0.0F, false);
		bone7.setTextureOffset(20, 4).addBox(-2.0F, 9.0F, -3.0F, 0.0F, 4.0F, 1.0F, 0.0F, false);

		bone8 = new ModelRenderer(this);
		bone8.setRotationPoint(0.0F, 5.0F, 0.0F);
		bone7.addChild(bone8);
		bone8.setTextureOffset(14, 24).addBox(-2.0F, 7.0F, -2.0F, 0.0F, 3.0F, 1.0F, 0.0F, false);
		bone8.setTextureOffset(4, 20).addBox(-2.0F, 9.0F, -1.0F, 0.0F, 4.0F, 1.0F, 0.0F, false);
		bone8.setTextureOffset(20, 0).addBox(-2.0F, 9.0F, -3.0F, 0.0F, 4.0F, 1.0F, 0.0F, false);

		bone9 = new ModelRenderer(this);
		bone9.setRotationPoint(-3.5F, -5.0F, 0.5F);
		bone6.addChild(bone9);
		setRotationAngle(bone9, 0.0F, -1.5708F, 0.0F);
		bone9.setTextureOffset(24, 12).addBox(-2.0F, 7.0F, -2.0F, 0.0F, 3.0F, 1.0F, 0.0F, false);
		bone9.setTextureOffset(18, 16).addBox(-2.0F, 9.0F, -1.0F, 0.0F, 4.0F, 1.0F, 0.0F, false);
		bone9.setTextureOffset(18, 12).addBox(-2.0F, 9.0F, -3.0F, 0.0F, 4.0F, 1.0F, 0.0F, false);

		bone10 = new ModelRenderer(this);
		bone10.setRotationPoint(0.0F, 5.0F, 0.0F);
		bone9.addChild(bone10);
		bone10.setTextureOffset(12, 24).addBox(-2.0F, 7.0F, -2.0F, 0.0F, 3.0F, 1.0F, 0.0F, false);
		bone10.setTextureOffset(18, 8).addBox(-2.0F, 9.0F, -1.0F, 0.0F, 4.0F, 1.0F, 0.0F, false);
		bone10.setTextureOffset(18, 4).addBox(-2.0F, 9.0F, -3.0F, 0.0F, 4.0F, 1.0F, 0.0F, false);

		bone36 = new ModelRenderer(this);
		bone36.setRotationPoint(7.5F, 1.5F, 7.25F);
		RightLeg.addChild(bone36);
		setRotationAngle(bone36, -1.4399F, 0.0F, 1.2217F);

		bone37 = new ModelRenderer(this);
		bone37.setRotationPoint(0.0F, -5.0F, 0.0F);
		bone36.addChild(bone37);
		bone37.setTextureOffset(2, 21).addBox(-2.0F, 7.0F, -2.0F, 0.0F, 3.0F, 1.0F, 0.0F, false);
		bone37.setTextureOffset(2, 5).addBox(-2.0F, 9.0F, -1.0F, 0.0F, 4.0F, 1.0F, 0.0F, false);
		bone37.setTextureOffset(0, 5).addBox(-2.0F, 9.0F, -3.0F, 0.0F, 4.0F, 1.0F, 0.0F, false);

		bone38 = new ModelRenderer(this);
		bone38.setRotationPoint(0.0F, 5.0F, 0.0F);
		bone37.addChild(bone38);
		bone38.setTextureOffset(0, 21).addBox(-2.0F, 7.0F, -2.0F, 0.0F, 3.0F, 1.0F, 0.0F, false);
		bone38.setTextureOffset(26, 0).addBox(-2.0F, 9.0F, -1.0F, 0.0F, 2.0F, 1.0F, 0.0F, false);
		bone38.setTextureOffset(0, 2).addBox(-2.0F, 9.0F, -3.0F, 0.0F, 2.0F, 2.0F, 0.0F, false);

		bone39 = new ModelRenderer(this);
		bone39.setRotationPoint(-3.5F, -5.0F, 0.5F);
		bone36.addChild(bone39);
		setRotationAngle(bone39, 0.0F, -1.5708F, 0.0F);
		bone39.setTextureOffset(20, 20).addBox(-2.0F, 7.0F, -2.0F, 0.0F, 3.0F, 1.0F, 0.0F, false);
		bone39.setTextureOffset(4, 4).addBox(-2.0F, 9.0F, -1.0F, 0.0F, 4.0F, 1.0F, 0.0F, false);
		bone39.setTextureOffset(4, 0).addBox(-2.0F, 9.0F, -3.0F, 0.0F, 4.0F, 1.0F, 0.0F, false);

		bone40 = new ModelRenderer(this);
		bone40.setRotationPoint(0.0F, 5.0F, 0.0F);
		bone39.addChild(bone40);
		bone40.setTextureOffset(18, 20).addBox(-2.0F, 7.0F, -2.0F, 0.0F, 3.0F, 1.0F, 0.0F, false);
		bone40.setTextureOffset(24, 24).addBox(-2.0F, 9.0F, -1.0F, 0.0F, 2.0F, 1.0F, 0.0F, false);
		bone40.setTextureOffset(0, 0).addBox(-2.0F, 9.0F, -3.0F, 0.0F, 2.0F, 2.0F, 0.0F, false);

		bone11 = new ModelRenderer(this);
		bone11.setRotationPoint(0.0F, 12.5F, 2.0F);
		RightLeg.addChild(bone11);
		setRotationAngle(bone11, 3.0543F, 0.0F, 0.0F);

		bone12 = new ModelRenderer(this);
		bone12.setRotationPoint(0.0F, -5.0F, 0.0F);
		bone11.addChild(bone12);
		bone12.setTextureOffset(10, 24).addBox(-2.0F, 7.0F, -2.0F, 0.0F, 3.0F, 1.0F, 0.0F, false);
		bone12.setTextureOffset(18, 0).addBox(-2.0F, 9.0F, -1.0F, 0.0F, 4.0F, 1.0F, 0.0F, false);
		bone12.setTextureOffset(2, 17).addBox(-2.0F, 9.0F, -3.0F, 0.0F, 4.0F, 1.0F, 0.0F, false);

		bone13 = new ModelRenderer(this);
		bone13.setRotationPoint(0.0F, 5.0F, 0.0F);
		bone12.addChild(bone13);
		bone13.setTextureOffset(24, 9).addBox(-2.0F, 7.0F, -2.0F, 0.0F, 3.0F, 1.0F, 0.0F, false);
		bone13.setTextureOffset(0, 17).addBox(-2.0F, 9.0F, -1.0F, 0.0F, 4.0F, 1.0F, 0.0F, false);
		bone13.setTextureOffset(16, 16).addBox(-2.0F, 9.0F, -3.0F, 0.0F, 4.0F, 1.0F, 0.0F, false);

		bone14 = new ModelRenderer(this);
		bone14.setRotationPoint(-3.5F, -5.0F, 0.5F);
		bone11.addChild(bone14);
		setRotationAngle(bone14, 0.0F, -1.5708F, 0.0F);
		bone14.setTextureOffset(8, 24).addBox(-2.0F, 7.0F, -2.0F, 0.0F, 3.0F, 1.0F, 0.0F, false);
		bone14.setTextureOffset(14, 16).addBox(-2.0F, 9.0F, -1.0F, 0.0F, 4.0F, 1.0F, 0.0F, false);
		bone14.setTextureOffset(16, 12).addBox(-2.0F, 9.0F, -3.0F, 0.0F, 4.0F, 1.0F, 0.0F, false);

		bone15 = new ModelRenderer(this);
		bone15.setRotationPoint(0.0F, 5.0F, 0.0F);
		bone14.addChild(bone15);
		bone15.setTextureOffset(24, 6).addBox(-2.0F, 7.0F, -2.0F, 0.0F, 3.0F, 1.0F, 0.0F, false);
		bone15.setTextureOffset(12, 16).addBox(-2.0F, 9.0F, -1.0F, 0.0F, 4.0F, 1.0F, 0.0F, false);
		bone15.setTextureOffset(10, 16).addBox(-2.0F, 9.0F, -3.0F, 0.0F, 4.0F, 1.0F, 0.0F, false);

		bone16 = new ModelRenderer(this);
		bone16.setRotationPoint(-4.75F, -2.0F, 6.0F);
		RightLeg.addChild(bone16);
		setRotationAngle(bone16, 0.0F, 0.0F, -1.5708F);

		bone17 = new ModelRenderer(this);
		bone17.setRotationPoint(0.0F, -5.0F, 0.0F);
		bone16.addChild(bone17);
		bone17.setTextureOffset(6, 24).addBox(-2.0F, 7.0F, -2.0F, 0.0F, 3.0F, 1.0F, 0.0F, false);
		bone17.setTextureOffset(16, 8).addBox(-2.0F, 9.0F, -1.0F, 0.0F, 4.0F, 1.0F, 0.0F, false);
		bone17.setTextureOffset(8, 16).addBox(-2.0F, 9.0F, -3.0F, 0.0F, 4.0F, 1.0F, 0.0F, false);

		bone18 = new ModelRenderer(this);
		bone18.setRotationPoint(0.0F, 5.0F, 0.0F);
		bone17.addChild(bone18);
		bone18.setTextureOffset(4, 24).addBox(-2.0F, 7.0F, -2.0F, 0.0F, 3.0F, 1.0F, 0.0F, false);
		bone18.setTextureOffset(6, 16).addBox(-2.0F, 9.0F, -1.0F, 0.0F, 4.0F, 1.0F, 0.0F, false);
		bone18.setTextureOffset(16, 4).addBox(-2.0F, 9.0F, -3.0F, 0.0F, 4.0F, 1.0F, 0.0F, false);

		bone19 = new ModelRenderer(this);
		bone19.setRotationPoint(-3.5F, -5.0F, 0.5F);
		bone16.addChild(bone19);
		setRotationAngle(bone19, 0.0F, -1.5708F, 0.0F);
		bone19.setTextureOffset(24, 3).addBox(-2.0F, 7.0F, -2.0F, 0.0F, 3.0F, 1.0F, 0.0F, false);
		bone19.setTextureOffset(4, 16).addBox(-2.0F, 9.0F, -1.0F, 0.0F, 4.0F, 1.0F, 0.0F, false);
		bone19.setTextureOffset(16, 0).addBox(-2.0F, 9.0F, -3.0F, 0.0F, 4.0F, 1.0F, 0.0F, false);

		bone20 = new ModelRenderer(this);
		bone20.setRotationPoint(0.0F, 5.0F, 0.0F);
		bone19.addChild(bone20);
		bone20.setTextureOffset(2, 24).addBox(-2.0F, 7.0F, -2.0F, 0.0F, 3.0F, 1.0F, 0.0F, false);
		bone20.setTextureOffset(14, 12).addBox(-2.0F, 9.0F, -1.0F, 0.0F, 4.0F, 1.0F, 0.0F, false);
		bone20.setTextureOffset(14, 8).addBox(-2.0F, 9.0F, -3.0F, 0.0F, 4.0F, 1.0F, 0.0F, false);

		bone21 = new ModelRenderer(this);
		bone21.setRotationPoint(10.25F, -0.5F, 7.5F);
		RightLeg.addChild(bone21);
		setRotationAngle(bone21, -0.6981F, -0.0436F, 0.1745F);

		bone22 = new ModelRenderer(this);
		bone22.setRotationPoint(0.0F, -5.0F, 0.0F);
		bone21.addChild(bone22);
		bone22.setTextureOffset(24, 0).addBox(-2.0F, 7.0F, -2.0F, 0.0F, 3.0F, 1.0F, 0.0F, false);
		bone22.setTextureOffset(14, 4).addBox(-2.0F, 9.0F, -1.0F, 0.0F, 4.0F, 1.0F, 0.0F, false);
		bone22.setTextureOffset(14, 0).addBox(-2.0F, 9.0F, -3.0F, 0.0F, 4.0F, 1.0F, 0.0F, false);

		bone23 = new ModelRenderer(this);
		bone23.setRotationPoint(0.0F, 5.0F, 0.0F);
		bone22.addChild(bone23);
		bone23.setTextureOffset(0, 24).addBox(-2.0F, 7.0F, -2.0F, 0.0F, 3.0F, 1.0F, 0.0F, false);
		bone23.setTextureOffset(2, 13).addBox(-2.0F, 9.0F, -1.0F, 0.0F, 4.0F, 1.0F, 0.0F, false);
		bone23.setTextureOffset(0, 13).addBox(-2.0F, 9.0F, -3.0F, 0.0F, 4.0F, 1.0F, 0.0F, false);

		bone24 = new ModelRenderer(this);
		bone24.setRotationPoint(-3.5F, -5.0F, 0.5F);
		bone21.addChild(bone24);
		setRotationAngle(bone24, 0.0F, -1.5708F, 0.0F);
		bone24.setTextureOffset(20, 23).addBox(-2.0F, 7.0F, -2.0F, 0.0F, 3.0F, 1.0F, 0.0F, false);
		bone24.setTextureOffset(12, 12).addBox(-2.0F, 9.0F, -1.0F, 0.0F, 4.0F, 1.0F, 0.0F, false);
		bone24.setTextureOffset(10, 12).addBox(-2.0F, 9.0F, -3.0F, 0.0F, 4.0F, 1.0F, 0.0F, false);

		bone25 = new ModelRenderer(this);
		bone25.setRotationPoint(0.0F, 5.0F, 0.0F);
		bone24.addChild(bone25);
		bone25.setTextureOffset(18, 23).addBox(-2.0F, 7.0F, -2.0F, 0.0F, 3.0F, 1.0F, 0.0F, false);
		bone25.setTextureOffset(12, 8).addBox(-2.0F, 9.0F, -1.0F, 0.0F, 4.0F, 1.0F, 0.0F, false);
		bone25.setTextureOffset(8, 12).addBox(-2.0F, 9.0F, -3.0F, 0.0F, 4.0F, 1.0F, 0.0F, false);

		bone26 = new ModelRenderer(this);
		bone26.setRotationPoint(10.5F, 8.7F, -2.45F);
		RightLeg.addChild(bone26);
		setRotationAngle(bone26, -1.789F, 1.0472F, -0.4363F);

		bone27 = new ModelRenderer(this);
		bone27.setRotationPoint(0.0F, -5.0F, 0.0F);
		bone26.addChild(bone27);
		bone27.setTextureOffset(22, 21).addBox(-2.0F, 7.0F, -2.0F, 0.0F, 3.0F, 1.0F, 0.0F, false);
		bone27.setTextureOffset(6, 12).addBox(-2.0F, 9.0F, -1.0F, 0.0F, 4.0F, 1.0F, 0.0F, false);
		bone27.setTextureOffset(12, 4).addBox(-2.0F, 9.0F, -3.0F, 0.0F, 4.0F, 1.0F, 0.0F, false);

		bone28 = new ModelRenderer(this);
		bone28.setRotationPoint(0.0F, 5.0F, 0.0F);
		bone27.addChild(bone28);
		bone28.setTextureOffset(22, 18).addBox(-2.0F, 7.0F, -2.0F, 0.0F, 3.0F, 1.0F, 0.0F, false);
		bone28.setTextureOffset(4, 12).addBox(-2.0F, 9.0F, -1.0F, 0.0F, 4.0F, 1.0F, 0.0F, false);
		bone28.setTextureOffset(12, 0).addBox(-2.0F, 9.0F, -3.0F, 0.0F, 4.0F, 1.0F, 0.0F, false);

		bone29 = new ModelRenderer(this);
		bone29.setRotationPoint(-3.5F, -5.0F, 0.5F);
		bone26.addChild(bone29);
		setRotationAngle(bone29, 0.0F, -1.5708F, 0.0F);
		bone29.setTextureOffset(22, 15).addBox(-2.0F, 7.0F, -2.0F, 0.0F, 3.0F, 1.0F, 0.0F, false);
		bone29.setTextureOffset(10, 8).addBox(-2.0F, 9.0F, -1.0F, 0.0F, 4.0F, 1.0F, 0.0F, false);
		bone29.setTextureOffset(10, 4).addBox(-2.0F, 9.0F, -3.0F, 0.0F, 4.0F, 1.0F, 0.0F, false);

		bone30 = new ModelRenderer(this);
		bone30.setRotationPoint(0.0F, 5.0F, 0.0F);
		bone29.addChild(bone30);
		bone30.setTextureOffset(22, 12).addBox(-2.0F, 7.0F, -2.0F, 0.0F, 3.0F, 1.0F, 0.0F, false);
		bone30.setTextureOffset(10, 0).addBox(-2.0F, 9.0F, -1.0F, 0.0F, 4.0F, 1.0F, 0.0F, false);
		bone30.setTextureOffset(2, 9).addBox(-2.0F, 9.0F, -3.0F, 0.0F, 4.0F, 1.0F, 0.0F, false);

		bone31 = new ModelRenderer(this);
		bone31.setRotationPoint(10.5F, -0.3F, -3.75F);
		RightLeg.addChild(bone31);
		setRotationAngle(bone31, -1.8762F, 1.1345F, -0.4363F);

		bone32 = new ModelRenderer(this);
		bone32.setRotationPoint(0.0F, -5.0F, 0.0F);
		bone31.addChild(bone32);
		bone32.setTextureOffset(22, 9).addBox(-2.0F, 7.0F, -2.0F, 0.0F, 3.0F, 1.0F, 0.0F, false);
		bone32.setTextureOffset(0, 9).addBox(-2.0F, 9.0F, -1.0F, 0.0F, 4.0F, 1.0F, 0.0F, false);
		bone32.setTextureOffset(8, 8).addBox(-2.0F, 9.0F, -3.0F, 0.0F, 4.0F, 1.0F, 0.0F, false);

		bone33 = new ModelRenderer(this);
		bone33.setRotationPoint(0.0F, 5.0F, 0.0F);
		bone32.addChild(bone33);
		bone33.setTextureOffset(22, 6).addBox(-2.0F, 7.0F, -2.0F, 0.0F, 3.0F, 1.0F, 0.0F, false);
		bone33.setTextureOffset(6, 8).addBox(-2.0F, 9.0F, -1.0F, 0.0F, 4.0F, 1.0F, 0.0F, false);
		bone33.setTextureOffset(8, 4).addBox(-2.0F, 9.0F, -3.0F, 0.0F, 4.0F, 1.0F, 0.0F, false);

		bone34 = new ModelRenderer(this);
		bone34.setRotationPoint(-3.5F, -5.0F, 0.5F);
		bone31.addChild(bone34);
		setRotationAngle(bone34, 0.0F, -1.5708F, 0.0F);
		bone34.setTextureOffset(22, 3).addBox(-2.0F, 7.0F, -2.0F, 0.0F, 3.0F, 1.0F, 0.0F, false);
		bone34.setTextureOffset(4, 8).addBox(-2.0F, 9.0F, -1.0F, 0.0F, 4.0F, 1.0F, 0.0F, false);
		bone34.setTextureOffset(8, 0).addBox(-2.0F, 9.0F, -3.0F, 0.0F, 4.0F, 1.0F, 0.0F, false);

		bone35 = new ModelRenderer(this);
		bone35.setRotationPoint(0.0F, 5.0F, 0.0F);
		bone34.addChild(bone35);
		bone35.setTextureOffset(22, 0).addBox(-2.0F, 7.0F, -2.0F, 0.0F, 3.0F, 1.0F, 0.0F, false);
		bone35.setTextureOffset(6, 4).addBox(-2.0F, 9.0F, -1.0F, 0.0F, 4.0F, 1.0F, 0.0F, false);
		bone35.setTextureOffset(6, 0).addBox(-2.0F, 9.0F, -3.0F, 0.0F, 4.0F, 1.0F, 0.0F, false);

		LeftLeg = new ModelRenderer(this);
		LeftLeg.setRotationPoint(1.9F, 12.0F, 0.0F);

	}

	@Override
	public void setRotationAngles(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks,
			float netHeadYaw, float headPitch) {
		// previously the render function, render code was moved to a method below
	}

	@Override
	public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red,
			float green, float blue, float alpha) {
		RightLeg.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
		LeftLeg.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}
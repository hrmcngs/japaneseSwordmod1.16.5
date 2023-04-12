// Made with Blockbench 4.6.5
// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
// Paste this class into your mod and generate all required imports

public static class Modelkusari extends EntityModel<Entity> {
	private final ModelRenderer haori_mashiro;
	private final ModelRenderer rightarm;
	private final ModelRenderer leftarm;
	private final ModelRenderer body;
	private final ModelRenderer bone4;
	private final ModelRenderer bone3;
	private final ModelRenderer bone2;
	private final ModelRenderer bone38;
	private final ModelRenderer bone39;
	private final ModelRenderer bone40;
	private final ModelRenderer bone41;
	private final ModelRenderer bone42;
	private final ModelRenderer bone43;
	private final ModelRenderer bone11;
	private final ModelRenderer bone12;
	private final ModelRenderer bone13;
	private final ModelRenderer bone14;
	private final ModelRenderer bone15;
	private final ModelRenderer bone16;
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
	private final ModelRenderer bone17;
	private final ModelRenderer bone18;
	private final ModelRenderer bone19;
	private final ModelRenderer bone35;
	private final ModelRenderer bone36;
	private final ModelRenderer bone37;
	private final ModelRenderer bone5;
	private final ModelRenderer bone6;
	private final ModelRenderer bone7;
	private final ModelRenderer bone8;
	private final ModelRenderer bone9;
	private final ModelRenderer bone10;

	public Modelkusari() {
		textureWidth = 64;
		textureHeight = 64;

		haori_mashiro = new ModelRenderer(this);
		haori_mashiro.setRotationPoint(0.2F, 0.0F, 1.0F);

		rightarm = new ModelRenderer(this);
		rightarm.setRotationPoint(-5.2F, 2.0F, -1.0F);
		haori_mashiro.addChild(rightarm);

		leftarm = new ModelRenderer(this);
		leftarm.setRotationPoint(4.8F, 2.0F, -1.0F);
		haori_mashiro.addChild(leftarm);

		body = new ModelRenderer(this);
		body.setRotationPoint(-0.2F, 0.0F, -1.0F);
		haori_mashiro.addChild(body);

		bone4 = new ModelRenderer(this);
		bone4.setRotationPoint(0.1876F, 30.0F, 0.0F);
		body.addChild(bone4);

		bone3 = new ModelRenderer(this);
		bone3.setRotationPoint(-0.2959F, 0.0F, 0.0F);
		bone4.addChild(bone3);
		bone3.setTextureOffset(32, 12).addBox(3.7166F, -26.1408F, 4.9226F, 1.0F, 4.0F, 0.0F, 0.0F, false);
		bone3.setTextureOffset(12, 31).addBox(3.2166F, -28.1408F, 4.4226F, 0.0F, 3.0F, 1.0F, 0.0F, false);
		bone3.setTextureOffset(34, 21).addBox(2.7166F, -28.1408F, 4.9226F, 1.0F, 3.0F, 0.0F, 0.0F, false);
		bone3.setTextureOffset(20, 16).addBox(3.2166F, -26.1408F, 3.4226F, 0.0F, 4.0F, 1.0F, 0.0F, false);
		bone3.setTextureOffset(16, 20).addBox(3.2166F, -26.1408F, 5.4226F, 0.0F, 4.0F, 1.0F, 0.0F, false);
		bone3.setTextureOffset(32, 8).addBox(1.7166F, -26.1408F, 4.9226F, 1.0F, 4.0F, 0.0F, 0.0F, false);

		bone2 = new ModelRenderer(this);
		bone2.setRotationPoint(-0.2959F, -6.0F, 0.0F);
		bone4.addChild(bone2);
		bone2.setTextureOffset(8, 32).addBox(3.7166F, -25.1408F, 4.9226F, 1.0F, 4.0F, 0.0F, 0.0F, false);
		bone2.setTextureOffset(14, 20).addBox(3.2166F, -28.1408F, 4.4226F, 0.0F, 4.0F, 1.0F, 0.0F, false);
		bone2.setTextureOffset(6, 32).addBox(2.7166F, -28.1408F, 4.9226F, 1.0F, 4.0F, 0.0F, 0.0F, false);
		bone2.setTextureOffset(20, 12).addBox(3.2166F, -25.1408F, 3.4226F, 0.0F, 4.0F, 1.0F, 0.0F, false);
		bone2.setTextureOffset(12, 20).addBox(3.2166F, -25.1408F, 5.4226F, 0.0F, 4.0F, 1.0F, 0.0F, false);
		bone2.setTextureOffset(32, 4).addBox(1.7166F, -25.1408F, 4.9226F, 1.0F, 4.0F, 0.0F, 0.0F, false);

		bone38 = new ModelRenderer(this);
		bone38.setRotationPoint(-0.8124F, 33.0F, -10.0F);
		body.addChild(bone38);

		bone39 = new ModelRenderer(this);
		bone39.setRotationPoint(-0.2959F, 0.0F, 0.0F);
		bone38.addChild(bone39);
		bone39.setTextureOffset(22, 20).addBox(3.7166F, -26.1408F, 4.9226F, 1.0F, 4.0F, 0.0F, 0.0F, false);
		bone39.setTextureOffset(0, 22).addBox(3.2166F, -28.1408F, 4.4226F, 0.0F, 3.0F, 1.0F, 0.0F, false);
		bone39.setTextureOffset(32, 19).addBox(2.7166F, -28.1408F, 4.9226F, 1.0F, 3.0F, 0.0F, 0.0F, false);
		bone39.setTextureOffset(6, 9).addBox(3.2166F, -26.1408F, 3.4226F, 0.0F, 4.0F, 1.0F, 0.0F, false);
		bone39.setTextureOffset(4, 9).addBox(3.2166F, -26.1408F, 5.4226F, 0.0F, 4.0F, 1.0F, 0.0F, false);
		bone39.setTextureOffset(22, 16).addBox(1.7166F, -26.1408F, 4.9226F, 1.0F, 4.0F, 0.0F, 0.0F, false);

		bone40 = new ModelRenderer(this);
		bone40.setRotationPoint(-0.2959F, -6.0F, 0.0F);
		bone38.addChild(bone40);
		bone40.setTextureOffset(22, 12).addBox(3.7166F, -25.1408F, 4.9226F, 1.0F, 4.0F, 0.0F, 0.0F, false);
		bone40.setTextureOffset(8, 8).addBox(3.2166F, -28.1408F, 4.4226F, 0.0F, 4.0F, 1.0F, 0.0F, false);
		bone40.setTextureOffset(22, 8).addBox(2.7166F, -28.1408F, 4.9226F, 1.0F, 4.0F, 0.0F, 0.0F, false);
		bone40.setTextureOffset(8, 4).addBox(3.2166F, -25.1408F, 3.4226F, 0.0F, 4.0F, 1.0F, 0.0F, false);
		bone40.setTextureOffset(8, 0).addBox(3.2166F, -25.1408F, 5.4226F, 0.0F, 4.0F, 1.0F, 0.0F, false);
		bone40.setTextureOffset(6, 22).addBox(1.7166F, -25.1408F, 4.9226F, 1.0F, 4.0F, 0.0F, 0.0F, false);

		bone41 = new ModelRenderer(this);
		bone41.setRotationPoint(-8.5624F, 20.5F, -10.0F);
		body.addChild(bone41);
		setRotationAngle(bone41, 0.0F, 0.0F, 0.3491F);

		bone42 = new ModelRenderer(this);
		bone42.setRotationPoint(-0.2959F, 0.0F, 0.0F);
		bone41.addChild(bone42);
		bone42.setTextureOffset(22, 4).addBox(3.7166F, -26.1408F, 4.9226F, 1.0F, 4.0F, 0.0F, 0.0F, false);
		bone42.setTextureOffset(4, 21).addBox(3.2166F, -28.1408F, 4.4226F, 0.0F, 3.0F, 1.0F, 0.0F, false);
		bone42.setTextureOffset(32, 16).addBox(2.7166F, -28.1408F, 4.9226F, 1.0F, 3.0F, 0.0F, 0.0F, false);
		bone42.setTextureOffset(6, 5).addBox(3.2166F, -26.1408F, 3.4226F, 0.0F, 4.0F, 1.0F, 0.0F, false);
		bone42.setTextureOffset(2, 6).addBox(3.2166F, -26.1408F, 5.4226F, 0.0F, 4.0F, 1.0F, 0.0F, false);
		bone42.setTextureOffset(22, 0).addBox(1.7166F, -26.1408F, 4.9226F, 1.0F, 4.0F, 0.0F, 0.0F, false);

		bone43 = new ModelRenderer(this);
		bone43.setRotationPoint(-0.2959F, -6.0F, 0.0F);
		bone41.addChild(bone43);
		bone43.setTextureOffset(20, 21).addBox(3.7166F, -25.1408F, 4.9226F, 1.0F, 4.0F, 0.0F, 0.0F, false);
		bone43.setTextureOffset(26, 33).addBox(3.2166F, -25.1408F, 4.4226F, 0.0F, 1.0F, 1.0F, 0.0F, false);
		bone43.setTextureOffset(0, 0).addBox(2.7166F, -25.1408F, 4.9226F, 1.0F, 1.0F, 0.0F, 0.0F, false);
		bone43.setTextureOffset(0, 6).addBox(3.2166F, -25.1408F, 3.4226F, 0.0F, 4.0F, 1.0F, 0.0F, false);
		bone43.setTextureOffset(4, 5).addBox(3.2166F, -25.1408F, 5.4226F, 0.0F, 4.0F, 1.0F, 0.0F, false);
		bone43.setTextureOffset(18, 21).addBox(1.7166F, -25.1408F, 4.9226F, 1.0F, 4.0F, 0.0F, 0.0F, false);

		bone11 = new ModelRenderer(this);
		bone11.setRotationPoint(-5.0624F, -21.0F, 5.0F);
		body.addChild(bone11);
		setRotationAngle(bone11, 3.1416F, 0.0F, 0.0F);

		bone12 = new ModelRenderer(this);
		bone12.setRotationPoint(-0.2959F, 0.0F, 0.0F);
		bone11.addChild(bone12);
		bone12.setTextureOffset(32, 0).addBox(3.7166F, -26.1408F, 4.9226F, 1.0F, 4.0F, 0.0F, 0.0F, false);
		bone12.setTextureOffset(26, 30).addBox(3.2166F, -28.1408F, 4.4226F, 0.0F, 3.0F, 1.0F, 0.0F, false);
		bone12.setTextureOffset(34, 18).addBox(2.7166F, -28.1408F, 4.9226F, 1.0F, 3.0F, 0.0F, 0.0F, false);
		bone12.setTextureOffset(10, 20).addBox(3.2166F, -26.1408F, 3.4226F, 0.0F, 4.0F, 1.0F, 0.0F, false);
		bone12.setTextureOffset(20, 8).addBox(3.2166F, -26.1408F, 5.4226F, 0.0F, 4.0F, 1.0F, 0.0F, false);
		bone12.setTextureOffset(24, 31).addBox(1.7166F, -26.1408F, 4.9226F, 1.0F, 4.0F, 0.0F, 0.0F, false);

		bone13 = new ModelRenderer(this);
		bone13.setRotationPoint(-0.2959F, -6.0F, 0.0F);
		bone11.addChild(bone13);
		bone13.setTextureOffset(30, 28).addBox(3.7166F, -25.1408F, 4.9226F, 1.0F, 4.0F, 0.0F, 0.0F, false);
		bone13.setTextureOffset(16, 30).addBox(3.2166F, -27.1408F, 4.4226F, 0.0F, 3.0F, 1.0F, 0.0F, false);
		bone13.setTextureOffset(16, 34).addBox(2.7166F, -27.1408F, 4.9226F, 1.0F, 3.0F, 0.0F, 0.0F, false);
		bone13.setTextureOffset(8, 20).addBox(3.2166F, -25.1408F, 3.4226F, 0.0F, 4.0F, 1.0F, 0.0F, false);
		bone13.setTextureOffset(20, 4).addBox(3.2166F, -25.1408F, 5.4226F, 0.0F, 4.0F, 1.0F, 0.0F, false);
		bone13.setTextureOffset(30, 24).addBox(1.7166F, -25.1408F, 4.9226F, 1.0F, 4.0F, 0.0F, 0.0F, false);

		bone14 = new ModelRenderer(this);
		bone14.setRotationPoint(-34.5624F, -1.25F, -5.0F);
		body.addChild(bone14);
		setRotationAngle(bone14, 0.0F, 0.0F, 1.5708F);

		bone15 = new ModelRenderer(this);
		bone15.setRotationPoint(-0.2959F, 0.0F, 0.0F);
		bone14.addChild(bone15);
		bone15.setTextureOffset(30, 20).addBox(3.7166F, -26.1408F, 4.9226F, 1.0F, 4.0F, 0.0F, 0.0F, false);
		bone15.setTextureOffset(10, 30).addBox(3.2166F, -28.1408F, 4.4226F, 0.0F, 3.0F, 1.0F, 0.0F, false);
		bone15.setTextureOffset(34, 15).addBox(2.7166F, -28.1408F, 4.9226F, 1.0F, 3.0F, 0.0F, 0.0F, false);
		bone15.setTextureOffset(20, 0).addBox(3.2166F, -26.1408F, 3.4226F, 0.0F, 4.0F, 1.0F, 0.0F, false);
		bone15.setTextureOffset(18, 16).addBox(3.2166F, -26.1408F, 5.4226F, 0.0F, 4.0F, 1.0F, 0.0F, false);
		bone15.setTextureOffset(30, 16).addBox(1.7166F, -26.1408F, 4.9226F, 1.0F, 4.0F, 0.0F, 0.0F, false);

		bone16 = new ModelRenderer(this);
		bone16.setRotationPoint(-0.2959F, -6.0F, 0.0F);
		bone14.addChild(bone16);
		bone16.setTextureOffset(30, 12).addBox(3.7166F, -25.1408F, 4.9226F, 1.0F, 4.0F, 0.0F, 0.0F, false);
		bone16.setTextureOffset(4, 30).addBox(3.2166F, -27.1408F, 4.4226F, 0.0F, 3.0F, 1.0F, 0.0F, false);
		bone16.setTextureOffset(34, 12).addBox(2.7166F, -27.1408F, 4.9226F, 1.0F, 3.0F, 0.0F, 0.0F, false);
		bone16.setTextureOffset(18, 12).addBox(3.2166F, -25.1408F, 3.4226F, 0.0F, 4.0F, 1.0F, 0.0F, false);
		bone16.setTextureOffset(18, 8).addBox(3.2166F, -25.1408F, 5.4226F, 0.0F, 4.0F, 1.0F, 0.0F, false);
		bone16.setTextureOffset(30, 8).addBox(1.7166F, -25.1408F, 4.9226F, 1.0F, 4.0F, 0.0F, 0.0F, false);

		bone20 = new ModelRenderer(this);
		bone20.setRotationPoint(-34.5624F, 9.0F, -10.0F);
		body.addChild(bone20);
		setRotationAngle(bone20, 0.0F, 0.0F, 1.5708F);

		bone21 = new ModelRenderer(this);
		bone21.setRotationPoint(-0.2959F, 0.0F, 0.0F);
		bone20.addChild(bone21);
		bone21.setTextureOffset(28, 8).addBox(3.7166F, -26.1408F, 4.9226F, 1.0F, 4.0F, 0.0F, 0.0F, false);
		bone21.setTextureOffset(10, 27).addBox(3.2166F, -28.1408F, 4.4226F, 0.0F, 3.0F, 1.0F, 0.0F, false);
		bone21.setTextureOffset(34, 0).addBox(2.7166F, -28.1408F, 4.9226F, 1.0F, 3.0F, 0.0F, 0.0F, false);
		bone21.setTextureOffset(8, 16).addBox(3.2166F, -26.1408F, 3.4226F, 0.0F, 4.0F, 1.0F, 0.0F, false);
		bone21.setTextureOffset(16, 4).addBox(3.2166F, -26.1408F, 5.4226F, 0.0F, 4.0F, 1.0F, 0.0F, false);
		bone21.setTextureOffset(8, 28).addBox(1.7166F, -26.1408F, 4.9226F, 1.0F, 4.0F, 0.0F, 0.0F, false);

		bone22 = new ModelRenderer(this);
		bone22.setRotationPoint(-0.2959F, -6.0F, 0.0F);
		bone20.addChild(bone22);
		bone22.setTextureOffset(28, 4).addBox(3.7166F, -25.1408F, 4.9226F, 1.0F, 4.0F, 0.0F, 0.0F, false);
		bone22.setTextureOffset(4, 27).addBox(3.2166F, -27.1408F, 4.4226F, 0.0F, 3.0F, 1.0F, 0.0F, false);
		bone22.setTextureOffset(22, 33).addBox(2.7166F, -27.1408F, 4.9226F, 1.0F, 3.0F, 0.0F, 0.0F, false);
		bone22.setTextureOffset(16, 0).addBox(3.2166F, -25.1408F, 3.4226F, 0.0F, 4.0F, 1.0F, 0.0F, false);
		bone22.setTextureOffset(14, 12).addBox(3.2166F, -25.1408F, 5.4226F, 0.0F, 4.0F, 1.0F, 0.0F, false);
		bone22.setTextureOffset(28, 0).addBox(1.7166F, -25.1408F, 4.9226F, 1.0F, 4.0F, 0.0F, 0.0F, false);

		bone23 = new ModelRenderer(this);
		bone23.setRotationPoint(-9.3124F, -20.5F, -10.0F);
		body.addChild(bone23);
		setRotationAngle(bone23, 0.0F, 0.0F, -3.1416F);

		bone24 = new ModelRenderer(this);
		bone24.setRotationPoint(-0.2959F, 0.0F, 0.0F);
		bone23.addChild(bone24);
		bone24.setTextureOffset(26, 24).addBox(3.7166F, -26.1408F, 4.9226F, 1.0F, 4.0F, 0.0F, 0.0F, false);
		bone24.setTextureOffset(22, 26).addBox(3.2166F, -28.1408F, 4.4226F, 0.0F, 3.0F, 1.0F, 0.0F, false);
		bone24.setTextureOffset(18, 33).addBox(2.7166F, -28.1408F, 4.9226F, 1.0F, 3.0F, 0.0F, 0.0F, false);
		bone24.setTextureOffset(14, 8).addBox(3.2166F, -26.1408F, 3.4226F, 0.0F, 4.0F, 1.0F, 0.0F, false);
		bone24.setTextureOffset(14, 4).addBox(3.2166F, -26.1408F, 5.4226F, 0.0F, 4.0F, 1.0F, 0.0F, false);
		bone24.setTextureOffset(26, 20).addBox(1.7166F, -26.1408F, 4.9226F, 1.0F, 4.0F, 0.0F, 0.0F, false);

		bone25 = new ModelRenderer(this);
		bone25.setRotationPoint(-0.2959F, -6.0F, 0.0F);
		bone23.addChild(bone25);
		bone25.setTextureOffset(26, 16).addBox(3.7166F, -25.1408F, 4.9226F, 1.0F, 4.0F, 0.0F, 0.0F, false);
		bone25.setTextureOffset(2, 26).addBox(3.2166F, -27.1408F, 4.4226F, 0.0F, 3.0F, 1.0F, 0.0F, false);
		bone25.setTextureOffset(14, 33).addBox(2.7166F, -27.1408F, 4.9226F, 1.0F, 3.0F, 0.0F, 0.0F, false);
		bone25.setTextureOffset(2, 14).addBox(3.2166F, -25.1408F, 3.4226F, 0.0F, 4.0F, 1.0F, 0.0F, false);
		bone25.setTextureOffset(14, 0).addBox(3.2166F, -25.1408F, 5.4226F, 0.0F, 4.0F, 1.0F, 0.0F, false);
		bone25.setTextureOffset(26, 12).addBox(1.7166F, -25.1408F, 4.9226F, 1.0F, 4.0F, 0.0F, 0.0F, false);

		bone26 = new ModelRenderer(this);
		bone26.setRotationPoint(12.9376F, -19.0F, -10.0F);
		body.addChild(bone26);
		setRotationAngle(bone26, 0.0F, 0.0F, -2.3562F);

		bone27 = new ModelRenderer(this);
		bone27.setRotationPoint(-0.2959F, 0.0F, 0.0F);
		bone26.addChild(bone27);
		bone27.setTextureOffset(26, 8).addBox(3.7166F, -26.1408F, 4.9226F, 1.0F, 4.0F, 0.0F, 0.0F, false);
		bone27.setTextureOffset(6, 25).addBox(3.2166F, -28.1408F, 4.4226F, 0.0F, 3.0F, 1.0F, 0.0F, false);
		bone27.setTextureOffset(0, 33).addBox(2.7166F, -28.1408F, 4.9226F, 1.0F, 3.0F, 0.0F, 0.0F, false);
		bone27.setTextureOffset(0, 14).addBox(3.2166F, -26.1408F, 3.4226F, 0.0F, 4.0F, 1.0F, 0.0F, false);
		bone27.setTextureOffset(6, 13).addBox(3.2166F, -26.1408F, 5.4226F, 0.0F, 4.0F, 1.0F, 0.0F, false);
		bone27.setTextureOffset(26, 4).addBox(1.7166F, -26.1408F, 4.9226F, 1.0F, 4.0F, 0.0F, 0.0F, false);

		bone28 = new ModelRenderer(this);
		bone28.setRotationPoint(-0.2959F, -6.0F, 0.0F);
		bone26.addChild(bone28);
		bone28.setTextureOffset(26, 0).addBox(3.7166F, -25.1408F, 4.9226F, 1.0F, 4.0F, 0.0F, 0.0F, false);
		bone28.setTextureOffset(0, 25).addBox(3.2166F, -27.1408F, 4.4226F, 0.0F, 3.0F, 1.0F, 0.0F, false);
		bone28.setTextureOffset(32, 31).addBox(2.7166F, -27.1408F, 4.9226F, 1.0F, 3.0F, 0.0F, 0.0F, false);
		bone28.setTextureOffset(4, 13).addBox(3.2166F, -25.1408F, 3.4226F, 0.0F, 4.0F, 1.0F, 0.0F, false);
		bone28.setTextureOffset(12, 12).addBox(3.2166F, -25.1408F, 5.4226F, 0.0F, 4.0F, 1.0F, 0.0F, false);
		bone28.setTextureOffset(20, 25).addBox(1.7166F, -25.1408F, 4.9226F, 1.0F, 4.0F, 0.0F, 0.0F, false);

		bone29 = new ModelRenderer(this);
		bone29.setRotationPoint(27.6876F, -9.5F, -10.0F);
		body.addChild(bone29);
		setRotationAngle(bone29, 0.0F, 0.0F, -1.789F);

		bone30 = new ModelRenderer(this);
		bone30.setRotationPoint(-0.2959F, 0.0F, 0.0F);
		bone29.addChild(bone30);
		bone30.setTextureOffset(18, 25).addBox(3.7166F, -26.1408F, 4.9226F, 1.0F, 4.0F, 0.0F, 0.0F, false);
		bone30.setTextureOffset(16, 24).addBox(3.2166F, -28.1408F, 4.4226F, 0.0F, 3.0F, 1.0F, 0.0F, false);
		bone30.setTextureOffset(30, 32).addBox(2.7166F, -28.1408F, 4.9226F, 1.0F, 3.0F, 0.0F, 0.0F, false);
		bone30.setTextureOffset(10, 12).addBox(3.2166F, -26.1408F, 3.4226F, 0.0F, 4.0F, 1.0F, 0.0F, false);
		bone30.setTextureOffset(12, 8).addBox(3.2166F, -26.1408F, 5.4226F, 0.0F, 4.0F, 1.0F, 0.0F, false);
		bone30.setTextureOffset(14, 25).addBox(1.7166F, -26.1408F, 4.9226F, 1.0F, 4.0F, 0.0F, 0.0F, false);

		bone31 = new ModelRenderer(this);
		bone31.setRotationPoint(-0.2959F, -6.0F, 0.0F);
		bone29.addChild(bone31);
		bone31.setTextureOffset(24, 24).addBox(3.7166F, -25.1408F, 4.9226F, 1.0F, 4.0F, 0.0F, 0.0F, false);
		bone31.setTextureOffset(12, 24).addBox(3.2166F, -27.1408F, 4.4226F, 0.0F, 3.0F, 1.0F, 0.0F, false);
		bone31.setTextureOffset(32, 28).addBox(2.7166F, -27.1408F, 4.9226F, 1.0F, 3.0F, 0.0F, 0.0F, false);
		bone31.setTextureOffset(8, 12).addBox(3.2166F, -25.1408F, 3.4226F, 0.0F, 4.0F, 1.0F, 0.0F, false);
		bone31.setTextureOffset(12, 4).addBox(3.2166F, -25.1408F, 5.4226F, 0.0F, 4.0F, 1.0F, 0.0F, false);
		bone31.setTextureOffset(24, 20).addBox(1.7166F, -25.1408F, 4.9226F, 1.0F, 4.0F, 0.0F, 0.0F, false);

		bone32 = new ModelRenderer(this);
		bone32.setRotationPoint(7.9376F, 7.0F, 24.5F);
		body.addChild(bone32);
		setRotationAngle(bone32, 1.5708F, -0.3491F, -1.4399F);

		bone33 = new ModelRenderer(this);
		bone33.setRotationPoint(-0.2959F, 0.0F, 5.0F);
		bone32.addChild(bone33);
		setRotationAngle(bone33, 0.1745F, 0.0873F, 0.0F);
		bone33.setTextureOffset(6, 0).addBox(3.7166F, -26.1408F, 4.9226F, 1.0F, 6.0F, 0.0F, 0.0F, false);
		bone33.setTextureOffset(10, 24).addBox(3.2166F, -28.1408F, 4.4226F, 0.0F, 3.0F, 1.0F, 0.0F, false);
		bone33.setTextureOffset(28, 32).addBox(2.7166F, -28.1408F, 4.9226F, 1.0F, 3.0F, 0.0F, 0.0F, false);
		bone33.setTextureOffset(2, 0).addBox(3.2166F, -26.1408F, 3.4226F, 0.0F, 6.0F, 1.0F, 0.0F, false);
		bone33.setTextureOffset(0, 0).addBox(3.2166F, -26.1408F, 5.4226F, 0.0F, 6.0F, 1.0F, 0.0F, false);
		bone33.setTextureOffset(4, 0).addBox(1.7166F, -26.1408F, 4.9226F, 1.0F, 6.0F, 0.0F, 0.0F, false);

		bone34 = new ModelRenderer(this);
		bone34.setRotationPoint(-0.2959F, -6.0F, 0.0F);
		bone32.addChild(bone34);
		bone34.setTextureOffset(24, 16).addBox(3.7166F, -25.1408F, 4.9226F, 1.0F, 4.0F, 0.0F, 0.0F, false);
		bone34.setTextureOffset(8, 24).addBox(3.2166F, -27.1408F, 4.4226F, 0.0F, 3.0F, 1.0F, 0.0F, false);
		bone34.setTextureOffset(32, 25).addBox(2.7166F, -27.1408F, 4.9226F, 1.0F, 3.0F, 0.0F, 0.0F, false);
		bone34.setTextureOffset(12, 0).addBox(3.2166F, -25.1408F, 3.4226F, 0.0F, 4.0F, 1.0F, 0.0F, false);
		bone34.setTextureOffset(10, 8).addBox(3.2166F, -25.1408F, 5.4226F, 0.0F, 4.0F, 1.0F, 0.0F, false);
		bone34.setTextureOffset(24, 12).addBox(1.7166F, -25.1408F, 4.9226F, 1.0F, 4.0F, 0.0F, 0.0F, false);

		bone17 = new ModelRenderer(this);
		bone17.setRotationPoint(17.9376F, -12.5F, -1.5F);
		body.addChild(bone17);
		setRotationAngle(bone17, 0.1745F, -0.6981F, -2.0944F);

		bone18 = new ModelRenderer(this);
		bone18.setRotationPoint(-0.2959F, 0.0F, 0.0F);
		bone17.addChild(bone18);
		bone18.setTextureOffset(30, 4).addBox(3.7166F, -26.1408F, 4.9226F, 1.0F, 4.0F, 0.0F, 0.0F, false);
		bone18.setTextureOffset(22, 29).addBox(3.2166F, -28.1408F, 4.4226F, 0.0F, 3.0F, 1.0F, 0.0F, false);
		bone18.setTextureOffset(10, 34).addBox(2.7166F, -28.1408F, 4.9226F, 1.0F, 3.0F, 0.0F, 0.0F, false);
		bone18.setTextureOffset(18, 4).addBox(3.2166F, -26.1408F, 3.4226F, 0.0F, 4.0F, 1.0F, 0.0F, false);
		bone18.setTextureOffset(2, 18).addBox(3.2166F, -26.1408F, 5.4226F, 0.0F, 4.0F, 1.0F, 0.0F, false);
		bone18.setTextureOffset(2, 30).addBox(1.7166F, -26.1408F, 4.9226F, 1.0F, 4.0F, 0.0F, 0.0F, false);

		bone19 = new ModelRenderer(this);
		bone19.setRotationPoint(-0.2959F, -6.0F, 0.0F);
		bone17.addChild(bone19);
		bone19.setTextureOffset(30, 0).addBox(3.7166F, -25.1408F, 4.9226F, 1.0F, 4.0F, 0.0F, 0.0F, false);
		bone19.setTextureOffset(20, 28).addBox(3.2166F, -27.1408F, 4.4226F, 0.0F, 3.0F, 1.0F, 0.0F, false);
		bone19.setTextureOffset(34, 9).addBox(2.7166F, -27.1408F, 4.9226F, 1.0F, 3.0F, 0.0F, 0.0F, false);
		bone19.setTextureOffset(18, 0).addBox(3.2166F, -25.1408F, 3.4226F, 0.0F, 4.0F, 1.0F, 0.0F, false);
		bone19.setTextureOffset(0, 18).addBox(3.2166F, -25.1408F, 5.4226F, 0.0F, 4.0F, 1.0F, 0.0F, false);
		bone19.setTextureOffset(18, 29).addBox(1.7166F, -25.1408F, 4.9226F, 1.0F, 4.0F, 0.0F, 0.0F, false);

		bone35 = new ModelRenderer(this);
		bone35.setRotationPoint(24.9376F, -14.5F, -1.5F);
		body.addChild(bone35);
		setRotationAngle(bone35, 0.1745F, -0.6981F, -2.0944F);

		bone36 = new ModelRenderer(this);
		bone36.setRotationPoint(-0.2959F, 0.0F, 0.0F);
		bone35.addChild(bone36);
		bone36.setTextureOffset(24, 8).addBox(3.7166F, -26.1408F, 4.9226F, 1.0F, 4.0F, 0.0F, 0.0F, false);
		bone36.setTextureOffset(4, 24).addBox(3.2166F, -28.1408F, 4.4226F, 0.0F, 3.0F, 1.0F, 0.0F, false);
		bone36.setTextureOffset(32, 22).addBox(2.7166F, -28.1408F, 4.9226F, 1.0F, 3.0F, 0.0F, 0.0F, false);
		bone36.setTextureOffset(10, 4).addBox(3.2166F, -26.1408F, 3.4226F, 0.0F, 4.0F, 1.0F, 0.0F, false);
		bone36.setTextureOffset(2, 10).addBox(3.2166F, -26.1408F, 5.4226F, 0.0F, 4.0F, 1.0F, 0.0F, false);
		bone36.setTextureOffset(24, 4).addBox(1.7166F, -26.1408F, 4.9226F, 1.0F, 4.0F, 0.0F, 0.0F, false);

		bone37 = new ModelRenderer(this);
		bone37.setRotationPoint(-0.2959F, -6.0F, 0.0F);
		bone35.addChild(bone37);
		bone37.setTextureOffset(24, 0).addBox(3.7166F, -25.1408F, 4.9226F, 1.0F, 4.0F, 0.0F, 0.0F, false);
		bone37.setTextureOffset(22, 23).addBox(3.2166F, -27.1408F, 4.4226F, 0.0F, 3.0F, 1.0F, 0.0F, false);
		bone37.setTextureOffset(20, 32).addBox(2.7166F, -27.1408F, 4.9226F, 1.0F, 3.0F, 0.0F, 0.0F, false);
		bone37.setTextureOffset(10, 0).addBox(3.2166F, -25.1408F, 3.4226F, 0.0F, 4.0F, 1.0F, 0.0F, false);
		bone37.setTextureOffset(0, 10).addBox(3.2166F, -25.1408F, 5.4226F, 0.0F, 4.0F, 1.0F, 0.0F, false);
		bone37.setTextureOffset(2, 23).addBox(1.7166F, -25.1408F, 4.9226F, 1.0F, 4.0F, 0.0F, 0.0F, false);

		bone5 = new ModelRenderer(this);
		bone5.setRotationPoint(-2.5624F, 11.25F, -27.25F);
		body.addChild(bone5);
		setRotationAngle(bone5, -1.309F, 0.0873F, 0.0F);

		bone6 = new ModelRenderer(this);
		bone6.setRotationPoint(-0.2959F, 0.0F, 0.0F);
		bone5.addChild(bone6);
		bone6.setTextureOffset(14, 29).addBox(3.7166F, -26.1408F, 4.9226F, 1.0F, 4.0F, 0.0F, 0.0F, false);
		bone6.setTextureOffset(6, 28).addBox(3.2166F, -28.1408F, 4.4226F, 0.0F, 3.0F, 1.0F, 0.0F, false);
		bone6.setTextureOffset(34, 6).addBox(2.7166F, -28.1408F, 4.9226F, 1.0F, 3.0F, 0.0F, 0.0F, false);
		bone6.setTextureOffset(6, 17).addBox(3.2166F, -26.1408F, 3.4226F, 0.0F, 4.0F, 1.0F, 0.0F, false);
		bone6.setTextureOffset(4, 17).addBox(3.2166F, -26.1408F, 5.4226F, 0.0F, 4.0F, 1.0F, 0.0F, false);
		bone6.setTextureOffset(0, 29).addBox(1.7166F, -26.1408F, 4.9226F, 1.0F, 4.0F, 0.0F, 0.0F, false);

		bone7 = new ModelRenderer(this);
		bone7.setRotationPoint(-0.2959F, -6.0F, 0.0F);
		bone5.addChild(bone7);
		bone7.setTextureOffset(28, 28).addBox(3.7166F, -25.1408F, 4.9226F, 1.0F, 4.0F, 0.0F, 0.0F, false);
		bone7.setTextureOffset(26, 27).addBox(3.2166F, -27.1408F, 4.4226F, 0.0F, 3.0F, 1.0F, 0.0F, false);
		bone7.setTextureOffset(4, 34).addBox(2.7166F, -27.1408F, 4.9226F, 1.0F, 3.0F, 0.0F, 0.0F, false);
		bone7.setTextureOffset(16, 16).addBox(3.2166F, -25.1408F, 3.4226F, 0.0F, 4.0F, 1.0F, 0.0F, false);
		bone7.setTextureOffset(14, 16).addBox(3.2166F, -25.1408F, 5.4226F, 0.0F, 4.0F, 1.0F, 0.0F, false);
		bone7.setTextureOffset(28, 24).addBox(1.7166F, -25.1408F, 4.9226F, 1.0F, 4.0F, 0.0F, 0.0F, false);

		bone8 = new ModelRenderer(this);
		bone8.setRotationPoint(-30.3124F, 14.0F, -7.25F);
		body.addChild(bone8);
		setRotationAngle(bone8, -1.309F, 1.3963F, 0.0F);

		bone9 = new ModelRenderer(this);
		bone9.setRotationPoint(-23.7959F, -35.0F, 0.0F);
		bone8.addChild(bone9);
		setRotationAngle(bone9, 0.0F, -0.1309F, 1.7453F);
		bone9.setTextureOffset(28, 20).addBox(3.7166F, -26.1408F, 4.9226F, 1.0F, 4.0F, 0.0F, 0.0F, false);
		bone9.setTextureOffset(24, 27).addBox(3.2166F, -28.1408F, 4.4226F, 0.0F, 3.0F, 1.0F, 0.0F, false);
		bone9.setTextureOffset(34, 3).addBox(2.7166F, -28.1408F, 4.9226F, 1.0F, 3.0F, 0.0F, 0.0F, false);
		bone9.setTextureOffset(16, 12).addBox(3.2166F, -26.1408F, 3.4226F, 0.0F, 4.0F, 1.0F, 0.0F, false);
		bone9.setTextureOffset(12, 16).addBox(3.2166F, -26.1408F, 5.4226F, 0.0F, 4.0F, 1.0F, 0.0F, false);
		bone9.setTextureOffset(28, 16).addBox(1.7166F, -26.1408F, 4.9226F, 1.0F, 4.0F, 0.0F, 0.0F, false);

		bone10 = new ModelRenderer(this);
		bone10.setRotationPoint(-0.2959F, -6.0F, 0.0F);
		bone8.addChild(bone10);
		bone10.setTextureOffset(28, 12).addBox(3.7166F, -25.1408F, 4.9226F, 1.0F, 4.0F, 0.0F, 0.0F, false);
		bone10.setTextureOffset(16, 27).addBox(3.2166F, -27.1408F, 4.4226F, 0.0F, 3.0F, 1.0F, 0.0F, false);
		bone10.setTextureOffset(2, 34).addBox(2.7166F, -27.1408F, 4.9226F, 1.0F, 3.0F, 0.0F, 0.0F, false);
		bone10.setTextureOffset(10, 16).addBox(3.2166F, -25.1408F, 3.4226F, 0.0F, 4.0F, 1.0F, 0.0F, false);
		bone10.setTextureOffset(16, 8).addBox(3.2166F, -25.1408F, 5.4226F, 0.0F, 4.0F, 1.0F, 0.0F, false);
		bone10.setTextureOffset(12, 28).addBox(1.7166F, -25.1408F, 4.9226F, 1.0F, 4.0F, 0.0F, 0.0F, false);
	}

	@Override
	public void setRotationAngles(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks,
			float netHeadYaw, float headPitch) {
		// previously the render function, render code was moved to a method below
	}

	@Override
	public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red,
			float green, float blue, float alpha) {
		haori_mashiro.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}
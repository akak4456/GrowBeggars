package org.adele.growbeggars.constants;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

import org.adele.growbeggars.model.AutoMoneyMachine;
import org.adele.growbeggars.model.Mob;

/*
 * 선택지 번호를 제외한 모든 상수를 저장한 것
 */
public class Constants {
	public static final int INIT_BEG_MIN_MONEY = 50;
	public static final int INIT_BEG_MAX_MONEY = 100;
	public static final int INIT_BEG_UPGRADE_PRICE = 1000;
	public static final int UPGRADE_BEG_ADD_MIN_NUMBER = 5;
	public static final int UPGRADE_BEG_ADD_MAX_NUMBER = 5;
	public static final double UPGRADE_BEG_MIN_MUL = 1.2;
	public static final double UPGRADE_BEG_MAX_MUL = 1.2;
	public static final double UPGRADE_BEG_PRICE_MUL = 1.2;
	
	public static final int INIT_GAKSEOLITARYEONG_MIN_MONEY = 2000;
	public static final int INIT_GAKSEOLITARYEONG_MAX_MONEY = 4000;
	public static final int INIT_GAKSEOLITARYEONG_UPGRADE_PRICE = 1000;
	public static final int UPGRADE_GAKSEOLITARYEONG_ADD_MIN_NUMBER = 5;
	public static final int UPGRADE_GAKSEOLITARYEONG_ADD_MAX_NUMBER = 5;
	public static final double UPGRADE_GAKSEOLITARYEONG_MIN_MUL = 1.2;
	public static final double UPGRADE_GAKSEOLITARYEONG_MAX_MUL = 1.2;
	public static final double UPGRADE_GAKSEOLITARYEONG_PRICE_MUL = 1.2;
	
	public static final int BEG_FEVER_ADD = 50;
	public static final double BEG_FEVER_MUL = 2;
	
	public static final int UPGRADE_MACHINE_MUL_ADD_NUMBER = 5;
	public static final double UPGRADE_MACHINE_MUL_MUL = 1.2;
	public static final double UPGRADE_MACHINE_PRICE_MUL = 1.2;
	
	
	public static final int ADDED_HP_FROM_HP_POSION = 50;
	
	public static final int INIT_LEVEL = 1;
	public static final int INIT_MAX_HP = 300;
	public static final double INIT_EVASION_RATE = 0.2;
	public static final int INIT_MIN_HIT_POINT = 40;
	public static final int INIT_MAX_HIT_POINT = 80;
	public static final int INIT_REQUIRE_EXP = 50;
	
	private static final AutoMachineConstant[] EMPLOY_BEGGAR_CONSTANTS_ARRAY = {
			new AutoMachineConstant(new AutoMoneyMachine.Id("employ_beggar_1"),"employ_beggar_1_name",1.0,1000,1000),
			new AutoMachineConstant(new AutoMoneyMachine.Id("employ_beggar_2"),"employ_beggar_2_name",1.2,1200,1000),
			new AutoMachineConstant(new AutoMoneyMachine.Id("employ_beggar_3"),"employ_beggar_3_name",1.4,1400,1000),
			new AutoMachineConstant(new AutoMoneyMachine.Id("employ_beggar_4"),"employ_beggar_4_name",1.7,1700,1000),
			new AutoMachineConstant(new AutoMoneyMachine.Id("employ_beggar_5"),"employ_beggar_5_name",2.0,2000,1000),
			new AutoMachineConstant(new AutoMoneyMachine.Id("employ_beggar_6"),"employ_beggar_6_name",3.0,3000,1000),
			new AutoMachineConstant(new AutoMoneyMachine.Id("employ_beggar_7"),"employ_beggar_7_name",4.0,4000,1000)
	};
	
	public static final List<AutoMachineConstant> EMPLOY_BEGGAR_CONSTANTS =
			Collections.unmodifiableList(Arrays.asList(EMPLOY_BEGGAR_CONSTANTS_ARRAY));
	
	private static final AutoMachineConstant[] BUILDING_CONSTANTS_ARRAY = {
			new AutoMachineConstant(new AutoMoneyMachine.Id("building_1"),"building_1_name", 10.0, 10000, 1000),
			new AutoMachineConstant(new AutoMoneyMachine.Id("building_2"),"building_2_name", 15.0, 15000, 1000),
			new AutoMachineConstant(new AutoMoneyMachine.Id("building_3"),"building_3_name", 20.0, 20000, 1000),
			new AutoMachineConstant(new AutoMoneyMachine.Id("building_4"),"building_4_name", 30.0, 30000, 1000),
			new AutoMachineConstant(new AutoMoneyMachine.Id("building_5"),"building_5_name", 50.0, 50000, 1000)
	};
	
	public static final List<AutoMachineConstant> BUILDING_CONSTANTS =
			Collections.unmodifiableList(Arrays.asList(BUILDING_CONSTANTS_ARRAY));
	
	private static final AutoMachineConstant[] NATION_CONSTANTS_ARRAY = {
			new AutoMachineConstant(new AutoMoneyMachine.Id("nation_1"),"nation_1_name",100.0,100000,1000),
			new AutoMachineConstant(new AutoMoneyMachine.Id("nation_2"),"nation_2_name",120.0,120000,1000),
			new AutoMachineConstant(new AutoMoneyMachine.Id("nation_3"),"nation_3_name",150.0,150000,1000),
			new AutoMachineConstant(new AutoMoneyMachine.Id("nation_4"),"nation_4_name",200.0,200000,1000),
			new AutoMachineConstant(new AutoMoneyMachine.Id("nation_5"),"nation_5_name",300.0,300000,1000)
	};
	
	public static final List<AutoMachineConstant> NATION_CONSTANTS =
			Collections.unmodifiableList(Arrays.asList(NATION_CONSTANTS_ARRAY));
	
	private static final MobConstant[] MOB_CONSTANTS_ARRAY = {
			new MobConstant(new Mob.Id(1L), "mob_1_name", 50, 0.1, 10,20, 5000, 10000, 100, 50),
			new MobConstant(new Mob.Id(2L), "mob_2_name", 70,0.1,20,30, 7000, 15000, 200, 100),
			new MobConstant(new Mob.Id(3L), "mob_3_name", 80,0.2,30,50, 10000, 20000, 300, 150),
			new MobConstant(new Mob.Id(4L), "mob_4_name", 200,0.2,40,80, 20000, 40000, 500, 200),
			new MobConstant(new Mob.Id(5L), "mob_5_name", 300,0.2,50,100, 30000, 60000, 700, 400),
			new MobConstant(new Mob.Id(6L), "mob_6_name", 500,0.3,100,200, 50000, 100000, 800, 500),
			new MobConstant(new Mob.Id(7L), "mob_7_name", 700,0.5,200,300, 200000, 400000, 2000, 1000),
	};
	
	public static final List<MobConstant> MOB_CONSTANTS =
			Collections.unmodifiableList(Arrays.asList(MOB_CONSTANTS_ARRAY));
	
	private static final Item[] ITEM_CONSTANTS_ARRAY = {
			new Item("item_1_name", 500, 5),
			new Item("item_2_name", 1000, 1),
			new Item("item_3_name", 1000, 1),
			new Item("item_4_name", 1000, 1)
	};
	
	public static final List<Item> ITEM_CONSTANTS =
			Collections.unmodifiableList(Arrays.asList(ITEM_CONSTANTS_ARRAY));
	
	private Constants() {
		
	}
	
	public static final class AutoMachineConstant {
		private AutoMoneyMachine.Id id;
		private String nameKey;
		private double mul;
		private int buyPrice;
		private int initUpgradePrice;
		
		public AutoMachineConstant(AutoMoneyMachine.Id id, String nameKey, double mul, int buyPrice, int initUpgradePrice) {
			this.id = id;
			this.nameKey = nameKey;
			this.mul = mul;
			this.buyPrice = buyPrice;
			this.initUpgradePrice = initUpgradePrice;
		}
		
		public AutoMoneyMachine.Id getId(){
			return id;
		}
		
		public String getNameKey() {
			return nameKey;
		}
		
		public double getMul() {
			return mul;
		}
		
		public int getBuyPrice() {
			return buyPrice;
		}
		
		public int getInitUpgradePrice() {
			return initUpgradePrice;
		}
	}
	
	public static final class MobConstant {
		private Mob.Id id;
		private String nameKey;
		private int hp;
		private double evasionRate; // 회피율
		private int hitMinPoint;// 최소공격력
		private int hitMaxPoint;// 최대공격력
		private int earnMinMoney; // 벌 수 있는 최소 돈
		private int earnMaxMoney; // 벌 수 있는 최대 돈
		private int earnExp;// 벌 수 있는 경험치
		private int loseExp; // 질 때 잃을 수 있는 경험치
		
		public MobConstant(Mob.Id id, String nameKey, int hp, double evasionRate, int hitMinPoint, int hitMaxPoint, int earnMinMoney, int earnMaxMoney, int earnExp, int loseExp) {
			this.id = id;
			this.nameKey = nameKey;
			this.hp = hp;
			this.evasionRate = evasionRate;
			this.hitMinPoint = hitMinPoint;
			this.hitMaxPoint = hitMaxPoint;
			this.earnMinMoney = earnMinMoney;
			this.earnMaxMoney = earnMaxMoney;
			this.earnExp = earnExp;
			this.loseExp = loseExp;
		}
		
		public Mob.Id getId() {
			return id;
		}
		
		public String getNameKey() {
			return nameKey;
		}
		
		public int getHp() {
			return hp;
		}
		
		public double getEvasionRate() {
			return evasionRate;
		}
		public int getHitMinPoint() {
			return hitMinPoint;
		}
		public int getHitMaxPoint() {
			return hitMaxPoint;
		}
		public int getEarnMinMoney() {
			return earnMinMoney;
		}
		public int getEarnMaxMoney() {
			return earnMaxMoney;
		}
		public int getEarnExp() {
			return earnExp;
		}
		public int getLoseExp() {
			return loseExp;
		}
		
		public String getArtData() {
			if(id.equals(new Mob.Id(1))) {
				return    "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⣀⣀⣀⣀⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
						+ "⠀⢀⠀⠀⡀⢔⡒⡒⠄⠀⢀⠀⠠⠀⠀⡀⣔⢏⠁⠀⠈⠁⠳⣄⠀⢀⠀⠠⠀⠀\r\n"
						+ "⠁⠀⠀⠀⠀⠣⢧⡂⠇⠀⠀⠀⠀⠀⡠⡪⡒⠌⠢⡀⠀⠀⠀⢹⡆⠀⠀⠀⠀⠀\r\n"
						+ "⠀⠀⠀⠄⠀⠈⣇⠀⠀⠀⣠⠰⢔⢍⢎⢎⠪⡨⠂⡈⠢⡀⠁⢰⡇⠀⠀⠀⠂⠈\r\n"
						+ "⠀⠀⠄⠀⠀⡀⠘⡗⡢⢫⢰⡱⡱⡱⡑⢌⠌⡂⢁⠀⠀⠀⠑⢾⠁⠀⠀⢀⠀⠀\r\n"
						+ "⠈⠀⠀⠀⠀⢠⠪⣲⡉⡿⣪⢪⠪⡂⣊⣢⠵⣔⠠⠀⠄⠠⠀⠈⡆⠀⠀⠀⠀⠀\r\n"
						+ "⠀⠀⠄⠈⠀⢸⢌⢖⢽⢹⢺⠼⡸⢌⠢⠺⣔⠽⡨⠨⢐⠡⠈⠄⢸⠀⠀⠈⠀⠈\r\n"
						+ "⢀⠀⠀⠀⠀⢸⢐⢕⢝⢎⠮⣟⢿⢨⠪⡨⠢⡑⢌⠜⡠⢂⠡⠁⡜⠀⠀⠀⠄⠀\r\n"
						+ "⠀⠀⠀⠈⠀⠀⠣⡈⠊⡎⣝⠼⡜⡆⡣⡊⡌⡢⡑⢌⠢⡑⢈⡴⠁⠀⠀⡀⠀⠀\r\n"
						+ "⠀⠀⠁⠀⢀⠀⢀⠈⠣⠬⣊⠎⢇⠇⡇⡎⡆⠇⣎⣊⠬⠒⠉⠀⠀⠀⠀⠀⠀⠈\r\n"
						+ "⡀⠄⠀⠄⠀⠀⠀⠀⠀⠀⠀⠈⠉⠉⠉⠈⠉⠉⠀⠀⠀⠀⠀⠀⠀⠀⠂⠁⠀⠀\r\n";
			} else if(id.equals(new Mob.Id(2))) {
				return    "⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⡠⠔⢒⢉⠉⢍⢝⢙⢲⠲⡤⣀⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
						+ "⠀⠀⠀⠀⠀⣀⡠⠴⠒⡑⢌⢊⠢⡢⡩⢢⠪⠈⢂⠑⠱⡱⡱⣄⠀⠀⠀⠀⠀⠀\r\n"
						+ "⠀⢀⡰⢔⢋⢆⢆⢆⢇⢎⢆⢇⢇⢎⢎⢲⡐⢅⠢⢈⢂⠢⢱⢱⡢⠀⠀⠀⠀⠀\r\n"
						+ "⢠⠃⢄⢇⢕⢕⢅⢇⢇⢇⡪⡰⡱⡱⡱⡱⡱⡱⡱⡱⡰⡱⡸⡸⡸⡱⢄⡀⠀⠀\r\n"
						+ "⣇⢜⡜⣜⢮⢺⢩⣳⡽⡼⡞⠗⢟⠞⡞⢞⠗⠷⡵⣣⢣⢳⢱⢕⡕⡎⡆⡍⠦⡀\r\n"
						+ "⢣⢳⡱⣏⢮⣹⡽⢃⢕⡰⢘⢘⠔⡑⢜⢐⢑⢅⠣⡑⠝⢧⣳⡱⡱⡹⡪⡮⡪⣳\r\n"
						+ "⠀⠳⡍⢟⢾⡼⠍⠜⠿⠟⠠⡅⣈⠀⡥⠈⠴⣿⡷⠪⡘⠔⢵⡮⣳⠕⡍⡮⣳⢹\r\n"
						+ "⠀⠀⠈⠺⡜⠍⠐⠀⠂⠀⠄⠈⠁⠉⠐⠀⠠⠀⠄⢑⠨⡘⠔⣻⣞⢕⠮⡝⣜⠍\r\n"
						+ "⠀⠀⡰⢁⠂⢀⠁⠀⠂⠁⠀⠐⠈⠀⡀⠁⠠⠀⠂⠀⢂⠌⡊⡺⣜⡔⠕⠚⠀⠀\r\n"
						+ "⠀⢰⠁⠂⡀⠄⠀⡈⠀⡀⠁⠀⠂⢀⠠⠐⠀⠂⠈⠠⠀⠌⡢⠚⡆⠀⠀⠀⠀⠀\r\n"
						+ "⠀⢸⡀⠁⡀⠠⠀⠀⠄⠀⡀⠁⠠⠀⡀⠄⠂⠈⡀⠐⢀⠡⡨⡊⡧⠀⠀⠀⠀⠀\r\n"
						+ "⠀⠀⢇⠠⠀⠠⠀⢁⠠⠀⠠⠐⠀⠄⠀⠄⢀⠁⠠⠈⢄⠪⡐⡢⠇⠀⠀⠀⠀⠀\r\n"
						+ "⠀⠀⠈⠒⡄⠂⢈⠀⠠⠐⠀⢂⠐⢀⢁⠐⡀⠌⠄⢕⢐⢅⡵⠉⠀⠀⠀⠀⠀⠀\r\n"
						+ "⠀⠀⠀⠀⠈⠑⠦⢌⣄⣅⣅⣂⣌⣄⣂⣢⣊⣌⡪⠼⠘⠁⠀⠀⠀⠀⠀⠀⠀⠀\r\n";
			} else if(id.equals(new Mob.Id(3))) {
				return    "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⡠⡤⡖⡟⡝⡫⡲⡢⣄⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
						+ "⠀⠀⠀⠀⠀⠀⠀⠀⣀⢖⢎⢮⢺⢪⢣⠣⢣⠱⠨⢪⠱⡢⡀⠀⠀⠀⠀⠀⠀⠀\r\n"
						+ "⠀⠀⠀⠀⠀⠀⡤⢖⢕⢕⢵⢝⢵⡹⡸⡸⡨⡊⣊⠢⡑⢅⠳⢄⠀⠀⠀⠀⠀⠀\r\n"
						+ "⠀⠀⠀⢀⠤⠫⠪⠪⠮⢫⢳⢝⢕⢕⡕⡕⢕⠱⡐⢕⠨⠨⡊⢎⢧⠀⠀⠀⠀⠀\r\n"
						+ "⡠⡄⠖⠌⡀⡂⡔⡠⠠⡀⠄⠁⠓⠕⢕⢕⢕⠱⡑⡅⡪⢐⠨⠢⡱⡹⡄⠀⠀⠀\r\n"
						+ "⡧⡂⡥⡣⢣⢣⣣⣇⣗⣬⡪⣨⢐⢈⠐⡈⠢⡣⢱⠨⡂⡢⠨⠨⡂⢎⠺⣄⢀⠀\r\n"
						+ "⢱⢕⢑⢬⣾⡻⡽⣝⣽⠽⠿⠯⠷⠧⣇⡢⡁⠌⠂⡑⢌⠢⠡⡑⢌⠢⡣⡪⠉⣱\r\n"
						+ "⠀⠑⢕⡨⠺⢽⣽⡞⣰⠅⡣⢑⠍⣌⡢⢩⠹⢺⢴⣐⡄⡨⢐⠈⡂⢃⢃⠐⣐⠎\r\n"
						+ "⠀⠀⠀⠈⠉⡳⣺⠔⡘⣱⣼⠆⠕⠼⡣⡑⢜⠰⡐⢅⠝⡙⢕⢞⠲⠲⠲⠙⠀⠀\r\n"
						+ "⠀⠀⠀⠐⢯⣸⡎⢌⠌⢌⢚⢑⠍⢌⠢⡊⠢⡑⢌⠢⢑⡌⡂⠙⠤⡀⠀⠀⠀⠀\r\n"
						+ "⠀⠀⠀⠀⠀⢼⢐⠡⠈⠐⠐⠀⠑⠠⠑⠈⠌⠐⠀⠁⠂⡘⠹⡴⣄⡱⠂⠀⠀⠀\r\n"
						+ "⠀⠀⠀⠀⠀⠘⡆⡅⠅⡀⠄⠂⠁⠀⠀⠄⠀⠀⠈⠀⠠⠀⢁⡇⠀⠀⠀⠀⠀⠀\r\n"
						+ "⠀⠀⠀⠀⠀⠀⠘⢆⢅⠂⢄⠀⠠⠐⠀⠀⡀⠄⠀⠄⠠⡀⡖⠁⠀⠀⠀⠀⠀⠀\r\n"
						+ "⠀⠀⠀⠀⠀⠀⠀⠀⠉⠙⠢⠮⣐⣔⣨⣐⣄⣂⠶⠜⠊⠁⠀⠀⠀⠀⠀⠀⠀⠀\r\n";
			} else if(id.equals(new Mob.Id(4))) {
				return    "⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⠤⠒⠒⡉⢍⢍⢫⢙⠖⡖⣤⣀⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
						+ "⠀⠀⠀⠀⢀⢀⡄⠦⢊⠡⡐⡨⡐⢜⢐⠅⡆⢕⠡⡃⡇⡮⡳⡄⠀⠀⠀⠀⠀⠀\r\n"
						+ "⠀⢀⠴⢔⢍⢢⢢⢣⢱⡱⡜⣔⢎⢮⡪⣎⢎⡎⣎⢎⢮⢪⢎⢯⢆⠀⠀⠀⠀⠀\r\n"
						+ "⢠⢣⢱⡱⣕⢕⢧⢳⢕⢇⣗⢵⡹⡪⡎⡮⡣⡏⡮⡳⣣⢗⣕⡕⣏⢗⣤⠀⠀⠀\r\n"
						+ "⣏⢮⡳⣽⢼⡹⡹⣵⡽⡽⡞⢖⠟⢗⠗⡟⢗⠧⡷⣹⢸⡱⡳⣝⢮⡺⣜⢝⢦⡀\r\n"
						+ "⢳⢝⡾⣯⢲⣽⡟⢯⡲⡑⢌⠪⡘⢌⠪⠨⡂⢗⡺⡌⢏⢾⣸⣪⡓⡯⣗⣯⣣⣳\r\n"
						+ "⠀⠻⣚⠿⣷⣵⠋⠜⠞⠀⢁⠀⡐⢀⡁⠁⠊⠸⠞⢌⠢⡂⢷⠶⣻⣎⢗⣟⡮⣾\r\n"
						+ "⠀⠀⠈⠫⡞⠌⠀⠁⠀⠀⠐⠉⠉⠉⠂⠀⠀⠀⠈⢐⠡⢊⠌⣿⡾⡣⡯⣗⢯⠎\r\n"
						+ "⠀⠀⡰⠁⠄⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠨⠐⠅⢾⣸⡝⠮⠓⠁⠀\r\n"
						+ "⠀⢰⠁⠠⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠐⠀⠀⠅⠣⡱⡅⠀⠀⠀⠀⠀\r\n"
						+ "⠀⢸⠀⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠁⠀⠀⠀⠌⡌⡢⣓⠀⠀⠀⠀⠀\r\n"
						+ "⠀⠐⢣⠀⠀⠀⠀⠀⠂⠁⠀⠀⠁⠀⠀⠁⠀⠄⠀⢂⠡⢑⢌⢲⠅⠀⠀⠀⠀⠀\r\n"
						+ "⠀⠀⠈⠢⢄⠀⠐⠀⡀⠠⠀⠀⠂⡀⢁⠀⢂⠠⢁⠢⡊⡢⡱⠃⠀⠀⠀⠀⠀⠀\r\n"
						+ "⠀⠀⠀⠀⠈⠒⠥⢔⣀⣢⣨⣠⣡⣐⣠⣊⣔⣌⡢⠧⠕⠉⠀⠀⠀⠀⠀⠀⠀⠀\r\n";
			} else if(id.equals(new Mob.Id(5))) {
				return    "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢮⣫⢷⡲⣛⢯⡛⡖⡶⣆⡀⠀⣀⠀⠀⠀⠀⠀⠀⠀\r\n"
						+ "⠀⠀⠀⠀⠀⣰⢏⡗⣶⢲⢝⡮⠷⣝⡎⡧⣳⢟⡏⡳⣏⢿⡌⣣⠄⠀⠀⠀⠀⠀\r\n"
						+ "⠀⠀⠀⠀⠀⢼⡳⣟⣕⢷⡻⡭⡣⡛⣮⡪⡪⡳⡱⠸⢇⢣⢛⢾⠀⠀⠀⠀⠀⠀\r\n"
						+ "⠀⠀⢠⣖⡶⠫⠪⠮⠮⠳⡽⣕⢧⡫⣲⢱⡱⣱⢱⣱⠥⣇⡕⣟⢶⢳⢲⡀⠀⠀\r\n"
						+ "⡠⡄⠖⡃⡐⣐⢐⠄⡄⡂⡈⢈⠪⠺⡸⡜⡮⡷⡻⡕⡢⢘⡞⡪⡳⡱⡸⡂⠀⠀\r\n"
						+ "⡗⡄⡇⡮⡪⣪⣮⣣⣧⣎⣆⢕⡐⡐⡈⠌⢎⢎⢗⢝⠜⡄⠽⠪⡸⡨⡳⣄⢀⠀\r\n"
						+ "⢹⢜⢜⢰⣽⣻⣺⢽⣳⢟⠿⡻⠷⠷⣪⡢⡂⠌⡂⠕⡱⡘⢌⢊⢢⢱⢱⠱⢉⢱\r\n"
						+ "⠀⠑⢕⡌⠻⢾⣺⡏⣢⢕⠨⠢⡑⣑⡔⡩⠹⢺⢴⣐⡄⢌⢐⢁⠃⡃⠣⢁⢢⠏\r\n"
						+ "⠀⠀⠀⠈⠙⡱⣽⠌⡪⢱⣵⠕⢌⠺⡣⢊⠜⡰⢨⠨⡚⡙⠵⡖⠳⠚⠺⠘⠁⠀\r\n"
						+ "⠀⠀⠀⠐⢏⣜⡎⢌⠢⠡⡋⡣⢑⢑⠌⡢⢑⠌⡢⢑⢌⡌⡂⠊⢥⠀⠀⠀⠀⠀\r\n"
						+ "⠀⠀⠀⠀⠀⢺⢈⠢⠈⠐⠐⠈⠐⠠⠁⠂⠅⠨⠐⠀⠄⠊⠝⡦⣂⡱⠂⠀⠀⠀\r\n"
						+ "⠀⠀⠀⠀⠀⠉⡦⡡⢁⠄⠀⠐⠀⠠⠐⠀⠀⠀⠀⠀⠄⠈⠈⡇⠀⠀⠀⠀⠀⠀\r\n"
						+ "⠀⠀⠀⠀⠀⠀⠘⢆⢅⠢⢀⢁⠀⡀⠀⡀⠀⠄⠀⠄⠠⣀⠵⠁⠀⠀⠀⠀⠀⠀\r\n"
						+ "⠀⠀⠀⠀⠀⠀⠀⠀⠉⠚⠢⠦⣢⣐⣔⣄⣢⣂⠵⠜⠊⠈⠀⠀⠀⠀⠀⠀⠀⠀\r\n";
			} else if(id.equals(new Mob.Id(6))) {
				return    "⠀⠀⠀⠀⠀⣀⢠⠤⠒⢒⠉⠉⠉⠉⠑⠒⠤⢄⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
						+ "⠀⠀⡀⠤⠊⠀⠀⠲⣍⣉⢤⠖⠁⠐⠀⢀⠠⠀⠉⠊⠦⡀⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
						+ "⠀⠶⢥⠎⠅⠀⣂⡡⡦⡬⣄⢄⠈⠀⠀⠄⠀⢀⠠⠀⠐⠈⢢⡀⠀⠀⠀⠀⠀⠀\r\n"
						+ "⠀⢀⠎⢖⣄⡲⢡⠬⠲⠙⠊⠋⢮⠀⠂⠀⠄⠀⠀⡀⠄⠈⠀⡘⡄⠀⠀⠀⠀⠀\r\n"
						+ "⠀⡗⢪⢦⡻⣒⡿⠇⠀⠀⠀⢢⢕⡬⠴⠤⣂⠀⠁⠀⠀⡀⠄⠀⡘⡄⠀⠀⠀⠀\r\n"
						+ "⠀⢱⠼⣽⠕⢤⢳⢢⠢⠎⡚⠡⡎⠀⠀⠠⠠⠐⠀⠂⠁⠀⠀⡀⠄⢚⡤⡏⡗⢴\r\n"
						+ "⠠⡇⡸⣌⡏⡶⡠⠁⢓⠀⠂⠁⢇⡴⣶⣳⣇⡅⠡⠀⠐⢀⠄⢀⠐⢤⠋⠈⠉⠁\r\n"
						+ "⠠⡗⡷⡩⡿⠪⣽⢑⢐⠈⠄⡂⠨⡫⡞⠾⡐⡐⡠⠁⠌⠸⡠⠐⠈⡇⠀⠀⠀⠀\r\n"
						+ "⢮⣳⠵⣰⣱⣵⣋⣆⡥⠥⠵⠘⠚⠒⠚⠒⠚⠒⠺⣾⡿⠉⠑⢦⣷⠇⠀⠀⠀⠀\r\n";
			} else if(id.equals(new Mob.Id(7))) {
				return    "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⡤⡦⡴⡴⣻⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
						+ "⠀⠀⠀⠀⠀⠀⠀⠀⢶⢤⡤⣠⢴⣧⢷⡻⣱⡽⠇⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
						+ "⠀⠀⠀⠀⠀⡀⣀⠤⠎⢓⠉⠉⠛⠫⡿⣻⡷⣋⢀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
						+ "⠀⠀⢀⢄⠊⠀⠀⠦⣓⣉⢤⢜⠀⠁⠀⠙⢞⣧⣅⠓⠤⡀⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
						+ "⠀⠼⢴⠔⠑⠈⣀⠴⡴⢬⢄⣀⠠⠀⠁⠀⠀⢳⣝⢷⡐⢈⠢⡀⠀⠀⠀⠀⠀⠀\r\n"
						+ "⠀⢀⠎⢦⣂⡲⢁⠵⠚⠊⠋⠋⢦⠂⡀⠁⠀⠄⢯⢯⢗⡄⠀⠍⡄⠀⠀⠀⠀⠀\r\n"
						+ "⢀⡗⢪⢆⣟⢎⣿⠇⠀⠀⠀⣡⢚⡤⠤⠦⢄⠀⢚⣽⢽⡦⠀⠂⡘⡄⠀⠀⠀⠀\r\n"
						+ "⠀⢒⢼⣻⠲⢨⢲⢔⠴⠜⢚⠠⡇⠀⠀⠄⢂⠐⠠⣟⣗⡯⠀⠀⠄⠺⣠⠯⡳⣰\r\n"
						+ "⢀⡇⢔⣎⡏⡧⣄⢁⠓⠐⠀⠈⢇⡴⡶⡾⣎⢔⣱⣟⣷⣋⠀⠐⡈⣰⠋⠉⠉⠈\r\n"
						+ "⠀⡗⡷⡩⢿⠪⣺⠢⠨⢈⢐⠠⢘⢳⠽⢻⣡⢶⣻⡞⢇⠸⡄⠁⠄⡇⠀⠀⠀⠀\r\n"
						+ "⢞⣽⠦⣪⣢⣧⣛⣌⡪⠴⠤⠕⠒⠚⠛⠛⠚⠛⠳⣷⡿⠑⠉⢦⣞⠇⠀⠀⠀⠀\r\n";
			}
			return "";
		}
	}
	
	public static class Item {
		private String nameKey; // 이것이 곧 id
		
		private int itemPrice;
		
		private int itemBundleSize;
		
		public Item(String nameKey, int itemPrice, int itemBundleSize) {
			this.nameKey = nameKey;
			this.itemPrice = itemPrice;
			this.itemBundleSize = itemBundleSize;
		}
		
		public String getNameKey() {
			return nameKey;
		}
		
		public int getItemPrice() {
			return itemPrice;
		}
		
		public int getItemBundleSize() { 
			return itemBundleSize;
		}

		@Override
		public int hashCode() {
			return Objects.hash(nameKey);
		}

		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Item other = (Item) obj;
			return Objects.equals(nameKey, other.nameKey);
		}
		
	}
}

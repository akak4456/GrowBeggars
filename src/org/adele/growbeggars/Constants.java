package org.adele.growbeggars;

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
	
	public static final AutoMachineConstant[] EMPLOY_BEGGAR_CONSTANTS = {
			new AutoMachineConstant(new AutoMoneyMachine.Id("employ_beggar_1"),"초급 거지",1.0,1000,1000),
			new AutoMachineConstant(new AutoMoneyMachine.Id("employ_beggar_2"),"초급 불의 호흡 거지",1.2,1200,1000),
			new AutoMachineConstant(new AutoMoneyMachine.Id("employ_beggar_3"),"초급 바람의 호흡 거지",1.4,1400,1000),
			new AutoMachineConstant(new AutoMoneyMachine.Id("employ_beggar_4"),"초급 물의 호흡 거지",1.7,1700,1000),
			new AutoMachineConstant(new AutoMoneyMachine.Id("employ_beggar_5"),"중급 거지",2.0,2000,1000),
			new AutoMachineConstant(new AutoMoneyMachine.Id("employ_beggar_6"),"고급 거지",3.0,3000,1000),
			new AutoMachineConstant(new AutoMoneyMachine.Id("employ_beggar_7"),"특급 거지",4.0,4000,1000)
	};
	
	public static final AutoMachineConstant[] BUILDING_CONSTANTS = {
			new AutoMachineConstant(new AutoMoneyMachine.Id("building_1"),"단독주택", 10.0, 10000, 1000),
			new AutoMachineConstant(new AutoMoneyMachine.Id("building_2"),"연립주택", 15.0, 15000, 1000),
			new AutoMachineConstant(new AutoMoneyMachine.Id("building_3"),"아파트", 20.0, 20000, 1000),
			new AutoMachineConstant(new AutoMoneyMachine.Id("building_4"),"궁궐", 30.0, 30000, 1000),
			new AutoMachineConstant(new AutoMoneyMachine.Id("building_5"),"초호화 주택", 50.0, 50000, 1000)
	};
	
	public static final AutoMachineConstant[] NATION_CONSTANTS = {
			new AutoMachineConstant(new AutoMoneyMachine.Id("nation_1"),"미국",100.0,100000,1000),
			new AutoMachineConstant(new AutoMoneyMachine.Id("nation_2"),"중국",120.0,120000,1000),
			new AutoMachineConstant(new AutoMoneyMachine.Id("nation_3"),"일본",150.0,150000,1000),
			new AutoMachineConstant(new AutoMoneyMachine.Id("nation_4"),"대만",200.0,200000,1000),
			new AutoMachineConstant(new AutoMoneyMachine.Id("nation_5"),"한국",300.0,300000,1000)
	};
	
	public static final MobConstant[] MOB_CONSTANTS = {
			new MobConstant(new Mob.Id(1L), "슬라임", 50, 0.1, 10,20, 5000, 10000, 100, 50),
			new MobConstant(new Mob.Id(2L), "주황버섯", 70,0.1,20,30, 7000, 15000, 200, 100),
			new MobConstant(new Mob.Id(3L), "초록버섯", 80,0.2,30,50, 10000, 20000, 300, 150),
			new MobConstant(new Mob.Id(4L), "파란버섯", 200,0.2,40,80, 20000, 40000, 500, 200),
			new MobConstant(new Mob.Id(5L), "뿔버섯", 300,0.2,50,100, 30000, 60000, 700, 400),
			new MobConstant(new Mob.Id(6L), "돼지", 500,0.3,100,200, 50000, 100000, 800, 500),
			new MobConstant(new Mob.Id(7L), "리본돼지", 700,0.5,200,300, 200000, 400000, 2000, 1000),
	};
	
	public static final Item[] ITEM_CONSTANTS = {
			new Item("구걸 피버", 500, 5),
			new Item("각설이타령", 1000, 1),
			new Item("HP 포션", 1000, 1),
			new Item("공격무시", 1000, 1)
	};
	
	private Constants() {
		
	}
	
	public static final class AutoMachineConstant {
		private AutoMoneyMachine.Id id;
		private String name;
		private double mul;
		private int buyPrice;
		private int initUpgradePrice;
		
		public AutoMachineConstant(AutoMoneyMachine.Id id, String name, double mul, int buyPrice, int initUpgradePrice) {
			this.id = id;
			this.name = name;
			this.mul = mul;
			this.buyPrice = buyPrice;
			this.initUpgradePrice = initUpgradePrice;
		}
		
		public AutoMoneyMachine.Id getId(){
			return id;
		}
		
		public String getName() {
			return name;
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
		private String name;
		private int hp;
		private double evasionRate; // 회피율
		private int hitMinPoint;// 최소공격력
		private int hitMaxPoint;// 최대공격력
		private int earnMinMoney; // 벌 수 있는 최소 돈
		private int earnMaxMoney; // 벌 수 있는 최대 돈
		private int earnExp;// 벌 수 있는 경험치
		private int loseExp; // 질 때 잃을 수 있는 경험치
		
		public MobConstant(Mob.Id id, String name, int hp, double evasionRate, int hitMinPoint, int hitMaxPoint, int earnMinMoney, int earnMaxMoney, int earnExp, int loseExp) {
			this.id = id;
			this.name = name;
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
		
		public String getName() {
			return name;
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
		private String name; // 이것이 곧 id
		
		private int itemPrice;
		
		private int itemBundleSize;
		
		public Item(String name, int itemPrice, int itemBundleSize) {
			this.name = name;
			this.itemPrice = itemPrice;
			this.itemBundleSize = itemBundleSize;
		}
		
		public String getName() {
			return name;
		}
		
		public int getItemPrice() {
			return itemPrice;
		}
		
		public int getItemBundleSize() { 
			return itemBundleSize;
		}

		@Override
		public int hashCode() {
			return Objects.hash(name);
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
			return Objects.equals(name, other.name);
		}
		
	}
}

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class JamesBondTest {
	String pattern = ".*\\(.*007.*\\).*";
	
	@Test
	public void testCase0(){
	assertFalse("(".matches(pattern));
	}
	@Test
	public void testCase1(){
	assertFalse("((".matches(pattern));
	}
	@Test
	public void testCase2(){
	assertFalse("(((".matches(pattern));
	}
	@Test
	public void testCase3(){
	assertFalse("(()".matches(pattern));
	}
	@Test
	public void testCase4(){
	assertFalse("((0".matches(pattern));
	}
	@Test
	public void testCase5(){
	assertFalse("((00".matches(pattern));
	}
	@Test
	public void testCase6(){
	assertFalse("()".matches(pattern));
	}
	@Test
	public void testCase7(){
	assertFalse("()(".matches(pattern));
	}
	@Test
	public void testCase8(){
	assertFalse("())".matches(pattern));
	}
	@Test
	public void testCase9(){
	assertFalse("()0".matches(pattern));
	}
	@Test
	public void testCase10(){
	assertFalse("()00".matches(pattern));
	}
	@Test
	public void testCase11(){
	assertFalse("(0".matches(pattern));
	}
	@Test
	public void testCase12(){
	assertFalse("(0(".matches(pattern));
	}
	@Test
	public void testCase13(){
	assertFalse("(0((".matches(pattern));
	}
	@Test
	public void testCase14(){
	assertFalse("(0()".matches(pattern));
	}
	@Test
	public void testCase15(){
	assertFalse("(0(0".matches(pattern));
	}
	@Test
	public void testCase16(){
	assertFalse("(0(00".matches(pattern));
	}
	@Test
	public void testCase17(){
	assertFalse("(0)".matches(pattern));
	}
	@Test
	public void testCase18(){
	assertFalse("(0)(".matches(pattern));
	}
	@Test
	public void testCase19(){
	assertFalse("(0))".matches(pattern));
	}
	@Test
	public void testCase20(){
	assertFalse("(0)0".matches(pattern));
	}
	@Test
	public void testCase21(){
	assertFalse("(0)00".matches(pattern));
	}
	@Test
	public void testCase22(){
	assertFalse("(00".matches(pattern));
	}
	@Test
	public void testCase23(){
	assertFalse("(00(".matches(pattern));
	}
	@Test
	public void testCase24(){
	assertFalse("(00((".matches(pattern));
	}
	@Test
	public void testCase25(){
	assertFalse("(00()".matches(pattern));
	}
	@Test
	public void testCase26(){
	assertFalse("(00(0".matches(pattern));
	}
	@Test
	public void testCase27(){
	assertFalse("(00(00".matches(pattern));
	}
	@Test
	public void testCase28(){
	assertFalse("(00)".matches(pattern));
	}
	@Test
	public void testCase29(){
	assertFalse("(00)(".matches(pattern));
	}
	@Test
	public void testCase30(){
	assertFalse("(00))".matches(pattern));
	}
	@Test
	public void testCase31(){
	assertFalse("(00)0".matches(pattern));
	}
	@Test
	public void testCase32(){
	assertFalse("(00)00".matches(pattern));
	}
	@Test
	public void testCase33(){
	assertFalse("(000".matches(pattern));
	}
	@Test
	public void testCase34(){
	assertFalse("(000(".matches(pattern));
	}
	@Test
	public void testCase35(){
	assertFalse("(000)".matches(pattern));
	}
	@Test
	public void testCase36(){
	assertFalse("(0000".matches(pattern));
	}
	@Test
	public void testCase37(){
	assertFalse("(00000".matches(pattern));
	}
	@Test
	public void testCase38(){
	assertFalse("(001(".matches(pattern));
	}
	@Test
	public void testCase39(){
	assertFalse("(001)".matches(pattern));
	}
	@Test
	public void testCase40(){
	assertFalse("(0010".matches(pattern));
	}
	@Test
	public void testCase41(){
	assertFalse("(00100".matches(pattern));
	}
	@Test
	public void testCase42(){
	assertFalse("(002(".matches(pattern));
	}
	@Test
	public void testCase43(){
	assertFalse("(002)".matches(pattern));
	}
	@Test
	public void testCase44(){
	assertFalse("(0020".matches(pattern));
	}
	@Test
	public void testCase45(){
	assertFalse("(00200".matches(pattern));
	}
	@Test
	public void testCase46(){
	assertFalse("(003(".matches(pattern));
	}
	@Test
	public void testCase47(){
	assertFalse("(003)".matches(pattern));
	}
	@Test
	public void testCase48(){
	assertFalse("(0030".matches(pattern));
	}
	@Test
	public void testCase49(){
	assertFalse("(00300".matches(pattern));
	}
	@Test
	public void testCase50(){
	assertFalse("(004(".matches(pattern));
	}
	@Test
	public void testCase51(){
	assertFalse("(004)".matches(pattern));
	}
	@Test
	public void testCase52(){
	assertFalse("(0040".matches(pattern));
	}
	@Test
	public void testCase53(){
	assertFalse("(00400".matches(pattern));
	}
	@Test
	public void testCase54(){
	assertFalse("(005(".matches(pattern));
	}
	@Test
	public void testCase55(){
	assertFalse("(005)".matches(pattern));
	}
	@Test
	public void testCase56(){
	assertFalse("(0050".matches(pattern));
	}
	@Test
	public void testCase57(){
	assertFalse("(00500".matches(pattern));
	}
	@Test
	public void testCase58(){
	assertFalse("(006(".matches(pattern));
	}
	@Test
	public void testCase59(){
	assertFalse("(006)".matches(pattern));
	}
	@Test
	public void testCase60(){
	assertFalse("(0060".matches(pattern));
	}
	@Test
	public void testCase61(){
	assertFalse("(00600".matches(pattern));
	}
	@Test
	public void testCase62(){
	assertFalse("(007(".matches(pattern));
	}
	@Test
	public void testCase63(){
	assertFalse("(007((".matches(pattern));
	}
	@Test
	public void testCase64(){
	assertTrue("(007()".matches(pattern));
	}
	@Test
	public void testCase65(){
	assertFalse("(007(0".matches(pattern));
	}
	@Test
	public void testCase66(){
	assertFalse("(007(00".matches(pattern));
	}
	@Test
	public void testCase67(){
	assertTrue("(007)".matches(pattern));
	}
	@Test
	public void testCase68(){
	assertTrue("(007)(".matches(pattern));
	}
	@Test
	public void testCase69(){
	assertTrue("(007)((".matches(pattern));
	}
	@Test
	public void testCase70(){
	assertTrue("(007)()".matches(pattern));
	}
	@Test
	public void testCase71(){
	assertTrue("(007)(0".matches(pattern));
	}
	@Test
	public void testCase72(){
	assertTrue("(007)(00".matches(pattern));
	}
	@Test
	public void testCase73(){
	assertTrue("(007))".matches(pattern));
	}
	@Test
	public void testCase74(){
	assertTrue("(007))(".matches(pattern));
	}
	@Test
	public void testCase75(){
	assertTrue("(007)))".matches(pattern));
	}
	@Test
	public void testCase76(){
	assertTrue("(007))0".matches(pattern));
	}
	@Test
	public void testCase77(){
	assertTrue("(007))00".matches(pattern));
	}
	@Test
	public void testCase78(){
	assertTrue("(007)0".matches(pattern));
	}
	@Test
	public void testCase79(){
	assertTrue("(007)0(".matches(pattern));
	}
	@Test
	public void testCase80(){
	assertTrue("(007)0)".matches(pattern));
	}
	@Test
	public void testCase81(){
	assertTrue("(007)00".matches(pattern));
	}
	@Test
	public void testCase82(){
	assertTrue("(007)000".matches(pattern));
	}
	@Test
	public void testCase83(){
	assertFalse("(0070".matches(pattern));
	}
	@Test
	public void testCase84(){
	assertFalse("(0070(".matches(pattern));
	}
	@Test
	public void testCase85(){
	assertTrue("(0070)".matches(pattern));
	}
	@Test
	public void testCase86(){
	assertFalse("(00700".matches(pattern));
	}
	@Test
	public void testCase87(){
	assertFalse("(007000".matches(pattern));
	}
	@Test
	public void testCase88(){
	assertFalse("(0071(".matches(pattern));
	}
	@Test
	public void testCase89(){
	assertTrue("(0071)".matches(pattern));
	}
	@Test
	public void testCase90(){
	assertFalse("(00710".matches(pattern));
	}
	@Test
	public void testCase91(){
	assertFalse("(007100".matches(pattern));
	}
	@Test
	public void testCase92(){
	assertFalse("(0072(".matches(pattern));
	}
	@Test
	public void testCase93(){
	assertTrue("(0072)".matches(pattern));
	}
	@Test
	public void testCase94(){
	assertFalse("(00720".matches(pattern));
	}
	@Test
	public void testCase95(){
	assertFalse("(007200".matches(pattern));
	}
	@Test
	public void testCase96(){
	assertFalse("(0073(".matches(pattern));
	}
	@Test
	public void testCase97(){
	assertTrue("(0073)".matches(pattern));
	}
	@Test
	public void testCase98(){
	assertFalse("(00730".matches(pattern));
	}
	@Test
	public void testCase99(){
	assertFalse("(007300".matches(pattern));
	}
	@Test
	public void testCase100(){
	assertFalse("(0074(".matches(pattern));
	}
	@Test
	public void testCase101(){
	assertTrue("(0074)".matches(pattern));
	}
	@Test
	public void testCase102(){
	assertFalse("(00740".matches(pattern));
	}
	@Test
	public void testCase103(){
	assertFalse("(007400".matches(pattern));
	}
	@Test
	public void testCase104(){
	assertFalse("(0075(".matches(pattern));
	}
	@Test
	public void testCase105(){
	assertTrue("(0075)".matches(pattern));
	}
	@Test
	public void testCase106(){
	assertFalse("(00750".matches(pattern));
	}
	@Test
	public void testCase107(){
	assertFalse("(007500".matches(pattern));
	}
	@Test
	public void testCase108(){
	assertFalse("(0076(".matches(pattern));
	}
	@Test
	public void testCase109(){
	assertTrue("(0076)".matches(pattern));
	}
	@Test
	public void testCase110(){
	assertFalse("(00760".matches(pattern));
	}
	@Test
	public void testCase111(){
	assertFalse("(007600".matches(pattern));
	}
	@Test
	public void testCase112(){
	assertFalse("(0077(".matches(pattern));
	}
	@Test
	public void testCase113(){
	assertTrue("(0077)".matches(pattern));
	}
	@Test
	public void testCase114(){
	assertFalse("(00770".matches(pattern));
	}
	@Test
	public void testCase115(){
	assertFalse("(007700".matches(pattern));
	}
	@Test
	public void testCase116(){
	assertFalse("(0078(".matches(pattern));
	}
	@Test
	public void testCase117(){
	assertTrue("(0078)".matches(pattern));
	}
	@Test
	public void testCase118(){
	assertFalse("(00780".matches(pattern));
	}
	@Test
	public void testCase119(){
	assertFalse("(007800".matches(pattern));
	}
	@Test
	public void testCase120(){
	assertFalse("(0079(".matches(pattern));
	}
	@Test
	public void testCase121(){
	assertTrue("(0079)".matches(pattern));
	}
	@Test
	public void testCase122(){
	assertFalse("(00790".matches(pattern));
	}
	@Test
	public void testCase123(){
	assertFalse("(007900".matches(pattern));
	}
	@Test
	public void testCase124(){
	assertFalse("(008(".matches(pattern));
	}
	@Test
	public void testCase125(){
	assertFalse("(008)".matches(pattern));
	}
	@Test
	public void testCase126(){
	assertFalse("(0080".matches(pattern));
	}
	@Test
	public void testCase127(){
	assertFalse("(00800".matches(pattern));
	}
	@Test
	public void testCase128(){
	assertFalse("(009(".matches(pattern));
	}
	@Test
	public void testCase129(){
	assertFalse("(009)".matches(pattern));
	}
	@Test
	public void testCase130(){
	assertFalse("(0090".matches(pattern));
	}
	@Test
	public void testCase131(){
	assertFalse("(00900".matches(pattern));
	}
	@Test
	public void testCase132(){
	assertFalse("(01(".matches(pattern));
	}
	@Test
	public void testCase133(){
	assertFalse("(01)".matches(pattern));
	}
	@Test
	public void testCase134(){
	assertFalse("(010".matches(pattern));
	}
	@Test
	public void testCase135(){
	assertFalse("(0100".matches(pattern));
	}
	@Test
	public void testCase136(){
	assertFalse("(02(".matches(pattern));
	}
	@Test
	public void testCase137(){
	assertFalse("(02)".matches(pattern));
	}
	@Test
	public void testCase138(){
	assertFalse("(020".matches(pattern));
	}
	@Test
	public void testCase139(){
	assertFalse("(0200".matches(pattern));
	}
	@Test
	public void testCase140(){
	assertFalse("(03(".matches(pattern));
	}
	@Test
	public void testCase141(){
	assertFalse("(03)".matches(pattern));
	}
	@Test
	public void testCase142(){
	assertFalse("(030".matches(pattern));
	}
	@Test
	public void testCase143(){
	assertFalse("(0300".matches(pattern));
	}
	@Test
	public void testCase144(){
	assertFalse("(04(".matches(pattern));
	}
	@Test
	public void testCase145(){
	assertFalse("(04)".matches(pattern));
	}
	@Test
	public void testCase146(){
	assertFalse("(040".matches(pattern));
	}
	@Test
	public void testCase147(){
	assertFalse("(0400".matches(pattern));
	}
	@Test
	public void testCase148(){
	assertFalse("(05(".matches(pattern));
	}
	@Test
	public void testCase149(){
	assertFalse("(05)".matches(pattern));
	}
	@Test
	public void testCase150(){
	assertFalse("(050".matches(pattern));
	}
	@Test
	public void testCase151(){
	assertFalse("(0500".matches(pattern));
	}
	@Test
	public void testCase152(){
	assertFalse("(06(".matches(pattern));
	}
	@Test
	public void testCase153(){
	assertFalse("(06)".matches(pattern));
	}
	@Test
	public void testCase154(){
	assertFalse("(060".matches(pattern));
	}
	@Test
	public void testCase155(){
	assertFalse("(0600".matches(pattern));
	}
	@Test
	public void testCase156(){
	assertFalse("(07(".matches(pattern));
	}
	@Test
	public void testCase157(){
	assertFalse("(07)".matches(pattern));
	}
	@Test
	public void testCase158(){
	assertFalse("(070".matches(pattern));
	}
	@Test
	public void testCase159(){
	assertFalse("(0700".matches(pattern));
	}
	@Test
	public void testCase160(){
	assertFalse("(08(".matches(pattern));
	}
	@Test
	public void testCase161(){
	assertFalse("(08)".matches(pattern));
	}
	@Test
	public void testCase162(){
	assertFalse("(080".matches(pattern));
	}
	@Test
	public void testCase163(){
	assertFalse("(0800".matches(pattern));
	}
	@Test
	public void testCase164(){
	assertFalse("(09(".matches(pattern));
	}
	@Test
	public void testCase165(){
	assertFalse("(09)".matches(pattern));
	}
	@Test
	public void testCase166(){
	assertFalse("(090".matches(pattern));
	}
	@Test
	public void testCase167(){
	assertFalse("(0900".matches(pattern));
	}
	@Test
	public void testCase168(){
	assertFalse("(1(".matches(pattern));
	}
	@Test
	public void testCase169(){
	assertFalse("(1)".matches(pattern));
	}
	@Test
	public void testCase170(){
	assertFalse("(10".matches(pattern));
	}
	@Test
	public void testCase171(){
	assertFalse("(100".matches(pattern));
	}
	@Test
	public void testCase172(){
	assertFalse("(2(".matches(pattern));
	}
	@Test
	public void testCase173(){
	assertFalse("(2)".matches(pattern));
	}
	@Test
	public void testCase174(){
	assertFalse("(20".matches(pattern));
	}
	@Test
	public void testCase175(){
	assertFalse("(200".matches(pattern));
	}
	@Test
	public void testCase176(){
	assertFalse("(3(".matches(pattern));
	}
	@Test
	public void testCase177(){
	assertFalse("(3)".matches(pattern));
	}
	@Test
	public void testCase178(){
	assertFalse("(30".matches(pattern));
	}
	@Test
	public void testCase179(){
	assertFalse("(300".matches(pattern));
	}
	@Test
	public void testCase180(){
	assertFalse("(4(".matches(pattern));
	}
	@Test
	public void testCase181(){
	assertFalse("(4)".matches(pattern));
	}
	@Test
	public void testCase182(){
	assertFalse("(40".matches(pattern));
	}
	@Test
	public void testCase183(){
	assertFalse("(400".matches(pattern));
	}
	@Test
	public void testCase184(){
	assertFalse("(5(".matches(pattern));
	}
	@Test
	public void testCase185(){
	assertFalse("(5)".matches(pattern));
	}
	@Test
	public void testCase186(){
	assertFalse("(50".matches(pattern));
	}
	@Test
	public void testCase187(){
	assertFalse("(500".matches(pattern));
	}
	@Test
	public void testCase188(){
	assertFalse("(6(".matches(pattern));
	}
	@Test
	public void testCase189(){
	assertFalse("(6)".matches(pattern));
	}
	@Test
	public void testCase190(){
	assertFalse("(60".matches(pattern));
	}
	@Test
	public void testCase191(){
	assertFalse("(600".matches(pattern));
	}
	@Test
	public void testCase192(){
	assertFalse("(7(".matches(pattern));
	}
	@Test
	public void testCase193(){
	assertFalse("(7)".matches(pattern));
	}
	@Test
	public void testCase194(){
	assertFalse("(70".matches(pattern));
	}
	@Test
	public void testCase195(){
	assertFalse("(700".matches(pattern));
	}
	@Test
	public void testCase196(){
	assertFalse("(8(".matches(pattern));
	}
	@Test
	public void testCase197(){
	assertFalse("(8)".matches(pattern));
	}
	@Test
	public void testCase198(){
	assertFalse("(80".matches(pattern));
	}
	@Test
	public void testCase199(){
	assertFalse("(800".matches(pattern));
	}
	@Test
	public void testCase200(){
	assertFalse("(9(".matches(pattern));
	}
	@Test
	public void testCase201(){
	assertFalse("(9)".matches(pattern));
	}
	@Test
	public void testCase202(){
	assertFalse("(90".matches(pattern));
	}
	@Test
	public void testCase203(){
	assertFalse("(900".matches(pattern));
	}
	@Test
	public void testCase204(){
	assertFalse(")".matches(pattern));
	}
	@Test
	public void testCase205(){
	assertFalse(")(".matches(pattern));
	}
	@Test
	public void testCase206(){
	assertFalse("))".matches(pattern));
	}
	@Test
	public void testCase207(){
	assertFalse(")0".matches(pattern));
	}
	@Test
	public void testCase208(){
	assertFalse(")00".matches(pattern));
	}
	@Test
	public void testCase209(){
	assertFalse("0".matches(pattern));
	}
	@Test
	public void testCase210(){
	assertFalse("0(".matches(pattern));
	}
	@Test
	public void testCase211(){
	assertFalse("0)".matches(pattern));
	}
	@Test
	public void testCase212(){
	assertFalse("00".matches(pattern));
	}
	@Test
	public void testCase213(){
	assertFalse("000".matches(pattern));
	}
	@Test
	public void testCase214(){
	assertFalse("1(".matches(pattern));
	}
	@Test
	public void testCase215(){
	assertFalse("1)".matches(pattern));
	}
	@Test
	public void testCase216(){
	assertFalse("10".matches(pattern));
	}
	@Test
	public void testCase217(){
	assertFalse("100".matches(pattern));
	}
	@Test
	public void testCase218(){
	assertFalse("2(".matches(pattern));
	}
	@Test
	public void testCase219(){
	assertFalse("2)".matches(pattern));
	}
	@Test
	public void testCase220(){
	assertFalse("20".matches(pattern));
	}
	@Test
	public void testCase221(){
	assertFalse("200".matches(pattern));
	}
	@Test
	public void testCase222(){
	assertFalse("3(".matches(pattern));
	}
	@Test
	public void testCase223(){
	assertFalse("3)".matches(pattern));
	}
	@Test
	public void testCase224(){
	assertFalse("30".matches(pattern));
	}
	@Test
	public void testCase225(){
	assertFalse("300".matches(pattern));
	}
	@Test
	public void testCase226(){
	assertFalse("4(".matches(pattern));
	}
	@Test
	public void testCase227(){
	assertFalse("4)".matches(pattern));
	}
	@Test
	public void testCase228(){
	assertFalse("40".matches(pattern));
	}
	@Test
	public void testCase229(){
	assertFalse("400".matches(pattern));
	}
	@Test
	public void testCase230(){
	assertFalse("5(".matches(pattern));
	}
	@Test
	public void testCase231(){
	assertFalse("5)".matches(pattern));
	}
	@Test
	public void testCase232(){
	assertFalse("50".matches(pattern));
	}
	@Test
	public void testCase233(){
	assertFalse("500".matches(pattern));
	}
	@Test
	public void testCase234(){
	assertFalse("6(".matches(pattern));
	}
	@Test
	public void testCase235(){
	assertFalse("6)".matches(pattern));
	}
	@Test
	public void testCase236(){
	assertFalse("60".matches(pattern));
	}
	@Test
	public void testCase237(){
	assertFalse("600".matches(pattern));
	}
	@Test
	public void testCase238(){
	assertFalse("7(".matches(pattern));
	}
	@Test
	public void testCase239(){
	assertFalse("7)".matches(pattern));
	}
	@Test
	public void testCase240(){
	assertFalse("70".matches(pattern));
	}
	@Test
	public void testCase241(){
	assertFalse("700".matches(pattern));
	}
	@Test
	public void testCase242(){
	assertFalse("8(".matches(pattern));
	}
	@Test
	public void testCase243(){
	assertFalse("8)".matches(pattern));
	}
	@Test
	public void testCase244(){
	assertFalse("80".matches(pattern));
	}
	@Test
	public void testCase245(){
	assertFalse("800".matches(pattern));
	}
	@Test
	public void testCase246(){
	assertFalse("9(".matches(pattern));
	}
	@Test
	public void testCase247(){
	assertFalse("9)".matches(pattern));
	}
	@Test
	public void testCase248(){
	assertFalse("90".matches(pattern));
	}
	@Test
	public void testCase249(){
	assertFalse("900".matches(pattern));
	}
}

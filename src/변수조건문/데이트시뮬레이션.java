package 변수조건문;

import java.util.Scanner;

public class 데이트시뮬레이션 {

	public static void main(String[] args) {
		// TODO 자동 생성된 메소드 스텁

		Scanner sc = new Scanner(System.in);
		
		System.out.println("안녕하세요 데이트 시뮬레이션 입니다.");
		System.out.println("게임설명 : 철수와 영희가 만나서 영화를 무사히 보기 위한 게임입니다.");
		System.out.println("여러가지 선택지로 애인과 데이트를 즐겨보세요.");
		System.out.println("ㆍㆍㆍㆍㆍㆍㆍㆍㆍㆍㆍㆍㆍㆍㆍㆍㆍㆍㆍㆍㆍㆍㆍㆍㆍㆍ");
		
		System.out.println("아래 보기중에 선택해주세요.");
		System.out.println("1.게임 시작 2.게임 종료");
		
		int a = sc.nextInt();
		
		if(a == 1) {
			System.out.println("ㆍㆍㆍㆍㆍㆍㆍ게임 시작ㆍㆍㆍㆍㆍㆍㆍ");
			System.out.println("철수:아침에 눈을 뜨고 핸드폰을 보니 부재중 전화가 10통이다.");
			System.out.println("전화를 확인해보니 영희가 전화를  하였고,");
			System.out.println("약속시간이 한참 지나 있었다...");
			System.out.println("철수는 이미 늦은 김에 더 잠을 잘지, 전화를 걸지 고민한다.");
			System.out.println("");
			System.out.println("1번.전화걸기 2.잠 자기");
			
			
		}
		else if(a==2) {
			System.out.println("ㆍㆍㆍㆍㆍㆍㆍ게임 종료ㆍㆍㆍㆍㆍㆍㆍ");
		}
	
	
	int b = sc.nextInt();
		if(b==1) {
			System.out.println("ㆍㆍㆍㆍㆍㆍㆍㆍㆍㆍㆍㆍㆍㆍㆍㆍㆍㆍㆍㆍㆍㆍ");
			System.out.println("전화를 걸어본다.");
			System.out.println("뚜루루루루루루");
			System.out.println("영희가 전화를 받았다.");
			System.out.println("철수: 영희야 안녕?");
			System.out.println("영희는 화가 났는지 대답이 없다..");
			System.out.println("잠시 후 영희가 대답한다.");
			System.out.println("영희: 빨리 뛰어와라 당장!");
			System.out.println("");
			System.out.println("1번.씻고 간다 2번.바로 뛰어간다");
		}
		
		else if(b==2) {
			System.out.println("ㆍㆍㆍㆍㆍㆍㆍㆍㆍㆍㆍㆍㆍㆍㆍㆍㆍㆍㆍㆍㆍ");
			System.out.println("이왕 늦은거 조금 더 잠을 자야겠다.");
			System.out.println("Zzz");
			System.out.println("전화소리에 잠을 깨었다. 잠을 깨보니 또 부재중이 와있다.");
			System.out.println("영희에게 전화를 건다.");
			System.out.println("철수: 영희야 미안 늦잠을 자서..");
			System.out.println("영희: 아니야 . 괜찮아 다신 연락하지마.");
			System.out.println("철수: 영희야?..?..?");
			System.out.println("뚜르릉. 전화가 끊겼다.");
			System.out.println("철수: .....");
			System.out.println("영희와 헤어졌습니다.게임이 종료 되었습니다.");
			System.out.println("ㆍㆍㆍㆍㆍㆍㆍㆍENDㆍㆍㆍㆍㆍㆍㆍㆍ");
		}
		
		int c = sc.nextInt();
		if(c==1) {
			System.out.println("ㆍㆍㆍㆍㆍㆍㆍㆍㆍㆍㆍㆍㆍㆍㆍㆍㆍㆍ");
			System.out.println("철수는 늦었지만 그래도 멋있는 모습을 보여주기 위해 씻는다.");
			System.out.println("씻고 난 후 영희에게 전화를 걸었다");
			System.out.println("철수: 영희야 나 지금 집에서 나가고 있어.");
			System.out.println("영희: 아까 통화 끝나고 얼마나 지났는지 알지?");
			System.out.println("영희: 나도 집에 있다가 올테니까,나 기다린 만큼 너도 밖에서 기다려.");
			System.out.println("철수: ..?네?아니 잘보이려고 그런건데...");
			System.out.println("영희: 그럼 일찍일어나서 준비했어야지^^? 밖에서 너도 시간보내보렴.");
			System.out.println("철수: 네...");
			System.out.println("");
			System.out.println("철수는 도착해보았지만 영희는 보이지 않았다.");
			System.out.println("영희는 정말 딱 기다린 시간 만큼 지나서야 도착했다.");
			System.out.println("영희를 만나자 철수는 어떻게 할지 고민한다.");
			System.out.println("");
			System.out.println("1번. 화가나지만 먼저 잘못했으니 미안하다고 한다.");
			System.out.println("2번. 화가나서 영희를 보자마자 승질을 낸다.");
			System.out.println("3번. 그냥 영화나 보러 간다.");
			int e = sc.nextInt();
			if( e == 1) {
				System.out.println("ㆍㆍㆍㆍㆍㆍㆍㆍㆍㆍㆍㆍㆍㆍㆍㆍㆍㆍ");
				System.out.println("철수: 미안해 늦어서 화났지? 영화 보러가자.");
				System.out.println("영희: 흠.. 좋아 봐준다. 영화를 골라야 겠네.");
				System.out.println("철수: 우리 액션 영화 보러가자!");
				System.out.println("영희: 무슨 소리니? 멜로 영화 보러갈껀데.");
				System.out.println("철수: 무슨 멜로야. 재미없어 액션보자");
				System.out.println("영희: 멜로 보자고 말했다.");
				System.out.println("철수는 고민한다..");
				System.out.println("");
				System.out.println("1번.멜로 영화  2번. 액션 영화");
			
				int h = sc.nextInt();
				if ( h == 1 ) {
					System.out.println("철수: 그래 멜로 영화 보자 ");
					System.out.println("철수: 나도 멜로 영화 안본지 오래되서 보고 싶기도 하네.");
					System.out.println("영희: 왠일이야? 내가 하자는 대로 해주고? 고마워");
					System.out.println("철수: 힘든 것 도 아닌데 뭘 ㅎㅎ ");
					System.out.println("그렇게 둘은 행복하게 영화를 보았다..");
					System.out.println("ㆍㆍㆍㆍㆍㆍㆍㆍENDㆍㆍㆍㆍㆍㆍㆍㆍ");
					
				}
				else if ( h ==2 ) {
					System.out.println("철수: 영화는 역시 액션이지 !!!");
					System.out.println("영희: 또 액션이야? 넌 항상 너가 하고 싶은 것 만 하려고 해?");
					System.out.println("철수: 무슨 아니거든? 나도 너 하자는 거 다했어.");
					System.out.println("영희: 지친다.. 여기까지 하자 우리.");
					System.out.println("게임이 종료 되었습니다.");
					System.out.println("ㆍㆍㆍㆍㆍㆍㆍㆍENDㆍㆍㆍㆍㆍㆍㆍㆍ");
				}
			}
			else if ( e ==2 ) {
				System.out.println("ㆍㆍㆍㆍㆍㆍㆍㆍㆍㆍㆍㆍㆍㆍㆍㆍㆍㆍㆍㆍ");
				System.out.println("철수: 아니 내가 잘못을 했다지만 그렇다고 너도 똑같이 그러는게 어디있니?");
				System.out.println("철수: 난 더이상은 못참아 영화고 나발이고 집갈래.");
				System.out.println("철수: 미안하다고 말하면 봐준다.");
				System.out.println("영희는 어이가 없지만 그래도 고민을 해본다");
				System.out.println("");
				System.out.println("1번. 그래 미안해. 2번. 미쳣어?장난해?");
			int g= sc.nextInt();
			if ( g == 1 ) {
				System.out.println("ㆍㆍㆍㆍㆍㆍㆍㆍㆍㆍㆍㆍㆍㆍㆍㆍㆍㆍㆍㆍ");
				System.out.println("영희: 그래 미안해 우리 영화보러가자.");
				System.out.println("철수: 그래 이번에만 봐준다. 무슨영화 볼까?");
				System.out.println("영희: 멜로 영화 보러가자.");
				System.out.println("철수: 액션 영화 보고 싶지만 봐준다 그래, 멜로 보자");
				System.out.println("그렇게 둘은 행복하게 영화를 보았다.");
				System.out.println("ㆍㆍㆍㆍㆍㆍㆍㆍENDㆍㆍㆍㆍㆍㆍㆍㆍ");
			}
			else if( g==2 ) {
				System.out.println("ㆍㆍㆍㆍㆍㆍㆍㆍㆍㆍㆍㆍㆍㆍㆍㆍㆍㆍㆍㆍ");
				System.out.println("영희: 장난 나랑 하냐 지금?");
				System.out.println("영희: 다시는 연락하지말고 내 번호도 지워.");
				System.out.println("철수: ....?이게 아닌데?");
				System.out.println("");
				System.out.println("게임이 종료 되었습니다.");
				System.out.println("ㆍㆍㆍㆍㆍㆍㆍㆍENDㆍㆍㆍㆍㆍㆍㆍㆍ");
			}
			
			}
			

			else if ( e==3 ) {
				System.out.println("ㆍㆍㆍㆍㆍㆍㆍㆍㆍㆍㆍㆍㆍㆍㆍㆍㆍㆍㆍㆍ");
				System.out.println("철수: 그냥 영화나 보러가자.");
				System.out.println("영희: 영화 보기 전에 뭐 할말 없니?");
				System.out.println("철수: 응 없어.");
				System.out.println("영희: 아직도 자존심만 세구나 헤어져.");
				System.out.println("");
				System.out.println("게임이 종료 되었습니다.");
				System.out.println("ㆍㆍㆍㆍㆍㆍㆍㆍENDㆍㆍㆍㆍㆍㆍㆍㆍ");
			}
			
		}
		
		
		
		
		
		else if (c==2) {
			System.out.println("ㆍㆍㆍㆍㆍㆍㆍㆍㆍㆍㆍㆍㆍㆍㆍㆍㆍㆍㆍㆍㆍㆍ");
			System.out.println("철수는 영희와 통화를 끊고 바로 달려 나갔다.");
			System.out.println("약속장소에 도착해서.");
			System.out.println("철수: 영희야 안녕?");
			System.out.println("영희: 생각보다 일찍 왔네?");
			System.out.println("영희: 그런데 머리가 까치집이 있구나? 일찍 일어나서 씻지 그랬니?");
			System.out.println("철수는 영희가 한 말에 상처를 받아 어떻게 대답할지 고민한다.");
			System.out.println("");
			System.out.println("1번. 뭐? 기다릴까봐 바로 뛰어온 사람한테 그게 할말이니?");
			System.out.println("2번. 미안 늦잠을 자서, 기다릴까봐 바로 왔어.");
			int d = sc.nextInt();
			if(d==1) {
				System.out.println("ㆍㆍㆍㆍㆍㆍㆍㆍㆍㆍㆍㆍㆍㆍㆍㆍㆍㆍ");
				System.out.println("철수: 뭐? 바로 뛰어온 사람한테 그게 할말이냐? 난 집갈래");
				System.out.println("철수: 짜증나서 집갈래 안녕.");
				System.out.println("영희: 뭐야 방귀뀐놈이 성낸다더니.");
				System.out.println("영희: 잘가고 잘 먹고 잘살아라.");
			    System.out.println("게임이 종료되었습니다.");
			    System.out.println("ㆍㆍㆍㆍㆍㆍㆍㆍENDㆍㆍㆍㆍㆍㆍㆍㆍ");
				
			}
			else if (d ==2) {
				System.out.println("ㆍㆍㆍㆍㆍㆍㆍㆍㆍㆍㆍㆍㆍㆍㆍㆍㆍㆍㆍㆍ");
				System.out.println("철수: 미안 영희 너가 기다릴까뽜 씻지도 못했네");
				System.out.println("영희: 아니야. 괜찮아 우리 영화 예매하러 가자.");
				System.out.println("철수: 어떤영화 볼래? 나는 액션 영화가 보고싶어");
				System.out.println("영희: 그래 정신없을텐데 내가 예매할께 ");
				System.out.println("그렇게 둘은 액션 영화를 행복하게 보았습니다.");
				System.out.println("ㆍㆍㆍㆍㆍㆍㆍㆍENDㆍㆍㆍㆍㆍㆍㆍㆍ");
			}
			
		}
		
		
		
		
	}
	

}

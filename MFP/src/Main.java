//pakage QueueConcepts;
import java.io.*;
import java.util.PriorityQueue;
import java.util.Scanner;
import java.util.Collections;

public class Main {
	public static void myMerge(City[] arr,int start,int mid, int end) {
		City[] tarr=new City[end-start+1];
		int point=0;
		int i=start;
		int j=mid+1;
		while(i<=mid&&j<=end) {
			if(arr[i].score<=arr[j].score) {
				tarr[point++]=arr[i++];
			}else {
				tarr[point++]=arr[j++];
			}
		}
		while(i<=mid) {
			tarr[point++]=arr[i++];
		}
		while(j<=end) {
			tarr[point++]=arr[j++];
		}
		for(int ix=0;ix<point;++ix) {
			arr[start+ix]=tarr[ix];
		}
	}
	public static void myMergesort(City[] arr,int start, int end) {
		if(start>=end) {return;}
		int mid=(start+end)/2;
		myMergesort(arr,start,mid);
		myMergesort(arr,mid+1,end);
		myMerge(arr,start,mid,end);
	}
	public static void survey(float[] tendencies,float[] weights) {
		Scanner sc = new Scanner(System.in);
		System.out.print("1. 나는 일상이 지겹다. ");
		System.out.println("(0: 매우 아니다, 1: 아니다 2: 조금 아니다 3: 조금 그렇다 4: 그렇다 5: 매우 그렇다)");
		tendencies[0]=0.5f*sc.nextInt(); //activity
		System.out.print("2. 나는 종종 과소비를 하는 편이다. ");
		System.out.println("(0: 매우 아니다, 1: 아니다 2: 조금 아니다 3: 조금 그렇다 4: 그렇다 5: 매우 그렇다)");
		tendencies[1]=0.5f*sc.nextInt(); //budget
		System.out.print("3. 나는 추운듯한 날씨가 좋다. ");
		System.out.println("(0: 매우 아니다, 1: 아니다 2: 조금 아니다 3: 조금 그렇다 4: 그렇다 5: 매우 그렇다)");
		tendencies[2]=0.5f*(5-sc.nextInt()); //weather (reversed)
		System.out.print("4. 나는 역사에 관심이 많다. ");
		System.out.println("(0: 매우 아니다, 1: 아니다 2: 조금 아니다 3: 조금 그렇다 4: 그렇다 5: 매우 그렇다)");
		tendencies[3]=0.5f*(5-sc.nextInt()); //cultural (reversed)
		
		System.out.print("5. 주변에서 활발하다는 소리를 자주 듣는다. ");
		System.out.println("(0: 매우 아니다, 1: 아니다 2: 조금 아니다 3: 조금 그렇다 4: 그렇다 5: 매우 그렇다)");
		tendencies[0]=0.5f*sc.nextInt(); //activity
		System.out.print("6. 장학금을 받으면 예적금 혹은 투자부터 할 것이다. ");
		System.out.println("(0: 매우 아니다, 1: 아니다 2: 조금 아니다 3: 조금 그렇다 4: 그렇다 5: 매우 그렇다)");
		tendencies[1]=0.5f*(5-sc.nextInt()); //budget (reversed)
		System.out.print("7. 나는 에어컨 없으면 못산다. ");
		System.out.println("(0: 매우 아니다, 1: 아니다 2: 조금 아니다 3: 조금 그렇다 4: 그렇다 5: 매우 그렇다)");
		tendencies[2]=0.5f*sc.nextInt(); //weather
		System.out.print("8. 나는 전자기기 매니아다. ");
		System.out.println("(0: 매우 아니다, 1: 아니다 2: 조금 아니다 3: 조금 그렇다 4: 그렇다 5: 매우 그렇다)");
		tendencies[3]=0.5f*sc.nextInt(); //cultural
		
		System.out.print("9. 나는 커피없으면 못산다. ");
		System.out.println("(0: 매우 아니다, 1: 아니다 2: 조금 아니다 3: 조금 그렇다 4: 그렇다 5: 매우 그렇다)");
		tendencies[0]=0.5f*(5-sc.nextInt()); //activity (reversed)
		System.out.print("10. 나는 돈 걱정을 많이 한다. ");
		System.out.println("(0: 매우 아니다, 1: 아니다 2: 조금 아니다 3: 조금 그렇다 4: 그렇다 5: 매우 그렇다)");
		tendencies[1]=0.5f*(5-sc.nextInt()); //budget (reversed)
		System.out.print("11. 나는 겨울이 좋다. ");
		System.out.println("(0: 매우 아니다, 1: 아니다 2: 조금 아니다 3: 조금 그렇다 4: 그렇다 5: 매우 그렇다)");
		tendencies[2]=0.5f*(5-sc.nextInt()); //weather (reversed)
		System.out.print("12. 나는 트렌드에 관심이 많다. ");
		System.out.println("(0: 매우 아니다, 1: 아니다 2: 조금 아니다 3: 조금 그렇다 4: 그렇다 5: 매우 그렇다)");
		tendencies[3]=0.5f*sc.nextInt(); //cultural
		
		System.out.print("13. 여행은 쉬려고 가는 것이다. ");
		System.out.println("(0: 매우 아니다, 1: 아니다 2: 조금 아니다 3: 조금 그렇다 4: 그렇다 5: 매우 그렇다)");
		tendencies[0]=0.5f*(5-sc.nextInt()); //activity (reversed)
		System.out.print("14. 돈은 숫자일 뿐이다. ");
		System.out.println("(0: 매우 아니다, 1: 아니다 2: 조금 아니다 3: 조금 그렇다 4: 그렇다 5: 매우 그렇다)");
		tendencies[1]=0.5f*sc.nextInt(); //budget
		System.out.print("15. 나는 벌레가 싫다. ");
		System.out.println("(0: 매우 아니다, 1: 아니다 2: 조금 아니다 3: 조금 그렇다 4: 그렇다 5: 매우 그렇다)");
		tendencies[2]=0.5f*(5-sc.nextInt()); //weather (reversed)
		System.out.print("16. 여행을 가면 박물관은 꼭 간다. ");
		System.out.println("(0: 매우 아니다, 1: 아니다 2: 조금 아니다 3: 조금 그렇다 4: 그렇다 5: 매우 그렇다)");
		tendencies[3]=0.5f*(5-sc.nextInt()); //cultural (reversed)
		
		System.out.print("17. 여행에서 뷰가 중요하다. ");
		System.out.println("(0: 매우 아니다, 1: 아니다 2: 조금 아니다 3: 조금 그렇다 4: 그렇다 5: 매우 그렇다)");
		weights[0]=0.2f*sc.nextInt(); //activity weight
		System.out.print("18. 여행에서 돈관리가 중요하다. ");
		System.out.println("(0: 매우 아니다, 1: 아니다 2: 조금 아니다 3: 조금 그렇다 4: 그렇다 5: 매우 그렇다)");
		weights[1]=0.2f*sc.nextInt(); //budget weight
		System.out.print("19. 나는 날씨에 민감하다. ");
		System.out.println("(0: 매우 아니다, 1: 아니다 2: 조금 아니다 3: 조금 그렇다 4: 그렇다 5: 매우 그렇다)");
		weights[2]=0.2f*sc.nextInt(); //weather weight
		System.out.print("20. 여행 지역의 문화가 중요하다. ");
		System.out.println("(0: 매우 아니다, 1: 아니다 2: 조금 아니다 3: 조금 그렇다 4: 그렇다 5: 매우 그렇다)");
		weights[3]=0.2f*sc.nextInt(); //cultural weight
	}
	public static void main(String[] args)throws Exception  {
		Scanner sc = new Scanner(System.in);
		float userTendencies[]= {0,0,0,0};
		float weights[]= {0,0,0,0};
		String whatTest="0";
		while(true) {
			System.out.print("여행 MBTI 테스트로 나만의 여행지 알아보기 1번, 그냥 MBTI로 나만의 여행지 알아보기 2번: ");
			whatTest=sc.nextLine();
			if(whatTest.equals("1")||whatTest.equals("2")) {
				break;
			}
		}
		if(whatTest.equals("1")) {
		//travel MBTI
		survey(userTendencies,weights);
		
		String TravelMBTI="";
		String[] TMBTIDocument=new String[4];
		if(userTendencies[0]<5.0) {
			TravelMBTI+="H";
			TMBTIDocument[0]="당신은 힐링(Healing)을 좋아하고, ";
		}else {
			TravelMBTI+="T";
			TMBTIDocument[0]="당신은 돌아다니기(Tour)를 좋아하고, ";
		}if(userTendencies[1]<5.0) {
			TravelMBTI+="B";
			TMBTIDocument[1]="가성비를 챙기며(Bang for the bucks), ";
		}else {
			TravelMBTI+="L";
			TMBTIDocument[1]="FLEX 기질이 있으며(Luxury), ";
		}if(userTendencies[2]<5.0) {
			TravelMBTI+="F";
			TMBTIDocument[2]="더운 것 보다는 추운 날씨가 좋고(Frosty), ";
		}else {
			TravelMBTI+="S";
			TMBTIDocument[2]="추운 것 보다는 더운 날씨가 좋고(Scorching), ";
		}if(userTendencies[3]<5.0) {
			TravelMBTI+="C";
			TMBTIDocument[3]="역사(Classic)를 좋아하는 여행자입니다!";
		}else {
			TravelMBTI+="M";
			TMBTIDocument[3]="현대적인 것을(Mordern) 좋아하는 여행자입니다!";
		}
		System.out.println("축하합니다! 당신의 여행 MBTI는 "+TravelMBTI+" 입니다!");
		for(int i=0;i<4;++i) {
			System.out.print(TMBTIDocument[i]);
		}
		}
		//just MBTI
		else if(whatTest.equals("2")) {
			// mbtidata.csv의 절대 경로입니다. 컴퓨터마다 다르게 설정해주시기 바랍니다.  
			String mbtipath="C:\\Users\\home\\eclipse-workspace\\MFP\\src\\mbtidata.csv";
			String mbtiline="";
			String mbti="";
			Scanner scan = new Scanner(System.in);
			System.out.print("MBTI를 입력하세요: ");
			while(true) {
				
				
				mbti=scan.nextLine();
				mbti=mbti.toUpperCase();
				if(mbti.length()!=4) {
					System.out.print("MBTI를 다시 입력하세요: ");
					continue;
				}
				if(mbti.charAt(0)!='E'&&mbti.charAt(0)!='I') {
					System.out.print("MBTI를 다시 입력하세요: ");
					continue;
				}
				if(mbti.charAt(1)!='N'&&mbti.charAt(1)!='S') {
					System.out.print("MBTI를 다시 입력하세요: ");
					continue;
				}
				if(mbti.charAt(2)!='F'&&mbti.charAt(2)!='T') {
					System.out.print("MBTI를 다시 입력하세요: ");
					continue;
				}
				if(mbti.charAt(3)!='P'&&mbti.charAt(3)!='J') {
					System.out.print("MBTI를 다시 입력하세요: ");
					continue;
				}
				break;
			}
			scan.close();
			try {
				BufferedReader brmbti=new BufferedReader(new FileReader(mbtipath));
				mbtiline=brmbti.readLine();//just headings
				
				while((mbtiline=brmbti.readLine())!=null) {
					String[] values=mbtiline.split(",");
					if(!values[0].equals(mbti)) {continue;}
					for(int i=0;i<4;++i) {
					userTendencies[i]=Float.parseFloat(values[i+1]) + 2*((float)Math.random()-0.5f);
					weights[i]=1.0f+ ((float)Math.random()-0.5f);
					}
					break;
				}
			}catch (FileNotFoundException e) {
				e.printStackTrace();
			}catch (IOException e) {
				e.printStackTrace();
			}
		}
		//citydata.csv 절대경로 입니다. 컴퓨터 파일 위치에 따라서 경로를 다르게 설정해주시기 바랍니다.
		String path1="C:\\Users\\home\\eclipse-workspace\\MFP\\src\\citydata.csv";
		String line="";
		int MAXCITY=50;
		City Cities[]=new City[MAXCITY];
		try {
			BufferedReader brcity=new BufferedReader(new FileReader(path1));
			int cityIndex=0;
			line=brcity.readLine();//just headings
			while((line=brcity.readLine())!=null) {
				
				//0:cityname,1:activity,2:budget,3:weather,4:cultural,5:nation
				String[] values=line.split(",");
				//0:activity,1:budget,2:weather,3:cultural
				float tendencies[]=new float[4];
				String city=values[0];
				String nation=values[5];
				float score=0;
				for(int i=0;i<=3;++i) {
					tendencies[i]=Float.parseFloat(values[i+1]);
					float abserr=userTendencies[i]-tendencies[i];
					if(abserr<0) {
						abserr*=-1;
					}
					score=score+(weights[i] *abserr);
				}
				Cities[cityIndex]=new City(cityIndex,city,tendencies[0],tendencies[1],
						tendencies[2],tendencies[3],nation,score);
				++cityIndex;
			}
			brcity.close();
			myMergesort(Cities,0,cityIndex-1);
			System.out.println("\nBest TOP 5 LIST");
			for(int i=0;i<5;++i) {
				System.out.println("Best"+(i+1)+": "+Cities[i].cityname+", "+Cities[i].nation);
			}
			System.out.println("\nWorst TOP 5 LIST");
			for(int i=0;i<5;++i) {
				System.out.println("Worst"+(i+1)+": "+Cities[cityIndex-i-1].cityname+", "+Cities[cityIndex-i-1].nation);
			}
		}catch (FileNotFoundException e) {
			e.printStackTrace();
		}catch (IOException e) {
			e.printStackTrace();
		}
		sc.close();
	}

}

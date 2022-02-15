package edupoll;

import edupoll.actor.Hero;

public class RunMain {
	public static void main(String[] args) {
		Hero h = new Hero();
		
		h.act();
		System.out.println();
		for(int cnt=1; cnt<=5; cnt++) {
			h.act();
		}			
	}
}

/*
 만들고자 하는 어플리케이션에 Spring 을 활용하려면, Library가 필요하다
예전에는 jar 로 배포흫 했는데 배포 방식이 달라짐
외부 라이브러리를 연동해서 어플리케이션 개발할 때, maven 이나 gradle 이라는 build 방식이 일반화 되버렸기 떄문에

처음부터 maven project 로 만들지 않았기 때문에 
프로젝트 명 우클릭 후 변환한다
configure -> convert to maven project

그러고 나면 pom.xml 파일이 생성된다
이 xml 파일을 이용해서 라이브러리를 연동 할 수있다
(요즘은 외부라이브러리를 가져와서 사용하는 것을 자제하는 분위긴가봐..)
 
 mvnrepository 에서 사용가능한 라이브러리 확인
 */
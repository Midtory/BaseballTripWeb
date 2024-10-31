package com.baseballtrip.util;

import java.util.List;
import java.util.StringTokenizer;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.springframework.stereotype.Component;

@Component
public class GameScheduleCrawlingUtil {

	private final String WEB_URL = "https://www.koreabaseball.com/Schedule/Schedule.aspx";
	private String year;
	private String month;
	
	private StringTokenizer st;
	
	private final int TIME_INDEX = 0;
	private final int GAME_INDEX = 1;
	private final int STADIUM_INDEX = 6;
	private final int NOTE_INDEX = 7;
	
	public void crawlGameSchedule() {

		// 사이트 연결하기
		WebDriver driver = new ChromeDriver();
		driver.get(WEB_URL);

		// 1월부터 12월까지 경기 일정 크롤링
		year = "2024";
		for (int i = 5; i <= 5; ++i) {

			month = i + "";
			// 정규 시즌 경기 가져오기
			WebElement selectElement = driver.findElement(By.id("ddlSeries"));
			Select select = new Select(selectElement);
			// 0 시범경기 1 정규시즌 2 포스트시즌
			select.selectByIndex(1);

			// 년도 선택
			WebElement selectYear = driver.findElement(By.id("ddlYear"));
			Select selecty = new Select(selectYear);
			selecty.selectByValue(year);

			// 달 선택
			WebElement selectMonth = driver.findElement(By.id("ddlMonth"));
			Select selectm = new Select(selectMonth);
			if (month.length() == 1) {
				month = "0" + month;
			}
			selectm.selectByValue(month);

			// 달력 버전
			// 경기 가져오기
//			WebElement boxCal = driver.findElement(By.id("boxCal"));
//			List<WebElement> games = boxCal.findElements(By.tagName("td"));
//			for (WebElement game : games) {
//				if (game.getText().equals("")) {
//					continue;
//				}
//				System.out.println(i + "월" + game.getText());
//			}
//			System.out.println("---------------" + i + "월 ------------------");
			
			// 리스트 버전
			/*
			  <tbody>
			  	<tr>
			  		<td class="day">
			  		<td>
			  		<td>
			  	</tr>
			 */
			WebElement tbody = driver.findElement(By.tagName("tbody"));
			List<WebElement> trs = tbody.findElements(By.tagName("tr"));
			String day = null;
			for (WebElement tr : trs) {
				List<WebElement> tds = tr.findElements(By.tagName("td"));
				if (tds.size() == 9) {
					day = tds.get(0).getText().substring(3, 5);
					tds.remove(0);
				} 
				
				// 경기 시간
				String time = tds.get(TIME_INDEX).getText();
				
				// 경기 결과
				String awayTeam = "", homeTeam ="", awayScore="", homeScore="";
				
				List<WebElement> gameDetail = tds.get(GAME_INDEX).findElements(By.tagName("span"));
				if (gameDetail.size() == 5) {
					awayTeam = gameDetail.get(0).getText();
					awayScore = gameDetail.get(1).getText();
					homeScore = gameDetail.get(3).getText();
					homeTeam = gameDetail.get(4).getText();
				} else if (gameDetail.size() == 3 ) {
					awayTeam = gameDetail.get(0).getText();
					homeTeam = gameDetail.get(2).getText();
				}

				String stadium = tds.get(STADIUM_INDEX).getText();
				String note = tds.get(NOTE_INDEX).getText();
				
				System.out.println(month+day+time+" "+awayTeam+" "+awayScore+"vs"+homeScore+" "+homeTeam+" 구장 - " + stadium);
			}
		}
	}

	public static void main(String[] args) {
		GameScheduleCrawlingUtil util = new GameScheduleCrawlingUtil();
		util.crawlGameSchedule();
	}
}

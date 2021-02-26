package managers;

import org.openqa.selenium.WebDriver;

import base.GlobalParams;
import pageObjects.PageEnd2End;
import pageObjects.PageHome;
import pageObjects.PageCheck;

public class StartPagesMng {

	private WebDriver driver;
	public StartPagesMng(WebDriver driver) {
		this.driver=driver;}
	
	// Initialization page
	private PageEnd2End end2end;
	private PageHome home;
	private PageCheck check;
	public PageEnd2End getEnd2End() {
		return(end2end==null)?end2end=new PageEnd2End(driver):end2end;}
	public PageHome getHome() {
		return(home==null)?home=new PageHome(driver):home;}
	public PageCheck getCheck() {
		return(check==null)?check=new PageCheck(driver):check;}
	
	// Initialization base
	private GlobalParams params;
	public GlobalParams getGlobalParams() {
		return(params==null)?params=new GlobalParams():params;}
	
}

package dataProviders;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import enums.Environment;
import enums.DriversType;

public class ConfigReader {
	
	private Properties property;
	private final String pathFile="configs\\config.properties";
	private String message="Error with the file o the value. Verify >> ";
	
	public ConfigReader() {
		BufferedReader lector;
		try {
			lector=new BufferedReader(new FileReader(pathFile));
			property=new Properties();
			try {
				property.load(lector);
				lector.close();
			} catch(IOException e) {
				e.printStackTrace();}
		} catch(FileNotFoundException e) {
			e.printStackTrace();
			throw new RuntimeException(message+"ConfigReader method.");}}
	
	public String getDriverPath() {
		String rutaCHR=property.getProperty("driverPath");
		if(rutaCHR!=null) return rutaCHR;
		else throw new RuntimeException(message+"Path to the file.");}
	
	public String getWebDriver() {
		String driverCHR=property.getProperty("webdriver");
		if(driverCHR!=null) return driverCHR;
		else throw new RuntimeException(message+"WebDriver.");}
	
	public long getWaitTime() {
		String time=property.getProperty("waitTime");
		if(time!=null) return Long.parseLong(time);
		else throw new RuntimeException(message+"time wait value.");}
	
	public String getURL() {
		String url=property.getProperty("URL");
		if(url!=null) return url;
		else throw new RuntimeException(message+" URL.");}
	
	public Boolean getBrowserSize() {
		String tamaño=property.getProperty("maxWin");
		if(tamaño!=null) return Boolean.valueOf(tamaño);
		return true;}
	
	public Environment getAmbiente() {
		String scope=property.getProperty("ambiente");
		if(scope==null|| scope.equalsIgnoreCase("local")) return Environment.LOCAL;
		else if(scope.equals("remote")) return Environment.REMOTO;
		else if(scope.equalsIgnoreCase("local_api"))return Environment.LOCAL_API;
		else if(scope.equalsIgnoreCase("remoto_api"))return Environment.REMOTO_API;
		else throw new RuntimeException(message+"error wiht the environment.");}
	
	public DriversType getBrowser() {
		String driverType=property.getProperty("browser");
		if(driverType==null||driverType.equals("chrome")) return DriversType.CHROME;
		else if(driverType.equalsIgnoreCase("firefox")) return DriversType.FIREFOX;
		else if(driverType.equalsIgnoreCase("explorer")) return DriversType.INTERNETEXPLORER;
		else throw new RuntimeException(message+"error with the driver type.");}
	
	public String getConfigReporte() {
		String report=property.getProperty("reportConfigPath");
		if(report!=null)return report;
		else throw new RuntimeException(message+"Error with the Config Reporte path.");}
	
	public String getTestDataPath() {
		String testDataPath=property.getProperty("testDataPath");
		if(testDataPath!=null)return testDataPath;
		else throw new RuntimeException(message+"error test data path not specified.");}
	
}

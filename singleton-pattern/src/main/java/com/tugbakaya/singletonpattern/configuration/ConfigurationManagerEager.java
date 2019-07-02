package com.tugbakaya.singletonpattern.configuration;

public class ConfigurationManagerEager {
	
	private static ConfigurationManagerEager configurationManagerEager = new ConfigurationManagerEager();
	private String configName;

	private ConfigurationManagerEager() {
	}
	
	public static ConfigurationManagerEager getInstance()
	{
		return configurationManagerEager;
	}

	public String getConfigName() {
		return configName;
	}

	public void setConfigName(String configName) {
		this.configName = configName;
	}
	
	

}

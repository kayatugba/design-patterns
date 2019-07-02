package com.tugbakaya.singletonpattern.configuration;

public class ConfigurationManagerLazy {

	private static ConfigurationManagerLazy configurationManagerLazy;
	private String configName;

	private ConfigurationManagerLazy() {
	}
	
	public static ConfigurationManagerLazy getInstance()
	{
		if(configurationManagerLazy == null)
		{
			configurationManagerLazy = new ConfigurationManagerLazy();
		}
		return configurationManagerLazy;
	}

	public String getConfigName() {
		return configName;
	}

	public void setConfigName(String configName) {
		this.configName = configName;
	}
	
	

}

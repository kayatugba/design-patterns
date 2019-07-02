package com.tugbakaya.singletonpattern;

import com.tugbakaya.singletonpattern.configuration.ConfigurationManagerEager;
import com.tugbakaya.singletonpattern.configuration.ConfigurationManagerLazy;

public class SingletonPatternApplication {

	public static void main(String[] args) {
		System.out.println("Singleton pattern application");
		System.out.println("Lazy Config Instance");
		ConfigurationManagerLazy configurationManagerLazy = ConfigurationManagerLazy.getInstance();
		configurationManagerLazy.setConfigName("lazy config");
		System.out.println("first get config name " + configurationManagerLazy.getConfigName());
		
		ConfigurationManagerLazy configurationManagerLazy1 = ConfigurationManagerLazy.getInstance();
		System.out.println("second get config name " + configurationManagerLazy1.getConfigName());
		
		System.out.println("Eager Config Instance");
		ConfigurationManagerEager configurationManagerEager = ConfigurationManagerEager.getInstance();
		configurationManagerEager.setConfigName("eager config");
		System.out.println(configurationManagerEager.getConfigName());
		

	}

}

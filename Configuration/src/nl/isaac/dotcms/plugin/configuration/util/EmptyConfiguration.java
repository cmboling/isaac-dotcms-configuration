package nl.isaac.dotcms.plugin.configuration.util;
/**
* dotCMS Configuration plugin by ISAAC - The Full Service Internet Agency is licensed 
* under a Creative Commons Attribution 3.0 Unported License
* - http://creativecommons.org/licenses/by/3.0/
* - http://www.geekyplugins.com/
* 
* @copyright Copyright (c) 2011 ISAAC Software Solutions B.V. (http://www.isaac.nl)
*/

import nl.isaac.comp.configuration.CustomConfiguration;
import nl.isaac.dotcms.plugin.configuration.dependencies.org.apache.commons.configuration.CombinedConfiguration;

public class EmptyConfiguration extends CustomConfiguration{

	public EmptyConfiguration() {
		super(new CombinedConfiguration());
	}

}

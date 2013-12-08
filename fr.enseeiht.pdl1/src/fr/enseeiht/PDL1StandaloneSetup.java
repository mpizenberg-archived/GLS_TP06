
package fr.enseeiht;

/**
 * Initialization support for running Xtext languages 
 * without equinox extension registry
 */
public class PDL1StandaloneSetup extends PDL1StandaloneSetupGenerated{

	public static void doSetup() {
		new PDL1StandaloneSetup().createInjectorAndDoEMFRegistration();
	}
}


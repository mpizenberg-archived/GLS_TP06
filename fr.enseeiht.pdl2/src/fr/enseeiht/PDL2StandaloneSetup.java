
package fr.enseeiht;

/**
 * Initialization support for running Xtext languages 
 * without equinox extension registry
 */
public class PDL2StandaloneSetup extends PDL2StandaloneSetupGenerated{

	public static void doSetup() {
		new PDL2StandaloneSetup().createInjectorAndDoEMFRegistration();
	}
}


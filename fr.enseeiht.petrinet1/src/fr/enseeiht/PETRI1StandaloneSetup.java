
package fr.enseeiht;

/**
 * Initialization support for running Xtext languages 
 * without equinox extension registry
 */
public class PETRI1StandaloneSetup extends PETRI1StandaloneSetupGenerated{

	public static void doSetup() {
		new PETRI1StandaloneSetup().createInjectorAndDoEMFRegistration();
	}
}


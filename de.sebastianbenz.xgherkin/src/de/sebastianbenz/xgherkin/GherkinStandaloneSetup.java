/*******************************************************************************
 * Copyright (c) 2011 Sebastian Benz.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Sebastian Benz - initial API and implementation
 ******************************************************************************/
package de.sebastianbenz.xgherkin;

/**
 * Initialization support for running Xtext languages 
 * without equinox extension registry
 */
public class GherkinStandaloneSetup extends GherkinStandaloneSetupGenerated{

	public static void doSetup() {
		new GherkinStandaloneSetup().createInjectorAndDoEMFRegistration();
	}
}


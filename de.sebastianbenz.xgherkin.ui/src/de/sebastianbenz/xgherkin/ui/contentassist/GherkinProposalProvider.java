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
/*
 * generated by Xtext
 */
package de.sebastianbenz.xgherkin.ui.contentassist;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.Assignment;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.ui.editor.contentassist.ContentAssistContext;
import org.eclipse.xtext.ui.editor.contentassist.ICompletionProposalAcceptor;

import de.sebastianbenz.xgherkin.gherkin.ExampleCell;
import de.sebastianbenz.xgherkin.gherkin.ExampleRow;
import de.sebastianbenz.xgherkin.gherkin.ScenarioWithOutline;

/**
 * see
 * http://www.eclipse.org/Xtext/documentation/latest/xtext.html#contentAssist on
 * how to customize content assistant
 */
public class GherkinProposalProvider extends AbstractGherkinProposalProvider {

	@Override
	public void completeFeature_Name(EObject model, Assignment assignment,
			ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
		acceptor.accept(createCompletionProposal("Feature: ", context));
	}

	@Override
	public void completeScenario_Name(EObject model, Assignment assignment,
			ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
		acceptor.accept(createCompletionProposal("Scenario: ", context));
	}

	@Override
	public void completeScenarioWithOutline_Name(EObject model,
			Assignment assignment, ContentAssistContext context,
			ICompletionProposalAcceptor acceptor) {
		acceptor.accept(createCompletionProposal("Scenario Outline: ", context));
	}

//	@Override
//	public void completeThenStep_Desc(EObject model, Assignment assignment,
//			ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
//		acceptor.accept(createCompletionProposal("Then ", context));
//	}
//	
//	@Override
//	public void completeGivenStep_Desc(EObject model, Assignment assignment,
//			ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
//		acceptor.accept(createCompletionProposal("Given ", context));
//	}
//	
//	@Override
//	public void completeAndStep_Desc(EObject model, Assignment assignment,
//			ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
//		acceptor.accept(createCompletionProposal("And ", context));
//	}
//
//	@Override
//	public void completeWhenStep_Desc(EObject model, Assignment assignment,
//			ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
//		acceptor.accept(createCompletionProposal("When ", context));
//	}

	@Override
	public void complete_EXAMPLE_HEADING(EObject model, RuleCall ruleCall,
			ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
		acceptor.accept(createCompletionProposal("Examples: ", context));
	}

	public void complete_Step(ScenarioWithOutline model, RuleCall ruleCall,
			ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
		ExampleRow heading = model.getHeading();
		if (heading == null) {
			return;
		}
		String firstChar = calculateFirstChar(context);
		for (ExampleCell cell : heading.getCells()) {
			String cellValue = cell.getValue();
			acceptor.accept(createCompletionProposal(context.getPrefix()
					+ firstChar + cellValue + ">", cellValue, null, context));
		}
	}

	@Override
	protected boolean isValidProposal(String proposal, String prefix,
			ContentAssistContext context) {
		return true;
	}

	private String calculateFirstChar(ContentAssistContext context) {
		String prefix = context.getPrefix();
		String start = "<";
		for (int i = prefix.length() - 1; i >= 0; i--) {
			char c = prefix.charAt(i);
			if (c == '<') {
				start = "";
				break;
			}
			if (c == '>') {
				break;
			}
		}
		return start;
	}
}

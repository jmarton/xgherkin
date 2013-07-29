/**
 */
package de.sebastianbenz.xgherkin.gherkin.util;

import de.sebastianbenz.xgherkin.gherkin.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see de.sebastianbenz.xgherkin.gherkin.GherkinPackage
 * @generated
 */
public class GherkinSwitch<T> extends Switch<T>
{
  /**
   * The cached model package
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static GherkinPackage modelPackage;

  /**
   * Creates an instance of the switch.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public GherkinSwitch()
  {
    if (modelPackage == null)
    {
      modelPackage = GherkinPackage.eINSTANCE;
    }
  }

  /**
   * Checks whether this is a switch for the given package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @parameter ePackage the package in question.
   * @return whether this is a switch for the given package.
   * @generated
   */
  @Override
  protected boolean isSwitchFor(EPackage ePackage)
  {
    return ePackage == modelPackage;
  }

  /**
   * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the first non-null result returned by a <code>caseXXX</code> call.
   * @generated
   */
  @Override
  protected T doSwitch(int classifierID, EObject theEObject)
  {
    switch (classifierID)
    {
      case GherkinPackage.FEATURE:
      {
        Feature feature = (Feature)theEObject;
        T result = caseFeature(feature);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GherkinPackage.NARRATIVE_ELEMENT:
      {
        NarrativeElement narrativeElement = (NarrativeElement)theEObject;
        T result = caseNarrativeElement(narrativeElement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GherkinPackage.FREE_TEXT:
      {
        FreeText freeText = (FreeText)theEObject;
        T result = caseFreeText(freeText);
        if (result == null) result = caseNarrativeElement(freeText);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GherkinPackage.AS_A:
      {
        AsA asA = (AsA)theEObject;
        T result = caseAsA(asA);
        if (result == null) result = caseNarrativeElement(asA);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GherkinPackage.IN_ORDER_TO:
      {
        InOrderTo inOrderTo = (InOrderTo)theEObject;
        T result = caseInOrderTo(inOrderTo);
        if (result == null) result = caseNarrativeElement(inOrderTo);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GherkinPackage.IWANT_TO:
      {
        IWantTo iWantTo = (IWantTo)theEObject;
        T result = caseIWantTo(iWantTo);
        if (result == null) result = caseNarrativeElement(iWantTo);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GherkinPackage.ABSTRACT_SCENARIO:
      {
        AbstractScenario abstractScenario = (AbstractScenario)theEObject;
        T result = caseAbstractScenario(abstractScenario);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GherkinPackage.SCENARIO:
      {
        Scenario scenario = (Scenario)theEObject;
        T result = caseScenario(scenario);
        if (result == null) result = caseAbstractScenario(scenario);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GherkinPackage.SCENARIO_WITH_OUTLINE:
      {
        ScenarioWithOutline scenarioWithOutline = (ScenarioWithOutline)theEObject;
        T result = caseScenarioWithOutline(scenarioWithOutline);
        if (result == null) result = caseAbstractScenario(scenarioWithOutline);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GherkinPackage.EXAMPLE:
      {
        Example example = (Example)theEObject;
        T result = caseExample(example);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GherkinPackage.EXAMPLE_ROW:
      {
        ExampleRow exampleRow = (ExampleRow)theEObject;
        T result = caseExampleRow(exampleRow);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GherkinPackage.EXAMPLE_CELL:
      {
        ExampleCell exampleCell = (ExampleCell)theEObject;
        T result = caseExampleCell(exampleCell);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GherkinPackage.BACKGROUND:
      {
        Background background = (Background)theEObject;
        T result = caseBackground(background);
        if (result == null) result = caseAbstractScenario(background);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GherkinPackage.STEP:
      {
        Step step = (Step)theEObject;
        T result = caseStep(step);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GherkinPackage.WHEN_STEP:
      {
        WhenStep whenStep = (WhenStep)theEObject;
        T result = caseWhenStep(whenStep);
        if (result == null) result = caseStep(whenStep);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GherkinPackage.THEN_STEP:
      {
        ThenStep thenStep = (ThenStep)theEObject;
        T result = caseThenStep(thenStep);
        if (result == null) result = caseStep(thenStep);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GherkinPackage.GIVEN_STEP:
      {
        GivenStep givenStep = (GivenStep)theEObject;
        T result = caseGivenStep(givenStep);
        if (result == null) result = caseStep(givenStep);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GherkinPackage.AND_STEP:
      {
        AndStep andStep = (AndStep)theEObject;
        T result = caseAndStep(andStep);
        if (result == null) result = caseStep(andStep);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      default: return defaultCase(theEObject);
    }
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Feature</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Feature</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseFeature(Feature object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Narrative Element</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Narrative Element</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseNarrativeElement(NarrativeElement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Free Text</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Free Text</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseFreeText(FreeText object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>As A</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>As A</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAsA(AsA object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>In Order To</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>In Order To</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseInOrderTo(InOrderTo object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>IWant To</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>IWant To</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseIWantTo(IWantTo object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Abstract Scenario</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Abstract Scenario</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAbstractScenario(AbstractScenario object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Scenario</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Scenario</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseScenario(Scenario object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Scenario With Outline</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Scenario With Outline</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseScenarioWithOutline(ScenarioWithOutline object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Example</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Example</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseExample(Example object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Example Row</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Example Row</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseExampleRow(ExampleRow object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Example Cell</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Example Cell</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseExampleCell(ExampleCell object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Background</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Background</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseBackground(Background object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Step</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Step</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseStep(Step object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>When Step</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>When Step</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseWhenStep(WhenStep object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Then Step</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Then Step</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseThenStep(ThenStep object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Given Step</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Given Step</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseGivenStep(GivenStep object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>And Step</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>And Step</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAndStep(AndStep object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch, but this is the last case anyway.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject)
   * @generated
   */
  @Override
  public T defaultCase(EObject object)
  {
    return null;
  }

} //GherkinSwitch

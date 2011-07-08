/**
 * <copyright>
 * </copyright>
 *

 */
package de.sebastianbenz.xgherkin.gherkin;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see de.sebastianbenz.xgherkin.gherkin.GherkinPackage
 * @generated
 */
public interface GherkinFactory extends EFactory
{
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  GherkinFactory eINSTANCE = de.sebastianbenz.xgherkin.gherkin.impl.GherkinFactoryImpl.init();

  /**
   * Returns a new object of class '<em>Feature</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Feature</em>'.
   * @generated
   */
  Feature createFeature();

  /**
   * Returns a new object of class '<em>Narrative Element</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Narrative Element</em>'.
   * @generated
   */
  NarrativeElement createNarrativeElement();

  /**
   * Returns a new object of class '<em>Free Text</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Free Text</em>'.
   * @generated
   */
  FreeText createFreeText();

  /**
   * Returns a new object of class '<em>As A</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>As A</em>'.
   * @generated
   */
  AsA createAsA();

  /**
   * Returns a new object of class '<em>In Order To</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>In Order To</em>'.
   * @generated
   */
  InOrderTo createInOrderTo();

  /**
   * Returns a new object of class '<em>IWant To</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>IWant To</em>'.
   * @generated
   */
  IWantTo createIWantTo();

  /**
   * Returns a new object of class '<em>Abstract Scenario</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Abstract Scenario</em>'.
   * @generated
   */
  AbstractScenario createAbstractScenario();

  /**
   * Returns a new object of class '<em>Scenario</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Scenario</em>'.
   * @generated
   */
  Scenario createScenario();

  /**
   * Returns a new object of class '<em>Scenario With Outline</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Scenario With Outline</em>'.
   * @generated
   */
  ScenarioWithOutline createScenarioWithOutline();

  /**
   * Returns a new object of class '<em>Example Row</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Example Row</em>'.
   * @generated
   */
  ExampleRow createExampleRow();

  /**
   * Returns a new object of class '<em>Example Cell</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Example Cell</em>'.
   * @generated
   */
  ExampleCell createExampleCell();

  /**
   * Returns a new object of class '<em>Background</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Background</em>'.
   * @generated
   */
  Background createBackground();

  /**
   * Returns a new object of class '<em>Step</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Step</em>'.
   * @generated
   */
  Step createStep();

  /**
   * Returns a new object of class '<em>When Step</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>When Step</em>'.
   * @generated
   */
  WhenStep createWhenStep();

  /**
   * Returns a new object of class '<em>Then Step</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Then Step</em>'.
   * @generated
   */
  ThenStep createThenStep();

  /**
   * Returns a new object of class '<em>Given Step</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Given Step</em>'.
   * @generated
   */
  GivenStep createGivenStep();

  /**
   * Returns a new object of class '<em>And Step</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>And Step</em>'.
   * @generated
   */
  AndStep createAndStep();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  GherkinPackage getGherkinPackage();

} //GherkinFactory

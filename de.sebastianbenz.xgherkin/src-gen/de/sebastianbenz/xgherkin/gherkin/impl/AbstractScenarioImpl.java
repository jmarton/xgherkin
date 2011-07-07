/**
 * <copyright>
 * </copyright>
 *
 */
package de.sebastianbenz.xgherkin.gherkin.impl;

import de.sebastianbenz.xgherkin.gherkin.AbstractScenario;
import de.sebastianbenz.xgherkin.gherkin.GherkinPackage;
import de.sebastianbenz.xgherkin.gherkin.Step;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Abstract Scenario</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.sebastianbenz.xgherkin.gherkin.impl.AbstractScenarioImpl#getTags <em>Tags</em>}</li>
 *   <li>{@link de.sebastianbenz.xgherkin.gherkin.impl.AbstractScenarioImpl#getName <em>Name</em>}</li>
 *   <li>{@link de.sebastianbenz.xgherkin.gherkin.impl.AbstractScenarioImpl#getSteps <em>Steps</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AbstractScenarioImpl extends MinimalEObjectImpl.Container implements AbstractScenario
{
  /**
   * The cached value of the '{@link #getTags() <em>Tags</em>}' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTags()
   * @generated
   * @ordered
   */
  protected EList<String> tags;

  /**
   * The default value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected static final String NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected String name = NAME_EDEFAULT;

  /**
   * The cached value of the '{@link #getSteps() <em>Steps</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSteps()
   * @generated
   * @ordered
   */
  protected EList<Step> steps;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected AbstractScenarioImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return GherkinPackage.Literals.ABSTRACT_SCENARIO;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<String> getTags()
  {
    if (tags == null)
    {
      tags = new EDataTypeEList<String>(String.class, this, GherkinPackage.ABSTRACT_SCENARIO__TAGS);
    }
    return tags;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setName(String newName)
  {
    String oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GherkinPackage.ABSTRACT_SCENARIO__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Step> getSteps()
  {
    if (steps == null)
    {
      steps = new EObjectContainmentEList<Step>(Step.class, this, GherkinPackage.ABSTRACT_SCENARIO__STEPS);
    }
    return steps;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case GherkinPackage.ABSTRACT_SCENARIO__STEPS:
        return ((InternalEList<?>)getSteps()).basicRemove(otherEnd, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case GherkinPackage.ABSTRACT_SCENARIO__TAGS:
        return getTags();
      case GherkinPackage.ABSTRACT_SCENARIO__NAME:
        return getName();
      case GherkinPackage.ABSTRACT_SCENARIO__STEPS:
        return getSteps();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case GherkinPackage.ABSTRACT_SCENARIO__TAGS:
        getTags().clear();
        getTags().addAll((Collection<? extends String>)newValue);
        return;
      case GherkinPackage.ABSTRACT_SCENARIO__NAME:
        setName((String)newValue);
        return;
      case GherkinPackage.ABSTRACT_SCENARIO__STEPS:
        getSteps().clear();
        getSteps().addAll((Collection<? extends Step>)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case GherkinPackage.ABSTRACT_SCENARIO__TAGS:
        getTags().clear();
        return;
      case GherkinPackage.ABSTRACT_SCENARIO__NAME:
        setName(NAME_EDEFAULT);
        return;
      case GherkinPackage.ABSTRACT_SCENARIO__STEPS:
        getSteps().clear();
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case GherkinPackage.ABSTRACT_SCENARIO__TAGS:
        return tags != null && !tags.isEmpty();
      case GherkinPackage.ABSTRACT_SCENARIO__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case GherkinPackage.ABSTRACT_SCENARIO__STEPS:
        return steps != null && !steps.isEmpty();
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (tags: ");
    result.append(tags);
    result.append(", name: ");
    result.append(name);
    result.append(')');
    return result.toString();
  }

} //AbstractScenarioImpl

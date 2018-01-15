

/* First created by JCasGen Wed Dec 06 20:14:10 MSK 2017 */
package imported.model;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import org.apache.uima.jcas.tcas.Annotation;


/** 
 * Updated by JCasGen Wed Dec 06 20:14:10 MSK 2017
 * XML source: D:/SPB_Data/git/CommandAnnotator/CommandAnnotator/typesystem/typeSystemDescriptor.xml
 * @generated */
public class CommandAnnotation extends Annotation {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(CommandAnnotation.class);
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int type = typeIndexID;
  /** @generated
   * @return index of the type  
   */
  @Override
  public              int getTypeIndexID() {return typeIndexID;}
 
  /** Never called.  Disable default constructor
   * @generated */
  protected CommandAnnotation() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated
   * @param addr low level Feature Structure reference
   * @param type the type of this Feature Structure 
   */
  public CommandAnnotation(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated
   * @param jcas JCas to which this Feature Structure belongs 
   */
  public CommandAnnotation(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated
   * @param jcas JCas to which this Feature Structure belongs
   * @param begin offset to the begin spot in the SofA
   * @param end offset to the end spot in the SofA 
  */  
  public CommandAnnotation(JCas jcas, int begin, int end) {
    super(jcas);
    setBegin(begin);
    setEnd(end);
    readObject();
  }   

  /** 
   * <!-- begin-user-doc -->
   * Write your own initialization here
   * <!-- end-user-doc -->
   *
   * @generated modifiable 
   */
  private void readObject() {/*default - does nothing empty block */}
     
 
    
  //*--------------*
  //* Feature: building

  /** getter for building - gets 
   * @generated
   * @return value of the feature 
   */
  public String getBuilding() {
    if (CommandAnnotation_Type.featOkTst && ((CommandAnnotation_Type)jcasType).casFeat_building == null)
      jcasType.jcas.throwFeatMissing("building", "ru.bmstu.iu3.CommandAnnotation");
    return jcasType.ll_cas.ll_getStringValue(addr, ((CommandAnnotation_Type)jcasType).casFeatCode_building);}
    
  /** setter for building - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setBuilding(String v) {
    if (CommandAnnotation_Type.featOkTst && ((CommandAnnotation_Type)jcasType).casFeat_building == null)
      jcasType.jcas.throwFeatMissing("building", "ru.bmstu.iu3.CommandAnnotation");
    jcasType.ll_cas.ll_setStringValue(addr, ((CommandAnnotation_Type)jcasType).casFeatCode_building, v);}    
  }

    
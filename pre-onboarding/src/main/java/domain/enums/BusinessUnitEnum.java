/**
 * 
 */
package domain.enums;

/**
 * @author himanshu.chaturvedi
 *
 */
public enum BusinessUnitEnum {

	BusinessUnit1(1), BusinessUnit2(2), BusinessUnit3(3), BusinessUnit4(4), BusinessUnit5(5);
    
    private final Integer code;
    
    private BusinessUnitEnum(Integer code) {
          this.code = code;
 }

 public static BusinessUnitEnum getValue(String value) {
     return BusinessUnitEnum.valueOf(value);
 }
 
 public Integer getCode(){
    return code;
 }
	
}

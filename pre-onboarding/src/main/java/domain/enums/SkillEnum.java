/**
 * 
 */
package domain.enums;

/**
 * @author himanshu.chaturvedi
 *
 */
public enum SkillEnum {

	MicrosoftAzure(1), Skill2(2), Skill3(3);
    
    private final Integer code;
    
    private SkillEnum(Integer code) {
          this.code = code;
 }

 public static SkillEnum getValue(String value) {
     return SkillEnum.valueOf(value);
 }
 
 public Integer getCode(){
    return code;
 }
    
	
}

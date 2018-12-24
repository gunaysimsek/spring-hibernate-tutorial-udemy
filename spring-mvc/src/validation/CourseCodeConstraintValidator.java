package validation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import java.lang.annotation.Annotation;

public class CourseCodeConstraintValidator implements ConstraintValidator<CourseCode,String> {

    private String[] coursePrefixes;

    @Override
    public void initialize(CourseCode constraintAnnotation) {

        coursePrefixes = constraintAnnotation.value();

    }

    @Override
    public boolean isValid(String s, ConstraintValidatorContext constraintValidatorContext) {

        boolean result = false;

        if (s != null) {

            for(String tempPrefix : coursePrefixes){
                result = s.startsWith(tempPrefix);
                if(result){
                    break;
                }
            }
        }else {
            result=true;
        }
        return result;
    }
}

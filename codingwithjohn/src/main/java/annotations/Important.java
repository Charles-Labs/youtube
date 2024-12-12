package annotations;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
public @interface Important {
    public String howImportant() default "Normal.";
    public boolean iMatter() default false;
}

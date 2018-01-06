package spittr.model.validator;


import org.apache.commons.lang3.StringUtils;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;
import spittr.model.Book;

/**
 * Created by lssemail on 2018/1/5.
 */
public class BookValidator implements Validator {

    @Override
    public boolean supports(Class<?> aClass) {

        return Book.class.equals(aClass);
    }

    @Override
    public void validate(Object o, Errors errors) {

        ValidationUtils.rejectIfEmpty(errors, "title", null, "标题不能为空");
        Book book = (Book) o;
        if(StringUtils.isEmpty(book.getAuthor())){
            errors.rejectValue("author", null, "作者不能为空");
        }
    }
}

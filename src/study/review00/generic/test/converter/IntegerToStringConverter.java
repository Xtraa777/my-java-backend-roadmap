package study.review00.generic.test.converter;

public class IntegerToStringConverter implements Converter<Integer, String> {
    @Override
    public String convert(Integer input) {
        return input.toString();
    }
}
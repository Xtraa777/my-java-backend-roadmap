package study.review00.generic.test.converter;

public interface Converter<I, O> {
    O convert(I input);
}
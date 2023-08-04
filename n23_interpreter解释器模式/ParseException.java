/**
 * 解释器模式异常类
 *
 * ParseException 是解释器模式中的自定义异常类，用于在解析过程中抛出异常情况。
 */
package n23_interpreter解释器模式;

public class ParseException extends Exception {
    public ParseException(String msg) {
        super(msg);
    }
}

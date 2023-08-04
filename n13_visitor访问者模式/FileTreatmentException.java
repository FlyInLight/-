/**
 * 组合模式 - FileTreatmentException异常类
 *
 * FileTreatmentException是一个自定义的异常类，用于在组合模式中处理文件操作时抛出异常。
 */
package n13_visitor访问者模式;

public class FileTreatmentException extends RuntimeException {
    public FileTreatmentException() {
        super();
    }

    public FileTreatmentException(String message) {
        super(message);
    }
}

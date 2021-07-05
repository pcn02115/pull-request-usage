package practice.Exception;

public class BizException extends RuntimeException {
    public BizException(String message) {
        super(message);
    }

    public BizException(Exception ex) {
        super(ex);
    }
}

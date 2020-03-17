package practice.Exception.myException;

class ExException {
    public static void main(String[] args) {
        try {
            startInstall();
            copyFiles();
        } catch (SpaceException se) {
            System.out.println("에러 메세지: " + se.getMessage());
            se.printStackTrace();
            System.out.println("용량 확보 후 다시 설치");
        } catch (MemoryException me) {
            System.out.println("에러 메세지: " + me.getMessage());
            me.printStackTrace();
            System.gc();
            System.out.println("다시 설치");
        } finally {
            deleteTempFiles();
        }
    }

    private static void deleteTempFiles() {
    }

    private static void startInstall() throws SpaceException, MemoryException {
        if (!enoughSpace())
            throw new SpaceException("설치 공간 부족");
        if (!enoughMemory())
            throw new MemoryException("메모리 부족");
    }

    private static boolean enoughMemory() {
        return true;
    }

    private static boolean enoughSpace() {
        return false;
    }

    private static void copyFiles() {
    }

}
class SpaceException extends Exception {
    SpaceException(String msg) {
        super(msg);
    }
}
class MemoryException extends Exception {
    MemoryException(String msg) {
        super(msg);
    }
}

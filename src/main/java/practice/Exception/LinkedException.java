package practice.Exception;

public class LinkedException {
    public static void main(String[] args) {
        try {
            install();
        } catch (InstallException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static void install() throws InstallException {
        try {
            startInstall();
            copyFiles();
        } catch (SpaceException2 e) {
            InstallException ie = new InstallException("설치 중 예외발생");
            ie.initCause(e);
            throw ie;
        } catch (MemoryException2 me) {
            InstallException ie = new InstallException("설치 중 예외발생");
            ie.initCause(me);
            throw ie;
        } finally {
            deleteTempFiles();
        }
    }

    private static void deleteTempFiles() {
    }

    private static void copyFiles() {
    }

    private static void startInstall() throws SpaceException2, MemoryException2 {
        if (!enoughSpace()) {
            throw new SpaceException2("설치 공간 부족");
        }

        if (!enoughMemory()) {
            throw new MemoryException2("메모리 부족");
//            throw new RuntimeException(new MemoryException2("메모리 부족"));

        }
    }

    private static boolean enoughMemory() {
        return true;
    }

    private static boolean enoughSpace() {
        return false;
    }

    private static class InstallException extends Exception {
        InstallException(String msg) {
            super(msg);
        }
    }

    private static class SpaceException2 extends Exception {
        SpaceException2(String msg) {
            super(msg);
        }
    }

    private static class MemoryException2 extends Exception {
        MemoryException2(String msg) {
            super(msg);
        }
    }
}

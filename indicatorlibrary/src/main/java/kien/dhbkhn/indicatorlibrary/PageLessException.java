package kien.dhbkhn.indicatorlibrary;

/**
 * Created by KienDepTrai on 21/01/2018.
 */

public class PageLessException extends Exception {

    @Override
    public String getMessage() {
        return "Pages must equal or larger than 2!";
    }
}

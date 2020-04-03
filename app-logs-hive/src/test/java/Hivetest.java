import org.junit.Test;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @Author Lixin
 * @Version 2020/3/4-03-2020-11:27
 */
public class Hivetest {
    public static void main(String[] args) {

    }
    @Test
    public void testStartTime(){
        Date d=new Date();
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy/MM/dd/HH:mm:ss");
        System.out.print(sdf.format(d));
        System.out.print(d.getTime());
    }
}

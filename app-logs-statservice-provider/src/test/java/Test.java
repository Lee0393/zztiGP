import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;

/**
 * @Author Lixin
 * @Version 2020/4/4-04-2020-12:25
 */
public class Test {
    @org.junit.Test
    public void testConn() throws SQLException {
        ApplicationContext ac = new ClassPathXmlApplicationContext("beans.xml");
        DataSource ds = (DataSource) ac.getBean("dataSource");
        Connection conn = ds.getConnection();
        System.out.print(conn);
    }
}

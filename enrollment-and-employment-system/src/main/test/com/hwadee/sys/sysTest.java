package main.test.com.hwadee.sys;
import com.hwadee.enroll_employ_sys.entity.User;
import com.hwadee.enroll_employ_sys.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath*:springmvc*.xml")
public class sysTest {
    @Autowired
    private UserService userService;

    @Test
    public void testFindUser(){
        User user = userService.findById("12");
        System.out.println(user);
    }
}


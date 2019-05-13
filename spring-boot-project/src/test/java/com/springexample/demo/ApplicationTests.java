package com.springexample.demo;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import com.springexample.model.UserRepository;
import com.springexample.model.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ApplicationTests {

    @Autowired
    UserRepository userRepository;
    @Test
    public void contextLoads() {
        User user = new User(1,"name");
        userRepository.save(user);
        User user1 = userRepository.findUserById(user.getId());
        assertNotNull(user1);
        assertEquals(user.getName(),user1.getName());
    }

}

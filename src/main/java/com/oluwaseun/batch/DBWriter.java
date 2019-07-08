package com.oluwaseun.batch;

import com.oluwaseun.model.User;
import com.oluwaseun.repository.UserRepository;
import org.springframework.batch.item.ItemWriter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class DBWriter implements ItemWriter<User> {

    @Autowired
    private UserRepository userRepository;

    @Override
    public void write(List<? extends User> users) throws Exception {

        System.out.println("data was successfully saved for: "+users);
        userRepository.save(users);

    }
}

package web.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import web.dao.UserDao;
import web.dao.UserDaoImpl;
import web.models.User;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Transactional(readOnly = true)
    public List<User> index() {
        return userDao.index();
    }

    @Transactional
    public User show(int id) {
        return userDao.show(id);

    }
    @Transactional
    public void save(User user) {
        userDao.save(user);
    }
    @Transactional
    public void update(int id, User updatedUser) {
        userDao.update(id, updatedUser);

    }
    @Transactional
    public void delete(int id) {
        userDao.delete(id);
    }
}

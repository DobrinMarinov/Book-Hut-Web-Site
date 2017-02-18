package servicesImpl;

import entities.User;
import models.bindingModels.LoginModel;
import org.modelmapper.ModelMapper;
import repositories.UserRepository;
import repositoriesImpl.UserRepositoryImpl;
import services.UserService;

public class UserServiceImpl implements UserService {

    private UserRepository userRepository;

    public UserServiceImpl() {
        this.userRepository = UserRepositoryImpl.getInstance();
    }

    @Override
    public void createUser(LoginModel loginModel) {
        ModelMapper modelMapper = new ModelMapper();
        User user = modelMapper.map(loginModel, User.class);
        this.userRepository.createUser(user);
    }

    @Override
    public LoginModel findByUsernameAndPassword(String username, String password) {
        User user = this.userRepository.findByUsernameAndPassword(username, password);
        ModelMapper modelMapper = new ModelMapper();
        LoginModel loginModel = null;
        if(user != null) {
            loginModel = modelMapper.map(user, LoginModel.class);
        }

        return loginModel;
    }
}

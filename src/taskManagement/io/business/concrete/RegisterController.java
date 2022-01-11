package taskManagement.io.business.concrete;

import taskManagement.io.business.abstracts.RegisterRepository;
import taskManagement.io.dataAccess.concretes.UserModel;
import taskManagement.io.entity.concretes.dto.RegisterFormInfo;

public class RegisterController implements RegisterRepository {

    private UserModel userModel;

    @Override
    public boolean register(final RegisterFormInfo info) {
//        String s ="";
//        userModel.insertUser(info,s);
        return false;
    }
}

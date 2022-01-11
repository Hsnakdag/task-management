package taskManagement.io.business.abstracts;

import taskManagement.io.entity.concretes.dto.RegisterFormInfo;

public interface RegisterRepository {
    public boolean register(RegisterFormInfo info);
}

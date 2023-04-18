package metel.salem.api.user.service;

import lombok.RequiredArgsConstructor;
import metel.salem.api.dto.AdminUserDto;
import metel.salem.api.user.mapper.AdminUserMapper;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AdminUserService {

    private final AdminUserMapper mapper;

    public AdminUserDto selectAdminLoginInfo(AdminUserDto adminUserDto){
        return mapper.selectAdminLoginInfo(adminUserDto);
    }

}

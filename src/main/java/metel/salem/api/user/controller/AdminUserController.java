package metel.salem.api.user.controller;

import lombok.RequiredArgsConstructor;
import metel.salem.api.base.ApiResponse;
import metel.salem.api.base.ResponseDto;
import metel.salem.api.dto.AdminUserDto;
import metel.salem.api.user.service.AdminUserService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("admin-user")
@RequiredArgsConstructor
public class AdminUserController {

    private final AdminUserService service;

    @ResponseBody
    @PostMapping("/login")
    public ResponseDto<AdminUserDto> getAdminLoginInfo(@RequestBody AdminUserDto adminUserDto){
        AdminUserDto info = service.selectAdminLoginInfo(adminUserDto);
        if(info == null){
            return ApiResponse.Error("해당 사용자가 없습니다. 다시 입력하여 주십시요", null);
        }
        return ApiResponse.Success(info);
    }

}

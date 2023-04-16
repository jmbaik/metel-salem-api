package metel.salem.api.intro.controller;

import lombok.RequiredArgsConstructor;
import metel.salem.api.base.ApiResponse;
import metel.salem.api.base.ResponseDto;
import metel.salem.api.dto.AdminUserDto;
import metel.salem.api.intro.service.AdminUserService;
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
        return ApiResponse.Success(info);
    }

}

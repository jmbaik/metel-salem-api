package metel.salem.api.intro.controller;

import lombok.RequiredArgsConstructor;
import metel.salem.api.dto.AreaCodeDto;
import metel.salem.api.dto.IntroDto;
import metel.salem.api.intro.service.IntroService;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;

@RestController
@RequestMapping("intro")
@RequiredArgsConstructor
public class IntroController {

    private final IntroService service;

    @ResponseBody
    @GetMapping("/{cCode}/{opt}")
    public List<IntroDto> getIntroList(@PathVariable("cCode") String cCode, @PathVariable("opt") String opt){

        HashMap<String, Object> map = new HashMap<>();
        map.put("cCode", cCode);
        map.put("opt", opt);
        List<IntroDto> list = service.selectIntroList(map);
        return list;
    }

    @ResponseBody
    @GetMapping("/area-code")
    public List<AreaCodeDto> getAreaCode(){
        List<AreaCodeDto> list = service.selectAreaCode();
        return list;
    }

}

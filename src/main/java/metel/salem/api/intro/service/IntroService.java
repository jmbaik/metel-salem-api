package metel.salem.api.intro.service;

import lombok.RequiredArgsConstructor;
import metel.salem.api.dto.AreaCodeDto;
import metel.salem.api.dto.IntroDto;
import metel.salem.api.intro.mapper.IntroMapper;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;

@Service
@RequiredArgsConstructor
public class IntroService {
    private final IntroMapper mapper;

    public List<IntroDto> selectIntroList(HashMap<String, Object> map){
        return mapper.selectIntroList(map);
    }
    public List<AreaCodeDto> selectAreaCode(){
        return mapper.selectAreaCode();
    }
}

package metel.salem.api.video.service;


import lombok.RequiredArgsConstructor;
import metel.salem.api.dto.VideoDto;
import metel.salem.api.video.mapper.VideoMapper;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;

@Service
@RequiredArgsConstructor
public class VideoService {
    private final VideoMapper mapper;

    public List<VideoDto> selectVideoList(HashMap<String, Object> params){
        return mapper.selectVideoList(params);
    }

    public int saveVideoClip(VideoDto videoDto){
        return mapper.saveVideoClip(videoDto);
    }
    public int deleteVideoClip(VideoDto videoDto){
        return mapper.deleteVideoClip(videoDto);
    }

}

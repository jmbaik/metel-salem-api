package metel.salem.api.video.mapper;

import metel.salem.api.dto.VideoDto;
import org.apache.ibatis.annotations.Mapper;

import java.util.HashMap;
import java.util.List;

@Mapper
public interface VideoMapper {
    List<VideoDto> selectVideoList(HashMap<String, Object> params);

    int saveVideoClip(VideoDto videoDto);

    int deleteVideoClip(VideoDto videoDto);
}

package example.src.mooc.video.domain;

import example.src.mooc.shared.domain.video.VideoId;

public interface VideoRepository {

	public void save(Video video);

	public Video search(VideoId videoId);

}

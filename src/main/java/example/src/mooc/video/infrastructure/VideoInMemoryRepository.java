package example.src.mooc.video.infrastructure;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Component;

import example.src.mooc.shared.domain.video.VideoId;
import example.src.mooc.video.domain.Video;

import example.src.mooc.video.domain.VideoRepository;

@Component
public final class VideoInMemoryRepository implements VideoRepository {

	private final Map<String, Video> inMemory;

	public VideoInMemoryRepository() {
		this.inMemory = new HashMap<String, Video>();
	}

	public void save(final Video video) {
		inMemory.put(video.id().value(), video);
	}

	@Override
	public Video search(final VideoId videoId) {
		return inMemory.get(videoId.value());
	}

}

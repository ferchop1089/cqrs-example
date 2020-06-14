package example.src.mooc.videolike.infrastructure;

import java.util.HashMap;
import java.util.Map;

import example.src.mooc.videolike.model.VideoLike;
import example.src.mooc.videolike.model.VideoLikeRepository;

public final class VideoLikeInMemoryRepository implements VideoLikeRepository {

	private final Map<String, VideoLike> inMemory;

	public VideoLikeInMemoryRepository() {
		this.inMemory = new HashMap<String, VideoLike>();
	}

	@Override
	public void save(final VideoLike videoLike) {
		inMemory.put(videoLike.videoLikeId(), videoLike);
		System.out.println("Video like created.");
	}
}

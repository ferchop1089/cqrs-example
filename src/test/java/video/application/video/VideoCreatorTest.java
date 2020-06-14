package video.application.video;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.never;
import static org.mockito.Mockito.only;
import static org.mockito.Mockito.verify;

import org.junit.jupiter.api.Test;

/*import example.application.video.VideoCreator;
import example.domain.bus.event.EventBus;
import example.domain.exception.EmptyException;
import example.domain.exception.RequiredException;
import example.domain.model.valueobject.VideoDescription;
import example.domain.model.valueobject.VideoId;
import example.domain.model.valueobject.VideoTitle;
import example.domain.port.repository.VideoRepository;*/

public class VideoCreatorTest {

	/*
	 * @Test public void When_create_video_is_ok() { VideoId videoId = new
	 * VideoId("Xo0DEa01G8E4545"); VideoTitle title = new VideoTitle("title");
	 * VideoDescription description = new VideoDescription("description"); EventBus
	 * event = mock(EventBus.class); doNothing().when(event).publish(any());
	 * VideoRepository videoRepository = mock(VideoRepository.class);
	 * doNothing().when(videoRepository).save(any()); VideoCreator createVideo = new
	 * VideoCreator(videoRepository, event);
	 * 
	 * createVideo.create(videoId, title, description);
	 * 
	 * verify(videoRepository, only()).save(any()); verify(event,
	 * only()).publish(any()); }
	 */

	/*
	 * @Test public void When_title_is_null_then_should_return_error() { VideoId
	 * videoId = new VideoId("Xo0DEa01G8E4545"); String title = null; String
	 * description = "description"; String expected = "the title is required";
	 * EventBus event = mock(EventBus.class); VideoRepository videoRepository =
	 * mock(VideoRepository.class); VideoCreator createVideo = new
	 * VideoCreator(videoRepository, event);
	 * 
	 * try { createVideo.create(videoId, title, description); fail(); } catch
	 * (RequiredException e) { assertEquals(expected, e.getMessage());
	 * verify(videoRepository, never()).save(any()); verify(event,
	 * never()).publish(any()); } }
	 * 
	 * @Test public void When_title_is_empty_then_should_return_error() { VideoId
	 * videoId = new VideoId("Xo0DEa01G8E4545"); String title = ""; String
	 * description = "description"; String expected = "the title is empty"; EventBus
	 * event = mock(EventBus.class); VideoRepository videoRepository =
	 * mock(VideoRepository.class); VideoCreator createVideo = new
	 * VideoCreator(videoRepository, event);
	 * 
	 * try { createVideo.create(videoId, title, description); fail(); } catch
	 * (EmptyException e) { assertEquals(expected, e.getMessage());
	 * verify(videoRepository, never()).save(any()); verify(event,
	 * never()).publish(any()); } }
	 * 
	 * @Test public void When_description_is_null_then_should_return_error() {
	 * VideoId videoId = new VideoId("Xo0DEa01G8E4545"); String title = "title";
	 * String description = null; String expected = "the description is required";
	 * EventBus event = mock(EventBus.class); VideoRepository videoRepository =
	 * mock(VideoRepository.class); VideoCreator createVideo = new
	 * VideoCreator(videoRepository, event);
	 * 
	 * try { createVideo.create(videoId, title, description); fail(); } catch
	 * (RequiredException e) { assertEquals(expected, e.getMessage());
	 * verify(videoRepository, never()).save(any()); verify(event,
	 * never()).publish(any()); } }
	 * 
	 * @Test public void When_description_is_empty_then_should_return_error() {
	 * VideoId videoId = new VideoId("Xo0DEa01G8E4545"); String title = "title";
	 * String description = ""; String expected = "the description is empty";
	 * EventBus event = mock(EventBus.class); VideoRepository videoRepository =
	 * mock(VideoRepository.class); VideoCreator createVideo = new
	 * VideoCreator(videoRepository, event);
	 * 
	 * try { createVideo.create(videoId, title, description); fail(); } catch
	 * (EmptyException e) { assertEquals(expected, e.getMessage());
	 * verify(videoRepository, never()).save(any()); verify(event,
	 * never()).publish(any()); } }
	 */

}

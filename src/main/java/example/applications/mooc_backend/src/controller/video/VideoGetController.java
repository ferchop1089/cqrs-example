package example.applications.mooc_backend.src.controller.video;

import org.springframework.http.HttpStatus;
import org.springframework.util.MimeTypeUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import example.application.video.VideoResult;
import example.application.video.find.VideoFindQuery;
import example.domain.bus.query.Query;
import example.domain.bus.query.QueryBus;
import example.domain.bus.query.Result;

@RestController
@RequestMapping("/example-cqrs/video")
public final class VideoGetController {

	private final QueryBus queryBus;

	public VideoGetController(final QueryBus queryBus) {
		this.queryBus = queryBus;
	}

	@GetMapping(value = "/{video_id}", produces = MimeTypeUtils.APPLICATION_JSON_VALUE)
	@ResponseStatus(code = HttpStatus.ACCEPTED)
	public VideoFindResponse find(@PathVariable("video_id") final String videoId) {
		final Result result = queryBus.ask(mapper(videoId));

		return mapper((VideoResult) result);
	}

	private Query mapper(final String videoId) {
		return new VideoFindQuery(videoId);
	}

	private VideoFindResponse mapper(final VideoResult result) {
		final VideoFindResponse response = new VideoFindResponse();
		response.setVideoId(result.getVideoId());
		response.setTitle(result.getTitle());
		response.setDescription(result.getDescription());

		return response;
	}

}

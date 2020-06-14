package example.applications.mooc_backend.src.controller.videolike;

import org.springframework.util.MimeTypeUtils;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import example.application.videolike.VideoLikeCreateCommand;
import example.domain.bus.command.Command;
import example.domain.bus.command.CommandBus;

@RestController
@RequestMapping("/example-cqrs/video/like")
public final class VideoLikePostController {

	private final CommandBus commandBus;

	public VideoLikePostController(final CommandBus commandBus) {
		this.commandBus = commandBus;
	}

	@PostMapping(produces = MimeTypeUtils.APPLICATION_JSON_VALUE)
	public void like(@RequestBody final VideoLikeCreateRequest videoLike) {
		commandBus.dispatch(mapper(videoLike));
	}

	private Command mapper(final VideoLikeCreateRequest videoLike) {
		return new VideoLikeCreateCommand(videoLike.getVideoLikeId(), videoLike.getVideoId(), videoLike.getUserId());
	}

}

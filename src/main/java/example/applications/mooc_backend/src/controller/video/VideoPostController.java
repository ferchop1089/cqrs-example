package example.applications.mooc_backend.src.controller.video;

import org.springframework.http.HttpStatus;
import org.springframework.util.MimeTypeUtils;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import example.application.video.VideoCreateCommand;
import example.domain.bus.command.Command;
import example.domain.bus.command.CommandBus;

@RestController
@RequestMapping("/example-cqrs/video")
public final class VideoPostController {

	private final CommandBus commandBus;

	public VideoPostController(final CommandBus commandBus) {
		this.commandBus = commandBus;
	}

	@PostMapping(produces = MimeTypeUtils.APPLICATION_JSON_VALUE)
	@ResponseStatus(code = HttpStatus.CREATED)
	public void create(@RequestBody final VideoCreateRequest video) {
		commandBus.dispatch(mapper(video));
	}

	private Command mapper(final VideoCreateRequest video) {
		return new VideoCreateCommand(video.getVideoId(), video.getTitle(), video.getDescription());
	}

}

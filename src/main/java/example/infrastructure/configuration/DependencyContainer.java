package example.infrastructure.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import example.application.video.VideoCreateCommand;

import example.application.video.VideoCreatorCommandHandler;
import example.application.video.find.VideoFindQuery;
import example.application.video.find.VideoFinder;
import example.application.video.find.VideoFinderQueryHandler;
import example.application.videolike.VideoLikeCreateCommand;
import example.application.videolike.VideoLikeCreator;
import example.application.videolike.VideoLikeCreatorCommandHandler;
import example.domain.bus.command.CommandBus;
import example.domain.bus.command.CommandHandler;
import example.domain.bus.query.QueryBus;
import example.domain.bus.query.QueryHandler;
import example.domain.port.repository.VideoLikeRepository;
import example.infrastructure.bus.SyncCommandBus;
import example.infrastructure.bus.SyncQueryBus;
import example.infrastructure.bus.VideoInMemoryEventBus;
import example.infrastructure.repository.video.VideoLikeInMemoryRepository;
import example.src.mooc.video.application.VideoCreator;
import example.src.mooc.video.domain.VideoRepository;
import example.src.mooc.video.infrastructure.VideoInMemoryRepository;
import example.src.shared.domain.EventBus;

@Configuration
public class DependencyContainer {

	@Bean
	public VideoRepository injectVideoRepository() {
		return new VideoInMemoryRepository();
	}

	@Bean
	public EventBus injectVideoInMemoryEventBus() {
		return new VideoInMemoryEventBus();
	}

	@Bean
	public VideoCreator injectVideoCreator(VideoRepository videoRepository, EventBus eventBus) {
		return new VideoCreator(videoRepository, eventBus);
	}

	@Bean
	public VideoLikeRepository injectVideoLikeRepository() {
		return new VideoLikeInMemoryRepository();
	}

	@Bean
	public VideoLikeCreator injectVideoLikeCreator(VideoLikeRepository videoLikeRepository, EventBus eventBus) {
		return new VideoLikeCreator(videoLikeRepository, eventBus);
	}

	@Bean(name = "videoLikeCreatorCommandHandler")
	public CommandHandler injectVideoLikeCreatorCommandHandler(VideoLikeCreator videoLikeCreator) {
		return new VideoLikeCreatorCommandHandler(videoLikeCreator);
	}

	@Bean(name = "videoCreatorCommandHandler")
	public CommandHandler injectVideoCreatorCommandHandler(VideoCreator videoCreator) {
		return new VideoCreatorCommandHandler(videoCreator);
	}

	@Bean(name = "syncCommandBus")
	public CommandBus injectSyncCommandBus(CommandHandler videoCreatorCommandHandler,
			CommandHandler videoLikeCreatorCommandHandler) {
		SyncCommandBus commandBus = new SyncCommandBus();
		commandBus.register(VideoCreateCommand.class.getName(), videoCreatorCommandHandler);
		commandBus.register(VideoLikeCreateCommand.class.getName(), videoLikeCreatorCommandHandler);
		return commandBus;
	}

	@Bean
	public VideoFinder injectVideoFinder(VideoRepository videoRepository) {
		return new VideoFinder(videoRepository);
	}

	@Bean(name = "videoFinderQueryHandler")
	public QueryHandler injectVideoFinderQueryHandler(VideoFinder videoFinder) {
		return new VideoFinderQueryHandler(videoFinder);
	}

	@Bean(name = "syncQueryBus")
	public QueryBus injectSyncQuerydBus(QueryHandler videoFinderQueryHandler) {
		SyncQueryBus queryBus = new SyncQueryBus();
		queryBus.register(VideoFindQuery.class.getName(), videoFinderQueryHandler);
		return queryBus;
	}

}

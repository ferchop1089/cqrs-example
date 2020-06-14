package example.infrastructure.bus;

import java.util.HashMap;
import java.util.Map;

import example.domain.bus.query.Query;
import example.domain.bus.query.QueryBus;
import example.domain.bus.query.QueryHandler;
import example.domain.bus.query.Result;

public final class SyncQueryBus implements QueryBus {

	private final Map<String, QueryHandler> queries;

	public SyncQueryBus() {
		this.queries = new HashMap<>();
	}

	public final void register(String nameQuery, QueryHandler query) {
		this.queries.put(nameQuery, query);
	}

	@Override
	public Result ask(Query query) {
		QueryHandler queryHandler = queries.get(query.getClass().getName());

		return queryHandler.handler(query);
	}

}

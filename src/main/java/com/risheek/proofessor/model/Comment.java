package com.risheek.proofessor.model;

import java.time.LocalDateTime;

public record Comment(String content, LocalDateTime timestamp, Entity entity) {
	public enum Entity {
		CHAMPION,
		PLAYER
	}
}

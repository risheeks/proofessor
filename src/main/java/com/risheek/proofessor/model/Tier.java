package com.risheek.proofessor.model;

public enum Tier {
	UNRANKED,
	IRON,
	BRONZE,
	SILVER,
	GOLD,
	PLATINUM,
	EMERALD,
	DIAMOND,
	MASTER,
	GRANDMASTER,
	CHALLENGER;
	
	public static void assignTier(Player player, String tier) {
		switch(tier) {
			case "IRON":
				player.setTier(Tier.IRON);
				break;
			case "BRONZE":
				player.setTier(Tier.BRONZE);
				break;
			case "SILVER":
				player.setTier(Tier.SILVER);
				break;
			case "GOLD":
				player.setTier(Tier.GOLD);
				break;
			case "PLATINUM":
				player.setTier(Tier.PLATINUM);
				break;
			case "EMERALD":
				player.setTier(Tier.EMERALD);
				break;
			case "DIAMOND":
				player.setTier(Tier.DIAMOND);
				break;
			case "MASTER":
				player.setTier(Tier.MASTER);
				break;
			case "GRANDMASTER":
				player.setTier(Tier.GRANDMASTER);
				break;
			default:
				player.setTier(Tier.UNRANKED);
		}
	}
}

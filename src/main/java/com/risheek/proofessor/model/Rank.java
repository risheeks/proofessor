package com.risheek.proofessor.model;

public enum Rank {
	I,
	II,
	III,
	IV;
	
	public static void assignRank(Player player, String tier) {
		switch(tier) {
			case "IV":
				player.setRank(Rank.IV);
				break;
			case "III":
				player.setRank(Rank.III);
				break;
			case "II":
				player.setRank(Rank.II);
				break;
			case "I":
				player.setRank(Rank.I);
				break;
			default:
				player.setRank(Rank.IV);
		}
		
	}
}
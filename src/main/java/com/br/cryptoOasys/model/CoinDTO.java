package com.br.cryptoOasys.model;

import lombok.Data;

@Data
public class CoinDTO{
	private String id;
	private String name;
	private String symbol;	
	private boolean favorite;
}

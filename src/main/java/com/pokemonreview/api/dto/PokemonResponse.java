package com.pokemonreview.api.dto;

import lombok.Data;

import java.util.List;

@Data
public class PokemonResponse {
    private List<PokemonDto> data;
    private int pageNo;
    private int PageSize;
    private long totalElements;
    private int totalPages;
    private boolean last;
}

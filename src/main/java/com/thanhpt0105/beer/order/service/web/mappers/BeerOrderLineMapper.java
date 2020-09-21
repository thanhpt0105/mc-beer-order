package com.thanhpt0105.beer.order.service.web.mappers;

import com.thanhpt0105.beer.order.service.domain.BeerOrderLine;
import com.thanhpt0105.beer.order.service.web.model.BeerOrderLineDto;
import org.mapstruct.Mapper;

@Mapper(uses = {DateMapper.class})
public interface BeerOrderLineMapper {
    BeerOrderLineDto beerOrderLineToDto(BeerOrderLine line);

    BeerOrderLine dtoToBeerOrderLine(BeerOrderLineDto dto);
}

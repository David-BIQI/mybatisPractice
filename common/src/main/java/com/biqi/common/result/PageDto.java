package com.biqi.common.result;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * @author xiebq
 * @param <T>
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class PageDto<T> {

	private List<T> list;

    private Integer pageNumber;

    private Integer pageSize;

    protected long total;
}

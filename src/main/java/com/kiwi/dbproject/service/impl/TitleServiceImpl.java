package com.kiwi.dbproject.service.impl;

import com.kiwi.dbproject.entity.Title;
import com.kiwi.dbproject.mapper.TitleMapper;
import com.kiwi.dbproject.service.ITitleService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author kiwi
 * @since 2019-12-14
 */
@Service
public class TitleServiceImpl extends ServiceImpl<TitleMapper, Title> implements ITitleService {

}

package com.kiwi.dbproject.service.impl;

import com.kiwi.dbproject.entity.File;
import com.kiwi.dbproject.mapper.FileMapper;
import com.kiwi.dbproject.service.IFileService;
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
public class FileServiceImpl extends ServiceImpl<FileMapper, File> implements IFileService {

}

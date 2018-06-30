package io.renren.modules.sys.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import io.renren.common.utils.PageUtils;
import io.renren.common.utils.Query;

import io.renren.modules.sys.dao.BlogNewInfoDao;
import io.renren.modules.sys.entity.BlogNewInfoEntity;
import io.renren.modules.sys.service.BlogNewInfoService;


@Service("blogNewInfoService")
public class BlogNewInfoServiceImpl extends ServiceImpl<BlogNewInfoDao, BlogNewInfoEntity> implements BlogNewInfoService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<BlogNewInfoEntity> page = this.selectPage(
                new Query<BlogNewInfoEntity>(params).getPage(),
                new EntityWrapper<BlogNewInfoEntity>()
        );

        return new PageUtils(page);
    }

}

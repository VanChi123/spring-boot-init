package com.example.demo.service;

import com.example.demo.domain.Goods;
import com.example.demo.domain.Goods_;
import com.example.demo.dto.criteria_test.GoodsCriteria;
import com.example.demo.dto.dto.GoodsDTO;
import com.example.demo.repository.GoodsRepository;
import com.example.demo.rest.request.SearchAllGoodSpecRequest;
import com.example.demo.rest.validator.GoodsValidator;
import com.example.demo.rest.validator.ServiceException;
import com.example.demo.util.BusinessException;
import com.example.demo.util.enums.ResponseStatusCodeEnum;
import io.github.jhipster.service.QueryService;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;

import static com.example.demo.util.common.util.StringUtil.stringIsNullOrEmptyBlank;

@Service
//@AllArgsConstructor
//@NoArgsConstructor
@RequiredArgsConstructor
public class GoodsService extends QueryService<Goods> {
    private final GoodsRepository goodsRepository;

    private final GoodsValidator goodsValidator;

//    public GoodsService(GoodsRepository goodsRepository) {
//        this.goodsRepository = goodsRepository;
//    }

    public Page<Goods> getListGoods(Pageable pageable) {
        Page<Goods> page = goodsRepository.findAll(pageable);
        return page;
    }

    public Page<Goods> getListGoodsFind(String nameFind, Pageable pageable) {
        Page<Goods> page = goodsRepository.getGoods(nameFind, pageable);
        return page;
    }

    public Page<Goods> getListGoodBySpecification(Pageable pageable, GoodsCriteria criteria) {
        Specification specification = this.create(criteria);
        Page<Goods> page = this.goodsRepository.findAll(specification, pageable);

        return page;
    }

    public Page<GoodsDTO> findAllBySpecification(SearchAllGoodSpecRequest request) throws ServiceException, BusinessException {

        try {
            // Validate
            this.goodsValidator.validateSearch(request);

//            if(request != null) {
//                throw new BusinessException(ResponseStatusCodeEnum.FEE_NOTFOUND);
//            }
            Integer integer = 1/0;

        } catch (ServiceException | Exception e) {
            throw e;
        }


//        Specification specification = this.create(criteria);
//        Page<Goods> page = this.goodsRepository.findAll(specification, pageable);
//
//        return page;
        return null;
    }


    public Specification<Goods> create(GoodsCriteria goodsCriteria) {
        Specification<Goods> specification = Specification.where(null);

        if (null != goodsCriteria) {
            if (null != goodsCriteria.getId()) {
                specification = specification.and(buildStringSpecification(goodsCriteria.getId(), Goods_.id));
                if (!stringIsNullOrEmptyBlank(goodsCriteria.getId().getEquals())) {
                    specification = (goodsRoot, cq, cb) -> cb.equal(cb.lower(goodsRoot.get("id")), goodsCriteria.getId().getEquals().toLowerCase());
                }
            }
            if (null != goodsCriteria.getName()) {
                specification = specification.and(buildStringSpecification(goodsCriteria.getName(), Goods_.name));
            }

            if (null != goodsCriteria.getAmount()) {
                specification = specification.and(buildRangeSpecification(goodsCriteria.getAmount(), Goods_.amount));
            }

            if (null != goodsCriteria.getPrice()) {
                specification = specification.and(buildRangeSpecification(goodsCriteria.getPrice(), Goods_.price));
            }

            if (null != goodsCriteria.getDate1()) {
                specification = specification.and(buildRangeSpecification(goodsCriteria.getDate1(), Goods_.date1));
            }

            if (null != goodsCriteria.getNote()) {
                specification = specification.and(buildStringSpecification(goodsCriteria.getNote(), Goods_.note));
            }
        }

        return specification;
    }

}

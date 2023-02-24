package com.example.demo.rest.validator;

import com.example.demo.dto.dto.GoodsDTO;
import com.example.demo.rest.request.SearchAllGoodSpecRequest;
import com.example.demo.util.exception.ServiceExceptionBuilder;
import com.example.demo.util.exception.ValidationError;
import com.example.demo.util.common.rest.dto.ValidationErrorResponse;
import org.springframework.stereotype.Service;

@Service
public class GoodsValidator extends BaseValidator<GoodsDTO> {

    @Override
    public void validate(GoodsDTO request){

    }

    public void validateSearch(SearchAllGoodSpecRequest request) throws ServiceException {
        //Validate object
        if (null == request) {
            throw ServiceExceptionBuilder.newBuilder()
                    .addError(new ValidationErrorResponse("Id", ValidationError.NotNull))
                    .build();
        }
    }
}

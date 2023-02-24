package com.example.demo.util.common.rest;

import com.example.demo.rest.validator.ServiceException;
import com.example.demo.util.common.security.SecurityUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.core.io.Resource;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import com.example.demo.util.common.util.URLUtil;

import java.util.Map;

public class RestHelper {
    @Autowired
    private RestTemplate restTemplate;
    private String endpoint;

    public RestHelper() {
    }

    public void init(String endpoint) {
        this.endpoint = URLUtil.removeLastSlash(endpoint);
        this.restTemplate = new RestTemplate();
    }

    public String getEndpoint() {
        return this.endpoint;
    }

//    public <T> BaseDataResponse<T> callService(String apiPath, BaseDataRequest request, ParameterizedTypeReference responseType) throws ServiceException, Exception {
//        return this.callService(apiPath, request, responseType, SecurityUtils.getJwt() != null ? SecurityUtils.getJwt().getTokenValue() : null);
//    }
//
//    public <T> BaseDataResponse<T> callService(String apiPath, BaseDataRequest request, ParameterizedTypeReference responseType, String token) throws ServiceException, Exception {
//        ResponseEntity<BaseDataResponse<T>> responseEntity = this.restTemplate.exchange(this.endpoint + apiPath, HttpMethod.POST, this.createAuthHttpEntity(request, token), responseType, new Object[0]);
//        BaseDataResponse<T> response = (BaseDataResponse)responseEntity.getBody();
//        this.assertResponse(response);
//        return response;
//    }
//
//    public <T> BaseDataResponse<T> callService(String apiPath, BaseDataRequest request, ParameterizedTypeReference responseType, Map<String, String> requestParams) throws ServiceException, Exception {
//        return this.callService(apiPath, request, responseType, requestParams, SecurityUtils.getJwt() != null ? SecurityUtils.getJwt().getTokenValue() : null);
//    }
//
//    public <T> BaseDataResponse<T> callService(String apiPath, BaseDataRequest request, ParameterizedTypeReference responseType, String token, Map<String, String> headers) throws ServiceException, Exception {
//        ResponseEntity<BaseDataResponse<T>> responseEntity = this.restTemplate.exchange(this.endpoint + apiPath, HttpMethod.POST, this.createAuthHttpEntity(request, token, headers), responseType, new Object[0]);
//        BaseDataResponse<T> response = (BaseDataResponse)responseEntity.getBody();
//        this.assertResponse(response);
//        return response;
//    }
//
//    private HttpEntity createAuthHttpEntity(Object requestObject, String tokenValue, Map<String, String> headers) {
//        HttpHeaders httpHeaders = new HttpHeaders();
//        if (!StringUtils.isEmpty(tokenValue)) {
//            String formattedTokenValue = String.format("%s %s", TokenType.BEARER.getValue(), tokenValue);
//            httpHeaders.add("Authorization", formattedTokenValue);
//        }
//
//        if (headers != null && !headers.isEmpty()) {
//            headers.entrySet().stream().filter((entry) -> {
//                return !StringUtils.isEmpty(entry.getKey());
//            }).forEach((entry) -> {
//                httpHeaders.add((String)entry.getKey(), (String)entry.getValue());
//            });
//        }
//
//        return new HttpEntity(requestObject, httpHeaders);
//    }
//
//    public <T> BaseDataResponse<T> callService(String apiPath, BaseDataRequest request, ParameterizedTypeReference responseType, Map<String, String> requestParams, String token) throws ServiceException, Exception {
//        ResponseEntity<BaseDataResponse<T>> responseEntity = this.restTemplate.exchange(this.endpoint + apiPath, HttpMethod.GET, this.createAuthHttpEntity(request, token), responseType, requestParams);
//        BaseDataResponse<T> response = (BaseDataResponse)responseEntity.getBody();
//        this.assertResponse(response);
//        return response;
//    }
//
//    public <T> BaseElasticsearchQueryResponse<T> callElasticService(String apiPath, BaseDataRequest request, ParameterizedTypeReference responseType, Map<String, String> requestParams) throws ServiceException, Exception {
//        return this.callElasticService(apiPath, request, responseType, requestParams, SecurityUtils.getJwt() != null ? SecurityUtils.getJwt().getTokenValue() : null);
//    }
//
//    public <T> BaseElasticsearchQueryResponse<T> callElasticService(String apiPath, BaseDataRequest request, ParameterizedTypeReference responseType, Map<String, String> requestParams, String token) throws ServiceException, Exception {
//        ResponseEntity<BaseElasticsearchQueryResponse<T>> responseEntity = this.restTemplate.exchange(this.endpoint + apiPath, HttpMethod.GET, this.createAuthHttpEntity(request, token), responseType, requestParams);
//        BaseElasticsearchQueryResponse<T> response = (BaseElasticsearchQueryResponse)responseEntity.getBody();
//        this.assertResponse(response);
//        return response;
//    }
//
//    public Resource callResource(String apiPath, Map<String, String> requestParams) {
//        ResponseEntity<Resource> responseEntity = this.restTemplate.exchange(this.endpoint + apiPath, HttpMethod.GET, (HttpEntity)null, Resource.class, requestParams);
//        return (Resource)responseEntity.getBody();
//    }
//
//    private HttpEntity createAuthHttpEntity(Object requestObject, String tokenValue) {
//        if (!StringUtils.isEmpty(tokenValue)) {
//            String formattedTokenValue = String.format("%s %s", TokenType.BEARER.getValue(), tokenValue);
//            HttpHeaders httpHeaders = new HttpHeaders();
//            httpHeaders.add("Authorization", formattedTokenValue);
//            return new HttpEntity(requestObject, httpHeaders);
//        } else {
//            return new HttpEntity(requestObject);
//        }
//    }
//
//    private void assertResponse(BaseDataResponse response) throws ServiceException, Exception {
//        if (!"200".equals(response.getResponseCode())) {
//            throw new ServiceException(response.getResponseMessage(), response.getResponseEntityMessages());
//        }
//    }
//
//    private void assertResponse(BaseElasticsearchQueryResponse response) throws ServiceException, Exception {
//    }
}

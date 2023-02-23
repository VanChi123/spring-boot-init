package com.example.demo.controller;

import com.example.demo.domain.Goods;
import com.example.demo.rest.request.SearchAllGoodRequest;
import com.example.demo.rest.request.SearchAllGoodSpecRequest;
import com.example.demo.service.GoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/goods")
public class TestController {

    @Autowired
    private  GoodsService goodsService;

    @GetMapping
    public String test() {
        return "1";
    }

    @GetMapping("search")
    public ResponseEntity<Page<Goods>> getListGoods() {
        Pageable pageable = PageRequest.of(0, 3);
        Page<Goods> page = this.goodsService.getListGoods(pageable);
        return ResponseEntity.ok(page);
    }

    @GetMapping("search1")
    public ResponseEntity<Page<Goods>> getListGoods1() {
        Pageable pageable = PageRequest.of(1, 3);
        Page<Goods> page = this.goodsService.getListGoods(pageable);
        return new ResponseEntity(page, HttpStatus.OK);
    }

//    Pageable pageable = PageRequest.of(s.getPageIndex(), s.getPageSize(), Sort.by(Sort.Direction.ASC, "id"));

    @PostMapping("search")
    public ResponseEntity<Page<Goods>> searchGoodAll(@RequestBody SearchAllGoodRequest request) {
        Pageable pageable = PageRequest.of(request.getPageIndex(), request.getPageSize(), Sort.by(Sort.Direction.DESC,"name"));
        // Vấn đề?: Sort nhiều trường và nhiều thứ tự ?

        String name = request.getName();
        Page<Goods> page = this.goodsService.getListGoodsFind(request.getName(), pageable);

        return new ResponseEntity<>(page, HttpStatus.OK);
    }


    @PostMapping("search-spec")
    public ResponseEntity<Page<Goods>> searchGoodAllSpec(@RequestBody SearchAllGoodSpecRequest searchAllGoodSpecRequest) {
        System.out.println(searchAllGoodSpecRequest.getPageIndex());
        Pageable pageable = PageRequest.of(searchAllGoodSpecRequest.getPageIndex(), searchAllGoodSpecRequest.getPageSize(), Sort.by(Sort.Direction.DESC,"name"));

        Page<Goods> page = this.goodsService.getListGoodBySpecification(pageable, searchAllGoodSpecRequest.getCriteria());
//        Page<Goods> page = null;

        return new ResponseEntity<>(page, HttpStatus.OK);
//        return null;
    }

}

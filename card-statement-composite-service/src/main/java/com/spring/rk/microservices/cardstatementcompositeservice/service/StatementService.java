package com.spring.rk.microservices.cardstatementcompositeservice.service;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

import java.util.List;

import com.spring.rk.microservices.cardstatementcompositeservice.model.StatementVO;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


public interface StatementService {

    final static String PREFIX = "api/";

    @RequestMapping(value = PREFIX + "statements", method = GET)
    List<StatementVO> getStatements();

    @RequestMapping(value = PREFIX + "statement/{statementId}", method = GET)
    StatementVO getStatament(@PathVariable("statementId") Long statementId);

    @RequestMapping(value= PREFIX + "statement", method = GET)
    List<StatementVO> getStatements(@RequestParam("cardId") Long cardId);

}
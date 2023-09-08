package com.osiki.demobankapp.controller;

import com.osiki.demobankapp.dto.*;
import com.osiki.demobankapp.service.UserService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/user")
@Tag(name = "User account management APIs")
public class UserController {

    @Autowired
    private UserService userService;

    @Operation(
            summary = "Create New User Account",
            description = "Creating a new user and assigned an account ID"

    )

    @ApiResponse(
            responseCode = "201",
            description = "http status 201 CREATED"
    )
    @PostMapping
    public BankResponse createAccount(@RequestBody UserRequest userRequest){
        return userService.createAccount(userRequest);

    }

    @Operation(
            summary = "Check Balance Enquiry",
            description = "Given an account details, check the user balance"

    )

    @ApiResponse(
            responseCode = "200",
            description = "http status 200 SUCCESS"
    )

    @GetMapping("/balance-enquiry")
    public BankResponse balanceEnquiry(@RequestBody EnquiryRequest request){

        return userService.balanceEnquiry(request);

    }



    @GetMapping("/name-enquiry")
    public String nameEnquiry(@RequestBody EnquiryRequest request){
        return userService.nameEnquiry(request);

    }

    @PostMapping("/credit")
    public BankResponse creditAccount(@RequestBody CreditDebitRequest request){

        return userService.creditAccount(request);

    }

    @PostMapping("/debit")
    public BankResponse debitAccount(@RequestBody CreditDebitRequest request){

        return userService.debitAccount(request);

    }

    @PostMapping("/transfer")
    public BankResponse transfer(@RequestBody TransferRequest request){
        return userService.transfer(request);

    }
}

package com.example.finalProject_synrgy.service;

import com.example.finalProject_synrgy.dto.action.AddCardReq;
import com.example.finalProject_synrgy.dto.action.PayQrisReq;
import com.example.finalProject_synrgy.dto.action.TransferReq;
import com.example.finalProject_synrgy.dto.infosaldo.InfoSaldoResponse;
import com.example.finalProject_synrgy.entity.Qris;

import java.security.Principal;

public interface ActionService {
    Object getInfoSaldo(Principal principal);

    Object getInfoSaldoTotal(Principal principal);

    Object transfer(Principal principal, TransferReq req);

    Object addCard(Principal principal, AddCardReq req);

    Object payQris(Principal principal, PayQrisReq req);
}

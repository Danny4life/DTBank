package com.osiki.demobankapp.service;

import com.osiki.demobankapp.dto.EmailDetails;

public interface EmailService {
    void sendEmailAlert(EmailDetails emailDetails);
}

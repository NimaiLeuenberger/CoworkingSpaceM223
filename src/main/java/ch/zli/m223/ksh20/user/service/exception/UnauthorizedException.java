package ch.zli.m223.ksh20.user.service.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.FORBIDDEN, reason = "User not authorized")
public class UnauthorizedException extends NoOutputException {
}
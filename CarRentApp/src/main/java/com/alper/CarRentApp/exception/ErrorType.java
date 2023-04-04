package com.alper.CarRentApp.exception;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.http.HttpStatus;

@AllArgsConstructor
@NoArgsConstructor
@Getter
public enum ErrorType {
    CAR_NOT_FOUND(2004,"Araba bulunamadı", HttpStatus.NOT_FOUND),
    DAILY_PRICE_NOT_FOUND(2100,"Bu günlük fiyat veya altında günlük fiyatlı olan araba bulunamadı",HttpStatus.NOT_FOUND),

    COLOR_OR_BRAND_NOT_FOUND(2005,"Renk veya marka bulunamadı",HttpStatus.NOT_FOUND),
    COLOR_NOT_FOUND(2200,"Bu renge sahip araba bulunamadı",HttpStatus.NOT_FOUND),
    BRAND_NOT_FOUND(2300,"Bu markaya sahip araba bulunamadı",HttpStatus.NOT_FOUND),
    BRAND_IS_EXIST(2400,"Bu marka veri tabanında zaten bulunmaktadır",HttpStatus.NOT_FOUND),
    COLOR_IS_EXIST(2500,"Bu renk veri tabanında zaten bulunmaktadır",HttpStatus.NOT_FOUND),
    ERROR_INVALID_TOKEN(3000,"Geçersiz token bilgisi",HttpStatus.UNAUTHORIZED),
    BAD_REQUEST(4000,"Geçersiz istek ya da parametre",HttpStatus.BAD_REQUEST),
    ERROR(9000,"Beklenmeyen bir hata oluştu.Lütfen tekrar deneyiniz.",HttpStatus.INTERNAL_SERVER_ERROR);
    int code;
    String message;
    HttpStatus httpStatus;

}

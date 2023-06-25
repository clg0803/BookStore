package com.it.pay;

import lombok.Data;

@Data
public class AlipayConfig {
    private String appId= "2021000121658345";
    private String appPrivateKey = "MIIEvQIBADANBgkqhkiG9w0BAQEFAASCBKcwggSjAgEAAoIBAQCXr1hQhDClmV403bB1oVlzFZgqSrzcIzyDSEATHV2GJQ/59OSm2gaJBiqTHWoFJPkWIxGGnTneSTyU4z2w7+RfUFc6wXQ1Cp4PCVCnVG71kJkHEX+B6xFptIcEfHIU1UjLYLPw4bQjplqkcqzw87MQCii57mAi5FYFbublNhuahDVx+iKFixeUldGitJtVyfQOkHQGMMhE7+1XKz31DHg/CqClK5vdzjSD6UYXZ9rnHijelCsviWRGFdQjU8Os1OEnUMr0AficekxYB5yT5AlMta/lj4KrskBxuYDH/FwNWfsKw9cl1opXIb2sYis06HfFWAKewTC4ggsJhltKC1h1AgMBAAECggEAGBpm4DSBPm9GhwQLPEXtXto5mc7Sf/ChdwMOG3t5Fw3gogmGI/VVQITYUxRDepnLcvcTm950CZx9ofMSJIGaOoMbuVxwSNVtFFqYlF5YW3Ekv/jJ2C0wUSm8orvbrO/PZ3HwZgCXjWqr0KHgVVGETLIwkosMf77k5GwhCJ82d7D31VvCaD0F3onvY2Xw3Ppg/2SJyl6FvM6CNA5ksmH18/5PmqbfjRnP2RRaXh8jPsRY1ogWNepYZeuaQ2A2IDInQP4VaRVbGGwUv4erCMAC+ofymAsqNzoA46jEmbvS3fjXD9Mz5bwf1uPKKAXSGwH9dCJhQj2cTIIdOOybE5TBaQKBgQDN4nQbAFrZvDsIwVWelGSn1mxB7Qn5lbWmvnTiMjr2YNnBl9RZt5hVdJUXyN9R3ZvuFH3mGh2IJc0frhkwSYS1jmmYMrIXBN5Ej8mqHo1tx3v+nEIP3s7Zbx5S8PYkriWITgHchasQL/UQg4WbHRnQDMLgb1xnolpRelFgUMxOqwKBgQC8m3sFs4P3WpivSDDQuwXer6wCI/XJoxPzpFmEZqr0OdPDcnXunogmRwcBjiobDu1FSf2SLHdCItct62inu2jEIHdWw5qbZAHFtu0CIa8DGMtwGCTVBYU/1ZRv56Go8nXDNBLckCRCq6IOQ6gmd5PXzQoDPs9cbg0iJ/cuMtJ1XwKBgQCQup4P1SIIac++CdqcTYisi4kyluUqNFmry7ryv4i/Zbnt40N9hhhqCjg8rhJ+xCA3LuSJ+tXDvX8CxCokzamiz2ffe9PBZsSwwbtsAWo+P7skcsflzCTwqLJSb904T8tGlD+uu7BTAsNtRmeHcN+SZ0Ye62mz2GdRW4EVCfd1XQKBgG1bPS5mErsl5WekVOGBvvqKIxKupQF/s77N6TVyjebDbLxjLmvnsYt4HWDSfClqMzq8lvDdJVzMdLVkTC8M48bsCCXfjlJQ3xIzaSKWQzJpevOInDqDU+paPRHRXRNnWc6P7+vBC7U4bOMWaXW8WZWDhi2ximvOR4EpaRF5WDvDAoGAS/C+XlFOkdSM/ZNR/gAWqmAv3przVWQroTI7FOexlexs17GrqaQ3cjJ4UORDz/eR7yIEN/N0WqnZalkxgiAczKXLZ6ZexbmK9/S/dRFpKReUxtbnKKJPn15VMYcmbfrMEi0hRhYYKfjhQ7plrjOxgil2Mj72WUve9UJSOaqunlo=";
    private String alipayPublicKey = "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAsoBt63LAy7mV95bPZzyl6zW4CNCQMUe+XUuI8ERqGWfhMPc22gGgsJrJgC1uZTJjpa1drnYXkR6U2jw18YDOj1lD0DQcKU0aROwWBIDdrtlODeIco3KPWT3b7dQbhpCsivyXFSPOdgWTvt3cDRZdxmur03ihJHdhXmNNdXbLAYR/k1Jyn/UfzIXgcYlcXuSUZ2+6vlmu+BumAcByFS6WjEeN3g9v3aw0Ba0iEKvgm/iMKehirVRCVBBQ2mRG8IGoc8VsoyMXdtI8mpxDOt2uWmdHMubxbpUOlOGx9H+lF0IG44bTQdMwcM1yN0DVvC2wUW4iILQuSo7t0OsYc6Hx2QIDAQAB";
    private String notifyUrl = "http://localhost:8080/pay/notify";
    private String returnUrl = "http://localhost:8080/pay/return";
}
//alipay:
//        appId: 2021000121658345
//        appPrivateKey: MIIEvQIBADANBgkqhkiG9w0BAQEFAASCBKcwggSjAgEAAoIBAQCXr1hQhDClmV403bB1oVlzFZgqSrzcIzyDSEATHV2GJQ/59OSm2gaJBiqTHWoFJPkWIxGGnTneSTyU4z2w7+RfUFc6wXQ1Cp4PCVCnVG71kJkHEX+B6xFptIcEfHIU1UjLYLPw4bQjplqkcqzw87MQCii57mAi5FYFbublNhuahDVx+iKFixeUldGitJtVyfQOkHQGMMhE7+1XKz31DHg/CqClK5vdzjSD6UYXZ9rnHijelCsviWRGFdQjU8Os1OEnUMr0AficekxYB5yT5AlMta/lj4KrskBxuYDH/FwNWfsKw9cl1opXIb2sYis06HfFWAKewTC4ggsJhltKC1h1AgMBAAECggEAGBpm4DSBPm9GhwQLPEXtXto5mc7Sf/ChdwMOG3t5Fw3gogmGI/VVQITYUxRDepnLcvcTm950CZx9ofMSJIGaOoMbuVxwSNVtFFqYlF5YW3Ekv/jJ2C0wUSm8orvbrO/PZ3HwZgCXjWqr0KHgVVGETLIwkosMf77k5GwhCJ82d7D31VvCaD0F3onvY2Xw3Ppg/2SJyl6FvM6CNA5ksmH18/5PmqbfjRnP2RRaXh8jPsRY1ogWNepYZeuaQ2A2IDInQP4VaRVbGGwUv4erCMAC+ofymAsqNzoA46jEmbvS3fjXD9Mz5bwf1uPKKAXSGwH9dCJhQj2cTIIdOOybE5TBaQKBgQDN4nQbAFrZvDsIwVWelGSn1mxB7Qn5lbWmvnTiMjr2YNnBl9RZt5hVdJUXyN9R3ZvuFH3mGh2IJc0frhkwSYS1jmmYMrIXBN5Ej8mqHo1tx3v+nEIP3s7Zbx5S8PYkriWITgHchasQL/UQg4WbHRnQDMLgb1xnolpRelFgUMxOqwKBgQC8m3sFs4P3WpivSDDQuwXer6wCI/XJoxPzpFmEZqr0OdPDcnXunogmRwcBjiobDu1FSf2SLHdCItct62inu2jEIHdWw5qbZAHFtu0CIa8DGMtwGCTVBYU/1ZRv56Go8nXDNBLckCRCq6IOQ6gmd5PXzQoDPs9cbg0iJ/cuMtJ1XwKBgQCQup4P1SIIac++CdqcTYisi4kyluUqNFmry7ryv4i/Zbnt40N9hhhqCjg8rhJ+xCA3LuSJ+tXDvX8CxCokzamiz2ffe9PBZsSwwbtsAWo+P7skcsflzCTwqLJSb904T8tGlD+uu7BTAsNtRmeHcN+SZ0Ye62mz2GdRW4EVCfd1XQKBgG1bPS5mErsl5WekVOGBvvqKIxKupQF/s77N6TVyjebDbLxjLmvnsYt4HWDSfClqMzq8lvDdJVzMdLVkTC8M48bsCCXfjlJQ3xIzaSKWQzJpevOInDqDU+paPRHRXRNnWc6P7+vBC7U4bOMWaXW8WZWDhi2ximvOR4EpaRF5WDvDAoGAS/C+XlFOkdSM/ZNR/gAWqmAv3przVWQroTI7FOexlexs17GrqaQ3cjJ4UORDz/eR7yIEN/N0WqnZalkxgiAczKXLZ6ZexbmK9/S/dRFpKReUxtbnKKJPn15VMYcmbfrMEi0hRhYYKfjhQ7plrjOxgil2Mj72WUve9UJSOaqunlo=
//        alipayPublicKey: MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAsoBt63LAy7mV95bPZzyl6zW4CNCQMUe+XUuI8ERqGWfhMPc22gGgsJrJgC1uZTJjpa1drnYXkR6U2jw18YDOj1lD0DQcKU0aROwWBIDdrtlODeIco3KPWT3b7dQbhpCsivyXFSPOdgWTvt3cDRZdxmur03ihJHdhXmNNdXbLAYR/k1Jyn/UfzIXgcYlcXuSUZ2+6vlmu+BumAcByFS6WjEeN3g9v3aw0Ba0iEKvgm/iMKehirVRCVBBQ2mRG8IGoc8VsoyMXdtI8mpxDOt2uWmdHMubxbpUOlOGx9H+lF0IG44bTQdMwcM1yN0DVvC2wUW4iILQuSo7t0OsYc6Hx2QIDAQAB
//        notifyUrl: http://sprb.tk/alipay/notify
//        returnUrl: http://localhost:9876/front/myorder
//
//
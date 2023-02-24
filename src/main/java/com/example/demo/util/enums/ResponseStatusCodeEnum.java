package com.example.demo.util.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;
import org.springframework.http.HttpStatus;

import java.util.HashMap;
import java.util.Map;

@Getter
@AllArgsConstructor
public enum ResponseStatusCodeEnum {

    /**
     * response codes should follow the standard: XXXYYYY where
     * - XXX: application shortname
     * - YYYY: numeric code of the error code
     */

    SUCCESS("00", HttpStatus.OK.value()),
    // Adds more response codes here
    CONFIRM_TYPE_INVALID("PM1000", HttpStatus.OK.value()),
    FEE_EXISTS("PM1001", HttpStatus.OK.value()),
    FEE_NOTFOUND("PM1002", HttpStatus.OK.value()),
    FEE_SETTING_NOT_FOUND("PM1003", HttpStatus.OK.value()),
    FEE_TOTAL_NOT_NULL("PM1046", HttpStatus.OK.value()),
    FEE_PAYMENT_ALREADY("PM1004", HttpStatus.OK.value()),
    CONTRACT_VALUE_INVALID("PM1005", HttpStatus.OK.value()),
    FEE_CHARGE_AMOUNT_INVALID("PM1006", HttpStatus.OK.value()),
    EGATE_CHECKSUM_INVALID("PM1007", HttpStatus.OK.value()),
    EGATE_CONNECT_FAILED("PM1008", HttpStatus.OK.value()),
    EGATE_REQUEST_ERROR("PM1009", HttpStatus.OK.value()),
    EGATE_INIT_REQUEST_FAILED("PM1010", HttpStatus.OK.value()),
    PAYMENT_INFO_CREATE_FAILED("PM1011", HttpStatus.OK.value()),
    PAYMENT_INFO_INVALID("PM1012", HttpStatus.OK.value()),
    FEE_TYPE_CODE_EXISTS("PM1013", HttpStatus.OK.value()),
    FEE_PRICE_NOT_FOUND("PM1014", HttpStatus.OK.value()),
    DATE_RANGE_INVALID("PM1015", HttpStatus.OK.value()),
    TRANSACTION_INFO_EXISTS("PM1016", HttpStatus.OK.value()),
    TRANSACTION_NOT_FOUND("PM1017", HttpStatus.OK.value()),
    CONTRACTOR_NOT_FOUND("PM1018", HttpStatus.OK.value()),
    CONTRACTOR_PENDING("PM1019", HttpStatus.OK.value()),
    CONTRACTOR_EXISTS("PM1020", HttpStatus.OK.value()),
    CONTRACTOR_STATUS_INVALID("PM1021", HttpStatus.OK.value()),
    DEBT_FEE_TYPE_INVALID("PM1022", HttpStatus.OK.value()),
    FEE_TOTAL_AMOUNT_NOT_MATCH("PM1023", HttpStatus.OK.value()),
    FEE_CANCELED("PM1024", HttpStatus.OK.value()),
    FEE_NOT_PAYMENT_YET("PM1025", HttpStatus.OK.value()),
    NOMINAL_AND_CONTRACTOR_EMPTY("PM1026", HttpStatus.OK.value()),
    NOMINAL_AND_CONTRACTOR_CODE_NOT_MATCH("PM1027", HttpStatus.OK.value()),
    NOMINAL_ACCOUNT_NOT_FOUND("PM1028", HttpStatus.OK.value()),
    CREDIT_AMOUNT_INVALID("PM1029", HttpStatus.OK.value()),
    NOT_HAVE_DEBT_FEE("PM1030", HttpStatus.OK.value()),
    NOMINAL_OR_CONTRACTOR_STATUS_INACTIVE("PM1031", HttpStatus.OK.value()),
    DEBIT_NOMINAL_ACC_BALANCE_FAILED("PM1032", HttpStatus.OK.value()),
    CLIENT_ID_INVALID("PM1033", HttpStatus.OK.value()),
    RECEIVE_CROSS_CHECK_FILE_ERR("PM1034", HttpStatus.OK.value()),
    IPN_RESULT_FAILED("PM1035", HttpStatus.OK.value()),
    BANK_CONNECT_ERR("PM1036", HttpStatus.OK.value()),
    BANK_ERR("PM1037", HttpStatus.OK.value()),
    BANK_ACC_NO_ERR("PM1038", HttpStatus.OK.value()),
    FEE_CANNOT_PAY("PM1039", HttpStatus.OK.value()),
    FEE_PAID("PM1048", HttpStatus.OK.value()),
    CANCEL_ORDER_FAILED("PM1040", HttpStatus.OK.value()),
    ENV_NOT_PASS_BANK("PM1041", HttpStatus.OK.value()),
    CROSSCHECK_FILE_NOT_VALID("PM1042", HttpStatus.OK.value()),
    NAPAS_PAYMENT_DATE_INVALID("PM1043", HttpStatus.OK.value()),
    CROSSCHECK_INFO_INVALID("PM1044", HttpStatus.OK.value()),
    ROLE_NOT_VALID("PM1045", HttpStatus.OK.value()),
    YEAR_MAINTAIN_FEE_INVALID("PM1047", HttpStatus.OK.value()),
    BENEFICIARYUNIT_INVALID("PM1049", HttpStatus.OK.value()),
    EVENT_INVALID("PM2000", HttpStatus.OK.value()),
    EVENT_NOT_IMPLEMENTED("PM2001", HttpStatus.OK.value()),
    RABBIT_NOT_CONFIG("PM3000", HttpStatus.OK.value()),
    INVOICE_NOT_FOUND("PM4000", HttpStatus.OK.value()),
    BILLING_NOT_FOUND("BL0001", HttpStatus.OK.value()),
    INVOICE_ID_NOT_NULL("INVOICE_ID_NOT_NULL", HttpStatus.OK.value()),
    ORIGINAL_INVOICE_NOT_FOUND("PM4001", HttpStatus.OK.value()),
    INVOICE_TYPE_INVALID("PM4002", HttpStatus.OK.value()),
    INVOICE_STATUS_INVALID("PM4003", HttpStatus.OK.value()),
    PM_ADVANCE_NOT_FOUND("PM5000", HttpStatus.OK.value()),
    PM_ADVANCE_STATUS_INACTIVE("PM5001", HttpStatus.OK.value()),
    ADVANCE_APPROVE_STATUS_INVALID("PM5002", HttpStatus.OK.value()),
    CANNOT_GET_ORG_CODE("PM5003", HttpStatus.OK.value()),
    ADVANCE_CODE_INVALID("PM5003", HttpStatus.OK.value()),
    ACCOUNT_APPROVE_INVALID("PM5004", HttpStatus.OK.value()),
    PAYMENT_DURATION_HAS_PAID("PM5005", HttpStatus.OK.value()),
    APPROVE_STATUS_INVALID("PM5006", HttpStatus.OK.value()),
    PM_LICENSE_NOT_FOUND("PM6000", HttpStatus.OK.value()),
    CANNOT_GET_USERINFO("PM7000", HttpStatus.OK.value()),
    PM_APPROVE_NOT_FOUND("PM8000", HttpStatus.OK.value()),
    CREATE_ACC_TPB_SUCCESS("GCS-AUTH-01", HttpStatus.OK.value()),
    FORBIDDEN_CHANGE_QUANTITY("INV0001", HttpStatus.OK.value()),
    REQUEST_ID_NOT_NULL("REQUEST_ID_NOT_NULL", HttpStatus.OK.value()),
    REQUEST_ID_DUPLICATE("REQUEST_ID_DUPLICATE", HttpStatus.OK.value()),
    FIS_PAY_ERR_POSTING_DATE("FISPM0001", HttpStatus.OK.value()),
    FIS_PAY_ERR_AMT_LESS_THAN_ZERO("FISPM0002", HttpStatus.OK.value()),
    FIS_PAY_ERR_TRAN_HAS_DETAILS("FISPM0003", HttpStatus.OK.value()),
    FIS_PAY_ERR_AMT_LINE_GREAT_THAN_HEADER("FISPM0004", HttpStatus.OK.value()),
    FIS_PAY_ERR_TRANS_EX_EXISTS("FISPM0005", HttpStatus.OK.value()),
    FIS_TRANS_NOT_FOUND("FISPM0006", HttpStatus.OK.value()),
    FIS_FEE_CODE_EXISTS("FISPM0007", HttpStatus.OK.value()),
    FIS_P_TRANS_CODE_EXISTS("FISPM0008", HttpStatus.OK.value()),
    FIS_OUT_PAY_GREAT_THAN_BALANCE("FISPM0009", HttpStatus.OK.value()),
    UNKNOW_ERROR("PM9999", HttpStatus.OK.value());

    private final String code;
    private final int httpCode;

    private static final Map<String, ResponseStatusCodeEnum> mapping = new HashMap<>();

    static {
        for (ResponseStatusCodeEnum rsce : ResponseStatusCodeEnum.values()) {
            mapping.put(rsce.code, rsce);
        }
    }

    public static ResponseStatusCodeEnum getEnumByCode(String code) {
        for (ResponseStatusCodeEnum obj : ResponseStatusCodeEnum.values()) {
            if (obj.getCode().equals(code))
                return obj;
        }
        return null;
    }

    public static ResponseStatusCodeEnum fromValue(String value) {
        if (mapping.containsKey(value)) {
            return mapping.get(value);
        }
        return null;
    }

    public String httpCodeString() {
        return String.valueOf(this.httpCode);
    }

    public boolean isSuccess() {
        return code.equals(SUCCESS.getCode());
    }
}

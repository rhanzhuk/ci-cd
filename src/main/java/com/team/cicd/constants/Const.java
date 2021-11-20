package com.team.cicd.constants;

import org.springframework.stereotype.Service;

@Service
public class Const {

    public static final String CRON_FOR_PROD = "0 0 8 ? * *";
    public static final String CRON_FOR_TEST = "0 12 14 ? * *";

    //icons to sending
    public static final String SWIM = "️\uD83C\uDFCA\u200D♂️";
    public static final String CYCLE = "\uD83D\uDEB4\u200D♂️";
    public static final String RUN = "\uD83C\uDFC3\u200D♂️";
}

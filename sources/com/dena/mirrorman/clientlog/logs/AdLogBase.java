package com.dena.mirrorman.clientlog.logs;

import java.util.HashMap;
import jo.h;
import jo.p;
import ym.c;

/* loaded from: classes2.dex */
public class AdLogBase extends LogBase {
    public static final String AD = "ad";
    public static final String AD_ACTION_TYPE = "ad_action_type";
    public static final String AD_ID = "ad_id";
    public static final String PAYLOAD = "payload";
    @c(AD_ACTION_TYPE)
    private String ad_action_type;
    @c("ad_id")
    private String ad_id;
    @c("payload")
    private HashMap<String, String> payload;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* loaded from: classes2.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(h hVar) {
            this();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AdLogBase(String str, String str2, String str3) {
        super(AD);
        p.h(str, AD_ACTION_TYPE);
        this.ad_action_type = str;
        this.ad_id = str2;
        this.payload = new HashMap<>();
        setPage_id(str3);
    }

    public final String getAd_action_type() {
        return this.ad_action_type;
    }

    public final String getAd_id() {
        return this.ad_id;
    }

    public final HashMap<String, String> getPayload() {
        return this.payload;
    }

    public final void setAd_action_type(String str) {
        p.h(str, "<set-?>");
        this.ad_action_type = str;
    }

    public final void setAd_id(String str) {
        this.ad_id = str;
    }

    public final void setPayload(HashMap<String, String> hashMap) {
        p.h(hashMap, "<set-?>");
        this.payload = hashMap;
    }
}

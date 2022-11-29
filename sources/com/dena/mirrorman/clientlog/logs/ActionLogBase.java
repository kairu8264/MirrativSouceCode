package com.dena.mirrorman.clientlog.logs;

import g9.a;
import java.util.HashMap;
import jo.h;
import jo.p;
import ym.c;

/* loaded from: classes2.dex */
public class ActionLogBase extends LogBase {
    public static final String ACTION = "action";
    public static final String ACTION_TYPE = "action_type";
    public static final String PAYLOAD = "payload";
    public static final String TARGET_ID = "target_id";
    public static final String TARGET_TYPE = "target_type";
    @c(ACTION_TYPE)
    private String action_type;
    @c("payload")
    public HashMap<String, String> payload;
    @c(TARGET_ID)
    private String target_id;
    @c(TARGET_TYPE)
    private String target_type;
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
    public ActionLogBase(String str, String str2, String str3, String str4, String str5) {
        super(ACTION);
        p.h(str, ACTION_TYPE);
        this.payload = new HashMap<>();
        this.action_type = str;
        if (str2 != null) {
            this.target_type = str2;
        }
        if (str3 != null) {
            this.target_id = str3;
        }
        if (str4 != null) {
            setPage_id(str4);
        } else {
            setPage_id("");
        }
        if (str5 != null) {
            setService_name(str5);
        } else {
            setService_name("");
        }
        a.g("clientlog new:" + str);
    }

    public final String getAction_type() {
        return this.action_type;
    }

    public final String getTarget_id() {
        return this.target_id;
    }

    public final String getTarget_type() {
        return this.target_type;
    }

    public final void setAction_type(String str) {
        p.h(str, "<set-?>");
        this.action_type = str;
    }

    public final void setTarget_id(String str) {
        this.target_id = str;
    }

    public final void setTarget_type(String str) {
        this.target_type = str;
    }

    public /* synthetic */ ActionLogBase(String str, String str2, String str3, String str4, String str5, int i10, h hVar) {
        this(str, str2, str3, str4, (i10 & 16) != 0 ? null : str5);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ActionLogBase(String str, String str2, String str3) {
        super(ACTION);
        p.h(str, ACTION_TYPE);
        this.payload = new HashMap<>();
        this.action_type = str;
        this.target_type = str2;
        this.target_id = str3;
        setPage_id("");
        a.g("clientlog new:" + str);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ActionLogBase(String str) {
        super(ACTION);
        p.h(str, ACTION_TYPE);
        this.payload = new HashMap<>();
        this.action_type = str;
        setPage_id("");
        a.g("clientlog new:" + str);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ActionLogBase(String str, String str2) {
        super(ACTION);
        p.h(str, "actionType");
        this.payload = new HashMap<>();
        this.action_type = str;
        setPage_id(str2);
        a.g("clientlog new:" + str);
    }
}

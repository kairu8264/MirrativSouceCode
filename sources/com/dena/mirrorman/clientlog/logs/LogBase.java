package com.dena.mirrorman.clientlog.logs;

import android.content.Context;
import android.os.Build;
import com.dena.mirrativ.mirrativapi.BuildConfig;
import com.dena.mirrativ.mirrativapi.core.ApiUtil;
import hf.e0;
import hf.v0;
import java.util.Locale;
import java.util.TimeZone;
import jo.f0;
import jo.h;
import jo.p;
import kf.x;
import of.n;
import oq.a;
import oq.b;
import ym.c;

/* loaded from: classes2.dex */
public class LogBase implements a {
    public static final String ADVERTISING_ID = "advertising_id";
    public static final String APP_VER = "app_ver";
    public static final String CREATED_AT = "created_at";
    public static final String LABEL = "label";
    public static final String LOCALE = "locale";
    public static final String NETWORK_TYPE = "network_type";
    public static final String OS = "os";
    public static final String OS_VER = "os_ver";
    public static final String PAGE_ID = "page_id";
    public static final String SERVICE_NAME = "service_name";
    public static final String TWITTER_CONNECTED = "twitter_connected";
    public static final String TZ = "tz";
    public static final String UA = "ua";
    public static final String UNIQUE_DEVICE_ID = "unique_device_id";
    public static final String USER_GRADE = "user_grade";
    public static final String USER_ID = "user_id";
    @c(ADVERTISING_ID)
    private String advertising_id;
    @c(APP_VER)
    private int app_ver;
    private final transient Context applicationContext;
    @c(CREATED_AT)
    private String created_at;
    @c(LABEL)
    private String label;
    @c(LOCALE)
    private String locale;
    private final transient e0 networkHelper;
    @c(NETWORK_TYPE)
    private String network_type;
    @c(OS)
    private String os;
    @c(OS_VER)
    private String os_ver;
    @c("page_id")
    private String page_id;
    @c(SERVICE_NAME)
    private String service_name;
    @c(TWITTER_CONNECTED)
    private int twitter_connected;
    @c(TZ)
    private String tz;
    @c(UA)

    /* renamed from: ua  reason: collision with root package name */
    private String f25296ua;
    @c(UNIQUE_DEVICE_ID)
    private String unique_device_id;
    private final transient v0 userHelper;
    private final transient x userPreference;
    @c(USER_GRADE)
    private String user_grade;
    @c(USER_ID)
    private String user_id;
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

    public LogBase(String str) {
        xq.a b10;
        xq.a b11;
        xq.a b12;
        xq.a b13;
        p.h(str, LABEL);
        this.label = str;
        boolean z10 = this instanceof b;
        if (z10) {
            b10 = ((b) this).e();
        } else {
            b10 = getKoin().e().b();
        }
        x xVar = (x) b10.c(f0.b(x.class), null, null);
        this.userPreference = xVar;
        if (z10) {
            b11 = ((b) this).e();
        } else {
            b11 = getKoin().e().b();
        }
        v0 v0Var = (v0) b11.c(f0.b(v0.class), null, null);
        this.userHelper = v0Var;
        if (z10) {
            b12 = ((b) this).e();
        } else {
            b12 = getKoin().e().b();
        }
        e0 e0Var = (e0) b12.c(f0.b(e0.class), null, null);
        this.networkHelper = e0Var;
        if (z10) {
            b13 = ((b) this).e();
        } else {
            b13 = getKoin().e().b();
        }
        Context context = (Context) b13.c(f0.b(Context.class), null, null);
        this.applicationContext = context;
        long currentTimeMillis = System.currentTimeMillis();
        StringBuilder sb2 = new StringBuilder();
        long j10 = 1000;
        sb2.append(currentTimeMillis / j10);
        sb2.append('.');
        sb2.append(currentTimeMillis % j10);
        this.created_at = sb2.toString();
        this.user_id = xVar.T4();
        this.user_grade = String.valueOf(xVar.Z());
        this.unique_device_id = n.c(context);
        this.advertising_id = n.k();
        this.service_name = "mirrorman";
        this.f25296ua = ApiUtil.INSTANCE.userAgent();
        this.os = "A";
        String str2 = Build.VERSION.RELEASE;
        p.g(str2, "RELEASE");
        this.os_ver = str2;
        String language = Locale.getDefault().getLanguage();
        p.g(language, "getDefault().language");
        this.locale = language;
        String id2 = TimeZone.getDefault().getID();
        p.g(id2, "getDefault().id");
        this.tz = id2;
        this.app_ver = BuildConfig.VERSION_CODE;
        this.twitter_connected = v0Var.p() ? 1 : 0;
        this.network_type = e0Var.d() ? "wifi" : "mobile";
    }

    public final String getAdvertising_id() {
        return this.advertising_id;
    }

    public final int getApp_ver() {
        return this.app_ver;
    }

    public final String getCreated_at() {
        return this.created_at;
    }

    @Override // oq.a
    public nq.a getKoin() {
        return a.C0688a.a(this);
    }

    public final String getLabel() {
        return this.label;
    }

    public final String getLocale() {
        return this.locale;
    }

    public final String getNetwork_type() {
        return this.network_type;
    }

    public final String getOs() {
        return this.os;
    }

    public final String getOs_ver() {
        return this.os_ver;
    }

    public final String getPage_id() {
        return this.page_id;
    }

    public final String getService_name() {
        return this.service_name;
    }

    public final int getTwitter_connected() {
        return this.twitter_connected;
    }

    public final String getTz() {
        return this.tz;
    }

    public final String getUa() {
        return this.f25296ua;
    }

    public final String getUnique_device_id() {
        return this.unique_device_id;
    }

    public final String getUser_grade() {
        return this.user_grade;
    }

    public final String getUser_id() {
        return this.user_id;
    }

    public final void setAdvertising_id(String str) {
        p.h(str, "<set-?>");
        this.advertising_id = str;
    }

    public final void setApp_ver(int i10) {
        this.app_ver = i10;
    }

    public final void setCreated_at(String str) {
        p.h(str, "<set-?>");
        this.created_at = str;
    }

    public final void setLabel(String str) {
        p.h(str, "<set-?>");
        this.label = str;
    }

    public final void setLocale(String str) {
        p.h(str, "<set-?>");
        this.locale = str;
    }

    public final void setNetwork_type(String str) {
        p.h(str, "<set-?>");
        this.network_type = str;
    }

    public final void setOs(String str) {
        p.h(str, "<set-?>");
        this.os = str;
    }

    public final void setOs_ver(String str) {
        p.h(str, "<set-?>");
        this.os_ver = str;
    }

    public final void setPage_id(String str) {
        this.page_id = str;
    }

    public final void setService_name(String str) {
        p.h(str, "<set-?>");
        this.service_name = str;
    }

    public final void setTwitter_connected(int i10) {
        this.twitter_connected = i10;
    }

    public final void setTz(String str) {
        p.h(str, "<set-?>");
        this.tz = str;
    }

    public final void setUa(String str) {
        p.h(str, "<set-?>");
        this.f25296ua = str;
    }

    public final void setUnique_device_id(String str) {
        p.h(str, "<set-?>");
        this.unique_device_id = str;
    }

    public final void setUser_grade(String str) {
        p.h(str, "<set-?>");
        this.user_grade = str;
    }

    public final void setUser_id(String str) {
        p.h(str, "<set-?>");
        this.user_id = str;
    }
}

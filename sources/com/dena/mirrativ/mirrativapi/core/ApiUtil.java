package com.dena.mirrativ.mirrativapi.core;

import android.os.Build;
import android.text.TextUtils;
import com.dena.mirrorman.clientlog.logs.LogBase;
import com.dena.mirrorman.clientlog.logs.MRLog;
import com.google.android.exoplayer2.metadata.icy.IcyHeaders;
import com.google.android.exoplayer2.util.MimeTypes;
import ep.c0;
import ep.x;
import ep.y;
import g9.a;
import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import jo.p;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import xm.e;

/* loaded from: classes2.dex */
public final class ApiUtil {
    public static final ApiUtil INSTANCE = new ApiUtil();
    public static final String TWITTER_SIGNUP_TYPE_LOGIN = "login";

    /* loaded from: classes2.dex */
    public static final class AppIds {
        private List<String> app_ids;

        public AppIds(List<String> list) {
            this.app_ids = list;
        }

        public final List<String> getApp_ids() {
            return this.app_ids;
        }

        public final void setApp_ids(List<String> list) {
            this.app_ids = list;
        }
    }

    /* loaded from: classes2.dex */
    public static final class UserIds {
        private List<String> user_ids;

        public UserIds(List<String> list) {
            this.user_ids = list;
        }

        public final List<String> getUser_ids() {
            return this.user_ids;
        }

        public final void setUser_ids(List<String> list) {
            this.user_ids = list;
        }
    }

    private ApiUtil() {
    }

    public final c0 appMyAppRequestBody(String str) {
        p.h(str, "appId");
        ArrayList arrayList = new ArrayList();
        arrayList.add(str);
        return appMyAppRequestBody(arrayList);
    }

    public final String escapeAndSerialize(Collection<String> collection) {
        if (collection == null || collection.isEmpty()) {
            return null;
        }
        StringBuffer stringBuffer = new StringBuffer();
        Iterator<String> it = collection.iterator();
        while (it.hasNext()) {
            stringBuffer.append(it.next());
            if (it.hasNext()) {
                stringBuffer.append(",");
            }
        }
        return stringBuffer.toString();
    }

    public final c0 graphBulkFollowBody(List<String> list) {
        UserIds userIds = new UserIds(list);
        e eVar = new e();
        c0.a aVar = c0.f30798a;
        String s10 = eVar.s(userIds);
        p.g(s10, "gson.toJson(ids)");
        return aVar.d(s10, x.f31036g.b("application/json; charset=utf-8"));
    }

    public final c0 groupEditRequestBody(String str, String str2, File file) {
        p.h(str2, "name");
        boolean z10 = true;
        y.a aVar = new y.a(null, 1, null);
        aVar.f(y.f31045k);
        if (str != null && str.length() != 0) {
            z10 = false;
        }
        if (!z10) {
            aVar.a("group_id", str);
        }
        if (!TextUtils.isEmpty(str2)) {
            aVar.a("name", str2);
        }
        if (file != null) {
            aVar.b("image", "image", c0.f30798a.c(file, x.f31036g.b(MimeTypes.IMAGE_JPEG)));
        }
        return aVar.e();
    }

    public final c0 signatureJwtRequestBody(String str) {
        p.h(str, "signatureJwt");
        y.a aVar = new y.a(null, 1, null);
        aVar.f(y.f31045k);
        if (!TextUtils.isEmpty(str)) {
            aVar.a("signature_jwt", str);
        }
        return aVar.e();
    }

    public final String urlAbout(ServerConfig serverConfig) {
        p.h(serverConfig, "serverConfig");
        return serverConfig.getServerURLwithBasicAuth() + "/about";
    }

    public final String urlForceUpdate(ServerConfig serverConfig) {
        p.h(serverConfig, "serverConfig");
        return serverConfig.getServerURLwithBasicAuth() + "/need_update";
    }

    public final String urlLaw(ServerConfig serverConfig) {
        p.h(serverConfig, "serverConfig");
        return serverConfig.getServerURLwithBasicAuth() + "/page/law";
    }

    public final String urlMaintenance(ServerConfig serverConfig) {
        p.h(serverConfig, "serverConfig");
        return serverConfig.getServerURLwithBasicAuth() + "/maintenance";
    }

    public final String urlPrivacy(ServerConfig serverConfig) {
        p.h(serverConfig, "serverConfig");
        return serverConfig.getServerURLwithBasicAuth() + "/privacy";
    }

    public final String urlTerms(ServerConfig serverConfig) {
        p.h(serverConfig, "serverConfig");
        return serverConfig.getServerURLwithBasicAuth() + "/terms";
    }

    public final String urlTermsPrivacy(ServerConfig serverConfig) {
        p.h(serverConfig, "serverConfig");
        return serverConfig.getServerURLwithBasicAuth() + "/terms_privacy";
    }

    public final String userAgent() {
        String b10;
        String str = Build.MODEL;
        if (str == null) {
            b10 = "";
        } else {
            p.g(str, "MODEL");
            b10 = new so.e("(\\r|\\n)").b(str, " ");
        }
        String str2 = Build.VERSION.RELEASE;
        if (p.c(str2, "Q")) {
            str2 = "9.9";
        }
        return "MR_APP/9.90.1/Android/" + b10 + '/' + str2;
    }

    public final c0 userProfileEditRequestBody(String str, String str2, String str3, File file, String str4, int i10, String str5, String str6, String str7, boolean z10, Integer num, Boolean bool) {
        p.h(str, LogBase.USER_ID);
        boolean z11 = true;
        y.a aVar = new y.a(null, 1, null);
        aVar.f(y.f31045k);
        if (!TextUtils.isEmpty(str)) {
            aVar.a(LogBase.USER_ID, str);
        }
        if (!(str2 == null || str2.length() == 0)) {
            aVar.a("name", str2);
        }
        if (str5 != null) {
            aVar.a("custom_thanks_message", str5);
        }
        if (str3 != null) {
            aVar.a(MRLog.PAYLOAD_KEY_DESCRIPTION, str3);
        }
        if (file != null) {
            aVar.b("profile_image", "profile_image", c0.f30798a.c(file, x.f31036g.b(MimeTypes.IMAGE_JPEG)));
        }
        if (str4 != null) {
            JSONArray jSONArray = new JSONArray();
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("url", str4);
            } catch (JSONException e10) {
                a.c(e10);
            }
            jSONArray.put(jSONObject);
            String jSONArray2 = jSONArray.toString();
            p.g(jSONArray2, "links.toString()");
            aVar.a("links", jSONArray2);
        }
        aVar.a("include_urge_users", String.valueOf(i10));
        if (str6 != null) {
            aVar.a("dynamic_link", str6);
        }
        if (str7 != null && str7.length() != 0) {
            z11 = false;
        }
        if (!z11) {
            aVar.a("birthday", str7);
        }
        String str8 = IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE;
        if (z10) {
            aVar.a("is_avatar_uploaded", IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE);
        }
        if (num != null) {
            aVar.a("label_ribbon_id", num.toString());
        }
        if (bool != null) {
            if (!bool.booleanValue()) {
                str8 = "0";
            }
            aVar.a("is_visible_birthday", str8);
        }
        return aVar.e();
    }

    public final c0 appMyAppRequestBody(List<String> list) {
        AppIds appIds = new AppIds(list);
        e eVar = new e();
        c0.a aVar = c0.f30798a;
        String s10 = eVar.s(appIds);
        p.g(s10, "gson.toJson(ids)");
        return aVar.d(s10, x.f31036g.b("application/json; charset=utf-8"));
    }

    public final c0 userProfileEditRequestBody(String str, boolean z10) {
        p.h(str, "name");
        y.a aVar = new y.a(null, 1, null);
        aVar.f(y.f31045k);
        aVar.a(str, z10 ? IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE : "0");
        return aVar.e();
    }
}

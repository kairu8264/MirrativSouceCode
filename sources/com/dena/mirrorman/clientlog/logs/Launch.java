package com.dena.mirrorman.clientlog.logs;

import android.os.Build;
import com.dena.mirrorman.net.api.Referer;
import com.google.android.exoplayer2.metadata.icy.IcyHeaders;
import java.util.HashMap;
import jo.p;
import xm.e;
import xn.o;

/* loaded from: classes2.dex */
public final class Launch extends ActionLogBase {
    public static final int $stable = 0;

    /* loaded from: classes2.dex */
    public static final class DynamicLinksData extends ActionLogBase {
        public static final int $stable = 0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public DynamicLinksData(String str) {
            super("dynamic_links_data", MRLog.TARGET_TYPE_SERVICE, "");
            p.h(str, "url");
            this.payload.put("url", str);
        }
    }

    /* loaded from: classes2.dex */
    public static final class DynamicLinksInstall extends ActionLogBase {
        public static final int $stable = 0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public DynamicLinksInstall(String str) {
            super("dynamic_links_install", MRLog.TARGET_TYPE_SERVICE, "");
            p.h(str, "url");
            this.payload.put("url", str);
        }
    }

    /* loaded from: classes2.dex */
    public static final class FirstLaunch extends ActionLogBase {
        public static final int $stable = 0;

        public FirstLaunch(String str) {
            super("first_launch", MRLog.TARGET_TYPE_SERVICE, "");
            HashMap<String, String> hashMap = this.payload;
            p.e(str);
            hashMap.put("tracking_code", str);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Launch(boolean z10, String str, double d10, String str2) {
        super("launch", MRLog.TARGET_TYPE_SERVICE, "");
        p.h(str, "launchType");
        p.h(str2, "packageName");
        this.payload.put(Referer.PUSH_NOTIFICATION, z10 ? IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE : "0");
        HashMap hashMap = new HashMap();
        hashMap.put("launch_type", str);
        hashMap.put("launch_time", String.valueOf(d10));
        String str3 = Build.FINGERPRINT;
        p.g(str3, "FINGERPRINT");
        hashMap.put("fingerprint", str3);
        String str4 = Build.MANUFACTURER;
        p.g(str4, "MANUFACTURER");
        hashMap.put("manufacturer", str4);
        String str5 = Build.PRODUCT;
        p.g(str5, "PRODUCT");
        hashMap.put("product", str5);
        String str6 = Build.MODEL;
        p.g(str6, "MODEL");
        hashMap.put("model", str6);
        String[] strArr = Build.SUPPORTED_32_BIT_ABIS;
        p.g(strArr, "SUPPORTED_32_BIT_ABIS");
        hashMap.put("supported_32_bit", o.Q(strArr, null, null, null, 0, null, null, 63, null));
        String[] strArr2 = Build.SUPPORTED_64_BIT_ABIS;
        p.g(strArr2, "SUPPORTED_64_BIT_ABIS");
        hashMap.put("supported_64_bit", o.Q(strArr2, null, null, null, 0, null, null, 63, null));
        hashMap.put("package_name", str2);
        String radioVersion = Build.getRadioVersion();
        if (radioVersion != null) {
            hashMap.put("radio_version", radioVersion);
        }
        HashMap<String, String> hashMap2 = this.payload;
        String s10 = new e().s(hashMap);
        p.g(s10, "Gson().toJson(targetDetailParams)");
        hashMap2.put(MRLog.PAYLOAD_KEY_TARGET_DETAIL, s10);
    }
}

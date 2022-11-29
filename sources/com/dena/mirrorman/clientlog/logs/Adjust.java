package com.dena.mirrorman.clientlog.logs;

import java.util.HashMap;
import p6.f;

/* loaded from: classes2.dex */
public final class Adjust {
    public static final int $stable = 0;

    /* loaded from: classes2.dex */
    public static final class AttributionChanged extends ActionLogBase {
        public static final int $stable = 0;

        public AttributionChanged(f fVar) {
            super("adjust.attribution_changed", "", "");
            HashMap<String, String> hashMap = this.payload;
            String str = fVar != null ? fVar.f45922w : null;
            hashMap.put("adjust_tracker_token", str == null ? "" : str);
            HashMap<String, String> hashMap2 = this.payload;
            String str2 = fVar != null ? fVar.f45923x : null;
            hashMap2.put("adjust_tracker_name", str2 == null ? "" : str2);
            HashMap<String, String> hashMap3 = this.payload;
            String str3 = fVar != null ? fVar.f45924y : null;
            hashMap3.put("adjust_network", str3 == null ? "" : str3);
            HashMap<String, String> hashMap4 = this.payload;
            String str4 = fVar != null ? fVar.f45925z : null;
            hashMap4.put("adjust_campaign", str4 == null ? "" : str4);
            HashMap<String, String> hashMap5 = this.payload;
            String str5 = fVar != null ? fVar.A : null;
            hashMap5.put("adjust_adgroup", str5 == null ? "" : str5);
            HashMap<String, String> hashMap6 = this.payload;
            String str6 = fVar != null ? fVar.B : null;
            hashMap6.put("adjust_creative", str6 == null ? "" : str6);
            HashMap<String, String> hashMap7 = this.payload;
            String str7 = fVar != null ? fVar.C : null;
            hashMap7.put("adjust_click_label", str7 != null ? str7 : "");
        }
    }
}

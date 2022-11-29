package com.dena.mirrorman.clientlog.logs;

import com.dena.mirrorman.clientlog.logs.MRLog;
import com.dena.mirrorman.clientlog.logs.detail.CatalogTargetDetail;
import java.util.ArrayList;
import java.util.List;
import jo.p;
import kf.x;
import wn.q;
import xn.s;

/* loaded from: classes2.dex */
public final class LiveCatalogVisibleLogger {
    public static final int $stable = 8;
    private final List<String> alreadySentLogKeys;
    private final MRLogger logger;
    private final x userPreference;

    public LiveCatalogVisibleLogger(x xVar, MRLogger mRLogger) {
        p.h(xVar, "userPreference");
        p.h(mRLogger, "logger");
        this.userPreference = xVar;
        this.logger = mRLogger;
        this.alreadySentLogKeys = new ArrayList();
    }

    public final int getAlreadySentLogCount() {
        return this.alreadySentLogKeys.size();
    }

    public final void sendLiveCatalogVisibleLog(String str, String str2, int i10, int i11, String str3, String str4, String str5, String str6, String str7) {
        p.h(str, "referer");
        p.h(str2, "liveId");
        p.h(str3, "recommendText");
        p.h(str4, "catalogSelectedAppId");
        p.h(str5, "castId");
        String str8 = this.userPreference.T4() + '_' + str + '_' + str2 + '_' + i10 + '_' + i11 + '_' + str4 + '_' + str5 + '_' + str7;
        if (this.alreadySentLogKeys.contains(str8)) {
            return;
        }
        this.alreadySentLogKeys.add(str8);
        MRLogger mRLogger = this.logger;
        MRLog.Companion companion = MRLog.Companion;
        MRLog.Builder builder = new MRLog.Builder(MRLog.ACTION_TYPE_LIVE_CATALOG_VISIBLE);
        builder.setPageId(str);
        builder.setPayload(s.m(q.a(MRLog.PAYLOAD_KEY_TARGET_DETAIL, new CatalogTargetDetail(str2, i10, i11, str3, str4, str6, str7).toArrayJson()), q.a(MRLog.PAYLOAD_KEY_CAST_ID, str5)));
        mRLogger.sendLog(builder.build());
    }
}

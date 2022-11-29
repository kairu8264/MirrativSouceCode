package com.dena.mirrorman.clientlog.logs;

import com.dena.mirrorman.clientlog.logs.MRLog;
import com.dena.mirrorman.clientlog.logs.detail.NoticeCampaignPageTargetDetail;
import com.dena.mirrorman.clientlog.logs.detail.NoticeCampaignPageVisibleTargetDetail;
import com.dena.mirrorman.net.api.response.notice.CampaignNotice;
import java.util.ArrayList;
import java.util.List;
import jo.p;
import wn.q;
import xn.r;

/* loaded from: classes2.dex */
public final class NoticeCampaignVisibleLogger {
    public static final int $stable = 8;
    private final List<String> alreadySentLogKeys;
    private final MRLogger logger;

    public NoticeCampaignVisibleLogger(MRLogger mRLogger) {
        p.h(mRLogger, "logger");
        this.logger = mRLogger;
        this.alreadySentLogKeys = new ArrayList();
    }

    public final void sendNoticeCampaignVisibleLog(CampaignNotice campaignNotice, String str) {
        p.h(campaignNotice, "campaignNotice");
        p.h(str, "referer");
        String str2 = campaignNotice.getId() + '-' + str;
        if (this.alreadySentLogKeys.contains(str2)) {
            return;
        }
        this.alreadySentLogKeys.add(str2);
        MRLogger mRLogger = this.logger;
        MRLog.Companion companion = MRLog.Companion;
        MRLog.Builder builder = new MRLog.Builder(MRLog.ACTION_TYPE_NOTICE_CAGALOG_VISIBLE);
        builder.setPageId(str);
        builder.setPayload(r.d(q.a(MRLog.PAYLOAD_KEY_TARGET_DETAIL, new NoticeCampaignPageVisibleTargetDetail(r.d(new NoticeCampaignPageTargetDetail(campaignNotice)), null).toJson())));
        mRLogger.sendLog(builder.build());
    }
}

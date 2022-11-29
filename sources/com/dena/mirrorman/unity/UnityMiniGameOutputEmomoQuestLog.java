package com.dena.mirrorman.unity;

import jo.p;

/* loaded from: classes3.dex */
public final class UnityMiniGameOutputEmomoQuestLog {
    public static final int $stable = 0;
    private final String actionType;
    private final String targetDetail;

    public UnityMiniGameOutputEmomoQuestLog(String str, String str2) {
        p.h(str, "actionType");
        p.h(str2, "targetDetail");
        this.actionType = str;
        this.targetDetail = str2;
    }

    public static /* synthetic */ UnityMiniGameOutputEmomoQuestLog copy$default(UnityMiniGameOutputEmomoQuestLog unityMiniGameOutputEmomoQuestLog, String str, String str2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = unityMiniGameOutputEmomoQuestLog.actionType;
        }
        if ((i10 & 2) != 0) {
            str2 = unityMiniGameOutputEmomoQuestLog.targetDetail;
        }
        return unityMiniGameOutputEmomoQuestLog.copy(str, str2);
    }

    public final String component1() {
        return this.actionType;
    }

    public final String component2() {
        return this.targetDetail;
    }

    public final UnityMiniGameOutputEmomoQuestLog copy(String str, String str2) {
        p.h(str, "actionType");
        p.h(str2, "targetDetail");
        return new UnityMiniGameOutputEmomoQuestLog(str, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof UnityMiniGameOutputEmomoQuestLog) {
            UnityMiniGameOutputEmomoQuestLog unityMiniGameOutputEmomoQuestLog = (UnityMiniGameOutputEmomoQuestLog) obj;
            return p.c(this.actionType, unityMiniGameOutputEmomoQuestLog.actionType) && p.c(this.targetDetail, unityMiniGameOutputEmomoQuestLog.targetDetail);
        }
        return false;
    }

    public final String getActionType() {
        return this.actionType;
    }

    public final String getTargetDetail() {
        return this.targetDetail;
    }

    public int hashCode() {
        return (this.actionType.hashCode() * 31) + this.targetDetail.hashCode();
    }

    public String toString() {
        return "UnityMiniGameOutputEmomoQuestLog(actionType=" + this.actionType + ", targetDetail=" + this.targetDetail + ')';
    }
}

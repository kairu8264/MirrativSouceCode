package com.dena.mirrorman.net.api.response;

import com.dena.mirrativ.mirrativapi.closet.ClosetAvatar;
import com.dena.mirrativ.mirrativapi.core.Status;
import com.dena.mirrorman.net.api.Referer;
import java.util.List;
import jo.p;

/* loaded from: classes2.dex */
public final class UniqueEmomoGiftEffectInfoResponse {
    public static final int $stable = 8;
    private final ClosetAvatar avatar;
    private final Status status;
    private final List<UniqueEmomoGiftUnityTextConfig> texts;
    private final String unityMotionName;
    private final String unityPresetName;

    public UniqueEmomoGiftEffectInfoResponse(ClosetAvatar closetAvatar, List<UniqueEmomoGiftUnityTextConfig> list, String str, String str2, Status status) {
        p.h(closetAvatar, Referer.AVATAR);
        p.h(list, "texts");
        p.h(str, "unityPresetName");
        p.h(str2, "unityMotionName");
        p.h(status, "status");
        this.avatar = closetAvatar;
        this.texts = list;
        this.unityPresetName = str;
        this.unityMotionName = str2;
        this.status = status;
    }

    public static /* synthetic */ UniqueEmomoGiftEffectInfoResponse copy$default(UniqueEmomoGiftEffectInfoResponse uniqueEmomoGiftEffectInfoResponse, ClosetAvatar closetAvatar, List list, String str, String str2, Status status, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            closetAvatar = uniqueEmomoGiftEffectInfoResponse.avatar;
        }
        List<UniqueEmomoGiftUnityTextConfig> list2 = list;
        if ((i10 & 2) != 0) {
            list2 = uniqueEmomoGiftEffectInfoResponse.texts;
        }
        List list3 = list2;
        if ((i10 & 4) != 0) {
            str = uniqueEmomoGiftEffectInfoResponse.unityPresetName;
        }
        String str3 = str;
        if ((i10 & 8) != 0) {
            str2 = uniqueEmomoGiftEffectInfoResponse.unityMotionName;
        }
        String str4 = str2;
        if ((i10 & 16) != 0) {
            status = uniqueEmomoGiftEffectInfoResponse.status;
        }
        return uniqueEmomoGiftEffectInfoResponse.copy(closetAvatar, list3, str3, str4, status);
    }

    public final ClosetAvatar component1() {
        return this.avatar;
    }

    public final List<UniqueEmomoGiftUnityTextConfig> component2() {
        return this.texts;
    }

    public final String component3() {
        return this.unityPresetName;
    }

    public final String component4() {
        return this.unityMotionName;
    }

    public final Status component5() {
        return this.status;
    }

    public final UniqueEmomoGiftEffectInfoResponse copy(ClosetAvatar closetAvatar, List<UniqueEmomoGiftUnityTextConfig> list, String str, String str2, Status status) {
        p.h(closetAvatar, Referer.AVATAR);
        p.h(list, "texts");
        p.h(str, "unityPresetName");
        p.h(str2, "unityMotionName");
        p.h(status, "status");
        return new UniqueEmomoGiftEffectInfoResponse(closetAvatar, list, str, str2, status);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof UniqueEmomoGiftEffectInfoResponse) {
            UniqueEmomoGiftEffectInfoResponse uniqueEmomoGiftEffectInfoResponse = (UniqueEmomoGiftEffectInfoResponse) obj;
            return p.c(this.avatar, uniqueEmomoGiftEffectInfoResponse.avatar) && p.c(this.texts, uniqueEmomoGiftEffectInfoResponse.texts) && p.c(this.unityPresetName, uniqueEmomoGiftEffectInfoResponse.unityPresetName) && p.c(this.unityMotionName, uniqueEmomoGiftEffectInfoResponse.unityMotionName) && p.c(this.status, uniqueEmomoGiftEffectInfoResponse.status);
        }
        return false;
    }

    public final ClosetAvatar getAvatar() {
        return this.avatar;
    }

    public final Status getStatus() {
        return this.status;
    }

    public final List<UniqueEmomoGiftUnityTextConfig> getTexts() {
        return this.texts;
    }

    public final String getUnityMotionName() {
        return this.unityMotionName;
    }

    public final String getUnityPresetName() {
        return this.unityPresetName;
    }

    public int hashCode() {
        return (((((((this.avatar.hashCode() * 31) + this.texts.hashCode()) * 31) + this.unityPresetName.hashCode()) * 31) + this.unityMotionName.hashCode()) * 31) + this.status.hashCode();
    }

    public String toString() {
        return "UniqueEmomoGiftEffectInfoResponse(avatar=" + this.avatar + ", texts=" + this.texts + ", unityPresetName=" + this.unityPresetName + ", unityMotionName=" + this.unityMotionName + ", status=" + this.status + ')';
    }
}

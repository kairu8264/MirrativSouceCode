package com.dena.mirrorman.net.api.response.live;

import com.dena.mirrorman.clientlog.logs.MRLog;
import com.dena.mirrorman.net.api.response.user.UserBasicParams;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import java.io.Serializable;
import jo.p;
import ym.c;

/* loaded from: classes2.dex */
public final class GroupShotItem implements Serializable {
    public static final int $stable = 8;
    private final String comment;
    @c("group_shot_id")

    /* renamed from: id  reason: collision with root package name */
    private final String f26166id;
    private final String imagePath;
    private final LiveBasicParams live;
    private final UserBasicParams user;

    public GroupShotItem(String str, UserBasicParams userBasicParams, LiveBasicParams liveBasicParams, String str2, String str3) {
        p.h(str, TtmlNode.ATTR_ID);
        p.h(userBasicParams, MRLog.TARGET_TYPE_USER);
        p.h(str2, "imagePath");
        p.h(str3, "comment");
        this.f26166id = str;
        this.user = userBasicParams;
        this.live = liveBasicParams;
        this.imagePath = str2;
        this.comment = str3;
    }

    public static /* synthetic */ GroupShotItem copy$default(GroupShotItem groupShotItem, String str, UserBasicParams userBasicParams, LiveBasicParams liveBasicParams, String str2, String str3, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = groupShotItem.f26166id;
        }
        if ((i10 & 2) != 0) {
            userBasicParams = groupShotItem.user;
        }
        UserBasicParams userBasicParams2 = userBasicParams;
        if ((i10 & 4) != 0) {
            liveBasicParams = groupShotItem.live;
        }
        LiveBasicParams liveBasicParams2 = liveBasicParams;
        if ((i10 & 8) != 0) {
            str2 = groupShotItem.imagePath;
        }
        String str4 = str2;
        if ((i10 & 16) != 0) {
            str3 = groupShotItem.comment;
        }
        return groupShotItem.copy(str, userBasicParams2, liveBasicParams2, str4, str3);
    }

    public final String component1() {
        return this.f26166id;
    }

    public final UserBasicParams component2() {
        return this.user;
    }

    public final LiveBasicParams component3() {
        return this.live;
    }

    public final String component4() {
        return this.imagePath;
    }

    public final String component5() {
        return this.comment;
    }

    public final GroupShotItem copy(String str, UserBasicParams userBasicParams, LiveBasicParams liveBasicParams, String str2, String str3) {
        p.h(str, TtmlNode.ATTR_ID);
        p.h(userBasicParams, MRLog.TARGET_TYPE_USER);
        p.h(str2, "imagePath");
        p.h(str3, "comment");
        return new GroupShotItem(str, userBasicParams, liveBasicParams, str2, str3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof GroupShotItem) {
            GroupShotItem groupShotItem = (GroupShotItem) obj;
            return p.c(this.f26166id, groupShotItem.f26166id) && p.c(this.user, groupShotItem.user) && p.c(this.live, groupShotItem.live) && p.c(this.imagePath, groupShotItem.imagePath) && p.c(this.comment, groupShotItem.comment);
        }
        return false;
    }

    public final String getComment() {
        return this.comment;
    }

    public final String getId() {
        return this.f26166id;
    }

    public final String getImagePath() {
        return this.imagePath;
    }

    public final LiveBasicParams getLive() {
        return this.live;
    }

    public final UserBasicParams getUser() {
        return this.user;
    }

    public int hashCode() {
        int hashCode = ((this.f26166id.hashCode() * 31) + this.user.hashCode()) * 31;
        LiveBasicParams liveBasicParams = this.live;
        return ((((hashCode + (liveBasicParams == null ? 0 : liveBasicParams.hashCode())) * 31) + this.imagePath.hashCode()) * 31) + this.comment.hashCode();
    }

    public String toString() {
        return "GroupShotItem(id=" + this.f26166id + ", user=" + this.user + ", live=" + this.live + ", imagePath=" + this.imagePath + ", comment=" + this.comment + ')';
    }
}

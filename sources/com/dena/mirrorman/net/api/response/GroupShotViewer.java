package com.dena.mirrorman.net.api.response;

import com.dena.mirrativ.mirrativapi.closet.ClosetAvatar;
import com.dena.mirrorman.clientlog.logs.MRLog;
import com.dena.mirrorman.net.api.Referer;
import com.dena.mirrorman.net.api.response.user.UserBasicParams;
import jo.p;

/* loaded from: classes2.dex */
public final class GroupShotViewer {
    public static final int $stable = 8;
    private final ClosetAvatar avatar;
    private final UserBasicParams user;

    public GroupShotViewer(UserBasicParams userBasicParams, ClosetAvatar closetAvatar) {
        p.h(userBasicParams, MRLog.TARGET_TYPE_USER);
        p.h(closetAvatar, Referer.AVATAR);
        this.user = userBasicParams;
        this.avatar = closetAvatar;
    }

    public static /* synthetic */ GroupShotViewer copy$default(GroupShotViewer groupShotViewer, UserBasicParams userBasicParams, ClosetAvatar closetAvatar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            userBasicParams = groupShotViewer.user;
        }
        if ((i10 & 2) != 0) {
            closetAvatar = groupShotViewer.avatar;
        }
        return groupShotViewer.copy(userBasicParams, closetAvatar);
    }

    public final UserBasicParams component1() {
        return this.user;
    }

    public final ClosetAvatar component2() {
        return this.avatar;
    }

    public final GroupShotViewer copy(UserBasicParams userBasicParams, ClosetAvatar closetAvatar) {
        p.h(userBasicParams, MRLog.TARGET_TYPE_USER);
        p.h(closetAvatar, Referer.AVATAR);
        return new GroupShotViewer(userBasicParams, closetAvatar);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof GroupShotViewer) {
            GroupShotViewer groupShotViewer = (GroupShotViewer) obj;
            return p.c(this.user, groupShotViewer.user) && p.c(this.avatar, groupShotViewer.avatar);
        }
        return false;
    }

    public final ClosetAvatar getAvatar() {
        return this.avatar;
    }

    public final UserBasicParams getUser() {
        return this.user;
    }

    public int hashCode() {
        return (this.user.hashCode() * 31) + this.avatar.hashCode();
    }

    public String toString() {
        return "GroupShotViewer(user=" + this.user + ", avatar=" + this.avatar + ')';
    }
}

package com.dena.mirrorman.clientlog.logs;

import com.dena.mirrorman.net.api.Referer;

/* loaded from: classes2.dex */
public enum EventBannerWhere {
    VIEW_COMMENT_LIST("view_comment_list"),
    VIEW_GIFT_PANEL("view_gift_panel"),
    CAST_COMMENT_LIST("cast_comment_list"),
    CAST_CLOSET("cast_closet"),
    CAST_UPPER_RIGHT("cast_upper_right"),
    CAST_LOWER_RIGHT("cast_lower_right"),
    AVATAR_CLOSET("avatar_closet"),
    MY_PAGE(Referer.MY_PAGE),
    HOME_APP_SELECTED("home_app_selected"),
    LIVE_PREPARATION(Referer.LIVE_PREPARATION);
    
    private final String rawValue;

    EventBannerWhere(String str) {
        this.rawValue = str;
    }

    public final String getRawValue() {
        return this.rawValue;
    }
}

package gc;

import com.dena.mirrorman.net.api.response.live.LinkedLive;
import com.dena.mirrorman.net.api.response.user.UserBadgeImageUrl;
import com.dena.mirrorman.net.api.response.user.UserBasicWithGraphParams;
import com.dena.mirrorman.net.api.response.user.UserOnLive;

/* loaded from: classes2.dex */
public final class t {

    /* renamed from: a  reason: collision with root package name */
    public static final int f33094a = xb.p.item_live_link_broadcaster;

    public static final LinkedLive b(UserBasicWithGraphParams userBasicWithGraphParams) {
        UserOnLive onlive;
        if (userBasicWithGraphParams == null || (onlive = userBasicWithGraphParams.getOnlive()) == null) {
            return null;
        }
        String liveId = onlive.getLiveId();
        String profileImageUrl = userBasicWithGraphParams.getProfileImageUrl();
        UserBadgeImageUrl userBadgeImageUrl = (UserBadgeImageUrl) xn.a0.a0(userBasicWithGraphParams.getBadges(), 0);
        return new LinkedLive(liveId, profileImageUrl, userBadgeImageUrl != null ? userBadgeImageUrl.getImageUrl() : null, userBasicWithGraphParams.getName(), userBasicWithGraphParams.getUserId());
    }

    public static final int c() {
        return f33094a;
    }
}

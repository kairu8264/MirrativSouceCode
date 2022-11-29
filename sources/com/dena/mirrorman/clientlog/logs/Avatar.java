package com.dena.mirrorman.clientlog.logs;

import com.dena.mirrorman.net.api.Referer;
import com.google.android.exoplayer2.metadata.icy.IcyHeaders;
import jo.p;

/* loaded from: classes2.dex */
public final class Avatar {
    public static final int $stable = 0;

    /* loaded from: classes2.dex */
    public static final class AvatarCloseCloset extends ActionLogBase {
        public static final int $stable = 0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AvatarCloseCloset(String str) {
            super("avatar.close_closet");
            p.h(str, "liveId");
            if (str.length() > 0) {
                this.payload.put(ActionLogBase.TARGET_TYPE, MRLog.TARGET_TYPE_LIVE);
                this.payload.put(ActionLogBase.TARGET_ID, str);
            }
        }
    }

    /* loaded from: classes2.dex */
    public static final class AvatarGesture extends ActionLogBase {
        public static final int $stable = 0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AvatarGesture(String str, String str2) {
            super(MRLog.ACTION_TYPE_AVATAR_GESTURE);
            p.h(str, "liveId");
            p.h(str2, "gesture");
            this.payload.put(MRLog.PAYLOAD_KEY_TARGET_DETAIL, str2);
            if (str.length() > 0) {
                this.payload.put(ActionLogBase.TARGET_TYPE, MRLog.TARGET_TYPE_LIVE);
                this.payload.put(ActionLogBase.TARGET_ID, str);
            }
        }
    }

    /* loaded from: classes2.dex */
    public static final class AvatarSelectPose extends ActionLogBase {
        public static final int $stable = 0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AvatarSelectPose(String str) {
            super("avatar.select_pose");
            p.h(str, "poseId");
            this.payload.put(ActionLogBase.TARGET_TYPE, "pose");
            this.payload.put(ActionLogBase.TARGET_ID, str);
        }
    }

    /* loaded from: classes2.dex */
    public static final class AvatarTakePicture extends ActionLogBase {
        public static final int $stable = 0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AvatarTakePicture(String str) {
            super("avatar.take_picture");
            p.h(str, "liveId");
            if (str.length() > 0) {
                this.payload.put(ActionLogBase.TARGET_TYPE, MRLog.TARGET_TYPE_LIVE);
                this.payload.put(ActionLogBase.TARGET_ID, str);
            }
        }
    }

    /* loaded from: classes2.dex */
    public static final class AvatarUpdateProfile extends ActionLogBase {
        public static final int $stable = 0;

        public AvatarUpdateProfile(boolean z10) {
            super("avatar.update_profile");
            this.payload.put(MRLog.PAYLOAD_KEY_TARGET_DETAIL, z10 ? IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE : "0");
        }
    }

    /* loaded from: classes2.dex */
    public static final class AvatarZoom extends ActionLogBase {
        public static final int $stable = 0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AvatarZoom(String str, String str2) {
            super(MRLog.ACTION_TYPE_AVATAR_ZOOM, "", str);
            p.h(str, "targetId");
            p.h(str2, "targetDetail");
            this.payload.put(MRLog.PAYLOAD_KEY_TARGET_DETAIL, str2);
        }
    }

    /* loaded from: classes2.dex */
    public enum EmomoTabPageId {
        BOTTOM_NAV("live_view.bottom_nav"),
        BOTTOM_NAV_ANNOUNCEMENT("live_view.bottom_nav_announcement"),
        HOME(Referer.HOME);
        
        private final String rawValue;

        EmomoTabPageId(String str) {
            this.rawValue = str;
        }

        public final String getRawValue() {
            return this.rawValue;
        }
    }

    /* loaded from: classes2.dex */
    public static final class EmomoTabPermission extends ActionLogBase {
        public static final int $stable = 0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public EmomoTabPermission(String str, boolean z10) {
            super("avatar.emomo_tab_permission", "permission", str);
            p.h(str, "type");
            this.payload.put(MRLog.PAYLOAD_KEY_TARGET_DETAIL, z10 ? IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE : "0");
        }
    }

    /* loaded from: classes2.dex */
    public static final class EmomoTabTutorial extends ActionLogBase {
        public static final int $stable = 0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public EmomoTabTutorial(String str, String str2) {
            super("avatar.emomo_tab_tutorial");
            p.h(str, "liveId");
            p.h(str2, MRLog.PAYLOAD_KEY_STEP);
            this.payload.put(MRLog.PAYLOAD_KEY_STEP, str2);
            if (str.length() > 0) {
                this.payload.put(ActionLogBase.TARGET_TYPE, MRLog.TARGET_TYPE_LIVE);
                this.payload.put(ActionLogBase.TARGET_ID, str);
            }
        }
    }

    /* loaded from: classes2.dex */
    public static final class LaunchEmomoTab extends ActionLogBase {
        public static final int $stable = 0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public LaunchEmomoTab(EmomoTabPageId emomoTabPageId) {
            super("avatar.launch_emomo_tab", emomoTabPageId.getRawValue());
            p.h(emomoTabPageId, "pageId");
        }
    }
}

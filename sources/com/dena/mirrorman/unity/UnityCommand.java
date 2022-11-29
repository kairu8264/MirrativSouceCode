package com.dena.mirrorman.unity;

import android.util.Base64;
import com.dena.mirrorman.net.api.response.event.ShooterMemberAvatar;
import com.dena.mirrorman.net.api.response.event.ShooterPartyType;
import com.unity3d.player.UnityPlayer;
import de.d;
import ff.c;
import g9.a;
import jo.h;
import jo.p;
import nd.r0;
import xm.e;

/* loaded from: classes3.dex */
public abstract class UnityCommand {
    public static final int $stable = 0;

    private UnityCommand() {
    }

    public /* synthetic */ UnityCommand(h hVar) {
        this();
    }

    public abstract String buildMessage();

    public abstract GameObject getGameObject();

    public final void sendMessage() {
        String simpleName = getClass().getSimpleName();
        if (p.c(simpleName, "SetShooterGameAvatarModel")) {
            simpleName = "SetMiniGameAvatarModel";
        }
        String buildMessage = buildMessage();
        a.g(getGameObject().getRawValue() + ' ' + simpleName + ' ' + buildMessage);
        c d10 = r0.f42205a.d();
        String rawValue = getGameObject().getRawValue();
        p.g(simpleName, "method");
        d10.a(rawValue, simpleName, buildMessage);
        UnityPlayer.UnitySendMessage(getGameObject().getRawValue(), simpleName, buildMessage);
    }

    /* loaded from: classes3.dex */
    public static final class AddClosetDolly extends UnityCommand {
        public static final int $stable = 0;
        private final GameObject gameObject;
        private final float scale;

        public /* synthetic */ AddClosetDolly(float f10, GameObject gameObject, int i10, h hVar) {
            this(f10, (i10 & 2) != 0 ? GameObject.SCENE_MANAGER : gameObject);
        }

        private final float component1() {
            return this.scale;
        }

        public static /* synthetic */ AddClosetDolly copy$default(AddClosetDolly addClosetDolly, float f10, GameObject gameObject, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                f10 = addClosetDolly.scale;
            }
            if ((i10 & 2) != 0) {
                gameObject = addClosetDolly.getGameObject();
            }
            return addClosetDolly.copy(f10, gameObject);
        }

        @Override // com.dena.mirrorman.unity.UnityCommand
        public String buildMessage() {
            return d.a(this.scale);
        }

        public final GameObject component2() {
            return getGameObject();
        }

        public final AddClosetDolly copy(float f10, GameObject gameObject) {
            p.h(gameObject, "gameObject");
            return new AddClosetDolly(f10, gameObject);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof AddClosetDolly) {
                AddClosetDolly addClosetDolly = (AddClosetDolly) obj;
                return p.c(Float.valueOf(this.scale), Float.valueOf(addClosetDolly.scale)) && getGameObject() == addClosetDolly.getGameObject();
            }
            return false;
        }

        @Override // com.dena.mirrorman.unity.UnityCommand
        public GameObject getGameObject() {
            return this.gameObject;
        }

        public int hashCode() {
            return (Float.hashCode(this.scale) * 31) + getGameObject().hashCode();
        }

        public String toString() {
            return "AddClosetDolly(scale=" + this.scale + ", gameObject=" + getGameObject() + ')';
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AddClosetDolly(float f10, GameObject gameObject) {
            super(null);
            p.h(gameObject, "gameObject");
            this.scale = f10;
            this.gameObject = gameObject;
        }
    }

    /* loaded from: classes3.dex */
    public static final class AddClosetRotation extends UnityCommand {
        public static final int $stable = 0;
        private final float dx;
        private final float dy;
        private final GameObject gameObject;

        public /* synthetic */ AddClosetRotation(float f10, float f11, GameObject gameObject, int i10, h hVar) {
            this(f10, f11, (i10 & 4) != 0 ? GameObject.SCENE_MANAGER : gameObject);
        }

        private final float component1() {
            return this.dx;
        }

        private final float component2() {
            return this.dy;
        }

        public static /* synthetic */ AddClosetRotation copy$default(AddClosetRotation addClosetRotation, float f10, float f11, GameObject gameObject, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                f10 = addClosetRotation.dx;
            }
            if ((i10 & 2) != 0) {
                f11 = addClosetRotation.dy;
            }
            if ((i10 & 4) != 0) {
                gameObject = addClosetRotation.getGameObject();
            }
            return addClosetRotation.copy(f10, f11, gameObject);
        }

        @Override // com.dena.mirrorman.unity.UnityCommand
        public String buildMessage() {
            return d.a(this.dx) + ',' + d.a(this.dy) + ",0";
        }

        public final GameObject component3() {
            return getGameObject();
        }

        public final AddClosetRotation copy(float f10, float f11, GameObject gameObject) {
            p.h(gameObject, "gameObject");
            return new AddClosetRotation(f10, f11, gameObject);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof AddClosetRotation) {
                AddClosetRotation addClosetRotation = (AddClosetRotation) obj;
                return p.c(Float.valueOf(this.dx), Float.valueOf(addClosetRotation.dx)) && p.c(Float.valueOf(this.dy), Float.valueOf(addClosetRotation.dy)) && getGameObject() == addClosetRotation.getGameObject();
            }
            return false;
        }

        @Override // com.dena.mirrorman.unity.UnityCommand
        public GameObject getGameObject() {
            return this.gameObject;
        }

        public int hashCode() {
            return (((Float.hashCode(this.dx) * 31) + Float.hashCode(this.dy)) * 31) + getGameObject().hashCode();
        }

        public String toString() {
            return "AddClosetRotation(dx=" + this.dx + ", dy=" + this.dy + ", gameObject=" + getGameObject() + ')';
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AddClosetRotation(float f10, float f11, GameObject gameObject) {
            super(null);
            p.h(gameObject, "gameObject");
            this.dx = f10;
            this.dy = f11;
            this.gameObject = gameObject;
        }
    }

    /* loaded from: classes3.dex */
    public static final class CaptureRichUniqueGiftScreenshot extends UnityCommand {
        public static final int $stable = 0;
        private final UnityScreenShotAvatarPosition avatarPosition;
        private final GameObject gameObject;
        private final int imageHeight;
        private final String imagePath;
        private final int imageWidth;
        private final String key;

        public /* synthetic */ CaptureRichUniqueGiftScreenshot(UnityScreenShotAvatarPosition unityScreenShotAvatarPosition, String str, int i10, int i11, String str2, GameObject gameObject, int i12, h hVar) {
            this(unityScreenShotAvatarPosition, str, i10, i11, str2, (i12 & 32) != 0 ? GameObject.SCENE_MANAGER : gameObject);
        }

        private final UnityScreenShotAvatarPosition component1() {
            return this.avatarPosition;
        }

        private final String component2() {
            return this.imagePath;
        }

        private final int component3() {
            return this.imageWidth;
        }

        private final int component4() {
            return this.imageHeight;
        }

        private final String component5() {
            return this.key;
        }

        public static /* synthetic */ CaptureRichUniqueGiftScreenshot copy$default(CaptureRichUniqueGiftScreenshot captureRichUniqueGiftScreenshot, UnityScreenShotAvatarPosition unityScreenShotAvatarPosition, String str, int i10, int i11, String str2, GameObject gameObject, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                unityScreenShotAvatarPosition = captureRichUniqueGiftScreenshot.avatarPosition;
            }
            if ((i12 & 2) != 0) {
                str = captureRichUniqueGiftScreenshot.imagePath;
            }
            String str3 = str;
            if ((i12 & 4) != 0) {
                i10 = captureRichUniqueGiftScreenshot.imageWidth;
            }
            int i13 = i10;
            if ((i12 & 8) != 0) {
                i11 = captureRichUniqueGiftScreenshot.imageHeight;
            }
            int i14 = i11;
            if ((i12 & 16) != 0) {
                str2 = captureRichUniqueGiftScreenshot.key;
            }
            String str4 = str2;
            if ((i12 & 32) != 0) {
                gameObject = captureRichUniqueGiftScreenshot.getGameObject();
            }
            return captureRichUniqueGiftScreenshot.copy(unityScreenShotAvatarPosition, str3, i13, i14, str4, gameObject);
        }

        @Override // com.dena.mirrorman.unity.UnityCommand
        public String buildMessage() {
            return this.avatarPosition.getValue() + ',' + this.imageWidth + ',' + this.imageHeight + ',' + this.imagePath + ',' + this.key;
        }

        public final GameObject component6() {
            return getGameObject();
        }

        public final CaptureRichUniqueGiftScreenshot copy(UnityScreenShotAvatarPosition unityScreenShotAvatarPosition, String str, int i10, int i11, String str2, GameObject gameObject) {
            p.h(unityScreenShotAvatarPosition, "avatarPosition");
            p.h(str, "imagePath");
            p.h(str2, "key");
            p.h(gameObject, "gameObject");
            return new CaptureRichUniqueGiftScreenshot(unityScreenShotAvatarPosition, str, i10, i11, str2, gameObject);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof CaptureRichUniqueGiftScreenshot) {
                CaptureRichUniqueGiftScreenshot captureRichUniqueGiftScreenshot = (CaptureRichUniqueGiftScreenshot) obj;
                return this.avatarPosition == captureRichUniqueGiftScreenshot.avatarPosition && p.c(this.imagePath, captureRichUniqueGiftScreenshot.imagePath) && this.imageWidth == captureRichUniqueGiftScreenshot.imageWidth && this.imageHeight == captureRichUniqueGiftScreenshot.imageHeight && p.c(this.key, captureRichUniqueGiftScreenshot.key) && getGameObject() == captureRichUniqueGiftScreenshot.getGameObject();
            }
            return false;
        }

        @Override // com.dena.mirrorman.unity.UnityCommand
        public GameObject getGameObject() {
            return this.gameObject;
        }

        public int hashCode() {
            return (((((((((this.avatarPosition.hashCode() * 31) + this.imagePath.hashCode()) * 31) + Integer.hashCode(this.imageWidth)) * 31) + Integer.hashCode(this.imageHeight)) * 31) + this.key.hashCode()) * 31) + getGameObject().hashCode();
        }

        public String toString() {
            return "CaptureRichUniqueGiftScreenshot(avatarPosition=" + this.avatarPosition + ", imagePath=" + this.imagePath + ", imageWidth=" + this.imageWidth + ", imageHeight=" + this.imageHeight + ", key=" + this.key + ", gameObject=" + getGameObject() + ')';
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public CaptureRichUniqueGiftScreenshot(UnityScreenShotAvatarPosition unityScreenShotAvatarPosition, String str, int i10, int i11, String str2, GameObject gameObject) {
            super(null);
            p.h(unityScreenShotAvatarPosition, "avatarPosition");
            p.h(str, "imagePath");
            p.h(str2, "key");
            p.h(gameObject, "gameObject");
            this.avatarPosition = unityScreenShotAvatarPosition;
            this.imagePath = str;
            this.imageWidth = i10;
            this.imageHeight = i11;
            this.key = str2;
            this.gameObject = gameObject;
        }
    }

    /* loaded from: classes3.dex */
    public static final class CaptureScreenshot extends UnityCommand {
        public static final int $stable = 0;
        private final UnityScreenShotAvatarPosition avatarPosition;
        private final GameObject gameObject;
        private final int imageHeight;
        private final String imagePath;
        private final int imageWidth;
        private final String key;

        public /* synthetic */ CaptureScreenshot(UnityScreenShotAvatarPosition unityScreenShotAvatarPosition, String str, int i10, int i11, String str2, GameObject gameObject, int i12, h hVar) {
            this(unityScreenShotAvatarPosition, str, i10, i11, str2, (i12 & 32) != 0 ? GameObject.SCENE_MANAGER : gameObject);
        }

        private final UnityScreenShotAvatarPosition component1() {
            return this.avatarPosition;
        }

        private final String component2() {
            return this.imagePath;
        }

        private final int component3() {
            return this.imageWidth;
        }

        private final int component4() {
            return this.imageHeight;
        }

        private final String component5() {
            return this.key;
        }

        public static /* synthetic */ CaptureScreenshot copy$default(CaptureScreenshot captureScreenshot, UnityScreenShotAvatarPosition unityScreenShotAvatarPosition, String str, int i10, int i11, String str2, GameObject gameObject, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                unityScreenShotAvatarPosition = captureScreenshot.avatarPosition;
            }
            if ((i12 & 2) != 0) {
                str = captureScreenshot.imagePath;
            }
            String str3 = str;
            if ((i12 & 4) != 0) {
                i10 = captureScreenshot.imageWidth;
            }
            int i13 = i10;
            if ((i12 & 8) != 0) {
                i11 = captureScreenshot.imageHeight;
            }
            int i14 = i11;
            if ((i12 & 16) != 0) {
                str2 = captureScreenshot.key;
            }
            String str4 = str2;
            if ((i12 & 32) != 0) {
                gameObject = captureScreenshot.getGameObject();
            }
            return captureScreenshot.copy(unityScreenShotAvatarPosition, str3, i13, i14, str4, gameObject);
        }

        @Override // com.dena.mirrorman.unity.UnityCommand
        public String buildMessage() {
            return this.avatarPosition.getValue() + ',' + this.imageWidth + ',' + this.imageHeight + ',' + this.imagePath + ',' + this.key;
        }

        public final GameObject component6() {
            return getGameObject();
        }

        public final CaptureScreenshot copy(UnityScreenShotAvatarPosition unityScreenShotAvatarPosition, String str, int i10, int i11, String str2, GameObject gameObject) {
            p.h(unityScreenShotAvatarPosition, "avatarPosition");
            p.h(str, "imagePath");
            p.h(str2, "key");
            p.h(gameObject, "gameObject");
            return new CaptureScreenshot(unityScreenShotAvatarPosition, str, i10, i11, str2, gameObject);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof CaptureScreenshot) {
                CaptureScreenshot captureScreenshot = (CaptureScreenshot) obj;
                return this.avatarPosition == captureScreenshot.avatarPosition && p.c(this.imagePath, captureScreenshot.imagePath) && this.imageWidth == captureScreenshot.imageWidth && this.imageHeight == captureScreenshot.imageHeight && p.c(this.key, captureScreenshot.key) && getGameObject() == captureScreenshot.getGameObject();
            }
            return false;
        }

        @Override // com.dena.mirrorman.unity.UnityCommand
        public GameObject getGameObject() {
            return this.gameObject;
        }

        public int hashCode() {
            return (((((((((this.avatarPosition.hashCode() * 31) + this.imagePath.hashCode()) * 31) + Integer.hashCode(this.imageWidth)) * 31) + Integer.hashCode(this.imageHeight)) * 31) + this.key.hashCode()) * 31) + getGameObject().hashCode();
        }

        public String toString() {
            return "CaptureScreenshot(avatarPosition=" + this.avatarPosition + ", imagePath=" + this.imagePath + ", imageWidth=" + this.imageWidth + ", imageHeight=" + this.imageHeight + ", key=" + this.key + ", gameObject=" + getGameObject() + ')';
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public CaptureScreenshot(UnityScreenShotAvatarPosition unityScreenShotAvatarPosition, String str, int i10, int i11, String str2, GameObject gameObject) {
            super(null);
            p.h(unityScreenShotAvatarPosition, "avatarPosition");
            p.h(str, "imagePath");
            p.h(str2, "key");
            p.h(gameObject, "gameObject");
            this.avatarPosition = unityScreenShotAvatarPosition;
            this.imagePath = str;
            this.imageWidth = i10;
            this.imageHeight = i11;
            this.key = str2;
            this.gameObject = gameObject;
        }
    }

    /* loaded from: classes3.dex */
    public static final class ClearAssetBundleCache extends UnityCommand {
        public static final int $stable = 0;
        private final GameObject gameObject;

        public ClearAssetBundleCache() {
            this(null, 1, null);
        }

        public /* synthetic */ ClearAssetBundleCache(GameObject gameObject, int i10, h hVar) {
            this((i10 & 1) != 0 ? GameObject.SCENE_MANAGER : gameObject);
        }

        public static /* synthetic */ ClearAssetBundleCache copy$default(ClearAssetBundleCache clearAssetBundleCache, GameObject gameObject, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                gameObject = clearAssetBundleCache.getGameObject();
            }
            return clearAssetBundleCache.copy(gameObject);
        }

        @Override // com.dena.mirrorman.unity.UnityCommand
        public String buildMessage() {
            return "";
        }

        public final GameObject component1() {
            return getGameObject();
        }

        public final ClearAssetBundleCache copy(GameObject gameObject) {
            p.h(gameObject, "gameObject");
            return new ClearAssetBundleCache(gameObject);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ClearAssetBundleCache) && getGameObject() == ((ClearAssetBundleCache) obj).getGameObject();
        }

        @Override // com.dena.mirrorman.unity.UnityCommand
        public GameObject getGameObject() {
            return this.gameObject;
        }

        public int hashCode() {
            return getGameObject().hashCode();
        }

        public String toString() {
            return "ClearAssetBundleCache(gameObject=" + getGameObject() + ')';
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ClearAssetBundleCache(GameObject gameObject) {
            super(null);
            p.h(gameObject, "gameObject");
            this.gameObject = gameObject;
        }
    }

    /* loaded from: classes3.dex */
    public static final class DisableAlpha extends UnityCommand {
        public static final int $stable = 0;
        private final GameObject gameObject;

        public DisableAlpha() {
            this(null, 1, null);
        }

        public /* synthetic */ DisableAlpha(GameObject gameObject, int i10, h hVar) {
            this((i10 & 1) != 0 ? GameObject.SCENE_MANAGER : gameObject);
        }

        public static /* synthetic */ DisableAlpha copy$default(DisableAlpha disableAlpha, GameObject gameObject, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                gameObject = disableAlpha.getGameObject();
            }
            return disableAlpha.copy(gameObject);
        }

        @Override // com.dena.mirrorman.unity.UnityCommand
        public String buildMessage() {
            return "";
        }

        public final GameObject component1() {
            return getGameObject();
        }

        public final DisableAlpha copy(GameObject gameObject) {
            p.h(gameObject, "gameObject");
            return new DisableAlpha(gameObject);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof DisableAlpha) && getGameObject() == ((DisableAlpha) obj).getGameObject();
        }

        @Override // com.dena.mirrorman.unity.UnityCommand
        public GameObject getGameObject() {
            return this.gameObject;
        }

        public int hashCode() {
            return getGameObject().hashCode();
        }

        public String toString() {
            return "DisableAlpha(gameObject=" + getGameObject() + ')';
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public DisableAlpha(GameObject gameObject) {
            super(null);
            p.h(gameObject, "gameObject");
            this.gameObject = gameObject;
        }
    }

    /* loaded from: classes3.dex */
    public static final class InitAssetBundle extends UnityCommand {
        public static final int $stable = 0;
        private final String assetBundleUrl;
        private final GameObject gameObject;

        public /* synthetic */ InitAssetBundle(String str, GameObject gameObject, int i10, h hVar) {
            this(str, (i10 & 2) != 0 ? GameObject.SCENE_MANAGER : gameObject);
        }

        private final String component1() {
            return this.assetBundleUrl;
        }

        public static /* synthetic */ InitAssetBundle copy$default(InitAssetBundle initAssetBundle, String str, GameObject gameObject, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = initAssetBundle.assetBundleUrl;
            }
            if ((i10 & 2) != 0) {
                gameObject = initAssetBundle.getGameObject();
            }
            return initAssetBundle.copy(str, gameObject);
        }

        @Override // com.dena.mirrorman.unity.UnityCommand
        public String buildMessage() {
            return this.assetBundleUrl;
        }

        public final GameObject component2() {
            return getGameObject();
        }

        public final InitAssetBundle copy(String str, GameObject gameObject) {
            p.h(str, "assetBundleUrl");
            p.h(gameObject, "gameObject");
            return new InitAssetBundle(str, gameObject);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof InitAssetBundle) {
                InitAssetBundle initAssetBundle = (InitAssetBundle) obj;
                return p.c(this.assetBundleUrl, initAssetBundle.assetBundleUrl) && getGameObject() == initAssetBundle.getGameObject();
            }
            return false;
        }

        @Override // com.dena.mirrorman.unity.UnityCommand
        public GameObject getGameObject() {
            return this.gameObject;
        }

        public int hashCode() {
            return (this.assetBundleUrl.hashCode() * 31) + getGameObject().hashCode();
        }

        public String toString() {
            return "InitAssetBundle(assetBundleUrl=" + this.assetBundleUrl + ", gameObject=" + getGameObject() + ')';
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public InitAssetBundle(String str, GameObject gameObject) {
            super(null);
            p.h(str, "assetBundleUrl");
            p.h(gameObject, "gameObject");
            this.assetBundleUrl = str;
            this.gameObject = gameObject;
        }
    }

    /* loaded from: classes3.dex */
    public static final class InitCloset extends UnityCommand {
        public static final int $stable = 0;
        private final GameObject gameObject;
        private final boolean isActive;

        public /* synthetic */ InitCloset(boolean z10, GameObject gameObject, int i10, h hVar) {
            this(z10, (i10 & 2) != 0 ? GameObject.SCENE_MANAGER : gameObject);
        }

        private final boolean component1() {
            return this.isActive;
        }

        public static /* synthetic */ InitCloset copy$default(InitCloset initCloset, boolean z10, GameObject gameObject, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                z10 = initCloset.isActive;
            }
            if ((i10 & 2) != 0) {
                gameObject = initCloset.getGameObject();
            }
            return initCloset.copy(z10, gameObject);
        }

        @Override // com.dena.mirrorman.unity.UnityCommand
        public String buildMessage() {
            return String.valueOf(this.isActive);
        }

        public final GameObject component2() {
            return getGameObject();
        }

        public final InitCloset copy(boolean z10, GameObject gameObject) {
            p.h(gameObject, "gameObject");
            return new InitCloset(z10, gameObject);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof InitCloset) {
                InitCloset initCloset = (InitCloset) obj;
                return this.isActive == initCloset.isActive && getGameObject() == initCloset.getGameObject();
            }
            return false;
        }

        @Override // com.dena.mirrorman.unity.UnityCommand
        public GameObject getGameObject() {
            return this.gameObject;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public int hashCode() {
            boolean z10 = this.isActive;
            int i10 = z10;
            if (z10 != 0) {
                i10 = 1;
            }
            return (i10 * 31) + getGameObject().hashCode();
        }

        public String toString() {
            return "InitCloset(isActive=" + this.isActive + ", gameObject=" + getGameObject() + ')';
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public InitCloset(boolean z10, GameObject gameObject) {
            super(null);
            p.h(gameObject, "gameObject");
            this.isActive = z10;
            this.gameObject = gameObject;
        }
    }

    /* loaded from: classes3.dex */
    public static final class InitEmoKara extends UnityCommand {
        public static final int $stable = 0;
        private final float bpm;
        private final GameObject gameObject;
        private final boolean isActive;

        public /* synthetic */ InitEmoKara(boolean z10, float f10, GameObject gameObject, int i10, h hVar) {
            this(z10, f10, (i10 & 4) != 0 ? GameObject.SCENE_MANAGER : gameObject);
        }

        private final boolean component1() {
            return this.isActive;
        }

        private final float component2() {
            return this.bpm;
        }

        public static /* synthetic */ InitEmoKara copy$default(InitEmoKara initEmoKara, boolean z10, float f10, GameObject gameObject, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                z10 = initEmoKara.isActive;
            }
            if ((i10 & 2) != 0) {
                f10 = initEmoKara.bpm;
            }
            if ((i10 & 4) != 0) {
                gameObject = initEmoKara.getGameObject();
            }
            return initEmoKara.copy(z10, f10, gameObject);
        }

        @Override // com.dena.mirrorman.unity.UnityCommand
        public String buildMessage() {
            boolean z10 = this.isActive;
            if (z10) {
                return this.isActive + ',' + d.a(this.bpm);
            }
            return String.valueOf(z10);
        }

        public final GameObject component3() {
            return getGameObject();
        }

        public final InitEmoKara copy(boolean z10, float f10, GameObject gameObject) {
            p.h(gameObject, "gameObject");
            return new InitEmoKara(z10, f10, gameObject);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof InitEmoKara) {
                InitEmoKara initEmoKara = (InitEmoKara) obj;
                return this.isActive == initEmoKara.isActive && p.c(Float.valueOf(this.bpm), Float.valueOf(initEmoKara.bpm)) && getGameObject() == initEmoKara.getGameObject();
            }
            return false;
        }

        @Override // com.dena.mirrorman.unity.UnityCommand
        public GameObject getGameObject() {
            return this.gameObject;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public int hashCode() {
            boolean z10 = this.isActive;
            int i10 = z10;
            if (z10 != 0) {
                i10 = 1;
            }
            return (((i10 * 31) + Float.hashCode(this.bpm)) * 31) + getGameObject().hashCode();
        }

        public String toString() {
            return "InitEmoKara(isActive=" + this.isActive + ", bpm=" + this.bpm + ", gameObject=" + getGameObject() + ')';
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public InitEmoKara(boolean z10, float f10, GameObject gameObject) {
            super(null);
            p.h(gameObject, "gameObject");
            this.isActive = z10;
            this.bpm = f10;
            this.gameObject = gameObject;
        }
    }

    /* loaded from: classes3.dex */
    public static final class InitGifting extends UnityCommand {
        public static final int $stable = 0;
        private final GameObject gameObject;
        private final boolean isActive;

        public /* synthetic */ InitGifting(boolean z10, GameObject gameObject, int i10, h hVar) {
            this(z10, (i10 & 2) != 0 ? GameObject.SCENE_MANAGER : gameObject);
        }

        private final boolean component1() {
            return this.isActive;
        }

        public static /* synthetic */ InitGifting copy$default(InitGifting initGifting, boolean z10, GameObject gameObject, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                z10 = initGifting.isActive;
            }
            if ((i10 & 2) != 0) {
                gameObject = initGifting.getGameObject();
            }
            return initGifting.copy(z10, gameObject);
        }

        @Override // com.dena.mirrorman.unity.UnityCommand
        public String buildMessage() {
            return String.valueOf(this.isActive);
        }

        public final GameObject component2() {
            return getGameObject();
        }

        public final InitGifting copy(boolean z10, GameObject gameObject) {
            p.h(gameObject, "gameObject");
            return new InitGifting(z10, gameObject);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof InitGifting) {
                InitGifting initGifting = (InitGifting) obj;
                return this.isActive == initGifting.isActive && getGameObject() == initGifting.getGameObject();
            }
            return false;
        }

        @Override // com.dena.mirrorman.unity.UnityCommand
        public GameObject getGameObject() {
            return this.gameObject;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public int hashCode() {
            boolean z10 = this.isActive;
            int i10 = z10;
            if (z10 != 0) {
                i10 = 1;
            }
            return (i10 * 31) + getGameObject().hashCode();
        }

        public String toString() {
            return "InitGifting(isActive=" + this.isActive + ", gameObject=" + getGameObject() + ')';
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public InitGifting(boolean z10, GameObject gameObject) {
            super(null);
            p.h(gameObject, "gameObject");
            this.isActive = z10;
            this.gameObject = gameObject;
        }
    }

    /* loaded from: classes3.dex */
    public static final class InitMiniGame extends UnityCommand {
        public static final int $stable = 0;
        private final GameObject gameObject;
        private final EmomoGameName miniGameName;

        public /* synthetic */ InitMiniGame(EmomoGameName emomoGameName, GameObject gameObject, int i10, h hVar) {
            this(emomoGameName, (i10 & 2) != 0 ? GameObject.SCENE_MANAGER : gameObject);
        }

        private final EmomoGameName component1() {
            return this.miniGameName;
        }

        public static /* synthetic */ InitMiniGame copy$default(InitMiniGame initMiniGame, EmomoGameName emomoGameName, GameObject gameObject, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                emomoGameName = initMiniGame.miniGameName;
            }
            if ((i10 & 2) != 0) {
                gameObject = initMiniGame.getGameObject();
            }
            return initMiniGame.copy(emomoGameName, gameObject);
        }

        @Override // com.dena.mirrorman.unity.UnityCommand
        public String buildMessage() {
            return this.miniGameName.getValue();
        }

        public final GameObject component2() {
            return getGameObject();
        }

        public final InitMiniGame copy(EmomoGameName emomoGameName, GameObject gameObject) {
            p.h(emomoGameName, "miniGameName");
            p.h(gameObject, "gameObject");
            return new InitMiniGame(emomoGameName, gameObject);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof InitMiniGame) {
                InitMiniGame initMiniGame = (InitMiniGame) obj;
                return this.miniGameName == initMiniGame.miniGameName && getGameObject() == initMiniGame.getGameObject();
            }
            return false;
        }

        @Override // com.dena.mirrorman.unity.UnityCommand
        public GameObject getGameObject() {
            return this.gameObject;
        }

        public int hashCode() {
            return (this.miniGameName.hashCode() * 31) + getGameObject().hashCode();
        }

        public String toString() {
            return "InitMiniGame(miniGameName=" + this.miniGameName + ", gameObject=" + getGameObject() + ')';
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public InitMiniGame(EmomoGameName emomoGameName, GameObject gameObject) {
            super(null);
            p.h(emomoGameName, "miniGameName");
            p.h(gameObject, "gameObject");
            this.miniGameName = emomoGameName;
            this.gameObject = gameObject;
        }
    }

    /* loaded from: classes3.dex */
    public static final class LoadAvatarModel extends UnityCommand {
        public static final int $stable = 0;
        private final GameObject gameObject;
        private final String message;
        private final int targetSlot;

        public /* synthetic */ LoadAvatarModel(String str, int i10, GameObject gameObject, int i11, h hVar) {
            this(str, i10, (i11 & 4) != 0 ? GameObject.SCENE_MANAGER : gameObject);
        }

        private final String component1() {
            return this.message;
        }

        private final int component2() {
            return this.targetSlot;
        }

        public static /* synthetic */ LoadAvatarModel copy$default(LoadAvatarModel loadAvatarModel, String str, int i10, GameObject gameObject, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = loadAvatarModel.message;
            }
            if ((i11 & 2) != 0) {
                i10 = loadAvatarModel.targetSlot;
            }
            if ((i11 & 4) != 0) {
                gameObject = loadAvatarModel.getGameObject();
            }
            return loadAvatarModel.copy(str, i10, gameObject);
        }

        @Override // com.dena.mirrorman.unity.UnityCommand
        public String buildMessage() {
            return this.message + ";AndroidSlot:" + this.targetSlot + ';';
        }

        public final GameObject component3() {
            return getGameObject();
        }

        public final LoadAvatarModel copy(String str, int i10, GameObject gameObject) {
            p.h(str, "message");
            p.h(gameObject, "gameObject");
            return new LoadAvatarModel(str, i10, gameObject);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof LoadAvatarModel) {
                LoadAvatarModel loadAvatarModel = (LoadAvatarModel) obj;
                return p.c(this.message, loadAvatarModel.message) && this.targetSlot == loadAvatarModel.targetSlot && getGameObject() == loadAvatarModel.getGameObject();
            }
            return false;
        }

        @Override // com.dena.mirrorman.unity.UnityCommand
        public GameObject getGameObject() {
            return this.gameObject;
        }

        public int hashCode() {
            return (((this.message.hashCode() * 31) + Integer.hashCode(this.targetSlot)) * 31) + getGameObject().hashCode();
        }

        public String toString() {
            return "LoadAvatarModel(message=" + this.message + ", targetSlot=" + this.targetSlot + ", gameObject=" + getGameObject() + ')';
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public LoadAvatarModel(String str, int i10, GameObject gameObject) {
            super(null);
            p.h(str, "message");
            p.h(gameObject, "gameObject");
            this.message = str;
            this.targetSlot = i10;
            this.gameObject = gameObject;
        }
    }

    /* loaded from: classes3.dex */
    public static final class LoadAvatarSlot extends UnityCommand {
        public static final int $stable = 0;
        private final GameObject gameObject;
        private final int targetSlot;

        public /* synthetic */ LoadAvatarSlot(int i10, GameObject gameObject, int i11, h hVar) {
            this(i10, (i11 & 2) != 0 ? GameObject.SCENE_MANAGER : gameObject);
        }

        private final int component1() {
            return this.targetSlot;
        }

        public static /* synthetic */ LoadAvatarSlot copy$default(LoadAvatarSlot loadAvatarSlot, int i10, GameObject gameObject, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                i10 = loadAvatarSlot.targetSlot;
            }
            if ((i11 & 2) != 0) {
                gameObject = loadAvatarSlot.getGameObject();
            }
            return loadAvatarSlot.copy(i10, gameObject);
        }

        @Override // com.dena.mirrorman.unity.UnityCommand
        public String buildMessage() {
            return String.valueOf(this.targetSlot);
        }

        public final GameObject component2() {
            return getGameObject();
        }

        public final LoadAvatarSlot copy(int i10, GameObject gameObject) {
            p.h(gameObject, "gameObject");
            return new LoadAvatarSlot(i10, gameObject);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof LoadAvatarSlot) {
                LoadAvatarSlot loadAvatarSlot = (LoadAvatarSlot) obj;
                return this.targetSlot == loadAvatarSlot.targetSlot && getGameObject() == loadAvatarSlot.getGameObject();
            }
            return false;
        }

        @Override // com.dena.mirrorman.unity.UnityCommand
        public GameObject getGameObject() {
            return this.gameObject;
        }

        public int hashCode() {
            return (Integer.hashCode(this.targetSlot) * 31) + getGameObject().hashCode();
        }

        public String toString() {
            return "LoadAvatarSlot(targetSlot=" + this.targetSlot + ", gameObject=" + getGameObject() + ')';
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public LoadAvatarSlot(int i10, GameObject gameObject) {
            super(null);
            p.h(gameObject, "gameObject");
            this.targetSlot = i10;
            this.gameObject = gameObject;
        }
    }

    /* loaded from: classes3.dex */
    public static final class LoadMiniGame extends UnityCommand {
        public static final int $stable = 0;
        private final GameObject gameObject;

        public LoadMiniGame() {
            this(null, 1, null);
        }

        public /* synthetic */ LoadMiniGame(GameObject gameObject, int i10, h hVar) {
            this((i10 & 1) != 0 ? GameObject.SCENE_MANAGER : gameObject);
        }

        public static /* synthetic */ LoadMiniGame copy$default(LoadMiniGame loadMiniGame, GameObject gameObject, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                gameObject = loadMiniGame.getGameObject();
            }
            return loadMiniGame.copy(gameObject);
        }

        @Override // com.dena.mirrorman.unity.UnityCommand
        public String buildMessage() {
            return "";
        }

        public final GameObject component1() {
            return getGameObject();
        }

        public final LoadMiniGame copy(GameObject gameObject) {
            p.h(gameObject, "gameObject");
            return new LoadMiniGame(gameObject);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof LoadMiniGame) && getGameObject() == ((LoadMiniGame) obj).getGameObject();
        }

        @Override // com.dena.mirrorman.unity.UnityCommand
        public GameObject getGameObject() {
            return this.gameObject;
        }

        public int hashCode() {
            return getGameObject().hashCode();
        }

        public String toString() {
            return "LoadMiniGame(gameObject=" + getGameObject() + ')';
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public LoadMiniGame(GameObject gameObject) {
            super(null);
            p.h(gameObject, "gameObject");
            this.gameObject = gameObject;
        }
    }

    /* loaded from: classes3.dex */
    public static final class MiniGameInput extends UnityCommand {
        public static final int $stable = 0;
        private final GameObject gameObject;
        private final com.dena.mirrorman.unity.MiniGameInput miniGameInput;

        public /* synthetic */ MiniGameInput(com.dena.mirrorman.unity.MiniGameInput miniGameInput, GameObject gameObject, int i10, h hVar) {
            this(miniGameInput, (i10 & 2) != 0 ? GameObject.SCENE_MANAGER : gameObject);
        }

        private final com.dena.mirrorman.unity.MiniGameInput component1() {
            return this.miniGameInput;
        }

        public static /* synthetic */ MiniGameInput copy$default(MiniGameInput miniGameInput, com.dena.mirrorman.unity.MiniGameInput miniGameInput2, GameObject gameObject, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                miniGameInput2 = miniGameInput.miniGameInput;
            }
            if ((i10 & 2) != 0) {
                gameObject = miniGameInput.getGameObject();
            }
            return miniGameInput.copy(miniGameInput2, gameObject);
        }

        @Override // com.dena.mirrorman.unity.UnityCommand
        public String buildMessage() {
            return this.miniGameInput.buildMessage();
        }

        public final GameObject component2() {
            return getGameObject();
        }

        public final MiniGameInput copy(com.dena.mirrorman.unity.MiniGameInput miniGameInput, GameObject gameObject) {
            p.h(miniGameInput, "miniGameInput");
            p.h(gameObject, "gameObject");
            return new MiniGameInput(miniGameInput, gameObject);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof MiniGameInput) {
                MiniGameInput miniGameInput = (MiniGameInput) obj;
                return p.c(this.miniGameInput, miniGameInput.miniGameInput) && getGameObject() == miniGameInput.getGameObject();
            }
            return false;
        }

        @Override // com.dena.mirrorman.unity.UnityCommand
        public GameObject getGameObject() {
            return this.gameObject;
        }

        public int hashCode() {
            return (this.miniGameInput.hashCode() * 31) + getGameObject().hashCode();
        }

        public String toString() {
            return "MiniGameInput(miniGameInput=" + this.miniGameInput + ", gameObject=" + getGameObject() + ')';
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public MiniGameInput(com.dena.mirrorman.unity.MiniGameInput miniGameInput, GameObject gameObject) {
            super(null);
            p.h(miniGameInput, "miniGameInput");
            p.h(gameObject, "gameObject");
            this.miniGameInput = miniGameInput;
            this.gameObject = gameObject;
        }
    }

    /* loaded from: classes3.dex */
    public static final class PlayRichUniqueGift extends UnityCommand {
        public static final int $stable = 0;
        private final GameObject gameObject;

        public PlayRichUniqueGift() {
            this(null, 1, null);
        }

        public /* synthetic */ PlayRichUniqueGift(GameObject gameObject, int i10, h hVar) {
            this((i10 & 1) != 0 ? GameObject.SCENE_MANAGER : gameObject);
        }

        public static /* synthetic */ PlayRichUniqueGift copy$default(PlayRichUniqueGift playRichUniqueGift, GameObject gameObject, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                gameObject = playRichUniqueGift.getGameObject();
            }
            return playRichUniqueGift.copy(gameObject);
        }

        @Override // com.dena.mirrorman.unity.UnityCommand
        public String buildMessage() {
            return "";
        }

        public final GameObject component1() {
            return getGameObject();
        }

        public final PlayRichUniqueGift copy(GameObject gameObject) {
            p.h(gameObject, "gameObject");
            return new PlayRichUniqueGift(gameObject);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof PlayRichUniqueGift) && getGameObject() == ((PlayRichUniqueGift) obj).getGameObject();
        }

        @Override // com.dena.mirrorman.unity.UnityCommand
        public GameObject getGameObject() {
            return this.gameObject;
        }

        public int hashCode() {
            return getGameObject().hashCode();
        }

        public String toString() {
            return "PlayRichUniqueGift(gameObject=" + getGameObject() + ')';
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public PlayRichUniqueGift(GameObject gameObject) {
            super(null);
            p.h(gameObject, "gameObject");
            this.gameObject = gameObject;
        }
    }

    /* loaded from: classes3.dex */
    public static final class PreviewRichUniqueGift extends UnityCommand {
        public static final int $stable = 0;
        private final GameObject gameObject;

        public PreviewRichUniqueGift() {
            this(null, 1, null);
        }

        public /* synthetic */ PreviewRichUniqueGift(GameObject gameObject, int i10, h hVar) {
            this((i10 & 1) != 0 ? GameObject.SCENE_MANAGER : gameObject);
        }

        public static /* synthetic */ PreviewRichUniqueGift copy$default(PreviewRichUniqueGift previewRichUniqueGift, GameObject gameObject, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                gameObject = previewRichUniqueGift.getGameObject();
            }
            return previewRichUniqueGift.copy(gameObject);
        }

        @Override // com.dena.mirrorman.unity.UnityCommand
        public String buildMessage() {
            return "";
        }

        public final GameObject component1() {
            return getGameObject();
        }

        public final PreviewRichUniqueGift copy(GameObject gameObject) {
            p.h(gameObject, "gameObject");
            return new PreviewRichUniqueGift(gameObject);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof PreviewRichUniqueGift) && getGameObject() == ((PreviewRichUniqueGift) obj).getGameObject();
        }

        @Override // com.dena.mirrorman.unity.UnityCommand
        public GameObject getGameObject() {
            return this.gameObject;
        }

        public int hashCode() {
            return getGameObject().hashCode();
        }

        public String toString() {
            return "PreviewRichUniqueGift(gameObject=" + getGameObject() + ')';
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public PreviewRichUniqueGift(GameObject gameObject) {
            super(null);
            p.h(gameObject, "gameObject");
            this.gameObject = gameObject;
        }
    }

    /* loaded from: classes3.dex */
    public static final class SetActiveRichUniqueGiftMessageIndex extends UnityCommand {
        public static final int $stable = 0;
        private final GameObject gameObject;
        private final int index;

        public /* synthetic */ SetActiveRichUniqueGiftMessageIndex(int i10, GameObject gameObject, int i11, h hVar) {
            this(i10, (i11 & 2) != 0 ? GameObject.SCENE_MANAGER : gameObject);
        }

        private final int component1() {
            return this.index;
        }

        public static /* synthetic */ SetActiveRichUniqueGiftMessageIndex copy$default(SetActiveRichUniqueGiftMessageIndex setActiveRichUniqueGiftMessageIndex, int i10, GameObject gameObject, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                i10 = setActiveRichUniqueGiftMessageIndex.index;
            }
            if ((i11 & 2) != 0) {
                gameObject = setActiveRichUniqueGiftMessageIndex.getGameObject();
            }
            return setActiveRichUniqueGiftMessageIndex.copy(i10, gameObject);
        }

        @Override // com.dena.mirrorman.unity.UnityCommand
        public String buildMessage() {
            return String.valueOf(this.index);
        }

        public final GameObject component2() {
            return getGameObject();
        }

        public final SetActiveRichUniqueGiftMessageIndex copy(int i10, GameObject gameObject) {
            p.h(gameObject, "gameObject");
            return new SetActiveRichUniqueGiftMessageIndex(i10, gameObject);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof SetActiveRichUniqueGiftMessageIndex) {
                SetActiveRichUniqueGiftMessageIndex setActiveRichUniqueGiftMessageIndex = (SetActiveRichUniqueGiftMessageIndex) obj;
                return this.index == setActiveRichUniqueGiftMessageIndex.index && getGameObject() == setActiveRichUniqueGiftMessageIndex.getGameObject();
            }
            return false;
        }

        @Override // com.dena.mirrorman.unity.UnityCommand
        public GameObject getGameObject() {
            return this.gameObject;
        }

        public int hashCode() {
            return (Integer.hashCode(this.index) * 31) + getGameObject().hashCode();
        }

        public String toString() {
            return "SetActiveRichUniqueGiftMessageIndex(index=" + this.index + ", gameObject=" + getGameObject() + ')';
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SetActiveRichUniqueGiftMessageIndex(int i10, GameObject gameObject) {
            super(null);
            p.h(gameObject, "gameObject");
            this.index = i10;
            this.gameObject = gameObject;
        }
    }

    /* loaded from: classes3.dex */
    public static final class SetAnimationTrigger extends UnityCommand {
        public static final int $stable = 0;
        private final String animationTrigger;
        private final GameObject gameObject;

        public /* synthetic */ SetAnimationTrigger(String str, GameObject gameObject, int i10, h hVar) {
            this(str, (i10 & 2) != 0 ? GameObject.AVATAR : gameObject);
        }

        private final String component1() {
            return this.animationTrigger;
        }

        public static /* synthetic */ SetAnimationTrigger copy$default(SetAnimationTrigger setAnimationTrigger, String str, GameObject gameObject, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = setAnimationTrigger.animationTrigger;
            }
            if ((i10 & 2) != 0) {
                gameObject = setAnimationTrigger.getGameObject();
            }
            return setAnimationTrigger.copy(str, gameObject);
        }

        @Override // com.dena.mirrorman.unity.UnityCommand
        public String buildMessage() {
            return this.animationTrigger;
        }

        public final GameObject component2() {
            return getGameObject();
        }

        public final SetAnimationTrigger copy(String str, GameObject gameObject) {
            p.h(str, "animationTrigger");
            p.h(gameObject, "gameObject");
            return new SetAnimationTrigger(str, gameObject);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof SetAnimationTrigger) {
                SetAnimationTrigger setAnimationTrigger = (SetAnimationTrigger) obj;
                return p.c(this.animationTrigger, setAnimationTrigger.animationTrigger) && getGameObject() == setAnimationTrigger.getGameObject();
            }
            return false;
        }

        @Override // com.dena.mirrorman.unity.UnityCommand
        public GameObject getGameObject() {
            return this.gameObject;
        }

        public int hashCode() {
            return (this.animationTrigger.hashCode() * 31) + getGameObject().hashCode();
        }

        public String toString() {
            return "SetAnimationTrigger(animationTrigger=" + this.animationTrigger + ", gameObject=" + getGameObject() + ')';
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SetAnimationTrigger(String str, GameObject gameObject) {
            super(null);
            p.h(str, "animationTrigger");
            p.h(gameObject, "gameObject");
            this.animationTrigger = str;
            this.gameObject = gameObject;
        }
    }

    /* loaded from: classes3.dex */
    public static final class SetAvatarSlot extends UnityCommand {
        public static final int $stable = 0;
        private final GameObject gameObject;
        private final int targetSlot;

        public /* synthetic */ SetAvatarSlot(int i10, GameObject gameObject, int i11, h hVar) {
            this(i10, (i11 & 2) != 0 ? GameObject.SCENE_MANAGER : gameObject);
        }

        private final int component1() {
            return this.targetSlot;
        }

        public static /* synthetic */ SetAvatarSlot copy$default(SetAvatarSlot setAvatarSlot, int i10, GameObject gameObject, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                i10 = setAvatarSlot.targetSlot;
            }
            if ((i11 & 2) != 0) {
                gameObject = setAvatarSlot.getGameObject();
            }
            return setAvatarSlot.copy(i10, gameObject);
        }

        @Override // com.dena.mirrorman.unity.UnityCommand
        public String buildMessage() {
            return String.valueOf(this.targetSlot);
        }

        public final GameObject component2() {
            return getGameObject();
        }

        public final SetAvatarSlot copy(int i10, GameObject gameObject) {
            p.h(gameObject, "gameObject");
            return new SetAvatarSlot(i10, gameObject);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof SetAvatarSlot) {
                SetAvatarSlot setAvatarSlot = (SetAvatarSlot) obj;
                return this.targetSlot == setAvatarSlot.targetSlot && getGameObject() == setAvatarSlot.getGameObject();
            }
            return false;
        }

        @Override // com.dena.mirrorman.unity.UnityCommand
        public GameObject getGameObject() {
            return this.gameObject;
        }

        public int hashCode() {
            return (Integer.hashCode(this.targetSlot) * 31) + getGameObject().hashCode();
        }

        public String toString() {
            return "SetAvatarSlot(targetSlot=" + this.targetSlot + ", gameObject=" + getGameObject() + ')';
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SetAvatarSlot(int i10, GameObject gameObject) {
            super(null);
            p.h(gameObject, "gameObject");
            this.targetSlot = i10;
            this.gameObject = gameObject;
        }
    }

    /* loaded from: classes3.dex */
    public static final class SetCameraDolly extends UnityCommand {
        public static final int $stable = 0;
        private final GameObject gameObject;
        private final float scale;

        public /* synthetic */ SetCameraDolly(float f10, GameObject gameObject, int i10, h hVar) {
            this(f10, (i10 & 2) != 0 ? GameObject.SCENE_MANAGER : gameObject);
        }

        private final float component1() {
            return this.scale;
        }

        public static /* synthetic */ SetCameraDolly copy$default(SetCameraDolly setCameraDolly, float f10, GameObject gameObject, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                f10 = setCameraDolly.scale;
            }
            if ((i10 & 2) != 0) {
                gameObject = setCameraDolly.getGameObject();
            }
            return setCameraDolly.copy(f10, gameObject);
        }

        @Override // com.dena.mirrorman.unity.UnityCommand
        public String buildMessage() {
            return d.a(this.scale);
        }

        public final GameObject component2() {
            return getGameObject();
        }

        public final SetCameraDolly copy(float f10, GameObject gameObject) {
            p.h(gameObject, "gameObject");
            return new SetCameraDolly(f10, gameObject);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof SetCameraDolly) {
                SetCameraDolly setCameraDolly = (SetCameraDolly) obj;
                return p.c(Float.valueOf(this.scale), Float.valueOf(setCameraDolly.scale)) && getGameObject() == setCameraDolly.getGameObject();
            }
            return false;
        }

        @Override // com.dena.mirrorman.unity.UnityCommand
        public GameObject getGameObject() {
            return this.gameObject;
        }

        public int hashCode() {
            return (Float.hashCode(this.scale) * 31) + getGameObject().hashCode();
        }

        public String toString() {
            return "SetCameraDolly(scale=" + this.scale + ", gameObject=" + getGameObject() + ')';
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SetCameraDolly(float f10, GameObject gameObject) {
            super(null);
            p.h(gameObject, "gameObject");
            this.scale = f10;
            this.gameObject = gameObject;
        }
    }

    /* loaded from: classes3.dex */
    public static final class SetClosetFocus extends UnityCommand {
        public static final int $stable = 0;
        private final ClosetFocusType closetFocusType;
        private final GameObject gameObject;

        public /* synthetic */ SetClosetFocus(ClosetFocusType closetFocusType, GameObject gameObject, int i10, h hVar) {
            this(closetFocusType, (i10 & 2) != 0 ? GameObject.SCENE_MANAGER : gameObject);
        }

        private final ClosetFocusType component1() {
            return this.closetFocusType;
        }

        public static /* synthetic */ SetClosetFocus copy$default(SetClosetFocus setClosetFocus, ClosetFocusType closetFocusType, GameObject gameObject, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                closetFocusType = setClosetFocus.closetFocusType;
            }
            if ((i10 & 2) != 0) {
                gameObject = setClosetFocus.getGameObject();
            }
            return setClosetFocus.copy(closetFocusType, gameObject);
        }

        @Override // com.dena.mirrorman.unity.UnityCommand
        public String buildMessage() {
            return this.closetFocusType.getRawValue();
        }

        public final GameObject component2() {
            return getGameObject();
        }

        public final SetClosetFocus copy(ClosetFocusType closetFocusType, GameObject gameObject) {
            p.h(closetFocusType, "closetFocusType");
            p.h(gameObject, "gameObject");
            return new SetClosetFocus(closetFocusType, gameObject);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof SetClosetFocus) {
                SetClosetFocus setClosetFocus = (SetClosetFocus) obj;
                return this.closetFocusType == setClosetFocus.closetFocusType && getGameObject() == setClosetFocus.getGameObject();
            }
            return false;
        }

        @Override // com.dena.mirrorman.unity.UnityCommand
        public GameObject getGameObject() {
            return this.gameObject;
        }

        public int hashCode() {
            return (this.closetFocusType.hashCode() * 31) + getGameObject().hashCode();
        }

        public String toString() {
            return "SetClosetFocus(closetFocusType=" + this.closetFocusType + ", gameObject=" + getGameObject() + ')';
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SetClosetFocus(ClosetFocusType closetFocusType, GameObject gameObject) {
            super(null);
            p.h(closetFocusType, "closetFocusType");
            p.h(gameObject, "gameObject");
            this.closetFocusType = closetFocusType;
            this.gameObject = gameObject;
        }
    }

    /* loaded from: classes3.dex */
    public static final class SetCollabo extends UnityCommand {
        public static final int $stable = 0;
        private final GameObject gameObject;
        private final String message;

        public /* synthetic */ SetCollabo(String str, GameObject gameObject, int i10, h hVar) {
            this(str, (i10 & 2) != 0 ? GameObject.SCENE_MANAGER : gameObject);
        }

        private final String component1() {
            return this.message;
        }

        public static /* synthetic */ SetCollabo copy$default(SetCollabo setCollabo, String str, GameObject gameObject, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = setCollabo.message;
            }
            if ((i10 & 2) != 0) {
                gameObject = setCollabo.getGameObject();
            }
            return setCollabo.copy(str, gameObject);
        }

        @Override // com.dena.mirrorman.unity.UnityCommand
        public String buildMessage() {
            return this.message;
        }

        public final GameObject component2() {
            return getGameObject();
        }

        public final SetCollabo copy(String str, GameObject gameObject) {
            p.h(str, "message");
            p.h(gameObject, "gameObject");
            return new SetCollabo(str, gameObject);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof SetCollabo) {
                SetCollabo setCollabo = (SetCollabo) obj;
                return p.c(this.message, setCollabo.message) && getGameObject() == setCollabo.getGameObject();
            }
            return false;
        }

        @Override // com.dena.mirrorman.unity.UnityCommand
        public GameObject getGameObject() {
            return this.gameObject;
        }

        public int hashCode() {
            return (this.message.hashCode() * 31) + getGameObject().hashCode();
        }

        public String toString() {
            return "SetCollabo(message=" + this.message + ", gameObject=" + getGameObject() + ')';
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SetCollabo(String str, GameObject gameObject) {
            super(null);
            p.h(str, "message");
            p.h(gameObject, "gameObject");
            this.message = str;
            this.gameObject = gameObject;
        }
    }

    /* loaded from: classes3.dex */
    public static final class SetCollaboGiftAvatarModel extends UnityCommand {
        public static final int $stable = 0;
        private final GameObject gameObject;
        private final String message;

        public /* synthetic */ SetCollaboGiftAvatarModel(String str, GameObject gameObject, int i10, h hVar) {
            this(str, (i10 & 2) != 0 ? GameObject.SCENE_MANAGER : gameObject);
        }

        private final String component1() {
            return this.message;
        }

        public static /* synthetic */ SetCollaboGiftAvatarModel copy$default(SetCollaboGiftAvatarModel setCollaboGiftAvatarModel, String str, GameObject gameObject, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = setCollaboGiftAvatarModel.message;
            }
            if ((i10 & 2) != 0) {
                gameObject = setCollaboGiftAvatarModel.getGameObject();
            }
            return setCollaboGiftAvatarModel.copy(str, gameObject);
        }

        @Override // com.dena.mirrorman.unity.UnityCommand
        public String buildMessage() {
            return this.message;
        }

        public final GameObject component2() {
            return getGameObject();
        }

        public final SetCollaboGiftAvatarModel copy(String str, GameObject gameObject) {
            p.h(str, "message");
            p.h(gameObject, "gameObject");
            return new SetCollaboGiftAvatarModel(str, gameObject);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof SetCollaboGiftAvatarModel) {
                SetCollaboGiftAvatarModel setCollaboGiftAvatarModel = (SetCollaboGiftAvatarModel) obj;
                return p.c(this.message, setCollaboGiftAvatarModel.message) && getGameObject() == setCollaboGiftAvatarModel.getGameObject();
            }
            return false;
        }

        @Override // com.dena.mirrorman.unity.UnityCommand
        public GameObject getGameObject() {
            return this.gameObject;
        }

        public int hashCode() {
            return (this.message.hashCode() * 31) + getGameObject().hashCode();
        }

        public String toString() {
            return "SetCollaboGiftAvatarModel(message=" + this.message + ", gameObject=" + getGameObject() + ')';
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SetCollaboGiftAvatarModel(String str, GameObject gameObject) {
            super(null);
            p.h(str, "message");
            p.h(gameObject, "gameObject");
            this.message = str;
            this.gameObject = gameObject;
        }
    }

    /* loaded from: classes3.dex */
    public static final class SetCompanionName extends UnityCommand {
        public static final int $stable = 0;
        private final GameObject gameObject;
        private final String name;

        public /* synthetic */ SetCompanionName(String str, GameObject gameObject, int i10, h hVar) {
            this(str, (i10 & 2) != 0 ? GameObject.SCENE_MANAGER : gameObject);
        }

        private final String component1() {
            return this.name;
        }

        public static /* synthetic */ SetCompanionName copy$default(SetCompanionName setCompanionName, String str, GameObject gameObject, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = setCompanionName.name;
            }
            if ((i10 & 2) != 0) {
                gameObject = setCompanionName.getGameObject();
            }
            return setCompanionName.copy(str, gameObject);
        }

        @Override // com.dena.mirrorman.unity.UnityCommand
        public String buildMessage() {
            byte[] bytes = this.name.getBytes(so.c.f52772b);
            p.g(bytes, "this as java.lang.String).getBytes(charset)");
            String encodeToString = Base64.encodeToString(bytes, 0);
            p.g(encodeToString, "encodeToString(name.toByteArray(), Base64.DEFAULT)");
            return encodeToString;
        }

        public final GameObject component2() {
            return getGameObject();
        }

        public final SetCompanionName copy(String str, GameObject gameObject) {
            p.h(str, "name");
            p.h(gameObject, "gameObject");
            return new SetCompanionName(str, gameObject);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof SetCompanionName) {
                SetCompanionName setCompanionName = (SetCompanionName) obj;
                return p.c(this.name, setCompanionName.name) && getGameObject() == setCompanionName.getGameObject();
            }
            return false;
        }

        @Override // com.dena.mirrorman.unity.UnityCommand
        public GameObject getGameObject() {
            return this.gameObject;
        }

        public int hashCode() {
            return (this.name.hashCode() * 31) + getGameObject().hashCode();
        }

        public String toString() {
            return "SetCompanionName(name=" + this.name + ", gameObject=" + getGameObject() + ')';
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SetCompanionName(String str, GameObject gameObject) {
            super(null);
            p.h(str, "name");
            p.h(gameObject, "gameObject");
            this.name = str;
            this.gameObject = gameObject;
        }
    }

    /* loaded from: classes3.dex */
    public static final class SetContents extends UnityCommand {
        public static final int $stable = 0;
        private final GameObject gameObject;
        private final String message;

        public /* synthetic */ SetContents(String str, GameObject gameObject, int i10, h hVar) {
            this(str, (i10 & 2) != 0 ? GameObject.SCENE_MANAGER : gameObject);
        }

        private final String component1() {
            return this.message;
        }

        public static /* synthetic */ SetContents copy$default(SetContents setContents, String str, GameObject gameObject, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = setContents.message;
            }
            if ((i10 & 2) != 0) {
                gameObject = setContents.getGameObject();
            }
            return setContents.copy(str, gameObject);
        }

        @Override // com.dena.mirrorman.unity.UnityCommand
        public String buildMessage() {
            return this.message;
        }

        public final GameObject component2() {
            return getGameObject();
        }

        public final SetContents copy(String str, GameObject gameObject) {
            p.h(str, "message");
            p.h(gameObject, "gameObject");
            return new SetContents(str, gameObject);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof SetContents) {
                SetContents setContents = (SetContents) obj;
                return p.c(this.message, setContents.message) && getGameObject() == setContents.getGameObject();
            }
            return false;
        }

        @Override // com.dena.mirrorman.unity.UnityCommand
        public GameObject getGameObject() {
            return this.gameObject;
        }

        public int hashCode() {
            return (this.message.hashCode() * 31) + getGameObject().hashCode();
        }

        public String toString() {
            return "SetContents(message=" + this.message + ", gameObject=" + getGameObject() + ')';
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SetContents(String str, GameObject gameObject) {
            super(null);
            p.h(str, "message");
            p.h(gameObject, "gameObject");
            this.message = str;
            this.gameObject = gameObject;
        }
    }

    /* loaded from: classes3.dex */
    public static final class SetEffectTrigger extends UnityCommand {
        public static final int $stable = 0;
        private final String effectId;
        private final GameObject gameObject;

        public /* synthetic */ SetEffectTrigger(String str, GameObject gameObject, int i10, h hVar) {
            this(str, (i10 & 2) != 0 ? GameObject.SCENE_MANAGER : gameObject);
        }

        private final String component1() {
            return this.effectId;
        }

        public static /* synthetic */ SetEffectTrigger copy$default(SetEffectTrigger setEffectTrigger, String str, GameObject gameObject, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = setEffectTrigger.effectId;
            }
            if ((i10 & 2) != 0) {
                gameObject = setEffectTrigger.getGameObject();
            }
            return setEffectTrigger.copy(str, gameObject);
        }

        @Override // com.dena.mirrorman.unity.UnityCommand
        public String buildMessage() {
            return this.effectId;
        }

        public final GameObject component2() {
            return getGameObject();
        }

        public final SetEffectTrigger copy(String str, GameObject gameObject) {
            p.h(str, "effectId");
            p.h(gameObject, "gameObject");
            return new SetEffectTrigger(str, gameObject);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof SetEffectTrigger) {
                SetEffectTrigger setEffectTrigger = (SetEffectTrigger) obj;
                return p.c(this.effectId, setEffectTrigger.effectId) && getGameObject() == setEffectTrigger.getGameObject();
            }
            return false;
        }

        @Override // com.dena.mirrorman.unity.UnityCommand
        public GameObject getGameObject() {
            return this.gameObject;
        }

        public int hashCode() {
            return (this.effectId.hashCode() * 31) + getGameObject().hashCode();
        }

        public String toString() {
            return "SetEffectTrigger(effectId=" + this.effectId + ", gameObject=" + getGameObject() + ')';
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SetEffectTrigger(String str, GameObject gameObject) {
            super(null);
            p.h(str, "effectId");
            p.h(gameObject, "gameObject");
            this.effectId = str;
            this.gameObject = gameObject;
        }
    }

    /* loaded from: classes3.dex */
    public static final class SetGroupOrder extends UnityCommand {
        public static final int $stable = 0;
        private final GameObject gameObject;
        private final String order;

        public /* synthetic */ SetGroupOrder(String str, GameObject gameObject, int i10, h hVar) {
            this(str, (i10 & 2) != 0 ? GameObject.SCENE_MANAGER : gameObject);
        }

        private final String component1() {
            return this.order;
        }

        public static /* synthetic */ SetGroupOrder copy$default(SetGroupOrder setGroupOrder, String str, GameObject gameObject, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = setGroupOrder.order;
            }
            if ((i10 & 2) != 0) {
                gameObject = setGroupOrder.getGameObject();
            }
            return setGroupOrder.copy(str, gameObject);
        }

        @Override // com.dena.mirrorman.unity.UnityCommand
        public String buildMessage() {
            return this.order;
        }

        public final GameObject component2() {
            return getGameObject();
        }

        public final SetGroupOrder copy(String str, GameObject gameObject) {
            p.h(str, "order");
            p.h(gameObject, "gameObject");
            return new SetGroupOrder(str, gameObject);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof SetGroupOrder) {
                SetGroupOrder setGroupOrder = (SetGroupOrder) obj;
                return p.c(this.order, setGroupOrder.order) && getGameObject() == setGroupOrder.getGameObject();
            }
            return false;
        }

        @Override // com.dena.mirrorman.unity.UnityCommand
        public GameObject getGameObject() {
            return this.gameObject;
        }

        public int hashCode() {
            return (this.order.hashCode() * 31) + getGameObject().hashCode();
        }

        public String toString() {
            return "SetGroupOrder(order=" + this.order + ", gameObject=" + getGameObject() + ')';
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SetGroupOrder(String str, GameObject gameObject) {
            super(null);
            p.h(str, "order");
            p.h(gameObject, "gameObject");
            this.order = str;
            this.gameObject = gameObject;
        }
    }

    /* loaded from: classes3.dex */
    public static final class SetHttpRequestConfig extends UnityCommand {
        public static final int $stable = 8;
        private final UnityMiniGameInputSetHttpRequestConfig config;
        private final GameObject gameObject;

        public /* synthetic */ SetHttpRequestConfig(UnityMiniGameInputSetHttpRequestConfig unityMiniGameInputSetHttpRequestConfig, GameObject gameObject, int i10, h hVar) {
            this(unityMiniGameInputSetHttpRequestConfig, (i10 & 2) != 0 ? GameObject.SCENE_MANAGER : gameObject);
        }

        private final UnityMiniGameInputSetHttpRequestConfig component1() {
            return this.config;
        }

        public static /* synthetic */ SetHttpRequestConfig copy$default(SetHttpRequestConfig setHttpRequestConfig, UnityMiniGameInputSetHttpRequestConfig unityMiniGameInputSetHttpRequestConfig, GameObject gameObject, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                unityMiniGameInputSetHttpRequestConfig = setHttpRequestConfig.config;
            }
            if ((i10 & 2) != 0) {
                gameObject = setHttpRequestConfig.getGameObject();
            }
            return setHttpRequestConfig.copy(unityMiniGameInputSetHttpRequestConfig, gameObject);
        }

        @Override // com.dena.mirrorman.unity.UnityCommand
        public String buildMessage() {
            String s10 = new e().s(this.config);
            p.g(s10, "Gson().toJson(config)");
            byte[] bytes = s10.getBytes(so.c.f52772b);
            p.g(bytes, "this as java.lang.String).getBytes(charset)");
            String encodeToString = Base64.encodeToString(bytes, 0);
            p.g(encodeToString, "encodeToString(Gson().to…eArray(), Base64.DEFAULT)");
            return encodeToString;
        }

        public final GameObject component2() {
            return getGameObject();
        }

        public final SetHttpRequestConfig copy(UnityMiniGameInputSetHttpRequestConfig unityMiniGameInputSetHttpRequestConfig, GameObject gameObject) {
            p.h(unityMiniGameInputSetHttpRequestConfig, "config");
            p.h(gameObject, "gameObject");
            return new SetHttpRequestConfig(unityMiniGameInputSetHttpRequestConfig, gameObject);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof SetHttpRequestConfig) {
                SetHttpRequestConfig setHttpRequestConfig = (SetHttpRequestConfig) obj;
                return p.c(this.config, setHttpRequestConfig.config) && getGameObject() == setHttpRequestConfig.getGameObject();
            }
            return false;
        }

        @Override // com.dena.mirrorman.unity.UnityCommand
        public GameObject getGameObject() {
            return this.gameObject;
        }

        public int hashCode() {
            return (this.config.hashCode() * 31) + getGameObject().hashCode();
        }

        public String toString() {
            return "SetHttpRequestConfig(config=" + this.config + ", gameObject=" + getGameObject() + ')';
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SetHttpRequestConfig(UnityMiniGameInputSetHttpRequestConfig unityMiniGameInputSetHttpRequestConfig, GameObject gameObject) {
            super(null);
            p.h(unityMiniGameInputSetHttpRequestConfig, "config");
            p.h(gameObject, "gameObject");
            this.config = unityMiniGameInputSetHttpRequestConfig;
            this.gameObject = gameObject;
        }
    }

    /* loaded from: classes3.dex */
    public static final class SetLiveGiftEffectKey extends UnityCommand {
        public static final int $stable = 0;
        private final GameObject gameObject;
        private final String key;

        public /* synthetic */ SetLiveGiftEffectKey(String str, GameObject gameObject, int i10, h hVar) {
            this(str, (i10 & 2) != 0 ? GameObject.SCENE_MANAGER : gameObject);
        }

        private final String component1() {
            return this.key;
        }

        public static /* synthetic */ SetLiveGiftEffectKey copy$default(SetLiveGiftEffectKey setLiveGiftEffectKey, String str, GameObject gameObject, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = setLiveGiftEffectKey.key;
            }
            if ((i10 & 2) != 0) {
                gameObject = setLiveGiftEffectKey.getGameObject();
            }
            return setLiveGiftEffectKey.copy(str, gameObject);
        }

        @Override // com.dena.mirrorman.unity.UnityCommand
        public String buildMessage() {
            return this.key;
        }

        public final GameObject component2() {
            return getGameObject();
        }

        public final SetLiveGiftEffectKey copy(String str, GameObject gameObject) {
            p.h(str, "key");
            p.h(gameObject, "gameObject");
            return new SetLiveGiftEffectKey(str, gameObject);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof SetLiveGiftEffectKey) {
                SetLiveGiftEffectKey setLiveGiftEffectKey = (SetLiveGiftEffectKey) obj;
                return p.c(this.key, setLiveGiftEffectKey.key) && getGameObject() == setLiveGiftEffectKey.getGameObject();
            }
            return false;
        }

        @Override // com.dena.mirrorman.unity.UnityCommand
        public GameObject getGameObject() {
            return this.gameObject;
        }

        public int hashCode() {
            return (this.key.hashCode() * 31) + getGameObject().hashCode();
        }

        public String toString() {
            return "SetLiveGiftEffectKey(key=" + this.key + ", gameObject=" + getGameObject() + ')';
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SetLiveGiftEffectKey(String str, GameObject gameObject) {
            super(null);
            p.h(str, "key");
            p.h(gameObject, "gameObject");
            this.key = str;
            this.gameObject = gameObject;
        }
    }

    /* loaded from: classes3.dex */
    public static final class SetLiveSentGiftId extends UnityCommand {
        public static final int $stable = 0;
        private final GameObject gameObject;
        private final String liveSentGiftId;

        public /* synthetic */ SetLiveSentGiftId(String str, GameObject gameObject, int i10, h hVar) {
            this(str, (i10 & 2) != 0 ? GameObject.SCENE_MANAGER : gameObject);
        }

        private final String component1() {
            return this.liveSentGiftId;
        }

        public static /* synthetic */ SetLiveSentGiftId copy$default(SetLiveSentGiftId setLiveSentGiftId, String str, GameObject gameObject, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = setLiveSentGiftId.liveSentGiftId;
            }
            if ((i10 & 2) != 0) {
                gameObject = setLiveSentGiftId.getGameObject();
            }
            return setLiveSentGiftId.copy(str, gameObject);
        }

        @Override // com.dena.mirrorman.unity.UnityCommand
        public String buildMessage() {
            return this.liveSentGiftId;
        }

        public final GameObject component2() {
            return getGameObject();
        }

        public final SetLiveSentGiftId copy(String str, GameObject gameObject) {
            p.h(str, "liveSentGiftId");
            p.h(gameObject, "gameObject");
            return new SetLiveSentGiftId(str, gameObject);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof SetLiveSentGiftId) {
                SetLiveSentGiftId setLiveSentGiftId = (SetLiveSentGiftId) obj;
                return p.c(this.liveSentGiftId, setLiveSentGiftId.liveSentGiftId) && getGameObject() == setLiveSentGiftId.getGameObject();
            }
            return false;
        }

        @Override // com.dena.mirrorman.unity.UnityCommand
        public GameObject getGameObject() {
            return this.gameObject;
        }

        public int hashCode() {
            return (this.liveSentGiftId.hashCode() * 31) + getGameObject().hashCode();
        }

        public String toString() {
            return "SetLiveSentGiftId(liveSentGiftId=" + this.liveSentGiftId + ", gameObject=" + getGameObject() + ')';
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SetLiveSentGiftId(String str, GameObject gameObject) {
            super(null);
            p.h(str, "liveSentGiftId");
            p.h(gameObject, "gameObject");
            this.liveSentGiftId = str;
            this.gameObject = gameObject;
        }
    }

    /* loaded from: classes3.dex */
    public static final class SetMainichi extends UnityCommand {
        public static final int $stable = 0;
        private final int continuousStreamingCount;
        private final GameObject gameObject;

        public /* synthetic */ SetMainichi(int i10, GameObject gameObject, int i11, h hVar) {
            this(i10, (i11 & 2) != 0 ? GameObject.SCENE_MANAGER : gameObject);
        }

        private final int component1() {
            return this.continuousStreamingCount;
        }

        public static /* synthetic */ SetMainichi copy$default(SetMainichi setMainichi, int i10, GameObject gameObject, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                i10 = setMainichi.continuousStreamingCount;
            }
            if ((i11 & 2) != 0) {
                gameObject = setMainichi.getGameObject();
            }
            return setMainichi.copy(i10, gameObject);
        }

        @Override // com.dena.mirrorman.unity.UnityCommand
        public String buildMessage() {
            return String.valueOf(this.continuousStreamingCount);
        }

        public final GameObject component2() {
            return getGameObject();
        }

        public final SetMainichi copy(int i10, GameObject gameObject) {
            p.h(gameObject, "gameObject");
            return new SetMainichi(i10, gameObject);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof SetMainichi) {
                SetMainichi setMainichi = (SetMainichi) obj;
                return this.continuousStreamingCount == setMainichi.continuousStreamingCount && getGameObject() == setMainichi.getGameObject();
            }
            return false;
        }

        @Override // com.dena.mirrorman.unity.UnityCommand
        public GameObject getGameObject() {
            return this.gameObject;
        }

        public int hashCode() {
            return (Integer.hashCode(this.continuousStreamingCount) * 31) + getGameObject().hashCode();
        }

        public String toString() {
            return "SetMainichi(continuousStreamingCount=" + this.continuousStreamingCount + ", gameObject=" + getGameObject() + ')';
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SetMainichi(int i10, GameObject gameObject) {
            super(null);
            p.h(gameObject, "gameObject");
            this.continuousStreamingCount = i10;
            this.gameObject = gameObject;
        }
    }

    /* loaded from: classes3.dex */
    public static final class SetMiniGameAvatarModel extends UnityCommand {
        public static final int $stable = 8;
        private final jf.c closetAvatarModel;
        private final GameObject gameObject;

        public /* synthetic */ SetMiniGameAvatarModel(jf.c cVar, GameObject gameObject, int i10, h hVar) {
            this(cVar, (i10 & 2) != 0 ? GameObject.SCENE_MANAGER : gameObject);
        }

        private final jf.c component1() {
            return this.closetAvatarModel;
        }

        public static /* synthetic */ SetMiniGameAvatarModel copy$default(SetMiniGameAvatarModel setMiniGameAvatarModel, jf.c cVar, GameObject gameObject, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                cVar = setMiniGameAvatarModel.closetAvatarModel;
            }
            if ((i10 & 2) != 0) {
                gameObject = setMiniGameAvatarModel.getGameObject();
            }
            return setMiniGameAvatarModel.copy(cVar, gameObject);
        }

        @Override // com.dena.mirrorman.unity.UnityCommand
        public String buildMessage() {
            return "avatar_f_model,Avatar.prefab;" + this.closetAvatarModel.b();
        }

        public final GameObject component2() {
            return getGameObject();
        }

        public final SetMiniGameAvatarModel copy(jf.c cVar, GameObject gameObject) {
            p.h(cVar, "closetAvatarModel");
            p.h(gameObject, "gameObject");
            return new SetMiniGameAvatarModel(cVar, gameObject);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof SetMiniGameAvatarModel) {
                SetMiniGameAvatarModel setMiniGameAvatarModel = (SetMiniGameAvatarModel) obj;
                return p.c(this.closetAvatarModel, setMiniGameAvatarModel.closetAvatarModel) && getGameObject() == setMiniGameAvatarModel.getGameObject();
            }
            return false;
        }

        @Override // com.dena.mirrorman.unity.UnityCommand
        public GameObject getGameObject() {
            return this.gameObject;
        }

        public int hashCode() {
            return (this.closetAvatarModel.hashCode() * 31) + getGameObject().hashCode();
        }

        public String toString() {
            return "SetMiniGameAvatarModel(closetAvatarModel=" + this.closetAvatarModel + ", gameObject=" + getGameObject() + ')';
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SetMiniGameAvatarModel(jf.c cVar, GameObject gameObject) {
            super(null);
            p.h(cVar, "closetAvatarModel");
            p.h(gameObject, "gameObject");
            this.closetAvatarModel = cVar;
            this.gameObject = gameObject;
        }
    }

    /* loaded from: classes3.dex */
    public static final class SetMiniGameParams extends UnityCommand {
        public static final int $stable = 0;
        private final GameObject gameObject;
        private final MiniGameParam miniGameParam;

        public /* synthetic */ SetMiniGameParams(MiniGameParam miniGameParam, GameObject gameObject, int i10, h hVar) {
            this(miniGameParam, (i10 & 2) != 0 ? GameObject.SCENE_MANAGER : gameObject);
        }

        private final MiniGameParam component1() {
            return this.miniGameParam;
        }

        public static /* synthetic */ SetMiniGameParams copy$default(SetMiniGameParams setMiniGameParams, MiniGameParam miniGameParam, GameObject gameObject, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                miniGameParam = setMiniGameParams.miniGameParam;
            }
            if ((i10 & 2) != 0) {
                gameObject = setMiniGameParams.getGameObject();
            }
            return setMiniGameParams.copy(miniGameParam, gameObject);
        }

        @Override // com.dena.mirrorman.unity.UnityCommand
        public String buildMessage() {
            return this.miniGameParam.buildMessage();
        }

        public final GameObject component2() {
            return getGameObject();
        }

        public final SetMiniGameParams copy(MiniGameParam miniGameParam, GameObject gameObject) {
            p.h(miniGameParam, "miniGameParam");
            p.h(gameObject, "gameObject");
            return new SetMiniGameParams(miniGameParam, gameObject);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof SetMiniGameParams) {
                SetMiniGameParams setMiniGameParams = (SetMiniGameParams) obj;
                return p.c(this.miniGameParam, setMiniGameParams.miniGameParam) && getGameObject() == setMiniGameParams.getGameObject();
            }
            return false;
        }

        @Override // com.dena.mirrorman.unity.UnityCommand
        public GameObject getGameObject() {
            return this.gameObject;
        }

        public int hashCode() {
            return (this.miniGameParam.hashCode() * 31) + getGameObject().hashCode();
        }

        public String toString() {
            return "SetMiniGameParams(miniGameParam=" + this.miniGameParam + ", gameObject=" + getGameObject() + ')';
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SetMiniGameParams(MiniGameParam miniGameParam, GameObject gameObject) {
            super(null);
            p.h(miniGameParam, "miniGameParam");
            p.h(gameObject, "gameObject");
            this.miniGameParam = miniGameParam;
            this.gameObject = gameObject;
        }
    }

    /* loaded from: classes3.dex */
    public static final class SetMyLiveComment extends UnityCommand {
        public static final int $stable = 0;
        private final String comment;
        private final GameObject gameObject;

        public /* synthetic */ SetMyLiveComment(String str, GameObject gameObject, int i10, h hVar) {
            this(str, (i10 & 2) != 0 ? GameObject.SCENE_MANAGER : gameObject);
        }

        private final String component1() {
            return this.comment;
        }

        public static /* synthetic */ SetMyLiveComment copy$default(SetMyLiveComment setMyLiveComment, String str, GameObject gameObject, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = setMyLiveComment.comment;
            }
            if ((i10 & 2) != 0) {
                gameObject = setMyLiveComment.getGameObject();
            }
            return setMyLiveComment.copy(str, gameObject);
        }

        @Override // com.dena.mirrorman.unity.UnityCommand
        public String buildMessage() {
            byte[] bytes = this.comment.getBytes(so.c.f52772b);
            p.g(bytes, "this as java.lang.String).getBytes(charset)");
            String encodeToString = Base64.encodeToString(bytes, 0);
            p.g(encodeToString, "encodeToString(comment.t…eArray(), Base64.DEFAULT)");
            return encodeToString;
        }

        public final GameObject component2() {
            return getGameObject();
        }

        public final SetMyLiveComment copy(String str, GameObject gameObject) {
            p.h(str, "comment");
            p.h(gameObject, "gameObject");
            return new SetMyLiveComment(str, gameObject);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof SetMyLiveComment) {
                SetMyLiveComment setMyLiveComment = (SetMyLiveComment) obj;
                return p.c(this.comment, setMyLiveComment.comment) && getGameObject() == setMyLiveComment.getGameObject();
            }
            return false;
        }

        @Override // com.dena.mirrorman.unity.UnityCommand
        public GameObject getGameObject() {
            return this.gameObject;
        }

        public int hashCode() {
            return (this.comment.hashCode() * 31) + getGameObject().hashCode();
        }

        public String toString() {
            return "SetMyLiveComment(comment=" + this.comment + ", gameObject=" + getGameObject() + ')';
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SetMyLiveComment(String str, GameObject gameObject) {
            super(null);
            p.h(str, "comment");
            p.h(gameObject, "gameObject");
            this.comment = str;
            this.gameObject = gameObject;
        }
    }

    /* loaded from: classes3.dex */
    public static final class SetPartsComment extends UnityCommand {
        public static final int $stable = 0;
        private final GameObject gameObject;
        private final String partsCategory;
        private final String text;

        public /* synthetic */ SetPartsComment(String str, String str2, GameObject gameObject, int i10, h hVar) {
            this(str, str2, (i10 & 4) != 0 ? GameObject.SCENE_MANAGER : gameObject);
        }

        private final String component1() {
            return this.partsCategory;
        }

        private final String component2() {
            return this.text;
        }

        public static /* synthetic */ SetPartsComment copy$default(SetPartsComment setPartsComment, String str, String str2, GameObject gameObject, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = setPartsComment.partsCategory;
            }
            if ((i10 & 2) != 0) {
                str2 = setPartsComment.text;
            }
            if ((i10 & 4) != 0) {
                gameObject = setPartsComment.getGameObject();
            }
            return setPartsComment.copy(str, str2, gameObject);
        }

        @Override // com.dena.mirrorman.unity.UnityCommand
        public String buildMessage() {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(this.partsCategory);
            sb2.append(',');
            byte[] bytes = this.text.getBytes(so.c.f52772b);
            p.g(bytes, "this as java.lang.String).getBytes(charset)");
            sb2.append(Base64.encodeToString(bytes, 0));
            return sb2.toString();
        }

        public final GameObject component3() {
            return getGameObject();
        }

        public final SetPartsComment copy(String str, String str2, GameObject gameObject) {
            p.h(str, "partsCategory");
            p.h(str2, "text");
            p.h(gameObject, "gameObject");
            return new SetPartsComment(str, str2, gameObject);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof SetPartsComment) {
                SetPartsComment setPartsComment = (SetPartsComment) obj;
                return p.c(this.partsCategory, setPartsComment.partsCategory) && p.c(this.text, setPartsComment.text) && getGameObject() == setPartsComment.getGameObject();
            }
            return false;
        }

        @Override // com.dena.mirrorman.unity.UnityCommand
        public GameObject getGameObject() {
            return this.gameObject;
        }

        public int hashCode() {
            return (((this.partsCategory.hashCode() * 31) + this.text.hashCode()) * 31) + getGameObject().hashCode();
        }

        public String toString() {
            return "SetPartsComment(partsCategory=" + this.partsCategory + ", text=" + this.text + ", gameObject=" + getGameObject() + ')';
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SetPartsComment(String str, String str2, GameObject gameObject) {
            super(null);
            p.h(str, "partsCategory");
            p.h(str2, "text");
            p.h(gameObject, "gameObject");
            this.partsCategory = str;
            this.text = str2;
            this.gameObject = gameObject;
        }
    }

    /* loaded from: classes3.dex */
    public static final class SetRichUniqueGiftAnimation extends UnityCommand {
        public static final int $stable = 0;
        private final GameObject gameObject;
        private final String motionName;

        public /* synthetic */ SetRichUniqueGiftAnimation(String str, GameObject gameObject, int i10, h hVar) {
            this(str, (i10 & 2) != 0 ? GameObject.SCENE_MANAGER : gameObject);
        }

        private final String component1() {
            return this.motionName;
        }

        public static /* synthetic */ SetRichUniqueGiftAnimation copy$default(SetRichUniqueGiftAnimation setRichUniqueGiftAnimation, String str, GameObject gameObject, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = setRichUniqueGiftAnimation.motionName;
            }
            if ((i10 & 2) != 0) {
                gameObject = setRichUniqueGiftAnimation.getGameObject();
            }
            return setRichUniqueGiftAnimation.copy(str, gameObject);
        }

        @Override // com.dena.mirrorman.unity.UnityCommand
        public String buildMessage() {
            return this.motionName;
        }

        public final GameObject component2() {
            return getGameObject();
        }

        public final SetRichUniqueGiftAnimation copy(String str, GameObject gameObject) {
            p.h(str, "motionName");
            p.h(gameObject, "gameObject");
            return new SetRichUniqueGiftAnimation(str, gameObject);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof SetRichUniqueGiftAnimation) {
                SetRichUniqueGiftAnimation setRichUniqueGiftAnimation = (SetRichUniqueGiftAnimation) obj;
                return p.c(this.motionName, setRichUniqueGiftAnimation.motionName) && getGameObject() == setRichUniqueGiftAnimation.getGameObject();
            }
            return false;
        }

        @Override // com.dena.mirrorman.unity.UnityCommand
        public GameObject getGameObject() {
            return this.gameObject;
        }

        public int hashCode() {
            return (this.motionName.hashCode() * 31) + getGameObject().hashCode();
        }

        public String toString() {
            return "SetRichUniqueGiftAnimation(motionName=" + this.motionName + ", gameObject=" + getGameObject() + ')';
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SetRichUniqueGiftAnimation(String str, GameObject gameObject) {
            super(null);
            p.h(str, "motionName");
            p.h(gameObject, "gameObject");
            this.motionName = str;
            this.gameObject = gameObject;
        }
    }

    /* loaded from: classes3.dex */
    public static final class SetRichUniqueGiftColor extends UnityCommand {
        public static final int $stable = 0;
        private final String fontName;
        private final GameObject gameObject;
        private final int index;

        public /* synthetic */ SetRichUniqueGiftColor(int i10, String str, GameObject gameObject, int i11, h hVar) {
            this(i10, str, (i11 & 4) != 0 ? GameObject.SCENE_MANAGER : gameObject);
        }

        private final int component1() {
            return this.index;
        }

        private final String component2() {
            return this.fontName;
        }

        public static /* synthetic */ SetRichUniqueGiftColor copy$default(SetRichUniqueGiftColor setRichUniqueGiftColor, int i10, String str, GameObject gameObject, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                i10 = setRichUniqueGiftColor.index;
            }
            if ((i11 & 2) != 0) {
                str = setRichUniqueGiftColor.fontName;
            }
            if ((i11 & 4) != 0) {
                gameObject = setRichUniqueGiftColor.getGameObject();
            }
            return setRichUniqueGiftColor.copy(i10, str, gameObject);
        }

        @Override // com.dena.mirrorman.unity.UnityCommand
        public String buildMessage() {
            return this.index + ',' + this.fontName;
        }

        public final GameObject component3() {
            return getGameObject();
        }

        public final SetRichUniqueGiftColor copy(int i10, String str, GameObject gameObject) {
            p.h(str, "fontName");
            p.h(gameObject, "gameObject");
            return new SetRichUniqueGiftColor(i10, str, gameObject);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof SetRichUniqueGiftColor) {
                SetRichUniqueGiftColor setRichUniqueGiftColor = (SetRichUniqueGiftColor) obj;
                return this.index == setRichUniqueGiftColor.index && p.c(this.fontName, setRichUniqueGiftColor.fontName) && getGameObject() == setRichUniqueGiftColor.getGameObject();
            }
            return false;
        }

        @Override // com.dena.mirrorman.unity.UnityCommand
        public GameObject getGameObject() {
            return this.gameObject;
        }

        public int hashCode() {
            return (((Integer.hashCode(this.index) * 31) + this.fontName.hashCode()) * 31) + getGameObject().hashCode();
        }

        public String toString() {
            return "SetRichUniqueGiftColor(index=" + this.index + ", fontName=" + this.fontName + ", gameObject=" + getGameObject() + ')';
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SetRichUniqueGiftColor(int i10, String str, GameObject gameObject) {
            super(null);
            p.h(str, "fontName");
            p.h(gameObject, "gameObject");
            this.index = i10;
            this.fontName = str;
            this.gameObject = gameObject;
        }
    }

    /* loaded from: classes3.dex */
    public static final class SetRichUniqueGiftMessage extends UnityCommand {
        public static final int $stable = 0;
        private final GameObject gameObject;
        private final int index;
        private final String message;

        public /* synthetic */ SetRichUniqueGiftMessage(int i10, String str, GameObject gameObject, int i11, h hVar) {
            this(i10, str, (i11 & 4) != 0 ? GameObject.SCENE_MANAGER : gameObject);
        }

        private final int component1() {
            return this.index;
        }

        private final String component2() {
            return this.message;
        }

        public static /* synthetic */ SetRichUniqueGiftMessage copy$default(SetRichUniqueGiftMessage setRichUniqueGiftMessage, int i10, String str, GameObject gameObject, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                i10 = setRichUniqueGiftMessage.index;
            }
            if ((i11 & 2) != 0) {
                str = setRichUniqueGiftMessage.message;
            }
            if ((i11 & 4) != 0) {
                gameObject = setRichUniqueGiftMessage.getGameObject();
            }
            return setRichUniqueGiftMessage.copy(i10, str, gameObject);
        }

        @Override // com.dena.mirrorman.unity.UnityCommand
        public String buildMessage() {
            return this.index + ',' + this.message;
        }

        public final GameObject component3() {
            return getGameObject();
        }

        public final SetRichUniqueGiftMessage copy(int i10, String str, GameObject gameObject) {
            p.h(str, "message");
            p.h(gameObject, "gameObject");
            return new SetRichUniqueGiftMessage(i10, str, gameObject);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof SetRichUniqueGiftMessage) {
                SetRichUniqueGiftMessage setRichUniqueGiftMessage = (SetRichUniqueGiftMessage) obj;
                return this.index == setRichUniqueGiftMessage.index && p.c(this.message, setRichUniqueGiftMessage.message) && getGameObject() == setRichUniqueGiftMessage.getGameObject();
            }
            return false;
        }

        @Override // com.dena.mirrorman.unity.UnityCommand
        public GameObject getGameObject() {
            return this.gameObject;
        }

        public int hashCode() {
            return (((Integer.hashCode(this.index) * 31) + this.message.hashCode()) * 31) + getGameObject().hashCode();
        }

        public String toString() {
            return "SetRichUniqueGiftMessage(index=" + this.index + ", message=" + this.message + ", gameObject=" + getGameObject() + ')';
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SetRichUniqueGiftMessage(int i10, String str, GameObject gameObject) {
            super(null);
            p.h(str, "message");
            p.h(gameObject, "gameObject");
            this.index = i10;
            this.message = str;
            this.gameObject = gameObject;
        }
    }

    /* loaded from: classes3.dex */
    public static final class SetRichUniqueGiftMessagePreset extends UnityCommand {
        public static final int $stable = 0;
        private final GameObject gameObject;
        private final String presetName;

        public /* synthetic */ SetRichUniqueGiftMessagePreset(String str, GameObject gameObject, int i10, h hVar) {
            this(str, (i10 & 2) != 0 ? GameObject.SCENE_MANAGER : gameObject);
        }

        private final String component1() {
            return this.presetName;
        }

        public static /* synthetic */ SetRichUniqueGiftMessagePreset copy$default(SetRichUniqueGiftMessagePreset setRichUniqueGiftMessagePreset, String str, GameObject gameObject, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = setRichUniqueGiftMessagePreset.presetName;
            }
            if ((i10 & 2) != 0) {
                gameObject = setRichUniqueGiftMessagePreset.getGameObject();
            }
            return setRichUniqueGiftMessagePreset.copy(str, gameObject);
        }

        @Override // com.dena.mirrorman.unity.UnityCommand
        public String buildMessage() {
            return this.presetName;
        }

        public final GameObject component2() {
            return getGameObject();
        }

        public final SetRichUniqueGiftMessagePreset copy(String str, GameObject gameObject) {
            p.h(str, "presetName");
            p.h(gameObject, "gameObject");
            return new SetRichUniqueGiftMessagePreset(str, gameObject);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof SetRichUniqueGiftMessagePreset) {
                SetRichUniqueGiftMessagePreset setRichUniqueGiftMessagePreset = (SetRichUniqueGiftMessagePreset) obj;
                return p.c(this.presetName, setRichUniqueGiftMessagePreset.presetName) && getGameObject() == setRichUniqueGiftMessagePreset.getGameObject();
            }
            return false;
        }

        @Override // com.dena.mirrorman.unity.UnityCommand
        public GameObject getGameObject() {
            return this.gameObject;
        }

        public int hashCode() {
            return (this.presetName.hashCode() * 31) + getGameObject().hashCode();
        }

        public String toString() {
            return "SetRichUniqueGiftMessagePreset(presetName=" + this.presetName + ", gameObject=" + getGameObject() + ')';
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SetRichUniqueGiftMessagePreset(String str, GameObject gameObject) {
            super(null);
            p.h(str, "presetName");
            p.h(gameObject, "gameObject");
            this.presetName = str;
            this.gameObject = gameObject;
        }
    }

    /* loaded from: classes3.dex */
    public static final class SetRichUniqueGiftPlayMode extends UnityCommand {
        public static final int $stable = 0;
        private final GameObject gameObject;
        private final com.dena.mirrorman.unity.MiniGameInput miniGameInput;

        public /* synthetic */ SetRichUniqueGiftPlayMode(com.dena.mirrorman.unity.MiniGameInput miniGameInput, GameObject gameObject, int i10, h hVar) {
            this(miniGameInput, (i10 & 2) != 0 ? GameObject.SCENE_MANAGER : gameObject);
        }

        private final com.dena.mirrorman.unity.MiniGameInput component1() {
            return this.miniGameInput;
        }

        public static /* synthetic */ SetRichUniqueGiftPlayMode copy$default(SetRichUniqueGiftPlayMode setRichUniqueGiftPlayMode, com.dena.mirrorman.unity.MiniGameInput miniGameInput, GameObject gameObject, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                miniGameInput = setRichUniqueGiftPlayMode.miniGameInput;
            }
            if ((i10 & 2) != 0) {
                gameObject = setRichUniqueGiftPlayMode.getGameObject();
            }
            return setRichUniqueGiftPlayMode.copy(miniGameInput, gameObject);
        }

        @Override // com.dena.mirrorman.unity.UnityCommand
        public String buildMessage() {
            return this.miniGameInput.buildMessage();
        }

        public final GameObject component2() {
            return getGameObject();
        }

        public final SetRichUniqueGiftPlayMode copy(com.dena.mirrorman.unity.MiniGameInput miniGameInput, GameObject gameObject) {
            p.h(miniGameInput, "miniGameInput");
            p.h(gameObject, "gameObject");
            return new SetRichUniqueGiftPlayMode(miniGameInput, gameObject);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof SetRichUniqueGiftPlayMode) {
                SetRichUniqueGiftPlayMode setRichUniqueGiftPlayMode = (SetRichUniqueGiftPlayMode) obj;
                return p.c(this.miniGameInput, setRichUniqueGiftPlayMode.miniGameInput) && getGameObject() == setRichUniqueGiftPlayMode.getGameObject();
            }
            return false;
        }

        @Override // com.dena.mirrorman.unity.UnityCommand
        public GameObject getGameObject() {
            return this.gameObject;
        }

        public int hashCode() {
            return (this.miniGameInput.hashCode() * 31) + getGameObject().hashCode();
        }

        public String toString() {
            return "SetRichUniqueGiftPlayMode(miniGameInput=" + this.miniGameInput + ", gameObject=" + getGameObject() + ')';
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SetRichUniqueGiftPlayMode(com.dena.mirrorman.unity.MiniGameInput miniGameInput, GameObject gameObject) {
            super(null);
            p.h(miniGameInput, "miniGameInput");
            p.h(gameObject, "gameObject");
            this.miniGameInput = miniGameInput;
            this.gameObject = gameObject;
        }
    }

    /* loaded from: classes3.dex */
    public static final class SetRichUniqueGiftStreamerAvatarModel extends UnityCommand {
        public static final int $stable = 8;
        private final jf.c closetAvatarModel;
        private final GameObject gameObject;

        public /* synthetic */ SetRichUniqueGiftStreamerAvatarModel(jf.c cVar, GameObject gameObject, int i10, h hVar) {
            this(cVar, (i10 & 2) != 0 ? GameObject.SCENE_MANAGER : gameObject);
        }

        private final jf.c component1() {
            return this.closetAvatarModel;
        }

        public static /* synthetic */ SetRichUniqueGiftStreamerAvatarModel copy$default(SetRichUniqueGiftStreamerAvatarModel setRichUniqueGiftStreamerAvatarModel, jf.c cVar, GameObject gameObject, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                cVar = setRichUniqueGiftStreamerAvatarModel.closetAvatarModel;
            }
            if ((i10 & 2) != 0) {
                gameObject = setRichUniqueGiftStreamerAvatarModel.getGameObject();
            }
            return setRichUniqueGiftStreamerAvatarModel.copy(cVar, gameObject);
        }

        @Override // com.dena.mirrorman.unity.UnityCommand
        public String buildMessage() {
            return "avatar_f_model,Avatar.prefab;" + this.closetAvatarModel.b();
        }

        public final GameObject component2() {
            return getGameObject();
        }

        public final SetRichUniqueGiftStreamerAvatarModel copy(jf.c cVar, GameObject gameObject) {
            p.h(cVar, "closetAvatarModel");
            p.h(gameObject, "gameObject");
            return new SetRichUniqueGiftStreamerAvatarModel(cVar, gameObject);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof SetRichUniqueGiftStreamerAvatarModel) {
                SetRichUniqueGiftStreamerAvatarModel setRichUniqueGiftStreamerAvatarModel = (SetRichUniqueGiftStreamerAvatarModel) obj;
                return p.c(this.closetAvatarModel, setRichUniqueGiftStreamerAvatarModel.closetAvatarModel) && getGameObject() == setRichUniqueGiftStreamerAvatarModel.getGameObject();
            }
            return false;
        }

        @Override // com.dena.mirrorman.unity.UnityCommand
        public GameObject getGameObject() {
            return this.gameObject;
        }

        public int hashCode() {
            return (this.closetAvatarModel.hashCode() * 31) + getGameObject().hashCode();
        }

        public String toString() {
            return "SetRichUniqueGiftStreamerAvatarModel(closetAvatarModel=" + this.closetAvatarModel + ", gameObject=" + getGameObject() + ')';
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SetRichUniqueGiftStreamerAvatarModel(jf.c cVar, GameObject gameObject) {
            super(null);
            p.h(cVar, "closetAvatarModel");
            p.h(gameObject, "gameObject");
            this.closetAvatarModel = cVar;
            this.gameObject = gameObject;
        }
    }

    /* loaded from: classes3.dex */
    public static final class SetRichUniqueGiftViewerAvatarModel extends UnityCommand {
        public static final int $stable = 8;
        private final jf.c closetAvatarModel;
        private final GameObject gameObject;

        public /* synthetic */ SetRichUniqueGiftViewerAvatarModel(jf.c cVar, GameObject gameObject, int i10, h hVar) {
            this(cVar, (i10 & 2) != 0 ? GameObject.SCENE_MANAGER : gameObject);
        }

        private final jf.c component1() {
            return this.closetAvatarModel;
        }

        public static /* synthetic */ SetRichUniqueGiftViewerAvatarModel copy$default(SetRichUniqueGiftViewerAvatarModel setRichUniqueGiftViewerAvatarModel, jf.c cVar, GameObject gameObject, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                cVar = setRichUniqueGiftViewerAvatarModel.closetAvatarModel;
            }
            if ((i10 & 2) != 0) {
                gameObject = setRichUniqueGiftViewerAvatarModel.getGameObject();
            }
            return setRichUniqueGiftViewerAvatarModel.copy(cVar, gameObject);
        }

        @Override // com.dena.mirrorman.unity.UnityCommand
        public String buildMessage() {
            return "avatar_f_model,Avatar.prefab;" + this.closetAvatarModel.b();
        }

        public final GameObject component2() {
            return getGameObject();
        }

        public final SetRichUniqueGiftViewerAvatarModel copy(jf.c cVar, GameObject gameObject) {
            p.h(cVar, "closetAvatarModel");
            p.h(gameObject, "gameObject");
            return new SetRichUniqueGiftViewerAvatarModel(cVar, gameObject);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof SetRichUniqueGiftViewerAvatarModel) {
                SetRichUniqueGiftViewerAvatarModel setRichUniqueGiftViewerAvatarModel = (SetRichUniqueGiftViewerAvatarModel) obj;
                return p.c(this.closetAvatarModel, setRichUniqueGiftViewerAvatarModel.closetAvatarModel) && getGameObject() == setRichUniqueGiftViewerAvatarModel.getGameObject();
            }
            return false;
        }

        @Override // com.dena.mirrorman.unity.UnityCommand
        public GameObject getGameObject() {
            return this.gameObject;
        }

        public int hashCode() {
            return (this.closetAvatarModel.hashCode() * 31) + getGameObject().hashCode();
        }

        public String toString() {
            return "SetRichUniqueGiftViewerAvatarModel(closetAvatarModel=" + this.closetAvatarModel + ", gameObject=" + getGameObject() + ')';
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SetRichUniqueGiftViewerAvatarModel(jf.c cVar, GameObject gameObject) {
            super(null);
            p.h(cVar, "closetAvatarModel");
            p.h(gameObject, "gameObject");
            this.closetAvatarModel = cVar;
            this.gameObject = gameObject;
        }
    }

    /* loaded from: classes3.dex */
    public static final class SetShooterGameAvatarModel extends UnityCommand {
        public static final int $stable = 8;
        private final GameObject gameObject;
        private final ShooterMemberAvatar shooterMemberAvatar;

        public /* synthetic */ SetShooterGameAvatarModel(ShooterMemberAvatar shooterMemberAvatar, GameObject gameObject, int i10, h hVar) {
            this(shooterMemberAvatar, (i10 & 2) != 0 ? GameObject.SCENE_MANAGER : gameObject);
        }

        private final ShooterMemberAvatar component1() {
            return this.shooterMemberAvatar;
        }

        public static /* synthetic */ SetShooterGameAvatarModel copy$default(SetShooterGameAvatarModel setShooterGameAvatarModel, ShooterMemberAvatar shooterMemberAvatar, GameObject gameObject, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                shooterMemberAvatar = setShooterGameAvatarModel.shooterMemberAvatar;
            }
            if ((i10 & 2) != 0) {
                gameObject = setShooterGameAvatarModel.getGameObject();
            }
            return setShooterGameAvatarModel.copy(shooterMemberAvatar, gameObject);
        }

        @Override // com.dena.mirrorman.unity.UnityCommand
        public String buildMessage() {
            return ((this.shooterMemberAvatar.getShooterPartyType() == ShooterPartyType.OTHER ? "avatar_f_model,Avatar.prefab,use_head_only;" : "avatar_f_model,Avatar.prefab;") + this.shooterMemberAvatar.build() + ';') + "SetAvatarExtension:" + this.shooterMemberAvatar.createExtData();
        }

        public final GameObject component2() {
            return getGameObject();
        }

        public final SetShooterGameAvatarModel copy(ShooterMemberAvatar shooterMemberAvatar, GameObject gameObject) {
            p.h(shooterMemberAvatar, "shooterMemberAvatar");
            p.h(gameObject, "gameObject");
            return new SetShooterGameAvatarModel(shooterMemberAvatar, gameObject);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof SetShooterGameAvatarModel) {
                SetShooterGameAvatarModel setShooterGameAvatarModel = (SetShooterGameAvatarModel) obj;
                return p.c(this.shooterMemberAvatar, setShooterGameAvatarModel.shooterMemberAvatar) && getGameObject() == setShooterGameAvatarModel.getGameObject();
            }
            return false;
        }

        @Override // com.dena.mirrorman.unity.UnityCommand
        public GameObject getGameObject() {
            return this.gameObject;
        }

        public int hashCode() {
            return (this.shooterMemberAvatar.hashCode() * 31) + getGameObject().hashCode();
        }

        public String toString() {
            return "SetShooterGameAvatarModel(shooterMemberAvatar=" + this.shooterMemberAvatar + ", gameObject=" + getGameObject() + ')';
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SetShooterGameAvatarModel(ShooterMemberAvatar shooterMemberAvatar, GameObject gameObject) {
            super(null);
            p.h(shooterMemberAvatar, "shooterMemberAvatar");
            p.h(gameObject, "gameObject");
            this.shooterMemberAvatar = shooterMemberAvatar;
            this.gameObject = gameObject;
        }
    }

    /* loaded from: classes3.dex */
    public static final class SetUserTrackingInfo extends UnityCommand {
        public static final int $stable = 0;
        private final GameObject gameObject;
        private final String userId;
        private final String uuid;

        public /* synthetic */ SetUserTrackingInfo(String str, String str2, GameObject gameObject, int i10, h hVar) {
            this(str, str2, (i10 & 4) != 0 ? GameObject.SCENE_MANAGER : gameObject);
        }

        private final String component1() {
            return this.userId;
        }

        private final String component2() {
            return this.uuid;
        }

        public static /* synthetic */ SetUserTrackingInfo copy$default(SetUserTrackingInfo setUserTrackingInfo, String str, String str2, GameObject gameObject, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = setUserTrackingInfo.userId;
            }
            if ((i10 & 2) != 0) {
                str2 = setUserTrackingInfo.uuid;
            }
            if ((i10 & 4) != 0) {
                gameObject = setUserTrackingInfo.getGameObject();
            }
            return setUserTrackingInfo.copy(str, str2, gameObject);
        }

        @Override // com.dena.mirrorman.unity.UnityCommand
        public String buildMessage() {
            return this.userId + ',' + this.uuid;
        }

        public final GameObject component3() {
            return getGameObject();
        }

        public final SetUserTrackingInfo copy(String str, String str2, GameObject gameObject) {
            p.h(str, "userId");
            p.h(str2, "uuid");
            p.h(gameObject, "gameObject");
            return new SetUserTrackingInfo(str, str2, gameObject);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof SetUserTrackingInfo) {
                SetUserTrackingInfo setUserTrackingInfo = (SetUserTrackingInfo) obj;
                return p.c(this.userId, setUserTrackingInfo.userId) && p.c(this.uuid, setUserTrackingInfo.uuid) && getGameObject() == setUserTrackingInfo.getGameObject();
            }
            return false;
        }

        @Override // com.dena.mirrorman.unity.UnityCommand
        public GameObject getGameObject() {
            return this.gameObject;
        }

        public int hashCode() {
            return (((this.userId.hashCode() * 31) + this.uuid.hashCode()) * 31) + getGameObject().hashCode();
        }

        public String toString() {
            return "SetUserTrackingInfo(userId=" + this.userId + ", uuid=" + this.uuid + ", gameObject=" + getGameObject() + ')';
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SetUserTrackingInfo(String str, String str2, GameObject gameObject) {
            super(null);
            p.h(str, "userId");
            p.h(str2, "uuid");
            p.h(gameObject, "gameObject");
            this.userId = str;
            this.uuid = str2;
            this.gameObject = gameObject;
        }
    }

    /* loaded from: classes3.dex */
    public static final class UnloadAvatarSlot extends UnityCommand {
        public static final int $stable = 0;
        private final GameObject gameObject;
        private final int targetSlot;

        public /* synthetic */ UnloadAvatarSlot(int i10, GameObject gameObject, int i11, h hVar) {
            this(i10, (i11 & 2) != 0 ? GameObject.SCENE_MANAGER : gameObject);
        }

        private final int component1() {
            return this.targetSlot;
        }

        public static /* synthetic */ UnloadAvatarSlot copy$default(UnloadAvatarSlot unloadAvatarSlot, int i10, GameObject gameObject, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                i10 = unloadAvatarSlot.targetSlot;
            }
            if ((i11 & 2) != 0) {
                gameObject = unloadAvatarSlot.getGameObject();
            }
            return unloadAvatarSlot.copy(i10, gameObject);
        }

        @Override // com.dena.mirrorman.unity.UnityCommand
        public String buildMessage() {
            return String.valueOf(this.targetSlot);
        }

        public final GameObject component2() {
            return getGameObject();
        }

        public final UnloadAvatarSlot copy(int i10, GameObject gameObject) {
            p.h(gameObject, "gameObject");
            return new UnloadAvatarSlot(i10, gameObject);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof UnloadAvatarSlot) {
                UnloadAvatarSlot unloadAvatarSlot = (UnloadAvatarSlot) obj;
                return this.targetSlot == unloadAvatarSlot.targetSlot && getGameObject() == unloadAvatarSlot.getGameObject();
            }
            return false;
        }

        @Override // com.dena.mirrorman.unity.UnityCommand
        public GameObject getGameObject() {
            return this.gameObject;
        }

        public int hashCode() {
            return (Integer.hashCode(this.targetSlot) * 31) + getGameObject().hashCode();
        }

        public String toString() {
            return "UnloadAvatarSlot(targetSlot=" + this.targetSlot + ", gameObject=" + getGameObject() + ')';
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public UnloadAvatarSlot(int i10, GameObject gameObject) {
            super(null);
            p.h(gameObject, "gameObject");
            this.targetSlot = i10;
            this.gameObject = gameObject;
        }
    }

    /* loaded from: classes3.dex */
    public static final class UnloadMiniGame extends UnityCommand {
        public static final int $stable = 0;
        private final GameObject gameObject;

        public UnloadMiniGame() {
            this(null, 1, null);
        }

        public /* synthetic */ UnloadMiniGame(GameObject gameObject, int i10, h hVar) {
            this((i10 & 1) != 0 ? GameObject.SCENE_MANAGER : gameObject);
        }

        public static /* synthetic */ UnloadMiniGame copy$default(UnloadMiniGame unloadMiniGame, GameObject gameObject, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                gameObject = unloadMiniGame.getGameObject();
            }
            return unloadMiniGame.copy(gameObject);
        }

        @Override // com.dena.mirrorman.unity.UnityCommand
        public String buildMessage() {
            return "";
        }

        public final GameObject component1() {
            return getGameObject();
        }

        public final UnloadMiniGame copy(GameObject gameObject) {
            p.h(gameObject, "gameObject");
            return new UnloadMiniGame(gameObject);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof UnloadMiniGame) && getGameObject() == ((UnloadMiniGame) obj).getGameObject();
        }

        @Override // com.dena.mirrorman.unity.UnityCommand
        public GameObject getGameObject() {
            return this.gameObject;
        }

        public int hashCode() {
            return getGameObject().hashCode();
        }

        public String toString() {
            return "UnloadMiniGame(gameObject=" + getGameObject() + ')';
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public UnloadMiniGame(GameObject gameObject) {
            super(null);
            p.h(gameObject, "gameObject");
            this.gameObject = gameObject;
        }
    }

    /* loaded from: classes3.dex */
    public static final class UnloadRichUniqueGift extends UnityCommand {
        public static final int $stable = 0;
        private final GameObject gameObject;

        public UnloadRichUniqueGift() {
            this(null, 1, null);
        }

        public /* synthetic */ UnloadRichUniqueGift(GameObject gameObject, int i10, h hVar) {
            this((i10 & 1) != 0 ? GameObject.SCENE_MANAGER : gameObject);
        }

        public static /* synthetic */ UnloadRichUniqueGift copy$default(UnloadRichUniqueGift unloadRichUniqueGift, GameObject gameObject, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                gameObject = unloadRichUniqueGift.getGameObject();
            }
            return unloadRichUniqueGift.copy(gameObject);
        }

        @Override // com.dena.mirrorman.unity.UnityCommand
        public String buildMessage() {
            return "";
        }

        public final GameObject component1() {
            return getGameObject();
        }

        public final UnloadRichUniqueGift copy(GameObject gameObject) {
            p.h(gameObject, "gameObject");
            return new UnloadRichUniqueGift(gameObject);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof UnloadRichUniqueGift) && getGameObject() == ((UnloadRichUniqueGift) obj).getGameObject();
        }

        @Override // com.dena.mirrorman.unity.UnityCommand
        public GameObject getGameObject() {
            return this.gameObject;
        }

        public int hashCode() {
            return getGameObject().hashCode();
        }

        public String toString() {
            return "UnloadRichUniqueGift(gameObject=" + getGameObject() + ')';
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public UnloadRichUniqueGift(GameObject gameObject) {
            super(null);
            p.h(gameObject, "gameObject");
            this.gameObject = gameObject;
        }
    }

    /* loaded from: classes3.dex */
    public static final class UpdateAllParts extends UnityCommand {
        public static final int $stable = 0;
        private final GameObject gameObject;
        private final String message;
        private final int targetSlot;

        public /* synthetic */ UpdateAllParts(String str, int i10, GameObject gameObject, int i11, h hVar) {
            this(str, i10, (i11 & 4) != 0 ? GameObject.SCENE_MANAGER : gameObject);
        }

        private final String component1() {
            return this.message;
        }

        private final int component2() {
            return this.targetSlot;
        }

        public static /* synthetic */ UpdateAllParts copy$default(UpdateAllParts updateAllParts, String str, int i10, GameObject gameObject, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = updateAllParts.message;
            }
            if ((i11 & 2) != 0) {
                i10 = updateAllParts.targetSlot;
            }
            if ((i11 & 4) != 0) {
                gameObject = updateAllParts.getGameObject();
            }
            return updateAllParts.copy(str, i10, gameObject);
        }

        @Override // com.dena.mirrorman.unity.UnityCommand
        public String buildMessage() {
            return this.message + ";AndroidSlot:" + this.targetSlot + ';';
        }

        public final GameObject component3() {
            return getGameObject();
        }

        public final UpdateAllParts copy(String str, int i10, GameObject gameObject) {
            p.h(str, "message");
            p.h(gameObject, "gameObject");
            return new UpdateAllParts(str, i10, gameObject);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof UpdateAllParts) {
                UpdateAllParts updateAllParts = (UpdateAllParts) obj;
                return p.c(this.message, updateAllParts.message) && this.targetSlot == updateAllParts.targetSlot && getGameObject() == updateAllParts.getGameObject();
            }
            return false;
        }

        @Override // com.dena.mirrorman.unity.UnityCommand
        public GameObject getGameObject() {
            return this.gameObject;
        }

        public int hashCode() {
            return (((this.message.hashCode() * 31) + Integer.hashCode(this.targetSlot)) * 31) + getGameObject().hashCode();
        }

        public String toString() {
            return "UpdateAllParts(message=" + this.message + ", targetSlot=" + this.targetSlot + ", gameObject=" + getGameObject() + ')';
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public UpdateAllParts(String str, int i10, GameObject gameObject) {
            super(null);
            p.h(str, "message");
            p.h(gameObject, "gameObject");
            this.message = str;
            this.targetSlot = i10;
            this.gameObject = gameObject;
        }
    }
}

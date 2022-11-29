package com.dena.mirrorman.net.api.request;

import com.dena.mirrorman.net.api.response.UniqueEmomoGiftUnityTextConfig;
import ep.c0;
import ep.x;
import ep.y;
import java.io.File;
import java.util.List;
import jo.h;
import jo.p;

/* loaded from: classes2.dex */
public final class UpdateUniqueEmomoRichGiftRequest {
    private static final String CONTENT_TYPE_PNG = "image/png";
    private static final String PART_KEY_FONT_ID = "font_id";
    private static final String PART_KEY_IMAGE = "image";
    private static final String PART_KEY_MOTION_ID = "motion_id";
    private static final String PART_KEY_PRESET_ID = "preset_id";
    private static final String PART_KEY_SLOT_ID = "slot_id";
    private static final String PART_KEY_TEXT_ID = "text";
    private static final String PART_KEY_TITLE_ID = "title";
    private final String fileAbsolutePath;
    private final String giftTitle;
    private final String motionId;
    private y.a multipartBuilder;
    private final String presetId;
    private final int slotId;
    private final List<UniqueEmomoGiftUnityTextConfig> textConfigs;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* loaded from: classes2.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(h hVar) {
            this();
        }
    }

    public UpdateUniqueEmomoRichGiftRequest(int i10, String str, String str2, String str3, List<UniqueEmomoGiftUnityTextConfig> list, String str4) {
        p.h(str, "motionId");
        p.h(str2, "presetId");
        p.h(str3, "giftTitle");
        p.h(list, "textConfigs");
        p.h(str4, "fileAbsolutePath");
        this.slotId = i10;
        this.motionId = str;
        this.presetId = str2;
        this.giftTitle = str3;
        this.textConfigs = list;
        this.fileAbsolutePath = str4;
        y.a aVar = new y.a(null, 1, null);
        aVar.f(y.f31045k);
        aVar.a(PART_KEY_SLOT_ID, String.valueOf(i10));
        aVar.a(PART_KEY_MOTION_ID, str);
        aVar.a(PART_KEY_PRESET_ID, str2);
        aVar.a(PART_KEY_TITLE_ID, str3);
        for (UniqueEmomoGiftUnityTextConfig uniqueEmomoGiftUnityTextConfig : list) {
            aVar.a("text" + uniqueEmomoGiftUnityTextConfig.getIndex(), uniqueEmomoGiftUnityTextConfig.getText());
            aVar.a(PART_KEY_FONT_ID + uniqueEmomoGiftUnityTextConfig.getIndex(), uniqueEmomoGiftUnityTextConfig.getFontId());
        }
        aVar.b("image", this.fileAbsolutePath, c0.f30798a.c(new File(this.fileAbsolutePath), x.f31036g.b(CONTENT_TYPE_PNG)));
        this.multipartBuilder = aVar;
    }

    public static /* synthetic */ UpdateUniqueEmomoRichGiftRequest copy$default(UpdateUniqueEmomoRichGiftRequest updateUniqueEmomoRichGiftRequest, int i10, String str, String str2, String str3, List list, String str4, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = updateUniqueEmomoRichGiftRequest.slotId;
        }
        if ((i11 & 2) != 0) {
            str = updateUniqueEmomoRichGiftRequest.motionId;
        }
        String str5 = str;
        if ((i11 & 4) != 0) {
            str2 = updateUniqueEmomoRichGiftRequest.presetId;
        }
        String str6 = str2;
        if ((i11 & 8) != 0) {
            str3 = updateUniqueEmomoRichGiftRequest.giftTitle;
        }
        String str7 = str3;
        List<UniqueEmomoGiftUnityTextConfig> list2 = list;
        if ((i11 & 16) != 0) {
            list2 = updateUniqueEmomoRichGiftRequest.textConfigs;
        }
        List list3 = list2;
        if ((i11 & 32) != 0) {
            str4 = updateUniqueEmomoRichGiftRequest.fileAbsolutePath;
        }
        return updateUniqueEmomoRichGiftRequest.copy(i10, str5, str6, str7, list3, str4);
    }

    public final c0 build() {
        return this.multipartBuilder.e();
    }

    public final int component1() {
        return this.slotId;
    }

    public final String component2() {
        return this.motionId;
    }

    public final String component3() {
        return this.presetId;
    }

    public final String component4() {
        return this.giftTitle;
    }

    public final List<UniqueEmomoGiftUnityTextConfig> component5() {
        return this.textConfigs;
    }

    public final String component6() {
        return this.fileAbsolutePath;
    }

    public final UpdateUniqueEmomoRichGiftRequest copy(int i10, String str, String str2, String str3, List<UniqueEmomoGiftUnityTextConfig> list, String str4) {
        p.h(str, "motionId");
        p.h(str2, "presetId");
        p.h(str3, "giftTitle");
        p.h(list, "textConfigs");
        p.h(str4, "fileAbsolutePath");
        return new UpdateUniqueEmomoRichGiftRequest(i10, str, str2, str3, list, str4);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof UpdateUniqueEmomoRichGiftRequest) {
            UpdateUniqueEmomoRichGiftRequest updateUniqueEmomoRichGiftRequest = (UpdateUniqueEmomoRichGiftRequest) obj;
            return this.slotId == updateUniqueEmomoRichGiftRequest.slotId && p.c(this.motionId, updateUniqueEmomoRichGiftRequest.motionId) && p.c(this.presetId, updateUniqueEmomoRichGiftRequest.presetId) && p.c(this.giftTitle, updateUniqueEmomoRichGiftRequest.giftTitle) && p.c(this.textConfigs, updateUniqueEmomoRichGiftRequest.textConfigs) && p.c(this.fileAbsolutePath, updateUniqueEmomoRichGiftRequest.fileAbsolutePath);
        }
        return false;
    }

    public final String getFileAbsolutePath() {
        return this.fileAbsolutePath;
    }

    public final String getGiftTitle() {
        return this.giftTitle;
    }

    public final String getMotionId() {
        return this.motionId;
    }

    public final String getPresetId() {
        return this.presetId;
    }

    public final int getSlotId() {
        return this.slotId;
    }

    public final List<UniqueEmomoGiftUnityTextConfig> getTextConfigs() {
        return this.textConfigs;
    }

    public int hashCode() {
        return (((((((((Integer.hashCode(this.slotId) * 31) + this.motionId.hashCode()) * 31) + this.presetId.hashCode()) * 31) + this.giftTitle.hashCode()) * 31) + this.textConfigs.hashCode()) * 31) + this.fileAbsolutePath.hashCode();
    }

    public String toString() {
        return "UpdateUniqueEmomoRichGiftRequest(slotId=" + this.slotId + ", motionId=" + this.motionId + ", presetId=" + this.presetId + ", giftTitle=" + this.giftTitle + ", textConfigs=" + this.textConfigs + ", fileAbsolutePath=" + this.fileAbsolutePath + ')';
    }
}

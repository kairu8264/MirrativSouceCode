package com.dena.mirrorman.net.api.request;

import ep.c0;
import ep.x;
import ep.y;
import java.io.File;
import jo.h;
import jo.p;

/* loaded from: classes2.dex */
public final class UpdateUniqueEmomoStampGiftRequest {
    private static final String CONTENT_TYPE_PNG = "image/png";
    private static final String PART_KEY_IMAGE = "image";
    private static final String PART_KEY_SLOT_ID = "slot_id";
    private static final String PART_KEY_TEXT = "text";
    private final String fileAbsolutePath;
    private final String giftText;
    private y.a multipartBuilder;
    private final int slotId;
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

    public UpdateUniqueEmomoStampGiftRequest(int i10, String str, String str2) {
        p.h(str, "fileAbsolutePath");
        p.h(str2, "giftText");
        this.slotId = i10;
        this.fileAbsolutePath = str;
        this.giftText = str2;
        y.a aVar = new y.a(null, 1, null);
        aVar.f(y.f31045k);
        aVar.a(PART_KEY_SLOT_ID, String.valueOf(i10));
        aVar.b("image", str, c0.f30798a.c(new File(str), x.f31036g.b(CONTENT_TYPE_PNG)));
        aVar.a("text", str2);
        this.multipartBuilder = aVar;
    }

    public static /* synthetic */ UpdateUniqueEmomoStampGiftRequest copy$default(UpdateUniqueEmomoStampGiftRequest updateUniqueEmomoStampGiftRequest, int i10, String str, String str2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = updateUniqueEmomoStampGiftRequest.slotId;
        }
        if ((i11 & 2) != 0) {
            str = updateUniqueEmomoStampGiftRequest.fileAbsolutePath;
        }
        if ((i11 & 4) != 0) {
            str2 = updateUniqueEmomoStampGiftRequest.giftText;
        }
        return updateUniqueEmomoStampGiftRequest.copy(i10, str, str2);
    }

    public final c0 build() {
        return this.multipartBuilder.e();
    }

    public final int component1() {
        return this.slotId;
    }

    public final String component2() {
        return this.fileAbsolutePath;
    }

    public final String component3() {
        return this.giftText;
    }

    public final UpdateUniqueEmomoStampGiftRequest copy(int i10, String str, String str2) {
        p.h(str, "fileAbsolutePath");
        p.h(str2, "giftText");
        return new UpdateUniqueEmomoStampGiftRequest(i10, str, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof UpdateUniqueEmomoStampGiftRequest) {
            UpdateUniqueEmomoStampGiftRequest updateUniqueEmomoStampGiftRequest = (UpdateUniqueEmomoStampGiftRequest) obj;
            return this.slotId == updateUniqueEmomoStampGiftRequest.slotId && p.c(this.fileAbsolutePath, updateUniqueEmomoStampGiftRequest.fileAbsolutePath) && p.c(this.giftText, updateUniqueEmomoStampGiftRequest.giftText);
        }
        return false;
    }

    public final String getFileAbsolutePath() {
        return this.fileAbsolutePath;
    }

    public final String getGiftText() {
        return this.giftText;
    }

    public final int getSlotId() {
        return this.slotId;
    }

    public int hashCode() {
        return (((Integer.hashCode(this.slotId) * 31) + this.fileAbsolutePath.hashCode()) * 31) + this.giftText.hashCode();
    }

    public String toString() {
        return "UpdateUniqueEmomoStampGiftRequest(slotId=" + this.slotId + ", fileAbsolutePath=" + this.fileAbsolutePath + ", giftText=" + this.giftText + ')';
    }
}

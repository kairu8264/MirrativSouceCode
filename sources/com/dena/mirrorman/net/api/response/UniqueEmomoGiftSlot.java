package com.dena.mirrorman.net.api.response;

import com.dena.mirrativ.mirrativapi.core.BooleanTypeAdapter;
import com.dena.mirrorman.net.api.response.UniqueEmomoGiftType;
import jo.p;
import ym.b;

/* loaded from: classes2.dex */
public final class UniqueEmomoGiftSlot {
    public static final int $stable = 0;
    private final String imageUrl;
    @b(BooleanTypeAdapter.class)
    private final boolean isEmpty;
    private final String name;
    private final int slotId;
    @b(UniqueEmomoGiftType.TypeAdapter.class)
    private final UniqueEmomoGiftType type;

    public UniqueEmomoGiftSlot(int i10, String str, boolean z10, UniqueEmomoGiftType uniqueEmomoGiftType, String str2) {
        p.h(str, "name");
        p.h(uniqueEmomoGiftType, "type");
        p.h(str2, "imageUrl");
        this.slotId = i10;
        this.name = str;
        this.isEmpty = z10;
        this.type = uniqueEmomoGiftType;
        this.imageUrl = str2;
    }

    public static /* synthetic */ UniqueEmomoGiftSlot copy$default(UniqueEmomoGiftSlot uniqueEmomoGiftSlot, int i10, String str, boolean z10, UniqueEmomoGiftType uniqueEmomoGiftType, String str2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = uniqueEmomoGiftSlot.slotId;
        }
        if ((i11 & 2) != 0) {
            str = uniqueEmomoGiftSlot.name;
        }
        String str3 = str;
        if ((i11 & 4) != 0) {
            z10 = uniqueEmomoGiftSlot.isEmpty;
        }
        boolean z11 = z10;
        if ((i11 & 8) != 0) {
            uniqueEmomoGiftType = uniqueEmomoGiftSlot.type;
        }
        UniqueEmomoGiftType uniqueEmomoGiftType2 = uniqueEmomoGiftType;
        if ((i11 & 16) != 0) {
            str2 = uniqueEmomoGiftSlot.imageUrl;
        }
        return uniqueEmomoGiftSlot.copy(i10, str3, z11, uniqueEmomoGiftType2, str2);
    }

    public final int component1() {
        return this.slotId;
    }

    public final String component2() {
        return this.name;
    }

    public final boolean component3() {
        return this.isEmpty;
    }

    public final UniqueEmomoGiftType component4() {
        return this.type;
    }

    public final String component5() {
        return this.imageUrl;
    }

    public final UniqueEmomoGiftSlot copy(int i10, String str, boolean z10, UniqueEmomoGiftType uniqueEmomoGiftType, String str2) {
        p.h(str, "name");
        p.h(uniqueEmomoGiftType, "type");
        p.h(str2, "imageUrl");
        return new UniqueEmomoGiftSlot(i10, str, z10, uniqueEmomoGiftType, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof UniqueEmomoGiftSlot) {
            UniqueEmomoGiftSlot uniqueEmomoGiftSlot = (UniqueEmomoGiftSlot) obj;
            return this.slotId == uniqueEmomoGiftSlot.slotId && p.c(this.name, uniqueEmomoGiftSlot.name) && this.isEmpty == uniqueEmomoGiftSlot.isEmpty && this.type == uniqueEmomoGiftSlot.type && p.c(this.imageUrl, uniqueEmomoGiftSlot.imageUrl);
        }
        return false;
    }

    public final String getImageUrl() {
        return this.imageUrl;
    }

    public final String getName() {
        return this.name;
    }

    public final int getSlotId() {
        return this.slotId;
    }

    public final UniqueEmomoGiftType getType() {
        return this.type;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = ((Integer.hashCode(this.slotId) * 31) + this.name.hashCode()) * 31;
        boolean z10 = this.isEmpty;
        int i10 = z10;
        if (z10 != 0) {
            i10 = 1;
        }
        return ((((hashCode + i10) * 31) + this.type.hashCode()) * 31) + this.imageUrl.hashCode();
    }

    public final boolean isEmpty() {
        return this.isEmpty;
    }

    public String toString() {
        return "UniqueEmomoGiftSlot(slotId=" + this.slotId + ", name=" + this.name + ", isEmpty=" + this.isEmpty + ", type=" + this.type + ", imageUrl=" + this.imageUrl + ')';
    }
}

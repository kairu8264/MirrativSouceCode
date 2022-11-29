package com.dena.mirrativ.mirrativapi.emomo.event;

import com.dena.mirrativ.mirrativapi.emomo.event.GiftItemAttributeVectorType;
import java.io.Serializable;
import jo.p;
import ym.b;

/* loaded from: classes2.dex */
public final class GiftItemAttribute implements Serializable {
    private final String title;
    @b(GiftItemAttributeVectorType.TypeAdapter.class)
    private final GiftItemAttributeVectorType type;
    private final String value;

    public GiftItemAttribute(GiftItemAttributeVectorType giftItemAttributeVectorType, String str, String str2) {
        p.h(giftItemAttributeVectorType, "type");
        p.h(str, "title");
        p.h(str2, "value");
        this.type = giftItemAttributeVectorType;
        this.title = str;
        this.value = str2;
    }

    public static /* synthetic */ GiftItemAttribute copy$default(GiftItemAttribute giftItemAttribute, GiftItemAttributeVectorType giftItemAttributeVectorType, String str, String str2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            giftItemAttributeVectorType = giftItemAttribute.type;
        }
        if ((i10 & 2) != 0) {
            str = giftItemAttribute.title;
        }
        if ((i10 & 4) != 0) {
            str2 = giftItemAttribute.value;
        }
        return giftItemAttribute.copy(giftItemAttributeVectorType, str, str2);
    }

    public final GiftItemAttributeVectorType component1() {
        return this.type;
    }

    public final String component2() {
        return this.title;
    }

    public final String component3() {
        return this.value;
    }

    public final GiftItemAttribute copy(GiftItemAttributeVectorType giftItemAttributeVectorType, String str, String str2) {
        p.h(giftItemAttributeVectorType, "type");
        p.h(str, "title");
        p.h(str2, "value");
        return new GiftItemAttribute(giftItemAttributeVectorType, str, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof GiftItemAttribute) {
            GiftItemAttribute giftItemAttribute = (GiftItemAttribute) obj;
            return this.type == giftItemAttribute.type && p.c(this.title, giftItemAttribute.title) && p.c(this.value, giftItemAttribute.value);
        }
        return false;
    }

    public final String getTitle() {
        return this.title;
    }

    public final GiftItemAttributeVectorType getType() {
        return this.type;
    }

    public final String getValue() {
        return this.value;
    }

    public int hashCode() {
        return (((this.type.hashCode() * 31) + this.title.hashCode()) * 31) + this.value.hashCode();
    }

    public String toString() {
        return "GiftItemAttribute(type=" + this.type + ", title=" + this.title + ", value=" + this.value + ')';
    }
}

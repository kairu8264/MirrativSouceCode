package ud;

import com.dena.mirrorman.net.api.response.UniqueEmomoGiftPreset;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import ud.a;

/* loaded from: classes2.dex */
public final class w4 implements ud.a {

    /* renamed from: z  reason: collision with root package name */
    public static final a f55655z = new a(null);

    /* renamed from: w  reason: collision with root package name */
    public final a.EnumC0862a f55656w;

    /* renamed from: x  reason: collision with root package name */
    public final String f55657x;

    /* renamed from: y  reason: collision with root package name */
    public final String f55658y;

    /* loaded from: classes2.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }

        public final w4 a(UniqueEmomoGiftPreset uniqueEmomoGiftPreset) {
            jo.p.h(uniqueEmomoGiftPreset, "preset");
            return new w4(null, uniqueEmomoGiftPreset.getId(), uniqueEmomoGiftPreset.getImageUrl(), 1, null);
        }
    }

    public w4(a.EnumC0862a enumC0862a, String str, String str2) {
        jo.p.h(enumC0862a, "type");
        jo.p.h(str, TtmlNode.ATTR_ID);
        jo.p.h(str2, "imageUrl");
        this.f55656w = enumC0862a;
        this.f55657x = str;
        this.f55658y = str2;
    }

    public final String a() {
        return this.f55657x;
    }

    public final String b() {
        return this.f55658y;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof w4) {
            w4 w4Var = (w4) obj;
            return getType() == w4Var.getType() && jo.p.c(this.f55657x, w4Var.f55657x) && jo.p.c(this.f55658y, w4Var.f55658y);
        }
        return false;
    }

    @Override // ud.a
    public a.EnumC0862a getType() {
        return this.f55656w;
    }

    public int hashCode() {
        return (((getType().hashCode() * 31) + this.f55657x.hashCode()) * 31) + this.f55658y.hashCode();
    }

    public String toString() {
        return "UniqueEmomoRichGiftPresetBindModel(type=" + getType() + ", id=" + this.f55657x + ", imageUrl=" + this.f55658y + ')';
    }

    public /* synthetic */ w4(a.EnumC0862a enumC0862a, String str, String str2, int i10, jo.h hVar) {
        this((i10 & 1) != 0 ? a.EnumC0862a.UNIQUE_EMOMO_RICH_GIFT_PRESET : enumC0862a, str, str2);
    }
}

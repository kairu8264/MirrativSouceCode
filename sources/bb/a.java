package bb;

import jo.h;
import jo.p;

/* loaded from: classes2.dex */
public final class a {

    /* renamed from: j  reason: collision with root package name */
    public static final int f17223j;

    /* renamed from: a  reason: collision with root package name */
    public final String f17224a;

    /* renamed from: b  reason: collision with root package name */
    public final Integer f17225b;

    /* renamed from: c  reason: collision with root package name */
    public final String f17226c;

    /* renamed from: d  reason: collision with root package name */
    public final String f17227d;

    /* renamed from: e  reason: collision with root package name */
    public final String f17228e;

    /* renamed from: f  reason: collision with root package name */
    public final k9.a f17229f;

    /* renamed from: g  reason: collision with root package name */
    public final String f17230g;

    /* renamed from: h  reason: collision with root package name */
    public final k9.a f17231h;

    /* renamed from: i  reason: collision with root package name */
    public final boolean f17232i;

    static {
        int i10 = k9.a.C;
        f17223j = i10 | i10;
    }

    public a() {
        this(null, null, null, null, null, null, null, null, false, 511, null);
    }

    public a(String str, Integer num, String str2, String str3, String str4, k9.a aVar, String str5, k9.a aVar2, boolean z10) {
        this.f17224a = str;
        this.f17225b = num;
        this.f17226c = str2;
        this.f17227d = str3;
        this.f17228e = str4;
        this.f17229f = aVar;
        this.f17230g = str5;
        this.f17231h = aVar2;
        this.f17232i = z10;
    }

    public final k9.a a() {
        return this.f17231h;
    }

    public final String b() {
        return this.f17230g;
    }

    public final String c() {
        return this.f17227d;
    }

    public final Integer d() {
        return this.f17225b;
    }

    public final String e() {
        return this.f17224a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof a) {
            a aVar = (a) obj;
            return p.c(this.f17224a, aVar.f17224a) && p.c(this.f17225b, aVar.f17225b) && p.c(this.f17226c, aVar.f17226c) && p.c(this.f17227d, aVar.f17227d) && p.c(this.f17228e, aVar.f17228e) && p.c(this.f17229f, aVar.f17229f) && p.c(this.f17230g, aVar.f17230g) && p.c(this.f17231h, aVar.f17231h) && this.f17232i == aVar.f17232i;
        }
        return false;
    }

    public final String f() {
        return this.f17226c;
    }

    public final k9.a g() {
        return this.f17229f;
    }

    public final String h() {
        return this.f17228e;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        String str = this.f17224a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        Integer num = this.f17225b;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        String str2 = this.f17226c;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f17227d;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f17228e;
        int hashCode5 = (hashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        k9.a aVar = this.f17229f;
        int hashCode6 = (hashCode5 + (aVar == null ? 0 : aVar.hashCode())) * 31;
        String str5 = this.f17230g;
        int hashCode7 = (hashCode6 + (str5 == null ? 0 : str5.hashCode())) * 31;
        k9.a aVar2 = this.f17231h;
        int hashCode8 = (hashCode7 + (aVar2 != null ? aVar2.hashCode() : 0)) * 31;
        boolean z10 = this.f17232i;
        int i10 = z10;
        if (z10 != 0) {
            i10 = 1;
        }
        return hashCode8 + i10;
    }

    public final boolean i() {
        return this.f17232i;
    }

    public String toString() {
        return "CommonPopupDialogBindModel(headerImageUrl=" + this.f17224a + ", headerImageDrawableResInt=" + this.f17225b + ", titleText=" + this.f17226c + ", descriptionText=" + this.f17227d + ", topButtonLabelText=" + this.f17228e + ", topButtonColor=" + this.f17229f + ", bottomButtonLabelText=" + this.f17230g + ", bottomButtonColor=" + this.f17231h + ", visibleCloseButton=" + this.f17232i + ')';
    }

    public /* synthetic */ a(String str, Integer num, String str2, String str3, String str4, k9.a aVar, String str5, k9.a aVar2, boolean z10, int i10, h hVar) {
        this((i10 & 1) != 0 ? null : str, (i10 & 2) != 0 ? null : num, (i10 & 4) != 0 ? null : str2, (i10 & 8) != 0 ? null : str3, (i10 & 16) != 0 ? null : str4, (i10 & 32) != 0 ? null : aVar, (i10 & 64) != 0 ? null : str5, (i10 & 128) == 0 ? aVar2 : null, (i10 & 256) != 0 ? true : z10);
    }
}

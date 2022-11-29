package ud;

import com.google.android.exoplayer2.text.ttml.TtmlNode;
import ud.a;

/* loaded from: classes2.dex */
public final class n2 implements a {
    public final a.EnumC0862a A;

    /* renamed from: w  reason: collision with root package name */
    public final String f55242w;

    /* renamed from: x  reason: collision with root package name */
    public final int f55243x;

    /* renamed from: y  reason: collision with root package name */
    public final u1 f55244y;

    /* renamed from: z  reason: collision with root package name */
    public final boolean f55245z;

    public n2(String str, int i10, u1 u1Var, boolean z10, a.EnumC0862a enumC0862a) {
        jo.p.h(str, TtmlNode.TAG_BODY);
        jo.p.h(enumC0862a, "type");
        this.f55242w = str;
        this.f55243x = i10;
        this.f55244y = u1Var;
        this.f55245z = z10;
        this.A = enumC0862a;
    }

    public final String a() {
        return this.f55242w;
    }

    public final u1 b() {
        return this.f55244y;
    }

    public final int c() {
        return this.f55243x;
    }

    public final boolean d() {
        return this.f55245z;
    }

    @Override // ud.a
    public a.EnumC0862a getType() {
        return this.A;
    }

    public /* synthetic */ n2(String str, int i10, u1 u1Var, boolean z10, a.EnumC0862a enumC0862a, int i11, jo.h hVar) {
        this(str, i10, u1Var, (i11 & 8) != 0 ? false : z10, (i11 & 16) != 0 ? a.EnumC0862a.NEXT_LIVE_ANNOUNCEMENT : enumC0862a);
    }
}

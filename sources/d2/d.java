package d2;

import com.google.android.exoplayer2.text.ttml.TtmlNode;

/* loaded from: classes.dex */
public final class d implements c0 {

    /* renamed from: b  reason: collision with root package name */
    public final int f29065b;

    public d(int i10) {
        this.f29065b = i10;
    }

    @Override // d2.c0
    public x c(x xVar) {
        jo.p.h(xVar, TtmlNode.ATTR_TTS_FONT_WEIGHT);
        int i10 = this.f29065b;
        return (i10 == 0 || i10 == Integer.MAX_VALUE) ? xVar : new x(po.n.m(xVar.r() + this.f29065b, 1, 1000));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof d) && this.f29065b == ((d) obj).f29065b;
    }

    public int hashCode() {
        return Integer.hashCode(this.f29065b);
    }

    public String toString() {
        return "AndroidFontResolveInterceptor(fontWeightAdjustment=" + this.f29065b + ')';
    }
}

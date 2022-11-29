package a0;

import com.google.android.exoplayer2.text.ttml.TtmlNode;

/* loaded from: classes.dex */
public final class h {

    /* renamed from: a  reason: collision with root package name */
    public final io.l<Integer, Object> f113a;

    /* renamed from: b  reason: collision with root package name */
    public final io.p<q, Integer, c> f114b;

    /* renamed from: c  reason: collision with root package name */
    public final io.l<Integer, Object> f115c;

    /* renamed from: d  reason: collision with root package name */
    public final io.r<o, Integer, l0.i, Integer, wn.v> f116d;

    /* JADX WARN: Multi-variable type inference failed */
    public h(io.l<? super Integer, ? extends Object> lVar, io.p<? super q, ? super Integer, c> pVar, io.l<? super Integer, ? extends Object> lVar2, io.r<? super o, ? super Integer, ? super l0.i, ? super Integer, wn.v> rVar) {
        jo.p.h(pVar, TtmlNode.TAG_SPAN);
        jo.p.h(lVar2, "type");
        jo.p.h(rVar, "item");
        this.f113a = lVar;
        this.f114b = pVar;
        this.f115c = lVar2;
        this.f116d = rVar;
    }

    public final io.r<o, Integer, l0.i, Integer, wn.v> a() {
        return this.f116d;
    }

    public final io.l<Integer, Object> b() {
        return this.f113a;
    }

    public final io.p<q, Integer, c> c() {
        return this.f114b;
    }

    public final io.l<Integer, Object> d() {
        return this.f115c;
    }
}

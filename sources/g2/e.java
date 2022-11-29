package g2;

import android.graphics.Typeface;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import d2.l;
import d2.u;
import d2.x;
import io.r;
import java.util.ArrayList;
import java.util.List;
import jo.q;
import xn.a0;
import y1.a;
import y1.d0;
import y1.p;
import y1.v;

/* loaded from: classes.dex */
public final class e implements y1.k {

    /* renamed from: a  reason: collision with root package name */
    public final String f32589a;

    /* renamed from: b  reason: collision with root package name */
    public final d0 f32590b;

    /* renamed from: c  reason: collision with root package name */
    public final List<a.b<v>> f32591c;

    /* renamed from: d  reason: collision with root package name */
    public final List<a.b<p>> f32592d;

    /* renamed from: e  reason: collision with root package name */
    public final l.b f32593e;

    /* renamed from: f  reason: collision with root package name */
    public final m2.d f32594f;

    /* renamed from: g  reason: collision with root package name */
    public final h f32595g;

    /* renamed from: h  reason: collision with root package name */
    public final CharSequence f32596h;

    /* renamed from: i  reason: collision with root package name */
    public final z1.e f32597i;

    /* renamed from: j  reason: collision with root package name */
    public final List<m> f32598j;

    /* renamed from: k  reason: collision with root package name */
    public final int f32599k;

    /* loaded from: classes.dex */
    public static final class a extends q implements r<d2.l, x, u, d2.v, Typeface> {
        public a() {
            super(4);
        }

        @Override // io.r
        public /* bridge */ /* synthetic */ Typeface F(d2.l lVar, x xVar, u uVar, d2.v vVar) {
            return a(lVar, xVar, uVar.i(), vVar.m());
        }

        public final Typeface a(d2.l lVar, x xVar, int i10, int i11) {
            jo.p.h(xVar, TtmlNode.ATTR_TTS_FONT_WEIGHT);
            m mVar = new m(e.this.f().a(lVar, xVar, i10, i11));
            e.this.f32598j.add(mVar);
            return mVar.a();
        }
    }

    public e(String str, d0 d0Var, List<a.b<v>> list, List<a.b<p>> list2, l.b bVar, m2.d dVar) {
        jo.p.h(str, "text");
        jo.p.h(d0Var, TtmlNode.TAG_STYLE);
        jo.p.h(list, "spanStyles");
        jo.p.h(list2, "placeholders");
        jo.p.h(bVar, "fontFamilyResolver");
        jo.p.h(dVar, "density");
        this.f32589a = str;
        this.f32590b = d0Var;
        this.f32591c = list;
        this.f32592d = list2;
        this.f32593e = bVar;
        this.f32594f = dVar;
        h hVar = new h(1, dVar.getDensity());
        this.f32595g = hVar;
        this.f32598j = new ArrayList();
        int b10 = f.b(d0Var.x(), d0Var.q());
        this.f32599k = b10;
        a aVar = new a();
        CharSequence a10 = d.a(str, hVar.getTextSize(), d0Var, a0.o0(xn.r.d(new a.b(h2.f.a(hVar, d0Var.E(), aVar, dVar), 0, str.length())), list), list2, dVar, aVar);
        this.f32596h = a10;
        this.f32597i = new z1.e(a10, hVar, b10);
    }

    @Override // y1.k
    public float a() {
        return this.f32597i.c();
    }

    @Override // y1.k
    public boolean b() {
        List<m> list = this.f32598j;
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (list.get(i10).b()) {
                return true;
            }
        }
        return false;
    }

    @Override // y1.k
    public float c() {
        return this.f32597i.b();
    }

    public final CharSequence e() {
        return this.f32596h;
    }

    public final l.b f() {
        return this.f32593e;
    }

    public final z1.e g() {
        return this.f32597i;
    }

    public final d0 h() {
        return this.f32590b;
    }

    public final int i() {
        return this.f32599k;
    }

    public final h j() {
        return this.f32595g;
    }
}

package d2;

import com.google.android.exoplayer2.text.ttml.TtmlNode;
import d2.l;
import l0.c2;

/* loaded from: classes.dex */
public final class m implements l.b {

    /* renamed from: a  reason: collision with root package name */
    public final b0 f29105a;

    /* renamed from: b  reason: collision with root package name */
    public final c0 f29106b;

    /* renamed from: c  reason: collision with root package name */
    public final n0 f29107c;

    /* renamed from: d  reason: collision with root package name */
    public final q f29108d;

    /* renamed from: e  reason: collision with root package name */
    public final a0 f29109e;

    /* renamed from: f  reason: collision with root package name */
    public final io.l<m0, Object> f29110f;

    /* loaded from: classes.dex */
    public static final class a extends jo.q implements io.l<m0, Object> {
        public a() {
            super(1);
        }

        @Override // io.l
        /* renamed from: a */
        public final Object invoke(m0 m0Var) {
            jo.p.h(m0Var, "it");
            return m.this.h(m0.b(m0Var, null, null, 0, 0, null, 30, null)).getValue();
        }
    }

    /* loaded from: classes.dex */
    public static final class b extends jo.q implements io.l<io.l<? super o0, ? extends wn.v>, o0> {

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ m0 f29113x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(m0 m0Var) {
            super(1);
            this.f29113x = m0Var;
        }

        @Override // io.l
        /* renamed from: a */
        public final o0 invoke(io.l<? super o0, wn.v> lVar) {
            jo.p.h(lVar, "onAsyncCompletion");
            o0 a10 = m.this.f29108d.a(this.f29113x, m.this.g(), lVar, m.this.f29110f);
            if (a10 == null && (a10 = m.this.f29109e.a(this.f29113x, m.this.g(), lVar, m.this.f29110f)) == null) {
                throw new IllegalStateException("Could not load font");
            }
            return a10;
        }
    }

    public m(b0 b0Var, c0 c0Var, n0 n0Var, q qVar, a0 a0Var) {
        jo.p.h(b0Var, "platformFontLoader");
        jo.p.h(c0Var, "platformResolveInterceptor");
        jo.p.h(n0Var, "typefaceRequestCache");
        jo.p.h(qVar, "fontListFontFamilyTypefaceAdapter");
        jo.p.h(a0Var, "platformFamilyTypefaceAdapter");
        this.f29105a = b0Var;
        this.f29106b = c0Var;
        this.f29107c = n0Var;
        this.f29108d = qVar;
        this.f29109e = a0Var;
        this.f29110f = new a();
    }

    @Override // d2.l.b
    public c2<Object> a(l lVar, x xVar, int i10, int i11) {
        jo.p.h(xVar, TtmlNode.ATTR_TTS_FONT_WEIGHT);
        return h(new m0(this.f29106b.b(lVar), this.f29106b.c(xVar), this.f29106b.a(i10), this.f29106b.d(i11), this.f29105a.a(), null));
    }

    public final b0 g() {
        return this.f29105a;
    }

    public final c2<Object> h(m0 m0Var) {
        return this.f29107c.c(m0Var, new b(m0Var));
    }

    public /* synthetic */ m(b0 b0Var, c0 c0Var, n0 n0Var, q qVar, a0 a0Var, int i10, jo.h hVar) {
        this(b0Var, (i10 & 2) != 0 ? c0.f29062a.a() : c0Var, (i10 & 4) != 0 ? n.b() : n0Var, (i10 & 8) != 0 ? new q(n.a(), null, 2, null) : qVar, (i10 & 16) != 0 ? new a0() : a0Var);
    }
}

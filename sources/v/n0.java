package v;

import android.view.View;
import android.widget.Magnifier;
import com.google.android.exoplayer2.text.ttml.TtmlNode;

/* loaded from: classes.dex */
public final class n0 implements m0 {

    /* renamed from: b  reason: collision with root package name */
    public static final n0 f56296b = new n0();

    /* renamed from: c  reason: collision with root package name */
    public static final boolean f56297c = false;

    /* loaded from: classes.dex */
    public static class a implements l0 {

        /* renamed from: a  reason: collision with root package name */
        public final Magnifier f56298a;

        public a(Magnifier magnifier) {
            jo.p.h(magnifier, "magnifier");
            this.f56298a = magnifier;
        }

        @Override // v.l0
        public long a() {
            return m2.p.a(this.f56298a.getWidth(), this.f56298a.getHeight());
        }

        @Override // v.l0
        public void b(long j10, long j11, float f10) {
            this.f56298a.show(b1.f.m(j10), b1.f.n(j10));
        }

        @Override // v.l0
        public void c() {
            this.f56298a.update();
        }

        public final Magnifier d() {
            return this.f56298a;
        }

        @Override // v.l0
        public void dismiss() {
            this.f56298a.dismiss();
        }
    }

    @Override // v.m0
    public boolean b() {
        return f56297c;
    }

    @Override // v.m0
    /* renamed from: c */
    public a a(c0 c0Var, View view, m2.d dVar, float f10) {
        jo.p.h(c0Var, TtmlNode.TAG_STYLE);
        jo.p.h(view, "view");
        jo.p.h(dVar, "density");
        return new a(new Magnifier(view));
    }
}

package eb;

import com.google.android.exoplayer2.audio.WavUtil;
import h0.w1;
import io.q;
import jo.p;
import wn.v;
import y.z0;

/* loaded from: classes2.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final a f30352a = new a();

    /* renamed from: b  reason: collision with root package name */
    public static q<z0, l0.i, Integer, v> f30353b = s0.c.c(1272849616, false, C0300a.f30354w);

    /* renamed from: eb.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class C0300a extends jo.q implements q<z0, l0.i, Integer, v> {

        /* renamed from: w  reason: collision with root package name */
        public static final C0300a f30354w = new C0300a();

        public C0300a() {
            super(3);
        }

        public final void a(z0 z0Var, l0.i iVar, int i10) {
            p.h(z0Var, "$this$MRButton");
            if ((i10 & 81) == 16 && iVar.j()) {
                iVar.I();
            } else {
                w1.c(v1.f.b(wa.j.text_tutorial_btn_next, iVar, 0), null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, null, null, iVar, 0, 0, WavUtil.TYPE_WAVE_FORMAT_EXTENSIBLE);
            }
        }

        @Override // io.q
        public /* bridge */ /* synthetic */ v s0(z0 z0Var, l0.i iVar, Integer num) {
            a(z0Var, iVar, num.intValue());
            return v.f59242a;
        }
    }

    public final q<z0, l0.i, Integer, v> a() {
        return f30353b;
    }
}

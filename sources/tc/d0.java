package tc;

import com.google.android.exoplayer2.audio.WavUtil;
import h0.w1;

/* loaded from: classes2.dex */
public final class d0 {

    /* renamed from: a  reason: collision with root package name */
    public static final d0 f53485a = new d0();

    /* renamed from: b  reason: collision with root package name */
    public static io.q<y.z0, l0.i, Integer, wn.v> f53486b = s0.c.c(1392120788, false, a.f53487w);

    /* loaded from: classes2.dex */
    public static final class a extends jo.q implements io.q<y.z0, l0.i, Integer, wn.v> {

        /* renamed from: w  reason: collision with root package name */
        public static final a f53487w = new a();

        public a() {
            super(3);
        }

        public final void a(y.z0 z0Var, l0.i iVar, int i10) {
            jo.p.h(z0Var, "$this$MRButton");
            if ((i10 & 81) == 16 && iVar.j()) {
                iVar.I();
            } else {
                w1.c(v1.f.b(nc.i.text_orb_to_money_register, iVar, 0), null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, null, null, iVar, 0, 0, WavUtil.TYPE_WAVE_FORMAT_EXTENSIBLE);
            }
        }

        @Override // io.q
        public /* bridge */ /* synthetic */ wn.v s0(y.z0 z0Var, l0.i iVar, Integer num) {
            a(z0Var, iVar, num.intValue());
            return wn.v.f59242a;
        }
    }

    public final io.q<y.z0, l0.i, Integer, wn.v> a() {
        return f53486b;
    }
}

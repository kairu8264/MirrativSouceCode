package wc;

import com.google.android.exoplayer2.audio.WavUtil;
import h0.w1;
import io.q;
import jo.p;
import l0.i;
import wn.v;
import y.z0;

/* loaded from: classes2.dex */
public final class h {

    /* renamed from: a  reason: collision with root package name */
    public static final h f58646a = new h();

    /* renamed from: b  reason: collision with root package name */
    public static q<z0, i, Integer, v> f58647b = s0.c.c(955036026, false, a.f58649w);

    /* renamed from: c  reason: collision with root package name */
    public static q<z0, i, Integer, v> f58648c = s0.c.c(177506481, false, b.f58650w);

    /* loaded from: classes2.dex */
    public static final class a extends jo.q implements q<z0, i, Integer, v> {

        /* renamed from: w  reason: collision with root package name */
        public static final a f58649w = new a();

        public a() {
            super(3);
        }

        public final void a(z0 z0Var, i iVar, int i10) {
            p.h(z0Var, "$this$MRButton");
            if ((i10 & 81) == 16 && iVar.j()) {
                iVar.I();
            } else {
                w1.c(v1.f.b(nc.i.text_chat_confirmation_agree, iVar, 0), null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, null, null, iVar, 0, 0, WavUtil.TYPE_WAVE_FORMAT_EXTENSIBLE);
            }
        }

        @Override // io.q
        public /* bridge */ /* synthetic */ v s0(z0 z0Var, i iVar, Integer num) {
            a(z0Var, iVar, num.intValue());
            return v.f59242a;
        }
    }

    /* loaded from: classes2.dex */
    public static final class b extends jo.q implements q<z0, i, Integer, v> {

        /* renamed from: w  reason: collision with root package name */
        public static final b f58650w = new b();

        public b() {
            super(3);
        }

        public final void a(z0 z0Var, i iVar, int i10) {
            p.h(z0Var, "$this$MRButton");
            if ((i10 & 81) == 16 && iVar.j()) {
                iVar.I();
            } else {
                w1.c(v1.f.b(nc.i.text_chat_confirmation_disagree, iVar, 0), null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, null, null, iVar, 0, 0, WavUtil.TYPE_WAVE_FORMAT_EXTENSIBLE);
            }
        }

        @Override // io.q
        public /* bridge */ /* synthetic */ v s0(z0 z0Var, i iVar, Integer num) {
            a(z0Var, iVar, num.intValue());
            return v.f59242a;
        }
    }

    public final q<z0, i, Integer, v> a() {
        return f58647b;
    }

    public final q<z0, i, Integer, v> b() {
        return f58648c;
    }
}

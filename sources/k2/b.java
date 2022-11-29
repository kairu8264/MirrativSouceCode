package k2;

import com.google.android.exoplayer2.audio.WavUtil;
import h0.w1;
import io.p;
import jo.q;
import l0.i;
import wn.v;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    public static final b f38369a = new b();

    /* renamed from: b  reason: collision with root package name */
    public static p<i, Integer, v> f38370b = s0.c.c(38142554, false, a.f38371w);

    /* loaded from: classes.dex */
    public static final class a extends q implements p<i, Integer, v> {

        /* renamed from: w  reason: collision with root package name */
        public static final a f38371w = new a();

        public a() {
            super(2);
        }

        public final void a(i iVar, int i10) {
            if ((i10 & 11) == 2 && iVar.j()) {
                iVar.I();
            } else {
                w1.c("Next", null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, null, null, iVar, 6, 0, WavUtil.TYPE_WAVE_FORMAT_EXTENSIBLE);
            }
        }

        @Override // io.p
        public /* bridge */ /* synthetic */ v invoke(i iVar, Integer num) {
            a(iVar, num.intValue());
            return v.f59242a;
        }
    }

    public final p<i, Integer, v> a() {
        return f38370b;
    }
}

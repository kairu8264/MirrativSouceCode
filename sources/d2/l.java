package d2;

import com.google.android.exoplayer2.C;
import l0.c2;

/* loaded from: classes.dex */
public abstract class l {

    /* renamed from: w  reason: collision with root package name */
    public final boolean f29103w;

    /* renamed from: x  reason: collision with root package name */
    public static final a f29100x = new a(null);

    /* renamed from: y  reason: collision with root package name */
    public static final j0 f29101y = new i();

    /* renamed from: z  reason: collision with root package name */
    public static final y f29102z = new y(C.SANS_SERIF_NAME, "FontFamily.SansSerif");
    public static final y A = new y(C.SERIF_NAME, "FontFamily.Serif");
    public static final y B = new y("monospace", "FontFamily.Monospace");
    public static final y C = new y("cursive", "FontFamily.Cursive");

    /* loaded from: classes.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }

        public final j0 a() {
            return l.f29101y;
        }
    }

    /* loaded from: classes.dex */
    public interface b {
        static /* synthetic */ c2 b(b bVar, l lVar, x xVar, int i10, int i11, int i12, Object obj) {
            if (obj == null) {
                if ((i12 & 1) != 0) {
                    lVar = null;
                }
                if ((i12 & 2) != 0) {
                    xVar = x.f29149x.d();
                }
                if ((i12 & 4) != 0) {
                    i10 = u.f29139b.b();
                }
                if ((i12 & 8) != 0) {
                    i11 = v.f29143b.a();
                }
                return bVar.a(lVar, xVar, i10, i11);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: resolve-DPcqOEQ");
        }

        c2<Object> a(l lVar, x xVar, int i10, int i11);
    }

    public l(boolean z10) {
        this.f29103w = z10;
    }

    public /* synthetic */ l(boolean z10, jo.h hVar) {
        this(z10);
    }
}

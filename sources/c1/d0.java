package c1;

import android.graphics.ColorFilter;

/* loaded from: classes.dex */
public final class d0 {

    /* renamed from: b  reason: collision with root package name */
    public static final a f18653b = new a(null);

    /* renamed from: a  reason: collision with root package name */
    public final ColorFilter f18654a;

    /* loaded from: classes.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }

        public static /* synthetic */ d0 b(a aVar, long j10, int i10, int i11, Object obj) {
            if ((i11 & 2) != 0) {
                i10 = r.f18740b.z();
            }
            return aVar.a(j10, i10);
        }

        public final d0 a(long j10, int i10) {
            return d.a(j10, i10);
        }
    }

    public d0(ColorFilter colorFilter) {
        jo.p.h(colorFilter, "nativeColorFilter");
        this.f18654a = colorFilter;
    }

    public final ColorFilter a() {
        return this.f18654a;
    }
}

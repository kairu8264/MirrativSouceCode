package q1;

/* loaded from: classes.dex */
public final class v0 {

    /* renamed from: a  reason: collision with root package name */
    public static final a f48610a = new a(null);

    /* renamed from: b  reason: collision with root package name */
    public static final long f48611b = w0.a(Float.NaN, Float.NaN);

    /* loaded from: classes.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }
    }

    public static long a(long j10) {
        return j10;
    }

    public static final float b(long j10) {
        if (j10 != f48611b) {
            jo.i iVar = jo.i.f38148a;
            return Float.intBitsToFloat((int) (j10 >> 32));
        }
        throw new IllegalStateException("ScaleFactor is unspecified".toString());
    }

    public static final float c(long j10) {
        if (j10 != f48611b) {
            jo.i iVar = jo.i.f38148a;
            return Float.intBitsToFloat((int) (j10 & 4294967295L));
        }
        throw new IllegalStateException("ScaleFactor is unspecified".toString());
    }
}

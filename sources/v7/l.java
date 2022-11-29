package v7;

import android.os.Build;

/* loaded from: classes.dex */
public abstract class l {

    /* renamed from: a  reason: collision with root package name */
    public static final l f56858a = new a();

    /* renamed from: b  reason: collision with root package name */
    public static final l f56859b = new b();

    /* renamed from: c  reason: collision with root package name */
    public static final l f56860c = new e();

    /* renamed from: d  reason: collision with root package name */
    public static final l f56861d = new c();

    /* renamed from: e  reason: collision with root package name */
    public static final l f56862e;

    /* renamed from: f  reason: collision with root package name */
    public static final l f56863f;

    /* renamed from: g  reason: collision with root package name */
    public static final l f56864g;

    /* renamed from: h  reason: collision with root package name */
    public static final m7.g<l> f56865h;

    /* renamed from: i  reason: collision with root package name */
    public static final boolean f56866i;

    /* loaded from: classes.dex */
    public static class a extends l {
        @Override // v7.l
        public g a(int i10, int i11, int i12, int i13) {
            return g.QUALITY;
        }

        @Override // v7.l
        public float b(int i10, int i11, int i12, int i13) {
            int min = Math.min(i11 / i13, i10 / i12);
            if (min == 0) {
                return 1.0f;
            }
            return 1.0f / Integer.highestOneBit(min);
        }
    }

    /* loaded from: classes.dex */
    public static class b extends l {
        @Override // v7.l
        public g a(int i10, int i11, int i12, int i13) {
            return g.MEMORY;
        }

        @Override // v7.l
        public float b(int i10, int i11, int i12, int i13) {
            int ceil = (int) Math.ceil(Math.max(i11 / i13, i10 / i12));
            int max = Math.max(1, Integer.highestOneBit(ceil));
            return 1.0f / (max << (max >= ceil ? 0 : 1));
        }
    }

    /* loaded from: classes.dex */
    public static class c extends l {
        @Override // v7.l
        public g a(int i10, int i11, int i12, int i13) {
            if (b(i10, i11, i12, i13) == 1.0f) {
                return g.QUALITY;
            }
            return l.f56860c.a(i10, i11, i12, i13);
        }

        @Override // v7.l
        public float b(int i10, int i11, int i12, int i13) {
            return Math.min(1.0f, l.f56860c.b(i10, i11, i12, i13));
        }
    }

    /* loaded from: classes.dex */
    public static class d extends l {
        @Override // v7.l
        public g a(int i10, int i11, int i12, int i13) {
            return g.QUALITY;
        }

        @Override // v7.l
        public float b(int i10, int i11, int i12, int i13) {
            return Math.max(i12 / i10, i13 / i11);
        }
    }

    /* loaded from: classes.dex */
    public static class e extends l {
        @Override // v7.l
        public g a(int i10, int i11, int i12, int i13) {
            if (l.f56866i) {
                return g.QUALITY;
            }
            return g.MEMORY;
        }

        @Override // v7.l
        public float b(int i10, int i11, int i12, int i13) {
            if (l.f56866i) {
                return Math.min(i12 / i10, i13 / i11);
            }
            int max = Math.max(i11 / i13, i10 / i12);
            if (max == 0) {
                return 1.0f;
            }
            return 1.0f / Integer.highestOneBit(max);
        }
    }

    /* loaded from: classes.dex */
    public static class f extends l {
        @Override // v7.l
        public g a(int i10, int i11, int i12, int i13) {
            return g.QUALITY;
        }

        @Override // v7.l
        public float b(int i10, int i11, int i12, int i13) {
            return 1.0f;
        }
    }

    /* loaded from: classes.dex */
    public enum g {
        MEMORY,
        QUALITY
    }

    static {
        d dVar = new d();
        f56862e = dVar;
        f56863f = new f();
        f56864g = dVar;
        f56865h = m7.g.f("com.bumptech.glide.load.resource.bitmap.Downsampler.DownsampleStrategy", dVar);
        f56866i = Build.VERSION.SDK_INT >= 19;
    }

    public abstract g a(int i10, int i11, int i12, int i13);

    public abstract float b(int i10, int i11, int i12, int i13);
}

package d1;

/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: b  reason: collision with root package name */
    public static final d f28949b = new d(null);

    /* renamed from: c  reason: collision with root package name */
    public static final a f28950c = new C0267a(new float[]{0.8951f, -0.7502f, 0.0389f, 0.2664f, 1.7135f, -0.0685f, -0.1614f, 0.0367f, 1.0296f});

    /* renamed from: d  reason: collision with root package name */
    public static final a f28951d = new c(new float[]{0.40024f, -0.2263f, 0.0f, 0.7076f, 1.16532f, 0.0f, -0.08081f, 0.0457f, 0.91822f});

    /* renamed from: e  reason: collision with root package name */
    public static final a f28952e = new b(new float[]{0.7328f, -0.7036f, 0.003f, 0.4296f, 1.6975f, 0.0136f, -0.1624f, 0.0061f, 0.9834f});

    /* renamed from: a  reason: collision with root package name */
    public final float[] f28953a;

    /* renamed from: d1.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0267a extends a {
        public C0267a(float[] fArr) {
            super(fArr, null);
        }

        public String toString() {
            return "Bradford";
        }
    }

    /* loaded from: classes.dex */
    public static final class b extends a {
        public b(float[] fArr) {
            super(fArr, null);
        }

        public String toString() {
            return "Ciecat02";
        }
    }

    /* loaded from: classes.dex */
    public static final class c extends a {
        public c(float[] fArr) {
            super(fArr, null);
        }

        public String toString() {
            return "VonKries";
        }
    }

    /* loaded from: classes.dex */
    public static final class d {
        public d() {
        }

        public /* synthetic */ d(jo.h hVar) {
            this();
        }

        public final a a() {
            return a.f28950c;
        }
    }

    public a(float[] fArr) {
        this.f28953a = fArr;
    }

    public /* synthetic */ a(float[] fArr, jo.h hVar) {
        this(fArr);
    }

    public final float[] b() {
        return this.f28953a;
    }
}

package a7;

import android.graphics.Paint;
import java.util.List;

/* loaded from: classes.dex */
public class q implements a7.c {

    /* renamed from: a  reason: collision with root package name */
    public final String f619a;

    /* renamed from: b  reason: collision with root package name */
    public final z6.b f620b;

    /* renamed from: c  reason: collision with root package name */
    public final List<z6.b> f621c;

    /* renamed from: d  reason: collision with root package name */
    public final z6.a f622d;

    /* renamed from: e  reason: collision with root package name */
    public final z6.d f623e;

    /* renamed from: f  reason: collision with root package name */
    public final z6.b f624f;

    /* renamed from: g  reason: collision with root package name */
    public final b f625g;

    /* renamed from: h  reason: collision with root package name */
    public final c f626h;

    /* renamed from: i  reason: collision with root package name */
    public final float f627i;

    /* renamed from: j  reason: collision with root package name */
    public final boolean f628j;

    /* loaded from: classes.dex */
    public static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f629a;

        /* renamed from: b  reason: collision with root package name */
        public static final /* synthetic */ int[] f630b;

        static {
            int[] iArr = new int[c.values().length];
            f630b = iArr;
            try {
                iArr[c.BEVEL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f630b[c.MITER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f630b[c.ROUND.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            int[] iArr2 = new int[b.values().length];
            f629a = iArr2;
            try {
                iArr2[b.BUTT.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f629a[b.ROUND.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f629a[b.UNKNOWN.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    /* loaded from: classes.dex */
    public enum b {
        BUTT,
        ROUND,
        UNKNOWN;

        public Paint.Cap a() {
            int i10 = a.f629a[ordinal()];
            if (i10 != 1) {
                if (i10 != 2) {
                    return Paint.Cap.SQUARE;
                }
                return Paint.Cap.ROUND;
            }
            return Paint.Cap.BUTT;
        }
    }

    /* loaded from: classes.dex */
    public enum c {
        MITER,
        ROUND,
        BEVEL;

        public Paint.Join a() {
            int i10 = a.f630b[ordinal()];
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 != 3) {
                        return null;
                    }
                    return Paint.Join.ROUND;
                }
                return Paint.Join.MITER;
            }
            return Paint.Join.BEVEL;
        }
    }

    public q(String str, z6.b bVar, List<z6.b> list, z6.a aVar, z6.d dVar, z6.b bVar2, b bVar3, c cVar, float f10, boolean z10) {
        this.f619a = str;
        this.f620b = bVar;
        this.f621c = list;
        this.f622d = aVar;
        this.f623e = dVar;
        this.f624f = bVar2;
        this.f625g = bVar3;
        this.f626h = cVar;
        this.f627i = f10;
        this.f628j = z10;
    }

    @Override // a7.c
    public u6.c a(s6.f fVar, b7.b bVar) {
        return new u6.r(fVar, bVar, this);
    }

    public b b() {
        return this.f625g;
    }

    public z6.a c() {
        return this.f622d;
    }

    public z6.b d() {
        return this.f620b;
    }

    public c e() {
        return this.f626h;
    }

    public List<z6.b> f() {
        return this.f621c;
    }

    public float g() {
        return this.f627i;
    }

    public String h() {
        return this.f619a;
    }

    public z6.d i() {
        return this.f623e;
    }

    public z6.b j() {
        return this.f624f;
    }

    public boolean k() {
        return this.f628j;
    }
}

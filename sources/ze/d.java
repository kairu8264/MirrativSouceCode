package ze;

import android.opengl.Matrix;
import android.util.Size;

/* loaded from: classes2.dex */
public class d {

    /* renamed from: a  reason: collision with root package name */
    public int f63117a;

    /* renamed from: b  reason: collision with root package name */
    public Size f63118b;

    /* renamed from: c  reason: collision with root package name */
    public Size f63119c;

    /* renamed from: d  reason: collision with root package name */
    public float[] f63120d;

    /* renamed from: e  reason: collision with root package name */
    public Size f63121e = new Size(1, 1);

    /* renamed from: f  reason: collision with root package name */
    public boolean f63122f;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* loaded from: classes2.dex */
    public static final class a {
        public static final a None = new b("None", 0);
        public static final a Right = new c("Right", 1);
        public static final a Left = new C1096a("Left", 2);
        private static final /* synthetic */ a[] $VALUES = a();

        /* renamed from: ze.d$a$a  reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        public static final class C1096a extends a {
            public C1096a(String str, int i10) {
                super(str, i10, null);
            }

            @Override // ze.d.a
            public float c() {
                return 270.0f;
            }

            @Override // ze.d.a
            public boolean e() {
                return true;
            }

            @Override // ze.d.a
            public int h(Size size, Size size2) {
                jo.p.h(size, "input");
                jo.p.h(size2, "output");
                return (int) Math.max((size.getWidth() / size2.getHeight()) + 1.0f, (size.getHeight() / size2.getWidth()) + 1.0f);
            }
        }

        /* loaded from: classes2.dex */
        public static final class b extends a {
            public b(String str, int i10) {
                super(str, i10, null);
            }

            @Override // ze.d.a
            public float c() {
                return 0.0f;
            }

            @Override // ze.d.a
            public boolean e() {
                return false;
            }

            @Override // ze.d.a
            public int h(Size size, Size size2) {
                jo.p.h(size, "input");
                jo.p.h(size2, "output");
                return (int) Math.max((size.getWidth() / size2.getWidth()) + 1.0f, (size.getHeight() / size2.getHeight()) + 1.0f);
            }
        }

        /* loaded from: classes2.dex */
        public static final class c extends a {
            public c(String str, int i10) {
                super(str, i10, null);
            }

            @Override // ze.d.a
            public float c() {
                return 90.0f;
            }

            @Override // ze.d.a
            public boolean e() {
                return true;
            }

            @Override // ze.d.a
            public int h(Size size, Size size2) {
                jo.p.h(size, "input");
                jo.p.h(size2, "output");
                return (int) Math.max((size.getWidth() / size2.getHeight()) + 1.0f, (size.getHeight() / size2.getWidth()) + 1.0f);
            }
        }

        public a(String str, int i10) {
        }

        public /* synthetic */ a(String str, int i10, jo.h hVar) {
            this(str, i10);
        }

        public static final /* synthetic */ a[] a() {
            return new a[]{None, Right, Left};
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) $VALUES.clone();
        }

        public abstract float c();

        public abstract boolean e();

        public abstract int h(Size size, Size size2);
    }

    public void a(int i10, Size size, Size size2, Size size3, boolean z10) {
        jo.p.h(size, "inputSize");
        jo.p.h(size2, "outputSize");
        jo.p.h(size3, "displaySize");
        this.f63117a = i10;
        this.f63118b = size;
        this.f63119c = size2;
        this.f63122f = z10;
        this.f63120d = b();
    }

    public float[] b() {
        float f10;
        float f11;
        Size size = this.f63118b;
        Size size2 = null;
        if (size == null) {
            jo.p.v("inputSize");
            size = null;
        }
        float width = size.getWidth();
        Size size3 = this.f63118b;
        if (size3 == null) {
            jo.p.v("inputSize");
            size3 = null;
        }
        float height = size3.getHeight();
        Size size4 = this.f63119c;
        if (size4 == null) {
            jo.p.v("outputSize");
            size4 = null;
        }
        float width2 = size4.getWidth();
        Size size5 = this.f63119c;
        if (size5 == null) {
            jo.p.v("outputSize");
            size5 = null;
        }
        float f12 = height / width;
        float height2 = size5.getHeight() / width2;
        a aVar = a.None;
        int i10 = (f12 > 1.0f ? 1 : (f12 == 1.0f ? 0 : -1));
        if (i10 < 0) {
            float f13 = 1;
            f10 = f13 / f12;
            if (height2 < 1.0f) {
                height2 = f13 / height2;
            } else {
                aVar = a.Left;
            }
        } else {
            if (height2 < 1.0f) {
                aVar = a.Right;
                height2 = 1 / height2;
            }
            f10 = f12;
        }
        if (this.f63122f) {
            if (f10 > height2) {
                if (i10 < 0) {
                    f11 = height2 / f10;
                    f12 = 1.0f;
                } else {
                    f12 = height2 / f10;
                    f11 = 1.0f;
                }
            } else if (i10 < 0) {
                f12 = f10 / height2;
                f11 = 1.0f;
            } else {
                f11 = f10 / height2;
                f12 = 1.0f;
            }
        } else if (f10 > height2) {
            if (i10 < 0) {
                f11 = (height2 / f10) * (1.0f / f12);
                f12 = 1.0f;
            } else {
                f12 *= height2 / f10;
                f11 = 1.0f;
            }
        } else if (i10 < 0) {
            f11 = 1.0f / f12;
            f12 = (f10 / height2) * 1.0f;
        } else {
            f11 = (f10 / height2) * 1.0f;
        }
        float[] fArr = new float[16];
        Matrix.setIdentityM(fArr, 0);
        if (aVar.e()) {
            Matrix.rotateM(fArr, 0, aVar.c(), 0.0f, 0.0f, 1.0f);
        }
        Size size6 = this.f63118b;
        if (size6 == null) {
            jo.p.v("inputSize");
            size6 = null;
        }
        Size size7 = this.f63119c;
        if (size7 == null) {
            jo.p.v("outputSize");
        } else {
            size2 = size7;
        }
        int h10 = aVar.h(size6, size2);
        this.f63121e = new Size(h10, h10);
        Matrix.scaleM(fArr, 0, f12, f11, 1.0f);
        return fArr;
    }

    public void c(Size size, Size size2, Size size3) {
        jo.p.h(size, "inputSize");
        jo.p.h(size2, "outputSize");
        jo.p.h(size3, "displaySize");
        this.f63118b = size;
        this.f63119c = size2;
        this.f63120d = b();
    }

    public void d(bf.c cVar, float[] fArr) {
        float[] fArr2;
        jo.p.h(cVar, "drawer");
        int i10 = this.f63117a;
        float[] fArr3 = this.f63120d;
        Size size = null;
        if (fArr3 == null) {
            jo.p.v("mvpMatrix");
            fArr2 = null;
        } else {
            fArr2 = fArr3;
        }
        Size size2 = this.f63119c;
        if (size2 == null) {
            jo.p.v("outputSize");
            size2 = null;
        }
        int width = size2.getWidth();
        Size size3 = this.f63119c;
        if (size3 == null) {
            jo.p.v("outputSize");
            size3 = null;
        }
        int height = size3.getHeight();
        Size size4 = this.f63118b;
        if (size4 == null) {
            jo.p.v("inputSize");
            size4 = null;
        }
        int width2 = size4.getWidth();
        Size size5 = this.f63118b;
        if (size5 == null) {
            jo.p.v("inputSize");
        } else {
            size = size5;
        }
        cVar.a(i10, fArr, fArr2, 0, 0, width, height, width2, size.getHeight(), this.f63121e.getWidth(), this.f63121e.getHeight());
    }
}

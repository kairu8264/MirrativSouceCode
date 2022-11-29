package a6;

import a6.g;
import a6.q;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.BitmapDrawable;
import android.os.Build;
import com.google.android.exoplayer2.util.MimeTypes;
import k6.b;
import rp.h0;

/* loaded from: classes.dex */
public final class b implements g {

    /* renamed from: d  reason: collision with root package name */
    public static final a f470d = new a(null);

    /* renamed from: a  reason: collision with root package name */
    public final q f471a;

    /* renamed from: b  reason: collision with root package name */
    public final j6.m f472b;

    /* renamed from: c  reason: collision with root package name */
    public final dp.f f473c;

    /* loaded from: classes.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }
    }

    /* renamed from: a6.b$b  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0007b extends rp.l {

        /* renamed from: x  reason: collision with root package name */
        public Exception f474x;

        public C0007b(h0 h0Var) {
            super(h0Var);
        }

        public final Exception c() {
            return this.f474x;
        }

        @Override // rp.l, rp.h0
        public long f1(rp.c cVar, long j10) {
            try {
                return super.f1(cVar, j10);
            } catch (Exception e10) {
                this.f474x = e10;
                throw e10;
            }
        }
    }

    /* loaded from: classes.dex */
    public static final class c implements g.a {

        /* renamed from: a  reason: collision with root package name */
        public final dp.f f475a;

        public c(int i10) {
            this.f475a = dp.h.b(i10, 0, 2, null);
        }

        @Override // a6.g.a
        public g a(d6.l lVar, j6.m mVar, x5.e eVar) {
            return new b(lVar.b(), mVar, this.f475a);
        }

        public boolean equals(Object obj) {
            return obj instanceof c;
        }

        public int hashCode() {
            return c.class.hashCode();
        }
    }

    @co.f(c = "coil.decode.BitmapFactoryDecoder", f = "BitmapFactoryDecoder.kt", l = {210, 31}, m = "decode")
    /* loaded from: classes.dex */
    public static final class d extends co.d {
        public int A;

        /* renamed from: w  reason: collision with root package name */
        public Object f476w;

        /* renamed from: x  reason: collision with root package name */
        public Object f477x;

        /* renamed from: y  reason: collision with root package name */
        public /* synthetic */ Object f478y;

        public d(ao.d<? super d> dVar) {
            super(dVar);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            this.f478y = obj;
            this.A |= Integer.MIN_VALUE;
            return b.this.a(this);
        }
    }

    /* loaded from: classes.dex */
    public static final class e extends jo.q implements io.a<a6.e> {
        public e() {
            super(0);
        }

        @Override // io.a
        /* renamed from: a */
        public final a6.e invoke() {
            return b.this.e(new BitmapFactory.Options());
        }
    }

    public b(q qVar, j6.m mVar, dp.f fVar) {
        this.f471a = qVar;
        this.f472b = mVar;
        this.f473c = fVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x006c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x006d  */
    @Override // a6.g
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object a(ao.d<? super a6.e> r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof a6.b.d
            if (r0 == 0) goto L13
            r0 = r8
            a6.b$d r0 = (a6.b.d) r0
            int r1 = r0.A
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.A = r1
            goto L18
        L13:
            a6.b$d r0 = new a6.b$d
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.f478y
            java.lang.Object r1 = bo.c.c()
            int r2 = r0.A
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L47
            if (r2 == r4) goto L3a
            if (r2 != r3) goto L32
            java.lang.Object r0 = r0.f476w
            dp.f r0 = (dp.f) r0
            wn.m.b(r8)     // Catch: java.lang.Throwable -> L30
            goto L70
        L30:
            r8 = move-exception
            goto L7a
        L32:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L3a:
            java.lang.Object r2 = r0.f477x
            dp.f r2 = (dp.f) r2
            java.lang.Object r5 = r0.f476w
            a6.b r5 = (a6.b) r5
            wn.m.b(r8)
            r8 = r2
            goto L5a
        L47:
            wn.m.b(r8)
            dp.f r8 = r7.f473c
            r0.f476w = r7
            r0.f477x = r8
            r0.A = r4
            java.lang.Object r2 = r8.a(r0)
            if (r2 != r1) goto L59
            return r1
        L59:
            r5 = r7
        L5a:
            a6.b$e r2 = new a6.b$e     // Catch: java.lang.Throwable -> L76
            r2.<init>()     // Catch: java.lang.Throwable -> L76
            r0.f476w = r8     // Catch: java.lang.Throwable -> L76
            r5 = 0
            r0.f477x = r5     // Catch: java.lang.Throwable -> L76
            r0.A = r3     // Catch: java.lang.Throwable -> L76
            java.lang.Object r0 = uo.z1.c(r5, r2, r0, r4, r5)     // Catch: java.lang.Throwable -> L76
            if (r0 != r1) goto L6d
            return r1
        L6d:
            r6 = r0
            r0 = r8
            r8 = r6
        L70:
            a6.e r8 = (a6.e) r8     // Catch: java.lang.Throwable -> L30
            r0.release()
            return r8
        L76:
            r0 = move-exception
            r6 = r0
            r0 = r8
            r8 = r6
        L7a:
            r0.release()
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: a6.b.a(ao.d):java.lang.Object");
    }

    public final void c(BitmapFactory.Options options, h hVar) {
        Bitmap.Config f10 = this.f472b.f();
        if (hVar.b() || k.a(hVar)) {
            f10 = o6.a.e(f10);
        }
        if (this.f472b.d() && f10 == Bitmap.Config.ARGB_8888 && jo.p.c(options.outMimeType, MimeTypes.IMAGE_JPEG)) {
            f10 = Bitmap.Config.RGB_565;
        }
        if (Build.VERSION.SDK_INT >= 26 && options.outConfig == Bitmap.Config.RGBA_F16 && f10 != Bitmap.Config.HARDWARE) {
            f10 = Bitmap.Config.RGBA_F16;
        }
        options.inPreferredConfig = f10;
    }

    public final void d(BitmapFactory.Options options, h hVar) {
        q.a d10 = this.f471a.d();
        if ((d10 instanceof s) && k6.a.a(this.f472b.o())) {
            options.inSampleSize = 1;
            options.inScaled = true;
            options.inDensity = ((s) d10).a();
            options.inTargetDensity = this.f472b.g().getResources().getDisplayMetrics().densityDpi;
            return;
        }
        if (options.outWidth > 0 && options.outHeight > 0) {
            int i10 = k.b(hVar) ? options.outHeight : options.outWidth;
            int i11 = k.b(hVar) ? options.outWidth : options.outHeight;
            k6.h o10 = this.f472b.o();
            k6.b b10 = o10.b();
            int i12 = b10 instanceof b.C0535b ? ((b.C0535b) b10).f38438a : i10;
            k6.b a10 = o10.a();
            int i13 = a10 instanceof b.C0535b ? ((b.C0535b) a10).f38438a : i11;
            int a11 = f.a(i10, i11, i12, i13, this.f472b.n());
            options.inSampleSize = a11;
            double b11 = f.b(i10 / a11, i11 / a11, i12, i13, this.f472b.n());
            if (this.f472b.c()) {
                b11 = po.n.g(b11, 1.0d);
            }
            boolean z10 = !(b11 == 1.0d);
            options.inScaled = z10;
            if (z10) {
                if (b11 > 1.0d) {
                    options.inDensity = lo.c.b(Integer.MAX_VALUE / b11);
                    options.inTargetDensity = Integer.MAX_VALUE;
                    return;
                }
                options.inDensity = Integer.MAX_VALUE;
                options.inTargetDensity = lo.c.b(Integer.MAX_VALUE * b11);
                return;
            }
            return;
        }
        options.inSampleSize = 1;
        options.inScaled = false;
    }

    public final a6.e e(BitmapFactory.Options options) {
        C0007b c0007b = new C0007b(this.f471a.e());
        rp.e c10 = rp.t.c(c0007b);
        boolean z10 = true;
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeStream(c10.peek().P1(), null, options);
        Exception c11 = c0007b.c();
        if (c11 == null) {
            options.inJustDecodeBounds = false;
            j jVar = j.f492a;
            h a10 = jVar.a(options.outMimeType, c10);
            Exception c12 = c0007b.c();
            if (c12 == null) {
                options.inMutable = false;
                if (Build.VERSION.SDK_INT >= 26 && this.f472b.e() != null) {
                    options.inPreferredColorSpace = this.f472b.e();
                }
                options.inPremultiplied = this.f472b.m();
                c(options, a10);
                d(options, a10);
                try {
                    Bitmap decodeStream = BitmapFactory.decodeStream(c10.P1(), null, options);
                    go.a.a(c10, null);
                    Exception c13 = c0007b.c();
                    if (c13 == null) {
                        if (decodeStream != null) {
                            decodeStream.setDensity(this.f472b.g().getResources().getDisplayMetrics().densityDpi);
                            BitmapDrawable bitmapDrawable = new BitmapDrawable(this.f472b.g().getResources(), jVar.b(decodeStream, a10));
                            if (options.inSampleSize <= 1 && !options.inScaled) {
                                z10 = false;
                            }
                            return new a6.e(bitmapDrawable, z10);
                        }
                        throw new IllegalStateException("BitmapFactory returned a null bitmap. Often this means BitmapFactory could not decode the image data read from the input source (e.g. network, disk, or memory) as it's not encoded as a valid image format.".toString());
                    }
                    throw c13;
                } finally {
                }
            } else {
                throw c12;
            }
        } else {
            throw c11;
        }
    }
}

package a6;

import a6.g;
import a6.q;
import android.graphics.ImageDecoder;
import android.graphics.drawable.AnimatedImageDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.Size;
import java.nio.ByteBuffer;
import jo.a0;
import jo.e0;
import k6.b;
import rp.y;
import uo.q0;
import wn.v;

/* loaded from: classes.dex */
public final class p implements g {

    /* renamed from: a  reason: collision with root package name */
    public final q f517a;

    /* renamed from: b  reason: collision with root package name */
    public final j6.m f518b;

    /* renamed from: c  reason: collision with root package name */
    public final boolean f519c;

    @co.f(c = "coil.decode.ImageDecoderDecoder", f = "ImageDecoderDecoder.kt", l = {49, 89}, m = "decode")
    /* loaded from: classes.dex */
    public static final class b extends co.d {
        public int A;

        /* renamed from: w  reason: collision with root package name */
        public Object f521w;

        /* renamed from: x  reason: collision with root package name */
        public Object f522x;

        /* renamed from: y  reason: collision with root package name */
        public /* synthetic */ Object f523y;

        public b(ao.d<? super b> dVar) {
            super(dVar);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            this.f523y = obj;
            this.A |= Integer.MIN_VALUE;
            return p.this.a(this);
        }
    }

    /* loaded from: classes.dex */
    public static final class c extends jo.q implements io.a<Drawable> {

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ a0 f526x;

        /* loaded from: classes.dex */
        public static final class a implements ImageDecoder.OnHeaderDecodedListener {

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ e0 f527a;

            /* renamed from: b  reason: collision with root package name */
            public final /* synthetic */ p f528b;

            /* renamed from: c  reason: collision with root package name */
            public final /* synthetic */ a0 f529c;

            public a(e0 e0Var, p pVar, a0 a0Var) {
                this.f527a = e0Var;
                this.f528b = pVar;
                this.f529c = a0Var;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // android.graphics.ImageDecoder.OnHeaderDecodedListener
            public final void onHeaderDecoded(ImageDecoder imageDecoder, ImageDecoder.ImageInfo imageInfo, ImageDecoder.Source source) {
                jo.p.h(imageDecoder, "decoder");
                jo.p.h(imageInfo, "info");
                jo.p.h(source, "source");
                this.f527a.f38136w = imageDecoder;
                Size size = imageInfo.getSize();
                int width = size.getWidth();
                int height = size.getHeight();
                k6.b b10 = this.f528b.f518b.o().b();
                int i10 = b10 instanceof b.C0535b ? ((b.C0535b) b10).f38438a : width;
                k6.b a10 = this.f528b.f518b.o().a();
                int i11 = a10 instanceof b.C0535b ? ((b.C0535b) a10).f38438a : height;
                if (width > 0 && height > 0 && (width != i10 || height != i11)) {
                    double c10 = f.c(width, height, i10, i11, this.f528b.f518b.n());
                    a0 a0Var = this.f529c;
                    boolean z10 = c10 < 1.0d;
                    a0Var.f38125w = z10;
                    if (z10 || !this.f528b.f518b.c()) {
                        imageDecoder.setTargetSize(lo.c.b(width * c10), lo.c.b(c10 * height));
                    }
                }
                this.f528b.h(imageDecoder);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(a0 a0Var) {
            super(0);
            this.f526x = a0Var;
        }

        @Override // io.a
        /* renamed from: a */
        public final Drawable invoke() {
            e0 e0Var = new e0();
            p pVar = p.this;
            q k10 = pVar.k(pVar.f517a);
            try {
                Drawable decodeDrawable = ImageDecoder.decodeDrawable(p.this.i(k10), new a(e0Var, p.this, this.f526x));
                jo.p.g(decodeDrawable, "crossinline action: Imag…ction(info, source)\n    }");
                return decodeDrawable;
            } finally {
                ImageDecoder imageDecoder = (ImageDecoder) e0Var.f38136w;
                if (imageDecoder != null) {
                    imageDecoder.close();
                }
                k10.close();
            }
        }
    }

    @co.f(c = "coil.decode.ImageDecoderDecoder", f = "ImageDecoderDecoder.kt", l = {157}, m = "wrapDrawable")
    /* loaded from: classes.dex */
    public static final class d extends co.d {
        public int A;

        /* renamed from: w  reason: collision with root package name */
        public Object f530w;

        /* renamed from: x  reason: collision with root package name */
        public Object f531x;

        /* renamed from: y  reason: collision with root package name */
        public /* synthetic */ Object f532y;

        public d(ao.d<? super d> dVar) {
            super(dVar);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            this.f532y = obj;
            this.A |= Integer.MIN_VALUE;
            return p.this.j(null, this);
        }
    }

    @co.f(c = "coil.decode.ImageDecoderDecoder$wrapDrawable$2", f = "ImageDecoderDecoder.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class e extends co.l implements io.p<q0, ao.d<? super v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f534w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ Drawable f535x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a<v> f536y;

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ io.a<v> f537z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(Drawable drawable, io.a<v> aVar, io.a<v> aVar2, ao.d<? super e> dVar) {
            super(2, dVar);
            this.f535x = drawable;
            this.f536y = aVar;
            this.f537z = aVar2;
        }

        @Override // co.a
        public final ao.d<v> create(Object obj, ao.d<?> dVar) {
            return new e(this.f535x, this.f536y, this.f537z, dVar);
        }

        @Override // io.p
        public final Object invoke(q0 q0Var, ao.d<? super v> dVar) {
            return ((e) create(q0Var, dVar)).invokeSuspend(v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            bo.c.c();
            if (this.f534w == 0) {
                wn.m.b(obj);
                ((AnimatedImageDrawable) this.f535x).registerAnimationCallback(o6.g.b(this.f536y, this.f537z));
                return v.f59242a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public p(q qVar, j6.m mVar, boolean z10) {
        this.f517a = qVar;
        this.f518b = mVar;
        this.f519c = z10;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0071 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0072  */
    @Override // a6.g
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object a(ao.d<? super a6.e> r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof a6.p.b
            if (r0 == 0) goto L13
            r0 = r8
            a6.p$b r0 = (a6.p.b) r0
            int r1 = r0.A
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.A = r1
            goto L18
        L13:
            a6.p$b r0 = new a6.p$b
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.f523y
            java.lang.Object r1 = bo.c.c()
            int r2 = r0.A
            r3 = 2
            r4 = 0
            r5 = 1
            if (r2 == 0) goto L45
            if (r2 == r5) goto L39
            if (r2 != r3) goto L31
            java.lang.Object r0 = r0.f521w
            jo.a0 r0 = (jo.a0) r0
            wn.m.b(r8)
            goto L73
        L31:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L39:
            java.lang.Object r2 = r0.f522x
            jo.a0 r2 = (jo.a0) r2
            java.lang.Object r5 = r0.f521w
            a6.p r5 = (a6.p) r5
            wn.m.b(r8)
            goto L63
        L45:
            wn.m.b(r8)
            jo.a0 r8 = new jo.a0
            r8.<init>()
            a6.p$c r2 = new a6.p$c
            r2.<init>(r8)
            r0.f521w = r7
            r0.f522x = r8
            r0.A = r5
            java.lang.Object r2 = uo.z1.c(r4, r2, r0, r5, r4)
            if (r2 != r1) goto L5f
            return r1
        L5f:
            r5 = r7
            r6 = r2
            r2 = r8
            r8 = r6
        L63:
            android.graphics.drawable.Drawable r8 = (android.graphics.drawable.Drawable) r8
            r0.f521w = r2
            r0.f522x = r4
            r0.A = r3
            java.lang.Object r8 = r5.j(r8, r0)
            if (r8 != r1) goto L72
            return r1
        L72:
            r0 = r2
        L73:
            android.graphics.drawable.Drawable r8 = (android.graphics.drawable.Drawable) r8
            boolean r0 = r0.f38125w
            a6.e r1 = new a6.e
            r1.<init>(r8, r0)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: a6.p.a(ao.d):java.lang.Object");
    }

    public final void h(ImageDecoder imageDecoder) {
        imageDecoder.setAllocator(o6.g.g(this.f518b.f()) ? 3 : 1);
        imageDecoder.setMemorySizePolicy(!this.f518b.d());
        if (this.f518b.e() != null) {
            imageDecoder.setTargetColorSpace(this.f518b.e());
        }
        imageDecoder.setUnpremultipliedRequired(!this.f518b.m());
        m6.a a10 = j6.f.a(this.f518b.l());
        imageDecoder.setPostProcessor(a10 == null ? null : o6.g.d(a10));
    }

    public final ImageDecoder.Source i(q qVar) {
        y c10 = qVar.c();
        if (c10 != null) {
            return ImageDecoder.createSource(c10.r());
        }
        q.a d10 = qVar.d();
        if (d10 instanceof a6.a) {
            return ImageDecoder.createSource(this.f518b.g().getAssets(), ((a6.a) d10).a());
        }
        if (d10 instanceof a6.c) {
            return ImageDecoder.createSource(this.f518b.g().getContentResolver(), ((a6.c) d10).a());
        }
        if (d10 instanceof s) {
            s sVar = (s) d10;
            if (jo.p.c(sVar.b(), this.f518b.g().getPackageName())) {
                return ImageDecoder.createSource(this.f518b.g().getResources(), sVar.c());
            }
        }
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 31) {
            return ImageDecoder.createSource(qVar.e().Z0());
        }
        if (i10 == 30) {
            return ImageDecoder.createSource(ByteBuffer.wrap(qVar.e().Z0()));
        }
        return ImageDecoder.createSource(qVar.a().r());
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0039  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object j(android.graphics.drawable.Drawable r8, ao.d<? super android.graphics.drawable.Drawable> r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof a6.p.d
            if (r0 == 0) goto L13
            r0 = r9
            a6.p$d r0 = (a6.p.d) r0
            int r1 = r0.A
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.A = r1
            goto L18
        L13:
            a6.p$d r0 = new a6.p$d
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.f532y
            java.lang.Object r1 = bo.c.c()
            int r2 = r0.A
            r3 = 1
            if (r2 == 0) goto L39
            if (r2 != r3) goto L31
            java.lang.Object r8 = r0.f531x
            android.graphics.drawable.Drawable r8 = (android.graphics.drawable.Drawable) r8
            java.lang.Object r0 = r0.f530w
            a6.p r0 = (a6.p) r0
            wn.m.b(r9)
            goto L8f
        L31:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L39:
            wn.m.b(r9)
            boolean r9 = r8 instanceof android.graphics.drawable.AnimatedImageDrawable
            if (r9 != 0) goto L41
            return r8
        L41:
            r9 = r8
            android.graphics.drawable.AnimatedImageDrawable r9 = (android.graphics.drawable.AnimatedImageDrawable) r9
            j6.m r2 = r7.f518b
            j6.n r2 = r2.l()
            java.lang.Integer r2 = j6.f.d(r2)
            if (r2 != 0) goto L52
            r2 = -1
            goto L56
        L52:
            int r2 = r2.intValue()
        L56:
            r9.setRepeatCount(r2)
            j6.m r9 = r7.f518b
            j6.n r9 = r9.l()
            io.a r9 = j6.f.c(r9)
            j6.m r2 = r7.f518b
            j6.n r2 = r2.l()
            io.a r2 = j6.f.b(r2)
            if (r9 != 0) goto L74
            if (r2 == 0) goto L72
            goto L74
        L72:
            r0 = r7
            goto L8f
        L74:
            uo.o2 r4 = uo.g1.c()
            uo.o2 r4 = r4.h0()
            a6.p$e r5 = new a6.p$e
            r6 = 0
            r5.<init>(r8, r9, r2, r6)
            r0.f530w = r7
            r0.f531x = r8
            r0.A = r3
            java.lang.Object r9 = uo.j.f(r4, r5, r0)
            if (r9 != r1) goto L72
            return r1
        L8f:
            c6.c r9 = new c6.c
            j6.m r0 = r0.f518b
            k6.g r0 = r0.n()
            r9.<init>(r8, r0)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: a6.p.j(android.graphics.drawable.Drawable, ao.d):java.lang.Object");
    }

    public final q k(q qVar) {
        return (this.f519c && n.c(f.f484a, qVar.e())) ? r.a(rp.t.c(new m(qVar.e())), this.f518b.g()) : qVar;
    }

    /* loaded from: classes.dex */
    public static final class a implements g.a {

        /* renamed from: a  reason: collision with root package name */
        public final boolean f520a;

        public a(boolean z10) {
            this.f520a = z10;
        }

        @Override // a6.g.a
        public g a(d6.l lVar, j6.m mVar, x5.e eVar) {
            if (b(lVar.b().e())) {
                return new p(lVar.b(), mVar, this.f520a);
            }
            return null;
        }

        public final boolean b(rp.e eVar) {
            f fVar = f.f484a;
            return n.c(fVar, eVar) || n.b(fVar, eVar) || (Build.VERSION.SDK_INT >= 30 && n.a(fVar, eVar));
        }

        public boolean equals(Object obj) {
            return obj instanceof a;
        }

        public int hashCode() {
            return a.class.hashCode();
        }

        public /* synthetic */ a(boolean z10, int i10, jo.h hVar) {
            this((i10 & 1) != 0 ? true : z10);
        }
    }
}

package w6;

import android.content.Context;
import android.graphics.BitmapFactory;
import android.graphics.Typeface;
import android.util.Base64;
import androidx.compose.ui.platform.z;
import com.mirrativ.llstream.protocol.v1.topic.TopicConstant;
import io.q;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.zip.ZipInputStream;
import kotlin.NoWhenBranchMatchedException;
import l0.c0;
import l0.s0;
import l0.z1;
import uo.g1;
import uo.p;
import uo.q0;
import w6.k;
import wn.l;
import wn.v;

/* loaded from: classes.dex */
public final class o {

    /* loaded from: classes.dex */
    public static final class a<T> implements s6.h {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ p<T> f58194a;

        /* JADX WARN: Multi-variable type inference failed */
        public a(p<? super T> pVar) {
            this.f58194a = pVar;
        }

        @Override // s6.h
        public final void a(T t10) {
            if (this.f58194a.w()) {
                return;
            }
            p<T> pVar = this.f58194a;
            l.a aVar = wn.l.f59224w;
            pVar.resumeWith(wn.l.a(t10));
        }
    }

    /* loaded from: classes.dex */
    public static final class b<T> implements s6.h {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ p<T> f58195a;

        /* JADX WARN: Multi-variable type inference failed */
        public b(p<? super T> pVar) {
            this.f58195a = pVar;
        }

        @Override // s6.h
        /* renamed from: b */
        public final void a(Throwable th2) {
            if (this.f58195a.w()) {
                return;
            }
            p<T> pVar = this.f58195a;
            jo.p.g(th2, i7.e.f36387u);
            l.a aVar = wn.l.f59224w;
            pVar.resumeWith(wn.l.a(wn.m.a(th2)));
        }
    }

    @co.f(c = "com.airbnb.lottie.compose.RememberLottieCompositionKt$loadFontsFromAssets$2", f = "rememberLottieComposition.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class c extends co.l implements io.p<q0, ao.d<? super v>, Object> {
        public final /* synthetic */ String A;

        /* renamed from: w  reason: collision with root package name */
        public int f58196w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ s6.d f58197x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ Context f58198y;

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ String f58199z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(s6.d dVar, Context context, String str, String str2, ao.d<? super c> dVar2) {
            super(2, dVar2);
            this.f58197x = dVar;
            this.f58198y = context;
            this.f58199z = str;
            this.A = str2;
        }

        @Override // co.a
        public final ao.d<v> create(Object obj, ao.d<?> dVar) {
            return new c(this.f58197x, this.f58198y, this.f58199z, this.A, dVar);
        }

        @Override // io.p
        public final Object invoke(q0 q0Var, ao.d<? super v> dVar) {
            return ((c) create(q0Var, dVar)).invokeSuspend(v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            bo.c.c();
            if (this.f58196w == 0) {
                wn.m.b(obj);
                for (y6.c cVar : this.f58197x.g().values()) {
                    Context context = this.f58198y;
                    jo.p.g(cVar, "font");
                    o.q(context, cVar, this.f58199z, this.A);
                }
                return v.f59242a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @co.f(c = "com.airbnb.lottie.compose.RememberLottieCompositionKt$loadImagesFromAssets$2", f = "rememberLottieComposition.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class d extends co.l implements io.p<q0, ao.d<? super v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f58200w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ s6.d f58201x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ Context f58202y;

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ String f58203z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(s6.d dVar, Context context, String str, ao.d<? super d> dVar2) {
            super(2, dVar2);
            this.f58201x = dVar;
            this.f58202y = context;
            this.f58203z = str;
        }

        @Override // co.a
        public final ao.d<v> create(Object obj, ao.d<?> dVar) {
            return new d(this.f58201x, this.f58202y, this.f58203z, dVar);
        }

        @Override // io.p
        public final Object invoke(q0 q0Var, ao.d<? super v> dVar) {
            return ((d) create(q0Var, dVar)).invokeSuspend(v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            bo.c.c();
            if (this.f58200w == 0) {
                wn.m.b(obj);
                for (s6.g gVar : this.f58201x.j().values()) {
                    jo.p.g(gVar, "asset");
                    o.o(gVar);
                    o.p(this.f58202y, gVar, this.f58203z);
                }
                return v.f59242a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @co.f(c = "com.airbnb.lottie.compose.RememberLottieCompositionKt", f = "rememberLottieComposition.kt", l = {125, 126, 127}, m = "lottieComposition")
    /* loaded from: classes.dex */
    public static final class e extends co.d {
        public /* synthetic */ Object A;
        public int B;

        /* renamed from: w  reason: collision with root package name */
        public Object f58204w;

        /* renamed from: x  reason: collision with root package name */
        public Object f58205x;

        /* renamed from: y  reason: collision with root package name */
        public Object f58206y;

        /* renamed from: z  reason: collision with root package name */
        public Object f58207z;

        public e(ao.d<? super e> dVar) {
            super(dVar);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            this.A = obj;
            this.B |= Integer.MIN_VALUE;
            return o.m(null, null, null, null, null, null, this);
        }
    }

    @co.f(c = "com.airbnb.lottie.compose.RememberLottieCompositionKt$rememberLottieComposition$1", f = "rememberLottieComposition.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class f extends co.l implements q<Integer, Throwable, ao.d<? super Boolean>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f58208w;

        public f(ao.d<? super f> dVar) {
            super(3, dVar);
        }

        public final Object a(int i10, Throwable th2, ao.d<? super Boolean> dVar) {
            return new f(dVar).invokeSuspend(v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            bo.c.c();
            if (this.f58208w == 0) {
                wn.m.b(obj);
                return co.b.a(false);
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // io.q
        public /* bridge */ /* synthetic */ Object s0(Integer num, Throwable th2, ao.d<? super Boolean> dVar) {
            return a(num.intValue(), th2, dVar);
        }
    }

    @co.f(c = "com.airbnb.lottie.compose.RememberLottieCompositionKt$rememberLottieComposition$3", f = "rememberLottieComposition.kt", l = {90, 92}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class g extends co.l implements io.p<q0, ao.d<? super v>, Object> {
        public final /* synthetic */ Context A;
        public final /* synthetic */ k B;
        public final /* synthetic */ String C;
        public final /* synthetic */ String D;
        public final /* synthetic */ String E;
        public final /* synthetic */ String F;
        public final /* synthetic */ s0<j> G;

        /* renamed from: w  reason: collision with root package name */
        public Object f58209w;

        /* renamed from: x  reason: collision with root package name */
        public int f58210x;

        /* renamed from: y  reason: collision with root package name */
        public int f58211y;

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ q<Integer, Throwable, ao.d<? super Boolean>, Object> f58212z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public g(q<? super Integer, ? super Throwable, ? super ao.d<? super Boolean>, ? extends Object> qVar, Context context, k kVar, String str, String str2, String str3, String str4, s0<j> s0Var, ao.d<? super g> dVar) {
            super(2, dVar);
            this.f58212z = qVar;
            this.A = context;
            this.B = kVar;
            this.C = str;
            this.D = str2;
            this.E = str3;
            this.F = str4;
            this.G = s0Var;
        }

        @Override // co.a
        public final ao.d<v> create(Object obj, ao.d<?> dVar) {
            return new g(this.f58212z, this.A, this.B, this.C, this.D, this.E, this.F, this.G, dVar);
        }

        @Override // io.p
        public final Object invoke(q0 q0Var, ao.d<? super v> dVar) {
            return ((g) create(q0Var, dVar)).invokeSuspend(v.f59242a);
        }

        /* JADX WARN: Can't wrap try/catch for region: R(4:(2:15|(1:17)(3:19|20|(1:22)(1:23)))|24|25|(1:27)(6:28|9|10|11|12|(0))) */
        /* JADX WARN: Code restructure failed: missing block: B:34:0x00bc, code lost:
            r4 = th;
         */
        /* JADX WARN: Removed duplicated region for block: B:17:0x004b  */
        /* JADX WARN: Removed duplicated region for block: B:24:0x0071  */
        /* JADX WARN: Removed duplicated region for block: B:25:0x0076  */
        /* JADX WARN: Removed duplicated region for block: B:38:0x00cb A[ADDED_TO_REGION] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:29:0x009f -> B:42:0x00a5). Please submit an issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:35:0x00bd -> B:15:0x003f). Please submit an issue!!! */
        @Override // co.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r15) {
            /*
                Method dump skipped, instructions count: 217
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: w6.o.g.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public static final <T> Object h(s6.m<T> mVar, ao.d<? super T> dVar) {
        uo.q qVar = new uo.q(bo.b.b(dVar), 1);
        qVar.y();
        mVar.f(new a(qVar)).e(new b(qVar));
        Object t10 = qVar.t();
        if (t10 == bo.c.c()) {
            co.h.c(dVar);
        }
        return t10;
    }

    public static final String i(String str) {
        return (so.n.r(str) || so.n.C(str, TopicConstant.SEPARATOR, false, 2, null)) ? str : jo.p.o(TopicConstant.SEPARATOR, str);
    }

    public static final String j(String str) {
        if (str == null || so.n.r(str)) {
            return null;
        }
        return so.o.K(str, '/', false, 2, null) ? str : jo.p.o(str, "/");
    }

    public static final Object k(Context context, s6.d dVar, String str, String str2, ao.d<? super v> dVar2) {
        Object f10;
        return (!dVar.g().isEmpty() && (f10 = uo.j.f(g1.b(), new c(dVar, context, str, str2, null), dVar2)) == bo.c.c()) ? f10 : v.f59242a;
    }

    public static final Object l(Context context, s6.d dVar, String str, ao.d<? super v> dVar2) {
        if (!dVar.r()) {
            return v.f59242a;
        }
        Object f10 = uo.j.f(g1.b(), new d(dVar, context, str, null), dVar2);
        return f10 == bo.c.c() ? f10 : v.f59242a;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0094 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00aa A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:33:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object m(android.content.Context r6, w6.k r7, java.lang.String r8, java.lang.String r9, java.lang.String r10, java.lang.String r11, ao.d<? super s6.d> r12) {
        /*
            Method dump skipped, instructions count: 204
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: w6.o.m(android.content.Context, w6.k, java.lang.String, java.lang.String, java.lang.String, java.lang.String, ao.d):java.lang.Object");
    }

    public static final s6.m<s6.d> n(Context context, k kVar, String str, boolean z10) {
        if (kVar instanceof k.d) {
            if (jo.p.c(str, "__LottieInternalDefaultCacheKey__")) {
                return s6.e.o(context, ((k.d) kVar).d());
            }
            return s6.e.p(context, ((k.d) kVar).d(), str);
        } else if (kVar instanceof k.e) {
            if (jo.p.c(str, "__LottieInternalDefaultCacheKey__")) {
                return s6.e.s(context, ((k.e) kVar).d());
            }
            return s6.e.t(context, ((k.e) kVar).d(), str);
        } else if (kVar instanceof k.b) {
            if (z10) {
                return null;
            }
            k.b bVar = (k.b) kVar;
            FileInputStream fileInputStream = new FileInputStream(bVar.d());
            if (so.n.p(bVar.d(), "zip", false, 2, null)) {
                return s6.e.u(new ZipInputStream(fileInputStream), str != null ? bVar.d() : null);
            }
            return s6.e.h(fileInputStream, str != null ? bVar.d() : null);
        } else if (kVar instanceof k.a) {
            if (jo.p.c(str, "__LottieInternalDefaultCacheKey__")) {
                return s6.e.d(context, ((k.a) kVar).f());
            }
            return s6.e.e(context, ((k.a) kVar).f(), null);
        } else if (kVar instanceof k.c) {
            if (jo.p.c(str, "__LottieInternalDefaultCacheKey__")) {
                str = String.valueOf(((k.c) kVar).d().hashCode());
            }
            return s6.e.m(((k.c) kVar).d(), str);
        } else {
            throw new NoWhenBranchMatchedException();
        }
    }

    public static final void o(s6.g gVar) {
        if (gVar.a() != null) {
            return;
        }
        String c10 = gVar.c();
        jo.p.g(c10, "filename");
        if (!so.n.C(c10, "data:", false, 2, null) || so.o.U(c10, "base64,", 0, false, 6, null) <= 0) {
            return;
        }
        try {
            String substring = c10.substring(so.o.T(c10, ',', 0, false, 6, null) + 1);
            jo.p.g(substring, "(this as java.lang.String).substring(startIndex)");
            byte[] decode = Base64.decode(substring, 0);
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.inScaled = true;
            options.inDensity = 160;
            gVar.g(BitmapFactory.decodeByteArray(decode, 0, decode.length, options));
        } catch (IllegalArgumentException e10) {
            f7.d.d("data URL did not have correct base64 format.", e10);
        }
    }

    public static final void p(Context context, s6.g gVar, String str) {
        if (gVar.a() != null || str == null) {
            return;
        }
        try {
            InputStream open = context.getAssets().open(jo.p.o(str, gVar.c()));
            jo.p.g(open, "try {\n        context.as…, e)\n        return\n    }");
            try {
                BitmapFactory.Options options = new BitmapFactory.Options();
                options.inScaled = true;
                options.inDensity = 160;
                gVar.g(f7.h.l(BitmapFactory.decodeStream(open, null, options), gVar.f(), gVar.d()));
            } catch (IllegalArgumentException e10) {
                f7.d.d("Unable to decode image.", e10);
            }
        } catch (IOException e11) {
            f7.d.d("Unable to open asset.", e11);
        }
    }

    public static final void q(Context context, y6.c cVar, String str, String str2) {
        String str3 = ((Object) str) + ((Object) cVar.a()) + str2;
        try {
            Typeface createFromAsset = Typeface.createFromAsset(context.getAssets(), str3);
            try {
                jo.p.g(createFromAsset, "typefaceWithDefaultStyle");
                String c10 = cVar.c();
                jo.p.g(c10, "font.style");
                cVar.e(t(createFromAsset, c10));
            } catch (Exception e10) {
                f7.d.b("Failed to create " + ((Object) cVar.a()) + " typeface with style=" + ((Object) cVar.c()) + '!', e10);
            }
        } catch (Exception e11) {
            f7.d.b("Failed to find typeface in assets with path " + str3 + '.', e11);
        }
    }

    public static final i r(k kVar, String str, String str2, String str3, String str4, q<? super Integer, ? super Throwable, ? super ao.d<? super Boolean>, ? extends Object> qVar, l0.i iVar, int i10, int i11) {
        jo.p.h(kVar, "spec");
        iVar.x(1388713460);
        String str5 = (i11 & 2) != 0 ? null : str;
        String str6 = (i11 & 4) != 0 ? "fonts/" : str2;
        String str7 = (i11 & 8) != 0 ? ".ttf" : str3;
        String str8 = (i11 & 16) != 0 ? "__LottieInternalDefaultCacheKey__" : str4;
        f fVar = (i11 & 32) != 0 ? new f(null) : qVar;
        Context context = (Context) iVar.G(z.g());
        int i12 = i10 & 14;
        iVar.x(-3686930);
        boolean P = iVar.P(kVar);
        Object y10 = iVar.y();
        if (P || y10 == l0.i.f39065a.a()) {
            y10 = z1.e(new j(), null, 2, null);
            iVar.q(y10);
        }
        iVar.O();
        s0 s0Var = (s0) y10;
        int i13 = i12 | ((i10 >> 9) & 112);
        iVar.x(-3686552);
        boolean P2 = iVar.P(kVar) | iVar.P(str8);
        Object y11 = iVar.y();
        if (P2 || y11 == l0.i.f39065a.a()) {
            iVar.q(n(context, kVar, str8, true));
        }
        iVar.O();
        c0.d(kVar, str8, new g(fVar, context, kVar, str5, str6, str7, str8, s0Var, null), iVar, i13);
        j s10 = s(s0Var);
        iVar.O();
        return s10;
    }

    public static final j s(s0<j> s0Var) {
        return s0Var.getValue();
    }

    public static final Typeface t(Typeface typeface, String str) {
        int i10 = 0;
        boolean H = so.o.H(str, "Italic", false, 2, null);
        boolean H2 = so.o.H(str, "Bold", false, 2, null);
        if (H && H2) {
            i10 = 3;
        } else if (H) {
            i10 = 2;
        } else if (H2) {
            i10 = 1;
        }
        return typeface.getStyle() == i10 ? typeface : Typeface.create(typeface, i10);
    }
}

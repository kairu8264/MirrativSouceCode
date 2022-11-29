package s6;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.View;
import android.widget.ImageView;
import com.mirrativ.llstream.protocol.v1.topic.TopicConstant;
import d7.v;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public class f extends Drawable implements Drawable.Callback, Animatable {
    public boolean A;
    public boolean B;
    public boolean C;
    public final ArrayList<p> D;
    public final ValueAnimator.AnimatorUpdateListener E;
    public x6.b F;
    public String G;
    public s6.b H;
    public x6.a I;
    public s6.a J;
    public s K;
    public boolean L;
    public b7.c M;
    public int N;
    public boolean O;
    public boolean P;
    public boolean Q;
    public boolean R;
    public boolean S;

    /* renamed from: w  reason: collision with root package name */
    public final Matrix f52097w = new Matrix();

    /* renamed from: x  reason: collision with root package name */
    public s6.d f52098x;

    /* renamed from: y  reason: collision with root package name */
    public final f7.e f52099y;

    /* renamed from: z  reason: collision with root package name */
    public float f52100z;

    /* loaded from: classes.dex */
    public class a implements p {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f52101a;

        public a(String str) {
            this.f52101a = str;
        }

        @Override // s6.f.p
        public void a(s6.d dVar) {
            f.this.c0(this.f52101a);
        }
    }

    /* loaded from: classes.dex */
    public class b implements p {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ int f52103a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ int f52104b;

        public b(int i10, int i11) {
            this.f52103a = i10;
            this.f52104b = i11;
        }

        @Override // s6.f.p
        public void a(s6.d dVar) {
            f.this.b0(this.f52103a, this.f52104b);
        }
    }

    /* loaded from: classes.dex */
    public class c implements p {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ float f52106a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ float f52107b;

        public c(float f10, float f11) {
            this.f52106a = f10;
            this.f52107b = f11;
        }

        @Override // s6.f.p
        public void a(s6.d dVar) {
            f.this.d0(this.f52106a, this.f52107b);
        }
    }

    /* loaded from: classes.dex */
    public class d implements p {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ int f52109a;

        public d(int i10) {
            this.f52109a = i10;
        }

        @Override // s6.f.p
        public void a(s6.d dVar) {
            f.this.U(this.f52109a);
        }
    }

    /* loaded from: classes.dex */
    public class e implements p {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ float f52111a;

        public e(float f10) {
            this.f52111a = f10;
        }

        @Override // s6.f.p
        public void a(s6.d dVar) {
            f.this.j0(this.f52111a);
        }
    }

    /* renamed from: s6.f$f  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public class C0796f implements p {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ y6.e f52113a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ Object f52114b;

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ g7.c f52115c;

        public C0796f(y6.e eVar, Object obj, g7.c cVar) {
            this.f52113a = eVar;
            this.f52114b = obj;
            this.f52115c = cVar;
        }

        @Override // s6.f.p
        public void a(s6.d dVar) {
            f.this.d(this.f52113a, this.f52114b, this.f52115c);
        }
    }

    /* loaded from: classes.dex */
    public class g implements ValueAnimator.AnimatorUpdateListener {
        public g() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            if (f.this.M != null) {
                f.this.M.K(f.this.f52099y.k());
            }
        }
    }

    /* loaded from: classes.dex */
    public class h implements p {
        public h() {
        }

        @Override // s6.f.p
        public void a(s6.d dVar) {
            f.this.M();
        }
    }

    /* loaded from: classes.dex */
    public class i implements p {
        public i() {
        }

        @Override // s6.f.p
        public void a(s6.d dVar) {
            f.this.Q();
        }
    }

    /* loaded from: classes.dex */
    public class j implements p {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ int f52120a;

        public j(int i10) {
            this.f52120a = i10;
        }

        @Override // s6.f.p
        public void a(s6.d dVar) {
            f.this.e0(this.f52120a);
        }
    }

    /* loaded from: classes.dex */
    public class k implements p {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ float f52122a;

        public k(float f10) {
            this.f52122a = f10;
        }

        @Override // s6.f.p
        public void a(s6.d dVar) {
            f.this.g0(this.f52122a);
        }
    }

    /* loaded from: classes.dex */
    public class l implements p {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ int f52124a;

        public l(int i10) {
            this.f52124a = i10;
        }

        @Override // s6.f.p
        public void a(s6.d dVar) {
            f.this.Y(this.f52124a);
        }
    }

    /* loaded from: classes.dex */
    public class m implements p {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ float f52126a;

        public m(float f10) {
            this.f52126a = f10;
        }

        @Override // s6.f.p
        public void a(s6.d dVar) {
            f.this.a0(this.f52126a);
        }
    }

    /* loaded from: classes.dex */
    public class n implements p {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f52128a;

        public n(String str) {
            this.f52128a = str;
        }

        @Override // s6.f.p
        public void a(s6.d dVar) {
            f.this.f0(this.f52128a);
        }
    }

    /* loaded from: classes.dex */
    public class o implements p {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f52130a;

        public o(String str) {
            this.f52130a = str;
        }

        @Override // s6.f.p
        public void a(s6.d dVar) {
            f.this.Z(this.f52130a);
        }
    }

    /* loaded from: classes.dex */
    public interface p {
        void a(s6.d dVar);
    }

    public f() {
        f7.e eVar = new f7.e();
        this.f52099y = eVar;
        this.f52100z = 1.0f;
        this.A = true;
        this.B = false;
        this.C = false;
        this.D = new ArrayList<>();
        g gVar = new g();
        this.E = gVar;
        this.N = 255;
        this.R = true;
        this.S = false;
        eVar.addUpdateListener(gVar);
    }

    public float A() {
        return this.f52099y.o();
    }

    public s6.n B() {
        s6.d dVar = this.f52098x;
        if (dVar != null) {
            return dVar.n();
        }
        return null;
    }

    public float C() {
        return this.f52099y.k();
    }

    public int D() {
        return this.f52099y.getRepeatCount();
    }

    @SuppressLint({"WrongConstant"})
    public int E() {
        return this.f52099y.getRepeatMode();
    }

    public float F() {
        return this.f52100z;
    }

    public float G() {
        return this.f52099y.q();
    }

    public s H() {
        return this.K;
    }

    public Typeface I(String str, String str2) {
        x6.a t10 = t();
        if (t10 != null) {
            return t10.b(str, str2);
        }
        return null;
    }

    public boolean J() {
        f7.e eVar = this.f52099y;
        if (eVar == null) {
            return false;
        }
        return eVar.isRunning();
    }

    public boolean K() {
        return this.Q;
    }

    public void L() {
        this.D.clear();
        this.f52099y.s();
    }

    public void M() {
        if (this.M == null) {
            this.D.add(new h());
            return;
        }
        if (e() || D() == 0) {
            this.f52099y.t();
        }
        if (e()) {
            return;
        }
        U((int) (G() < 0.0f ? A() : y()));
        this.f52099y.i();
    }

    public void N() {
        this.f52099y.removeAllListeners();
    }

    public void O(Animator.AnimatorListener animatorListener) {
        this.f52099y.removeListener(animatorListener);
    }

    public List<y6.e> P(y6.e eVar) {
        if (this.M == null) {
            f7.d.c("Cannot resolve KeyPath. Composition is not set yet.");
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList();
        this.M.d(eVar, 0, arrayList, new y6.e(new String[0]));
        return arrayList;
    }

    public void Q() {
        if (this.M == null) {
            this.D.add(new i());
            return;
        }
        if (e() || D() == 0) {
            this.f52099y.x();
        }
        if (e()) {
            return;
        }
        U((int) (G() < 0.0f ? A() : y()));
        this.f52099y.i();
    }

    public void R(boolean z10) {
        this.Q = z10;
    }

    public boolean S(s6.d dVar) {
        if (this.f52098x == dVar) {
            return false;
        }
        this.S = false;
        j();
        this.f52098x = dVar;
        h();
        this.f52099y.z(dVar);
        j0(this.f52099y.getAnimatedFraction());
        n0(this.f52100z);
        Iterator it = new ArrayList(this.D).iterator();
        while (it.hasNext()) {
            p pVar = (p) it.next();
            if (pVar != null) {
                pVar.a(dVar);
            }
            it.remove();
        }
        this.D.clear();
        dVar.w(this.O);
        Drawable.Callback callback = getCallback();
        if (callback instanceof ImageView) {
            ImageView imageView = (ImageView) callback;
            imageView.setImageDrawable(null);
            imageView.setImageDrawable(this);
            return true;
        }
        return true;
    }

    public void T(s6.a aVar) {
        x6.a aVar2 = this.I;
        if (aVar2 != null) {
            aVar2.c(aVar);
        }
    }

    public void U(int i10) {
        if (this.f52098x == null) {
            this.D.add(new d(i10));
        } else {
            this.f52099y.A(i10);
        }
    }

    public void V(boolean z10) {
        this.B = z10;
    }

    public void W(s6.b bVar) {
        this.H = bVar;
        x6.b bVar2 = this.F;
        if (bVar2 != null) {
            bVar2.d(bVar);
        }
    }

    public void X(String str) {
        this.G = str;
    }

    public void Y(int i10) {
        if (this.f52098x == null) {
            this.D.add(new l(i10));
        } else {
            this.f52099y.B(i10 + 0.99f);
        }
    }

    public void Z(String str) {
        s6.d dVar = this.f52098x;
        if (dVar == null) {
            this.D.add(new o(str));
            return;
        }
        y6.h l10 = dVar.l(str);
        if (l10 != null) {
            Y((int) (l10.f61275b + l10.f61276c));
            return;
        }
        throw new IllegalArgumentException("Cannot find marker with name " + str + TopicConstant.SEPARATOR);
    }

    public void a0(float f10) {
        s6.d dVar = this.f52098x;
        if (dVar == null) {
            this.D.add(new m(f10));
        } else {
            Y((int) f7.g.k(dVar.p(), this.f52098x.f(), f10));
        }
    }

    public void b0(int i10, int i11) {
        if (this.f52098x == null) {
            this.D.add(new b(i10, i11));
        } else {
            this.f52099y.C(i10, i11 + 0.99f);
        }
    }

    public void c(Animator.AnimatorListener animatorListener) {
        this.f52099y.addListener(animatorListener);
    }

    public void c0(String str) {
        s6.d dVar = this.f52098x;
        if (dVar == null) {
            this.D.add(new a(str));
            return;
        }
        y6.h l10 = dVar.l(str);
        if (l10 != null) {
            int i10 = (int) l10.f61275b;
            b0(i10, ((int) l10.f61276c) + i10);
            return;
        }
        throw new IllegalArgumentException("Cannot find marker with name " + str + TopicConstant.SEPARATOR);
    }

    public <T> void d(y6.e eVar, T t10, g7.c<T> cVar) {
        b7.c cVar2 = this.M;
        if (cVar2 == null) {
            this.D.add(new C0796f(eVar, t10, cVar));
            return;
        }
        boolean z10 = true;
        if (eVar == y6.e.f61269c) {
            cVar2.a(t10, cVar);
        } else if (eVar.d() != null) {
            eVar.d().a(t10, cVar);
        } else {
            List<y6.e> P = P(eVar);
            for (int i10 = 0; i10 < P.size(); i10++) {
                P.get(i10).d().a(t10, cVar);
            }
            z10 = true ^ P.isEmpty();
        }
        if (z10) {
            invalidateSelf();
            if (t10 == s6.k.E) {
                j0(C());
            }
        }
    }

    public void d0(float f10, float f11) {
        s6.d dVar = this.f52098x;
        if (dVar == null) {
            this.D.add(new c(f10, f11));
        } else {
            b0((int) f7.g.k(dVar.p(), this.f52098x.f(), f10), (int) f7.g.k(this.f52098x.p(), this.f52098x.f(), f11));
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        this.S = false;
        s6.c.a("Drawable#draw");
        if (this.C) {
            try {
                l(canvas);
            } catch (Throwable th2) {
                f7.d.b("Lottie crashed in draw!", th2);
            }
        } else {
            l(canvas);
        }
        s6.c.b("Drawable#draw");
    }

    public final boolean e() {
        return this.A || this.B;
    }

    public void e0(int i10) {
        if (this.f52098x == null) {
            this.D.add(new j(i10));
        } else {
            this.f52099y.D(i10);
        }
    }

    public final float f(Rect rect) {
        return rect.width() / rect.height();
    }

    public void f0(String str) {
        s6.d dVar = this.f52098x;
        if (dVar == null) {
            this.D.add(new n(str));
            return;
        }
        y6.h l10 = dVar.l(str);
        if (l10 != null) {
            e0((int) l10.f61275b);
            return;
        }
        throw new IllegalArgumentException("Cannot find marker with name " + str + TopicConstant.SEPARATOR);
    }

    public final boolean g() {
        s6.d dVar = this.f52098x;
        return dVar == null || getBounds().isEmpty() || f(getBounds()) == f(dVar.b());
    }

    public void g0(float f10) {
        s6.d dVar = this.f52098x;
        if (dVar == null) {
            this.D.add(new k(f10));
        } else {
            e0((int) f7.g.k(dVar.p(), this.f52098x.f(), f10));
        }
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.N;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        s6.d dVar = this.f52098x;
        if (dVar == null) {
            return -1;
        }
        return (int) (dVar.b().height() * F());
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        s6.d dVar = this.f52098x;
        if (dVar == null) {
            return -1;
        }
        return (int) (dVar.b().width() * F());
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    public final void h() {
        b7.c cVar = new b7.c(this, v.b(this.f52098x), this.f52098x.k(), this.f52098x);
        this.M = cVar;
        if (this.P) {
            cVar.I(true);
        }
    }

    public void h0(boolean z10) {
        if (this.P == z10) {
            return;
        }
        this.P = z10;
        b7.c cVar = this.M;
        if (cVar != null) {
            cVar.I(z10);
        }
    }

    public void i() {
        this.D.clear();
        this.f52099y.cancel();
    }

    public void i0(boolean z10) {
        this.O = z10;
        s6.d dVar = this.f52098x;
        if (dVar != null) {
            dVar.w(z10);
        }
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void invalidateDrawable(Drawable drawable) {
        Drawable.Callback callback = getCallback();
        if (callback == null) {
            return;
        }
        callback.invalidateDrawable(this);
    }

    @Override // android.graphics.drawable.Drawable
    public void invalidateSelf() {
        if (this.S) {
            return;
        }
        this.S = true;
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.invalidateDrawable(this);
        }
    }

    @Override // android.graphics.drawable.Animatable
    public boolean isRunning() {
        return J();
    }

    public void j() {
        if (this.f52099y.isRunning()) {
            this.f52099y.cancel();
        }
        this.f52098x = null;
        this.M = null;
        this.F = null;
        this.f52099y.h();
        invalidateSelf();
    }

    public void j0(float f10) {
        if (this.f52098x == null) {
            this.D.add(new e(f10));
            return;
        }
        s6.c.a("Drawable#setProgress");
        this.f52099y.A(this.f52098x.h(f10));
        s6.c.b("Drawable#setProgress");
    }

    public void k(Canvas canvas, Matrix matrix) {
        b7.c cVar = this.M;
        if (cVar == null) {
            return;
        }
        cVar.g(canvas, matrix, this.N);
    }

    public void k0(int i10) {
        this.f52099y.setRepeatCount(i10);
    }

    public final void l(Canvas canvas) {
        if (!g()) {
            m(canvas);
        } else {
            n(canvas);
        }
    }

    public void l0(int i10) {
        this.f52099y.setRepeatMode(i10);
    }

    public final void m(Canvas canvas) {
        float f10;
        b7.c cVar = this.M;
        s6.d dVar = this.f52098x;
        if (cVar == null || dVar == null) {
            return;
        }
        int i10 = -1;
        Rect bounds = getBounds();
        float width = bounds.width() / dVar.b().width();
        float height = bounds.height() / dVar.b().height();
        if (this.R) {
            float min = Math.min(width, height);
            if (min < 1.0f) {
                f10 = 1.0f / min;
                width /= f10;
                height /= f10;
            } else {
                f10 = 1.0f;
            }
            if (f10 > 1.0f) {
                i10 = canvas.save();
                float width2 = bounds.width() / 2.0f;
                float height2 = bounds.height() / 2.0f;
                float f11 = width2 * min;
                float f12 = min * height2;
                canvas.translate(width2 - f11, height2 - f12);
                canvas.scale(f10, f10, f11, f12);
            }
        }
        this.f52097w.reset();
        this.f52097w.preScale(width, height);
        cVar.g(canvas, this.f52097w, this.N);
        if (i10 > 0) {
            canvas.restoreToCount(i10);
        }
    }

    public void m0(boolean z10) {
        this.C = z10;
    }

    public final void n(Canvas canvas) {
        float f10;
        b7.c cVar = this.M;
        s6.d dVar = this.f52098x;
        if (cVar == null || dVar == null) {
            return;
        }
        float f11 = this.f52100z;
        float z10 = z(canvas, dVar);
        if (f11 > z10) {
            f10 = this.f52100z / z10;
        } else {
            z10 = f11;
            f10 = 1.0f;
        }
        int i10 = -1;
        if (f10 > 1.0f) {
            i10 = canvas.save();
            float width = dVar.b().width() / 2.0f;
            float height = dVar.b().height() / 2.0f;
            float f12 = width * z10;
            float f13 = height * z10;
            canvas.translate((F() * width) - f12, (F() * height) - f13);
            canvas.scale(f10, f10, f12, f13);
        }
        this.f52097w.reset();
        this.f52097w.preScale(z10, z10);
        cVar.g(canvas, this.f52097w, this.N);
        if (i10 > 0) {
            canvas.restoreToCount(i10);
        }
    }

    public void n0(float f10) {
        this.f52100z = f10;
    }

    public void o(boolean z10) {
        if (this.L == z10) {
            return;
        }
        if (Build.VERSION.SDK_INT < 19) {
            f7.d.c("Merge paths are not supported pre-Kit Kat.");
            return;
        }
        this.L = z10;
        if (this.f52098x != null) {
            h();
        }
    }

    public void o0(float f10) {
        this.f52099y.E(f10);
    }

    public boolean p() {
        return this.L;
    }

    public void p0(Boolean bool) {
        this.A = bool.booleanValue();
    }

    public void q() {
        this.D.clear();
        this.f52099y.i();
    }

    public void q0(s sVar) {
    }

    public s6.d r() {
        return this.f52098x;
    }

    public boolean r0() {
        return this.f52098x.c().r() > 0;
    }

    public final Context s() {
        Drawable.Callback callback = getCallback();
        if (callback != null && (callback instanceof View)) {
            return ((View) callback).getContext();
        }
        return null;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void scheduleDrawable(Drawable drawable, Runnable runnable, long j10) {
        Drawable.Callback callback = getCallback();
        if (callback == null) {
            return;
        }
        callback.scheduleDrawable(this, runnable, j10);
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i10) {
        this.N = i10;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        f7.d.c("Use addColorFilter instead.");
    }

    @Override // android.graphics.drawable.Animatable
    public void start() {
        Drawable.Callback callback = getCallback();
        if (!(callback instanceof View) || ((View) callback).isInEditMode()) {
            return;
        }
        M();
    }

    @Override // android.graphics.drawable.Animatable
    public void stop() {
        q();
    }

    public final x6.a t() {
        if (getCallback() == null) {
            return null;
        }
        if (this.I == null) {
            this.I = new x6.a(getCallback(), this.J);
        }
        return this.I;
    }

    public int u() {
        return (int) this.f52099y.l();
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        Drawable.Callback callback = getCallback();
        if (callback == null) {
            return;
        }
        callback.unscheduleDrawable(this, runnable);
    }

    public Bitmap v(String str) {
        x6.b w10 = w();
        if (w10 != null) {
            return w10.a(str);
        }
        s6.d dVar = this.f52098x;
        s6.g gVar = dVar == null ? null : dVar.j().get(str);
        if (gVar != null) {
            return gVar.a();
        }
        return null;
    }

    public final x6.b w() {
        if (getCallback() == null) {
            return null;
        }
        x6.b bVar = this.F;
        if (bVar != null && !bVar.b(s())) {
            this.F = null;
        }
        if (this.F == null) {
            this.F = new x6.b(getCallback(), this.G, this.H, this.f52098x.j());
        }
        return this.F;
    }

    public String x() {
        return this.G;
    }

    public float y() {
        return this.f52099y.n();
    }

    public final float z(Canvas canvas, s6.d dVar) {
        return Math.min(canvas.getWidth() / dVar.b().width(), canvas.getHeight() / dVar.b().height());
    }
}

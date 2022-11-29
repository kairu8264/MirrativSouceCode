package com.airbnb.lottie;

import android.animation.Animator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.Callable;
import o3.c0;
import s6.j;
import s6.k;
import s6.l;
import s6.m;
import s6.n;
import s6.o;
import s6.p;
import s6.q;
import s6.r;
import s6.s;

/* loaded from: classes.dex */
public class LottieAnimationView extends AppCompatImageView {
    public static final String P = LottieAnimationView.class.getSimpleName();
    public static final s6.h<Throwable> Q = new a();
    public final s6.f A;
    public boolean B;
    public String C;
    public int D;
    public boolean E;
    public boolean F;
    public boolean G;
    public boolean H;
    public boolean I;
    public boolean J;
    public q K;
    public final Set<j> L;
    public int M;
    public m<s6.d> N;
    public s6.d O;

    /* renamed from: w  reason: collision with root package name */
    public final s6.h<s6.d> f20034w;

    /* renamed from: x  reason: collision with root package name */
    public final s6.h<Throwable> f20035x;

    /* renamed from: y  reason: collision with root package name */
    public s6.h<Throwable> f20036y;

    /* renamed from: z  reason: collision with root package name */
    public int f20037z;

    /* loaded from: classes.dex */
    public class a implements s6.h<Throwable> {
        @Override // s6.h
        /* renamed from: b */
        public void a(Throwable th2) {
            if (f7.h.k(th2)) {
                f7.d.d("Unable to load composition.", th2);
                return;
            }
            throw new IllegalStateException("Unable to parse composition", th2);
        }
    }

    /* loaded from: classes.dex */
    public class b implements s6.h<s6.d> {
        public b() {
        }

        @Override // s6.h
        /* renamed from: b */
        public void a(s6.d dVar) {
            LottieAnimationView.this.setComposition(dVar);
        }
    }

    /* loaded from: classes.dex */
    public class c implements s6.h<Throwable> {
        public c() {
        }

        @Override // s6.h
        /* renamed from: b */
        public void a(Throwable th2) {
            if (LottieAnimationView.this.f20037z != 0) {
                LottieAnimationView lottieAnimationView = LottieAnimationView.this;
                lottieAnimationView.setImageResource(lottieAnimationView.f20037z);
            }
            (LottieAnimationView.this.f20036y == null ? LottieAnimationView.Q : LottieAnimationView.this.f20036y).a(th2);
        }
    }

    /* loaded from: classes.dex */
    public class d implements Callable<l<s6.d>> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ int f20040a;

        public d(int i10) {
            this.f20040a = i10;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a */
        public l<s6.d> call() {
            return LottieAnimationView.this.J ? s6.e.q(LottieAnimationView.this.getContext(), this.f20040a) : s6.e.r(LottieAnimationView.this.getContext(), this.f20040a, null);
        }
    }

    /* loaded from: classes.dex */
    public class e implements Callable<l<s6.d>> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f20042a;

        public e(String str) {
            this.f20042a = str;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a */
        public l<s6.d> call() {
            return LottieAnimationView.this.J ? s6.e.f(LottieAnimationView.this.getContext(), this.f20042a) : s6.e.g(LottieAnimationView.this.getContext(), this.f20042a, null);
        }
    }

    /* loaded from: classes.dex */
    public class f extends g7.c<T> {

        /* renamed from: d  reason: collision with root package name */
        public final /* synthetic */ g7.e f20044d;

        public f(g7.e eVar) {
            this.f20044d = eVar;
        }

        /* JADX WARN: Type inference failed for: r2v1, types: [T, java.lang.Object] */
        @Override // g7.c
        public T a(g7.b<T> bVar) {
            return this.f20044d.a(bVar);
        }
    }

    /* loaded from: classes.dex */
    public static /* synthetic */ class g {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f20046a;

        static {
            int[] iArr = new int[q.values().length];
            f20046a = iArr;
            try {
                iArr[q.HARDWARE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f20046a[q.SOFTWARE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f20046a[q.AUTOMATIC.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* loaded from: classes.dex */
    public static class h extends View.BaseSavedState {
        public static final Parcelable.Creator<h> CREATOR = new a();
        public String A;
        public int B;
        public int C;

        /* renamed from: w  reason: collision with root package name */
        public String f20047w;

        /* renamed from: x  reason: collision with root package name */
        public int f20048x;

        /* renamed from: y  reason: collision with root package name */
        public float f20049y;

        /* renamed from: z  reason: collision with root package name */
        public boolean f20050z;

        /* loaded from: classes.dex */
        public class a implements Parcelable.Creator<h> {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a */
            public h createFromParcel(Parcel parcel) {
                return new h(parcel, null);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b */
            public h[] newArray(int i10) {
                return new h[i10];
            }
        }

        public /* synthetic */ h(Parcel parcel, a aVar) {
            this(parcel);
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            parcel.writeString(this.f20047w);
            parcel.writeFloat(this.f20049y);
            parcel.writeInt(this.f20050z ? 1 : 0);
            parcel.writeString(this.A);
            parcel.writeInt(this.B);
            parcel.writeInt(this.C);
        }

        public h(Parcelable parcelable) {
            super(parcelable);
        }

        public h(Parcel parcel) {
            super(parcel);
            this.f20047w = parcel.readString();
            this.f20049y = parcel.readFloat();
            this.f20050z = parcel.readInt() == 1;
            this.A = parcel.readString();
            this.B = parcel.readInt();
            this.C = parcel.readInt();
        }
    }

    public LottieAnimationView(Context context) {
        super(context);
        this.f20034w = new b();
        this.f20035x = new c();
        this.f20037z = 0;
        this.A = new s6.f();
        this.E = false;
        this.F = false;
        this.G = false;
        this.H = false;
        this.I = false;
        this.J = true;
        this.K = q.AUTOMATIC;
        this.L = new HashSet();
        this.M = 0;
        o(null, o.lottieAnimationViewStyle);
    }

    private void setCompositionTask(m<s6.d> mVar) {
        j();
        i();
        this.N = mVar.f(this.f20034w).e(this.f20035x);
    }

    @Override // android.view.View
    public void buildDrawingCache(boolean z10) {
        s6.c.a("buildDrawingCache");
        this.M++;
        super.buildDrawingCache(z10);
        if (this.M == 1 && getWidth() > 0 && getHeight() > 0 && getLayerType() == 1 && getDrawingCache(z10) == null) {
            setRenderMode(q.HARDWARE);
        }
        this.M--;
        s6.c.b("buildDrawingCache");
    }

    public void e(Animator.AnimatorListener animatorListener) {
        this.A.c(animatorListener);
    }

    public <T> void f(y6.e eVar, T t10, g7.c<T> cVar) {
        this.A.d(eVar, t10, cVar);
    }

    public <T> void g(y6.e eVar, T t10, g7.e<T> eVar2) {
        this.A.d(eVar, t10, new f(eVar2));
    }

    public s6.d getComposition() {
        return this.O;
    }

    public long getDuration() {
        s6.d dVar = this.O;
        if (dVar != null) {
            return dVar.d();
        }
        return 0L;
    }

    public int getFrame() {
        return this.A.u();
    }

    public String getImageAssetsFolder() {
        return this.A.x();
    }

    public float getMaxFrame() {
        return this.A.y();
    }

    public float getMinFrame() {
        return this.A.A();
    }

    public n getPerformanceTracker() {
        return this.A.B();
    }

    public float getProgress() {
        return this.A.C();
    }

    public int getRepeatCount() {
        return this.A.D();
    }

    public int getRepeatMode() {
        return this.A.E();
    }

    public float getScale() {
        return this.A.F();
    }

    public float getSpeed() {
        return this.A.G();
    }

    public void h() {
        this.G = false;
        this.F = false;
        this.E = false;
        this.A.i();
        l();
    }

    public final void i() {
        m<s6.d> mVar = this.N;
        if (mVar != null) {
            mVar.k(this.f20034w);
            this.N.j(this.f20035x);
        }
    }

    @Override // android.widget.ImageView, android.view.View, android.graphics.drawable.Drawable.Callback
    public void invalidateDrawable(Drawable drawable) {
        Drawable drawable2 = getDrawable();
        s6.f fVar = this.A;
        if (drawable2 == fVar) {
            super.invalidateDrawable(fVar);
        } else {
            super.invalidateDrawable(drawable);
        }
    }

    public final void j() {
        this.O = null;
        this.A.j();
    }

    public void k(boolean z10) {
        this.A.o(z10);
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x0044, code lost:
        if (r3 != false) goto L25;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void l() {
        /*
            r5 = this;
            int[] r0 = com.airbnb.lottie.LottieAnimationView.g.f20046a
            s6.q r1 = r5.K
            int r1 = r1.ordinal()
            r0 = r0[r1]
            r1 = 2
            r2 = 1
            if (r0 == r2) goto L46
            if (r0 == r1) goto L13
            r3 = 3
            if (r0 == r3) goto L15
        L13:
            r1 = r2
            goto L46
        L15:
            s6.d r0 = r5.O
            r3 = 0
            if (r0 == 0) goto L27
            boolean r0 = r0.q()
            if (r0 == 0) goto L27
            int r0 = android.os.Build.VERSION.SDK_INT
            r4 = 28
            if (r0 >= r4) goto L27
            goto L44
        L27:
            s6.d r0 = r5.O
            if (r0 == 0) goto L33
            int r0 = r0.m()
            r4 = 4
            if (r0 <= r4) goto L33
            goto L44
        L33:
            int r0 = android.os.Build.VERSION.SDK_INT
            r4 = 21
            if (r0 >= r4) goto L3a
            goto L44
        L3a:
            r4 = 24
            if (r0 == r4) goto L44
            r4 = 25
            if (r0 != r4) goto L43
            goto L44
        L43:
            r3 = r2
        L44:
            if (r3 == 0) goto L13
        L46:
            int r0 = r5.getLayerType()
            if (r1 == r0) goto L50
            r0 = 0
            r5.setLayerType(r1, r0)
        L50:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.airbnb.lottie.LottieAnimationView.l():void");
    }

    public final m<s6.d> m(String str) {
        if (isInEditMode()) {
            return new m<>(new e(str), true);
        }
        return this.J ? s6.e.d(getContext(), str) : s6.e.e(getContext(), str, null);
    }

    public final m<s6.d> n(int i10) {
        if (isInEditMode()) {
            return new m<>(new d(i10), true);
        }
        return this.J ? s6.e.o(getContext(), i10) : s6.e.p(getContext(), i10, null);
    }

    public final void o(AttributeSet attributeSet, int i10) {
        String string;
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, p.C, i10, 0);
        this.J = obtainStyledAttributes.getBoolean(p.E, true);
        int i11 = p.N;
        boolean hasValue = obtainStyledAttributes.hasValue(i11);
        int i12 = p.I;
        boolean hasValue2 = obtainStyledAttributes.hasValue(i12);
        int i13 = p.T;
        boolean hasValue3 = obtainStyledAttributes.hasValue(i13);
        if (hasValue && hasValue2) {
            throw new IllegalArgumentException("lottie_rawRes and lottie_fileName cannot be used at the same time. Please use only one at once.");
        }
        if (hasValue) {
            int resourceId = obtainStyledAttributes.getResourceId(i11, 0);
            if (resourceId != 0) {
                setAnimation(resourceId);
            }
        } else if (hasValue2) {
            String string2 = obtainStyledAttributes.getString(i12);
            if (string2 != null) {
                setAnimation(string2);
            }
        } else if (hasValue3 && (string = obtainStyledAttributes.getString(i13)) != null) {
            setAnimationFromUrl(string);
        }
        setFallbackResource(obtainStyledAttributes.getResourceId(p.H, 0));
        if (obtainStyledAttributes.getBoolean(p.D, false)) {
            this.G = true;
            this.I = true;
        }
        if (obtainStyledAttributes.getBoolean(p.L, false)) {
            this.A.k0(-1);
        }
        int i14 = p.Q;
        if (obtainStyledAttributes.hasValue(i14)) {
            setRepeatMode(obtainStyledAttributes.getInt(i14, 1));
        }
        int i15 = p.P;
        if (obtainStyledAttributes.hasValue(i15)) {
            setRepeatCount(obtainStyledAttributes.getInt(i15, -1));
        }
        int i16 = p.S;
        if (obtainStyledAttributes.hasValue(i16)) {
            setSpeed(obtainStyledAttributes.getFloat(i16, 1.0f));
        }
        setImageAssetsFolder(obtainStyledAttributes.getString(p.K));
        setProgress(obtainStyledAttributes.getFloat(p.M, 0.0f));
        k(obtainStyledAttributes.getBoolean(p.G, false));
        int i17 = p.F;
        if (obtainStyledAttributes.hasValue(i17)) {
            f(new y6.e("**"), k.K, new g7.c(new r(f.a.a(getContext(), obtainStyledAttributes.getResourceId(i17, -1)).getDefaultColor())));
        }
        int i18 = p.R;
        if (obtainStyledAttributes.hasValue(i18)) {
            this.A.n0(obtainStyledAttributes.getFloat(i18, 1.0f));
        }
        int i19 = p.O;
        if (obtainStyledAttributes.hasValue(i19)) {
            q qVar = q.AUTOMATIC;
            int i20 = obtainStyledAttributes.getInt(i19, qVar.ordinal());
            if (i20 >= q.values().length) {
                i20 = qVar.ordinal();
            }
            setRenderMode(q.values()[i20]);
        }
        setIgnoreDisabledSystemAnimations(obtainStyledAttributes.getBoolean(p.J, false));
        obtainStyledAttributes.recycle();
        this.A.p0(Boolean.valueOf(f7.h.f(getContext()) != 0.0f));
        l();
        this.B = true;
    }

    @Override // android.widget.ImageView, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (!isInEditMode() && (this.I || this.G)) {
            r();
            this.I = false;
            this.G = false;
        }
        if (Build.VERSION.SDK_INT < 23) {
            onVisibilityChanged(this, getVisibility());
        }
    }

    @Override // android.widget.ImageView, android.view.View
    public void onDetachedFromWindow() {
        if (p()) {
            h();
            this.G = true;
        }
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof h)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        h hVar = (h) parcelable;
        super.onRestoreInstanceState(hVar.getSuperState());
        String str = hVar.f20047w;
        this.C = str;
        if (!TextUtils.isEmpty(str)) {
            setAnimation(this.C);
        }
        int i10 = hVar.f20048x;
        this.D = i10;
        if (i10 != 0) {
            setAnimation(i10);
        }
        setProgress(hVar.f20049y);
        if (hVar.f20050z) {
            r();
        }
        this.A.X(hVar.A);
        setRepeatMode(hVar.B);
        setRepeatCount(hVar.C);
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        h hVar = new h(super.onSaveInstanceState());
        hVar.f20047w = this.C;
        hVar.f20048x = this.D;
        hVar.f20049y = this.A.C();
        hVar.f20050z = this.A.J() || (!c0.U(this) && this.G);
        hVar.A = this.A.x();
        hVar.B = this.A.E();
        hVar.C = this.A.D();
        return hVar;
    }

    @Override // android.view.View
    public void onVisibilityChanged(View view, int i10) {
        if (this.B) {
            if (isShown()) {
                if (this.F) {
                    u();
                } else if (this.E) {
                    r();
                }
                this.F = false;
                this.E = false;
            } else if (p()) {
                q();
                this.F = true;
            }
        }
    }

    public boolean p() {
        return this.A.J();
    }

    public void q() {
        this.I = false;
        this.G = false;
        this.F = false;
        this.E = false;
        this.A.L();
        l();
    }

    public void r() {
        if (isShown()) {
            this.A.M();
            l();
            return;
        }
        this.E = true;
    }

    public void s() {
        this.A.N();
    }

    public void setAnimation(int i10) {
        this.D = i10;
        this.C = null;
        setCompositionTask(n(i10));
    }

    @Deprecated
    public void setAnimationFromJson(String str) {
        w(str, null);
    }

    public void setAnimationFromUrl(String str) {
        setCompositionTask(this.J ? s6.e.s(getContext(), str) : s6.e.t(getContext(), str, null));
    }

    public void setApplyingOpacityToLayersEnabled(boolean z10) {
        this.A.R(z10);
    }

    public void setCacheComposition(boolean z10) {
        this.J = z10;
    }

    public void setComposition(s6.d dVar) {
        if (s6.c.f52050a) {
            String str = P;
            Log.v(str, "Set Composition \n" + dVar);
        }
        this.A.setCallback(this);
        this.O = dVar;
        this.H = true;
        boolean S = this.A.S(dVar);
        this.H = false;
        l();
        if (getDrawable() != this.A || S) {
            if (!S) {
                x();
            }
            onVisibilityChanged(this, getVisibility());
            requestLayout();
            for (j jVar : this.L) {
                jVar.a(dVar);
            }
        }
    }

    public void setFailureListener(s6.h<Throwable> hVar) {
        this.f20036y = hVar;
    }

    public void setFallbackResource(int i10) {
        this.f20037z = i10;
    }

    public void setFontAssetDelegate(s6.a aVar) {
        this.A.T(aVar);
    }

    public void setFrame(int i10) {
        this.A.U(i10);
    }

    public void setIgnoreDisabledSystemAnimations(boolean z10) {
        this.A.V(z10);
    }

    public void setImageAssetDelegate(s6.b bVar) {
        this.A.W(bVar);
    }

    public void setImageAssetsFolder(String str) {
        this.A.X(str);
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageBitmap(Bitmap bitmap) {
        i();
        super.setImageBitmap(bitmap);
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        i();
        super.setImageDrawable(drawable);
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageResource(int i10) {
        i();
        super.setImageResource(i10);
    }

    public void setMaxFrame(int i10) {
        this.A.Y(i10);
    }

    public void setMaxProgress(float f10) {
        this.A.a0(f10);
    }

    public void setMinAndMaxFrame(String str) {
        this.A.c0(str);
    }

    public void setMinFrame(int i10) {
        this.A.e0(i10);
    }

    public void setMinProgress(float f10) {
        this.A.g0(f10);
    }

    public void setOutlineMasksAndMattes(boolean z10) {
        this.A.h0(z10);
    }

    public void setPerformanceTrackingEnabled(boolean z10) {
        this.A.i0(z10);
    }

    public void setProgress(float f10) {
        this.A.j0(f10);
    }

    public void setRenderMode(q qVar) {
        this.K = qVar;
        l();
    }

    public void setRepeatCount(int i10) {
        this.A.k0(i10);
    }

    public void setRepeatMode(int i10) {
        this.A.l0(i10);
    }

    public void setSafeMode(boolean z10) {
        this.A.m0(z10);
    }

    public void setScale(float f10) {
        this.A.n0(f10);
        if (getDrawable() == this.A) {
            x();
        }
    }

    public void setSpeed(float f10) {
        this.A.o0(f10);
    }

    public void setTextDelegate(s sVar) {
        this.A.q0(sVar);
    }

    public void t(Animator.AnimatorListener animatorListener) {
        this.A.O(animatorListener);
    }

    public void u() {
        if (isShown()) {
            this.A.Q();
            l();
            return;
        }
        this.E = false;
        this.F = true;
    }

    @Override // android.view.View
    public void unscheduleDrawable(Drawable drawable) {
        s6.f fVar;
        if (!this.H && drawable == (fVar = this.A) && fVar.J()) {
            q();
        } else if (!this.H && (drawable instanceof s6.f)) {
            s6.f fVar2 = (s6.f) drawable;
            if (fVar2.J()) {
                fVar2.L();
            }
        }
        super.unscheduleDrawable(drawable);
    }

    public void v(InputStream inputStream, String str) {
        setCompositionTask(s6.e.h(inputStream, str));
    }

    public void w(String str, String str2) {
        v(new ByteArrayInputStream(str.getBytes()), str2);
    }

    public final void x() {
        boolean p10 = p();
        setImageDrawable(null);
        setImageDrawable(this.A);
        if (p10) {
            this.A.Q();
        }
    }

    public void y(int i10, int i11) {
        this.A.b0(i10, i11);
    }

    public void z(float f10, float f11) {
        this.A.d0(f10, f11);
    }

    public void setMaxFrame(String str) {
        this.A.Z(str);
    }

    public void setMinFrame(String str) {
        this.A.f0(str);
    }

    public void setAnimation(String str) {
        this.C = str;
        this.D = 0;
        setCompositionTask(m(str));
    }

    public LottieAnimationView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f20034w = new b();
        this.f20035x = new c();
        this.f20037z = 0;
        this.A = new s6.f();
        this.E = false;
        this.F = false;
        this.G = false;
        this.H = false;
        this.I = false;
        this.J = true;
        this.K = q.AUTOMATIC;
        this.L = new HashSet();
        this.M = 0;
        o(attributeSet, o.lottieAnimationViewStyle);
    }
}

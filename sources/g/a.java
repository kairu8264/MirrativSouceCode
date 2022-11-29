package g;

import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.StateSet;
import androidx.appcompat.widget.ResourceManagerInternal;
import e3.i;
import g.b;
import g.d;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import s.h;

@SuppressLint({"RestrictedAPI"})
/* loaded from: classes.dex */
public class a extends g.d implements g3.b {
    public static final String P = a.class.getSimpleName();
    public c K;
    public g L;
    public int M;
    public int N;
    public boolean O;

    /* loaded from: classes.dex */
    public static class b extends g {

        /* renamed from: a  reason: collision with root package name */
        public final Animatable f32132a;

        public b(Animatable animatable) {
            super();
            this.f32132a = animatable;
        }

        @Override // g.a.g
        public void c() {
            this.f32132a.start();
        }

        @Override // g.a.g
        public void d() {
            this.f32132a.stop();
        }
    }

    /* loaded from: classes.dex */
    public static class c extends d.a {
        public s.e<Long> K;
        public h<Integer> L;

        public c(c cVar, a aVar, Resources resources) {
            super(cVar, aVar, resources);
            if (cVar != null) {
                this.K = cVar.K;
                this.L = cVar.L;
                return;
            }
            this.K = new s.e<>();
            this.L = new h<>();
        }

        public static long D(int i10, int i11) {
            return i11 | (i10 << 32);
        }

        public int B(int[] iArr, Drawable drawable, int i10) {
            int z10 = super.z(iArr, drawable);
            this.L.n(z10, Integer.valueOf(i10));
            return z10;
        }

        public int C(int i10, int i11, Drawable drawable, boolean z10) {
            int a10 = super.a(drawable);
            long D = D(i10, i11);
            long j10 = z10 ? 8589934592L : 0L;
            long j11 = a10;
            this.K.b(D, Long.valueOf(j11 | j10));
            if (z10) {
                this.K.b(D(i11, i10), Long.valueOf(4294967296L | j11 | j10));
            }
            return a10;
        }

        public int E(int i10) {
            if (i10 < 0) {
                return 0;
            }
            return this.L.i(i10, 0).intValue();
        }

        public int F(int[] iArr) {
            int A = super.A(iArr);
            return A >= 0 ? A : super.A(StateSet.WILD_CARD);
        }

        public int G(int i10, int i11) {
            return (int) this.K.i(D(i10, i11), -1L).longValue();
        }

        public boolean H(int i10, int i11) {
            return (this.K.i(D(i10, i11), -1L).longValue() & 4294967296L) != 0;
        }

        public boolean I(int i10, int i11) {
            return (this.K.i(D(i10, i11), -1L).longValue() & 8589934592L) != 0;
        }

        @Override // g.d.a, android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable() {
            return new a(this, null);
        }

        @Override // g.d.a, g.b.d
        public void r() {
            this.K = this.K.clone();
            this.L = this.L.clone();
        }

        @Override // g.d.a, android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources) {
            return new a(this, resources);
        }
    }

    /* loaded from: classes.dex */
    public static class d extends g {

        /* renamed from: a  reason: collision with root package name */
        public final h5.c f32133a;

        public d(h5.c cVar) {
            super();
            this.f32133a = cVar;
        }

        @Override // g.a.g
        public void c() {
            this.f32133a.start();
        }

        @Override // g.a.g
        public void d() {
            this.f32133a.stop();
        }
    }

    /* loaded from: classes.dex */
    public static class e extends g {

        /* renamed from: a  reason: collision with root package name */
        public final ObjectAnimator f32134a;

        /* renamed from: b  reason: collision with root package name */
        public final boolean f32135b;

        public e(AnimationDrawable animationDrawable, boolean z10, boolean z11) {
            super();
            int numberOfFrames = animationDrawable.getNumberOfFrames();
            int i10 = z10 ? numberOfFrames - 1 : 0;
            int i11 = z10 ? 0 : numberOfFrames - 1;
            f fVar = new f(animationDrawable, z10);
            ObjectAnimator ofInt = ObjectAnimator.ofInt(animationDrawable, "currentIndex", i10, i11);
            if (Build.VERSION.SDK_INT >= 18) {
                h.b.a(ofInt, true);
            }
            ofInt.setDuration(fVar.a());
            ofInt.setInterpolator(fVar);
            this.f32135b = z11;
            this.f32134a = ofInt;
        }

        @Override // g.a.g
        public boolean a() {
            return this.f32135b;
        }

        @Override // g.a.g
        public void b() {
            this.f32134a.reverse();
        }

        @Override // g.a.g
        public void c() {
            this.f32134a.start();
        }

        @Override // g.a.g
        public void d() {
            this.f32134a.cancel();
        }
    }

    /* loaded from: classes.dex */
    public static class f implements TimeInterpolator {

        /* renamed from: a  reason: collision with root package name */
        public int[] f32136a;

        /* renamed from: b  reason: collision with root package name */
        public int f32137b;

        /* renamed from: c  reason: collision with root package name */
        public int f32138c;

        public f(AnimationDrawable animationDrawable, boolean z10) {
            b(animationDrawable, z10);
        }

        public int a() {
            return this.f32138c;
        }

        public int b(AnimationDrawable animationDrawable, boolean z10) {
            int numberOfFrames = animationDrawable.getNumberOfFrames();
            this.f32137b = numberOfFrames;
            int[] iArr = this.f32136a;
            if (iArr == null || iArr.length < numberOfFrames) {
                this.f32136a = new int[numberOfFrames];
            }
            int[] iArr2 = this.f32136a;
            int i10 = 0;
            for (int i11 = 0; i11 < numberOfFrames; i11++) {
                int duration = animationDrawable.getDuration(z10 ? (numberOfFrames - i11) - 1 : i11);
                iArr2[i11] = duration;
                i10 += duration;
            }
            this.f32138c = i10;
            return i10;
        }

        @Override // android.animation.TimeInterpolator
        public float getInterpolation(float f10) {
            int i10 = (int) ((f10 * this.f32138c) + 0.5f);
            int i11 = this.f32137b;
            int[] iArr = this.f32136a;
            int i12 = 0;
            while (i12 < i11 && i10 >= iArr[i12]) {
                i10 -= iArr[i12];
                i12++;
            }
            return (i12 / i11) + (i12 < i11 ? i10 / this.f32138c : 0.0f);
        }
    }

    /* loaded from: classes.dex */
    public static abstract class g {
        public g() {
        }

        public boolean a() {
            return false;
        }

        public void b() {
        }

        public abstract void c();

        public abstract void d();
    }

    public a() {
        this(null, null);
    }

    public static a m(Context context, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws IOException, XmlPullParserException {
        String name = xmlPullParser.getName();
        if (name.equals("animated-selector")) {
            a aVar = new a();
            aVar.n(context, resources, xmlPullParser, attributeSet, theme);
            return aVar;
        }
        throw new XmlPullParserException(xmlPullParser.getPositionDescription() + ": invalid animated-selector tag " + name);
    }

    @Override // g.d, g.b, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void applyTheme(Resources.Theme theme) {
        super.applyTheme(theme);
    }

    @Override // g.b, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ boolean canApplyTheme() {
        return super.canApplyTheme();
    }

    @Override // g.b, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void draw(Canvas canvas) {
        super.draw(canvas);
    }

    @Override // g.b, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int getAlpha() {
        return super.getAlpha();
    }

    @Override // g.b, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int getChangingConfigurations() {
        return super.getChangingConfigurations();
    }

    @Override // g.b, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ Drawable getCurrent() {
        return super.getCurrent();
    }

    @Override // g.b, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void getHotspotBounds(Rect rect) {
        super.getHotspotBounds(rect);
    }

    @Override // g.b, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int getIntrinsicHeight() {
        return super.getIntrinsicHeight();
    }

    @Override // g.b, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int getIntrinsicWidth() {
        return super.getIntrinsicWidth();
    }

    @Override // g.b, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int getMinimumHeight() {
        return super.getMinimumHeight();
    }

    @Override // g.b, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int getMinimumWidth() {
        return super.getMinimumWidth();
    }

    @Override // g.b, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int getOpacity() {
        return super.getOpacity();
    }

    @Override // g.b, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void getOutline(Outline outline) {
        super.getOutline(outline);
    }

    @Override // g.b, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ boolean getPadding(Rect rect) {
        return super.getPadding(rect);
    }

    @Override // g.d, g.b
    public void h(b.d dVar) {
        super.h(dVar);
        if (dVar instanceof c) {
            this.K = (c) dVar;
        }
    }

    @Override // g.b, android.graphics.drawable.Drawable.Callback
    public /* bridge */ /* synthetic */ void invalidateDrawable(Drawable drawable) {
        super.invalidateDrawable(drawable);
    }

    @Override // g.b, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ boolean isAutoMirrored() {
        return super.isAutoMirrored();
    }

    @Override // g.d, android.graphics.drawable.Drawable
    public boolean isStateful() {
        return true;
    }

    @Override // g.b, android.graphics.drawable.Drawable
    public void jumpToCurrentState() {
        super.jumpToCurrentState();
        g gVar = this.L;
        if (gVar != null) {
            gVar.d();
            this.L = null;
            g(this.M);
            this.M = -1;
            this.N = -1;
        }
    }

    @Override // g.d
    /* renamed from: l */
    public c j() {
        return new c(this.K, this, null);
    }

    @Override // g.d, g.b, android.graphics.drawable.Drawable
    public Drawable mutate() {
        if (!this.O && super.mutate() == this) {
            this.K.r();
            this.O = true;
        }
        return this;
    }

    public void n(Context context, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        TypedArray k10 = i.k(resources, theme, attributeSet, h.e.f33693a);
        setVisible(k10.getBoolean(h.e.f33695c, true), true);
        t(k10);
        i(resources);
        k10.recycle();
        o(context, resources, xmlPullParser, attributeSet, theme);
        p();
    }

    public final void o(Context context, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        int depth = xmlPullParser.getDepth() + 1;
        while (true) {
            int next = xmlPullParser.next();
            if (next == 1) {
                return;
            }
            int depth2 = xmlPullParser.getDepth();
            if (depth2 < depth && next == 3) {
                return;
            }
            if (next == 2 && depth2 <= depth) {
                if (xmlPullParser.getName().equals("item")) {
                    q(context, resources, xmlPullParser, attributeSet, theme);
                } else if (xmlPullParser.getName().equals("transition")) {
                    r(context, resources, xmlPullParser, attributeSet, theme);
                }
            }
        }
    }

    @Override // g.b, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ boolean onLayoutDirectionChanged(int i10) {
        return super.onLayoutDirectionChanged(i10);
    }

    @Override // g.d, g.b, android.graphics.drawable.Drawable
    public boolean onStateChange(int[] iArr) {
        int F = this.K.F(iArr);
        boolean z10 = F != c() && (s(F) || g(F));
        Drawable current = getCurrent();
        return current != null ? z10 | current.setState(iArr) : z10;
    }

    public final void p() {
        onStateChange(getState());
    }

    public final int q(Context context, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        int next;
        TypedArray k10 = i.k(resources, theme, attributeSet, h.e.f33700h);
        int resourceId = k10.getResourceId(h.e.f33701i, 0);
        int resourceId2 = k10.getResourceId(h.e.f33702j, -1);
        Drawable drawable = resourceId2 > 0 ? ResourceManagerInternal.get().getDrawable(context, resourceId2) : null;
        k10.recycle();
        int[] k11 = k(attributeSet);
        if (drawable == null) {
            do {
                next = xmlPullParser.next();
            } while (next == 4);
            if (next == 2) {
                if (xmlPullParser.getName().equals("vector")) {
                    drawable = h5.i.c(resources, xmlPullParser, attributeSet, theme);
                } else if (Build.VERSION.SDK_INT >= 21) {
                    drawable = h.c.a(resources, xmlPullParser, attributeSet, theme);
                } else {
                    drawable = Drawable.createFromXmlInner(resources, xmlPullParser, attributeSet);
                }
            } else {
                throw new XmlPullParserException(xmlPullParser.getPositionDescription() + ": <item> tag requires a 'drawable' attribute or child tag defining a drawable");
            }
        }
        if (drawable != null) {
            return this.K.B(k11, drawable, resourceId);
        }
        throw new XmlPullParserException(xmlPullParser.getPositionDescription() + ": <item> tag requires a 'drawable' attribute or child tag defining a drawable");
    }

    public final int r(Context context, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        int next;
        TypedArray k10 = i.k(resources, theme, attributeSet, h.e.f33703k);
        int resourceId = k10.getResourceId(h.e.f33706n, -1);
        int resourceId2 = k10.getResourceId(h.e.f33705m, -1);
        int resourceId3 = k10.getResourceId(h.e.f33704l, -1);
        Drawable drawable = resourceId3 > 0 ? ResourceManagerInternal.get().getDrawable(context, resourceId3) : null;
        boolean z10 = k10.getBoolean(h.e.f33707o, false);
        k10.recycle();
        if (drawable == null) {
            do {
                next = xmlPullParser.next();
            } while (next == 4);
            if (next == 2) {
                if (xmlPullParser.getName().equals("animated-vector")) {
                    drawable = h5.c.a(context, resources, xmlPullParser, attributeSet, theme);
                } else if (Build.VERSION.SDK_INT >= 21) {
                    drawable = h.c.a(resources, xmlPullParser, attributeSet, theme);
                } else {
                    drawable = Drawable.createFromXmlInner(resources, xmlPullParser, attributeSet);
                }
            } else {
                throw new XmlPullParserException(xmlPullParser.getPositionDescription() + ": <transition> tag requires a 'drawable' attribute or child tag defining a drawable");
            }
        }
        if (drawable == null) {
            throw new XmlPullParserException(xmlPullParser.getPositionDescription() + ": <transition> tag requires a 'drawable' attribute or child tag defining a drawable");
        } else if (resourceId != -1 && resourceId2 != -1) {
            return this.K.C(resourceId, resourceId2, drawable, z10);
        } else {
            throw new XmlPullParserException(xmlPullParser.getPositionDescription() + ": <transition> tag requires 'fromId' & 'toId' attributes");
        }
    }

    public final boolean s(int i10) {
        int c10;
        int G;
        g bVar;
        g gVar = this.L;
        if (gVar != null) {
            if (i10 == this.M) {
                return true;
            }
            if (i10 == this.N && gVar.a()) {
                gVar.b();
                this.M = this.N;
                this.N = i10;
                return true;
            }
            c10 = this.M;
            gVar.d();
        } else {
            c10 = c();
        }
        this.L = null;
        this.N = -1;
        this.M = -1;
        c cVar = this.K;
        int E = cVar.E(c10);
        int E2 = cVar.E(i10);
        if (E2 == 0 || E == 0 || (G = cVar.G(E, E2)) < 0) {
            return false;
        }
        boolean I = cVar.I(E, E2);
        g(G);
        Drawable current = getCurrent();
        if (current instanceof AnimationDrawable) {
            bVar = new e((AnimationDrawable) current, cVar.H(E, E2), I);
        } else if (current instanceof h5.c) {
            bVar = new d((h5.c) current);
        } else {
            if (current instanceof Animatable) {
                bVar = new b((Animatable) current);
            }
            return false;
        }
        bVar.c();
        this.L = bVar;
        this.N = c10;
        this.M = i10;
        return true;
    }

    @Override // g.b, android.graphics.drawable.Drawable.Callback
    public /* bridge */ /* synthetic */ void scheduleDrawable(Drawable drawable, Runnable runnable, long j10) {
        super.scheduleDrawable(drawable, runnable, j10);
    }

    @Override // g.b, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setAlpha(int i10) {
        super.setAlpha(i10);
    }

    @Override // g.b, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setAutoMirrored(boolean z10) {
        super.setAutoMirrored(z10);
    }

    @Override // g.b, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setColorFilter(ColorFilter colorFilter) {
        super.setColorFilter(colorFilter);
    }

    @Override // g.b, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setDither(boolean z10) {
        super.setDither(z10);
    }

    @Override // g.b, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setHotspot(float f10, float f11) {
        super.setHotspot(f10, f11);
    }

    @Override // g.b, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setHotspotBounds(int i10, int i11, int i12, int i13) {
        super.setHotspotBounds(i10, i11, i12, i13);
    }

    @Override // g.b, android.graphics.drawable.Drawable, g3.b
    public /* bridge */ /* synthetic */ void setTintList(ColorStateList colorStateList) {
        super.setTintList(colorStateList);
    }

    @Override // g.b, android.graphics.drawable.Drawable, g3.b
    public /* bridge */ /* synthetic */ void setTintMode(PorterDuff.Mode mode) {
        super.setTintMode(mode);
    }

    @Override // g.b, android.graphics.drawable.Drawable
    public boolean setVisible(boolean z10, boolean z11) {
        boolean visible = super.setVisible(z10, z11);
        g gVar = this.L;
        if (gVar != null && (visible || z11)) {
            if (z10) {
                gVar.c();
            } else {
                jumpToCurrentState();
            }
        }
        return visible;
    }

    public final void t(TypedArray typedArray) {
        c cVar = this.K;
        if (Build.VERSION.SDK_INT >= 21) {
            cVar.f32148d |= h.c.b(typedArray);
        }
        cVar.x(typedArray.getBoolean(h.e.f33696d, cVar.f32153i));
        cVar.t(typedArray.getBoolean(h.e.f33697e, cVar.f32156l));
        cVar.u(typedArray.getInt(h.e.f33698f, cVar.A));
        cVar.v(typedArray.getInt(h.e.f33699g, cVar.B));
        setDither(typedArray.getBoolean(h.e.f33694b, cVar.f32168x));
    }

    @Override // g.b, android.graphics.drawable.Drawable.Callback
    public /* bridge */ /* synthetic */ void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        super.unscheduleDrawable(drawable, runnable);
    }

    public a(c cVar, Resources resources) {
        super(null);
        this.M = -1;
        this.N = -1;
        h(new c(cVar, this, resources));
        onStateChange(getState());
        jumpToCurrentState();
    }
}

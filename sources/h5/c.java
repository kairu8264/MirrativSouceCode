package h5;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ArgbEvaluator;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.AnimatedVectorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import java.io.IOException;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes.dex */
public class c extends h implements Animatable {
    public Animator.AnimatorListener A;
    public ArrayList<h5.b> B;
    public final Drawable.Callback C;

    /* renamed from: x  reason: collision with root package name */
    public b f34453x;

    /* renamed from: y  reason: collision with root package name */
    public Context f34454y;

    /* renamed from: z  reason: collision with root package name */
    public ArgbEvaluator f34455z;

    /* loaded from: classes.dex */
    public class a implements Drawable.Callback {
        public a() {
        }

        @Override // android.graphics.drawable.Drawable.Callback
        public void invalidateDrawable(Drawable drawable) {
            c.this.invalidateSelf();
        }

        @Override // android.graphics.drawable.Drawable.Callback
        public void scheduleDrawable(Drawable drawable, Runnable runnable, long j10) {
            c.this.scheduleSelf(runnable, j10);
        }

        @Override // android.graphics.drawable.Drawable.Callback
        public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
            c.this.unscheduleSelf(runnable);
        }
    }

    /* loaded from: classes.dex */
    public static class b extends Drawable.ConstantState {

        /* renamed from: a  reason: collision with root package name */
        public int f34457a;

        /* renamed from: b  reason: collision with root package name */
        public i f34458b;

        /* renamed from: c  reason: collision with root package name */
        public AnimatorSet f34459c;

        /* renamed from: d  reason: collision with root package name */
        public ArrayList<Animator> f34460d;

        /* renamed from: e  reason: collision with root package name */
        public s.a<Animator, String> f34461e;

        public b(Context context, b bVar, Drawable.Callback callback, Resources resources) {
            if (bVar != null) {
                this.f34457a = bVar.f34457a;
                i iVar = bVar.f34458b;
                if (iVar != null) {
                    Drawable.ConstantState constantState = iVar.getConstantState();
                    if (resources != null) {
                        this.f34458b = (i) constantState.newDrawable(resources);
                    } else {
                        this.f34458b = (i) constantState.newDrawable();
                    }
                    i iVar2 = (i) this.f34458b.mutate();
                    this.f34458b = iVar2;
                    iVar2.setCallback(callback);
                    this.f34458b.setBounds(bVar.f34458b.getBounds());
                    this.f34458b.h(false);
                }
                ArrayList<Animator> arrayList = bVar.f34460d;
                if (arrayList != null) {
                    int size = arrayList.size();
                    this.f34460d = new ArrayList<>(size);
                    this.f34461e = new s.a<>(size);
                    for (int i10 = 0; i10 < size; i10++) {
                        Animator animator = bVar.f34460d.get(i10);
                        Animator clone = animator.clone();
                        String str = bVar.f34461e.get(animator);
                        clone.setTarget(this.f34458b.d(str));
                        this.f34460d.add(clone);
                        this.f34461e.put(clone, str);
                    }
                    a();
                }
            }
        }

        public void a() {
            if (this.f34459c == null) {
                this.f34459c = new AnimatorSet();
            }
            this.f34459c.playTogether(this.f34460d);
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return this.f34457a;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable() {
            throw new IllegalStateException("No constant state support for SDK < 24.");
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources) {
            throw new IllegalStateException("No constant state support for SDK < 24.");
        }
    }

    public c() {
        this(null, null, null);
    }

    public static c a(Context context, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        c cVar = new c(context);
        cVar.inflate(resources, xmlPullParser, attributeSet, theme);
        return cVar;
    }

    @Override // h5.h, android.graphics.drawable.Drawable
    public void applyTheme(Resources.Theme theme) {
        Drawable drawable = this.f34467w;
        if (drawable != null) {
            g3.a.a(drawable, theme);
        }
    }

    public final void b(String str, Animator animator) {
        animator.setTarget(this.f34453x.f34458b.d(str));
        if (Build.VERSION.SDK_INT < 21) {
            c(animator);
        }
        b bVar = this.f34453x;
        if (bVar.f34460d == null) {
            bVar.f34460d = new ArrayList<>();
            this.f34453x.f34461e = new s.a<>();
        }
        this.f34453x.f34460d.add(animator);
        this.f34453x.f34461e.put(animator, str);
    }

    public final void c(Animator animator) {
        ArrayList<Animator> childAnimations;
        if ((animator instanceof AnimatorSet) && (childAnimations = ((AnimatorSet) animator).getChildAnimations()) != null) {
            for (int i10 = 0; i10 < childAnimations.size(); i10++) {
                c(childAnimations.get(i10));
            }
        }
        if (animator instanceof ObjectAnimator) {
            ObjectAnimator objectAnimator = (ObjectAnimator) animator;
            String propertyName = objectAnimator.getPropertyName();
            if ("fillColor".equals(propertyName) || "strokeColor".equals(propertyName)) {
                if (this.f34455z == null) {
                    this.f34455z = new ArgbEvaluator();
                }
                objectAnimator.setEvaluator(this.f34455z);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean canApplyTheme() {
        Drawable drawable = this.f34467w;
        if (drawable != null) {
            return g3.a.b(drawable);
        }
        return false;
    }

    @Override // h5.h, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void clearColorFilter() {
        super.clearColorFilter();
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        Drawable drawable = this.f34467w;
        if (drawable != null) {
            drawable.draw(canvas);
            return;
        }
        this.f34453x.f34458b.draw(canvas);
        if (this.f34453x.f34459c.isStarted()) {
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        Drawable drawable = this.f34467w;
        if (drawable != null) {
            return g3.a.d(drawable);
        }
        return this.f34453x.f34458b.getAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public int getChangingConfigurations() {
        Drawable drawable = this.f34467w;
        if (drawable != null) {
            return drawable.getChangingConfigurations();
        }
        return super.getChangingConfigurations() | this.f34453x.f34457a;
    }

    @Override // android.graphics.drawable.Drawable
    public ColorFilter getColorFilter() {
        Drawable drawable = this.f34467w;
        if (drawable != null) {
            return g3.a.e(drawable);
        }
        return this.f34453x.f34458b.getColorFilter();
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable.ConstantState getConstantState() {
        if (this.f34467w == null || Build.VERSION.SDK_INT < 24) {
            return null;
        }
        return new C0434c(this.f34467w.getConstantState());
    }

    @Override // h5.h, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ Drawable getCurrent() {
        return super.getCurrent();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        Drawable drawable = this.f34467w;
        if (drawable != null) {
            return drawable.getIntrinsicHeight();
        }
        return this.f34453x.f34458b.getIntrinsicHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        Drawable drawable = this.f34467w;
        if (drawable != null) {
            return drawable.getIntrinsicWidth();
        }
        return this.f34453x.f34458b.getIntrinsicWidth();
    }

    @Override // h5.h, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int getMinimumHeight() {
        return super.getMinimumHeight();
    }

    @Override // h5.h, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int getMinimumWidth() {
        return super.getMinimumWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        Drawable drawable = this.f34467w;
        if (drawable != null) {
            return drawable.getOpacity();
        }
        return this.f34453x.f34458b.getOpacity();
    }

    @Override // h5.h, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ boolean getPadding(Rect rect) {
        return super.getPadding(rect);
    }

    @Override // h5.h, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int[] getState() {
        return super.getState();
    }

    @Override // h5.h, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ Region getTransparentRegion() {
        return super.getTransparentRegion();
    }

    @Override // android.graphics.drawable.Drawable
    public void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        Drawable drawable = this.f34467w;
        if (drawable != null) {
            g3.a.g(drawable, resources, xmlPullParser, attributeSet, theme);
            return;
        }
        int eventType = xmlPullParser.getEventType();
        int depth = xmlPullParser.getDepth() + 1;
        while (eventType != 1 && (xmlPullParser.getDepth() >= depth || eventType != 3)) {
            if (eventType == 2) {
                String name = xmlPullParser.getName();
                if ("animated-vector".equals(name)) {
                    TypedArray k10 = e3.i.k(resources, theme, attributeSet, h5.a.f34445e);
                    int resourceId = k10.getResourceId(0, 0);
                    if (resourceId != 0) {
                        i b10 = i.b(resources, resourceId, theme);
                        b10.h(false);
                        b10.setCallback(this.C);
                        i iVar = this.f34453x.f34458b;
                        if (iVar != null) {
                            iVar.setCallback(null);
                        }
                        this.f34453x.f34458b = b10;
                    }
                    k10.recycle();
                } else if ("target".equals(name)) {
                    TypedArray obtainAttributes = resources.obtainAttributes(attributeSet, h5.a.f34446f);
                    String string = obtainAttributes.getString(0);
                    int resourceId2 = obtainAttributes.getResourceId(1, 0);
                    if (resourceId2 != 0) {
                        Context context = this.f34454y;
                        if (context != null) {
                            b(string, e.i(context, resourceId2));
                        } else {
                            obtainAttributes.recycle();
                            throw new IllegalStateException("Context can't be null when inflating animators");
                        }
                    }
                    obtainAttributes.recycle();
                } else {
                    continue;
                }
            }
            eventType = xmlPullParser.next();
        }
        this.f34453x.a();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isAutoMirrored() {
        Drawable drawable = this.f34467w;
        if (drawable != null) {
            return g3.a.h(drawable);
        }
        return this.f34453x.f34458b.isAutoMirrored();
    }

    @Override // android.graphics.drawable.Animatable
    public boolean isRunning() {
        Drawable drawable = this.f34467w;
        if (drawable != null) {
            return ((AnimatedVectorDrawable) drawable).isRunning();
        }
        return this.f34453x.f34459c.isRunning();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        Drawable drawable = this.f34467w;
        if (drawable != null) {
            return drawable.isStateful();
        }
        return this.f34453x.f34458b.isStateful();
    }

    @Override // h5.h, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void jumpToCurrentState() {
        super.jumpToCurrentState();
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable mutate() {
        Drawable drawable = this.f34467w;
        if (drawable != null) {
            drawable.mutate();
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        Drawable drawable = this.f34467w;
        if (drawable != null) {
            drawable.setBounds(rect);
        } else {
            this.f34453x.f34458b.setBounds(rect);
        }
    }

    @Override // h5.h, android.graphics.drawable.Drawable
    public boolean onLevelChange(int i10) {
        Drawable drawable = this.f34467w;
        if (drawable != null) {
            return drawable.setLevel(i10);
        }
        return this.f34453x.f34458b.setLevel(i10);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onStateChange(int[] iArr) {
        Drawable drawable = this.f34467w;
        if (drawable != null) {
            return drawable.setState(iArr);
        }
        return this.f34453x.f34458b.setState(iArr);
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i10) {
        Drawable drawable = this.f34467w;
        if (drawable != null) {
            drawable.setAlpha(i10);
        } else {
            this.f34453x.f34458b.setAlpha(i10);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setAutoMirrored(boolean z10) {
        Drawable drawable = this.f34467w;
        if (drawable != null) {
            g3.a.j(drawable, z10);
        } else {
            this.f34453x.f34458b.setAutoMirrored(z10);
        }
    }

    @Override // h5.h, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setChangingConfigurations(int i10) {
        super.setChangingConfigurations(i10);
    }

    @Override // h5.h, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setColorFilter(int i10, PorterDuff.Mode mode) {
        super.setColorFilter(i10, mode);
    }

    @Override // h5.h, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setFilterBitmap(boolean z10) {
        super.setFilterBitmap(z10);
    }

    @Override // h5.h, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setHotspot(float f10, float f11) {
        super.setHotspot(f10, f11);
    }

    @Override // h5.h, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setHotspotBounds(int i10, int i11, int i12, int i13) {
        super.setHotspotBounds(i10, i11, i12, i13);
    }

    @Override // h5.h, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ boolean setState(int[] iArr) {
        return super.setState(iArr);
    }

    @Override // android.graphics.drawable.Drawable, g3.b
    public void setTint(int i10) {
        Drawable drawable = this.f34467w;
        if (drawable != null) {
            g3.a.n(drawable, i10);
        } else {
            this.f34453x.f34458b.setTint(i10);
        }
    }

    @Override // android.graphics.drawable.Drawable, g3.b
    public void setTintList(ColorStateList colorStateList) {
        Drawable drawable = this.f34467w;
        if (drawable != null) {
            g3.a.o(drawable, colorStateList);
        } else {
            this.f34453x.f34458b.setTintList(colorStateList);
        }
    }

    @Override // android.graphics.drawable.Drawable, g3.b
    public void setTintMode(PorterDuff.Mode mode) {
        Drawable drawable = this.f34467w;
        if (drawable != null) {
            g3.a.p(drawable, mode);
        } else {
            this.f34453x.f34458b.setTintMode(mode);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z10, boolean z11) {
        Drawable drawable = this.f34467w;
        if (drawable != null) {
            return drawable.setVisible(z10, z11);
        }
        this.f34453x.f34458b.setVisible(z10, z11);
        return super.setVisible(z10, z11);
    }

    @Override // android.graphics.drawable.Animatable
    public void start() {
        Drawable drawable = this.f34467w;
        if (drawable != null) {
            ((AnimatedVectorDrawable) drawable).start();
        } else if (this.f34453x.f34459c.isStarted()) {
        } else {
            this.f34453x.f34459c.start();
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Animatable
    public void stop() {
        Drawable drawable = this.f34467w;
        if (drawable != null) {
            ((AnimatedVectorDrawable) drawable).stop();
        } else {
            this.f34453x.f34459c.end();
        }
    }

    public c(Context context) {
        this(context, null, null);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.f34467w;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        } else {
            this.f34453x.f34458b.setColorFilter(colorFilter);
        }
    }

    /* renamed from: h5.c$c  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class C0434c extends Drawable.ConstantState {

        /* renamed from: a  reason: collision with root package name */
        public final Drawable.ConstantState f34462a;

        public C0434c(Drawable.ConstantState constantState) {
            this.f34462a = constantState;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public boolean canApplyTheme() {
            return this.f34462a.canApplyTheme();
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return this.f34462a.getChangingConfigurations();
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable() {
            c cVar = new c();
            Drawable newDrawable = this.f34462a.newDrawable();
            cVar.f34467w = newDrawable;
            newDrawable.setCallback(cVar.C);
            return cVar;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources) {
            c cVar = new c();
            Drawable newDrawable = this.f34462a.newDrawable(resources);
            cVar.f34467w = newDrawable;
            newDrawable.setCallback(cVar.C);
            return cVar;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources, Resources.Theme theme) {
            c cVar = new c();
            Drawable newDrawable = this.f34462a.newDrawable(resources, theme);
            cVar.f34467w = newDrawable;
            newDrawable.setCallback(cVar.C);
            return cVar;
        }
    }

    public c(Context context, b bVar, Resources resources) {
        this.f34455z = null;
        this.A = null;
        this.B = null;
        a aVar = new a();
        this.C = aVar;
        this.f34454y = context;
        if (bVar != null) {
            this.f34453x = bVar;
        } else {
            this.f34453x = new b(context, bVar, aVar, resources);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) throws XmlPullParserException, IOException {
        inflate(resources, xmlPullParser, attributeSet, null);
    }
}

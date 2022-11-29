package g5;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import java.util.Map;

/* loaded from: classes.dex */
public class c extends m {

    /* renamed from: j0  reason: collision with root package name */
    public static final String[] f32637j0 = {"android:changeBounds:bounds", "android:changeBounds:clip", "android:changeBounds:parent", "android:changeBounds:windowX", "android:changeBounds:windowY"};

    /* renamed from: k0  reason: collision with root package name */
    public static final Property<Drawable, PointF> f32638k0 = new b(PointF.class, "boundsOrigin");

    /* renamed from: l0  reason: collision with root package name */
    public static final Property<k, PointF> f32639l0 = new C0378c(PointF.class, "topLeft");

    /* renamed from: m0  reason: collision with root package name */
    public static final Property<k, PointF> f32640m0 = new d(PointF.class, "bottomRight");

    /* renamed from: n0  reason: collision with root package name */
    public static final Property<View, PointF> f32641n0 = new e(PointF.class, "bottomRight");

    /* renamed from: o0  reason: collision with root package name */
    public static final Property<View, PointF> f32642o0 = new f(PointF.class, "topLeft");

    /* renamed from: p0  reason: collision with root package name */
    public static final Property<View, PointF> f32643p0 = new g(PointF.class, "position");

    /* renamed from: q0  reason: collision with root package name */
    public static g5.k f32644q0 = new g5.k();

    /* renamed from: g0  reason: collision with root package name */
    public int[] f32645g0 = new int[2];

    /* renamed from: h0  reason: collision with root package name */
    public boolean f32646h0 = false;

    /* renamed from: i0  reason: collision with root package name */
    public boolean f32647i0 = false;

    /* loaded from: classes.dex */
    public class a extends AnimatorListenerAdapter {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ ViewGroup f32648a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ BitmapDrawable f32649b;

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ View f32650c;

        /* renamed from: d  reason: collision with root package name */
        public final /* synthetic */ float f32651d;

        public a(ViewGroup viewGroup, BitmapDrawable bitmapDrawable, View view, float f10) {
            this.f32648a = viewGroup;
            this.f32649b = bitmapDrawable;
            this.f32650c = view;
            this.f32651d = f10;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            c0.b(this.f32648a).b(this.f32649b);
            c0.g(this.f32650c, this.f32651d);
        }
    }

    /* loaded from: classes.dex */
    public static class b extends Property<Drawable, PointF> {

        /* renamed from: a  reason: collision with root package name */
        public Rect f32653a;

        public b(Class cls, String str) {
            super(cls, str);
            this.f32653a = new Rect();
        }

        @Override // android.util.Property
        /* renamed from: a */
        public PointF get(Drawable drawable) {
            drawable.copyBounds(this.f32653a);
            Rect rect = this.f32653a;
            return new PointF(rect.left, rect.top);
        }

        @Override // android.util.Property
        /* renamed from: b */
        public void set(Drawable drawable, PointF pointF) {
            drawable.copyBounds(this.f32653a);
            this.f32653a.offsetTo(Math.round(pointF.x), Math.round(pointF.y));
            drawable.setBounds(this.f32653a);
        }
    }

    /* renamed from: g5.c$c  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class C0378c extends Property<k, PointF> {
        public C0378c(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* renamed from: a */
        public PointF get(k kVar) {
            return null;
        }

        @Override // android.util.Property
        /* renamed from: b */
        public void set(k kVar, PointF pointF) {
            kVar.c(pointF);
        }
    }

    /* loaded from: classes.dex */
    public static class d extends Property<k, PointF> {
        public d(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* renamed from: a */
        public PointF get(k kVar) {
            return null;
        }

        @Override // android.util.Property
        /* renamed from: b */
        public void set(k kVar, PointF pointF) {
            kVar.a(pointF);
        }
    }

    /* loaded from: classes.dex */
    public static class e extends Property<View, PointF> {
        public e(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* renamed from: a */
        public PointF get(View view) {
            return null;
        }

        @Override // android.util.Property
        /* renamed from: b */
        public void set(View view, PointF pointF) {
            c0.f(view, view.getLeft(), view.getTop(), Math.round(pointF.x), Math.round(pointF.y));
        }
    }

    /* loaded from: classes.dex */
    public static class f extends Property<View, PointF> {
        public f(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* renamed from: a */
        public PointF get(View view) {
            return null;
        }

        @Override // android.util.Property
        /* renamed from: b */
        public void set(View view, PointF pointF) {
            c0.f(view, Math.round(pointF.x), Math.round(pointF.y), view.getRight(), view.getBottom());
        }
    }

    /* loaded from: classes.dex */
    public static class g extends Property<View, PointF> {
        public g(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* renamed from: a */
        public PointF get(View view) {
            return null;
        }

        @Override // android.util.Property
        /* renamed from: b */
        public void set(View view, PointF pointF) {
            int round = Math.round(pointF.x);
            int round2 = Math.round(pointF.y);
            c0.f(view, round, round2, view.getWidth() + round, view.getHeight() + round2);
        }
    }

    /* loaded from: classes.dex */
    public class h extends AnimatorListenerAdapter {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ k f32654a;
        private k mViewBounds;

        public h(k kVar) {
            this.f32654a = kVar;
            this.mViewBounds = kVar;
        }
    }

    /* loaded from: classes.dex */
    public class i extends AnimatorListenerAdapter {

        /* renamed from: a  reason: collision with root package name */
        public boolean f32656a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ View f32657b;

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ Rect f32658c;

        /* renamed from: d  reason: collision with root package name */
        public final /* synthetic */ int f32659d;

        /* renamed from: e  reason: collision with root package name */
        public final /* synthetic */ int f32660e;

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ int f32661f;

        /* renamed from: g  reason: collision with root package name */
        public final /* synthetic */ int f32662g;

        public i(View view, Rect rect, int i10, int i11, int i12, int i13) {
            this.f32657b = view;
            this.f32658c = rect;
            this.f32659d = i10;
            this.f32660e = i11;
            this.f32661f = i12;
            this.f32662g = i13;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.f32656a = true;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            if (this.f32656a) {
                return;
            }
            o3.c0.y0(this.f32657b, this.f32658c);
            c0.f(this.f32657b, this.f32659d, this.f32660e, this.f32661f, this.f32662g);
        }
    }

    /* loaded from: classes.dex */
    public class j extends n {

        /* renamed from: a  reason: collision with root package name */
        public boolean f32664a = false;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ ViewGroup f32665b;

        public j(ViewGroup viewGroup) {
            this.f32665b = viewGroup;
        }

        @Override // g5.n, g5.m.f
        public void a(m mVar) {
            x.c(this.f32665b, false);
            this.f32664a = true;
        }

        @Override // g5.n, g5.m.f
        public void b(m mVar) {
            x.c(this.f32665b, true);
        }

        @Override // g5.m.f
        public void c(m mVar) {
            if (!this.f32664a) {
                x.c(this.f32665b, false);
            }
            mVar.W(this);
        }

        @Override // g5.n, g5.m.f
        public void e(m mVar) {
            x.c(this.f32665b, false);
        }
    }

    /* loaded from: classes.dex */
    public static class k {

        /* renamed from: a  reason: collision with root package name */
        public int f32667a;

        /* renamed from: b  reason: collision with root package name */
        public int f32668b;

        /* renamed from: c  reason: collision with root package name */
        public int f32669c;

        /* renamed from: d  reason: collision with root package name */
        public int f32670d;

        /* renamed from: e  reason: collision with root package name */
        public View f32671e;

        /* renamed from: f  reason: collision with root package name */
        public int f32672f;

        /* renamed from: g  reason: collision with root package name */
        public int f32673g;

        public k(View view) {
            this.f32671e = view;
        }

        public void a(PointF pointF) {
            this.f32669c = Math.round(pointF.x);
            this.f32670d = Math.round(pointF.y);
            int i10 = this.f32673g + 1;
            this.f32673g = i10;
            if (this.f32672f == i10) {
                b();
            }
        }

        public final void b() {
            c0.f(this.f32671e, this.f32667a, this.f32668b, this.f32669c, this.f32670d);
            this.f32672f = 0;
            this.f32673g = 0;
        }

        public void c(PointF pointF) {
            this.f32667a = Math.round(pointF.x);
            this.f32668b = Math.round(pointF.y);
            int i10 = this.f32672f + 1;
            this.f32672f = i10;
            if (i10 == this.f32673g) {
                b();
            }
        }
    }

    @Override // g5.m
    public String[] H() {
        return f32637j0;
    }

    @Override // g5.m
    public void i(s sVar) {
        j0(sVar);
    }

    public final void j0(s sVar) {
        View view = sVar.f32778b;
        if (!o3.c0.V(view) && view.getWidth() == 0 && view.getHeight() == 0) {
            return;
        }
        sVar.f32777a.put("android:changeBounds:bounds", new Rect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom()));
        sVar.f32777a.put("android:changeBounds:parent", sVar.f32778b.getParent());
        if (this.f32647i0) {
            sVar.f32778b.getLocationInWindow(this.f32645g0);
            sVar.f32777a.put("android:changeBounds:windowX", Integer.valueOf(this.f32645g0[0]));
            sVar.f32777a.put("android:changeBounds:windowY", Integer.valueOf(this.f32645g0[1]));
        }
        if (this.f32646h0) {
            sVar.f32777a.put("android:changeBounds:clip", o3.c0.w(view));
        }
    }

    public final boolean l0(View view, View view2) {
        if (this.f32647i0) {
            s x10 = x(view, true);
            if (x10 == null) {
                if (view == view2) {
                    return true;
                }
            } else if (view2 == x10.f32778b) {
                return true;
            }
            return false;
        }
        return true;
    }

    @Override // g5.m
    public void m(s sVar) {
        j0(sVar);
    }

    @Override // g5.m
    public Animator r(ViewGroup viewGroup, s sVar, s sVar2) {
        int i10;
        View view;
        int i11;
        Rect rect;
        ObjectAnimator objectAnimator;
        Animator c10;
        if (sVar == null || sVar2 == null) {
            return null;
        }
        Map<String, Object> map = sVar.f32777a;
        Map<String, Object> map2 = sVar2.f32777a;
        ViewGroup viewGroup2 = (ViewGroup) map.get("android:changeBounds:parent");
        ViewGroup viewGroup3 = (ViewGroup) map2.get("android:changeBounds:parent");
        if (viewGroup2 == null || viewGroup3 == null) {
            return null;
        }
        View view2 = sVar2.f32778b;
        if (l0(viewGroup2, viewGroup3)) {
            Rect rect2 = (Rect) sVar.f32777a.get("android:changeBounds:bounds");
            Rect rect3 = (Rect) sVar2.f32777a.get("android:changeBounds:bounds");
            int i12 = rect2.left;
            int i13 = rect3.left;
            int i14 = rect2.top;
            int i15 = rect3.top;
            int i16 = rect2.right;
            int i17 = rect3.right;
            int i18 = rect2.bottom;
            int i19 = rect3.bottom;
            int i20 = i16 - i12;
            int i21 = i18 - i14;
            int i22 = i17 - i13;
            int i23 = i19 - i15;
            Rect rect4 = (Rect) sVar.f32777a.get("android:changeBounds:clip");
            Rect rect5 = (Rect) sVar2.f32777a.get("android:changeBounds:clip");
            if ((i20 == 0 || i21 == 0) && (i22 == 0 || i23 == 0)) {
                i10 = 0;
            } else {
                i10 = (i12 == i13 && i14 == i15) ? 0 : 1;
                if (i16 != i17 || i18 != i19) {
                    i10++;
                }
            }
            if ((rect4 != null && !rect4.equals(rect5)) || (rect4 == null && rect5 != null)) {
                i10++;
            }
            if (i10 > 0) {
                if (!this.f32646h0) {
                    view = view2;
                    c0.f(view, i12, i14, i16, i18);
                    if (i10 == 2) {
                        if (i20 == i22 && i21 == i23) {
                            c10 = g5.f.a(view, f32643p0, z().a(i12, i14, i13, i15));
                        } else {
                            k kVar = new k(view);
                            ObjectAnimator a10 = g5.f.a(kVar, f32639l0, z().a(i12, i14, i13, i15));
                            ObjectAnimator a11 = g5.f.a(kVar, f32640m0, z().a(i16, i18, i17, i19));
                            AnimatorSet animatorSet = new AnimatorSet();
                            animatorSet.playTogether(a10, a11);
                            animatorSet.addListener(new h(kVar));
                            c10 = animatorSet;
                        }
                    } else if (i12 == i13 && i14 == i15) {
                        c10 = g5.f.a(view, f32641n0, z().a(i16, i18, i17, i19));
                    } else {
                        c10 = g5.f.a(view, f32642o0, z().a(i12, i14, i13, i15));
                    }
                } else {
                    view = view2;
                    c0.f(view, i12, i14, Math.max(i20, i22) + i12, Math.max(i21, i23) + i14);
                    ObjectAnimator a12 = (i12 == i13 && i14 == i15) ? null : g5.f.a(view, f32643p0, z().a(i12, i14, i13, i15));
                    if (rect4 == null) {
                        i11 = 0;
                        rect = new Rect(0, 0, i20, i21);
                    } else {
                        i11 = 0;
                        rect = rect4;
                    }
                    Rect rect6 = rect5 == null ? new Rect(i11, i11, i22, i23) : rect5;
                    if (rect.equals(rect6)) {
                        objectAnimator = null;
                    } else {
                        o3.c0.y0(view, rect);
                        g5.k kVar2 = f32644q0;
                        Object[] objArr = new Object[2];
                        objArr[i11] = rect;
                        objArr[1] = rect6;
                        ObjectAnimator ofObject = ObjectAnimator.ofObject(view, "clipBounds", kVar2, objArr);
                        ofObject.addListener(new i(view, rect5, i13, i15, i17, i19));
                        objectAnimator = ofObject;
                    }
                    c10 = r.c(a12, objectAnimator);
                }
                if (view.getParent() instanceof ViewGroup) {
                    ViewGroup viewGroup4 = (ViewGroup) view.getParent();
                    x.c(viewGroup4, true);
                    b(new j(viewGroup4));
                }
                return c10;
            }
            return null;
        }
        int intValue = ((Integer) sVar.f32777a.get("android:changeBounds:windowX")).intValue();
        int intValue2 = ((Integer) sVar.f32777a.get("android:changeBounds:windowY")).intValue();
        int intValue3 = ((Integer) sVar2.f32777a.get("android:changeBounds:windowX")).intValue();
        int intValue4 = ((Integer) sVar2.f32777a.get("android:changeBounds:windowY")).intValue();
        if (intValue == intValue3 && intValue2 == intValue4) {
            return null;
        }
        viewGroup.getLocationInWindow(this.f32645g0);
        Bitmap createBitmap = Bitmap.createBitmap(view2.getWidth(), view2.getHeight(), Bitmap.Config.ARGB_8888);
        view2.draw(new Canvas(createBitmap));
        BitmapDrawable bitmapDrawable = new BitmapDrawable(createBitmap);
        float c11 = c0.c(view2);
        c0.g(view2, 0.0f);
        c0.b(viewGroup).a(bitmapDrawable);
        g5.g z10 = z();
        int[] iArr = this.f32645g0;
        ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(bitmapDrawable, g5.i.a(f32638k0, z10.a(intValue - iArr[0], intValue2 - iArr[1], intValue3 - iArr[0], intValue4 - iArr[1])));
        ofPropertyValuesHolder.addListener(new a(viewGroup, bitmapDrawable, view2, c11));
        return ofPropertyValuesHolder;
    }
}

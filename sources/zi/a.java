package zi;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import java.lang.ref.WeakReference;
import java.text.NumberFormat;
import nj.h;
import nj.j;
import o3.c0;
import qj.c;
import tj.g;
import wi.d;
import wi.f;
import wi.i;
import wi.k;
import wi.l;

/* loaded from: classes3.dex */
public class a extends Drawable implements h.b {
    public static final int M = k.f58918o;
    public static final int N = wi.b.f58766c;
    public final float A;
    public final float B;
    public final float C;
    public final b D;
    public float E;
    public float F;
    public int G;
    public float H;
    public float I;
    public float J;
    public WeakReference<View> K;
    public WeakReference<FrameLayout> L;

    /* renamed from: w  reason: collision with root package name */
    public final WeakReference<Context> f63190w;

    /* renamed from: x  reason: collision with root package name */
    public final g f63191x;

    /* renamed from: y  reason: collision with root package name */
    public final h f63192y;

    /* renamed from: z  reason: collision with root package name */
    public final Rect f63193z;

    /* renamed from: zi.a$a  reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public class RunnableC1097a implements Runnable {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ View f63194w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ FrameLayout f63195x;

        public RunnableC1097a(View view, FrameLayout frameLayout) {
            this.f63194w = view;
            this.f63195x = frameLayout;
        }

        @Override // java.lang.Runnable
        public void run() {
            a.this.y(this.f63194w, this.f63195x);
        }
    }

    public a(Context context) {
        this.f63190w = new WeakReference<>(context);
        j.c(context);
        Resources resources = context.getResources();
        this.f63193z = new Rect();
        this.f63191x = new g();
        this.A = resources.getDimensionPixelSize(d.C);
        this.C = resources.getDimensionPixelSize(d.B);
        this.B = resources.getDimensionPixelSize(d.E);
        h hVar = new h(this);
        this.f63192y = hVar;
        hVar.e().setTextAlign(Paint.Align.CENTER);
        this.D = new b(context);
        u(k.f58908e);
    }

    public static a c(Context context) {
        return d(context, null, N, M);
    }

    public static a d(Context context, AttributeSet attributeSet, int i10, int i11) {
        a aVar = new a(context);
        aVar.l(context, attributeSet, i10, i11);
        return aVar;
    }

    public static int m(Context context, TypedArray typedArray, int i10) {
        return c.a(context, typedArray, i10).getDefaultColor();
    }

    public static void x(View view) {
        ViewGroup viewGroup = (ViewGroup) view.getParent();
        viewGroup.setClipChildren(false);
        viewGroup.setClipToPadding(false);
    }

    public final void A() {
        this.G = ((int) Math.pow(10.0d, i() - 1.0d)) - 1;
    }

    @Override // nj.h.b
    public void a() {
        invalidateSelf();
    }

    public final void b(Context context, Rect rect, View view) {
        int i10 = this.D.H + this.D.J;
        int i11 = this.D.E;
        if (i11 != 8388691 && i11 != 8388693) {
            this.F = rect.top + i10;
        } else {
            this.F = rect.bottom - i10;
        }
        if (j() <= 9) {
            float f10 = !k() ? this.A : this.B;
            this.H = f10;
            this.J = f10;
            this.I = f10;
        } else {
            float f11 = this.B;
            this.H = f11;
            this.J = f11;
            this.I = (this.f63192y.f(f()) / 2.0f) + this.C;
        }
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(k() ? d.D : d.A);
        int i12 = this.D.G + this.D.I;
        int i13 = this.D.E;
        if (i13 != 8388659 && i13 != 8388691) {
            this.E = c0.E(view) == 0 ? ((rect.right + this.I) - dimensionPixelSize) - i12 : (rect.left - this.I) + dimensionPixelSize + i12;
        } else {
            this.E = c0.E(view) == 0 ? (rect.left - this.I) + dimensionPixelSize + i12 : ((rect.right + this.I) - dimensionPixelSize) - i12;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        if (getBounds().isEmpty() || getAlpha() == 0 || !isVisible()) {
            return;
        }
        this.f63191x.draw(canvas);
        if (k()) {
            e(canvas);
        }
    }

    public final void e(Canvas canvas) {
        Rect rect = new Rect();
        String f10 = f();
        this.f63192y.e().getTextBounds(f10, 0, f10.length(), rect);
        canvas.drawText(f10, this.E, this.F + (rect.height() / 2), this.f63192y.e());
    }

    public final String f() {
        if (j() <= this.G) {
            return NumberFormat.getInstance().format(j());
        }
        Context context = this.f63190w.get();
        return context == null ? "" : context.getString(wi.j.f58895l, Integer.valueOf(this.G), "+");
    }

    public CharSequence g() {
        Context context;
        if (isVisible()) {
            if (k()) {
                if (this.D.C <= 0 || (context = this.f63190w.get()) == null) {
                    return null;
                }
                if (j() <= this.G) {
                    return context.getResources().getQuantityString(this.D.C, j(), Integer.valueOf(j()));
                }
                return context.getString(this.D.D, Integer.valueOf(this.G));
            }
            return this.D.B;
        }
        return null;
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.D.f63199y;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return this.f63193z.height();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return this.f63193z.width();
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    public FrameLayout h() {
        WeakReference<FrameLayout> weakReference = this.L;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    public int i() {
        return this.D.A;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        return false;
    }

    public int j() {
        if (k()) {
            return this.D.f63200z;
        }
        return 0;
    }

    public boolean k() {
        return this.D.f63200z != -1;
    }

    public final void l(Context context, AttributeSet attributeSet, int i10, int i11) {
        TypedArray h10 = j.h(context, attributeSet, l.C, i10, i11, new int[0]);
        r(h10.getInt(l.H, 4));
        int i12 = l.I;
        if (h10.hasValue(i12)) {
            s(h10.getInt(i12, 0));
        }
        n(m(context, h10, l.D));
        int i13 = l.F;
        if (h10.hasValue(i13)) {
            p(m(context, h10, i13));
        }
        o(h10.getInt(l.E, 8388661));
        q(h10.getDimensionPixelOffset(l.G, 0));
        v(h10.getDimensionPixelOffset(l.J, 0));
        h10.recycle();
    }

    public void n(int i10) {
        this.D.f63197w = i10;
        ColorStateList valueOf = ColorStateList.valueOf(i10);
        if (this.f63191x.x() != valueOf) {
            this.f63191x.Y(valueOf);
            invalidateSelf();
        }
    }

    public void o(int i10) {
        if (this.D.E != i10) {
            this.D.E = i10;
            WeakReference<View> weakReference = this.K;
            if (weakReference == null || weakReference.get() == null) {
                return;
            }
            View view = this.K.get();
            WeakReference<FrameLayout> weakReference2 = this.L;
            y(view, weakReference2 != null ? weakReference2.get() : null);
        }
    }

    @Override // android.graphics.drawable.Drawable, nj.h.b
    public boolean onStateChange(int[] iArr) {
        return super.onStateChange(iArr);
    }

    public void p(int i10) {
        this.D.f63198x = i10;
        if (this.f63192y.e().getColor() != i10) {
            this.f63192y.e().setColor(i10);
            invalidateSelf();
        }
    }

    public void q(int i10) {
        this.D.G = i10;
        z();
    }

    public void r(int i10) {
        if (this.D.A != i10) {
            this.D.A = i10;
            A();
            this.f63192y.i(true);
            z();
            invalidateSelf();
        }
    }

    public void s(int i10) {
        int max = Math.max(0, i10);
        if (this.D.f63200z != max) {
            this.D.f63200z = max;
            this.f63192y.i(true);
            z();
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i10) {
        this.D.f63199y = i10;
        this.f63192y.e().setAlpha(i10);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
    }

    public final void t(qj.d dVar) {
        Context context;
        if (this.f63192y.d() == dVar || (context = this.f63190w.get()) == null) {
            return;
        }
        this.f63192y.h(dVar, context);
        z();
    }

    public final void u(int i10) {
        Context context = this.f63190w.get();
        if (context == null) {
            return;
        }
        t(new qj.d(context, i10));
    }

    public void v(int i10) {
        this.D.H = i10;
        z();
    }

    public final void w(View view) {
        ViewGroup viewGroup = (ViewGroup) view.getParent();
        if (viewGroup == null || viewGroup.getId() != f.f58856v) {
            WeakReference<FrameLayout> weakReference = this.L;
            if (weakReference == null || weakReference.get() != viewGroup) {
                x(view);
                FrameLayout frameLayout = new FrameLayout(view.getContext());
                frameLayout.setId(f.f58856v);
                frameLayout.setClipChildren(false);
                frameLayout.setClipToPadding(false);
                frameLayout.setLayoutParams(view.getLayoutParams());
                frameLayout.setMinimumWidth(view.getWidth());
                frameLayout.setMinimumHeight(view.getHeight());
                int indexOfChild = viewGroup.indexOfChild(view);
                viewGroup.removeViewAt(indexOfChild);
                view.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
                frameLayout.addView(view);
                viewGroup.addView(frameLayout, indexOfChild);
                this.L = new WeakReference<>(frameLayout);
                frameLayout.post(new RunnableC1097a(view, frameLayout));
            }
        }
    }

    public void y(View view, FrameLayout frameLayout) {
        this.K = new WeakReference<>(view);
        boolean z10 = zi.b.f63201a;
        if (z10 && frameLayout == null) {
            w(view);
        } else {
            this.L = new WeakReference<>(frameLayout);
        }
        if (!z10) {
            x(view);
        }
        z();
        invalidateSelf();
    }

    public final void z() {
        Context context = this.f63190w.get();
        WeakReference<View> weakReference = this.K;
        View view = weakReference != null ? weakReference.get() : null;
        if (context == null || view == null) {
            return;
        }
        Rect rect = new Rect();
        rect.set(this.f63193z);
        Rect rect2 = new Rect();
        view.getDrawingRect(rect2);
        WeakReference<FrameLayout> weakReference2 = this.L;
        FrameLayout frameLayout = weakReference2 != null ? weakReference2.get() : null;
        if (frameLayout != null || zi.b.f63201a) {
            if (frameLayout == null) {
                frameLayout = (ViewGroup) view.getParent();
            }
            frameLayout.offsetDescendantRectToMyCoords(view, rect2);
        }
        b(context, rect2, view);
        zi.b.d(this.f63193z, this.E, this.F, this.I, this.J);
        this.f63191x.V(this.H);
        if (rect.equals(this.f63193z)) {
            return;
        }
        this.f63191x.setBounds(this.f63193z);
    }

    /* loaded from: classes3.dex */
    public static final class b implements Parcelable {
        public static final Parcelable.Creator<b> CREATOR = new C1098a();
        public int A;
        public CharSequence B;
        public int C;
        public int D;
        public int E;
        public boolean F;
        public int G;
        public int H;
        public int I;
        public int J;

        /* renamed from: w  reason: collision with root package name */
        public int f63197w;

        /* renamed from: x  reason: collision with root package name */
        public int f63198x;

        /* renamed from: y  reason: collision with root package name */
        public int f63199y;

        /* renamed from: z  reason: collision with root package name */
        public int f63200z;

        /* renamed from: zi.a$b$a  reason: collision with other inner class name */
        /* loaded from: classes3.dex */
        public static class C1098a implements Parcelable.Creator<b> {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a */
            public b createFromParcel(Parcel parcel) {
                return new b(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b */
            public b[] newArray(int i10) {
                return new b[i10];
            }
        }

        public b(Context context) {
            this.f63199y = 255;
            this.f63200z = -1;
            this.f63198x = new qj.d(context, k.f58908e).f49535a.getDefaultColor();
            this.B = context.getString(wi.j.f58892i);
            this.C = i.f58883a;
            this.D = wi.j.f58894k;
            this.F = true;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            parcel.writeInt(this.f63197w);
            parcel.writeInt(this.f63198x);
            parcel.writeInt(this.f63199y);
            parcel.writeInt(this.f63200z);
            parcel.writeInt(this.A);
            parcel.writeString(this.B.toString());
            parcel.writeInt(this.C);
            parcel.writeInt(this.E);
            parcel.writeInt(this.G);
            parcel.writeInt(this.H);
            parcel.writeInt(this.I);
            parcel.writeInt(this.J);
            parcel.writeInt(this.F ? 1 : 0);
        }

        public b(Parcel parcel) {
            this.f63199y = 255;
            this.f63200z = -1;
            this.f63197w = parcel.readInt();
            this.f63198x = parcel.readInt();
            this.f63199y = parcel.readInt();
            this.f63200z = parcel.readInt();
            this.A = parcel.readInt();
            this.B = parcel.readString();
            this.C = parcel.readInt();
            this.E = parcel.readInt();
            this.G = parcel.readInt();
            this.H = parcel.readInt();
            this.I = parcel.readInt();
            this.J = parcel.readInt();
            this.F = parcel.readInt() != 0;
        }
    }
}

package h5;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.VectorDrawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.util.Xml;
import f3.d;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes.dex */
public class i extends h5.h {
    public static final PorterDuff.Mode G = PorterDuff.Mode.SRC_IN;
    public boolean A;
    public boolean B;
    public Drawable.ConstantState C;
    public final float[] D;
    public final Matrix E;
    public final Rect F;

    /* renamed from: x  reason: collision with root package name */
    public h f34468x;

    /* renamed from: y  reason: collision with root package name */
    public PorterDuffColorFilter f34469y;

    /* renamed from: z  reason: collision with root package name */
    public ColorFilter f34470z;

    /* loaded from: classes.dex */
    public static class b extends f {
        public b() {
        }

        @Override // h5.i.f
        public boolean c() {
            return true;
        }

        public void e(Resources resources, AttributeSet attributeSet, Resources.Theme theme, XmlPullParser xmlPullParser) {
            if (e3.i.j(xmlPullParser, "pathData")) {
                TypedArray k10 = e3.i.k(resources, theme, attributeSet, h5.a.f34444d);
                f(k10, xmlPullParser);
                k10.recycle();
            }
        }

        public final void f(TypedArray typedArray, XmlPullParser xmlPullParser) {
            String string = typedArray.getString(0);
            if (string != null) {
                this.f34497b = string;
            }
            String string2 = typedArray.getString(1);
            if (string2 != null) {
                this.f34496a = f3.d.d(string2);
            }
            this.f34498c = e3.i.g(typedArray, xmlPullParser, "fillType", 2, 0);
        }

        public b(b bVar) {
            super(bVar);
        }
    }

    /* loaded from: classes.dex */
    public static abstract class e {
        public e() {
        }

        public boolean a() {
            return false;
        }

        public boolean b(int[] iArr) {
            return false;
        }
    }

    /* loaded from: classes.dex */
    public static class h extends Drawable.ConstantState {

        /* renamed from: a  reason: collision with root package name */
        public int f34517a;

        /* renamed from: b  reason: collision with root package name */
        public g f34518b;

        /* renamed from: c  reason: collision with root package name */
        public ColorStateList f34519c;

        /* renamed from: d  reason: collision with root package name */
        public PorterDuff.Mode f34520d;

        /* renamed from: e  reason: collision with root package name */
        public boolean f34521e;

        /* renamed from: f  reason: collision with root package name */
        public Bitmap f34522f;

        /* renamed from: g  reason: collision with root package name */
        public ColorStateList f34523g;

        /* renamed from: h  reason: collision with root package name */
        public PorterDuff.Mode f34524h;

        /* renamed from: i  reason: collision with root package name */
        public int f34525i;

        /* renamed from: j  reason: collision with root package name */
        public boolean f34526j;

        /* renamed from: k  reason: collision with root package name */
        public boolean f34527k;

        /* renamed from: l  reason: collision with root package name */
        public Paint f34528l;

        public h(h hVar) {
            this.f34519c = null;
            this.f34520d = i.G;
            if (hVar != null) {
                this.f34517a = hVar.f34517a;
                g gVar = new g(hVar.f34518b);
                this.f34518b = gVar;
                if (hVar.f34518b.f34505e != null) {
                    gVar.f34505e = new Paint(hVar.f34518b.f34505e);
                }
                if (hVar.f34518b.f34504d != null) {
                    this.f34518b.f34504d = new Paint(hVar.f34518b.f34504d);
                }
                this.f34519c = hVar.f34519c;
                this.f34520d = hVar.f34520d;
                this.f34521e = hVar.f34521e;
            }
        }

        public boolean a(int i10, int i11) {
            return i10 == this.f34522f.getWidth() && i11 == this.f34522f.getHeight();
        }

        public boolean b() {
            return !this.f34527k && this.f34523g == this.f34519c && this.f34524h == this.f34520d && this.f34526j == this.f34521e && this.f34525i == this.f34518b.getRootAlpha();
        }

        public void c(int i10, int i11) {
            if (this.f34522f == null || !a(i10, i11)) {
                this.f34522f = Bitmap.createBitmap(i10, i11, Bitmap.Config.ARGB_8888);
                this.f34527k = true;
            }
        }

        public void d(Canvas canvas, ColorFilter colorFilter, Rect rect) {
            canvas.drawBitmap(this.f34522f, (Rect) null, rect, e(colorFilter));
        }

        public Paint e(ColorFilter colorFilter) {
            if (f() || colorFilter != null) {
                if (this.f34528l == null) {
                    Paint paint = new Paint();
                    this.f34528l = paint;
                    paint.setFilterBitmap(true);
                }
                this.f34528l.setAlpha(this.f34518b.getRootAlpha());
                this.f34528l.setColorFilter(colorFilter);
                return this.f34528l;
            }
            return null;
        }

        public boolean f() {
            return this.f34518b.getRootAlpha() < 255;
        }

        public boolean g() {
            return this.f34518b.f();
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return this.f34517a;
        }

        public boolean h(int[] iArr) {
            boolean g10 = this.f34518b.g(iArr);
            this.f34527k |= g10;
            return g10;
        }

        public void i() {
            this.f34523g = this.f34519c;
            this.f34524h = this.f34520d;
            this.f34525i = this.f34518b.getRootAlpha();
            this.f34526j = this.f34521e;
            this.f34527k = false;
        }

        public void j(int i10, int i11) {
            this.f34522f.eraseColor(0);
            this.f34518b.b(new Canvas(this.f34522f), i10, i11, null);
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable() {
            return new i(this);
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources) {
            return new i(this);
        }

        public h() {
            this.f34519c = null;
            this.f34520d = i.G;
            this.f34518b = new g();
        }
    }

    public i() {
        this.B = true;
        this.D = new float[9];
        this.E = new Matrix();
        this.F = new Rect();
        this.f34468x = new h();
    }

    public static int a(int i10, float f10) {
        return (i10 & 16777215) | (((int) (Color.alpha(i10) * f10)) << 24);
    }

    public static i b(Resources resources, int i10, Resources.Theme theme) {
        int next;
        if (Build.VERSION.SDK_INT >= 24) {
            i iVar = new i();
            iVar.f34467w = e3.h.f(resources, i10, theme);
            iVar.C = new C0435i(iVar.f34467w.getConstantState());
            return iVar;
        }
        try {
            XmlResourceParser xml = resources.getXml(i10);
            AttributeSet asAttributeSet = Xml.asAttributeSet(xml);
            while (true) {
                next = xml.next();
                if (next == 2 || next == 1) {
                    break;
                }
            }
            if (next == 2) {
                return c(resources, xml, asAttributeSet, theme);
            }
            throw new XmlPullParserException("No start tag found");
        } catch (IOException e10) {
            Log.e("VectorDrawableCompat", "parser error", e10);
            return null;
        } catch (XmlPullParserException e11) {
            Log.e("VectorDrawableCompat", "parser error", e11);
            return null;
        }
    }

    public static i c(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        i iVar = new i();
        iVar.inflate(resources, xmlPullParser, attributeSet, theme);
        return iVar;
    }

    public static PorterDuff.Mode g(int i10, PorterDuff.Mode mode) {
        if (i10 != 3) {
            if (i10 != 5) {
                if (i10 != 9) {
                    switch (i10) {
                        case 14:
                            return PorterDuff.Mode.MULTIPLY;
                        case 15:
                            return PorterDuff.Mode.SCREEN;
                        case 16:
                            return PorterDuff.Mode.ADD;
                        default:
                            return mode;
                    }
                }
                return PorterDuff.Mode.SRC_ATOP;
            }
            return PorterDuff.Mode.SRC_IN;
        }
        return PorterDuff.Mode.SRC_OVER;
    }

    @Override // h5.h, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void applyTheme(Resources.Theme theme) {
        super.applyTheme(theme);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean canApplyTheme() {
        Drawable drawable = this.f34467w;
        if (drawable != null) {
            g3.a.b(drawable);
            return false;
        }
        return false;
    }

    @Override // h5.h, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void clearColorFilter() {
        super.clearColorFilter();
    }

    public Object d(String str) {
        return this.f34468x.f34518b.f34516p.get(str);
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        Drawable drawable = this.f34467w;
        if (drawable != null) {
            drawable.draw(canvas);
            return;
        }
        copyBounds(this.F);
        if (this.F.width() <= 0 || this.F.height() <= 0) {
            return;
        }
        ColorFilter colorFilter = this.f34470z;
        if (colorFilter == null) {
            colorFilter = this.f34469y;
        }
        canvas.getMatrix(this.E);
        this.E.getValues(this.D);
        float abs = Math.abs(this.D[0]);
        float abs2 = Math.abs(this.D[4]);
        float abs3 = Math.abs(this.D[1]);
        float abs4 = Math.abs(this.D[3]);
        if (abs3 != 0.0f || abs4 != 0.0f) {
            abs = 1.0f;
            abs2 = 1.0f;
        }
        int min = Math.min(2048, (int) (this.F.width() * abs));
        int min2 = Math.min(2048, (int) (this.F.height() * abs2));
        if (min <= 0 || min2 <= 0) {
            return;
        }
        int save = canvas.save();
        Rect rect = this.F;
        canvas.translate(rect.left, rect.top);
        if (f()) {
            canvas.translate(this.F.width(), 0.0f);
            canvas.scale(-1.0f, 1.0f);
        }
        this.F.offsetTo(0, 0);
        this.f34468x.c(min, min2);
        if (!this.B) {
            this.f34468x.j(min, min2);
        } else if (!this.f34468x.b()) {
            this.f34468x.j(min, min2);
            this.f34468x.i();
        }
        this.f34468x.d(canvas, colorFilter, this.F);
        canvas.restoreToCount(save);
    }

    public final void e(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        h hVar = this.f34468x;
        g gVar = hVar.f34518b;
        ArrayDeque arrayDeque = new ArrayDeque();
        arrayDeque.push(gVar.f34508h);
        int eventType = xmlPullParser.getEventType();
        int depth = xmlPullParser.getDepth() + 1;
        boolean z10 = true;
        while (eventType != 1 && (xmlPullParser.getDepth() >= depth || eventType != 3)) {
            if (eventType == 2) {
                String name = xmlPullParser.getName();
                d dVar = (d) arrayDeque.peek();
                if ("path".equals(name)) {
                    c cVar = new c();
                    cVar.g(resources, attributeSet, theme, xmlPullParser);
                    dVar.f34484b.add(cVar);
                    if (cVar.getPathName() != null) {
                        gVar.f34516p.put(cVar.getPathName(), cVar);
                    }
                    z10 = false;
                    hVar.f34517a = cVar.f34499d | hVar.f34517a;
                } else if ("clip-path".equals(name)) {
                    b bVar = new b();
                    bVar.e(resources, attributeSet, theme, xmlPullParser);
                    dVar.f34484b.add(bVar);
                    if (bVar.getPathName() != null) {
                        gVar.f34516p.put(bVar.getPathName(), bVar);
                    }
                    hVar.f34517a = bVar.f34499d | hVar.f34517a;
                } else if ("group".equals(name)) {
                    d dVar2 = new d();
                    dVar2.c(resources, attributeSet, theme, xmlPullParser);
                    dVar.f34484b.add(dVar2);
                    arrayDeque.push(dVar2);
                    if (dVar2.getGroupName() != null) {
                        gVar.f34516p.put(dVar2.getGroupName(), dVar2);
                    }
                    hVar.f34517a = dVar2.f34493k | hVar.f34517a;
                }
            } else if (eventType == 3 && "group".equals(xmlPullParser.getName())) {
                arrayDeque.pop();
            }
            eventType = xmlPullParser.next();
        }
        if (z10) {
            throw new XmlPullParserException("no path defined");
        }
    }

    public final boolean f() {
        return Build.VERSION.SDK_INT >= 17 && isAutoMirrored() && g3.a.f(this) == 1;
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        Drawable drawable = this.f34467w;
        if (drawable != null) {
            return g3.a.d(drawable);
        }
        return this.f34468x.f34518b.getRootAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public int getChangingConfigurations() {
        Drawable drawable = this.f34467w;
        if (drawable != null) {
            return drawable.getChangingConfigurations();
        }
        return super.getChangingConfigurations() | this.f34468x.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable
    public ColorFilter getColorFilter() {
        Drawable drawable = this.f34467w;
        if (drawable != null) {
            return g3.a.e(drawable);
        }
        return this.f34470z;
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable.ConstantState getConstantState() {
        if (this.f34467w != null && Build.VERSION.SDK_INT >= 24) {
            return new C0435i(this.f34467w.getConstantState());
        }
        this.f34468x.f34517a = getChangingConfigurations();
        return this.f34468x;
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
        return (int) this.f34468x.f34518b.f34510j;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        Drawable drawable = this.f34467w;
        if (drawable != null) {
            return drawable.getIntrinsicWidth();
        }
        return (int) this.f34468x.f34518b.f34509i;
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
        return -3;
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

    public void h(boolean z10) {
        this.B = z10;
    }

    public final void i(TypedArray typedArray, XmlPullParser xmlPullParser, Resources.Theme theme) throws XmlPullParserException {
        h hVar = this.f34468x;
        g gVar = hVar.f34518b;
        hVar.f34520d = g(e3.i.g(typedArray, xmlPullParser, "tintMode", 6, -1), PorterDuff.Mode.SRC_IN);
        ColorStateList c10 = e3.i.c(typedArray, xmlPullParser, theme, "tint", 1);
        if (c10 != null) {
            hVar.f34519c = c10;
        }
        hVar.f34521e = e3.i.a(typedArray, xmlPullParser, "autoMirrored", 5, hVar.f34521e);
        gVar.f34511k = e3.i.f(typedArray, xmlPullParser, "viewportWidth", 7, gVar.f34511k);
        float f10 = e3.i.f(typedArray, xmlPullParser, "viewportHeight", 8, gVar.f34512l);
        gVar.f34512l = f10;
        if (gVar.f34511k <= 0.0f) {
            throw new XmlPullParserException(typedArray.getPositionDescription() + "<vector> tag requires viewportWidth > 0");
        } else if (f10 > 0.0f) {
            gVar.f34509i = typedArray.getDimension(3, gVar.f34509i);
            float dimension = typedArray.getDimension(2, gVar.f34510j);
            gVar.f34510j = dimension;
            if (gVar.f34509i <= 0.0f) {
                throw new XmlPullParserException(typedArray.getPositionDescription() + "<vector> tag requires width > 0");
            } else if (dimension > 0.0f) {
                gVar.setAlpha(e3.i.f(typedArray, xmlPullParser, "alpha", 4, gVar.getAlpha()));
                String string = typedArray.getString(0);
                if (string != null) {
                    gVar.f34514n = string;
                    gVar.f34516p.put(string, gVar);
                }
            } else {
                throw new XmlPullParserException(typedArray.getPositionDescription() + "<vector> tag requires height > 0");
            }
        } else {
            throw new XmlPullParserException(typedArray.getPositionDescription() + "<vector> tag requires viewportHeight > 0");
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) throws XmlPullParserException, IOException {
        Drawable drawable = this.f34467w;
        if (drawable != null) {
            drawable.inflate(resources, xmlPullParser, attributeSet);
        } else {
            inflate(resources, xmlPullParser, attributeSet, null);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void invalidateSelf() {
        Drawable drawable = this.f34467w;
        if (drawable != null) {
            drawable.invalidateSelf();
        } else {
            super.invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isAutoMirrored() {
        Drawable drawable = this.f34467w;
        if (drawable != null) {
            return g3.a.h(drawable);
        }
        return this.f34468x.f34521e;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        h hVar;
        ColorStateList colorStateList;
        Drawable drawable = this.f34467w;
        if (drawable != null) {
            return drawable.isStateful();
        }
        return super.isStateful() || ((hVar = this.f34468x) != null && (hVar.g() || ((colorStateList = this.f34468x.f34519c) != null && colorStateList.isStateful())));
    }

    public PorterDuffColorFilter j(PorterDuffColorFilter porterDuffColorFilter, ColorStateList colorStateList, PorterDuff.Mode mode) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
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
            return this;
        }
        if (!this.A && super.mutate() == this) {
            this.f34468x = new h(this.f34468x);
            this.A = true;
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        Drawable drawable = this.f34467w;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onStateChange(int[] iArr) {
        PorterDuff.Mode mode;
        Drawable drawable = this.f34467w;
        if (drawable != null) {
            return drawable.setState(iArr);
        }
        boolean z10 = false;
        h hVar = this.f34468x;
        ColorStateList colorStateList = hVar.f34519c;
        if (colorStateList != null && (mode = hVar.f34520d) != null) {
            this.f34469y = j(this.f34469y, colorStateList, mode);
            invalidateSelf();
            z10 = true;
        }
        if (hVar.g() && hVar.h(iArr)) {
            invalidateSelf();
            return true;
        }
        return z10;
    }

    @Override // android.graphics.drawable.Drawable
    public void scheduleSelf(Runnable runnable, long j10) {
        Drawable drawable = this.f34467w;
        if (drawable != null) {
            drawable.scheduleSelf(runnable, j10);
        } else {
            super.scheduleSelf(runnable, j10);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i10) {
        Drawable drawable = this.f34467w;
        if (drawable != null) {
            drawable.setAlpha(i10);
        } else if (this.f34468x.f34518b.getRootAlpha() != i10) {
            this.f34468x.f34518b.setRootAlpha(i10);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setAutoMirrored(boolean z10) {
        Drawable drawable = this.f34467w;
        if (drawable != null) {
            g3.a.j(drawable, z10);
        } else {
            this.f34468x.f34521e = z10;
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
            setTintList(ColorStateList.valueOf(i10));
        }
    }

    @Override // android.graphics.drawable.Drawable, g3.b
    public void setTintList(ColorStateList colorStateList) {
        Drawable drawable = this.f34467w;
        if (drawable != null) {
            g3.a.o(drawable, colorStateList);
            return;
        }
        h hVar = this.f34468x;
        if (hVar.f34519c != colorStateList) {
            hVar.f34519c = colorStateList;
            this.f34469y = j(this.f34469y, colorStateList, hVar.f34520d);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable, g3.b
    public void setTintMode(PorterDuff.Mode mode) {
        Drawable drawable = this.f34467w;
        if (drawable != null) {
            g3.a.p(drawable, mode);
            return;
        }
        h hVar = this.f34468x;
        if (hVar.f34520d != mode) {
            hVar.f34520d = mode;
            this.f34469y = j(this.f34469y, hVar.f34519c, mode);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z10, boolean z11) {
        Drawable drawable = this.f34467w;
        if (drawable != null) {
            return drawable.setVisible(z10, z11);
        }
        return super.setVisible(z10, z11);
    }

    @Override // android.graphics.drawable.Drawable
    public void unscheduleSelf(Runnable runnable) {
        Drawable drawable = this.f34467w;
        if (drawable != null) {
            drawable.unscheduleSelf(runnable);
        } else {
            super.unscheduleSelf(runnable);
        }
    }

    /* renamed from: h5.i$i  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class C0435i extends Drawable.ConstantState {

        /* renamed from: a  reason: collision with root package name */
        public final Drawable.ConstantState f34529a;

        public C0435i(Drawable.ConstantState constantState) {
            this.f34529a = constantState;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public boolean canApplyTheme() {
            return this.f34529a.canApplyTheme();
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return this.f34529a.getChangingConfigurations();
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable() {
            i iVar = new i();
            iVar.f34467w = (VectorDrawable) this.f34529a.newDrawable();
            return iVar;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources) {
            i iVar = new i();
            iVar.f34467w = (VectorDrawable) this.f34529a.newDrawable(resources);
            return iVar;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources, Resources.Theme theme) {
            i iVar = new i();
            iVar.f34467w = (VectorDrawable) this.f34529a.newDrawable(resources, theme);
            return iVar;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.f34467w;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
            return;
        }
        this.f34470z = colorFilter;
        invalidateSelf();
    }

    /* loaded from: classes.dex */
    public static abstract class f extends e {

        /* renamed from: a  reason: collision with root package name */
        public d.b[] f34496a;

        /* renamed from: b  reason: collision with root package name */
        public String f34497b;

        /* renamed from: c  reason: collision with root package name */
        public int f34498c;

        /* renamed from: d  reason: collision with root package name */
        public int f34499d;

        public f() {
            super();
            this.f34496a = null;
            this.f34498c = 0;
        }

        public boolean c() {
            return false;
        }

        public void d(Path path) {
            path.reset();
            d.b[] bVarArr = this.f34496a;
            if (bVarArr != null) {
                d.b.e(bVarArr, path);
            }
        }

        public d.b[] getPathData() {
            return this.f34496a;
        }

        public String getPathName() {
            return this.f34497b;
        }

        public void setPathData(d.b[] bVarArr) {
            if (!f3.d.b(this.f34496a, bVarArr)) {
                this.f34496a = f3.d.f(bVarArr);
            } else {
                f3.d.j(this.f34496a, bVarArr);
            }
        }

        public f(f fVar) {
            super();
            this.f34496a = null;
            this.f34498c = 0;
            this.f34497b = fVar.f34497b;
            this.f34499d = fVar.f34499d;
            this.f34496a = f3.d.f(fVar.f34496a);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        Drawable drawable = this.f34467w;
        if (drawable != null) {
            g3.a.g(drawable, resources, xmlPullParser, attributeSet, theme);
            return;
        }
        h hVar = this.f34468x;
        hVar.f34518b = new g();
        TypedArray k10 = e3.i.k(resources, theme, attributeSet, h5.a.f34441a);
        i(k10, xmlPullParser, theme);
        k10.recycle();
        hVar.f34517a = getChangingConfigurations();
        hVar.f34527k = true;
        e(resources, xmlPullParser, attributeSet, theme);
        this.f34469y = j(this.f34469y, hVar.f34519c, hVar.f34520d);
    }

    public i(h hVar) {
        this.B = true;
        this.D = new float[9];
        this.E = new Matrix();
        this.F = new Rect();
        this.f34468x = hVar;
        this.f34469y = j(this.f34469y, hVar.f34519c, hVar.f34520d);
    }

    /* loaded from: classes.dex */
    public static class c extends f {

        /* renamed from: e  reason: collision with root package name */
        public int[] f34471e;

        /* renamed from: f  reason: collision with root package name */
        public e3.d f34472f;

        /* renamed from: g  reason: collision with root package name */
        public float f34473g;

        /* renamed from: h  reason: collision with root package name */
        public e3.d f34474h;

        /* renamed from: i  reason: collision with root package name */
        public float f34475i;

        /* renamed from: j  reason: collision with root package name */
        public float f34476j;

        /* renamed from: k  reason: collision with root package name */
        public float f34477k;

        /* renamed from: l  reason: collision with root package name */
        public float f34478l;

        /* renamed from: m  reason: collision with root package name */
        public float f34479m;

        /* renamed from: n  reason: collision with root package name */
        public Paint.Cap f34480n;

        /* renamed from: o  reason: collision with root package name */
        public Paint.Join f34481o;

        /* renamed from: p  reason: collision with root package name */
        public float f34482p;

        public c() {
            this.f34473g = 0.0f;
            this.f34475i = 1.0f;
            this.f34476j = 1.0f;
            this.f34477k = 0.0f;
            this.f34478l = 1.0f;
            this.f34479m = 0.0f;
            this.f34480n = Paint.Cap.BUTT;
            this.f34481o = Paint.Join.MITER;
            this.f34482p = 4.0f;
        }

        @Override // h5.i.e
        public boolean a() {
            return this.f34474h.i() || this.f34472f.i();
        }

        @Override // h5.i.e
        public boolean b(int[] iArr) {
            return this.f34472f.j(iArr) | this.f34474h.j(iArr);
        }

        public final Paint.Cap e(int i10, Paint.Cap cap) {
            if (i10 != 0) {
                if (i10 != 1) {
                    return i10 != 2 ? cap : Paint.Cap.SQUARE;
                }
                return Paint.Cap.ROUND;
            }
            return Paint.Cap.BUTT;
        }

        public final Paint.Join f(int i10, Paint.Join join) {
            if (i10 != 0) {
                if (i10 != 1) {
                    return i10 != 2 ? join : Paint.Join.BEVEL;
                }
                return Paint.Join.ROUND;
            }
            return Paint.Join.MITER;
        }

        public void g(Resources resources, AttributeSet attributeSet, Resources.Theme theme, XmlPullParser xmlPullParser) {
            TypedArray k10 = e3.i.k(resources, theme, attributeSet, h5.a.f34443c);
            h(k10, xmlPullParser, theme);
            k10.recycle();
        }

        public float getFillAlpha() {
            return this.f34476j;
        }

        public int getFillColor() {
            return this.f34474h.e();
        }

        public float getStrokeAlpha() {
            return this.f34475i;
        }

        public int getStrokeColor() {
            return this.f34472f.e();
        }

        public float getStrokeWidth() {
            return this.f34473g;
        }

        public float getTrimPathEnd() {
            return this.f34478l;
        }

        public float getTrimPathOffset() {
            return this.f34479m;
        }

        public float getTrimPathStart() {
            return this.f34477k;
        }

        public final void h(TypedArray typedArray, XmlPullParser xmlPullParser, Resources.Theme theme) {
            this.f34471e = null;
            if (e3.i.j(xmlPullParser, "pathData")) {
                String string = typedArray.getString(0);
                if (string != null) {
                    this.f34497b = string;
                }
                String string2 = typedArray.getString(2);
                if (string2 != null) {
                    this.f34496a = f3.d.d(string2);
                }
                this.f34474h = e3.i.e(typedArray, xmlPullParser, theme, "fillColor", 1, 0);
                this.f34476j = e3.i.f(typedArray, xmlPullParser, "fillAlpha", 12, this.f34476j);
                this.f34480n = e(e3.i.g(typedArray, xmlPullParser, "strokeLineCap", 8, -1), this.f34480n);
                this.f34481o = f(e3.i.g(typedArray, xmlPullParser, "strokeLineJoin", 9, -1), this.f34481o);
                this.f34482p = e3.i.f(typedArray, xmlPullParser, "strokeMiterLimit", 10, this.f34482p);
                this.f34472f = e3.i.e(typedArray, xmlPullParser, theme, "strokeColor", 3, 0);
                this.f34475i = e3.i.f(typedArray, xmlPullParser, "strokeAlpha", 11, this.f34475i);
                this.f34473g = e3.i.f(typedArray, xmlPullParser, "strokeWidth", 4, this.f34473g);
                this.f34478l = e3.i.f(typedArray, xmlPullParser, "trimPathEnd", 6, this.f34478l);
                this.f34479m = e3.i.f(typedArray, xmlPullParser, "trimPathOffset", 7, this.f34479m);
                this.f34477k = e3.i.f(typedArray, xmlPullParser, "trimPathStart", 5, this.f34477k);
                this.f34498c = e3.i.g(typedArray, xmlPullParser, "fillType", 13, this.f34498c);
            }
        }

        public void setFillAlpha(float f10) {
            this.f34476j = f10;
        }

        public void setFillColor(int i10) {
            this.f34474h.k(i10);
        }

        public void setStrokeAlpha(float f10) {
            this.f34475i = f10;
        }

        public void setStrokeColor(int i10) {
            this.f34472f.k(i10);
        }

        public void setStrokeWidth(float f10) {
            this.f34473g = f10;
        }

        public void setTrimPathEnd(float f10) {
            this.f34478l = f10;
        }

        public void setTrimPathOffset(float f10) {
            this.f34479m = f10;
        }

        public void setTrimPathStart(float f10) {
            this.f34477k = f10;
        }

        public c(c cVar) {
            super(cVar);
            this.f34473g = 0.0f;
            this.f34475i = 1.0f;
            this.f34476j = 1.0f;
            this.f34477k = 0.0f;
            this.f34478l = 1.0f;
            this.f34479m = 0.0f;
            this.f34480n = Paint.Cap.BUTT;
            this.f34481o = Paint.Join.MITER;
            this.f34482p = 4.0f;
            this.f34471e = cVar.f34471e;
            this.f34472f = cVar.f34472f;
            this.f34473g = cVar.f34473g;
            this.f34475i = cVar.f34475i;
            this.f34474h = cVar.f34474h;
            this.f34498c = cVar.f34498c;
            this.f34476j = cVar.f34476j;
            this.f34477k = cVar.f34477k;
            this.f34478l = cVar.f34478l;
            this.f34479m = cVar.f34479m;
            this.f34480n = cVar.f34480n;
            this.f34481o = cVar.f34481o;
            this.f34482p = cVar.f34482p;
        }
    }

    /* loaded from: classes.dex */
    public static class g {

        /* renamed from: q  reason: collision with root package name */
        public static final Matrix f34500q = new Matrix();

        /* renamed from: a  reason: collision with root package name */
        public final Path f34501a;

        /* renamed from: b  reason: collision with root package name */
        public final Path f34502b;

        /* renamed from: c  reason: collision with root package name */
        public final Matrix f34503c;

        /* renamed from: d  reason: collision with root package name */
        public Paint f34504d;

        /* renamed from: e  reason: collision with root package name */
        public Paint f34505e;

        /* renamed from: f  reason: collision with root package name */
        public PathMeasure f34506f;

        /* renamed from: g  reason: collision with root package name */
        public int f34507g;

        /* renamed from: h  reason: collision with root package name */
        public final d f34508h;

        /* renamed from: i  reason: collision with root package name */
        public float f34509i;

        /* renamed from: j  reason: collision with root package name */
        public float f34510j;

        /* renamed from: k  reason: collision with root package name */
        public float f34511k;

        /* renamed from: l  reason: collision with root package name */
        public float f34512l;

        /* renamed from: m  reason: collision with root package name */
        public int f34513m;

        /* renamed from: n  reason: collision with root package name */
        public String f34514n;

        /* renamed from: o  reason: collision with root package name */
        public Boolean f34515o;

        /* renamed from: p  reason: collision with root package name */
        public final s.a<String, Object> f34516p;

        public g() {
            this.f34503c = new Matrix();
            this.f34509i = 0.0f;
            this.f34510j = 0.0f;
            this.f34511k = 0.0f;
            this.f34512l = 0.0f;
            this.f34513m = 255;
            this.f34514n = null;
            this.f34515o = null;
            this.f34516p = new s.a<>();
            this.f34508h = new d();
            this.f34501a = new Path();
            this.f34502b = new Path();
        }

        public static float a(float f10, float f11, float f12, float f13) {
            return (f10 * f13) - (f11 * f12);
        }

        public void b(Canvas canvas, int i10, int i11, ColorFilter colorFilter) {
            c(this.f34508h, f34500q, canvas, i10, i11, colorFilter);
        }

        public final void c(d dVar, Matrix matrix, Canvas canvas, int i10, int i11, ColorFilter colorFilter) {
            dVar.f34483a.set(matrix);
            dVar.f34483a.preConcat(dVar.f34492j);
            canvas.save();
            for (int i12 = 0; i12 < dVar.f34484b.size(); i12++) {
                e eVar = dVar.f34484b.get(i12);
                if (eVar instanceof d) {
                    c((d) eVar, dVar.f34483a, canvas, i10, i11, colorFilter);
                } else if (eVar instanceof f) {
                    d(dVar, (f) eVar, canvas, i10, i11, colorFilter);
                }
            }
            canvas.restore();
        }

        public final void d(d dVar, f fVar, Canvas canvas, int i10, int i11, ColorFilter colorFilter) {
            float f10 = i10 / this.f34511k;
            float f11 = i11 / this.f34512l;
            float min = Math.min(f10, f11);
            Matrix matrix = dVar.f34483a;
            this.f34503c.set(matrix);
            this.f34503c.postScale(f10, f11);
            float e10 = e(matrix);
            if (e10 == 0.0f) {
                return;
            }
            fVar.d(this.f34501a);
            Path path = this.f34501a;
            this.f34502b.reset();
            if (fVar.c()) {
                this.f34502b.setFillType(fVar.f34498c == 0 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD);
                this.f34502b.addPath(path, this.f34503c);
                canvas.clipPath(this.f34502b);
                return;
            }
            c cVar = (c) fVar;
            float f12 = cVar.f34477k;
            if (f12 != 0.0f || cVar.f34478l != 1.0f) {
                float f13 = cVar.f34479m;
                float f14 = (f12 + f13) % 1.0f;
                float f15 = (cVar.f34478l + f13) % 1.0f;
                if (this.f34506f == null) {
                    this.f34506f = new PathMeasure();
                }
                this.f34506f.setPath(this.f34501a, false);
                float length = this.f34506f.getLength();
                float f16 = f14 * length;
                float f17 = f15 * length;
                path.reset();
                if (f16 > f17) {
                    this.f34506f.getSegment(f16, length, path, true);
                    this.f34506f.getSegment(0.0f, f17, path, true);
                } else {
                    this.f34506f.getSegment(f16, f17, path, true);
                }
                path.rLineTo(0.0f, 0.0f);
            }
            this.f34502b.addPath(path, this.f34503c);
            if (cVar.f34474h.l()) {
                e3.d dVar2 = cVar.f34474h;
                if (this.f34505e == null) {
                    Paint paint = new Paint(1);
                    this.f34505e = paint;
                    paint.setStyle(Paint.Style.FILL);
                }
                Paint paint2 = this.f34505e;
                if (dVar2.h()) {
                    Shader f18 = dVar2.f();
                    f18.setLocalMatrix(this.f34503c);
                    paint2.setShader(f18);
                    paint2.setAlpha(Math.round(cVar.f34476j * 255.0f));
                } else {
                    paint2.setShader(null);
                    paint2.setAlpha(255);
                    paint2.setColor(i.a(dVar2.e(), cVar.f34476j));
                }
                paint2.setColorFilter(colorFilter);
                this.f34502b.setFillType(cVar.f34498c == 0 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD);
                canvas.drawPath(this.f34502b, paint2);
            }
            if (cVar.f34472f.l()) {
                e3.d dVar3 = cVar.f34472f;
                if (this.f34504d == null) {
                    Paint paint3 = new Paint(1);
                    this.f34504d = paint3;
                    paint3.setStyle(Paint.Style.STROKE);
                }
                Paint paint4 = this.f34504d;
                Paint.Join join = cVar.f34481o;
                if (join != null) {
                    paint4.setStrokeJoin(join);
                }
                Paint.Cap cap = cVar.f34480n;
                if (cap != null) {
                    paint4.setStrokeCap(cap);
                }
                paint4.setStrokeMiter(cVar.f34482p);
                if (dVar3.h()) {
                    Shader f19 = dVar3.f();
                    f19.setLocalMatrix(this.f34503c);
                    paint4.setShader(f19);
                    paint4.setAlpha(Math.round(cVar.f34475i * 255.0f));
                } else {
                    paint4.setShader(null);
                    paint4.setAlpha(255);
                    paint4.setColor(i.a(dVar3.e(), cVar.f34475i));
                }
                paint4.setColorFilter(colorFilter);
                paint4.setStrokeWidth(cVar.f34473g * min * e10);
                canvas.drawPath(this.f34502b, paint4);
            }
        }

        public final float e(Matrix matrix) {
            float[] fArr = {0.0f, 1.0f, 1.0f, 0.0f};
            matrix.mapVectors(fArr);
            float a10 = a(fArr[0], fArr[1], fArr[2], fArr[3]);
            float max = Math.max((float) Math.hypot(fArr[0], fArr[1]), (float) Math.hypot(fArr[2], fArr[3]));
            if (max > 0.0f) {
                return Math.abs(a10) / max;
            }
            return 0.0f;
        }

        public boolean f() {
            if (this.f34515o == null) {
                this.f34515o = Boolean.valueOf(this.f34508h.a());
            }
            return this.f34515o.booleanValue();
        }

        public boolean g(int[] iArr) {
            return this.f34508h.b(iArr);
        }

        public float getAlpha() {
            return getRootAlpha() / 255.0f;
        }

        public int getRootAlpha() {
            return this.f34513m;
        }

        public void setAlpha(float f10) {
            setRootAlpha((int) (f10 * 255.0f));
        }

        public void setRootAlpha(int i10) {
            this.f34513m = i10;
        }

        public g(g gVar) {
            this.f34503c = new Matrix();
            this.f34509i = 0.0f;
            this.f34510j = 0.0f;
            this.f34511k = 0.0f;
            this.f34512l = 0.0f;
            this.f34513m = 255;
            this.f34514n = null;
            this.f34515o = null;
            s.a<String, Object> aVar = new s.a<>();
            this.f34516p = aVar;
            this.f34508h = new d(gVar.f34508h, aVar);
            this.f34501a = new Path(gVar.f34501a);
            this.f34502b = new Path(gVar.f34502b);
            this.f34509i = gVar.f34509i;
            this.f34510j = gVar.f34510j;
            this.f34511k = gVar.f34511k;
            this.f34512l = gVar.f34512l;
            this.f34507g = gVar.f34507g;
            this.f34513m = gVar.f34513m;
            this.f34514n = gVar.f34514n;
            String str = gVar.f34514n;
            if (str != null) {
                aVar.put(str, this);
            }
            this.f34515o = gVar.f34515o;
        }
    }

    /* loaded from: classes.dex */
    public static class d extends e {

        /* renamed from: a  reason: collision with root package name */
        public final Matrix f34483a;

        /* renamed from: b  reason: collision with root package name */
        public final ArrayList<e> f34484b;

        /* renamed from: c  reason: collision with root package name */
        public float f34485c;

        /* renamed from: d  reason: collision with root package name */
        public float f34486d;

        /* renamed from: e  reason: collision with root package name */
        public float f34487e;

        /* renamed from: f  reason: collision with root package name */
        public float f34488f;

        /* renamed from: g  reason: collision with root package name */
        public float f34489g;

        /* renamed from: h  reason: collision with root package name */
        public float f34490h;

        /* renamed from: i  reason: collision with root package name */
        public float f34491i;

        /* renamed from: j  reason: collision with root package name */
        public final Matrix f34492j;

        /* renamed from: k  reason: collision with root package name */
        public int f34493k;

        /* renamed from: l  reason: collision with root package name */
        public int[] f34494l;

        /* renamed from: m  reason: collision with root package name */
        public String f34495m;

        public d(d dVar, s.a<String, Object> aVar) {
            super();
            f bVar;
            this.f34483a = new Matrix();
            this.f34484b = new ArrayList<>();
            this.f34485c = 0.0f;
            this.f34486d = 0.0f;
            this.f34487e = 0.0f;
            this.f34488f = 1.0f;
            this.f34489g = 1.0f;
            this.f34490h = 0.0f;
            this.f34491i = 0.0f;
            Matrix matrix = new Matrix();
            this.f34492j = matrix;
            this.f34495m = null;
            this.f34485c = dVar.f34485c;
            this.f34486d = dVar.f34486d;
            this.f34487e = dVar.f34487e;
            this.f34488f = dVar.f34488f;
            this.f34489g = dVar.f34489g;
            this.f34490h = dVar.f34490h;
            this.f34491i = dVar.f34491i;
            this.f34494l = dVar.f34494l;
            String str = dVar.f34495m;
            this.f34495m = str;
            this.f34493k = dVar.f34493k;
            if (str != null) {
                aVar.put(str, this);
            }
            matrix.set(dVar.f34492j);
            ArrayList<e> arrayList = dVar.f34484b;
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                e eVar = arrayList.get(i10);
                if (eVar instanceof d) {
                    this.f34484b.add(new d((d) eVar, aVar));
                } else {
                    if (eVar instanceof c) {
                        bVar = new c((c) eVar);
                    } else if (eVar instanceof b) {
                        bVar = new b((b) eVar);
                    } else {
                        throw new IllegalStateException("Unknown object in the tree!");
                    }
                    this.f34484b.add(bVar);
                    String str2 = bVar.f34497b;
                    if (str2 != null) {
                        aVar.put(str2, bVar);
                    }
                }
            }
        }

        @Override // h5.i.e
        public boolean a() {
            for (int i10 = 0; i10 < this.f34484b.size(); i10++) {
                if (this.f34484b.get(i10).a()) {
                    return true;
                }
            }
            return false;
        }

        @Override // h5.i.e
        public boolean b(int[] iArr) {
            boolean z10 = false;
            for (int i10 = 0; i10 < this.f34484b.size(); i10++) {
                z10 |= this.f34484b.get(i10).b(iArr);
            }
            return z10;
        }

        public void c(Resources resources, AttributeSet attributeSet, Resources.Theme theme, XmlPullParser xmlPullParser) {
            TypedArray k10 = e3.i.k(resources, theme, attributeSet, h5.a.f34442b);
            e(k10, xmlPullParser);
            k10.recycle();
        }

        public final void d() {
            this.f34492j.reset();
            this.f34492j.postTranslate(-this.f34486d, -this.f34487e);
            this.f34492j.postScale(this.f34488f, this.f34489g);
            this.f34492j.postRotate(this.f34485c, 0.0f, 0.0f);
            this.f34492j.postTranslate(this.f34490h + this.f34486d, this.f34491i + this.f34487e);
        }

        public final void e(TypedArray typedArray, XmlPullParser xmlPullParser) {
            this.f34494l = null;
            this.f34485c = e3.i.f(typedArray, xmlPullParser, "rotation", 5, this.f34485c);
            this.f34486d = typedArray.getFloat(1, this.f34486d);
            this.f34487e = typedArray.getFloat(2, this.f34487e);
            this.f34488f = e3.i.f(typedArray, xmlPullParser, "scaleX", 3, this.f34488f);
            this.f34489g = e3.i.f(typedArray, xmlPullParser, "scaleY", 4, this.f34489g);
            this.f34490h = e3.i.f(typedArray, xmlPullParser, "translateX", 6, this.f34490h);
            this.f34491i = e3.i.f(typedArray, xmlPullParser, "translateY", 7, this.f34491i);
            String string = typedArray.getString(0);
            if (string != null) {
                this.f34495m = string;
            }
            d();
        }

        public String getGroupName() {
            return this.f34495m;
        }

        public Matrix getLocalMatrix() {
            return this.f34492j;
        }

        public float getPivotX() {
            return this.f34486d;
        }

        public float getPivotY() {
            return this.f34487e;
        }

        public float getRotation() {
            return this.f34485c;
        }

        public float getScaleX() {
            return this.f34488f;
        }

        public float getScaleY() {
            return this.f34489g;
        }

        public float getTranslateX() {
            return this.f34490h;
        }

        public float getTranslateY() {
            return this.f34491i;
        }

        public void setPivotX(float f10) {
            if (f10 != this.f34486d) {
                this.f34486d = f10;
                d();
            }
        }

        public void setPivotY(float f10) {
            if (f10 != this.f34487e) {
                this.f34487e = f10;
                d();
            }
        }

        public void setRotation(float f10) {
            if (f10 != this.f34485c) {
                this.f34485c = f10;
                d();
            }
        }

        public void setScaleX(float f10) {
            if (f10 != this.f34488f) {
                this.f34488f = f10;
                d();
            }
        }

        public void setScaleY(float f10) {
            if (f10 != this.f34489g) {
                this.f34489g = f10;
                d();
            }
        }

        public void setTranslateX(float f10) {
            if (f10 != this.f34490h) {
                this.f34490h = f10;
                d();
            }
        }

        public void setTranslateY(float f10) {
            if (f10 != this.f34491i) {
                this.f34491i = f10;
                d();
            }
        }

        public d() {
            super();
            this.f34483a = new Matrix();
            this.f34484b = new ArrayList<>();
            this.f34485c = 0.0f;
            this.f34486d = 0.0f;
            this.f34487e = 0.0f;
            this.f34488f = 1.0f;
            this.f34489g = 1.0f;
            this.f34490h = 0.0f;
            this.f34491i = 0.0f;
            this.f34492j = new Matrix();
            this.f34495m = null;
        }
    }
}

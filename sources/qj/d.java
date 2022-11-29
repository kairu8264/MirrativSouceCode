package qj;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.os.Build;
import android.text.TextPaint;
import android.util.Log;
import e3.h;
import wi.l;

/* loaded from: classes3.dex */
public class d {

    /* renamed from: a  reason: collision with root package name */
    public final ColorStateList f49535a;

    /* renamed from: b  reason: collision with root package name */
    public final ColorStateList f49536b;

    /* renamed from: c  reason: collision with root package name */
    public final ColorStateList f49537c;

    /* renamed from: d  reason: collision with root package name */
    public final ColorStateList f49538d;

    /* renamed from: e  reason: collision with root package name */
    public final String f49539e;

    /* renamed from: f  reason: collision with root package name */
    public final int f49540f;

    /* renamed from: g  reason: collision with root package name */
    public final int f49541g;

    /* renamed from: h  reason: collision with root package name */
    public final boolean f49542h;

    /* renamed from: i  reason: collision with root package name */
    public final float f49543i;

    /* renamed from: j  reason: collision with root package name */
    public final float f49544j;

    /* renamed from: k  reason: collision with root package name */
    public final float f49545k;

    /* renamed from: l  reason: collision with root package name */
    public final boolean f49546l;

    /* renamed from: m  reason: collision with root package name */
    public final float f49547m;

    /* renamed from: n  reason: collision with root package name */
    public float f49548n;

    /* renamed from: o  reason: collision with root package name */
    public final int f49549o;

    /* renamed from: p  reason: collision with root package name */
    public boolean f49550p = false;

    /* renamed from: q  reason: collision with root package name */
    public Typeface f49551q;

    /* loaded from: classes3.dex */
    public class a extends h.d {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ f f49552a;

        public a(f fVar) {
            this.f49552a = fVar;
        }

        @Override // e3.h.d
        public void onFontRetrievalFailed(int i10) {
            d.this.f49550p = true;
            this.f49552a.a(i10);
        }

        @Override // e3.h.d
        public void onFontRetrieved(Typeface typeface) {
            d dVar = d.this;
            dVar.f49551q = Typeface.create(typeface, dVar.f49540f);
            d.this.f49550p = true;
            this.f49552a.b(d.this.f49551q, false);
        }
    }

    /* loaded from: classes3.dex */
    public class b extends f {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ TextPaint f49554a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ f f49555b;

        public b(TextPaint textPaint, f fVar) {
            this.f49554a = textPaint;
            this.f49555b = fVar;
        }

        @Override // qj.f
        public void a(int i10) {
            this.f49555b.a(i10);
        }

        @Override // qj.f
        public void b(Typeface typeface, boolean z10) {
            d.this.l(this.f49554a, typeface);
            this.f49555b.b(typeface, z10);
        }
    }

    public d(Context context, int i10) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(i10, l.X5);
        this.f49548n = obtainStyledAttributes.getDimension(l.Y5, 0.0f);
        this.f49535a = c.a(context, obtainStyledAttributes, l.f58946b6);
        this.f49536b = c.a(context, obtainStyledAttributes, l.f58955c6);
        this.f49537c = c.a(context, obtainStyledAttributes, l.f58964d6);
        this.f49540f = obtainStyledAttributes.getInt(l.f58937a6, 0);
        this.f49541g = obtainStyledAttributes.getInt(l.Z5, 1);
        int e10 = c.e(obtainStyledAttributes, l.f59018j6, l.f59009i6);
        this.f49549o = obtainStyledAttributes.getResourceId(e10, 0);
        this.f49539e = obtainStyledAttributes.getString(e10);
        this.f49542h = obtainStyledAttributes.getBoolean(l.f59027k6, false);
        this.f49538d = c.a(context, obtainStyledAttributes, l.f58973e6);
        this.f49543i = obtainStyledAttributes.getFloat(l.f58982f6, 0.0f);
        this.f49544j = obtainStyledAttributes.getFloat(l.f58991g6, 0.0f);
        this.f49545k = obtainStyledAttributes.getFloat(l.f59000h6, 0.0f);
        obtainStyledAttributes.recycle();
        if (Build.VERSION.SDK_INT >= 21) {
            TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(i10, l.f58971e4);
            int i11 = l.f58980f4;
            this.f49546l = obtainStyledAttributes2.hasValue(i11);
            this.f49547m = obtainStyledAttributes2.getFloat(i11, 0.0f);
            obtainStyledAttributes2.recycle();
            return;
        }
        this.f49546l = false;
        this.f49547m = 0.0f;
    }

    public final void d() {
        String str;
        if (this.f49551q == null && (str = this.f49539e) != null) {
            this.f49551q = Typeface.create(str, this.f49540f);
        }
        if (this.f49551q == null) {
            int i10 = this.f49541g;
            if (i10 == 1) {
                this.f49551q = Typeface.SANS_SERIF;
            } else if (i10 == 2) {
                this.f49551q = Typeface.SERIF;
            } else if (i10 != 3) {
                this.f49551q = Typeface.DEFAULT;
            } else {
                this.f49551q = Typeface.MONOSPACE;
            }
            this.f49551q = Typeface.create(this.f49551q, this.f49540f);
        }
    }

    public Typeface e() {
        d();
        return this.f49551q;
    }

    public Typeface f(Context context) {
        if (this.f49550p) {
            return this.f49551q;
        }
        if (!context.isRestricted()) {
            try {
                Typeface h10 = h.h(context, this.f49549o);
                this.f49551q = h10;
                if (h10 != null) {
                    this.f49551q = Typeface.create(h10, this.f49540f);
                }
            } catch (Resources.NotFoundException | UnsupportedOperationException unused) {
            } catch (Exception e10) {
                Log.d("TextAppearance", "Error loading font " + this.f49539e, e10);
            }
        }
        d();
        this.f49550p = true;
        return this.f49551q;
    }

    public void g(Context context, TextPaint textPaint, f fVar) {
        l(textPaint, e());
        h(context, new b(textPaint, fVar));
    }

    public void h(Context context, f fVar) {
        if (i(context)) {
            f(context);
        } else {
            d();
        }
        int i10 = this.f49549o;
        if (i10 == 0) {
            this.f49550p = true;
        }
        if (this.f49550p) {
            fVar.b(this.f49551q, true);
            return;
        }
        try {
            h.j(context, i10, new a(fVar), null);
        } catch (Resources.NotFoundException unused) {
            this.f49550p = true;
            fVar.a(1);
        } catch (Exception e10) {
            Log.d("TextAppearance", "Error loading font " + this.f49539e, e10);
            this.f49550p = true;
            fVar.a(-3);
        }
    }

    public final boolean i(Context context) {
        if (e.a()) {
            return true;
        }
        int i10 = this.f49549o;
        return (i10 != 0 ? h.c(context, i10) : null) != null;
    }

    public void j(Context context, TextPaint textPaint, f fVar) {
        k(context, textPaint, fVar);
        ColorStateList colorStateList = this.f49535a;
        textPaint.setColor(colorStateList != null ? colorStateList.getColorForState(textPaint.drawableState, colorStateList.getDefaultColor()) : -16777216);
        float f10 = this.f49545k;
        float f11 = this.f49543i;
        float f12 = this.f49544j;
        ColorStateList colorStateList2 = this.f49538d;
        textPaint.setShadowLayer(f10, f11, f12, colorStateList2 != null ? colorStateList2.getColorForState(textPaint.drawableState, colorStateList2.getDefaultColor()) : 0);
    }

    public void k(Context context, TextPaint textPaint, f fVar) {
        if (i(context)) {
            l(textPaint, f(context));
        } else {
            g(context, textPaint, fVar);
        }
    }

    public void l(TextPaint textPaint, Typeface typeface) {
        textPaint.setTypeface(typeface);
        int i10 = (~typeface.getStyle()) & this.f49540f;
        textPaint.setFakeBoldText((i10 & 1) != 0);
        textPaint.setTextSkewX((i10 & 2) != 0 ? -0.25f : 0.0f);
        textPaint.setTextSize(this.f49548n);
        if (Build.VERSION.SDK_INT < 21 || !this.f49546l) {
            return;
        }
        textPaint.setLetterSpacing(this.f49547m);
    }
}

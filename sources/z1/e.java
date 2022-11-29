package z1;

import android.text.BoringLayout;
import android.text.Layout;
import android.text.TextPaint;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: a  reason: collision with root package name */
    public final wn.f f62442a;

    /* renamed from: b  reason: collision with root package name */
    public final wn.f f62443b;

    /* renamed from: c  reason: collision with root package name */
    public final wn.f f62444c;

    /* loaded from: classes.dex */
    public static final class a extends jo.q implements io.a<BoringLayout.Metrics> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ int f62445w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ CharSequence f62446x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ TextPaint f62447y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(int i10, CharSequence charSequence, TextPaint textPaint) {
            super(0);
            this.f62445w = i10;
            this.f62446x = charSequence;
            this.f62447y = textPaint;
        }

        @Override // io.a
        /* renamed from: a */
        public final BoringLayout.Metrics invoke() {
            return z1.a.f62428a.b(this.f62446x, this.f62447y, t.e(this.f62445w));
        }
    }

    /* loaded from: classes.dex */
    public static final class b extends jo.q implements io.a<Float> {

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ CharSequence f62449x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ TextPaint f62450y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(CharSequence charSequence, TextPaint textPaint) {
            super(0);
            this.f62449x = charSequence;
            this.f62450y = textPaint;
        }

        @Override // io.a
        /* renamed from: a */
        public final Float invoke() {
            float desiredWidth;
            boolean e10;
            BoringLayout.Metrics a10 = e.this.a();
            if (a10 != null) {
                desiredWidth = a10.width;
            } else {
                CharSequence charSequence = this.f62449x;
                desiredWidth = Layout.getDesiredWidth(charSequence, 0, charSequence.length(), this.f62450y);
            }
            e10 = g.e(desiredWidth, this.f62449x, this.f62450y);
            if (e10) {
                desiredWidth += 0.5f;
            }
            return Float.valueOf(desiredWidth);
        }
    }

    /* loaded from: classes.dex */
    public static final class c extends jo.q implements io.a<Float> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ CharSequence f62451w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ TextPaint f62452x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(CharSequence charSequence, TextPaint textPaint) {
            super(0);
            this.f62451w = charSequence;
            this.f62452x = textPaint;
        }

        @Override // io.a
        /* renamed from: a */
        public final Float invoke() {
            return Float.valueOf(g.c(this.f62451w, this.f62452x));
        }
    }

    public e(CharSequence charSequence, TextPaint textPaint, int i10) {
        jo.p.h(charSequence, "charSequence");
        jo.p.h(textPaint, "textPaint");
        wn.i iVar = wn.i.NONE;
        this.f62442a = wn.g.b(iVar, new a(i10, charSequence, textPaint));
        this.f62443b = wn.g.b(iVar, new c(charSequence, textPaint));
        this.f62444c = wn.g.b(iVar, new b(charSequence, textPaint));
    }

    public final BoringLayout.Metrics a() {
        return (BoringLayout.Metrics) this.f62442a.getValue();
    }

    public final float b() {
        return ((Number) this.f62444c.getValue()).floatValue();
    }

    public final float c() {
        return ((Number) this.f62443b.getValue()).floatValue();
    }
}

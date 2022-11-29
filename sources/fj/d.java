package fj;

import android.animation.TypeEvaluator;
import android.graphics.drawable.Drawable;
import android.util.Property;

/* loaded from: classes3.dex */
public interface d {

    /* loaded from: classes3.dex */
    public static class b implements TypeEvaluator<e> {

        /* renamed from: b  reason: collision with root package name */
        public static final TypeEvaluator<e> f31987b = new b();

        /* renamed from: a  reason: collision with root package name */
        public final e f31988a = new e();

        @Override // android.animation.TypeEvaluator
        /* renamed from: a */
        public e evaluate(float f10, e eVar, e eVar2) {
            this.f31988a.a(oj.a.c(eVar.f31991a, eVar2.f31991a, f10), oj.a.c(eVar.f31992b, eVar2.f31992b, f10), oj.a.c(eVar.f31993c, eVar2.f31993c, f10));
            return this.f31988a;
        }
    }

    /* loaded from: classes3.dex */
    public static class c extends Property<d, e> {

        /* renamed from: a  reason: collision with root package name */
        public static final Property<d, e> f31989a = new c("circularReveal");

        public c(String str) {
            super(e.class, str);
        }

        @Override // android.util.Property
        /* renamed from: a */
        public e get(d dVar) {
            return dVar.getRevealInfo();
        }

        @Override // android.util.Property
        /* renamed from: b */
        public void set(d dVar, e eVar) {
            dVar.setRevealInfo(eVar);
        }
    }

    /* renamed from: fj.d$d  reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public static class C0354d extends Property<d, Integer> {

        /* renamed from: a  reason: collision with root package name */
        public static final Property<d, Integer> f31990a = new C0354d("circularRevealScrimColor");

        public C0354d(String str) {
            super(Integer.class, str);
        }

        @Override // android.util.Property
        /* renamed from: a */
        public Integer get(d dVar) {
            return Integer.valueOf(dVar.getCircularRevealScrimColor());
        }

        @Override // android.util.Property
        /* renamed from: b */
        public void set(d dVar, Integer num) {
            dVar.setCircularRevealScrimColor(num.intValue());
        }
    }

    /* loaded from: classes3.dex */
    public static class e {

        /* renamed from: a  reason: collision with root package name */
        public float f31991a;

        /* renamed from: b  reason: collision with root package name */
        public float f31992b;

        /* renamed from: c  reason: collision with root package name */
        public float f31993c;

        public void a(float f10, float f11, float f12) {
            this.f31991a = f10;
            this.f31992b = f11;
            this.f31993c = f12;
        }

        public e() {
        }

        public e(float f10, float f11, float f12) {
            this.f31991a = f10;
            this.f31992b = f11;
            this.f31993c = f12;
        }
    }

    void a();

    void b();

    int getCircularRevealScrimColor();

    e getRevealInfo();

    void setCircularRevealOverlayDrawable(Drawable drawable);

    void setCircularRevealScrimColor(int i10);

    void setRevealInfo(e eVar);
}

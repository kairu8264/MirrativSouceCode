package k6;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import jo.q;
import k6.b;
import uo.p;
import wn.l;
import wn.v;

/* loaded from: classes.dex */
public interface k<T extends View> extends i {

    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: k6.k$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C0536a extends q implements io.l<Throwable, v> {

            /* renamed from: w  reason: collision with root package name */
            public final /* synthetic */ k<T> f38447w;

            /* renamed from: x  reason: collision with root package name */
            public final /* synthetic */ ViewTreeObserver f38448x;

            /* renamed from: y  reason: collision with root package name */
            public final /* synthetic */ b f38449y;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0536a(k<T> kVar, ViewTreeObserver viewTreeObserver, b bVar) {
                super(1);
                this.f38447w = kVar;
                this.f38448x = viewTreeObserver;
                this.f38449y = bVar;
            }

            public final void a(Throwable th2) {
                a.g(this.f38447w, this.f38448x, this.f38449y);
            }

            @Override // io.l
            public /* bridge */ /* synthetic */ v invoke(Throwable th2) {
                a(th2);
                return v.f59242a;
            }
        }

        /* loaded from: classes.dex */
        public static final class b implements ViewTreeObserver.OnPreDrawListener {

            /* renamed from: w  reason: collision with root package name */
            public boolean f38450w;

            /* renamed from: x  reason: collision with root package name */
            public final /* synthetic */ k<T> f38451x;

            /* renamed from: y  reason: collision with root package name */
            public final /* synthetic */ ViewTreeObserver f38452y;

            /* renamed from: z  reason: collision with root package name */
            public final /* synthetic */ p<h> f38453z;

            /* JADX WARN: Multi-variable type inference failed */
            public b(k<T> kVar, ViewTreeObserver viewTreeObserver, p<? super h> pVar) {
                this.f38451x = kVar;
                this.f38452y = viewTreeObserver;
                this.f38453z = pVar;
            }

            @Override // android.view.ViewTreeObserver.OnPreDrawListener
            public boolean onPreDraw() {
                h e10 = a.e(this.f38451x);
                if (e10 != null) {
                    a.g(this.f38451x, this.f38452y, this);
                    if (!this.f38450w) {
                        this.f38450w = true;
                        p<h> pVar = this.f38453z;
                        l.a aVar = wn.l.f59224w;
                        pVar.resumeWith(wn.l.a(e10));
                    }
                }
                return true;
            }
        }

        public static <T extends View> k6.b c(k<T> kVar, int i10, int i11, int i12) {
            if (i10 == -2) {
                return b.a.f38437a;
            }
            int i13 = i10 - i12;
            if (i13 > 0) {
                return new b.C0535b(i13);
            }
            int i14 = i11 - i12;
            if (i14 > 0) {
                return new b.C0535b(i14);
            }
            return null;
        }

        public static <T extends View> k6.b d(k<T> kVar) {
            ViewGroup.LayoutParams layoutParams = kVar.a().getLayoutParams();
            return c(kVar, layoutParams == null ? -1 : layoutParams.height, kVar.a().getHeight(), kVar.c() ? kVar.a().getPaddingTop() + kVar.a().getPaddingBottom() : 0);
        }

        public static <T extends View> h e(k<T> kVar) {
            k6.b d10;
            k6.b f10 = f(kVar);
            if (f10 == null || (d10 = d(kVar)) == null) {
                return null;
            }
            return new h(f10, d10);
        }

        public static <T extends View> k6.b f(k<T> kVar) {
            ViewGroup.LayoutParams layoutParams = kVar.a().getLayoutParams();
            return c(kVar, layoutParams == null ? -1 : layoutParams.width, kVar.a().getWidth(), kVar.c() ? kVar.a().getPaddingLeft() + kVar.a().getPaddingRight() : 0);
        }

        public static <T extends View> void g(k<T> kVar, ViewTreeObserver viewTreeObserver, ViewTreeObserver.OnPreDrawListener onPreDrawListener) {
            if (viewTreeObserver.isAlive()) {
                viewTreeObserver.removeOnPreDrawListener(onPreDrawListener);
            } else {
                kVar.a().getViewTreeObserver().removeOnPreDrawListener(onPreDrawListener);
            }
        }

        public static <T extends View> Object h(k<T> kVar, ao.d<? super h> dVar) {
            h e10 = e(kVar);
            if (e10 == null) {
                uo.q qVar = new uo.q(bo.b.b(dVar), 1);
                qVar.y();
                ViewTreeObserver viewTreeObserver = kVar.a().getViewTreeObserver();
                b bVar = new b(kVar, viewTreeObserver, qVar);
                viewTreeObserver.addOnPreDrawListener(bVar);
                qVar.M(new C0536a(kVar, viewTreeObserver, bVar));
                Object t10 = qVar.t();
                if (t10 == bo.c.c()) {
                    co.h.c(dVar);
                }
                return t10;
            }
            return e10;
        }
    }

    T a();

    boolean c();
}

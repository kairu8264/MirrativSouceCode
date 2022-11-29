package l3;

import android.graphics.Typeface;
import android.os.Handler;
import l3.e;
import l3.f;

/* loaded from: classes.dex */
public class a {

    /* renamed from: a  reason: collision with root package name */
    public final f.c f39503a;

    /* renamed from: b  reason: collision with root package name */
    public final Handler f39504b;

    /* renamed from: l3.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public class RunnableC0561a implements Runnable {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ f.c f39505w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ Typeface f39506x;

        public RunnableC0561a(f.c cVar, Typeface typeface) {
            this.f39505w = cVar;
            this.f39506x = typeface;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f39505w.b(this.f39506x);
        }
    }

    /* loaded from: classes.dex */
    public class b implements Runnable {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ f.c f39508w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ int f39509x;

        public b(f.c cVar, int i10) {
            this.f39508w = cVar;
            this.f39509x = i10;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f39508w.a(this.f39509x);
        }
    }

    public a(f.c cVar, Handler handler) {
        this.f39503a = cVar;
        this.f39504b = handler;
    }

    public final void a(int i10) {
        this.f39504b.post(new b(this.f39503a, i10));
    }

    public void b(e.C0562e c0562e) {
        if (c0562e.a()) {
            c(c0562e.f39532a);
        } else {
            a(c0562e.f39533b);
        }
    }

    public final void c(Typeface typeface) {
        this.f39504b.post(new RunnableC0561a(this.f39503a, typeface));
    }
}

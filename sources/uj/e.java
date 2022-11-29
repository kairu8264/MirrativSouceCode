package uj;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.lang.ref.WeakReference;

/* loaded from: classes3.dex */
public class e {

    /* renamed from: e  reason: collision with root package name */
    public static e f55952e;

    /* renamed from: a  reason: collision with root package name */
    public final Object f55953a = new Object();

    /* renamed from: b  reason: collision with root package name */
    public final Handler f55954b = new Handler(Looper.getMainLooper(), new a());

    /* renamed from: c  reason: collision with root package name */
    public c f55955c;

    /* renamed from: d  reason: collision with root package name */
    public c f55956d;

    /* loaded from: classes3.dex */
    public class a implements Handler.Callback {
        public a() {
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            if (message.what != 0) {
                return false;
            }
            e.this.c((c) message.obj);
            return true;
        }
    }

    /* loaded from: classes3.dex */
    public interface b {
        void a(int i10);
    }

    /* loaded from: classes3.dex */
    public static class c {

        /* renamed from: a  reason: collision with root package name */
        public final WeakReference<b> f55958a;

        /* renamed from: b  reason: collision with root package name */
        public int f55959b;

        /* renamed from: c  reason: collision with root package name */
        public boolean f55960c;

        public boolean a(b bVar) {
            return bVar != null && this.f55958a.get() == bVar;
        }
    }

    public static e b() {
        if (f55952e == null) {
            f55952e = new e();
        }
        return f55952e;
    }

    public final boolean a(c cVar, int i10) {
        b bVar = cVar.f55958a.get();
        if (bVar != null) {
            this.f55954b.removeCallbacksAndMessages(cVar);
            bVar.a(i10);
            return true;
        }
        return false;
    }

    public void c(c cVar) {
        synchronized (this.f55953a) {
            if (this.f55955c == cVar || this.f55956d == cVar) {
                a(cVar, 2);
            }
        }
    }

    public final boolean d(b bVar) {
        c cVar = this.f55955c;
        return cVar != null && cVar.a(bVar);
    }

    public void e(b bVar) {
        synchronized (this.f55953a) {
            if (d(bVar)) {
                c cVar = this.f55955c;
                if (!cVar.f55960c) {
                    cVar.f55960c = true;
                    this.f55954b.removeCallbacksAndMessages(cVar);
                }
            }
        }
    }

    public void f(b bVar) {
        synchronized (this.f55953a) {
            if (d(bVar)) {
                c cVar = this.f55955c;
                if (cVar.f55960c) {
                    cVar.f55960c = false;
                    g(cVar);
                }
            }
        }
    }

    public final void g(c cVar) {
        int i10 = cVar.f55959b;
        if (i10 == -2) {
            return;
        }
        if (i10 <= 0) {
            i10 = i10 == -1 ? 1500 : 2750;
        }
        this.f55954b.removeCallbacksAndMessages(cVar);
        Handler handler = this.f55954b;
        handler.sendMessageDelayed(Message.obtain(handler, 0, cVar), i10);
    }
}

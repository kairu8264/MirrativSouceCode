package te;

import android.os.Handler;
import com.dena.mirrorman.net.api.response.DisplayTimingResponse;
import io.l;
import jo.p;
import wn.v;

/* loaded from: classes2.dex */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    public final int f53600a;

    /* renamed from: b  reason: collision with root package name */
    public final DisplayTimingResponse f53601b;

    /* renamed from: c  reason: collision with root package name */
    public final l<Integer, v> f53602c;

    /* renamed from: d  reason: collision with root package name */
    public final Handler f53603d;

    /* renamed from: e  reason: collision with root package name */
    public int f53604e;

    /* renamed from: f  reason: collision with root package name */
    public final a f53605f;

    /* loaded from: classes2.dex */
    public static final class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            b.this.f53602c.invoke(Integer.valueOf(b.this.g()));
            b.this.f53604e++;
            b.this.f53603d.postDelayed(this, b.this.h());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public b(int i10, DisplayTimingResponse displayTimingResponse, l<? super Integer, v> lVar) {
        p.h(displayTimingResponse, "displayTiming");
        p.h(lVar, "listener");
        this.f53600a = i10;
        this.f53601b = displayTimingResponse;
        this.f53602c = lVar;
        this.f53603d = new Handler();
        this.f53605f = new a();
    }

    public final void f() {
        this.f53603d.removeCallbacksAndMessages(null);
    }

    public final int g() {
        return this.f53604e % this.f53600a;
    }

    public final long h() {
        int next;
        if (g() == 0) {
            next = this.f53601b.getNonDisplay();
        } else {
            next = this.f53601b.getNext();
        }
        return next * 1000;
    }

    public final void i() {
        if (this.f53600a == 0) {
            return;
        }
        this.f53603d.postDelayed(this.f53605f, this.f53601b.getLiveStart() * 1000);
    }
}

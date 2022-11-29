package nj;

import android.content.Context;
import android.graphics.Typeface;
import android.text.TextPaint;
import java.lang.ref.WeakReference;

/* loaded from: classes3.dex */
public class h {

    /* renamed from: c  reason: collision with root package name */
    public float f43656c;

    /* renamed from: f  reason: collision with root package name */
    public qj.d f43659f;

    /* renamed from: a  reason: collision with root package name */
    public final TextPaint f43654a = new TextPaint(1);

    /* renamed from: b  reason: collision with root package name */
    public final qj.f f43655b = new a();

    /* renamed from: d  reason: collision with root package name */
    public boolean f43657d = true;

    /* renamed from: e  reason: collision with root package name */
    public WeakReference<b> f43658e = new WeakReference<>(null);

    /* loaded from: classes3.dex */
    public class a extends qj.f {
        public a() {
        }

        @Override // qj.f
        public void a(int i10) {
            h.this.f43657d = true;
            b bVar = (b) h.this.f43658e.get();
            if (bVar != null) {
                bVar.a();
            }
        }

        @Override // qj.f
        public void b(Typeface typeface, boolean z10) {
            if (z10) {
                return;
            }
            h.this.f43657d = true;
            b bVar = (b) h.this.f43658e.get();
            if (bVar != null) {
                bVar.a();
            }
        }
    }

    /* loaded from: classes3.dex */
    public interface b {
        void a();

        int[] getState();

        boolean onStateChange(int[] iArr);
    }

    public h(b bVar) {
        g(bVar);
    }

    public final float c(CharSequence charSequence) {
        if (charSequence == null) {
            return 0.0f;
        }
        return this.f43654a.measureText(charSequence, 0, charSequence.length());
    }

    public qj.d d() {
        return this.f43659f;
    }

    public TextPaint e() {
        return this.f43654a;
    }

    public float f(String str) {
        if (!this.f43657d) {
            return this.f43656c;
        }
        float c10 = c(str);
        this.f43656c = c10;
        this.f43657d = false;
        return c10;
    }

    public void g(b bVar) {
        this.f43658e = new WeakReference<>(bVar);
    }

    public void h(qj.d dVar, Context context) {
        if (this.f43659f != dVar) {
            this.f43659f = dVar;
            if (dVar != null) {
                dVar.k(context, this.f43654a, this.f43655b);
                b bVar = this.f43658e.get();
                if (bVar != null) {
                    this.f43654a.drawableState = bVar.getState();
                }
                dVar.j(context, this.f43654a, this.f43655b);
                this.f43657d = true;
            }
            b bVar2 = this.f43658e.get();
            if (bVar2 != null) {
                bVar2.a();
                bVar2.onStateChange(bVar2.getState());
            }
        }
    }

    public void i(boolean z10) {
        this.f43657d = z10;
    }

    public void j(Context context) {
        this.f43659f.j(context, this.f43654a, this.f43655b);
    }
}

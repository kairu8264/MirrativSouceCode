package ai;

import android.app.Activity;
import android.content.Context;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import com.google.android.gms.internal.ads.zzabi;
import java.util.Iterator;
import java.util.LinkedList;

/* loaded from: classes3.dex */
public abstract class r implements q {
    public static volatile r0 P;
    public double F;
    public double G;
    public double H;
    public float I;
    public float J;
    public float K;
    public float L;
    public DisplayMetrics O;

    /* renamed from: w  reason: collision with root package name */
    public MotionEvent f9261w;

    /* renamed from: x  reason: collision with root package name */
    public final LinkedList<MotionEvent> f9262x = new LinkedList<>();

    /* renamed from: y  reason: collision with root package name */
    public long f9263y = 0;

    /* renamed from: z  reason: collision with root package name */
    public long f9264z = 0;
    public long A = 0;
    public long B = 0;
    public long C = 0;
    public long D = 0;
    public long E = 0;
    public boolean M = false;
    public boolean N = false;

    public r(Context context) {
        try {
            if (((Boolean) ft.c().c(ox.R1)).booleanValue()) {
                m74.b();
            } else {
                s0.a(P);
            }
            this.O = context.getResources().getDisplayMetrics();
        } catch (Throwable unused) {
        }
    }

    @Override // ai.q
    public final String a(Context context, String str, View view) {
        return n(context, str, 3, view, null, null);
    }

    @Override // ai.q
    public final synchronized void c(MotionEvent motionEvent) {
        Long l10;
        if (this.M) {
            m();
            this.M = false;
        }
        int action = motionEvent.getAction();
        if (action == 0) {
            this.F = 0.0d;
            this.G = motionEvent.getRawX();
            this.H = motionEvent.getRawY();
        } else if (action == 1 || action == 2) {
            double rawX = motionEvent.getRawX();
            double rawY = motionEvent.getRawY();
            double d10 = rawX - this.G;
            double d11 = rawY - this.H;
            this.F += Math.sqrt((d10 * d10) + (d11 * d11));
            this.G = rawX;
            this.H = rawY;
        }
        int action2 = motionEvent.getAction();
        if (action2 != 0) {
            try {
                if (action2 == 1) {
                    MotionEvent obtain = MotionEvent.obtain(motionEvent);
                    this.f9261w = obtain;
                    this.f9262x.add(obtain);
                    if (this.f9262x.size() > 6) {
                        this.f9262x.remove().recycle();
                    }
                    this.A++;
                    this.C = l(new Throwable().getStackTrace());
                } else if (action2 == 2) {
                    this.f9264z += motionEvent.getHistorySize() + 1;
                    t0 k10 = k(motionEvent);
                    Long l11 = k10.f10046e;
                    if (l11 != null && k10.f10049h != null) {
                        this.D += l11.longValue() + k10.f10049h.longValue();
                    }
                    if (this.O != null && (l10 = k10.f10047f) != null && k10.f10050i != null) {
                        this.E += l10.longValue() + k10.f10050i.longValue();
                    }
                } else if (action2 == 3) {
                    this.B++;
                }
            } catch (zzabi unused) {
            }
        } else {
            this.I = motionEvent.getX();
            this.J = motionEvent.getY();
            this.K = motionEvent.getRawX();
            this.L = motionEvent.getRawY();
            this.f9263y++;
        }
        this.N = true;
    }

    @Override // ai.q
    public final String d(Context context) {
        if (!u0.f()) {
            return n(context, null, 1, null, null, null);
        }
        throw new IllegalStateException("The caller must not be called from the UI thread.");
    }

    @Override // ai.q
    public final String e(Context context, View view, Activity activity) {
        return n(context, null, 2, view, null, null);
    }

    @Override // ai.q
    public final String f(Context context, String str, View view, Activity activity) {
        return n(context, str, 3, view, activity, null);
    }

    @Override // ai.q
    public final synchronized void g(int i10, int i11, int i12) {
        if (this.f9261w != null) {
            if (((Boolean) ft.c().c(ox.E1)).booleanValue()) {
                m();
            } else {
                this.f9261w.recycle();
            }
        }
        DisplayMetrics displayMetrics = this.O;
        if (displayMetrics != null) {
            float f10 = displayMetrics.density;
            this.f9261w = MotionEvent.obtain(0L, i12, 1, i10 * f10, i11 * f10, 0.0f, 0.0f, 0, 0.0f, 0.0f, 0, 0);
        } else {
            this.f9261w = null;
        }
        this.N = false;
    }

    public abstract c64 h(Context context, v54 v54Var);

    public abstract c64 i(Context context, View view, Activity activity);

    public abstract c64 j(Context context, View view, Activity activity);

    public abstract t0 k(MotionEvent motionEvent) throws zzabi;

    public abstract long l(StackTraceElement[] stackTraceElementArr) throws zzabi;

    public final void m() {
        this.C = 0L;
        this.f9263y = 0L;
        this.f9264z = 0L;
        this.A = 0L;
        this.B = 0L;
        this.D = 0L;
        this.E = 0L;
        if (this.f9262x.size() > 0) {
            Iterator<MotionEvent> it = this.f9262x.iterator();
            while (it.hasNext()) {
                it.next().recycle();
            }
            this.f9262x.clear();
        } else {
            MotionEvent motionEvent = this.f9261w;
            if (motionEvent != null) {
                motionEvent.recycle();
            }
        }
        this.f9261w = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00b4 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String n(android.content.Context r20, java.lang.String r21, int r22, android.view.View r23, android.app.Activity r24, byte[] r25) {
        /*
            Method dump skipped, instructions count: 285
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ai.r.n(android.content.Context, java.lang.String, int, android.view.View, android.app.Activity, byte[]):java.lang.String");
    }
}

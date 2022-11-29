package yg;

import ai.ft;
import ai.hk0;
import ai.hs1;
import ai.ms1;
import ai.ox;
import ai.t43;
import ai.uj0;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.PointF;
import android.net.Uri;
import android.os.Handler;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import android.view.WindowManager;
import com.google.android.exoplayer2.metadata.icy.IcyHeaders;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes3.dex */
public final class w {

    /* renamed from: a  reason: collision with root package name */
    public final Context f61979a;

    /* renamed from: b  reason: collision with root package name */
    public final ms1 f61980b;

    /* renamed from: c  reason: collision with root package name */
    public String f61981c;

    /* renamed from: d  reason: collision with root package name */
    public String f61982d;

    /* renamed from: e  reason: collision with root package name */
    public String f61983e;

    /* renamed from: f  reason: collision with root package name */
    public String f61984f;

    /* renamed from: g  reason: collision with root package name */
    public int f61985g;

    /* renamed from: h  reason: collision with root package name */
    public int f61986h;

    /* renamed from: i  reason: collision with root package name */
    public PointF f61987i;

    /* renamed from: j  reason: collision with root package name */
    public PointF f61988j;

    /* renamed from: k  reason: collision with root package name */
    public Handler f61989k;

    /* renamed from: l  reason: collision with root package name */
    public Runnable f61990l;

    public w(Context context) {
        this.f61985g = 0;
        this.f61990l = new Runnable(this) { // from class: yg.g

            /* renamed from: w  reason: collision with root package name */
            public final w f61884w;

            {
                this.f61884w = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.f61884w.r();
            }
        };
        this.f61979a = context;
        this.f61986h = ViewConfiguration.get(context).getScaledTouchSlop();
        wg.t.r().a();
        this.f61989k = wg.t.r().b();
        this.f61980b = wg.t.n().b();
    }

    public static final int u(List<String> list, String str, boolean z10) {
        if (z10) {
            list.add(str);
            return list.size() - 1;
        }
        return -1;
    }

    public final void a(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        int historySize = motionEvent.getHistorySize();
        int pointerCount = motionEvent.getPointerCount();
        if (actionMasked == 0) {
            this.f61985g = 0;
            this.f61987i = new PointF(motionEvent.getX(0), motionEvent.getY(0));
            return;
        }
        int i10 = this.f61985g;
        if (i10 == -1) {
            return;
        }
        if (i10 == 0) {
            if (actionMasked == 5) {
                this.f61985g = 5;
                this.f61988j = new PointF(motionEvent.getX(1), motionEvent.getY(1));
                this.f61989k.postDelayed(this.f61990l, ((Long) ft.c().c(ox.f7959c3)).longValue());
            }
        } else if (i10 == 5) {
            if (pointerCount == 2) {
                if (actionMasked != 2) {
                    return;
                }
                boolean z10 = false;
                for (int i11 = 0; i11 < historySize; i11++) {
                    z10 |= !s(motionEvent.getHistoricalX(0, i11), motionEvent.getHistoricalY(0, i11), motionEvent.getHistoricalX(1, i11), motionEvent.getHistoricalY(1, i11));
                }
                if (s(motionEvent.getX(), motionEvent.getY(), motionEvent.getX(1), motionEvent.getY(1)) && !z10) {
                    return;
                }
            }
            this.f61985g = -1;
            this.f61989k.removeCallbacks(this.f61990l);
        }
    }

    public final void b() {
        try {
            if (!(this.f61979a instanceof Activity)) {
                uj0.e("Can not create dialog without Activity Context");
                return;
            }
            String str = "Creative preview (enabled)";
            if (true == TextUtils.isEmpty(wg.t.n().i())) {
                str = "Creative preview";
            }
            String str2 = true != wg.t.n().m() ? "Troubleshooting" : "Troubleshooting (enabled)";
            ArrayList arrayList = new ArrayList();
            final int u10 = u(arrayList, "Ad information", true);
            final int u11 = u(arrayList, str, true);
            final int u12 = u(arrayList, str2, true);
            boolean booleanValue = ((Boolean) ft.c().c(ox.E6)).booleanValue();
            final int u13 = u(arrayList, "Open ad inspector", booleanValue);
            final int u14 = u(arrayList, "Ad inspector settings", booleanValue);
            AlertDialog.Builder builder = new AlertDialog.Builder(this.f61979a, wg.t.f().m());
            builder.setTitle("Select a debug mode").setItems((CharSequence[]) arrayList.toArray(new String[0]), new DialogInterface.OnClickListener(this, u10, u11, u12, u13, u14) { // from class: yg.n
                public final int A;
                public final int B;

                /* renamed from: w  reason: collision with root package name */
                public final w f61921w;

                /* renamed from: x  reason: collision with root package name */
                public final int f61922x;

                /* renamed from: y  reason: collision with root package name */
                public final int f61923y;

                /* renamed from: z  reason: collision with root package name */
                public final int f61924z;

                {
                    this.f61921w = this;
                    this.f61922x = u10;
                    this.f61923y = u11;
                    this.f61924z = u12;
                    this.A = u13;
                    this.B = u14;
                }

                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i10) {
                    this.f61921w.q(this.f61922x, this.f61923y, this.f61924z, this.A, this.B, dialogInterface, i10);
                }
            });
            builder.create().show();
        } catch (WindowManager.BadTokenException e10) {
            p1.l("", e10);
        }
    }

    public final void c(String str) {
        this.f61982d = str;
    }

    public final void d(String str) {
        this.f61983e = str;
    }

    public final void e(String str) {
        this.f61981c = str;
    }

    public final void f(String str) {
        this.f61984f = str;
    }

    public final /* synthetic */ void g() {
        a0 n10 = wg.t.n();
        Context context = this.f61979a;
        String str = this.f61982d;
        String str2 = this.f61983e;
        String str3 = this.f61984f;
        boolean m10 = n10.m();
        n10.l(n10.e(context, str, str2));
        if (n10.m()) {
            if (!m10 && !TextUtils.isEmpty(str3)) {
                n10.h(context, str2, str3, str);
            }
            uj0.a("Device is linked for debug signals.");
            n10.n(context, "The device is successfully linked for troubleshooting.", false, true);
            return;
        }
        n10.f(context, str, str2);
    }

    public final /* synthetic */ void h() {
        a0 n10 = wg.t.n();
        Context context = this.f61979a;
        String str = this.f61982d;
        String str2 = this.f61983e;
        if (!n10.d(context, str, str2)) {
            n10.n(context, "In-app preview failed to load because of a system error. Please try again later.", true, true);
        } else if ("2".equals(n10.f61851f)) {
            uj0.a("Creative is not pushed for this device.");
            n10.n(context, "There was no creative pushed from DFP to the device.", false, false);
        } else if (IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE.equals(n10.f61851f)) {
            uj0.a("The app is not linked for creative preview.");
            n10.f(context, str, str2);
        } else if ("0".equals(n10.f61851f)) {
            uj0.a("Device is linked for in app preview.");
            n10.n(context, "The device is successfully linked for creative preview.", false, true);
        }
    }

    public final /* synthetic */ void i(t43 t43Var) {
        if (!wg.t.n().e(this.f61979a, this.f61982d, this.f61983e)) {
            wg.t.n().f(this.f61979a, this.f61982d, this.f61983e);
        } else {
            t43Var.execute(new Runnable(this) { // from class: yg.l

                /* renamed from: w  reason: collision with root package name */
                public final w f61909w;

                {
                    this.f61909w = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    this.f61909w.j();
                }
            });
        }
    }

    public final /* synthetic */ void j() {
        t(this.f61979a);
    }

    public final /* synthetic */ void k() {
        t(this.f61979a);
    }

    public final /* synthetic */ void l(t43 t43Var) {
        if (!wg.t.n().e(this.f61979a, this.f61982d, this.f61983e)) {
            wg.t.n().f(this.f61979a, this.f61982d, this.f61983e);
        } else {
            t43Var.execute(new Runnable(this) { // from class: yg.m

                /* renamed from: w  reason: collision with root package name */
                public final w f61917w;

                {
                    this.f61917w = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    this.f61917w.m();
                }
            });
        }
    }

    public final /* synthetic */ void m() {
        wg.t.n().c(this.f61979a);
    }

    public final /* synthetic */ void n() {
        wg.t.n().c(this.f61979a);
    }

    public final /* synthetic */ void o(String str, DialogInterface dialogInterface, int i10) {
        wg.t.d();
        d2.p(this.f61979a, Intent.createChooser(new Intent("android.intent.action.SEND").setType("text/plain").putExtra("android.intent.extra.TEXT", str), "Share via"));
    }

    public final /* synthetic */ void p(AtomicInteger atomicInteger, int i10, int i11, int i12, DialogInterface dialogInterface, int i13) {
        if (atomicInteger.get() != i10) {
            if (atomicInteger.get() == i11) {
                this.f61980b.e(hs1.SHAKE);
            } else if (atomicInteger.get() == i12) {
                this.f61980b.e(hs1.FLICK);
            } else {
                this.f61980b.e(hs1.NONE);
            }
        }
        b();
    }

    public final /* synthetic */ void q(int i10, int i11, int i12, int i13, int i14, DialogInterface dialogInterface, int i15) {
        if (i15 != i10) {
            if (i15 == i11) {
                uj0.a("Debug mode [Creative Preview] selected.");
                hk0.f4878a.execute(new Runnable(this) { // from class: yg.j

                    /* renamed from: w  reason: collision with root package name */
                    public final w f61899w;

                    {
                        this.f61899w = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f61899w.h();
                    }
                });
            } else if (i15 == i12) {
                uj0.a("Debug mode [Troubleshooting] selected.");
                hk0.f4878a.execute(new Runnable(this) { // from class: yg.k

                    /* renamed from: w  reason: collision with root package name */
                    public final w f61907w;

                    {
                        this.f61907w = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f61907w.g();
                    }
                });
            } else if (i15 == i13) {
                final t43 t43Var = hk0.f4882e;
                t43 t43Var2 = hk0.f4878a;
                if (this.f61980b.n()) {
                    t43Var.execute(new Runnable(this) { // from class: yg.u

                        /* renamed from: w  reason: collision with root package name */
                        public final w f61949w;

                        {
                            this.f61949w = this;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            this.f61949w.n();
                        }
                    });
                } else {
                    t43Var2.execute(new Runnable(this, t43Var) { // from class: yg.v

                        /* renamed from: w  reason: collision with root package name */
                        public final w f61976w;

                        /* renamed from: x  reason: collision with root package name */
                        public final t43 f61977x;

                        {
                            this.f61976w = this;
                            this.f61977x = t43Var;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            this.f61976w.l(this.f61977x);
                        }
                    });
                }
            } else if (i15 == i14) {
                final t43 t43Var3 = hk0.f4882e;
                t43 t43Var4 = hk0.f4878a;
                if (this.f61980b.n()) {
                    t43Var3.execute(new Runnable(this) { // from class: yg.h

                        /* renamed from: w  reason: collision with root package name */
                        public final w f61890w;

                        {
                            this.f61890w = this;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            this.f61890w.k();
                        }
                    });
                } else {
                    t43Var4.execute(new Runnable(this, t43Var3) { // from class: yg.i

                        /* renamed from: w  reason: collision with root package name */
                        public final w f61895w;

                        /* renamed from: x  reason: collision with root package name */
                        public final t43 f61896x;

                        {
                            this.f61895w = this;
                            this.f61896x = t43Var3;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            this.f61895w.i(this.f61896x);
                        }
                    });
                }
            }
        } else if (!(this.f61979a instanceof Activity)) {
            uj0.e("Can not create dialog without Activity Context");
        } else {
            String str = this.f61981c;
            final String str2 = "No debug information";
            if (!TextUtils.isEmpty(str)) {
                Uri build = new Uri.Builder().encodedQuery(str.replaceAll("\\+", "%20")).build();
                StringBuilder sb2 = new StringBuilder();
                wg.t.d();
                Map<String, String> r10 = d2.r(build);
                for (String str3 : r10.keySet()) {
                    sb2.append(str3);
                    sb2.append(" = ");
                    sb2.append(r10.get(str3));
                    sb2.append("\n\n");
                }
                String trim = sb2.toString().trim();
                if (!TextUtils.isEmpty(trim)) {
                    str2 = trim;
                }
            }
            AlertDialog.Builder builder = new AlertDialog.Builder(this.f61979a);
            builder.setMessage(str2);
            builder.setTitle("Ad Information");
            builder.setPositiveButton("Share", new DialogInterface.OnClickListener(this, str2) { // from class: yg.s

                /* renamed from: w  reason: collision with root package name */
                public final w f61939w;

                /* renamed from: x  reason: collision with root package name */
                public final String f61940x;

                {
                    this.f61939w = this;
                    this.f61940x = str2;
                }

                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface2, int i16) {
                    this.f61939w.o(this.f61940x, dialogInterface2, i16);
                }
            });
            builder.setNegativeButton("Close", t.f61947w);
            builder.create().show();
        }
    }

    public final /* synthetic */ void r() {
        this.f61985g = 4;
        b();
    }

    public final boolean s(float f10, float f11, float f12, float f13) {
        return Math.abs(this.f61987i.x - f10) < ((float) this.f61986h) && Math.abs(this.f61987i.y - f11) < ((float) this.f61986h) && Math.abs(this.f61988j.x - f12) < ((float) this.f61986h) && Math.abs(this.f61988j.y - f13) < ((float) this.f61986h);
    }

    public final void t(Context context) {
        ArrayList arrayList = new ArrayList();
        int u10 = u(arrayList, "None", true);
        final int u11 = u(arrayList, "Shake", true);
        final int u12 = u(arrayList, "Flick", true);
        hs1 hs1Var = hs1.NONE;
        int ordinal = this.f61980b.f().ordinal();
        final int i10 = ordinal != 1 ? ordinal != 2 ? u10 : u12 : u11;
        AlertDialog.Builder builder = new AlertDialog.Builder(context, wg.t.f().m());
        final AtomicInteger atomicInteger = new AtomicInteger(i10);
        builder.setTitle("Setup gesture");
        builder.setSingleChoiceItems((CharSequence[]) arrayList.toArray(new String[0]), i10, new DialogInterface.OnClickListener(atomicInteger) { // from class: yg.o

            /* renamed from: w  reason: collision with root package name */
            public final AtomicInteger f61931w;

            {
                this.f61931w = atomicInteger;
            }

            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i11) {
                this.f61931w.set(i11);
            }
        });
        builder.setNegativeButton("Dismiss", new DialogInterface.OnClickListener(this) { // from class: yg.p

            /* renamed from: w  reason: collision with root package name */
            public final w f61932w;

            {
                this.f61932w = this;
            }

            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i11) {
                this.f61932w.b();
            }
        });
        builder.setPositiveButton("Save", new DialogInterface.OnClickListener(this, atomicInteger, i10, u11, u12) { // from class: yg.q
            public final int A;

            /* renamed from: w  reason: collision with root package name */
            public final w f61933w;

            /* renamed from: x  reason: collision with root package name */
            public final AtomicInteger f61934x;

            /* renamed from: y  reason: collision with root package name */
            public final int f61935y;

            /* renamed from: z  reason: collision with root package name */
            public final int f61936z;

            {
                this.f61933w = this;
                this.f61934x = atomicInteger;
                this.f61935y = i10;
                this.f61936z = u11;
                this.A = u12;
            }

            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i11) {
                this.f61933w.p(this.f61934x, this.f61935y, this.f61936z, this.A, dialogInterface, i11);
            }
        });
        builder.setOnCancelListener(new DialogInterface.OnCancelListener(this) { // from class: yg.r

            /* renamed from: w  reason: collision with root package name */
            public final w f61938w;

            {
                this.f61938w = this;
            }

            @Override // android.content.DialogInterface.OnCancelListener
            public final void onCancel(DialogInterface dialogInterface) {
                this.f61938w.b();
            }
        });
        builder.create().show();
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder(100);
        sb2.append("{Dialog: ");
        sb2.append(this.f61981c);
        sb2.append(",DebugSignal: ");
        sb2.append(this.f61984f);
        sb2.append(",AFMA Version: ");
        sb2.append(this.f61983e);
        sb2.append(",Ad Unit ID: ");
        sb2.append(this.f61982d);
        sb2.append("}");
        return sb2.toString();
    }

    public w(Context context, String str) {
        this(context);
        this.f61981c = str;
    }
}

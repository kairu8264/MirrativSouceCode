package nh;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.Resources;
import android.util.Log;
import android.util.TypedValue;
import android.widget.ProgressBar;
import b3.j;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.GoogleApiActivity;
import com.mirrativ.llstream.protocol.v1.topic.TopicConstant;
import ph.h0;
import ph.i0;

/* loaded from: classes3.dex */
public class d extends e {

    /* renamed from: c  reason: collision with root package name */
    public String f43539c;

    /* renamed from: e  reason: collision with root package name */
    public static final Object f43537e = new Object();

    /* renamed from: f  reason: collision with root package name */
    public static final d f43538f = new d();

    /* renamed from: d  reason: collision with root package name */
    public static final int f43536d = e.f43540a;

    public static d m() {
        return f43538f;
    }

    @Override // nh.e
    public Intent b(Context context, int i10, String str) {
        return super.b(context, i10, str);
    }

    @Override // nh.e
    public PendingIntent c(Context context, int i10, int i11) {
        return super.c(context, i10, i11);
    }

    @Override // nh.e
    public final String e(int i10) {
        return super.e(i10);
    }

    @Override // nh.e
    public int g(Context context) {
        return super.g(context);
    }

    @Override // nh.e
    public int h(Context context, int i10) {
        return super.h(context, i10);
    }

    @Override // nh.e
    public final boolean j(int i10) {
        return super.j(i10);
    }

    public Dialog k(Activity activity, int i10, int i11, DialogInterface.OnCancelListener onCancelListener) {
        return p(activity, i10, rh.e0.b(activity, b(activity, i10, "d"), i11), onCancelListener);
    }

    public PendingIntent l(Context context, ConnectionResult connectionResult) {
        if (connectionResult.U()) {
            return connectionResult.S();
        }
        return c(context, connectionResult.p(), 0);
    }

    public boolean n(Activity activity, int i10, int i11, DialogInterface.OnCancelListener onCancelListener) {
        Dialog k10 = k(activity, i10, i11, onCancelListener);
        if (k10 == null) {
            return false;
        }
        s(activity, k10, "GooglePlayServicesErrorDialog", onCancelListener);
        return true;
    }

    public void o(Context context, int i10) {
        t(context, i10, null, d(context, i10, 0, TopicConstant.EXTEND_AVC_NDR));
    }

    public final Dialog p(Context context, int i10, rh.e0 e0Var, DialogInterface.OnCancelListener onCancelListener) {
        if (i10 == 0) {
            return null;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(16843529, typedValue, true);
        AlertDialog.Builder builder = "Theme.Dialog.Alert".equals(context.getResources().getResourceEntryName(typedValue.resourceId)) ? new AlertDialog.Builder(context, 5) : null;
        if (builder == null) {
            builder = new AlertDialog.Builder(context);
        }
        builder.setMessage(rh.b0.d(context, i10));
        if (onCancelListener != null) {
            builder.setOnCancelListener(onCancelListener);
        }
        String c10 = rh.b0.c(context, i10);
        if (c10 != null) {
            builder.setPositiveButton(c10, e0Var);
        }
        String g10 = rh.b0.g(context, i10);
        if (g10 != null) {
            builder.setTitle(g10);
        }
        Log.w("GoogleApiAvailability", String.format("Creating dialog for Google Play services availability issue. ConnectionResult=%s", Integer.valueOf(i10)), new IllegalArgumentException());
        return builder.create();
    }

    public final Dialog q(Activity activity, DialogInterface.OnCancelListener onCancelListener) {
        ProgressBar progressBar = new ProgressBar(activity, null, 16842874);
        progressBar.setIndeterminate(true);
        progressBar.setVisibility(0);
        AlertDialog.Builder builder = new AlertDialog.Builder(activity);
        builder.setView(progressBar);
        builder.setMessage(rh.b0.d(activity, 18));
        builder.setPositiveButton("", (DialogInterface.OnClickListener) null);
        AlertDialog create = builder.create();
        s(activity, create, "GooglePlayServicesUpdatingDialog", onCancelListener);
        return create;
    }

    public final i0 r(Context context, h0 h0Var) {
        IntentFilter intentFilter = new IntentFilter("android.intent.action.PACKAGE_ADDED");
        intentFilter.addDataScheme("package");
        i0 i0Var = new i0(h0Var);
        context.registerReceiver(i0Var, intentFilter);
        i0Var.a(context);
        if (i(context, "com.google.android.gms")) {
            return i0Var;
        }
        h0Var.a();
        i0Var.b();
        return null;
    }

    public final void s(Activity activity, Dialog dialog, String str, DialogInterface.OnCancelListener onCancelListener) {
        try {
            if (activity instanceof androidx.fragment.app.h) {
                j.B3(dialog, onCancelListener).z3(((androidx.fragment.app.h) activity).a3(), str);
                return;
            }
        } catch (NoClassDefFoundError unused) {
        }
        b.a(dialog, onCancelListener).show(activity.getFragmentManager(), str);
    }

    @TargetApi(20)
    public final void t(Context context, int i10, String str, PendingIntent pendingIntent) {
        int i11;
        String str2;
        Log.w("GoogleApiAvailability", String.format("GMS core API Availability. ConnectionResult=%s, tag=%s", Integer.valueOf(i10), null), new IllegalArgumentException());
        if (i10 == 18) {
            u(context);
        } else if (pendingIntent == null) {
            if (i10 == 6) {
                Log.w("GoogleApiAvailability", "Missing resolution for ConnectionResult.RESOLUTION_REQUIRED. Call GoogleApiAvailability#showErrorNotification(Context, ConnectionResult) instead.");
            }
        } else {
            String f10 = rh.b0.f(context, i10);
            String e10 = rh.b0.e(context, i10);
            Resources resources = context.getResources();
            NotificationManager notificationManager = (NotificationManager) rh.p.i(context.getSystemService("notification"));
            j.e F = new j.e(context).x(true).j(true).r(f10).F(new j.c().m(e10));
            if (vh.j.e(context)) {
                rh.p.l(vh.n.g());
                F.D(context.getApplicationInfo().icon).A(2);
                if (vh.j.f(context)) {
                    F.a(lh.a.common_full_open_on_phone, resources.getString(lh.b.common_open_on_phone), pendingIntent);
                } else {
                    F.p(pendingIntent);
                }
            } else {
                F.D(17301642).H(resources.getString(lh.b.common_google_play_services_notification_ticker)).L(System.currentTimeMillis()).p(pendingIntent).q(e10);
            }
            if (vh.n.k()) {
                rh.p.l(vh.n.k());
                synchronized (f43537e) {
                    str2 = this.f43539c;
                }
                if (str2 == null) {
                    str2 = "com.google.android.gms.availability";
                    NotificationChannel notificationChannel = notificationManager.getNotificationChannel("com.google.android.gms.availability");
                    String b10 = rh.b0.b(context);
                    if (notificationChannel == null) {
                        notificationManager.createNotificationChannel(new NotificationChannel("com.google.android.gms.availability", b10, 4));
                    } else if (!b10.contentEquals(notificationChannel.getName())) {
                        notificationChannel.setName(b10);
                        notificationManager.createNotificationChannel(notificationChannel);
                    }
                }
                F.l(str2);
            }
            Notification c10 = F.c();
            if (i10 == 1 || i10 == 2 || i10 == 3) {
                g.f43545b.set(false);
                i11 = 10436;
            } else {
                i11 = 39789;
            }
            notificationManager.notify(i11, c10);
        }
    }

    public final void u(Context context) {
        new k(this, context).sendEmptyMessageDelayed(1, 120000L);
    }

    public final boolean v(Activity activity, ph.g gVar, int i10, int i11, DialogInterface.OnCancelListener onCancelListener) {
        Dialog p10 = p(activity, i10, rh.e0.c(gVar, b(activity, i10, "d"), 2), onCancelListener);
        if (p10 == null) {
            return false;
        }
        s(activity, p10, "GooglePlayServicesErrorDialog", onCancelListener);
        return true;
    }

    public final boolean w(Context context, ConnectionResult connectionResult, int i10) {
        PendingIntent l10;
        if (xh.a.a(context) || (l10 = l(context, connectionResult)) == null) {
            return false;
        }
        t(context, connectionResult.p(), null, di.e.a(context, 0, GoogleApiActivity.a(context, l10, i10, true), di.e.f29657a | 134217728));
        return true;
    }
}

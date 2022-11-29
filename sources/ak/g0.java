package ak;

import android.annotation.TargetApi;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.os.RemoteException;
import com.dena.mirrorman.clientlog.logs.ActionLogBase;
import com.google.android.play.core.assetpacks.ExtractionForegroundService;

/* loaded from: classes3.dex */
public final class g0 extends dk.o0 {
    public final n1 A;
    public final NotificationManager B;

    /* renamed from: w  reason: collision with root package name */
    public final dk.f f13365w = new dk.f("AssetPackExtractionService");

    /* renamed from: x  reason: collision with root package name */
    public final Context f13366x;

    /* renamed from: y  reason: collision with root package name */
    public final o0 f13367y;

    /* renamed from: z  reason: collision with root package name */
    public final h4 f13368z;

    public g0(Context context, o0 o0Var, h4 h4Var, n1 n1Var) {
        this.f13366x = context;
        this.f13367y = o0Var;
        this.f13368z = h4Var;
        this.A = n1Var;
        this.B = (NotificationManager) context.getSystemService("notification");
    }

    @Override // dk.p0
    public final void F4(Bundle bundle, dk.q0 q0Var) throws RemoteException {
        z0(bundle, q0Var);
    }

    @Override // dk.p0
    public final void J3(Bundle bundle, dk.q0 q0Var) throws RemoteException {
        this.f13365w.a("clearAssetPackStorage AIDL call", new Object[0]);
        if (dk.v.b(this.f13366x) && dk.v.a(this.f13366x)) {
            this.f13367y.M();
            q0Var.E0(new Bundle());
            return;
        }
        q0Var.g0(new Bundle());
    }

    @TargetApi(26)
    public final synchronized void s0(String str) {
        if (str == null) {
            str = "File downloads by Play";
        }
        this.B.createNotificationChannel(new NotificationChannel("playcore-assetpacks-service-notification-channel", str, 2));
    }

    public final synchronized void z0(Bundle bundle, dk.q0 q0Var) throws RemoteException {
        Notification.Builder priority;
        int i10;
        this.f13365w.a("updateServiceState AIDL call", new Object[0]);
        if (dk.v.b(this.f13366x) && dk.v.a(this.f13366x)) {
            int i11 = bundle.getInt(ActionLogBase.ACTION_TYPE);
            this.A.c(q0Var);
            if (i11 != 1) {
                if (i11 == 2) {
                    this.f13368z.o(false);
                    this.A.b();
                    return;
                }
                this.f13365w.b("Unknown action type received: %d", Integer.valueOf(i11));
                q0Var.g0(new Bundle());
                return;
            }
            int i12 = Build.VERSION.SDK_INT;
            if (i12 >= 26) {
                s0(bundle.getString("notification_channel_name"));
            }
            this.f13368z.o(true);
            n1 n1Var = this.A;
            String string = bundle.getString("notification_title");
            String string2 = bundle.getString("notification_subtext");
            long j10 = bundle.getLong("notification_timeout", 600000L);
            Parcelable parcelable = bundle.getParcelable("notification_on_click_intent");
            if (i12 >= 26) {
                priority = new Notification.Builder(this.f13366x, "playcore-assetpacks-service-notification-channel").setTimeoutAfter(j10);
            } else {
                priority = new Notification.Builder(this.f13366x).setPriority(-2);
            }
            if (parcelable instanceof PendingIntent) {
                priority.setContentIntent((PendingIntent) parcelable);
            }
            Notification.Builder ongoing = priority.setSmallIcon(17301633).setOngoing(false);
            if (string == null) {
                string = "Downloading additional file";
            }
            Notification.Builder contentTitle = ongoing.setContentTitle(string);
            if (string2 == null) {
                string2 = "Transferring";
            }
            contentTitle.setSubText(string2);
            if (i12 >= 21 && (i10 = bundle.getInt("notification_color")) != 0) {
                priority.setColor(i10).setVisibility(-1);
            }
            n1Var.a(priority.build());
            this.f13366x.bindService(new Intent(this.f13366x, ExtractionForegroundService.class), this.A, 1);
            return;
        }
        q0Var.g0(new Bundle());
    }
}

package hb;

import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.widget.RemoteViews;
import b3.j;
import com.bumptech.glide.load.engine.GlideException;
import com.dena.mirrorman.ControlReceiver;
import com.dena.mirrorman.net.api.response.App;
import com.dena.mirrorman.net.api.response.live.LiveTimeline;
import com.dena.mirrorman.net.glide.GlideApp;
import java.util.List;

/* loaded from: classes2.dex */
public final class p1 {

    /* renamed from: a  reason: collision with root package name */
    public static final p1 f34946a = new p1();

    /* loaded from: classes2.dex */
    public static final class a implements e8.g<Bitmap> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ RemoteViews f34947w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ Context f34948x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ int f34949y;

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ Notification f34950z;

        public a(RemoteViews remoteViews, Context context, int i10, Notification notification) {
            this.f34947w = remoteViews;
            this.f34948x = context;
            this.f34949y = i10;
            this.f34950z = notification;
        }

        @Override // e8.g
        public boolean a(GlideException glideException, Object obj, f8.j<Bitmap> jVar, boolean z10) {
            jo.p.h(obj, "model");
            jo.p.h(jVar, "target");
            return false;
        }

        @Override // e8.g
        /* renamed from: b */
        public boolean h(Bitmap bitmap, Object obj, f8.j<Bitmap> jVar, m7.a aVar, boolean z10) {
            jo.p.h(bitmap, "resource");
            jo.p.h(obj, "model");
            jo.p.h(jVar, "target");
            jo.p.h(aVar, "dataSource");
            this.f34947w.setImageViewBitmap(w1.background, bitmap.copy(Bitmap.Config.ARGB_8888, true));
            Object systemService = this.f34948x.getSystemService("notification");
            jo.p.f(systemService, "null cannot be cast to non-null type android.app.NotificationManager");
            ((NotificationManager) systemService).notify(this.f34949y, this.f34950z);
            return true;
        }
    }

    public final Notification a(Context context, Intent intent, Intent intent2, String str, String str2, String str3, int i10) {
        jo.p.h(context, "context");
        jo.p.h(intent2, "stopBroadcastIntent");
        jo.p.h(str, "name");
        jo.p.h(str2, "title");
        RemoteViews remoteViews = new RemoteViews(context.getPackageName(), x1.notification_bg_play);
        if (intent != null) {
            remoteViews.setOnClickPendingIntent(w1.button, PendingIntent.getBroadcast(context, 0, intent2, 201326592));
        }
        int i11 = w1.f35027t3;
        remoteViews.setTextViewText(i11, str + " / " + str2);
        j.e o10 = new j.e(context, context.getString(b2.f34717e)).D(z1.ic_notification_view).z(true).o(remoteViews);
        jo.p.g(o10, "Builder(context, context… .setContent(contentView)");
        if (intent != null) {
            o10.p(PendingIntent.getActivity(context, 0, intent, 335544320));
        }
        Notification c10 = o10.c();
        jo.p.g(c10, "builder.build()");
        if (str3 == null) {
            remoteViews.setImageViewBitmap(w1.background, null);
        } else {
            GlideApp.with(context).asBitmap().load(str3).addListener((e8.g<Bitmap>) new a(remoteViews, context, i10, c10)).submit();
        }
        return c10;
    }

    public final String b(List<LiveTimeline> list, long j10, long j11, long j12) {
        String str;
        if (list == null) {
            return null;
        }
        long j13 = 1000;
        long j14 = j10 * j13;
        if (j12 > j11 * j13) {
            return null;
        }
        loop0: while (true) {
            str = null;
            for (LiveTimeline liveTimeline : list) {
                long component1 = liveTimeline.component1();
                App.AppParams component5 = liveTimeline.component5();
                if (j12 < (component1 * j13) - j14) {
                    break loop0;
                } else if (component5 != null) {
                    str = component5.getAppId();
                }
            }
        }
        return str;
    }

    public final Intent c(Context context) {
        Intent intent = new Intent(context, ControlReceiver.class);
        intent.setAction("play_live_control");
        return intent;
    }

    public final Intent d(Context context) {
        Intent intent = new Intent(context, ControlReceiver.class);
        intent.setAction("play_vod_control");
        return intent;
    }
}

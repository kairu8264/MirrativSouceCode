package nd;

import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.Context;
import java.util.List;

/* loaded from: classes2.dex */
public final class u0 {

    /* renamed from: a  reason: collision with root package name */
    public static final a f42221a = new a(null);

    /* loaded from: classes2.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }

        /* JADX WARN: Code restructure failed: missing block: B:10:0x0030, code lost:
            if (r3.equals("continuous_live_holiday_notifier") == false) goto L46;
         */
        /* JADX WARN: Code restructure failed: missing block: B:13:0x003a, code lost:
            if (r3.equals("live_request") == false) goto L46;
         */
        /* JADX WARN: Code restructure failed: missing block: B:16:0x0044, code lost:
            if (r3.equals("update_user_identification") == false) goto L46;
         */
        /* JADX WARN: Code restructure failed: missing block: B:19:0x004e, code lost:
            if (r3.equals("followed") == false) goto L46;
         */
        /* JADX WARN: Code restructure failed: missing block: B:22:0x0058, code lost:
            if (r3.equals("private_live_started") != false) goto L24;
         */
        /* JADX WARN: Code restructure failed: missing block: B:25:0x0062, code lost:
            if (r3.equals("present_boxes") == false) goto L46;
         */
        /* JADX WARN: Code restructure failed: missing block: B:28:0x006c, code lost:
            if (r3.equals("chat") == false) goto L46;
         */
        /* JADX WARN: Code restructure failed: missing block: B:30:0x0070, code lost:
            r2 = r2.getString(nd.f1.notification_channel_id_05_chat);
            jo.p.g(r2, "context.getString(R.stri…ation_channel_id_05_chat)");
         */
        /* JADX WARN: Code restructure failed: missing block: B:32:0x0083, code lost:
            if (r3.equals("ope") == false) goto L46;
         */
        /* JADX WARN: Code restructure failed: missing block: B:35:0x008d, code lost:
            if (r3.equals("individual") == false) goto L46;
         */
        /* JADX WARN: Code restructure failed: missing block: B:38:0x0096, code lost:
            if (r3.equals("campaign") == false) goto L46;
         */
        /* JADX WARN: Code restructure failed: missing block: B:40:0x0099, code lost:
            r2 = r2.getString(nd.f1.notification_channel_id_03_notice);
            jo.p.g(r2, "context.getString(R.stri…ion_channel_id_03_notice)");
         */
        /* JADX WARN: Code restructure failed: missing block: B:42:0x00ab, code lost:
            if (r3.equals("user_coin_expire") == false) goto L46;
         */
        /* JADX WARN: Code restructure failed: missing block: B:45:0x00b4, code lost:
            if (r3.equals("user_diamond_expire") == false) goto L46;
         */
        /* JADX WARN: Code restructure failed: missing block: B:47:0x00b7, code lost:
            r2 = r2.getString(nd.f1.notification_channel_id_06_mypage);
            jo.p.g(r2, "context.getString(R.stri…ion_channel_id_06_mypage)");
         */
        /* JADX WARN: Code restructure failed: missing block: B:53:0x00de, code lost:
            if (r3.equals("live_started") == false) goto L46;
         */
        /* JADX WARN: Code restructure failed: missing block: B:55:0x00e1, code lost:
            r2 = r2.getString(nd.f1.notification_channel_id_01_start_broadcast);
            jo.p.g(r2, "context.getString(R.stri…el_id_01_start_broadcast)");
         */
        /* JADX WARN: Code restructure failed: missing block: B:59:?, code lost:
            return r2;
         */
        /* JADX WARN: Code restructure failed: missing block: B:60:?, code lost:
            return r2;
         */
        /* JADX WARN: Code restructure failed: missing block: B:61:?, code lost:
            return r2;
         */
        /* JADX WARN: Code restructure failed: missing block: B:63:?, code lost:
            return r2;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.String a(android.content.Context r2, java.lang.String r3) {
            /*
                Method dump skipped, instructions count: 312
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: nd.u0.a.a(android.content.Context, java.lang.String):java.lang.String");
        }

        public final List<NotificationChannel> b(Context context) {
            jo.p.h(context, "context");
            NotificationChannel notificationChannel = new NotificationChannel(context.getString(f1.notification_channel_id_01_start_broadcast), context.getString(f1.text_notification_channel_name_start_broadcast), 4);
            notificationChannel.enableVibration(true);
            wn.v vVar = wn.v.f59242a;
            NotificationChannel notificationChannel2 = new NotificationChannel(context.getString(f1.notification_channel_id_04_download), context.getString(f1.text_notification_channel_name_download), 4);
            notificationChannel2.enableVibration(true);
            NotificationChannel notificationChannel3 = new NotificationChannel(context.getString(f1.notification_channel_id_06_mypage), context.getString(f1.text_notification_channel_name_mypage), 4);
            notificationChannel3.enableVibration(true);
            return xn.s.m(notificationChannel, new NotificationChannel(context.getString(f1.notification_channel_id_02_broadcast_announce), context.getString(f1.f41994v3), 2), new NotificationChannel(context.getString(f1.notification_channel_id_03_notice), context.getString(f1.text_notification_channel_name_notice), 3), notificationChannel2, new NotificationChannel(context.getString(f1.notification_channel_id_05_chat), context.getString(f1.text_notification_channel_name_chat), 2), notificationChannel3, new NotificationChannel(context.getString(f1.f41987r), context.getString(f1.text_notification_channel_name_others), 2));
        }

        public final void c(Context context) {
            jo.p.h(context, "context");
            Object systemService = context.getSystemService("notification");
            jo.p.f(systemService, "null cannot be cast to non-null type android.app.NotificationManager");
            NotificationManager notificationManager = (NotificationManager) systemService;
            int i10 = f1.channelId;
            if (notificationManager.getNotificationChannel(context.getString(i10)) != null) {
                notificationManager.deleteNotificationChannel(context.getString(i10));
            }
            notificationManager.createNotificationChannels(b(context));
        }
    }
}

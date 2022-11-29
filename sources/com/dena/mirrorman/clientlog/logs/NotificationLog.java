package com.dena.mirrorman.clientlog.logs;

import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.Context;
import b3.m;
import com.dena.mirrorman.clientlog.logs.MRLog;
import com.dena.mirrorman.net.api.Referer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import jo.p;
import nd.u0;
import oq.a;
import wn.f;
import wn.g;
import wn.q;
import xm.e;
import xn.s;
import xn.t;

/* loaded from: classes2.dex */
public final class NotificationLog implements a {
    public static final int $stable = 8;
    private final f logger$delegate = g.b(cr.a.f28611a.b(), new NotificationLog$special$$inlined$inject$default$1(this, null, null));

    private final MRLogger getLogger() {
        return (MRLogger) this.logger$delegate.getValue();
    }

    @Override // oq.a
    public nq.a getKoin() {
        return a.C0688a.a(this);
    }

    public final void sendNotificationChannelLog(Context context, String str) {
        p.h(context, "context");
        p.h(str, "actionType");
        List<NotificationChannel> b10 = u0.f42221a.b(context);
        ArrayList arrayList = new ArrayList(t.u(b10, 10));
        for (NotificationChannel notificationChannel : b10) {
            arrayList.add(notificationChannel.getId());
        }
        Object systemService = context.getSystemService("notification");
        p.f(systemService, "null cannot be cast to non-null type android.app.NotificationManager");
        NotificationManager notificationManager = (NotificationManager) systemService;
        HashMap hashMap = new HashMap();
        hashMap.put("global_setting", Integer.valueOf(m.d(context).a() ? 1 : 0));
        int size = arrayList.size();
        int i10 = 0;
        while (true) {
            if (i10 < size) {
                String str2 = (String) arrayList.get(i10);
                NotificationChannel notificationChannel2 = notificationManager.getNotificationChannel(str2);
                if (notificationChannel2 != null) {
                    p.g(str2, "channelId");
                    hashMap.put(str2, Integer.valueOf(notificationChannel2.getImportance() == 0 ? 0 : 1));
                }
                i10++;
            } else {
                MRLogger logger = getLogger();
                MRLog.Companion companion = MRLog.Companion;
                MRLog.Builder builder = new MRLog.Builder(str);
                builder.setTargetType(Referer.PUSH_NOTIFICATION);
                builder.setPayload(s.m(q.a(MRLog.PAYLOAD_KEY_TARGET_DETAIL, new e().s(hashMap)), q.a(MRLog.PAYLOAD_KEY_SETTING, String.valueOf(hashMap.get("global_setting")))));
                logger.sendLog(builder.build());
                return;
            }
        }
    }
}

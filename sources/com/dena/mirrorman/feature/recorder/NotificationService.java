package com.dena.mirrorman.feature.recorder;

import android.app.Notification;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.service.notification.NotificationListenerService;
import android.service.notification.StatusBarNotification;
import java.util.Iterator;
import jo.f0;
import jo.h;
import jo.p;
import jo.q;
import kf.t;
import nd.b0;
import so.n;
import so.o;
import wn.f;
import wn.g;
import wn.i;
import xn.s;

/* loaded from: classes2.dex */
public final class NotificationService extends NotificationListenerService {

    /* renamed from: y  reason: collision with root package name */
    public static final a f25970y = new a(null);

    /* renamed from: z  reason: collision with root package name */
    public static final int f25971z = 8;

    /* renamed from: w  reason: collision with root package name */
    public final f f25972w;

    /* renamed from: x  reason: collision with root package name */
    public final f f25973x;

    /* loaded from: classes2.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(h hVar) {
            this();
        }
    }

    /* loaded from: classes2.dex */
    public static final class b extends q implements io.a<Context> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ComponentCallbacks f25974w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f25975x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f25976y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(ComponentCallbacks componentCallbacks, vq.a aVar, io.a aVar2) {
            super(0);
            this.f25974w = componentCallbacks;
            this.f25975x = aVar;
            this.f25976y = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [android.content.Context, java.lang.Object] */
        @Override // io.a
        public final Context invoke() {
            ComponentCallbacks componentCallbacks = this.f25974w;
            return gq.a.a(componentCallbacks).c(f0.b(Context.class), this.f25975x, this.f25976y);
        }
    }

    /* loaded from: classes2.dex */
    public static final class c extends q implements io.a<t> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ComponentCallbacks f25977w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f25978x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f25979y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(ComponentCallbacks componentCallbacks, vq.a aVar, io.a aVar2) {
            super(0);
            this.f25977w = componentCallbacks;
            this.f25978x = aVar;
            this.f25979y = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [kf.t, java.lang.Object] */
        @Override // io.a
        public final t invoke() {
            ComponentCallbacks componentCallbacks = this.f25977w;
            return gq.a.a(componentCallbacks).c(f0.b(t.class), this.f25978x, this.f25979y);
        }
    }

    public NotificationService() {
        i iVar = i.SYNCHRONIZED;
        this.f25972w = g.b(iVar, new b(this, null, null));
        this.f25973x = g.b(iVar, new c(this, null, null));
    }

    public final Context a() {
        return (Context) this.f25972w.getValue();
    }

    public final t b() {
        return (t) this.f25973x.getValue();
    }

    @Override // android.service.notification.NotificationListenerService
    public void onNotificationPosted(StatusBarNotification statusBarNotification) {
        p.h(statusBarNotification, "sbn");
        g9.a.g("notification posted : " + statusBarNotification.getPackageName() + '/' + statusBarNotification.getNotification());
        String notification = statusBarNotification.getNotification().toString();
        p.g(notification, "sbn.notification.toString()");
        if (o.H(notification, "AlertWindowNotification", false, 2, null)) {
            return;
        }
        boolean z10 = true;
        if (b().b0() == 1 && !n.q(a().getPackageName(), statusBarNotification.getPackageName(), true)) {
            g9.a.g("notification privacy on");
            Notification notification2 = statusBarNotification.getNotification();
            boolean z11 = notification2.priority >= 1;
            Iterator it = s.m("android.bigText", "android.people.list", "android.picture", "android.selfDisplayName", "android.messagingStyleUser", "android.conversationTitle", "android.hiddenConversationTitle", "android.messages").iterator();
            while (true) {
                if (!it.hasNext()) {
                    z10 = z11;
                    break;
                } else {
                    if (notification2.extras.containsKey((String) it.next())) {
                        break;
                    }
                }
            }
            if (z10) {
                dq.c.c().l(new b0());
            }
        } else if (b().b0() == 2) {
            g9.a.g("notification privacy on (silent mode)");
        } else {
            g9.a.g("notification privacy off");
        }
    }

    @Override // android.service.notification.NotificationListenerService
    public void onNotificationRemoved(StatusBarNotification statusBarNotification) {
        p.h(statusBarNotification, "sbn");
    }
}

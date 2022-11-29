package com.dena.mirrorman;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.dena.mirrorman.clientlog.logs.MRLog;
import com.dena.mirrorman.clientlog.logs.NotificationLog;
import jo.f0;
import jo.p;
import jo.q;
import oq.a;
import oq.b;
import wn.f;
import wn.g;

/* loaded from: classes2.dex */
public final class NotificationSettingChangeReceiver extends BroadcastReceiver implements oq.a {

    /* renamed from: w  reason: collision with root package name */
    public final f f25075w = g.b(cr.a.f28611a.b(), new a(this, null, null));

    /* loaded from: classes2.dex */
    public static final class a extends q implements io.a<NotificationLog> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ oq.a f25076w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f25077x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f25078y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(oq.a aVar, vq.a aVar2, io.a aVar3) {
            super(0);
            this.f25076w = aVar;
            this.f25077x = aVar2;
            this.f25078y = aVar3;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [com.dena.mirrorman.clientlog.logs.NotificationLog, java.lang.Object] */
        @Override // io.a
        public final NotificationLog invoke() {
            xq.a b10;
            oq.a aVar = this.f25076w;
            vq.a aVar2 = this.f25077x;
            io.a<? extends uq.a> aVar3 = this.f25078y;
            if (aVar instanceof b) {
                b10 = ((b) aVar).e();
            } else {
                b10 = aVar.getKoin().e().b();
            }
            return b10.c(f0.b(NotificationLog.class), aVar2, aVar3);
        }
    }

    public final NotificationLog a() {
        return (NotificationLog) this.f25075w.getValue();
    }

    @Override // oq.a
    public nq.a getKoin() {
        return a.C0688a.a(this);
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        if (context == null) {
            return;
        }
        if (!p.c(intent != null ? intent.getAction() : null, "android.app.action.APP_BLOCK_STATE_CHANGED")) {
            if (!p.c(intent != null ? intent.getAction() : null, "android.app.action.NOTIFICATION_CHANNEL_BLOCK_STATE_CHANGED")) {
                return;
            }
        }
        a().sendNotificationChannelLog(context, MRLog.ACTION_TYPE_EDIT_DEVICE_PUSH_SETTING);
    }
}

package com.dena.mirrorman.feature.fcm;

import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.Intent;
import android.graphics.BitmapFactory;
import android.media.RingtoneManager;
import android.net.Uri;
import android.text.TextUtils;
import b3.j;
import co.l;
import com.dena.mirrorman.activity.MainActivity;
import com.dena.mirrorman.clientlog.logs.ActionLogBase;
import com.dena.mirrorman.clientlog.logs.LogBase;
import com.dena.mirrorman.clientlog.logs.MRLog;
import com.dena.mirrorman.clientlog.logs.MRLogger;
import com.dena.mirrorman.net.retrofit.MRRequest;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.google.firebase.messaging.FirebaseMessagingService;
import io.p;
import java.util.Map;
import jf.i0;
import jo.f0;
import jo.h;
import jo.q;
import nd.d1;
import nd.f1;
import nd.i1;
import nd.u0;
import nf.o;
import uo.q0;
import uo.r0;
import wn.i;
import wn.m;
import wn.v;
import xn.s;

/* loaded from: classes2.dex */
public final class FirebaseCloudMessagingListenerService extends FirebaseMessagingService implements q0 {
    public static final a I = new a(null);
    public static final int J = 8;
    public final /* synthetic */ q0 C = r0.b();
    public final wn.f D;
    public final wn.f E;
    public final wn.f F;
    public final wn.f G;
    public final wn.f H;

    /* loaded from: classes2.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(h hVar) {
            this();
        }
    }

    @co.f(c = "com.dena.mirrorman.feature.fcm.FirebaseCloudMessagingListenerService$onNewToken$1", f = "FirebaseCloudMessagingListenerService.kt", l = {128}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class b extends l implements p<q0, ao.d<? super v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f25824w;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ String f25826y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String str, ao.d<? super b> dVar) {
            super(2, dVar);
            this.f25826y = str;
        }

        @Override // co.a
        public final ao.d<v> create(Object obj, ao.d<?> dVar) {
            return new b(this.f25826y, dVar);
        }

        @Override // io.p
        public final Object invoke(q0 q0Var, ao.d<? super v> dVar) {
            return ((b) create(q0Var, dVar)).invokeSuspend(v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f25824w;
            try {
                if (i10 == 0) {
                    m.b(obj);
                    MRRequest x10 = FirebaseCloudMessagingListenerService.this.x();
                    String str = this.f25826y;
                    this.f25824w = 1;
                    if (x10.notificationRegisterTokenRequest("MyFcmListenerService", "jp.dena.mirrorman", str, this) == c10) {
                        return c10;
                    }
                } else if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    m.b(obj);
                }
            } catch (Exception unused) {
            }
            return v.f59242a;
        }
    }

    /* loaded from: classes2.dex */
    public static final class c extends q implements io.a<MRRequest> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ComponentCallbacks f25827w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f25828x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f25829y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(ComponentCallbacks componentCallbacks, vq.a aVar, io.a aVar2) {
            super(0);
            this.f25827w = componentCallbacks;
            this.f25828x = aVar;
            this.f25829y = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [com.dena.mirrorman.net.retrofit.MRRequest, java.lang.Object] */
        @Override // io.a
        public final MRRequest invoke() {
            ComponentCallbacks componentCallbacks = this.f25827w;
            return gq.a.a(componentCallbacks).c(f0.b(MRRequest.class), this.f25828x, this.f25829y);
        }
    }

    /* loaded from: classes2.dex */
    public static final class d extends q implements io.a<i1> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ComponentCallbacks f25830w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f25831x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f25832y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(ComponentCallbacks componentCallbacks, vq.a aVar, io.a aVar2) {
            super(0);
            this.f25830w = componentCallbacks;
            this.f25831x = aVar;
            this.f25832y = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, nd.i1] */
        @Override // io.a
        public final i1 invoke() {
            ComponentCallbacks componentCallbacks = this.f25830w;
            return gq.a.a(componentCallbacks).c(f0.b(i1.class), this.f25831x, this.f25832y);
        }
    }

    /* loaded from: classes2.dex */
    public static final class e extends q implements io.a<MRLogger> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ComponentCallbacks f25833w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f25834x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f25835y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(ComponentCallbacks componentCallbacks, vq.a aVar, io.a aVar2) {
            super(0);
            this.f25833w = componentCallbacks;
            this.f25834x = aVar;
            this.f25835y = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [com.dena.mirrorman.clientlog.logs.MRLogger, java.lang.Object] */
        @Override // io.a
        public final MRLogger invoke() {
            ComponentCallbacks componentCallbacks = this.f25833w;
            return gq.a.a(componentCallbacks).c(f0.b(MRLogger.class), this.f25834x, this.f25835y);
        }
    }

    /* loaded from: classes2.dex */
    public static final class f extends q implements io.a<od.p> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ComponentCallbacks f25836w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f25837x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f25838y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(ComponentCallbacks componentCallbacks, vq.a aVar, io.a aVar2) {
            super(0);
            this.f25836w = componentCallbacks;
            this.f25837x = aVar;
            this.f25838y = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [od.p, java.lang.Object] */
        @Override // io.a
        public final od.p invoke() {
            ComponentCallbacks componentCallbacks = this.f25836w;
            return gq.a.a(componentCallbacks).c(f0.b(od.p.class), this.f25837x, this.f25838y);
        }
    }

    /* loaded from: classes2.dex */
    public static final class g extends q implements io.a<o> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ComponentCallbacks f25839w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f25840x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f25841y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(ComponentCallbacks componentCallbacks, vq.a aVar, io.a aVar2) {
            super(0);
            this.f25839w = componentCallbacks;
            this.f25840x = aVar;
            this.f25841y = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, nf.o] */
        @Override // io.a
        public final o invoke() {
            ComponentCallbacks componentCallbacks = this.f25839w;
            return gq.a.a(componentCallbacks).c(f0.b(o.class), this.f25840x, this.f25841y);
        }
    }

    public FirebaseCloudMessagingListenerService() {
        i iVar = i.SYNCHRONIZED;
        this.D = wn.g.b(iVar, new c(this, null, null));
        this.E = wn.g.b(iVar, new d(this, null, null));
        this.F = wn.g.b(iVar, new e(this, null, null));
        this.G = wn.g.b(iVar, new f(this, null, null));
        this.H = wn.g.b(iVar, new g(this, null, null));
    }

    @Override // uo.q0
    public ao.g getCoroutineContext() {
        return this.C.getCoroutineContext();
    }

    @Override // com.google.firebase.messaging.FirebaseMessagingService
    public void o(com.google.firebase.messaging.d dVar) {
        jo.p.h(dVar, "message");
        String P = dVar.P();
        Map<String, String> p10 = dVar.p();
        jo.p.g(p10, "message.data");
        String str = p10.get(MRLog.PAYLOAD_NOTIFICATION_TYPE);
        if (str == null) {
            str = "";
        }
        String str2 = p10.get("url");
        String str3 = p10.get("replace_tag");
        String str4 = p10.get("title");
        if (str4 == null) {
            str4 = getString(f1.f41963a);
            jo.p.g(str4, "getString(R.string.app_name)");
        }
        String str5 = p10.get(TtmlNode.TAG_BODY);
        if (str5 == null) {
            str5 = "";
        }
        String str6 = p10.get(ActionLogBase.TARGET_TYPE);
        if (str6 == null) {
            str6 = "";
        }
        String str7 = p10.get(ActionLogBase.TARGET_ID);
        String str8 = str7 != null ? str7 : "";
        g9.a.g("FCM received From:" + P + " /tittle:" + str4 + "/body:" + str5 + "/url:" + str2);
        MRLogger w10 = w();
        MRLog.Companion companion = MRLog.Companion;
        MRLog.Builder builder = new MRLog.Builder(MRLog.ACTION_TYPE_PUSH_NOTIFICATION_RECEIVE);
        builder.setTargetType(str6);
        builder.setTargetId(str8);
        builder.setPayload(s.m(wn.q.a(MRLog.PAYLOAD_NOTIFICATION_TYPE, str), wn.q.a("text", str4 + '/' + str5)));
        w10.sendLog(builder.build());
        if (TextUtils.isEmpty(str4) && TextUtils.isEmpty(str5)) {
            return;
        }
        if (jo.p.c(str, "chat")) {
            Uri parse = Uri.parse(str2);
            String queryParameter = parse.getQueryParameter(LogBase.USER_ID);
            String queryParameter2 = parse.getQueryParameter("group_id");
            n3.d<String, String> a10 = y().b().a();
            g9.a.g("chatpushReceived: " + str2 + ", currentChatActivityUserIdGroupId: " + a10);
            if (a10 != null) {
                if (!TextUtils.isEmpty(queryParameter) && TextUtils.equals(queryParameter, a10.f41559a)) {
                    return;
                }
                if (!TextUtils.isEmpty(queryParameter2) && TextUtils.equals(queryParameter2, a10.f41560b)) {
                    return;
                }
            }
        }
        u0.a aVar = u0.f42221a;
        Context applicationContext = getApplicationContext();
        jo.p.g(applicationContext, "applicationContext");
        String a11 = aVar.a(applicationContext, str);
        Object systemService = getSystemService("notification");
        jo.p.f(systemService, "null cannot be cast to non-null type android.app.NotificationManager");
        NotificationManager notificationManager = (NotificationManager) systemService;
        NotificationChannel notificationChannel = notificationManager.getNotificationChannel(a11);
        if (notificationChannel != null && notificationChannel.getImportance() == 0) {
            return;
        }
        Intent intent = new Intent(this, MainActivity.class);
        intent.putExtra(ActionLogBase.TARGET_TYPE, str6);
        intent.putExtra(ActionLogBase.TARGET_ID, str8);
        intent.putExtra(MRLog.PAYLOAD_NOTIFICATION_TYPE, str);
        intent.putExtra("text", str4 + '/' + str5);
        intent.addFlags(67108864);
        intent.setAction("EXTRA_ACTION_LAUNCH_FROM_FCM");
        if (!TextUtils.isEmpty(str2)) {
            intent.putExtra("EXTRA_FCM_URL", str2);
        }
        j.e F = new j.e(this, a11).D(d1.f41955r).r(str4).q(str5).v(BitmapFactory.decodeResource(getResources(), d1.ic_launcher)).j(true).E(RingtoneManager.getDefaultUri(2)).p(PendingIntent.getActivity(this, 0, intent, 335544320)).F(new j.c().m(str5));
        jo.p.g(F, "Builder(this, notificati…extStyle().bigText(body))");
        notificationManager.notify(str3, 204, F.c());
        if (jo.p.c(v().F().f(), Boolean.TRUE)) {
            u().C(i0.PUSH_NOTIFICATION);
        }
    }

    @Override // com.google.firebase.messaging.FirebaseMessagingService
    public void q(String str) {
        jo.p.h(str, "token");
        uo.l.d(this, null, null, new b(str, null), 3, null);
    }

    public final od.p u() {
        return (od.p) this.G.getValue();
    }

    public final o v() {
        return (o) this.H.getValue();
    }

    public final MRLogger w() {
        return (MRLogger) this.F.getValue();
    }

    public final MRRequest x() {
        return (MRRequest) this.D.getValue();
    }

    public final i1 y() {
        return (i1) this.E.getValue();
    }
}

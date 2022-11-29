package com.dena.mirrorman;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.telephony.PhoneStateListener;
import android.telephony.TelephonyManager;
import jo.f0;
import jo.q;
import od.p;
import oq.a;
import wn.f;
import wn.g;

/* loaded from: classes2.dex */
public final class PhoneCallReceiver extends BroadcastReceiver implements oq.a {

    /* renamed from: x  reason: collision with root package name */
    public TelephonyManager f25080x;

    /* renamed from: w  reason: collision with root package name */
    public final f f25079w = g.b(cr.a.f28611a.b(), new b(this, null, null));

    /* renamed from: y  reason: collision with root package name */
    public final f f25081y = g.a(new a());

    /* loaded from: classes2.dex */
    public static final class a extends q implements io.a<C0217a> {

        /* renamed from: com.dena.mirrorman.PhoneCallReceiver$a$a  reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        public static final class C0217a extends PhoneStateListener {

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ PhoneCallReceiver f25083a;

            public C0217a(PhoneCallReceiver phoneCallReceiver) {
                this.f25083a = phoneCallReceiver;
            }

            @Override // android.telephony.PhoneStateListener
            public void onCallStateChanged(int i10, String str) {
                this.f25083a.c().D(i10);
                TelephonyManager f10 = this.f25083a.f();
                if (f10 != null) {
                    f10.listen(this.f25083a.d(), 0);
                }
            }
        }

        public a() {
            super(0);
        }

        @Override // io.a
        /* renamed from: a */
        public final C0217a invoke() {
            return new C0217a(PhoneCallReceiver.this);
        }
    }

    /* loaded from: classes2.dex */
    public static final class b extends q implements io.a<p> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ oq.a f25084w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f25085x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f25086y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(oq.a aVar, vq.a aVar2, io.a aVar3) {
            super(0);
            this.f25084w = aVar;
            this.f25085x = aVar2;
            this.f25086y = aVar3;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [od.p, java.lang.Object] */
        @Override // io.a
        public final p invoke() {
            xq.a b10;
            oq.a aVar = this.f25084w;
            vq.a aVar2 = this.f25085x;
            io.a<? extends uq.a> aVar3 = this.f25086y;
            if (aVar instanceof oq.b) {
                b10 = ((oq.b) aVar).e();
            } else {
                b10 = aVar.getKoin().e().b();
            }
            return b10.c(f0.b(p.class), aVar2, aVar3);
        }
    }

    public final p c() {
        return (p) this.f25079w.getValue();
    }

    public final PhoneStateListener d() {
        return (PhoneStateListener) this.f25081y.getValue();
    }

    public final TelephonyManager f() {
        return this.f25080x;
    }

    @Override // oq.a
    public nq.a getKoin() {
        return a.C0688a.a(this);
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        jo.p.h(context, "context");
        jo.p.h(intent, "intent");
        if (jo.p.c(intent.getAction(), "android.intent.action.PHONE_STATE")) {
            Object systemService = context.getSystemService("phone");
            TelephonyManager telephonyManager = systemService instanceof TelephonyManager ? (TelephonyManager) systemService : null;
            this.f25080x = telephonyManager;
            if (telephonyManager != null) {
                telephonyManager.listen(d(), 32);
            }
        }
    }
}

package com.dena.mirrorman;

import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.dena.mirrorman.clientlog.logs.ActionLogBase;
import com.dena.mirrorman.clientlog.logs.MRLogger;
import io.p;
import java.io.Serializable;
import jo.f0;
import jo.h;
import jo.q;
import oq.a;
import wn.f;
import wn.g;
import wn.v;

/* loaded from: classes2.dex */
public final class ChooseReceiver extends BroadcastReceiver implements oq.a {

    /* renamed from: x  reason: collision with root package name */
    public static final a f25051x = new a(null);

    /* renamed from: y  reason: collision with root package name */
    public static final int f25052y = 8;

    /* renamed from: w  reason: collision with root package name */
    public final f f25053w = g.b(cr.a.f28611a.b(), new c(this, null, null));

    /* loaded from: classes2.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(h hVar) {
            this();
        }

        public final Intent a(Context context, p<? super MRLogger, ? super String, v> pVar) {
            jo.p.h(context, "context");
            jo.p.h(pVar, "onReceiveAction");
            Intent intent = new Intent(context, ChooseReceiver.class);
            Bundle bundle = new Bundle();
            bundle.putParcelable("BUNDLE_KEY_ON_RECEIVE_ACTION", new b(pVar));
            v vVar = v.f59242a;
            intent.putExtra("EXTRA_KEY_BUNDLE", bundle);
            return intent;
        }
    }

    /* loaded from: classes2.dex */
    public static final class b implements Parcelable {
        public static final Parcelable.Creator<b> CREATOR = new a();

        /* renamed from: x  reason: collision with root package name */
        public static final int f25054x = 8;

        /* renamed from: w  reason: collision with root package name */
        public final p<MRLogger, String, v> f25055w;

        /* loaded from: classes2.dex */
        public static final class a implements Parcelable.Creator<b> {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a */
            public final b createFromParcel(Parcel parcel) {
                jo.p.h(parcel, "parcel");
                return new b((p) parcel.readSerializable());
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b */
            public final b[] newArray(int i10) {
                return new b[i10];
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public b(p<? super MRLogger, ? super String, v> pVar) {
            jo.p.h(pVar, ActionLogBase.ACTION);
            this.f25055w = pVar;
        }

        public final void a(MRLogger mRLogger, String str) {
            jo.p.h(mRLogger, "logger");
            this.f25055w.invoke(mRLogger, str);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            jo.p.h(parcel, "out");
            parcel.writeSerializable((Serializable) this.f25055w);
        }
    }

    /* loaded from: classes2.dex */
    public static final class c extends q implements io.a<MRLogger> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ oq.a f25056w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f25057x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f25058y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(oq.a aVar, vq.a aVar2, io.a aVar3) {
            super(0);
            this.f25056w = aVar;
            this.f25057x = aVar2;
            this.f25058y = aVar3;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [com.dena.mirrorman.clientlog.logs.MRLogger, java.lang.Object] */
        @Override // io.a
        public final MRLogger invoke() {
            xq.a b10;
            oq.a aVar = this.f25056w;
            vq.a aVar2 = this.f25057x;
            io.a<? extends uq.a> aVar3 = this.f25058y;
            if (aVar instanceof oq.b) {
                b10 = ((oq.b) aVar).e();
            } else {
                b10 = aVar.getKoin().e().b();
            }
            return b10.c(f0.b(MRLogger.class), aVar2, aVar3);
        }
    }

    public final MRLogger a() {
        return (MRLogger) this.f25053w.getValue();
    }

    @Override // oq.a
    public nq.a getKoin() {
        return a.C0688a.a(this);
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        b bVar;
        jo.p.h(context, "context");
        jo.p.h(intent, "intent");
        Bundle extras = intent.getExtras();
        Object obj = extras != null ? extras.get("android.intent.extra.CHOSEN_COMPONENT") : null;
        ComponentName componentName = obj instanceof ComponentName ? (ComponentName) obj : null;
        g9.a.f(componentName != null ? componentName.toString() : null);
        Bundle bundleExtra = intent.getBundleExtra("EXTRA_KEY_BUNDLE");
        if (bundleExtra == null || (bVar = (b) bundleExtra.getParcelable("BUNDLE_KEY_ON_RECEIVE_ACTION")) == null) {
            return;
        }
        bVar.a(a(), componentName != null ? componentName.getPackageName() : null);
    }
}
